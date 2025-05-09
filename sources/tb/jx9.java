package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBMainLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f22267a;
    public static SharedPreferences b;

    static {
        t2o.a(775946362);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("609fd215", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        b = c(context).getSharedPreferences("homepage_fragment_sp", 0);
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a6e6e1c", new Object[]{context})).booleanValue();
        }
        Boolean bool = f22267a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b == null && !a(context)) {
            return false;
        }
        f22267a = Boolean.valueOf(b.getBoolean("isFragmentOpenByHomePage", false));
        TBMainLog.tlog("FragmentSPStorage", "is Fragment open by home page : " + f22267a);
        return f22267a.booleanValue();
    }

    public static Context c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("295babf3", new Object[]{context});
        }
        if (context instanceof Activity) {
            return context.getApplicationContext();
        }
        return context;
    }
}
