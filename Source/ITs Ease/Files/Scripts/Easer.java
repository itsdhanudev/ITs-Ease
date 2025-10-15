public final class Easer {
  private Easer() {}

  private static float clamp01(float t) {
    if (t <= 0.0f) return 0.0f;
    if (t >= 1.0f) return 1.0f;
    return t;
  }

  public static float linear(float start, float end, float t) {
    return start + (end - start) * t;
  }

  public static float easeInQuad(float start, float end, float t) {
    return start + (end - start) * (t * t);
  }

  public static float easeOutQuad(float start, float end, float t) {
    return start - (end - start) * (t * (t - 2.0f));
  }

  public static float easeInOutQuad(float start, float end, float t) {
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (t * t);
    t -= 1.0f;
    return start - (end - start) / 2.0f * (t * (t - 2.0f) - 1.0f);
  }

  public static float easeInCubic(float start, float end, float t) {
    return start + (end - start) * (t * t * t);
  }

  public static float easeOutCubic(float start, float end, float t) {
    t -= 1.0f;
    return start + (end - start) * (t * t * t + 1.0f);
  }

  public static float easeInOutCubic(float start, float end, float t) {
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (t * t * t);
    t -= 2.0f;
    return start + (end - start) / 2.0f * (t * t * t + 2.0f);
  }

  public static float easeInQuart(float start, float end, float t) {
    return start + (end - start) * (t * t * t * t);
  }

  public static float easeOutQuart(float start, float end, float t) {
    t -= 1.0f;
    return start - (end - start) * (t * t * t * t - 1.0f);
  }

  public static float easeInOutQuart(float start, float end, float t) {
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (t * t * t * t);
    t -= 2.0f;
    return start - (end - start) / 2.0f * (t * t * t * t - 2.0f);
  }

  public static float easeInQuint(float start, float end, float t) {
    return start + (end - start) * (t * t * t * t * t);
  }

  public static float easeOutQuint(float start, float end, float t) {
    t -= 1.0f;
    return start + (end - start) * (t * t * t * t * t + 1.0f);
  }

  public static float easeInOutQuint(float start, float end, float t) {
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (t * t * t * t * t);
    t -= 2.0f;
    return start + (end - start) / 2.0f * (t * t * t * t * t + 2.0f);
  }

  public static float easeInSine(float start, float end, float t) {
    return start - (end - start) * (float) Math.cos(t * Math.PI / 2.0f) + (end - start);
  }

  public static float easeOutSine(float start, float end, float t) {
    return start + (end - start) * (float) Math.sin(t * Math.PI / 2.0f);
  }

  public static float easeInOutSine(float start, float end, float t) {
    return start - (end - start) / 2.0f * ((float) Math.cos(Math.PI * t) - 1.0f);
  }

  public static float easeInExpo(float start, float end, float t) {
    if (t == 0.0f) return start;
    return start + (end - start) * (float) Math.pow(2.0f, 10.0f * (t - 1.0f));
  }

  public static float easeOutExpo(float start, float end, float t) {
    if (t == 1.0f) return end;
    return start + (end - start) * (-(float) Math.pow(2.0f, -10.0f * t) + 1.0f);
  }

  public static float easeInOutExpo(float start, float end, float t) {
    if (t == 0.0f) return start;
    if (t == 1.0f) return end;
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (float) Math.pow(2.0f, 10.0f * (t - 1.0f));
    t -= 1.0f;
    return start + (end - start) / 2.0f * (-(float) Math.pow(2.0f, -10.0f * t) + 2.0f);
  }

  public static float easeInCirc(float start, float end, float t) {
    return start - (end - start) * ((float) Math.sqrt(1.0f - t * t) - 1.0f);
  }

  public static float easeOutCirc(float start, float end, float t) {
    t -= 1.0f;
    return start + (end - start) * (float) Math.sqrt(1.0f - t * t);
  }

  public static float easeInOutCirc(float start, float end, float t) {
    t *= 2.0f;
    if (t < 1.0f) return start - (end - start) / 2.0f * ((float) Math.sqrt(1.0f - t * t) - 1.0f);
    t -= 2.0f;
    return start + (end - start) / 2.0f * ((float) Math.sqrt(1.0f - t * t) + 1.0f);
  }

  public static float easeInBack(float start, float end, float t) {
    float s = 1.70158f;
    return start + (end - start) * (t * t * ((s + 1.0f) * t - s));
  }

  public static float easeOutBack(float start, float end, float t) {
    float s = 1.70158f;
    t -= 1.0f;
    return start + (end - start) * (t * t * ((s + 1.0f) * t + s) + 1.0f);
  }

  public static float easeInOutBack(float start, float end, float t) {
    float s = 1.70158f * 1.525f;
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (t * t * ((s + 1.0f) * t - s));
    t -= 2.0f;
    return start + (end - start) / 2.0f * (t * t * ((s + 1.0f) * t + s) + 2.0f);
  }

  public static float easeOutBounce(float start, float end, float t) {
    float n1 = 7.5625f;
    float d1 = 2.75f;
    float diff = (end - start);
    if (t < 1.0f / d1) {
      return start + diff * (n1 * t * t);
    } else if (t < 2.0f / d1) {
      t -= 1.5f / d1;
      return start + diff * (n1 * t * t + 0.75f);
    } else if (t < 2.5f / d1) {
      t -= 2.25f / d1;
      return start + diff * (n1 * t * t + 0.9375f);
    } else {
      t -= 2.625f / d1;
      return start + diff * (n1 * t * t + 0.984375f);
    }
  }

  public static float easeInBounce(float start, float end, float t) {
    float inv = easeOutBounce(0.0f, 1.0f, 1.0f - t);
    return start + (end - start) * (1.0f - inv);
  }

  public static float easeInOutBounce(float start, float end, float t) {
    if (t < 0.5f) return start + (end - start) * 0.5f * (1.0f - easeOutBounce(0.0f, 1.0f, 1.0f - (t * 2.0f)));
    else return start + (end - start) * (0.5f * easeOutBounce(0.0f, 1.0f, (t * 2.0f - 1.0f)) + 0.5f);
  }

  public static float easeInElastic(float start, float end, float t) {
    if (t == 0.0f) return start;
    if (t == 1.0f) return end;
    float p = 0.3f;
    float s = p / 4.0f;
    t -= 1.0f;
    return start + -(end - start) * (float) Math.pow(2.0f, 10.0f * t) * (float) Math.sin((t - s) * (2.0f * Math.PI) / p);
  }

  public static float easeOutElastic(float start, float end, float t) {
    if (t == 0.0f) return start;
    if (t == 1.0f) return end;
    float p = 0.3f;
    float s = p / 4.0f;
    return start + (end - start) * ((float) Math.pow(2.0f, -10.0f * t) * (float) Math.sin((t - s) * (2.0f * Math.PI) / p) + 1.0f);
  }

  public static float easeInOutElastic(float start, float end, float t) {
    if (t == 0.0f) return start;
    if (t == 1.0f) return end;
    float p = 0.45f;
    float s = p / 4.0f;
    t *= 2.0f;
    if (t < 1.0f) {
      t -= 1.0f;
      return start + -(end - start) / 2.0f * (float) Math.pow(2.0f, 10.0f * t) * (float) Math.sin((t - s) * (2.0f * Math.PI) / p);
    } else {
      t -= 1.0f;
      return start + (end - start) / 2.0f * ((float) Math.pow(2.0f, -10.0f * t) * (float) Math.sin((t - s) * (2.0f * Math.PI) / p) + 1.0f);
    }
  }

  public static float smoothStep(float start, float end, float t) {
    t = clamp01(t);
    return start + (end - start) * (t * t * (3.0f - 2.0f * t));
  }

  public static float smootherStep(float start, float end, float t) {
    t = clamp01(t);
    return start + (end - start) * (t * t * t * (t * (6.0f * t - 15.0f) + 10.0f));
  }

  public static float step(float start, float end, float t, int steps) {
    if (steps <= 1) return (t < 0.5f ? start : end);
    t = clamp01(t);
    float stepT = (float) Math.floor(t * steps) / (float) steps;
    return start + (end - start) * stepT;
  }

  public static float easeInPower(float start, float end, float t, int n) {
    if (n <= 1) return linear(start, end, t);
    return start + (end - start) * (float) Math.pow(t, n);
  }

  public static float easeOutPower(float start, float end, float t, int n) {
    if (n <= 1) return linear(start, end, t);
    return start + (end - start) * (1.0f - (float) Math.pow(1.0f - t, n));
  }

  public static float easeInOutPower(float start, float end, float t, int n) {
    if (n <= 1) return linear(start, end, t);
    t *= 2.0f;
    if (t < 1.0f) return start + (end - start) / 2.0f * (float) Math.pow(t, n);
    t -= 1.0f;
    return start + (end - start) / 2.0f * (1.0f - (float) Math.pow(1.0f - t, n) + 1.0f);
  }

  public static float cubicBezier(float start, float end, float t, float x1, float y1, float x2, float y2) {
    t = clamp01(t);
    float diff = end - start;
    if (x1 == y1 && x2 == y2 && x1 == x2) {
      return start + diff * t;
    }
    float lower = 0.0f;
    float upper = 1.0f;
    float u = t;
    for (int i = 0; i < 24; i++) {
      u = (lower + upper) * 0.5f;
      float xAtU = cubicBezierSample(u, x1, x2);
      if (xAtU > t) upper = u;
      else lower = u;
    }
    float yAtU = cubicBezierSample(u, y1, y2);
    return start + diff * yAtU;
  }

  private static float cubicBezierSample(float u, float c1, float c2) {
    float inv = 1.0f - u;
    float a = 3.0f * inv * inv * u * c1;
    float b = 3.0f * inv * u * u * c2;
    float c = u * u * u;
    return a + b + c;
  }

  private static float deterministicNoise(int i) {
    float x = Math.sin((float) i * 127.1f) * 43758.5453f;
    float frac = x - Math.floor(x);
    return (float) frac;
  }

  public static interface EaseFunction {
    float ease(float start, float end, float t);
  }
} 
