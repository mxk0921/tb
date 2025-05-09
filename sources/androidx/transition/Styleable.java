package androidx.transition;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Styleable {
    public static final int[] TRANSITION_TARGET = {16842799, 16843740, 16843841, 16843842, 16843853, 16843854};
    public static final int[] TRANSITION_MANAGER = {16843741, 16843742, 16843743};
    public static final int[] TRANSITION = {16843073, 16843160, 16843746, 16843855};
    public static final int[] CHANGE_BOUNDS = {16843983};
    public static final int[] VISIBILITY_TRANSITION = {16843900};
    public static final int[] FADE = {16843745};
    public static final int[] CHANGE_TRANSFORM = {16843964, 16843965};
    public static final int[] SLIDE = {16843824};
    public static final int[] TRANSITION_SET = {16843744};
    public static final int[] ARC_MOTION = {16843901, 16843902, 16843903};
    public static final int[] PATTERN_PATH_MOTION = {16843978};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ArcMotion {
        public static final int MAXIMUM_ANGLE = 2;
        public static final int MINIMUM_HORIZONTAL_ANGLE = 0;
        public static final int MINIMUM_VERTICAL_ANGLE = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ChangeBounds {
        public static final int RESIZE_CLIP = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ChangeTransform {
        public static final int REPARENT = 0;
        public static final int REPARENT_WITH_OVERLAY = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Fade {
        public static final int FADING_MODE = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface PatternPathMotion {
        public static final int PATTERN_PATH_DATA = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Slide {
        public static final int SLIDE_EDGE = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Transition {
        public static final int DURATION = 1;
        public static final int INTERPOLATOR = 0;
        public static final int MATCH_ORDER = 3;
        public static final int START_DELAY = 2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface TransitionManager {
        public static final int FROM_SCENE = 0;
        public static final int TO_SCENE = 1;
        public static final int TRANSITION = 2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface TransitionSet {
        public static final int TRANSITION_ORDERING = 0;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface TransitionTarget {
        public static final int EXCLUDE_CLASS = 3;
        public static final int EXCLUDE_ID = 2;
        public static final int EXCLUDE_NAME = 5;
        public static final int TARGET_CLASS = 0;
        public static final int TARGET_ID = 1;
        public static final int TARGET_NAME = 4;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface VisibilityTransition {
        public static final int TRANSITION_VISIBILITY_MODE = 0;
    }

    private Styleable() {
    }
}
