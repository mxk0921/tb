package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jl1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int g;
    public static int h;
    public static Boolean i;
    public static Boolean j;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22049a;
    public boolean b;
    public int c;
    public int d;
    public final float e;
    public float f = 0.0f;

    static {
        t2o.a(626000037);
    }

    public jl1(Context context, boolean z, boolean z2) {
        float f = 0.463f;
        this.e = 0.463f;
        if (z2) {
            if (i == null) {
                i = Boolean.valueOf(TBDeviceUtils.P(context));
            }
            if (j == null) {
                j = Boolean.valueOf(TBDeviceUtils.p(context));
            }
            if (i.booleanValue() || j.booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            float bigScreenAspectRatio = jd0.c().a().getBigScreenAspectRatio();
            this.e = bigScreenAspectRatio > 0.0f ? bigScreenAspectRatio : f;
        } else {
            Boolean bool = Boolean.FALSE;
            i = bool;
            j = bool;
        }
        this.b = z;
        this.f22049a = z2;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a39d8ea", new Object[]{this})).floatValue();
        }
        float f = this.f;
        if (f > 0.0f) {
            return f;
        }
        float f2 = this.c / (this.e * this.d);
        this.f = 750.0f * f2;
        wdm.g("pageLifeCycle", "", "AutoSize.getBigScreenModel.mBigScreenModel=" + this.f + ".autoSizeRatio=" + f2 + ".mDisplayWidth=" + this.c + ".mDisplayHeight=" + this.d + ".mBigScreenAspectRatio=" + this.e);
        return this.f;
    }

    public final Pair<Integer, Integer> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a1364ade", new Object[]{this, context});
        }
        if (!this.f22049a) {
            if (g > 0 && h > 0) {
                return new Pair<>(Integer.valueOf(g), Integer.valueOf(h));
            }
        } else if (this.c > 0 && this.d > 0) {
            return new Pair<>(Integer.valueOf(this.c), Integer.valueOf(this.d));
        }
        if (context != null) {
            g = context.getResources().getDisplayMetrics().widthPixels;
            h = context.getResources().getDisplayMetrics().heightPixels;
            this.c = context.getResources().getDisplayMetrics().widthPixels;
            this.d = context.getResources().getDisplayMetrics().heightPixels;
        }
        wdm.g("pageLifeCycle", "", "AutoSize.getScreenSize.mScreenWidth=" + this.c + ".mScreenHeight=" + this.d);
        return new Pair<>(Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public float c(Context context, float f) {
        float intValue;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6885ccb4", new Object[]{this, context, new Float(f)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        Pair<Integer, Integer> b = b(context);
        if (this.f22049a) {
            intValue = f * ((Integer) b.first).intValue();
            f2 = a();
        } else {
            intValue = f * ((Integer) b.first).intValue();
            f2 = 750.0f;
        }
        float f3 = intValue / f2;
        double d = f3;
        if (d <= 0.005d || f3 >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public boolean d(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca4203b7", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!this.f22049a) {
            return false;
        }
        if (z != this.b) {
            this.b = z;
            z2 = true;
        }
        DisplayMetrics displayMetrics = PopLayer.getReference().getApp().getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i2 == this.c && i3 == this.d) {
            return z2;
        }
        this.c = i2;
        this.d = i3;
        this.f = 0.0f;
        return true;
    }
}
