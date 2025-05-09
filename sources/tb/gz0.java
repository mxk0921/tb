package tb;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_DURATION = 300;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f20321a;

    static {
        t2o.a(503317402);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6fcf56", new Object[]{view});
        } else if (view == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                view.resetPivot();
                return;
            }
            view.setPivotX(view.getMeasuredWidth() / 2.0f);
            view.setPivotY(view.getMeasuredHeight() / 2.0f);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        if (f20321a == null) {
            Context J = o.J();
            if (!(od0.D().i() == null || od0.D().i().m(J) == null)) {
                if (od0.D().i().m(J).getIntValue("deviceLevel") == 2) {
                    z = true;
                }
                f20321a = Boolean.valueOf(z);
            }
        }
        return f20321a.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r9.equals("bottom") == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Animation b(java.lang.String r9) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gz0.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "ab1e6cdb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            java.lang.Object r9 = r2.ipc$dispatch(r3, r1)
            android.view.animation.Animation r9 = (android.view.animation.Animation) r9
            return r9
        L_0x0015:
            r9.hashCode()
            r7 = 1
            r2 = -1
            int r3 = r9.hashCode()
            switch(r3) {
                case -1383228885: goto L_0x0047;
                case 115029: goto L_0x003b;
                case 3317767: goto L_0x002f;
                case 108511772: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0 = -1
            goto L_0x0050
        L_0x0023:
            java.lang.String r0 = "right"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0 = 3
            goto L_0x0050
        L_0x002f:
            java.lang.String r0 = "left"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0039
            goto L_0x0021
        L_0x0039:
            r0 = 2
            goto L_0x0050
        L_0x003b:
            java.lang.String r0 = "top"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0045
            goto L_0x0021
        L_0x0045:
            r0 = 1
            goto L_0x0050
        L_0x0047:
            java.lang.String r1 = "bottom"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0073;
                case 2: goto L_0x0064;
                case 3: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            r9 = 0
            goto L_0x0090
        L_0x0055:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r6 = 0
            r8 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r9
            r1 = r7
            r3 = r7
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0090
        L_0x0064:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r6 = 0
            r8 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r0 = r9
            r1 = r7
            r3 = r7
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0090
        L_0x0073:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 0
            r2 = 0
            r4 = 0
            r0 = r9
            r1 = r7
            r3 = r7
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0090
        L_0x0082:
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r2 = 0
            r4 = 0
            r0 = r9
            r1 = r7
            r3 = r7
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0090:
            if (r9 == 0) goto L_0x0097
            r0 = 300(0x12c, double:1.48E-321)
            r9.setDuration(r0)
        L_0x0097:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gz0.b(java.lang.String):android.view.animation.Animation");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r11.equals("bottom") == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Animation c(java.lang.String r11) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gz0.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "914b57ba"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Object r11 = r2.ipc$dispatch(r3, r1)
            android.view.animation.Animation r11 = (android.view.animation.Animation) r11
            return r11
        L_0x0015:
            r11.hashCode()
            r9 = 1
            r2 = -1
            int r3 = r11.hashCode()
            switch(r3) {
                case -1383228885: goto L_0x0047;
                case 115029: goto L_0x003b;
                case 3317767: goto L_0x002f;
                case 108511772: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0 = -1
            goto L_0x0050
        L_0x0023:
            java.lang.String r0 = "right"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0 = 3
            goto L_0x0050
        L_0x002f:
            java.lang.String r0 = "left"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0039
            goto L_0x0021
        L_0x0039:
            r0 = 2
            goto L_0x0050
        L_0x003b:
            java.lang.String r0 = "top"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x0045
            goto L_0x0021
        L_0x0045:
            r0 = 1
            goto L_0x0050
        L_0x0047:
            java.lang.String r3 = "bottom"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            switch(r0) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0073;
                case 2: goto L_0x0064;
                case 3: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            r11 = 0
            goto L_0x0090
        L_0x0055:
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r11
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0090
        L_0x0064:
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r11
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0090
        L_0x0073:
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r6 = 0
            r2 = r11
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0090
        L_0x0082:
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r6 = 0
            r2 = r11
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0090:
            if (r11 == 0) goto L_0x009a
            r2 = 300(0x12c, double:1.48E-321)
            r11.setDuration(r2)
            r11.setFillAfter(r1)
        L_0x009a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gz0.c(java.lang.String):android.view.animation.Animation");
    }
}
