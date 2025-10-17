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
      myTransform.setPosition(Easer.ease(start.getX(), end.getX(), t, type), Easer.ease(start.getY(), end.getY(), t, type), Easer.ease(start.getZ(), end.getZ(), t, type));
      break;
    case R:
      myTransform.getRotation().setFromEuler(Easer.ease(start.getX(), end.getX(), t, type), Easer.ease(start.getY(), end.getY(), t, type), Easer.ease(start.getZ(), end.getZ(), t, type));
      break;
    case S:
      myTransform.setScale(Easer.ease(start.getX(), end.getX(), t, type), Easer.ease(start.getY(), end.getY(), t, type), Easer.ease(start.getZ(), end.getZ(), t, type));
      break;
    default:
  } 

  text.setText(new String().format("%.2f", time));
}