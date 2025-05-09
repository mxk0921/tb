package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.statistics.sec.UMIDToken;
import com.taobao.dp.DeviceSecuritySDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ydh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32003a = true;
    public static boolean b = true;
    public static boolean c = false;
    public static String d = "";
    public static boolean e = false;

    static {
        t2o.a(962592893);
    }

    public static String a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f360865", new Object[]{context});
        }
        try {
            IpChange ipChange2 = DeviceSecuritySDK.$ipChange;
            Object d2 = ztn.d(DeviceSecuritySDK.class, "getInstance", new Object[]{context}, Context.class);
            if (d2 == null) {
                return null;
            }
            Object a2 = ztn.a(d2, "getSecurityToken");
            if (a2 != null) {
                str = (String) a2;
            } else {
                str = "";
            }
            nhh.f("LogAssembleHelper", "_getUmidTokenBySecurity", str);
            return b(str);
        } catch (Exception unused) {
            b = false;
            return null;
        }
    }

    public static String c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51da1ec5", new Object[0]);
        }
        try {
            IpChange ipChange2 = UMIDToken.$ipChange;
            Object c2 = ztn.c(UMIDToken.class, "getSecurityToken");
            if (c2 != null) {
                str = (String) c2;
            } else {
                str = "";
            }
            nhh.f("LogAssembleHelper", "_getUmidTokenByTaobao", str);
            return b(str);
        } catch (Exception unused) {
            f32003a = false;
            return null;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfc99bec", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (!e) {
                if (str.equalsIgnoreCase(d)) {
                    iaq.b(vyp.i().g(), "_utk", str);
                }
                e = true;
            }
            return str;
        }
        if (!c) {
            String a2 = iaq.a(vyp.i().g(), "_utk");
            if (!TextUtils.isEmpty(a2)) {
                d = a2;
            }
            c = true;
        }
        if (TextUtils.isEmpty(d)) {
            return "utdid";
        }
        nhh.f("LogAssembleHelper", "_getUmidTokenBySp", d);
        return d;
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11405f42", new Object[]{context});
        }
        nhh.f("LogAssembleHelper", "mTaobaoUMIDGetSwitch", Boolean.valueOf(f32003a), "mUMIDGetSwitch", Boolean.valueOf(b));
        String c2 = f32003a ? c() : null;
        return (f32003a || !b || context == null) ? c2 : a(context);
    }
}
