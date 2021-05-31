package ru.mirea.danshin.dialog;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        Dialog dialogFragment = new Dialog();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickTimeDialog(View view) {
        MyTimeDialogFragment dialogTime = new MyTimeDialogFragment();
        dialogTime.show(getSupportFragmentManager(), "mirea");
    }

    public void onClickDateDialog(View view) {
        MyDateDialogFragment dialogDate = new MyDateDialogFragment();
        dialogDate.show(getSupportFragmentManager(), "mirea");
    }

    public void onStopLoading() {
        Toast.makeText(getApplicationContext(), "You stopped loading!",
                Toast.LENGTH_LONG).show();
    }

    public ProgressDialog onClickProgressDialog(View view) {
        ProgressDialog processState = new ProgressDialog(this);
        processState.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        processState.setMessage("Loading...");
        processState.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onStopLoading();
                dialog.cancel();
            }
        });
        processState.show();
        return processState;
    }
}