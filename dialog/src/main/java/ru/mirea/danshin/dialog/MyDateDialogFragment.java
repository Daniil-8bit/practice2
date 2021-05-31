package ru.mirea.danshin.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateDialogFragment extends DialogFragment {

    Date date = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd");

    @NonNull
    @Override
    public AlertDialog onCreateDialog(Bundle savedInstanceState) { AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("The date today is: ")
                .setMessage(formatForDateNow.format(date))
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем окно
                        ((MainActivity)getActivity()).onOkClicked();
                        dialog.cancel();
                    } })
                .setIcon(R.mipmap.ic_launcher_round);
        return builder.create(); }

}
