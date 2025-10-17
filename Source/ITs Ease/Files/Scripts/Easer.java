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
}
