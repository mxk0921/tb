package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j7n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CONFIG = "{\"enableDumpLaunchVisible\":true,\"enableDumpLaunchInteractive\":true,\"enableDumpColdStartRefresh\":false,\"enableDumpFirstClick\":false,\"enableDumpFirstScroll\":false}";

    /* renamed from: a  reason: collision with root package name */
    public boolean f21821a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        t2o.a(729809800);
    }

    public static j7n a(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j7n) ipChange.ipc$dispatch("32aff87a", new Object[]{str});
        }
        bqa.d("QosDumpConfig", "parse:" + str);
        j7n j7nVar = new j7n();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            j7n j7nVar2 = new j7n();
            try {
                j7nVar2.f21821a = parseObject.getBoolean("enableDumpLaunchVisible").booleanValue();
                j7nVar2.b = parseObject.getBoolean("enableDumpLaunchInteractive").booleanValue();
                j7nVar2.c = parseObject.getBoolean("enableDumpColdStartRefresh").booleanValue();
                j7nVar2.e = parseObject.getBoolean("enableDumpFirstScroll").booleanValue();
                j7nVar2.d = parseObject.getBoolean("enableDumpFirstClick").booleanValue();
                return j7nVar2;
            } catch (Throwable th2) {
                th = th2;
                j7nVar = j7nVar2;
                bqa.b("QosDumpConfig", "parse error", th);
                return j7nVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
