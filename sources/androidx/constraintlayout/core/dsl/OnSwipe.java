package androidx.constraintlayout.core.dsl;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OnSwipe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    private Mode mAutoCompleteMode;
    private Drag mDragDirection;
    private float mDragScale;
    private float mDragThreshold;
    private String mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private TouchUp mOnTouchUp;
    private String mRotationCenterId;
    private Boundary mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private String mTouchAnchorId;
    private Side mTouchAnchorSide;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Boundary extends Enum<Boundary> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Boundary OVERSHOOT = new Boundary("OVERSHOOT", 0);
        public static final Boundary BOUNCE_START = new Boundary("BOUNCE_START", 1);
        public static final Boundary BOUNCE_END = new Boundary("BOUNCE_END", 2);
        public static final Boundary BOUNCE_BOTH = new Boundary("BOUNCE_BOTH", 3);
        private static final /* synthetic */ Boundary[] $VALUES = $values();

        private static /* synthetic */ Boundary[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boundary[]) ipChange.ipc$dispatch("90d6d662", new Object[0]) : new Boundary[]{OVERSHOOT, BOUNCE_START, BOUNCE_END, BOUNCE_BOTH};
        }

        private Boundary(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Boundary boundary, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/OnSwipe$Boundary");
        }

        public static Boundary valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boundary) ipChange.ipc$dispatch("e8c0ed7", new Object[]{str});
            }
            return (Boundary) Enum.valueOf(Boundary.class, str);
        }

        public static Boundary[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boundary[]) ipChange.ipc$dispatch("cb324b06", new Object[0]);
            }
            return (Boundary[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Drag extends Enum<Drag> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Drag UP = new Drag("UP", 0);
        public static final Drag DOWN = new Drag(RPCDataItems.DOWN, 1);
        public static final Drag LEFT = new Drag("LEFT", 2);
        public static final Drag RIGHT = new Drag("RIGHT", 3);
        public static final Drag START = new Drag("START", 4);
        public static final Drag END = new Drag("END", 5);
        public static final Drag CLOCKWISE = new Drag("CLOCKWISE", 6);
        public static final Drag ANTICLOCKWISE = new Drag("ANTICLOCKWISE", 7);
        private static final /* synthetic */ Drag[] $VALUES = $values();

        private static /* synthetic */ Drag[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drag[]) ipChange.ipc$dispatch("ca3c6318", new Object[0]) : new Drag[]{UP, DOWN, LEFT, RIGHT, START, END, CLOCKWISE, ANTICLOCKWISE};
        }

        private Drag(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Drag drag, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/OnSwipe$Drag");
        }

        public static Drag valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drag) ipChange.ipc$dispatch("57e21e0d", new Object[]{str});
            }
            return (Drag) Enum.valueOf(Drag.class, str);
        }

        public static Drag[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drag[]) ipChange.ipc$dispatch("f1b3c9bc", new Object[0]);
            }
            return (Drag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Mode extends Enum<Mode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Mode VELOCITY = new Mode("VELOCITY", 0);
        public static final Mode SPRING = new Mode("SPRING", 1);
        private static final /* synthetic */ Mode[] $VALUES = $values();

        private static /* synthetic */ Mode[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Mode[]) ipChange.ipc$dispatch("cab9e489", new Object[0]) : new Mode[]{VELOCITY, SPRING};
        }

        private Mode(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Mode mode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/OnSwipe$Mode");
        }

        public static Mode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode) ipChange.ipc$dispatch("585f9f7e", new Object[]{str});
            }
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode[]) ipChange.ipc$dispatch("f2314b2d", new Object[0]);
            }
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Side extends Enum<Side> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Side TOP = new Side("TOP", 0);
        public static final Side LEFT = new Side("LEFT", 1);
        public static final Side RIGHT = new Side("RIGHT", 2);
        public static final Side BOTTOM = new Side("BOTTOM", 3);
        public static final Side MIDDLE = new Side("MIDDLE", 4);
        public static final Side START = new Side("START", 5);
        public static final Side END = new Side("END", 6);
        private static final /* synthetic */ Side[] $VALUES = $values();

        private static /* synthetic */ Side[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Side[]) ipChange.ipc$dispatch("cb0bb755", new Object[0]) : new Side[]{TOP, LEFT, RIGHT, BOTTOM, MIDDLE, START, END};
        }

        private Side(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Side side, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/OnSwipe$Side");
        }

        public static Side valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Side) ipChange.ipc$dispatch("58b1724a", new Object[]{str});
            }
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Side[]) ipChange.ipc$dispatch("f2831df9", new Object[0]);
            }
            return (Side[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class TouchUp extends Enum<TouchUp> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final TouchUp AUTOCOMPLETE = new TouchUp("AUTOCOMPLETE", 0);
        public static final TouchUp TO_START = new TouchUp("TO_START", 1);
        public static final TouchUp NEVER_COMPLETE_END = new TouchUp("NEVER_COMPLETE_END", 2);
        public static final TouchUp TO_END = new TouchUp("TO_END", 3);
        public static final TouchUp STOP = new TouchUp(FilterManager.STOP, 4);
        public static final TouchUp DECELERATE = new TouchUp("DECELERATE", 5);
        public static final TouchUp DECELERATE_COMPLETE = new TouchUp("DECELERATE_COMPLETE", 6);
        public static final TouchUp NEVER_COMPLETE_START = new TouchUp("NEVER_COMPLETE_START", 7);
        private static final /* synthetic */ TouchUp[] $VALUES = $values();

        private static /* synthetic */ TouchUp[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TouchUp[]) ipChange.ipc$dispatch("6aae1210", new Object[0]) : new TouchUp[]{AUTOCOMPLETE, TO_START, NEVER_COMPLETE_END, TO_END, STOP, DECELERATE, DECELERATE_COMPLETE, NEVER_COMPLETE_START};
        }

        private TouchUp(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(TouchUp touchUp, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/OnSwipe$TouchUp");
        }

        public static TouchUp valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TouchUp) ipChange.ipc$dispatch("13e576fb", new Object[]{str});
            }
            return (TouchUp) Enum.valueOf(TouchUp.class, str);
        }

        public static TouchUp[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TouchUp[]) ipChange.ipc$dispatch("2a7f78ec", new Object[0]);
            }
            return (TouchUp[]) $VALUES.clone();
        }
    }

    public OnSwipe() {
        this.mDragDirection = null;
        this.mTouchAnchorSide = null;
        this.mTouchAnchorId = null;
        this.mLimitBoundsTo = null;
        this.mOnTouchUp = null;
        this.mRotationCenterId = null;
        this.mMaxVelocity = Float.NaN;
        this.mMaxAcceleration = Float.NaN;
        this.mDragScale = Float.NaN;
        this.mDragThreshold = Float.NaN;
        this.mSpringDamping = Float.NaN;
        this.mSpringMass = Float.NaN;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = null;
        this.mAutoCompleteMode = null;
    }

    public Mode getAutoCompleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mode) ipChange.ipc$dispatch("331cd70d", new Object[]{this});
        }
        return this.mAutoCompleteMode;
    }

    public Drag getDragDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drag) ipChange.ipc$dispatch("5398cf50", new Object[]{this});
        }
        return this.mDragDirection;
    }

    public float getDragScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("114f2237", new Object[]{this})).floatValue();
        }
        return this.mDragScale;
    }

    public float getDragThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2cbd9d8", new Object[]{this})).floatValue();
        }
        return this.mDragThreshold;
    }

    public String getLimitBoundsTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4aa3c8e4", new Object[]{this});
        }
        return this.mLimitBoundsTo;
    }

    public float getMaxAcceleration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28cf1745", new Object[]{this})).floatValue();
        }
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e105e022", new Object[]{this})).floatValue();
        }
        return this.mMaxVelocity;
    }

    public TouchUp getOnTouchUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchUp) ipChange.ipc$dispatch("bfcb7d28", new Object[]{this});
        }
        return this.mOnTouchUp;
    }

    public String getRotationCenterId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c102415", new Object[]{this});
        }
        return this.mRotationCenterId;
    }

    public Boundary getSpringBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boundary) ipChange.ipc$dispatch("774bebf2", new Object[]{this});
        }
        return this.mSpringBoundary;
    }

    public float getSpringDamping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fe64376", new Object[]{this})).floatValue();
        }
        return this.mSpringDamping;
    }

    public float getSpringMass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f12ac78e", new Object[]{this})).floatValue();
        }
        return this.mSpringMass;
    }

    public float getSpringStiffness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40160bf3", new Object[]{this})).floatValue();
        }
        return this.mSpringStiffness;
    }

    public float getSpringStopThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c46f57bd", new Object[]{this})).floatValue();
        }
        return this.mSpringStopThreshold;
    }

    public String getTouchAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6feaad40", new Object[]{this});
        }
        return this.mTouchAnchorId;
    }

    public Side getTouchAnchorSide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Side) ipChange.ipc$dispatch("1715fead", new Object[]{this});
        }
        return this.mTouchAnchorSide;
    }

    public void setAutoCompleteMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb4eac81", new Object[]{this, mode});
        } else {
            this.mAutoCompleteMode = mode;
        }
    }

    public OnSwipe setDragDirection(Drag drag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("e4c5bcd6", new Object[]{this, drag});
        }
        this.mDragDirection = drag;
        return this;
    }

    public OnSwipe setDragScale(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("34034a62", new Object[]{this, new Integer(i)});
        }
        this.mDragScale = i;
        return this;
    }

    public OnSwipe setDragThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("6a027a83", new Object[]{this, new Integer(i)});
        }
        this.mDragThreshold = i;
        return this;
    }

    public OnSwipe setLimitBoundsTo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("9d66a750", new Object[]{this, str});
        }
        this.mLimitBoundsTo = str;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("49ff3b70", new Object[]{this, new Integer(i)});
        }
        this.mMaxAcceleration = i;
        return this;
    }

    public OnSwipe setMaxVelocity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("16a4c6cd", new Object[]{this, new Integer(i)});
        }
        this.mMaxVelocity = i;
        return this;
    }

    public OnSwipe setOnTouchUp(TouchUp touchUp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("2a1c34ec", new Object[]{this, touchUp});
        }
        this.mOnTouchUp = touchUp;
        return this;
    }

    public OnSwipe setRotateCenter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("65bf7907", new Object[]{this, str});
        }
        this.mRotationCenterId = str;
        return this;
    }

    public OnSwipe setSpringBoundary(Boundary boundary) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("f96c403c", new Object[]{this, boundary});
        }
        this.mSpringBoundary = boundary;
        return this;
    }

    public OnSwipe setSpringDamping(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("bab4c644", new Object[]{this, new Float(f)});
        }
        this.mSpringDamping = f;
        return this;
    }

    public OnSwipe setSpringMass(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("6a4cddf4", new Object[]{this, new Float(f)});
        }
        this.mSpringMass = f;
        return this;
    }

    public OnSwipe setSpringStiffness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("3685ba41", new Object[]{this, new Float(f)});
        }
        this.mSpringStiffness = f;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("257e250b", new Object[]{this, new Float(f)});
        }
        this.mSpringStopThreshold = f;
        return this;
    }

    public OnSwipe setTouchAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("30ad71ac", new Object[]{this, str});
        }
        this.mTouchAnchorId = str;
        return this;
    }

    public OnSwipe setTouchAnchorSide(Side side) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("55185d9", new Object[]{this, side});
        }
        this.mTouchAnchorSide = side;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("OnSwipe:{\n");
        if (this.mTouchAnchorId != null) {
            sb.append("anchor:'");
            sb.append(this.mTouchAnchorId);
            sb.append("',\n");
        }
        if (this.mDragDirection != null) {
            sb.append("direction:'");
            sb.append(this.mDragDirection.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.mTouchAnchorSide != null) {
            sb.append("side:'");
            sb.append(this.mTouchAnchorSide.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mDragScale)) {
            sb.append("scale:'");
            sb.append(this.mDragScale);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mDragThreshold)) {
            sb.append("threshold:'");
            sb.append(this.mDragThreshold);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mMaxVelocity)) {
            sb.append("maxVelocity:'");
            sb.append(this.mMaxVelocity);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mMaxAcceleration)) {
            sb.append("maxAccel:'");
            sb.append(this.mMaxAcceleration);
            sb.append("',\n");
        }
        if (this.mLimitBoundsTo != null) {
            sb.append("limitBounds:'");
            sb.append(this.mLimitBoundsTo);
            sb.append("',\n");
        }
        if (this.mAutoCompleteMode != null) {
            sb.append("mode:'");
            sb.append(this.mAutoCompleteMode.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.mOnTouchUp != null) {
            sb.append("touchUp:'");
            sb.append(this.mOnTouchUp.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mSpringMass)) {
            sb.append("springMass:'");
            sb.append(this.mSpringMass);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mSpringStiffness)) {
            sb.append("springStiffness:'");
            sb.append(this.mSpringStiffness);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mSpringDamping)) {
            sb.append("springDamping:'");
            sb.append(this.mSpringDamping);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.mSpringStopThreshold)) {
            sb.append("stopThreshold:'");
            sb.append(this.mSpringStopThreshold);
            sb.append("',\n");
        }
        if (this.mSpringBoundary != null) {
            sb.append("springBoundary:'");
            sb.append(this.mSpringBoundary);
            sb.append("',\n");
        }
        if (this.mRotationCenterId != null) {
            sb.append("around:'");
            sb.append(this.mRotationCenterId);
            sb.append("',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public OnSwipe(String str, Side side, Drag drag) {
        this.mLimitBoundsTo = null;
        this.mOnTouchUp = null;
        this.mRotationCenterId = null;
        this.mMaxVelocity = Float.NaN;
        this.mMaxAcceleration = Float.NaN;
        this.mDragScale = Float.NaN;
        this.mDragThreshold = Float.NaN;
        this.mSpringDamping = Float.NaN;
        this.mSpringMass = Float.NaN;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = null;
        this.mAutoCompleteMode = null;
        this.mTouchAnchorId = str;
        this.mTouchAnchorSide = side;
        this.mDragDirection = drag;
    }
}
