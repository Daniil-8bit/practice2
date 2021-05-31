package ru.mirea.danshin.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeDialogFragment extends DialogFragment {

    Date time = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");

    @NonNull
    @Override
    public AlertDialog onCreateDialog(Bundle savedInstanceState) { AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Time at this moment: ")
                .setMessage(formatForDateNow.format(time))
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Закрываем окно
                        ((MainActivity)getActivity()).onOkClicked();
                        dialog.cancel();
                    } })
//                .setMessage(DateUtils.formatDateTime(this,
//                        dateAndTime.getTimeInMillis(),
//                        DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_SHOW_YEAR
//                                | DateUtils.FORMAT_SHOW_TIME))
                .setIcon(R.mipmap.ic_launcher_round);
        return builder.create(); }

}
