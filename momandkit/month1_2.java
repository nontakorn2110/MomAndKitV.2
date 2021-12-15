package com.utcc.momandkit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class month1_2 extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month12);

        TextView textView1 = findViewById(R.id.num_name);
        TextView textView2 = findViewById(R.id.num_ฺbirthday);
        TextView textView3 = findViewById(R.id.num_sex);
        TextView textView4 = findViewById(R.id.num_old);
        TextView textView5 = findViewById(R.id.num_bloodGroup);
        TextView textView6 = findViewById(R.id.num_wei_1);
        TextView textView7 = findViewById(R.id.num_hei_1);
        TextView textView8 = findViewById(R.id.num_head_1);

        Intent intent = getIntent();
        String umname = intent.getStringExtra("umname");
        String bird = intent.getStringExtra("bird");
        String sex_ = intent.getStringExtra("sex_");
        String old_ = intent.getStringExtra("old_");
        String BG = intent.getStringExtra("BG");
        String message1 = intent.getStringExtra("message1");
        String message2  = intent.getStringExtra("message2");
        String message3 = intent.getStringExtra("message3");


        textView1.setText(umname);
        textView2.setText(bird);
        textView3.setText(sex_);
        textView4.setText(old_);
        textView5.setText(BG);
        textView6.setText(message1);
        textView7.setText(message2);
        textView8.setText(message3);



        Button next = (Button) findViewById(R.id.btn_back);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(month1_2.this, MainActivity.class);
                startActivity(i);
            }
        });






        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return false;
            }
        });
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("พัฒนาการตามวัย");
        listDataHeader.add("วิธีการส่งเสริมพัฒนาการ");


        List<String> N1 = new ArrayList<String>();
        N1.add("1-2 เดือน\n"+"•\tท่าคว่ำ ยกศีรษะได้ 45 องศา\n" +
                "•\tกำมือหลวมๆ\n" +
                "•\tมองเห็นชัดระยะ 8-9 นิ้ว\n" +
                "•\tมองหน้าสบตา ยิ้มตอบ\n\n " +
                "3-4 เดือน \n"+"•\tอุ้มนั่งตังศีรษะได้ตรง\n" +
                "•\tท่าคว่ำ ยกศีรษะได้ 90 องศา\n" +
                "•\tท่าคว่ำเริ่มใช้มือยันยกอกพ้นพื้น\n" +
                "•\tมองตามได้ 180 องศา / เอื้อมมือ คว้าของเล่น\n" +
                "•\tหันหาเสียงเรียกชื่อ\n" +
                "•\tส่งเสียงอ้อแอ้โต้ตอบ หัวเราะ\n\n"+
                "5-6 เดือน\n"+"•\tพลิกคว่ำและหงายได้ เริ่มนั่งมือยันพื้น\n" +
                "•\tจับยืน เริ่มลงน้ำหนักที่เท้า\n" +
                "•\tหยิบของมือเดียวและเปลี่ยนมือถือของ จับเขย่าและเคาะ\n" +
                "•\tมองเห็นได้ไกลขึ้น\n" +
                "•\tส่งเสียงต่าง ๆ โต้ตอบได้หลายเสียง\n\n"+
                "7-8 เดิอน\n"+"•\tนั่งทรงตัวได้มั่นคง / ลุกนั่งได้เองจาก ท่าคลาน / คลานได้/\n" +
                "•\tถือของสองมือพร้อมกันและนำมาเคาะกันได้\n" +
                "•\tชอบทำเสียงเลียนแบบ\n" +
                "•\tรู้จักอาย /กลัว คนแปลกหน้า\t\n\n"+
                "9-12 เดือน \n"+"•\tลุกนั่งเองได้ / คลาน / เหนี่ยวตัวขึ้นยืน/ เกาะยืนและเริ่มเดินเกาะตามโต๊ะ\n" +
                "•\tหยิบของชิ้นเล็กๆด้วยนิ้วหัวแม่มือและนิ้วชี้ / เปิดหาของที่ซ่อนไว้\n" +
                "•\tฟังรู้ภาษา เข้าใจท่าทาง เลียนแบบท่าทาง ได้ ออกเสียงคำซ้ำๆ เช่น หม่ำ ๆ จ๋าจ้ะ\n" +
                "•\tหยิบขนมเข้าปาก/ดื่มนำจากถ้วยได้\n\n"+
                "13-18 เดือน\n"+"•\tยืนเองได้ชั่วครู่ / จูงมือเดิน/เดินได้เอง\n" +
                "•\tวางของซ้อนกันได้ 2 ชิน /ใส่วงกลมลง ในช่อง / ปักหมุดลงในช่อง\n" +
                "•\tเรียกพ่อแม่ หรือพูดคำพยางค์เดียวที่มี ความหมาย\n" +
                "•\tบอกส่วนต่างๆบนใบหน้า!-3 ส่วน\n" +
                "•\tใช้ซ้อนตักอาหารแต่ยังหกบ้าง\n\n"+
                "19-24เดือน\n"+"•\tเดินได้คล่อง/วิ่งได้/จูงมือเดียวเดินขึ้น บันได / เดินถอยหลัง / เตะลูกบอล\n" +
                "•\tวางของซ้อนกันได้4-6 ชัน /แยกสี 2 สี\n" +
                "•\tขีดเขียนเป็นเส้นยุ่งๆ /ขีดเส้นตรงใน แนวดิ่งได้\n" +
                "•\tชี้รูปภาพตามบอกได้\n" +
                "•\tพูดคำโดดได้มากขึ้น พูดเป็นวลี 2-3 พยางค์ต่อกันเมื่ออายุ2ปี/บอกชื่อเล่น\n" +
                "•\tใช้ช้อนตักอาหารเองได้ / เริ่มถอดเสื้อ ผ้าเองได้\n\n"+
                "25-36 เดือน\n"+
                "•\tเตะบอล / ขว้างบอล / กระโดดอยู่กับที่ เดินขึ้นลงบันได / ขี่จักรยาน 3-4ล้อ\n" +
                "•\tเปิดหนังสือทีละแผ่น / ต่อก้อนไม้สูง 8 ชั้น/เขียนกากบาท และวงกลมได้ตาม ตัวอย่าง / รู้จักจำนวน 1-3 ชิ้น / รู้จักรอ ให้และรับ\n" +
                "•\tพูดได้เป็นประโยค โต้ตอบได้ตรงเรื่อง บอกชื่อตัวเองได้ ร้องเพลงง่ายๆ อาจพูดบางคำไม่ชัด\n" +
                "•\tบอกเวลาจะถ่ายอุจจาระ ถอดเสื้อผ้า และ ใส่เองได้ เริ่มเล่นเข้ากลุ่มแยกจากแม่ได้ บ้าง\n");

        List<String> N2 = new ArrayList<String>();
        N2.add("1-2 เดือน\n"+"•\tอุ้มสัมผัสลูกอย่างอ่อนโยน\n" +
                "•\tยิ้มแย้มมองหน้า สบตา พูดคุยเล่นกับลูกบ่อย ๆ\n" +
                "•\tเอียงหน้าไปมาช้า ๆ ให้ลูกมองตาม\n\n"+
                "3-4 เดือน \n"+"•\tอุ้มลูกพิงอกในท่านั่ง ให้นอนคว่ำนอนหงาย ในท่าที่แขนขาจะเคลื่อนไหวได้อย่าอิสระ\n" +
                "•\tหาของเล่นที่ถือง่าย เช่น กรุ๊งกริ๊ง ตุ๊กตาบีบสี สดใส ของเล่นเขย่ามีเสียงดัง ให้เด็กมอง เอื้อมคว้า และถือเล่น\n" +
                "•\tเรียกชื่อลูกในทิศทางต่าง ๆ ฝึกให้ลูกหันหาเสียงและตอบสนอง\n\n"+
                "5-6 เดือน\n"+"•\tให้หัด คว่ำเล่น คืบ คลานบนพื้นราบที่ สะอาดและปลอดภัย\n" +
                "•\tอุ้มนั่งเล่นโยกเยกกับลูก ใกล้ชิดกับลูกอย่าง สม่ำเสมอ\n" +
                "•\tยิ้มพูดคุยโต้ตอบเล่นกับลูกด้วยเสียงสูงๆต่ำ ๆ\n" +
                "•\tชี้ชวนให้ลูกมองสิ่งต่างๆ\n" +
                "•\tหาของเล่นหรือก้อนไม้ขนาดต่าง ๆ ให้ลูก หยิบจับเล่น ของเล่นควรให้ปลอดภัยหากลูก นำเข้าปาก\n\n"+
                "7-8 เดิอน\n"+"•\tให้เด็กพยายามลุกนั่งด้วยตนเอง ให้นั่งเล่นบน เข่า เก้าอีเด็ก / อุ้มเล่นในท่ายืน\n" +
                "•\tขณะอาบนำไห้ลูกเล่นของเล่นลอยนำได้ หา ของเล่นขนาดต่างๆให้ลูกถือเล่นพร้อมกัน2มือ\n" +
                "•\tพูดคุยเล่นให้ลูกโต้ตอบ / อ่านหนังสือให้ลูก พิงให้ดูรูปสัตว์ ทำเสียงสัตว์เลียง ที่คุ้นเคย\n\n"+
                "9-12 เดือน \n"+"•\tอุ้มลูกให้น้อยลงควรให้โอกาสลูกคลาน เกาะ ยืน หรือปืนป่ายกับโต๊ะ เก้าอีหรือโซฟา โดย คอยดูแลอย่างใกล้ชิด\n" +
                "•\tหาของเล่นที่ปลอดภัยให้ลูกเล่น หยิบจับด้วย ปลายนิ้ว หรือปล่อยของเล่นลงในภาชนะ\n" +
                "•\tพูดคุยให้ลูกโต้ตอบ เช่นสอนพูด หม่ำๆ ขณะป้อนข้าว เล่นจ๊ะเอ๋ ให้ลูกทำท่าทางง่าย เช่น สวัสดี โบกมือช้ายบาย ร้องเพลง จับปูดำ แมงมุม จ้ำจี้\n" +
                "•\tหัดให้ลูกหยิบอาหารด้วยมือให้ลูก จับถ้วยนำ ดื่มเอง\n\n"+
                "13-18 เดือน\n"+"•\tให้ลูกมีโอกาสยืนเดินด้วยตนเอง\n" +
                "•\tให้เล่นของเล่นที่ต้องลากดึง ให้เล่นของเล่น เพื่อการเรียนรู้ เช่น หมุดไม้ หยิบห่วงใส่ แท่งไม้\n" +
                "•\tพูดคุย ชี้บอกส่วนต่างๆของร่างกาย/ใช้คำสั่ง ง่ายๆให้ลูกทำตาม\n" +
                "•\tให้หยิบตักอาหารรับประทานเอง\n\n"+
                "19-24เดือน\n"+"•\tพาลูกเดินเล่นในสนามหญ้า สนามเด็กเล่น เตะบอล ปืนป่าย\n" +
                "•\tให้เล่นของเล่นที่ซับซ้อนกว่าเดิม เน้นเรื่องของ สี รูปทรง มากขึ้น\n" +
                "•\tพูดคุยเกี่ยวกับสิ่งรอบตัว ให้ดูภาพ เล่าเรื่อง เล่านิทานสั้นๆ\n" +
                "•\tเริ่มฝึกการขับถ่ายอุจจาระ ปัสสาวะให้เป็นที่ เช่น กระโถนหรือส้วมที่ดัดแปลงให้เหมาะ กับลูก\n" +
                "•\tสนใจเมื่อลูกมีพฤติกรรมที่เหมาะสม ฝึกให้ลูก รู้สิ่งที่ควรและไม่ควรทำ โดยชี้แนะและให้ลูก มีทางเลือกเองบ้าง\n\n"+
                "25-36 เดือน\n"+"•\tให้เด็กได้เล่นเครื่องเล่นสนามกับเด็กอื่น เล่น ปีนป่าย กระโดด ขึ้นบันได ขี่จักรยาน3ล้อ โดยดูแลให้ปลอดภัยระวังอุบัติเหตุ\n" +
                "•\tฝึกขีดเขียน ระบายสีนับเลข เล่นบทบาท สมมุติ / หาของเล่นที่มีสี ขนาด รูปทรงหรือ พื้นผิว ที่แตกต่างกัน\n" +
                "•\tพูดคุยเล่านิทาน ร้องเพลงกับลูก ส่งเสริมให้ ลูกพูด เล่าเรื่อง ร้องเพลง และทำท่าทาง ประกอบเพลง\n" +
                "•\tสนใจความรู้สึกของลูก และตอบสนองโดย ไม่บังคับหรือตามใจจนเกินไป\n" +
                "•\tฝึกให้ลูกรับประทานอาหาร แต่งตัวเองและ ไปเข้าส้วมเมื่อจะถ่ายอุจจาระและปัสสาวะทุก ครั้งโดยมีผู้คอยดูแลช่วยเหลือ\n");


        listDataChild.put(listDataHeader.get(0), N1);
        listDataChild.put(listDataHeader.get(1), N2);


    }



}


