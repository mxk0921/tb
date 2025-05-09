package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bcu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TagTracker";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16322a = false;

    static {
        t2o.a(455082040);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            d();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else if (d()) {
            Log.e(TAG, str);
        }
    }

    public static void c() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        p65 p65Var = new p65();
        if (!jg8.a().b()) {
            z = p65Var.g();
        } else {
            z = true;
        }
        e(z);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[0])).booleanValue();
        }
        return f16322a;
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719d078b", new Object[]{new Boolean(z)});
        } else {
            f16322a = z;
        }
    }
}
