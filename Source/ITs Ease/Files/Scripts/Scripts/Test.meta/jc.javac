/* @Author Dhanu */
public enum Mode {
  P,
  R,
  S
}

public Mode mode = Mode.P;
public float time, duration, b;
public Vector3 start = new Vector3();
public Vector3 end = new Vector3();
public Text3D text;
public EasingTypes type;
/// Run only once
void start() {}

/// Repeat every frame
void repeat() {
  if (time < duration) {
    time += Math.bySecond();
  }

  float t = Mathf.normalize(time / (duration), 0f, 1f);
  switch (mode) {
    case P:
      myTransform.setPosition(Easer.easeVec(start, end, t, type));
      break;
    case R:
      myTransform.setRotation(Easer.easeQua(start, end, t, type));
      break;
    case S:
      myTransform.setScale(Easer.easeVec(start, end, t, type));
      break;
    default:
  } 

  text.setText(new String().format("%.2f", time));
}
