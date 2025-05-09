package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30770a;

    static {
        t2o.a(329252920);
    }

    public wls(String str) {
        this.f30770a = c(str);
    }

    public static wls d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wls) ipChange.ipc$dispatch("70f48d47", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@os.")) {
            return new wls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(wls wlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/device/TSOsExpression");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r8.equals("@os.cpuNums") == false) goto L_0x002f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 3
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 2
            com.android.alibaba.ip.runtime.IpChange r5 = tb.wls.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.String r0 = "d974e34"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.Object r8 = r5.ipc$dispatch(r0, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            return r8
        L_0x001e:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L_0x0025
            return r1
        L_0x0025:
            r8.hashCode()
            int r5 = r8.hashCode()
            switch(r5) {
                case -1527361109: goto L_0x0052;
                case -105064104: goto L_0x0047;
                case 870169311: goto L_0x003c;
                case 2133706510: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r2 = -1
            goto L_0x005b
        L_0x0031:
            java.lang.String r2 = "@os.version"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x003a
            goto L_0x002f
        L_0x003a:
            r2 = 3
            goto L_0x005b
        L_0x003c:
            java.lang.String r2 = "@os.model"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0045
            goto L_0x002f
        L_0x0045:
            r2 = 2
            goto L_0x005b
        L_0x0047:
            java.lang.String r2 = "@os.cpuMaxHz"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0050
            goto L_0x002f
        L_0x0050:
            r2 = 1
            goto L_0x005b
        L_0x0052:
            java.lang.String r5 = "@os.cpuNums"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x005b
            goto L_0x002f
        L_0x005b:
            switch(r2) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0061;
                case 2: goto L_0x0060;
                case 3: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            return r1
        L_0x005f:
            return r3
        L_0x0060:
            return r4
        L_0x0061:
            r8 = 4
            return r8
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wls.c(java.lang.String):int");
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        int i = this.f30770a;
        if (i <= 0) {
            return null;
        }
        if (i == 1) {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
        if (i == 2) {
            return Build.MODEL;
        }
        if (i == 3) {
            return oms.b();
        }
        if (i != 4) {
            return null;
        }
        return oms.a();
    }
}
