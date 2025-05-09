package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f31586a = new HashMap();
    public Map<String, String> b = new HashMap();
    public Map<String, String> c;
    public final String d;

    static {
        t2o.a(1017118827);
    }

    public xss(Application application, String str) {
        new HashMap();
        this.d = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            new yss(this.d, this.f31586a, this.b).h();
        }
    }

    public xss b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xss) ipChange.ipc$dispatch("a5132544", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f31586a).put("namespace", str);
        }
        return this;
    }

    public xss c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xss) ipChange.ipc$dispatch("dc3b04b3", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f31586a).put(TanxArgNames.MONITOR_ARGS.getKey(), vzo.n(map));
            this.b = map;
        }
        return this;
    }

    public xss d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xss) ipChange.ipc$dispatch("f1fb74c4", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f31586a).put(TanxArgNames.UT_ARGS.getKey(), vzo.n(map));
            this.c = map;
        }
        return this;
    }
}
