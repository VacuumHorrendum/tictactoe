package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    String name1;
    String name2;
    int count = 0;
    TextView textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Bundle arguments = getIntent().getExtras();
        textField = findViewById(R.id.textField);
        name1 = arguments.get("name1").toString();
        name2 = arguments.get("name2").toString();
    }
    public void onOperationClick(View view){
        Button button = (Button)view;
        if(count%2==0){
            button.setText("X");
        }
        else{
            button.setText("0");
        }
        button.setClickable(false);
        count++;
        checkWinner();
    }

    public void onExitClick(View view){
        //Intent intent = new Intent(this, MainActivity.class);
        this.finish();
        //startActivity(intent);
    }
    public void onRestartClick(View view){
        Button button1 = findViewById(R.id.Button1);
        Button button2 = findViewById(R.id.Button2);
        Button button3 = findViewById(R.id.Button3);
        Button button4 = findViewById(R.id.Button4);
        Button button5 = findViewById(R.id.Button5);
        Button button6 = findViewById(R.id.Button6);
        Button button7 = findViewById(R.id.Button7);
        Button button8 = findViewById(R.id.Button8);
        Button button9 = findViewById(R.id.Button9);
        textField.setText("");
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        count = 0;
    }
    public void checkWinner(){
        Button button1 = findViewById(R.id.Button1);
        Button button2 = findViewById(R.id.Button2);
        Button button3 = findViewById(R.id.Button3);
        Button button4 = findViewById(R.id.Button4);
        Button button5 = findViewById(R.id.Button5);
        Button button6 = findViewById(R.id.Button6);
        Button button7 = findViewById(R.id.Button7);
        Button button8 = findViewById(R.id.Button8);
        Button button9 = findViewById(R.id.Button9);
        if(button1.getText()=="X" & button2.getText() == "X" & button3.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button4.getText()=="X" & button5.getText() == "X" & button6.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button7.getText()=="X" & button8.getText() == "X" & button9.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button1.getText()=="X" & button4.getText() == "X" & button7.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button2.getText()=="X" & button5.getText() == "X" & button8.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button3.getText()=="X" & button6.getText() == "X" & button9.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button1.getText()=="X" & button5.getText() == "X" & button9.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button7.getText()=="X" & button5.getText() == "X" & button3.getText() == "X"){
            textField.setText(name1+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name1+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button1.getText()=="0" & button2.getText() == "0" & button3.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button4.getText()=="0" & button5.getText() == "0" & button6.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button7.getText()=="0" & button8.getText() == "0" & button9.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button1.getText()=="0" & button4.getText() == "0" & button7.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button2.getText()=="0" & button5.getText() == "0" & button8.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button3.getText()=="0" & button6.getText() == "0" & button9.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button3.getText()=="0" & button5.getText() == "0" & button7.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
        else if(button1.getText()=="0" & button5.getText() == "0" & button9.getText() == "0"){
            textField.setText(name2+" WINS");
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
            count = 0;
            Toast toast = Toast.makeText(this, name2+" WINS",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}