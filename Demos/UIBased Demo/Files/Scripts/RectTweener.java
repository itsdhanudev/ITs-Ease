package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;
import java.nio.*;
import java.util.HashMap;
import java.util.Map;

/* @Author Dhanu */
public class RectTweener extends Component {
  public EasingTypes easeType = EasingTypes.Linear;

  @AutoWired @Hide public UIRect rect;

  public Vector2 start = new Vector2();
  public Vector2 end = new Vector2();

  public float time;
  public float duration;

  public boolean useCurve;
  public Curve curve = new Curve();

  /// Run only once
  void start() {}

  /// Repeat every frame
  void repeat() {

    if (time < duration) {
      time += Math.bySecond();
    } 
    
    float t = Mathf.normalize(time / duration, 0f, 1f);
    if (!useCurve) setRectPos(Easer.easeVec(start, end, t, easeType), rect);
    else setRectPos(Easer.easeVec(start, end, t, curve), rect);
  }

  public void setRectPos(Vector2 vec, UIRect _rect) {
    _rect.setJRPositionX((int) vec.getX());
    _rect.setJRPositionY((int) vec.getY());
  }
}
