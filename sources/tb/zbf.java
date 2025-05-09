package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.InspectorNativeAgent;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import com.taobao.android.riverlogger.inspector.a;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zbf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yeh Log = new yeh();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32664a = false;

    static {
        t2o.a(649068577);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9dccb14", new Object[0])).booleanValue();
        }
        return f32664a;
    }

    public static void b(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8355b30", new Object[]{str, jSONObject, str2});
            return;
        }
        a c = ti3.c();
        if (c != null) {
            c.x(str, str2, jSONObject, MessagePriority.Normal, null);
        }
    }

    public static void c(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb5825", new Object[]{str, new Integer(i), str2, jSONObject});
        } else {
            InspectorNativeAgent.handleCommand(str, i, str2, jSONObject);
        }
    }

    public static void d(ecf ecfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436235db", new Object[]{ecfVar, str});
        } else if (f32664a) {
            ecfVar.c(str);
        }
    }

    @Deprecated
    public static void e(ecf ecfVar, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e0f44e", new Object[]{ecfVar, set});
        } else {
            d(ecfVar, TextUtils.join(",", set));
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffbb0c", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            InspectorNativeAgent.registerInfo(str, str2);
        }
    }

    public static void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c49c72", new Object[]{aVar});
            return;
        }
        aVar.x("Dev.clientInfo", null, InspectorNativeAgent.getClientInfo(), MessagePriority.Normal, null);
        JSONObject allSessionInfo = InspectorNativeAgent.getAllSessionInfo();
        if (allSessionInfo != null) {
            Iterator<String> keys = allSessionInfo.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = allSessionInfo.optJSONObject(next);
                if (optJSONObject != null) {
                    aVar.x("Dev.pageOpen", next, optJSONObject, MessagePriority.Normal, null);
                }
            }
        }
    }

    public static void h(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1250cce", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        f32664a = z;
        InspectorNativeAgent.setConnected(z, z2);
    }

    public static void i(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1a20", new Object[]{set});
        } else {
            InspectorNativeAgent.updateEnabled(set);
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2482b1b2", new Object[]{str, str2});
        } else {
            InspectorNativeAgent.updatePlugins(str, str2);
        }
    }
}
