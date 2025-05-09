package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32993a;
    public String b;
    public Map<String, String> c;
    public Map<String, String> d;

    static {
        t2o.a(993002165);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        String str = this.f32993a;
        if (str != null) {
            return str;
        }
        ckf.y("api");
        throw null;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("626d6bc1", new Object[]{this});
        }
        Map<String, String> map = this.c;
        if (map != null) {
            return map;
        }
        ckf.y("topParams");
        throw null;
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6446bee0", new Object[]{this});
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        ckf.y("version");
        throw null;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b780bae9", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.f32993a = str;
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb1685", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.c = map;
    }

    public final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173c2746", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.b = str;
    }
}
