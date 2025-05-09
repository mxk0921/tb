package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class li2 extends h5k<li2> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Path[] f23350a = new Path[4];
    public final Path[] b = new Path[4];
    public final BorderProp c;

    static {
        t2o.a(986710129);
    }

    public li2(BorderProp borderProp) {
        this.c = borderProp;
    }

    public static /* synthetic */ Object ipc$super(li2 li2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/border/BorderClipInfo");
    }

    public int a(Canvas canvas, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bafb4e94", new Object[]{this, canvas, new Integer(i)})).intValue();
        }
        Path c = c(i);
        Path d = d(i);
        if (d != null) {
            i2 = canvas.save();
            canvas.clipPath(d);
        } else {
            i2 = -1;
        }
        if (c != null) {
            if (i2 == -1) {
                i2 = canvas.save();
            }
            canvas.clipPath(c);
        }
        return i2;
    }

    public void b(li2 li2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04ec37b", new Object[]{this, li2Var});
            return;
        }
        for (int i = 0; i < 4; i++) {
            this.f23350a[i] = li2Var.f23350a[i];
            this.b[i] = li2Var.b[i];
        }
    }

    public Path c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("772528b2", new Object[]{this, new Integer(i)});
        }
        return this.b[i];
    }

    public final Path d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("e00692a9", new Object[]{this, new Integer(i)});
        }
        if (i == 4) {
            return null;
        }
        return this.f23350a[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.li2.e(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r10, int r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.li2.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0022
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r10)
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r2] = r9
            r11[r1] = r5
            r11[r0] = r10
            java.lang.String r10 = "a919371a"
            r4.ipc$dispatch(r10, r11)
            return
        L_0x0022:
            boolean r4 = r9.i(r3, r2, r1)
            if (r4 != 0) goto L_0x002d
            r10 = 0
            r9.j(r2, r10)
            return
        L_0x002d:
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r9.c
            int r0 = r4.g(r0)
            float r0 = (float) r0
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r9.c
            int r4 = r4.g(r2)
            float r4 = (float) r4
            com.taobao.android.weex_uikit.widget.border.BorderProp r5 = r9.c
            int r1 = r5.g(r1)
            float r1 = (float) r1
            com.taobao.android.weex_uikit.widget.border.BorderProp r5 = r9.c
            int r3 = r5.g(r3)
            float r3 = (float) r3
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            float r10 = (float) r10
            float r10 = r10 + r4
            int r10 = (int) r10
        L_0x0051:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            float r6 = (float) r11
            float r6 = r6 + r1
        L_0x0057:
            int r6 = (int) r6
            goto L_0x0061
        L_0x0059:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x0060
            float r6 = (float) r11
            float r6 = r6 + r3
            goto L_0x0057
        L_0x0060:
            r6 = r11
        L_0x0061:
            int r10 = java.lang.Math.min(r10, r6)
            float r10 = (float) r10
            r6 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r6
            tb.ki2 r6 = new tb.ki2
            r6.<init>()
            r6.e(r5, r5)
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x007d
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x007d
            r6.d(r5, r10)
            goto L_0x008f
        L_0x007d:
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x0089
            float r1 = r4 / r1
            float r1 = r1 * r10
            r6.d(r1, r10)
            goto L_0x008f
        L_0x0089:
            float r1 = r1 / r4
            float r1 = r1 * r10
            r6.d(r10, r1)
        L_0x008f:
            r6.c(r10, r10)
            float r11 = (float) r11
            r6.h(r5, r11)
            if (r7 != 0) goto L_0x00a0
            if (r0 != 0) goto L_0x00a0
            float r0 = r11 - r10
            r6.g(r5, r0)
            goto L_0x00b5
        L_0x00a0:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            float r4 = r4 / r3
            float r4 = r4 * r10
            float r0 = r11 - r10
            r6.g(r4, r0)
            goto L_0x00b5
        L_0x00ad:
            float r3 = r3 / r4
            float r3 = r3 * r10
            float r0 = r11 - r3
            r6.g(r10, r0)
        L_0x00b5:
            float r11 = r11 - r10
            r6.f(r10, r11)
            r9.j(r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.li2.f(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.li2.g(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r8, int r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.li2.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0022
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r2] = r7
            r9[r1] = r5
            r9[r0] = r8
            java.lang.String r8 = "1efa3408"
            r4.ipc$dispatch(r8, r9)
            return
        L_0x0022:
            boolean r4 = r7.i(r2, r1, r0)
            if (r4 != 0) goto L_0x002d
            r8 = 0
            r7.j(r1, r8)
            return
        L_0x002d:
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r7.c
            int r2 = r4.g(r2)
            float r2 = (float) r2
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r7.c
            int r4 = r4.g(r1)
            float r4 = (float) r4
            com.taobao.android.weex_uikit.widget.border.BorderProp r5 = r7.c
            int r0 = r5.g(r0)
            float r0 = (float) r0
            com.taobao.android.weex_uikit.widget.border.BorderProp r5 = r7.c
            int r3 = r5.g(r3)
            float r3 = (float) r3
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0051
            float r9 = (float) r9
            float r9 = r9 + r4
            int r9 = (int) r9
        L_0x0051:
            int r3 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0059
            float r6 = (float) r8
            float r6 = r6 + r0
        L_0x0057:
            int r6 = (int) r6
            goto L_0x0061
        L_0x0059:
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x0060
            float r6 = (float) r8
            float r6 = r6 + r2
            goto L_0x0057
        L_0x0060:
            r6 = r8
        L_0x0061:
            int r9 = java.lang.Math.min(r6, r9)
            float r9 = (float) r9
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r6
            tb.ki2 r6 = new tb.ki2
            r6.<init>()
            r6.e(r5, r5)
            if (r3 != 0) goto L_0x007b
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x007b
            r6.d(r9, r5)
            goto L_0x008d
        L_0x007b:
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0086
            float r2 = r2 / r4
            float r2 = r2 * r9
            r6.d(r2, r9)
            goto L_0x008d
        L_0x0086:
            float r2 = r4 / r2
            float r2 = r2 * r9
            r6.d(r9, r2)
        L_0x008d:
            r6.c(r9, r9)
            float r8 = (float) r8
            r6.h(r8, r5)
            int r2 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00a2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00a2
            float r0 = r8 - r9
            r6.g(r0, r5)
            goto L_0x00b7
        L_0x00a2:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00af
            float r2 = r8 - r9
            float r4 = r4 / r0
            float r4 = r4 * r9
            r6.g(r2, r4)
            goto L_0x00b7
        L_0x00af:
            float r0 = r0 * r9
            float r0 = r0 / r4
            float r0 = r8 - r0
            r6.g(r0, r9)
        L_0x00b7:
            float r8 = r8 - r9
            r6.f(r8, r9)
            r7.j(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.li2.h(int, int):void");
    }

    public final boolean i(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c2ad1ae", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (this.c.f(i) == this.c.f(i2) && this.c.f(i3) == this.c.f(i2) && this.c.f(i) == 0 && this.c.f(i2) == 0 && this.c.f(i3) == 0 && this.c.d(i) == this.c.d(i2) && this.c.d(i3) == this.c.d(i2) && Color.alpha(this.c.d(i2)) >= 255 && this.c.g(i) == this.c.g(i2) && this.c.g(i3) == this.c.g(i2)) {
            return false;
        }
        return true;
    }

    public final void j(int i, ki2 ki2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d517a841", new Object[]{this, new Integer(i), ki2Var});
        } else if (i != 4) {
            if (ki2Var == null) {
                this.b[i] = null;
                return;
            }
            this.b[i] = new Path();
            ki2Var.b(this.b[i]);
        }
    }

    public void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9f57a1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        f(i, i2);
        h(i, i2);
        g(i, i2);
        e(i, i2);
    }

    public void l(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3760a48f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f23350a[1] = ni2.h(this.c, i, i2);
        this.f23350a[2] = ni2.g(this.c, i, i2);
        this.f23350a[3] = ni2.a(this.c, i, i2);
        this.f23350a[0] = ni2.e(this.c, i, i2);
    }
}
