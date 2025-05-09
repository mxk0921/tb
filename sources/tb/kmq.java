package tb;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kmq implements Interpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TERM_BOTH = 3;
    public static final int TERM_END = 1;
    public static final int TERM_NONE = 2;
    public static final int TERM_START = 0;

    /* renamed from: a  reason: collision with root package name */
    public final float[] f22767a;
    public final float[] b;

    static {
        t2o.a(986710063);
    }

    public kmq(int i, int i2) {
        int i3;
        this.b = new float[i];
        float f = 1.0f / i;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i3 = i + 1;
            if (i5 >= i3) {
                break;
            }
            this.b[i5 - 1] = i5 * f;
            i5++;
        }
        this.f22767a = new float[i];
        if (i2 == 1) {
            for (int i6 = 1; i6 < i3; i6++) {
                this.f22767a[i6 - 1] = i6 * f;
            }
            this.f22767a[i - 1] = 1.0f;
        } else if (i2 == 2) {
            float f2 = 1.0f / i3;
            while (i4 < i3) {
                this.f22767a[i4 - 1] = i4 * f2;
                i4++;
            }
        } else if (i2 != 3) {
            for (int i7 = 0; i7 < i; i7++) {
                this.f22767a[i7] = i7 * f;
            }
            this.f22767a[0] = 0.0f;
        } else {
            int i8 = i - 1;
            float f3 = 1.0f / i8;
            while (i4 < i3) {
                this.f22767a[i4 - 1] = i4 * f3;
                i4++;
            }
            float[] fArr = this.f22767a;
            fArr[0] = 0.0f;
            fArr[i8] = 1.0f;
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        int i2 = 0;
        while (true) {
            float[] fArr = this.b;
            if (i2 >= fArr.length) {
                break;
            } else if (f <= fArr[i2]) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return this.f22767a[i];
    }
}
