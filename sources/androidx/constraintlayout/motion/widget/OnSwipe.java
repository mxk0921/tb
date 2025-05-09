package androidx.constraintlayout.motion.widget;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OnSwipe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;
    private int mDragDirection = 0;
    private int mTouchAnchorSide = 0;
    private int mTouchAnchorId = -1;
    private int mTouchRegionId = -1;
    private int mLimitBoundsTo = -1;
    private int mOnTouchUp = 0;
    private int mRotationCenterId = -1;
    private float mMaxVelocity = 4.0f;
    private float mMaxAcceleration = 1.2f;
    private boolean mMoveWhenScrollAtTop = true;
    private float mDragScale = 1.0f;
    private int mFlags = 0;
    private float mDragThreshold = 10.0f;
    private float mSpringDamping = Float.NaN;
    private float mSpringMass = 1.0f;
    private float mSpringStiffness = Float.NaN;
    private float mSpringStopThreshold = Float.NaN;
    private int mSpringBoundary = 0;
    private int mAutoCompleteMode = 0;

    public int getAutoCompleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b213b", new Object[]{this})).intValue();
        }
        return this.mAutoCompleteMode;
    }

    public int getDragDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44da52ef", new Object[]{this})).intValue();
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

    public int getLimitBoundsTo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac4e8b2f", new Object[]{this})).intValue();
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

    public boolean getMoveWhenScrollAtTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29af28ff", new Object[]{this})).booleanValue();
        }
        return this.mMoveWhenScrollAtTop;
    }

    public int getNestedScrollFlags() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c0a387", new Object[]{this})).intValue();
        }
        return this.mFlags;
    }

    public int getOnTouchUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4196329f", new Object[]{this})).intValue();
        }
        return this.mOnTouchUp;
    }

    public int getRotationCenterId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1492c3de", new Object[]{this})).intValue();
        }
        return this.mRotationCenterId;
    }

    public int getSpringBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b955447", new Object[]{this})).intValue();
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

    public int getTouchAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb987353", new Object[]{this})).intValue();
        }
        return this.mTouchAnchorId;
    }

    public int getTouchAnchorSide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae16ee0f", new Object[]{this})).intValue();
        }
        return this.mTouchAnchorSide;
    }

    public int getTouchRegionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("942b6c52", new Object[]{this})).intValue();
        }
        return this.mTouchRegionId;
    }

    public void setAutoCompleteMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665c2d2f", new Object[]{this, new Integer(i)});
        } else {
            this.mAutoCompleteMode = i;
        }
    }

    public OnSwipe setDragDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("310b515d", new Object[]{this, new Integer(i)});
        }
        this.mDragDirection = i;
        return this;
    }

    public OnSwipe setDragScale(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("7a44f372", new Object[]{this, new Integer(i)});
        }
        this.mDragScale = i;
        return this;
    }

    public OnSwipe setDragThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("4c93aff1", new Object[]{this, new Integer(i)});
        }
        this.mDragThreshold = i;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("76d7a11d", new Object[]{this, new Integer(i)});
        }
        this.mLimitBoundsTo = i;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("40fb7b24", new Object[]{this, new Integer(i)});
        }
        this.mMaxAcceleration = i;
        return this;
    }

    public OnSwipe setMaxVelocity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("63c781e7", new Object[]{this, new Integer(i)});
        }
        this.mMaxVelocity = i;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("d67fd60f", new Object[]{this, new Boolean(z)});
        }
        this.mMoveWhenScrollAtTop = z;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("b845bdc5", new Object[]{this, new Integer(i)});
        }
        this.mFlags = i;
        return this;
    }

    public OnSwipe setOnTouchUp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("4f2e6dad", new Object[]{this, new Integer(i)});
        }
        this.mOnTouchUp = i;
        return this;
    }

    public OnSwipe setRotateCenter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("484c0d54", new Object[]{this, new Integer(i)});
        }
        this.mRotationCenterId = i;
        return this;
    }

    public OnSwipe setSpringBoundary(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("5a59586d", new Object[]{this, new Integer(i)});
        }
        this.mSpringBoundary = i;
        return this;
    }

    public OnSwipe setSpringDamping(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("dfef94d0", new Object[]{this, new Float(f)});
        }
        this.mSpringDamping = f;
        return this;
    }

    public OnSwipe setSpringMass(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("9b22cb20", new Object[]{this, new Float(f)});
        }
        this.mSpringMass = f;
        return this;
    }

    public OnSwipe setSpringStiffness(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("9f7896f3", new Object[]{this, new Float(f)});
        }
        this.mSpringStiffness = f;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("85e55a69", new Object[]{this, new Float(f)});
        }
        this.mSpringStopThreshold = f;
        return this;
    }

    public OnSwipe setTouchAnchorId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("61161579", new Object[]{this, new Integer(i)});
        }
        this.mTouchAnchorId = i;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("1a52873d", new Object[]{this, new Integer(i)});
        }
        this.mTouchAnchorSide = i;
        return this;
    }

    public OnSwipe setTouchRegionId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnSwipe) ipChange.ipc$dispatch("57ae965a", new Object[]{this, new Integer(i)});
        }
        this.mTouchRegionId = i;
        return this;
    }
}
