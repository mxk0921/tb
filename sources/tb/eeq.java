package tb;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eeq implements Interpolator, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f18518a;
    public final float b;
    public final boolean c;
    public float[] d;

    static {
        t2o.a(511705525);
    }

    public eeq(float f, float f2, boolean z) {
        this.f18518a = f;
        this.b = f2;
        this.c = z;
        b();
    }

    /* renamed from: a */
    public eeq clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eeq) ipChange.ipc$dispatch("d36d5b01", new Object[]{this});
        }
        try {
            return (eeq) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        float[] fArr = new float[1000];
        this.d = fArr;
        Arrays.fill(fArr, -1.0f);
        float[] fArr2 = this.d;
        fArr2[0] = 0.0f;
        fArr2[999] = 1.0f;
        for (int i = 0; i < 10000; i++) {
            PointF d = d(this.f18518a, this.b, i / 9999.0f);
            float f = d.x;
            if (f > 0.0f && f < 1.0f) {
                int i2 = (int) (f * 999.0f);
                float[] fArr3 = this.d;
                if (fArr3[i2] < 0.0f) {
                    fArr3[i2] = d.y;
                }
            }
        }
        for (int i3 = 0; i3 < 1000; i3++) {
            if (this.d[i3] < 0.0f) {
                int i4 = 1;
                for (int i5 = i3 + 1; i5 < 1000 && this.d[i5] < 0.0f; i5++) {
                    i4++;
                }
                float[] fArr4 = this.d;
                float f2 = fArr4[i3 + i4];
                int i6 = i3 - 1;
                float f3 = fArr4[i6];
                if (f2 == f3) {
                    for (int i7 = 0; i7 < i4; i7++) {
                        float[] fArr5 = this.d;
                        fArr5[i3 + i7] = fArr5[i6];
                    }
                } else {
                    float f4 = (f2 - f3) / i4;
                    int i8 = 0;
                    while (i8 < i4) {
                        float[] fArr6 = this.d;
                        int i9 = i3 + i8;
                        i8++;
                        fArr6[i9] = fArr6[i6] + (i8 * f4);
                    }
                }
            }
        }
    }

    public float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3faa61ab", new Object[]{this, new Float(f)})).floatValue();
        }
        return ((float) Math.log(1.0f + f)) * ((f / 200.0f) + 1.5f);
    }

    public PointF d(float f, float f2, float f3) {
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("e3de5f63", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        PointF pointF = new PointF();
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f4 = f3;
        } else {
            f4 = 0.001f;
        }
        float f6 = 0.7f;
        pointF.x = f3 * 0.7f * 2.0f;
        float f7 = f - 1.0f;
        if (f >= 1.0f) {
            f6 = 1.0f / c(f);
        }
        float sin = ((float) Math.sin(((f3 * 2.0f) * ((f7 * f6) + 1.0f)) - 1.5707964f)) / ((f2 * ((float) Math.pow(7.0f * f4, (((float) Math.pow(f4, 4.0d)) * 10.0f) + 2.0f))) + 2.0f);
        if (!this.c || Math.abs(sin) >= 0.003f) {
            f5 = sin;
        }
        pointF.y = (f5 * 2.0f) + 1.0f;
        return pointF;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        return this.d[(int) (f * 999.0f)];
    }
}
