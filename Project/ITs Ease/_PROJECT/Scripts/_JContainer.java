package JAVARuntime;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.zip.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;
import java.time.*;
import java.time.chrono.*;
import java.time.format.*;
import java.time.temporal.*;
import java.time.zone.*;



public class _JContainer{}

//C-R:Test
class Test extends Component {
   /* @Author Dhanu */ //[I-S]LN=0;[I-E]
   public enum Mode { //[I-S]LN=1;[I-E]
     P, //[I-S]LN=2;[I-E]
     R, //[I-S]LN=3;[I-E]
     S //[I-S]LN=4;[I-E]
   } //[I-S]LN=5;[I-E]
    //[I-S]LN=6;[I-E]
   public Mode mode = Mode.P; //[I-S]LN=7;[I-E]
   public float time, duration; //[I-S]LN=8;[I-E]
    //[I-S]LN=9;[I-E]
   public Vector3 start = new Vector3(); //[I-S]LN=10;[I-E]
   public Vector3 end = new Vector3(); //[I-S]LN=11;[I-E]
   public Text3D text; //[I-S]LN=12;[I-E]
    //[I-S]LN=13;[I-E]
   public EasingTypes type; //[I-S]LN=14;[I-E]
   public Curve curve = new Curve(); //[I-S]LN=15;[I-E]
    //[I-S]LN=16;[I-E]
   public boolean useCurve; //[I-S]LN=17;[I-E]
   /// Run only once //[I-S]LN=18;[I-E]
   void start() {} //[I-S]LN=19;[I-E]
    //[I-S]LN=20;[I-E]
   /// Repeat every frame //[I-S]LN=21;[I-E]
   void repeat() { //[I-S]LN=22;[I-E]
     if (time < duration) { //[I-S]LN=23;[I-E]
       time += Math.bySecond(); //[I-S]LN=24;[I-E]
     } //[I-S]LN=25;[I-E]
    //[I-S]LN=26;[I-E]
     float t = Mathf.normalize(time / (duration), 0f, 1f); //[I-S]LN=27;[I-E]
     switch (mode) { //[I-S]LN=28;[I-E]
       case P: //[I-S]LN=29;[I-E]
         if (useCurve) myTransform.setPosition(Easer.easeVec(start, end, t, curve)); //[I-S]LN=30;[I-E]
         else myTransform.setPosition(Easer.easeVec(start, end, t, curve)); //[I-S]LN=31;[I-E]
         break; //[I-S]LN=32;[I-E]
       case R: //[I-S]LN=33;[I-E]
         if (useCurve) myTransform.setRotation(Easer.easeQua(start, end, t, curve)); //[I-S]LN=34;[I-E]
         else myTransform.setRotation(Easer.easeQua(start, end, t, type)); //[I-S]LN=35;[I-E]
         break; //[I-S]LN=36;[I-E]
       case S: //[I-S]LN=37;[I-E]
         if (useCurve) myTransform.setScale(Easer.easeVec(start, end, t, curve)); //[I-S]LN=38;[I-E]
         else myTransform.setScale(Easer.easeVec(start, end, t, type)); //[I-S]LN=39;[I-E]
         break; //[I-S]LN=40;[I-E]
       default: //[I-S]LN=41;[I-E]
     }  //[I-S]LN=42;[I-E]
    //[I-S]LN=43;[I-E]
     text.setText(new String().format("%.2f", time)); //[I-S]LN=44;[I-E]
   } //[I-S]LN=45;[I-E]
}
