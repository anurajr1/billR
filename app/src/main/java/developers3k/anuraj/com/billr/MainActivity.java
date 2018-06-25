package developers3k.anuraj.com.billr;


import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText inputData;
    ImageView qrImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // new DownloadXML().execute();

        button = (Button) findViewById(R.id.button);
        inputData = (EditText) findViewById(R.id.editText);
        qrImage = (ImageView) findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), inputData.getText(),
//                        Toast.LENGTH_LONG).show();

                String urlimage = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data="+inputData.getText();
                Picasso.get()
                        .load(urlimage)
                        .resize(150,150).into(qrImage);

            }
        });

    }







//    // DownloadJSON AsyncTask
//    private class DownloadXML extends AsyncTask<Void, Void, Void> {
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected Void doInBackground(Void... params) {
//
//            try {
//                JSONObject jsonob = JSONfunctions
//                        .getJSONfromURL("https://xs01a3cae2a65.hana.ondemand.com/sap/CSD/services.xsodata/icccertification?$format=json");
//                //JSONArray array_list = jsonob.getJSONObject("d").getJSONArray("results");
//
//
//                }
//            }catch(Exception e){
//                //something wrong with fetching the data from the url
//                System.out.print("Erorr in getting the json array");
//            }
//
//            return null;
//        }
//
//
//        @Override
//        protected void onPostExecute(Void args) {
//
//
//            }
//        }
//
//
//
//
//    }
}
