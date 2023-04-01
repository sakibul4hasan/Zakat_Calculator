package com.example.zakatcalculator;

import static com.example.zakatcalculator.R.id.tvDesplay3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ZakatCalcu extends AppCompatActivity {

    EditText edgoldVori, edgoldPrice, edRupaGram, edRupaPrice, edNogodTk, edNijHateTk, edJomaTk, edBankJoma, edPrivatePund, edPectPund, edSecurityPund, edShare;
    TextView textView4, HisabKorun, tvDesplay1, tvDesplay2, tvDesplay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_calcu);

        edgoldVori = findViewById(R.id.edgoldVori);
        edgoldPrice = findViewById(R.id.edgoldPrice);
        edRupaGram = findViewById(R.id.edRupaGram);
        edRupaPrice = findViewById(R.id.edRupaPrice);
        edNogodTk = findViewById(R.id.edNogodTk);
        edNijHateTk = findViewById(R.id.edNijHateTk);
        edJomaTk = findViewById(R.id.edJomaTk);
        edBankJoma = findViewById(R.id.edBankJoma);
        edPrivatePund = findViewById(R.id.edPrivatePund);
        edPectPund = findViewById(R.id.edPectPund);
        edSecurityPund = findViewById(R.id.edSecurityPund);
        edShare = findViewById(R.id.edShare);

        textView4 = findViewById(R.id.textView4);
        HisabKorun = findViewById(R.id.HisabKorun);
        tvDesplay1 = findViewById(R.id.tvDesplay1);
        tvDesplay2 = findViewById(R.id.tvDesplay2);
        tvDesplay3 = findViewById(R.id.tvDesplay3);



        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        HisabKorun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edgoldVori.length()>0 || edgoldPrice.length()>0 || edRupaGram.length()>0 || edRupaPrice.length()>0 || edNogodTk.length()>0 || edNijHateTk.length()>0 || edJomaTk.length()>0 || edBankJoma.length()>0 || edPrivatePund.length()>0 || edPectPund.length()>0 || edSecurityPund.length()>0 || edShare.length()>0){

                    //.............................

                    float f_edgoldVori =0;
                    float f_edgoldPrice =0;
                    float f_edRupaGram =0;
                    float f_edRupaPrice =0;
                    float f_edNogodTk =0;
                    float f_edNijHateTk =0;
                    float f_edJomaTk =0;
                    float f_edBankJoma =0;
                    float f_edPrivatePund =0;
                    float f_edPectPund =0;
                    float f_edSecurityPund =0;
                    float f_edShare =0;

                    if (edgoldVori.length()>0) {
                        f_edgoldVori =Float.parseFloat(edgoldVori.getText().toString());
                    }
                    if (edgoldPrice.length()>0) {
                        f_edgoldPrice =Float.parseFloat(edgoldPrice.getText().toString());
                    }
                    if (edRupaGram.length()>0) {
                        f_edRupaGram =Float.parseFloat(edRupaGram.getText().toString());
                    }
                    if (edRupaPrice.length()>0) {
                        f_edRupaPrice =Float.parseFloat(edRupaPrice.getText().toString());
                    }
                    if (edNogodTk.length()>0) {
                        f_edNogodTk =Float.parseFloat(edNogodTk.getText().toString());
                    }
                    if (edNijHateTk.length()>0) {
                        f_edNijHateTk =Float.parseFloat(edNijHateTk.getText().toString());
                    }
                    if (edJomaTk.length()>0) {
                        f_edJomaTk =Float.parseFloat(edJomaTk.getText().toString());
                    }
                    if (edBankJoma.length()>0) {
                        f_edBankJoma =Float.parseFloat(edBankJoma.getText().toString());
                    }
                    if (edPrivatePund.length()>0) {
                        f_edPrivatePund =Float.parseFloat(edPrivatePund.getText().toString());
                    }
                    if (edPectPund.length()>0) {
                        f_edPectPund =Float.parseFloat(edPectPund.getText().toString());
                    }
                    if (edSecurityPund.length()>0) {
                        f_edSecurityPund =Float.parseFloat(edSecurityPund.getText().toString());
                    }
                    if (edShare.length()>0) {
                        f_edShare =Float.parseFloat(edShare.getText().toString());
                    }

                    Float SumGold = f_edgoldVori*f_edgoldPrice;
                    Float SumRupa = f_edRupaGram*f_edRupaPrice;

                    Float SumAll = SumGold+SumRupa+f_edNogodTk+f_edNijHateTk+f_edJomaTk+f_edBankJoma+f_edPrivatePund+f_edPectPund+f_edSecurityPund+f_edShare;


                    //.............................

                    if (SumAll>0){
                        tvDesplay1.setText(""+SumAll+" টাকা");
                    }else {
                        tvDesplay1.setText("0.00");
                    }

                    //.............................

                    if (SumAll>300000){
                        Float SumMinas = (float) (SumAll*2.5)/100;
                        tvDesplay2.setText(""+SumMinas+" টাকা");
                        textView4.setText(""+SumMinas+" ট");
                        tvDesplay3.setText("এই বছর আপনার যাকাত হলো");

                    } else {
                        tvDesplay2.setText("0.00");
                        tvDesplay3.setText("এই বছর আপনার যাকাত ফরজ হয়নি");
                    }




                }else {
                    tvDesplay1.setText("0.00");
                    tvDesplay2.setText("0.00");
                    tvDesplay3.setText("এই বছর আপনার যাকাত হলো");
                }










            }
        });




    }
}