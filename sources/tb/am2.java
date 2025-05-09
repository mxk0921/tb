package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class am2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262749);
    }

    public static void a(Context context, ze7 ze7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2422f2dd", new Object[]{context, ze7Var, str});
        } else if (context != null && ze7Var != null) {
            Intent intent = new Intent(str);
            intent.putExtra("ACTIVITY_HASHCODE", context.hashCode());
            JSONObject g = g(ze7Var);
            if (g != null) {
                intent.putExtra("transparentBroadcast", g);
            }
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    public static void b(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28656614", new Object[]{context, ze7Var});
        } else {
            a(context, ze7Var, w6f.ACTION_NOTIFY_DETAIL_SLIDE_INTO_INFO);
        }
    }

    public static void c(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b635f7a8", new Object[]{context, ze7Var});
        } else {
            a(context, ze7Var, w6f.ACTION_NOTIFY_DETAIL_SLIDE_OUT_INFO);
        }
    }

    public static void d(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdac7361", new Object[]{context, ze7Var});
        } else {
            a(context, ze7Var, w6f.PAGE_PAUSE_ACTION);
        }
    }

    public static void e(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48807266", new Object[]{context, ze7Var});
        } else {
            a(context, ze7Var, w6f.PAGE_RESUME_ACTION);
        }
    }

    public static void f(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6200916", new Object[]{context, ze7Var});
        } else {
            a(context, ze7Var, w6f.ACTION_NOTIFY_DETAIL_SHOW);
        }
    }

    public static JSONObject g(ze7 ze7Var) {
        Vertical vertical;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fce220d0", new Object[]{ze7Var});
        }
        if (ze7Var == null || (vertical = (Vertical) ze7Var.e().f(Vertical.class)) == null) {
            return null;
        }
        return vertical.getTransparentBroadcast();
    }
}
