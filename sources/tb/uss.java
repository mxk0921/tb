package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f29590a = new HashMap();
    public Map<String, String> b = new HashMap();
    public Map<String, String> c;
    public final String d;

    static {
        t2o.a(1017118823);
    }

    public uss(String str) {
        new HashMap();
        this.d = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            new vss(this.d, this.f29590a, this.b).f();
        }
    }

    public uss b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uss) ipChange.ipc$dispatch("36d4b33c", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f29590a).put("namespace", str);
        }
        return this;
    }

    public uss c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uss) ipChange.ipc$dispatch("cf11432b", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f29590a).put(TanxArgNames.MONITOR_ARGS.getKey(), vzo.n(map));
            this.b = map;
        }
        return this;
    }

    public uss d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uss) ipChange.ipc$dispatch("300942bc", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f29590a).put(TanxArgNames.UT_ARGS.getKey(), vzo.n(map));
            this.c = map;
        }
        return this;
    }
}
