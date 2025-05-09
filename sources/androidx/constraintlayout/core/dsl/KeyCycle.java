package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyCycle extends KeyAttribute {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "KeyCycle";
    private Wave mWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = Float.NaN;
    private float mWavePhase = Float.NaN;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Wave extends Enum<Wave> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Wave SIN = new Wave("SIN", 0);
        public static final Wave SQUARE = new Wave("SQUARE", 1);
        public static final Wave TRIANGLE = new Wave("TRIANGLE", 2);
        public static final Wave SAW = new Wave("SAW", 3);
        public static final Wave REVERSE_SAW = new Wave("REVERSE_SAW", 4);
        public static final Wave COS = new Wave("COS", 5);
        private static final /* synthetic */ Wave[] $VALUES = $values();

        private static /* synthetic */ Wave[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Wave[]) ipChange.ipc$dispatch("43cb3f6b", new Object[0]) : new Wave[]{SIN, SQUARE, TRIANGLE, SAW, REVERSE_SAW, COS};
        }

        private Wave(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Wave wave, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyCycle$Wave");
        }

        public static Wave valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wave) ipChange.ipc$dispatch("6adce316", new Object[]{str});
            }
            return (Wave) Enum.valueOf(Wave.class, str);
        }

        public static Wave[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wave[]) ipChange.ipc$dispatch("b40ad47", new Object[0]);
            }
            return (Wave[]) $VALUES.clone();
        }
    }

    public KeyCycle(int i, String str) {
        super(i, str);
        this.TYPE = "KeyCycle";
    }

    public static /* synthetic */ Object ipc$super(KeyCycle keyCycle, String str, Object... objArr) {
        if (str.hashCode() == 704184193) {
            super.attributesToString((StringBuilder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyCycle");
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttribute
    public void attributesToString(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f8ff81", new Object[]{this, sb});
            return;
        }
        super.attributesToString(sb);
        if (this.mWaveShape != null) {
            sb.append("shape:'");
            sb.append(this.mWaveShape);
            sb.append("',\n");
        }
        append(sb, TypedValues.CycleType.S_WAVE_PERIOD, this.mWavePeriod);
        append(sb, "offset", this.mWaveOffset);
        append(sb, TypedValues.CycleType.S_WAVE_PHASE, this.mWavePhase);
    }

    public float getOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f80", new Object[]{this})).floatValue();
        }
        return this.mWaveOffset;
    }

    public float getPeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("516e9ae", new Object[]{this})).floatValue();
        }
        return this.mWavePeriod;
    }

    public float getPhase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5f6c9bc", new Object[]{this})).floatValue();
        }
        return this.mWavePhase;
    }

    public Wave getShape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Wave) ipChange.ipc$dispatch("4793e2fd", new Object[]{this});
        }
        return this.mWaveShape;
    }

    public void setOffset(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976ada4", new Object[]{this, new Float(f)});
        } else {
            this.mWaveOffset = f;
        }
    }

    public void setPeriod(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c2936", new Object[]{this, new Float(f)});
        } else {
            this.mWavePeriod = f;
        }
    }

    public void setPhase(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7072580", new Object[]{this, new Float(f)});
        } else {
            this.mWavePhase = f;
        }
    }

    public void setShape(Wave wave) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2f46ff", new Object[]{this, wave});
        } else {
            this.mWaveShape = wave;
        }
    }
}
