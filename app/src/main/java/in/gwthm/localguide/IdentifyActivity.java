package in.gwthm.localguide;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IdentifyActivity extends AppCompatActivity {

    TextView tview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify);
        tview = (TextView) findViewById(R.id.tvName);
        tview.setText("Hello");
    }
    @Override
    public void onBackPressed (){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                IdentifyActivity.this);
        // Setting Dialog Title
        alertDialog.setTitle("Leave application?");
        // Setting Dialog Message
        alertDialog.setMessage("Are you sure to exit application?");
        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.ic_launcher_foreground);
        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("YES",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
//                System.runFinalizersOnExit(true);
                finish();
                System.exit(0);
            }
        });
        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("NO",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                dialog.cancel();
            }
        });
        // Showing Alert Message
        alertDialog.show();

    }

}
