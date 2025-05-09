package tb;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.Utils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class srj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_TYPE_2G = 2;
    public static final int NET_TYPE_3G = 3;
    public static final int NET_TYPE_4G = 4;
    public static final int NET_TYPE_5G = 5;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 1;

    /* renamed from: a  reason: collision with root package name */
    public static int f28231a;
    public static volatile Context b;
    public static String c;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196eec1f", new Object[0]);
        } else if (b != null) {
            try {
                f28231a = g();
            } catch (Exception unused) {
            }
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("652ec3f3", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(str);
            }
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                } else {
                    int indexOf2 = str.indexOf("#");
                    if (indexOf2 != -1) {
                        str = str.substring(0, indexOf2);
                    }
                }
                return str;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static Context c() {
        if (b != null) {
            return b;
        }
        b = GlobalAppRuntimeInfo.getContext();
        if (b == null) {
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                b = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return b;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f431b9", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            c = Utils.getMainProcessName(b);
        }
        return c;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue();
        }
        return GlobalAppRuntimeInfo.getCurrentProcess().contains(":channel");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        try {
            c = Utils.getMainProcessName(b);
            String processName = SceneIdentifier.getProcessName();
            if (TextUtils.isEmpty(c) || TextUtils.isEmpty(processName)) {
                return true;
            }
            return processName.equalsIgnoreCase(c);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r3.equals("3G") == false) goto L_0x0039;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g() {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.srj.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            r5 = 0
            if (r4 == 0) goto L_0x0019
            java.lang.String r0 = "987d61c7"
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r0 = r3.ipc$dispatch(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0019:
            anet.channel.status.NetworkStatusHelper$NetworkStatus r3 = anet.channel.status.NetworkStatusHelper.getStatus()
            boolean r4 = r3.isWifi()
            if (r4 == 0) goto L_0x0024
            return r2
        L_0x0024:
            boolean r4 = r3.isMobile()
            if (r4 == 0) goto L_0x006d
            java.lang.String r3 = r3.getType()
            r3.hashCode()
            r4 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 1621: goto L_0x005a;
                case 1652: goto L_0x0051;
                case 1683: goto L_0x0046;
                case 1714: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r2 = -1
            goto L_0x0064
        L_0x003b:
            java.lang.String r2 = "5G"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0044
            goto L_0x0039
        L_0x0044:
            r2 = 3
            goto L_0x0064
        L_0x0046:
            java.lang.String r2 = "4G"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            r2 = 2
            goto L_0x0064
        L_0x0051:
            java.lang.String r6 = "3G"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0064
            goto L_0x0039
        L_0x005a:
            java.lang.String r2 = "2G"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0063
            goto L_0x0039
        L_0x0063:
            r2 = 0
        L_0x0064:
            switch(r2) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006b;
                case 2: goto L_0x006a;
                case 3: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x006d
        L_0x0068:
            r0 = 5
            return r0
        L_0x006a:
            r0 = 4
        L_0x006b:
            return r0
        L_0x006c:
            return r1
        L_0x006d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.srj.g():int");
    }

    public static String[] h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab942fa6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("_");
    }
}
