public final class Easer {
  private Easer() {}

  public static float ease(float start, float end, float t, EasingTypes type) {
    switch (type) {
      case Linear:
        return EasingFunctions.linear(start, end, t);
      case EaseInQuad:
        return EasingFunctions.easeInQuad(start, end, t);
      case EaseOutQuad:
        return EasingFunctions.easeOutQuad(start, end, t);
      case EaseInOutQuad:
        return EasingFunctions.easeInOutQuad(start, end, t);
      case EaseInCubic:
        return EasingFunctions.easeInCubic(start, end, t);
      case EaseOutCubic:
        return EasingFunctions.easeOutCubic(start, end, t);
      case EaseInOutCubic:
        return EasingFunctions.easeInOutCubic(start, end, t);
      case EaseInQuart:
        return EasingFunctions.easeInQuart(start, end, t);
      case EaseOutQuart:
        return EasingFunctions.easeOutQuart(start, end, t);
      case EaseInOutQuart:
        return EasingFunctions.easeInOutQuart(start, end, t);
      case EaseInQuint:
        return EasingFunctions.easeInQuint(start, end, t);
      case EaseOutQuint:
        return EasingFunctions.easeOutQuint(start, end, t);
      case EaseInOutQuint:
        return EasingFunctions.easeInOutQuint(start, end, t);
      case EaseInSine:
        return EasingFunctions.easeInSine(start, end, t);
      case EaseOutSine:
        return EasingFunctions.easeOutSine(start, end, t);
      case EaseInOutSine:
        return EasingFunctions.easeInOutSine(start, end, t);
      case EaseInExpo:
        return EasingFunctions.easeInExpo(start, end, t);
      case EaseOutExpo:
        return EasingFunctions.easeOutExpo(start, end, t);
      case EaseInOutExpo:
        return EasingFunctions.easeInOutExpo(start, end, t);
      case EaseInCirc:
        return EasingFunctions.easeInCirc(start, end, t);
      case EaseOutCirc:
        return EasingFunctions.easeOutCirc(start, end, t);
      case EaseInOutCirc:
        return EasingFunctions.easeInOutCirc(start, end, t);
      case EaseInBack:
        return EasingFunctions.easeInBack(start, end, t);
      case EaseOutBack:
        return EasingFunctions.easeOutBack(start, end, t);
      case EaseInOutBack:
        return EasingFunctions.easeInOutBack(start, end, t);
      case EaseOutBounce:
        return EasingFunctions.easeOutBounce(start, end, t);
      case EaseInBounce:
        return EasingFunctions.easeInBounce(start, end, t);
      case EaseInOutBounce:
        return EasingFunctions.easeInOutBounce(start, end, t);
      case EaseInElastic:
        return EasingFunctions.easeInElastic(start, end, t);
      case EaseOutElastic:
        return EasingFunctions.easeOutElastic(start, end, t);
      case EaseInOutElastic:
        return EasingFunctions.easeInOutElastic(start, end, t);
      case SmoothStep:
        return EasingFunctions.smoothStep(start, end, t);
      case SmootherStep:
        return EasingFunctions.smootherStep(start, end, t);
      default:
        return start; // fallback
    }
  }

  public static float ease(float start, float end, float t, Curve curve) {
    return EasingFunctions.linear(start, end, curve.evaluate(t));
  }

  public static Vector2 easeVec(Vector2 start, Vector2 end, float t, EasingTypes type) {
    Vector2 desiredVec = new Vector2(ease(start.getX(), end.getX(), t, type), ease(start.getY(), end.getY(), t, type));
    return desiredVec;
  }

  public static Vector3 easeVec(Vector3 start, Vector3 end, float t, EasingTypes type) {
    Vector3 desiredVec = new Vector3(ease(start.getX(), end.getX(), t, type), ease(start.getY(), end.getY(), t, type), ease(start.getZ(), end.getZ(), t, type));
    return desiredVec;
  }

  public static Vector2 easeVec(Vector2 start, Vector2 end, float t, Curve curve) {
    Vector2 desiredVec = new Vector2(ease(start.getX(), end.getX(), t, curve), ease(start.getY(), end.getY(), t, curve));
    return desiredVec;
  }

  public static Vector3 easeVec(Vector3 start, Vector3 end, float t, Curve curve) {
    Vector3 desiredVec = new Vector3(ease(start.getX(), end.getX(), t, curve), ease(start.getY(), end.getY(), t, curve), ease(start.getZ(), end.getZ(), t, curve));
    return desiredVec;
  }

  public static Quaternion easeQua(Vector3 start, Vector3 end, float t, EasingTypes type) {
    Quaternion desiredQua;
    desiredQua = Quaternion.fromEuler(new Vector3(ease(start.getX(), end.getX(), t, type), ease(start.getY(), end.getY(), t, type), ease(start.getZ(), end.getZ(), t, type)));
    return desiredQua;
  }

  public static Quaternion easeQua(Vector3 start, Vector3 end, float t, Curve curve) {
    Quaternion desiredQua;
    desiredQua = Quaternion.fromEuler(new Vector3(ease(start.getX(), end.getX(), t, curve), ease(start.getY(), end.getY(), t, curve), ease(start.getZ(), end.getZ(), t, curve)));
    return desiredQua;
  }
  
  /*
   * still finding a btter ways to use easings which more parameters
   */

} 
