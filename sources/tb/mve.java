package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ifc f24331a;

    static {
        t2o.a(486539291);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        ifc ifcVar = f24331a;
        if (ifcVar == null) {
            fve.e("InfoFlowOrangeConfig", "getBooleanValue is null");
            return z;
        }
        try {
            return ifcVar.getBooleanValue(str, z);
        } catch (Throwable th) {
            fve.c("InfoFlowOrangeConfig", "getBooleanValue error", th);
            return z;
        }
    }

    public static float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{str, new Float(f)})).floatValue();
        }
        ifc ifcVar = f24331a;
        if (ifcVar == null) {
            fve.e("InfoFlowOrangeConfig", "getFloatValue is null");
            return f;
        }
        try {
            return ifcVar.getFloatValue(str, f);
        } catch (Throwable th) {
            fve.c("InfoFlowOrangeConfig", "getFloatValue error", th);
            return f;
        }
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{str, new Integer(i)})).intValue();
        }
        ifc ifcVar = f24331a;
        if (ifcVar == null) {
            fve.e("InfoFlowOrangeConfig", "getIntValue is null");
            return i;
        }
        try {
            return ifcVar.getIntValue(str, i);
        } catch (Throwable th) {
            fve.c("InfoFlowOrangeConfig", "getIntValue error", th);
            return i;
        }
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        ifc ifcVar = f24331a;
        if (ifcVar == null) {
            fve.e("InfoFlowOrangeConfig", "getString is null");
            return str2;
        }
        try {
            return ifcVar.getString(str, str2);
        } catch (Throwable th) {
            fve.c("InfoFlowOrangeConfig", "getString error", th);
            return str2;
        }
    }

    public static void e(ifc ifcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aba81b", new Object[]{ifcVar});
        } else {
            f24331a = ifcVar;
        }
    }
}
