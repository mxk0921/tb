package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zss {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> c;
    public final String e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f32996a = new HashMap();
    public Map<String, String> b = new HashMap();
    public Map<String, String> d = new HashMap();

    static {
        t2o.a(1017118831);
    }

    public zss(Application application, String str) {
        new HashMap();
        this.e = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            new ats(this.e, this.f32996a, this.b, this.d).f();
        }
    }

    public zss b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zss) ipChange.ipc$dispatch("884b4678", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f32996a).put("namespace", str);
        }
        return this;
    }

    public zss c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zss) ipChange.ipc$dispatch("ae0fa919", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f32996a).put(TanxArgNames.MACRO_ARGS.getKey(), vzo.n(map));
            this.d = map;
        }
        return this;
    }

    public zss d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zss) ipChange.ipc$dispatch("191e727", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f32996a).put(TanxArgNames.MONITOR_ARGS.getKey(), vzo.n(map));
            this.b = map;
        }
        return this;
    }

    public zss e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zss) ipChange.ipc$dispatch("d8b635f8", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f32996a).put(TanxArgNames.UT_ARGS.getKey(), vzo.n(map));
            this.c = map;
        }
        return this;
    }
}
