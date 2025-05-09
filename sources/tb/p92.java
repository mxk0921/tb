package tb;

import android.animation.TimeInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p92 implements TimeInterpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f25956a;
    public final float b;
    public final float c;
    public final float d;

    static {
        t2o.a(310378591);
    }

    public p92(float f, float f2, float f3, float f4) {
        this.f25956a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public float a(float f, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad99bb8a", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5)})).floatValue();
        }
        int i = 10;
        float f6 = 0.0f;
        float f7 = 1.0f;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return b(f2, f4, (f7 + f6) / 2.0f);
            }
            float f8 = (f6 + f7) / 2.0f;
            if (b(f, f3, f8) > f5) {
                f7 = f8;
            } else {
                f6 = f8;
            }
            i = i2;
        }
    }

    public float b(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daabc586", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float f4 = 1.0f - f3;
        float f5 = f3 * f4 * f4 * f;
        float f6 = f3 * f3;
        return ((f5 + (f4 * f6 * f2)) * 3.0f) + (f6 * f3);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        return a(this.f25956a, this.b, this.c, this.d, f);
    }
}
