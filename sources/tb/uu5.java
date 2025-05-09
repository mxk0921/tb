package tb;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EASE_IN = "EaseIn";
    public static final String EASE_IN_OUT = "EaseInOut";
    public static final String EASE_OUT = "EaseOut";
    public static final String FAST_OUT_SLOW_IN_EASING = "FastOutSlowInEasing";
    public static final String LINEAR_EASING = "LinearEasing";

    static {
        t2o.a(444597771);
    }

    public static TimeInterpolator a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("ea706047", new Object[]{obj});
        }
        if (obj instanceof String) {
            return b((String) obj);
        }
        if (obj instanceof TimeInterpolator) {
            return (TimeInterpolator) obj;
        }
        return d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r4.equals(tb.uu5.EASE_IN_OUT) == false) goto L_0x002b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.TimeInterpolator b(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.uu5.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "9e7e5770"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            android.animation.TimeInterpolator r4 = (android.animation.TimeInterpolator) r4
            return r4
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0020
            android.animation.TimeInterpolator r4 = d()
            return r4
        L_0x0020:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -960369541: goto L_0x0059;
                case -300434336: goto L_0x004e;
                case 786474531: goto L_0x0043;
                case 926702800: goto L_0x0038;
                case 2068518355: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x0062
        L_0x002d:
            java.lang.String r0 = "EaseIn"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r0 = 4
            goto L_0x0062
        L_0x0038:
            java.lang.String r0 = "LinearEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r0 = 3
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "FastOutSlowInEasing"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r0 = 2
            goto L_0x0062
        L_0x004e:
            java.lang.String r0 = "EaseOut"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r0 = 1
            goto L_0x0062
        L_0x0059:
            java.lang.String r1 = "EaseInOut"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0079;
                case 2: goto L_0x0074;
                case 3: goto L_0x006f;
                case 4: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            android.animation.TimeInterpolator r4 = d()
            return r4
        L_0x006a:
            android.animation.TimeInterpolator r4 = e()
            return r4
        L_0x006f:
            android.animation.TimeInterpolator r4 = i()
            return r4
        L_0x0074:
            android.animation.TimeInterpolator r4 = h()
            return r4
        L_0x0079:
            android.animation.TimeInterpolator r4 = g()
            return r4
        L_0x007e:
            android.animation.TimeInterpolator r4 = f()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uu5.b(java.lang.String):android.animation.TimeInterpolator");
    }

    public static TimeInterpolator c(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("616e10b", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        return PathInterpolatorCompat.create(f, f2, f3, f4);
    }

    public static TimeInterpolator d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("42243713", new Object[0]);
        }
        return h();
    }

    public static TimeInterpolator e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("d8c8324c", new Object[0]);
        }
        return c(0.42f, 0.0f, 1.0f, 1.0f);
    }

    public static TimeInterpolator f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("4cce9a64", new Object[0]);
        }
        return c(0.42f, 0.0f, 0.58f, 1.0f);
    }

    public static TimeInterpolator g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("5903dadf", new Object[0]);
        }
        return c(0.0f, 0.0f, 0.58f, 1.0f);
    }

    public static TimeInterpolator h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("51f67bbc", new Object[0]);
        }
        return new FastOutSlowInInterpolator();
    }

    public static TimeInterpolator i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("e576a0af", new Object[0]);
        }
        return new LinearInterpolator();
    }
}
