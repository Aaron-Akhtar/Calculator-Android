package club.shprqness.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author: Aaron Akhtar
 * @domain: Shprqness.club
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Button variable for the ExecuteCalc Button*/
        Button execSum = (Button) findViewById(R.id.ExecuteCalc);

        execSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = null;
                try {
                    /**Listens for when user clicks the execute button*/

                    /**First input from user*/
                    EditText sum1 = (EditText) findViewById(R.id.CalculatorInput1);

                    /**Second input from user*/
                    EditText sum2 = (EditText) findViewById(R.id.CalcNum2);

                    /**Gets the text view to assign the result too*/
                    result = (TextView) findViewById(R.id.SumResult);

                    /**Parsing the 2 sums into Integers*/
                    int x = Integer.parseInt(sum1.toString());
                    int i = Integer.parseInt(sum2.toString());

                    /**Adding the variable x and i and attempting to get the result*/
                    int j = x + i;
                    result.setText("Result:" + j);
                }catch (NumberFormatException e){
                    result.setText("Ran into a error..");
                }
            }
        });

    }
}
