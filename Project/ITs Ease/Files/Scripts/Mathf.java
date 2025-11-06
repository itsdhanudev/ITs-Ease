public final class Mathf {

  private Mathf() {}

  public static final float PI = 3.1415927f;
  public static final float DEG2RAD = PI / 180f;
  public static final float RAD2DEG = 180f / PI;
  public static final float E = 2.7182818f;
  public static final float EPSILON = 1.1920929E-7f;
  public static final float INFINITY = Float.POSITIVE_INFINITY;
  public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
  public static final float HALF_PI = PI / 2f;
  public static final float TWO_PI = 2 * PI;
  public static final float SQRT2 = 1.4142135f;
  public static final float SQRT3 = 1.7320508f;
  public static final float GOLDEN_RATIO = 1.618034f;
  public static final float LN2 = 0.6931472f;
  public static final float LN10 = 2.3025851f;
  private static long lastTimeNano = java.lang.System.nanoTime();
  private static float lastTimeSeconds = java.lang.System.nanoTime() / 1000000000f; 
  
  // Methods
  public static float abs(float v) {
    return v < 0 ? -v : v;
  }

  public static int abs(int v) {
    return v < 0 ? -v : v;
  }

  public static float acos(float f) {
    return (float) Math.acos(f);
  }

  public static float asin(float f) {
    return (float) Math.asin(f);
  }

  public static float atan(float f) {
    return (float) Math.atan(f);
  }

  public static float atan2(float y, float x) {
    return (float) Math.atan2(y, x);
  }

  public static float byNanoSecond() {
    return java.lang.System.nanoTime();
  }

  public static float bySecond() {
    float currentTimeSeconds = System.nanoTime() / 1000000000f;
    float deltaTime = currentTimeSeconds - lastTimeSeconds;
    lastTimeSeconds = currentTimeSeconds;
    return deltaTime;
  } 

  public static float ceil(float f) {
    return (float) Math.ceil(f);
  }

  public static float clamp(float value, float min, float max) {
    return max(min, min(value, max));
  }

  public static int clamp(int value, int min, int max) {
    return Math.max(min, Math.min(value, max));
  }

  public static float clamp01(float value) {
    return clamp(value, 0f, 1f);
  }

  public static float cos(float f) {
    return (float) Math.cos(f);
  }

  public static float exp(float power) {
    return (float) Math.exp(power);
  }

  public static float floor(float f) {
    return (float) Math.floor(f);
  }

  public static float lerp(float a, float b, float t) {
    return a + clamp01(t) * (b - a);
  }

  public static float lerpUnclamped(float a, float b, float t) {
    return a + t * (b - a);
  }

  public static float inverseLerp(float a, float b, float value) {
    return a != b ? clamp01((value - a) / (b - a)) : 0f;
  }

  public static float log(float f, float base) {
    return (float) (Math.log(f) / Math.log(base));
  }

  public static float log(float f) {
    return (float) Math.log(f);
  }

  public static float log10(float f) {
    return (float) Math.log10(f);
  }

  public static float max(float a, float b) {
    return a > b ? a : b;
  }

  public static int max(int a, int b) {
    return a > b ? a : b;
  }

  public static float min(float a, float b) {
    return a < b ? a : b;
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }

  public static float pow(float f, float p) {
    return (float) Math.pow(f, p);
  }

  public static float repeat(float t, float length) {
    return t - floor(t / length) * length;
  }

  public static float round(float f) {
    return (float) Math.round(f);
  }

  public static int roundToInt(float f) {
    return (int) Math.round(f);
  }

  public static float sign(float f) {
    return f >= 0f ? 1f : -1f;
  }

  public static float sin(float f) {
    return (float) Math.sin(f);
  }

  public static float sqrt(float f) {
    return (float) Math.sqrt(f);
  }

  public static float tan(float f) {
    return (float) Math.tan(f);
  }

  public static float moveTowards(float current, float target, float maxDelta) {
    if (abs(target - current) <= maxDelta) return target;
    return current + sign(target - current) * maxDelta;
  }

  public static float deltaAngle(float current, float target) {
    float delta = repeat((target - current), 360f);
    if (delta > 180f) delta -= 360f;
    return delta;
  }

  public static float smoothStep(float from, float to, float t) {
    t = clamp01(t);
    t = t * t * (3f - 2f * t);
    return from + (to - from) * t;
  }

  public static float gamma(float value, float absmax, float gamma) {
    boolean negative = value < 0f;
    float absval = abs(value);
    if (absval > absmax) return value;
    float result = (float) Math.pow(absval / absmax, gamma) * absmax;
    return negative ? -result : result;
  }

  public static boolean approximately(float a, float b) {
    return Mathf.abs(b - a) < Mathf.max(1E-06f * Mathf.max(Mathf.abs(a), Mathf.abs(b)), EPSILON);
  }

  public static float pingPong(float t, float length) {
    t = repeat(t, length * 2f);
    return length - abs(t - length);
  }

  public static float nextPowerOfTwo(float f) {
    int v = (int) f;
    v--;
    v |= v >> 1;
    v |= v >> 2;
    v |= v >> 4;
    v |= v >> 8;
    v |= v >> 16;
    v++;
    return v;
  }

  public static boolean isPowerOfTwo(int value) {
    return (value != 0) && ((value & (value - 1)) == 0);
  }

  public static float degToRad(float degrees) {
    return degrees * DEG2RAD;
  }

  public static float radToDeg(float radians) {
    return radians * RAD2DEG;
  }

  public static float frac(float f) {
    return f - floor(f);
  }

  public static int signInt(int i) {
    return i >= 0 ? 1 : -1;
  }

  public static float toRadians(float degrees) {
    return (float) Math.toRadians(degrees);
  }

  public static float toDegrees(float radians) {
    return (float) Math.toDegrees(radians);
  }

  public static float average(float... values) {
    if (values.length == 0) return 0f;
    float sum = 0f;
    for (float v : values) sum += v;
    return sum / values.length;
  }

  public static float distance(float a, float b) {
    return abs(a - b);
  }

  public static float normalize(float value, float min, float max) {
    return (value - min) / (max - min);
  }

  public static float map(float value, float inMin, float inMax, float outMin, float outMax) {
    return outMin + (outMax - outMin) * ((value - inMin) / (inMax - inMin));
  }
}
