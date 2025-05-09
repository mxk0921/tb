package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DragForce mFlingForce;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class DragForce implements Force {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mVelocityThreshold;

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("420fcd2d", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
            }
            return f2 * this.mFriction;
        }

        public float getFrictionScalar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f5f3a2f3", new Object[]{this})).floatValue();
            }
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("37726922", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            if (Math.abs(f2) < this.mVelocityThreshold) {
                return true;
            }
            return false;
        }

        public void setFrictionScalar(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16c5e491", new Object[]{this, new Float(f)});
            } else {
                this.mFriction = f * DEFAULT_FRICTION;
            }
        }

        public void setValueThreshold(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b04eba9d", new Object[]{this, new Float(f)});
            } else {
                this.mVelocityThreshold = f * VELOCITY_THRESHOLD_MULTIPLIER;
            }
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f, float f2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DynamicAnimation.MassState) ipChange.ipc$dispatch("52bcd2a7", new Object[]{this, new Float(f), new Float(f2), new Long(j)});
            }
            float f3 = (float) j;
            this.mMassState.mVelocity = (float) (f2 * Math.exp((f3 / 1000.0f) * this.mFriction));
            DynamicAnimation.MassState massState = this.mMassState;
            float f4 = this.mFriction;
            massState.mValue = (float) ((f - (f2 / f4)) + ((f2 / f4) * Math.exp((f4 * f3) / 1000.0f)));
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    public static /* synthetic */ Object ipc$super(FlingAnimation flingAnimation, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -688980679) {
            return super.setMinValue(((Number) objArr[0]).floatValue());
        }
        if (hashCode == 1109891989) {
            return super.setStartVelocity(((Number) objArr[0]).floatValue());
        }
        if (hashCode == 1488806887) {
            return super.setMaxValue(((Number) objArr[0]).floatValue());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/dynamicanimation/animation/FlingAnimation");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("420fcd2d", new Object[]{this, new Float(f), new Float(f2)})).floatValue();
        }
        return this.mFlingForce.getAcceleration(f, f2);
    }

    public float getFriction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d02c90e7", new Object[]{this})).floatValue();
        }
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37726922", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (f >= this.mMaxValue || f <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f, f2)) {
            return true;
        }
        return false;
    }

    public FlingAnimation setFriction(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlingAnimation) ipChange.ipc$dispatch("33fde291", new Object[]{this, new Float(f)});
        }
        if (f > 0.0f) {
            this.mFlingForce.setFrictionScalar(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04eba9d", new Object[]{this, new Float(f)});
        } else {
            this.mFlingForce.setValueThreshold(f);
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlingAnimation) ipChange.ipc$dispatch("6f002104", new Object[]{this, new Float(f)});
        }
        super.setMaxValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlingAnimation) ipChange.ipc$dispatch("410be6d6", new Object[]{this, new Float(f)});
        }
        super.setMinValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlingAnimation) ipChange.ipc$dispatch("2b506c32", new Object[]{this, new Float(f)});
        }
        super.setStartVelocity(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcb5e615", new Object[]{this, new Long(j)})).booleanValue();
        }
        DynamicAnimation.MassState updateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j);
        float f = updateValueAndVelocity.mValue;
        this.mValue = f;
        float f2 = updateValueAndVelocity.mVelocity;
        this.mVelocity = f2;
        float f3 = this.mMinValue;
        if (f < f3) {
            this.mValue = f3;
            return true;
        }
        float f4 = this.mMaxValue;
        if (f <= f4) {
            return isAtEquilibrium(f, f2);
        }
        this.mValue = f4;
        return true;
    }

    public <K> FlingAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }
}
