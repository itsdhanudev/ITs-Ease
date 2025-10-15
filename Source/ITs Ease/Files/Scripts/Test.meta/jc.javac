/* @Author Dhanu */
public float time, duration, b;
public Vector3 start = new Vector3(), end = new Vector3();
public Text3D text;

/// Run only once
void start() {}

/// Repeat every frame
void repeat() {
  if (time < duration) {
    time += Math.bySecond();
  } 

  float t = Mathf.normalize(time / (duration), 0f, 1f);

  // myTransform.getPosition().setX(lerp(start.getX(), end.getX(), t));
  // myTransform.getPosition().setY(lerp(start.getY(), end.getY(), t));
  // myTransform.getPosition().setZ(lerp(start.getZ(), end.getZ(), t));
  myTransform.getPosition().setX(Easer.easeOutCirc(start.getX(), end.getX(),t));

  text.setText(new String().format("%.2f", time));
}

public static float lerp(float start, float end, float t) {
  if (t < 0f) t = 0f;
  if (t > 1f) t = 1f;
  return start + (end - start) * t;
}
