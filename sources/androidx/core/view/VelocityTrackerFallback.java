package androidx.core.view;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class VelocityTrackerFallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    private void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2598bb7", new Object[]{this})).floatValue();
        }
        int i = this.mDataPointsBufferSize;
        float f = 0.0f;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.mDataPointsBufferLastUsedIndex;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.mEventTimes[i2];
        while (true) {
            jArr = this.mEventTimes;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.mDataPointsBufferSize--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.mDataPointsBufferSize;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            long j3 = jArr[i5];
            if (j == j3) {
                return 0.0f;
            }
            return this.mMovements[i5] / ((float) (j3 - j));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.mDataPointsBufferSize - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.mEventTimes;
            long j4 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j4) {
                i6++;
                float kineticEnergyToVelocity = kineticEnergyToVelocity(f);
                float f2 = this.mMovements[i9] / ((float) (this.mEventTimes[i9] - j4));
                f += (f2 - kineticEnergyToVelocity) * Math.abs(f2);
                if (i6 == 1) {
                    f *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(f);
    }

    private static float kineticEnergyToVelocity(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78e1bf90", new Object[]{new Float(f)})).floatValue();
        }
        if (f < 0.0f) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        return f2 * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void computeCurrentVelocity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd421e7d", new Object[]{this, new Integer(i)});
        } else {
            computeCurrentVelocity(i, Float.MAX_VALUE);
        }
    }

    public float getAxisVelocity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("923ac1b8", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (i != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    public void addMovement(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e61c4c", new Object[]{this, motionEvent});
            return;
        }
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > ASSUME_POINTER_STOPPED_MS) {
            clear();
        }
        int i = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i;
        int i2 = this.mDataPointsBufferSize;
        if (i2 != 20) {
            this.mDataPointsBufferSize = i2 + 1;
        }
        this.mMovements[i] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    public void computeCurrentVelocity(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0218e3", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        float currentVelocity = getCurrentVelocity() * i;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.mLastComputedVelocity = -Math.abs(f);
        } else if (this.mLastComputedVelocity > Math.abs(f)) {
            this.mLastComputedVelocity = Math.abs(f);
        }
    }
}
