package sdu.cs58.suteenart.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    //ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer; //เล่นไฟล์เสียง
    int questionCount = 10;  //เก็บจำนวนคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>(); //ชนิดของ Array ในการสุ่มคำถาม
    String answer; //คำตอบ
    int score = 0; //คะแนนจำค่าเป็น 0 ไว้ก่อน
    String getNameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูก Element กับตัวแปรบน Java
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงคำถามนับจำนวนคำถาม
        for (int i=1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID); //กำหนดให้สุ่มคำถาม
        setQuestion(qID.remove(0));

    }//End onCreate

    private void setQuestion(int qID) { //ใช้กำหนดและเฉลยคำถามในแต่ละข้อ
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("ยุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("ยุง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("หมา");
            choice.add("แมว");
            choice.add("แกะ");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมา");
            choice.add("สิงโต");
            choice.add("ช้าง");
            choice.add("แมว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("ยุง");
            choice.add("หมา");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("หมา");
            choice.add("ยุง");
            choice.add("แมว");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("สิงโต");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("แมว");
            choice.add("หมา");
            choice.add("ม้า");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("ยุง");
            choice.add("วัว");
            choice.add("ช้าง");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//End setQuestion

    public void choiceAns(View view) { //ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;
        }
        if (qID.isEmpty()) { //ถ้าทำครบทุกข้อนั้นคือ qID เป็นค่าว่าง
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString); //แสดงคะแนนรวม Method
        } else { //ถ้าทำไม่ครบเรียก Setquestion
            setQuestion(qID.remove(0)); // เรียก mthod setquestion
        }
    }//End choiceAns

    private void dialogboxScore(String name) { //Method แสดงคะแนน

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage(name + "ได้คะแนน " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            })
            .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//End dialogboxScore Method

    public void playSound(View view) {
        mediaPlayer.start();
    }//End playSound

}//End Class
