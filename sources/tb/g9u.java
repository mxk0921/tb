package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19817a;
    public final Map<String, ov> b = new HashMap();
    public final Map<String, ov> c = new HashMap();
    public final Map<String, ov> d = new HashMap();

    static {
        t2o.a(729809885);
    }

    public g9u(String str) {
        try {
            this.f19817a = str;
            if (!vxl.b().h()) {
                TLog.loge("home", "GlobalTrace", "线下度量开关关闭  不使用部分性能工具");
                e4b.g(this);
            }
            kc.g(this);
            l21.h(this);
            e2b.h(this);
            k5s.f(this);
            uu3.f(this);
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "init TraceInterceptorFactory error", th);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f19817a;
    }

    public Map<String, ov> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49bdc89e", new Object[]{this, new Integer(i)});
        }
        if (i == 2) {
            return this.d;
        }
        if (i != 3) {
            return this.c;
        }
        return this.b;
    }

    public void c(String str, ov ovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152f9e53", new Object[]{this, str, ovVar});
        } else if (TextUtils.isEmpty(str) || ovVar == null) {
            TLog.loge("home", "GlobalTrace", "register failed, empty key or value");
        } else {
            Map<String, ov> b = b(ovVar.b());
            if (b.containsKey(str)) {
                TLog.loge("home", "GlobalTrace", "register failed, duplicate register, key = " + str);
                return;
            }
            b.put(str, ovVar);
        }
    }
}
