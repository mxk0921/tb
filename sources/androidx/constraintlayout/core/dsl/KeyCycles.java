package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyCycles extends KeyAttributes {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Wave mWaveShape = null;
    private float[] mWavePeriod = null;
    private float[] mWaveOffset = null;
    private float[] mWavePhase = null;

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
            return ipChange instanceof IpChange ? (Wave[]) ipChange.ipc$dispatch("310b9da4", new Object[0]) : new Wave[]{SIN, SQUARE, TRIANGLE, SAW, REVERSE_SAW, COS};
        }

        private Wave(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Wave wave, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyCycles$Wave");
        }

        public static Wave valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wave) ipChange.ipc$dispatch("ec2e6f59", new Object[]{str});
            }
            return (Wave) Enum.valueOf(Wave.class, str);
        }

        public static Wave[] values() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Wave[]) ipChange.ipc$dispatch("5843eb48", new Object[0]);
            }
            return (Wave[]) $VALUES.clone();
        }
    }

    public KeyCycles(int i, String... strArr) {
        super(i, strArr);
        this.TYPE = "KeyCycle";
    }

    public static /* synthetic */ Object ipc$super(KeyCycles keyCycles, String str, Object... objArr) {
        if (str.hashCode() == 704184193) {
            super.attributesToString((StringBuilder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/KeyCycles");
    }

    @Override // androidx.constraintlayout.core.dsl.KeyAttributes
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

    public float[] getWaveOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("e4890d98", new Object[]{this});
        }
        return this.mWaveOffset;
    }

    public float[] getWavePeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("5f3e892a", new Object[]{this});
        }
        return this.mWavePeriod;
    }

    public float[] getWavePhase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("f7e6516e", new Object[]{this});
        }
        return this.mWavePhase;
    }

    public Wave getWaveShape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Wave) ipChange.ipc$dispatch("a3dd5c99", new Object[]{this});
        }
        return this.mWaveShape;
    }

    public void setWaveOffset(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50aba300", new Object[]{this, fArr});
        } else {
            this.mWaveOffset = fArr;
        }
    }

    public void setWavePeriod(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca599ae", new Object[]{this, fArr});
        } else {
            this.mWavePeriod = fArr;
        }
    }

    public void setWavePhase(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd0de52", new Object[]{this, fArr});
        } else {
            this.mWavePhase = fArr;
        }
    }

    public void setWaveShape(Wave wave) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ba6c63", new Object[]{this, wave});
        } else {
            this.mWaveShape = wave;
        }
    }
}
