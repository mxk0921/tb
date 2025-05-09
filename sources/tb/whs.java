package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class whs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f30705a = null;
    public static String b = null;
    public static boolean c = false;
    public static boolean d = false;

    static {
        t2o.a(473956399);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aac9ec2", new Object[0]);
        }
        if (b == null && !d) {
            d = true;
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e == null) {
                return b;
            }
            b = e.getString("clientAbNdAnimFeatureList", null);
        }
        return b;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c446f6ed", new Object[0]);
        }
        if (f30705a == null && !c) {
            c = true;
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e == null) {
                return f30705a;
            }
            f30705a = e.getString(i2b.KEY_ND_LOW_FEATURE_LIST, null);
        }
        return f30705a;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3866415c", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7529", new Object[]{str});
        } else {
            f30705a = str;
        }
    }
}
