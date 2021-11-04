package com.example.datamahasiswa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bsimpan;
    EditText enisn, enama, etempatlahir, etanggallahir;
    RadioGroup rgjk;
    Spinner skelas, sagama;
    TextView thasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi
        bsimpan = (Button) findViewById(R.id.btnSimpan);
        enisn = (EditText) findViewById(R.id.isiNPSN);
        enama = (EditText) findViewById(R.id.isiNama);
        thasil = (TextView) findViewById(R.id.hasil);
        rgjk = (RadioGroup) findViewById(R.id.rgJK);
        skelas = (Spinner) findViewById(R.id.sKelas);
        sagama = (Spinner) findViewById(R.id.sAgama);
        etempatlahir = (EditText) findViewById(R.id.isiTempatLahir);
        etanggallahir = (EditText) findViewById(R.id.isiTanggalLahir);
    }

    public void tampil(View view){
        String inputNISN = enisn.getText().toString();
        String inputnama =enama.getText().toString();
        String inputtempatlahir = etempatlahir.getText().toString();
        String inputtanggallahir = etanggallahir.getText().toString();
        int gender =rgjk.getCheckedRadioButtonId();
        RadioButton jk = (RadioButton) findViewById(gender) ;
        String inputjk = String.valueOf(jk.getText().toString());
        thasil.setText("\n" +
                "NISN\t\t\t\t\t\t\t\t\t\t\t: " + inputNISN + "\n" +
                "Nama\t\t\t\t\t\t\t\t\t\t\t: "+ inputnama + "\n" +
                "Jenis Kelamin\t\t: " + inputjk + "\n" +
                "Kelas\t\t\t\t\t\t\t\t\t\t\t: "  + skelas.getSelectedItem().toString() + "\n" +
                "Agama\t\t\t\t\t\t\t\t\t: " + sagama.getSelectedItem().toString() + "\n" +
                "Tempat Lahir\t\t\t: " + inputtempatlahir +"\n" +
                "Tanggal Lahir\t\t\t: " + inputtanggallahir + "\n") ;
    }

}