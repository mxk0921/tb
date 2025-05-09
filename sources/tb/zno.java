package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class zno {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String SPAN_CELL = "cell-render";
    public static final String SPAN_DATA_PARSE = "data-parse";
    public static final String SPAN_MTOP_REQUEST = "mtop-request";
    public static final String SPAN_PAGE_PROCESS = "page-process";
    public static final String SPAN_SETUP_PAGE = "setup-page";
    public static final String SPAN_TEMPLATES_REQUEST = "templates-request";

    /* renamed from: a  reason: collision with root package name */
    public String f32898a;
    public final boolean b;
    public final boolean c = o4p.o2();
    public final List<k9u> d = new ArrayList();
    public final Map<String, j9u> e = new LinkedHashMap();
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792174);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final String b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1e98e56c", new Object[]{this, obj});
            }
            boolean z = obj instanceof Activity;
            snl snlVar = snl.f28161a;
            if (z) {
                String b = snlVar.f((Activity) obj).b();
                ckf.d(b);
                return b;
            } else if (!(obj instanceof Fragment)) {
                return "";
            } else {
                String b2 = snlVar.i((Fragment) obj).b();
                ckf.d(b2);
                return b2;
            }
        }

        @JvmStatic
        public final void c(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c65f09f", new Object[]{this, str, str2, obj});
            } else if (str != null && str2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                vxm.b.b(str).a(str2, obj);
            }
        }

        @JvmStatic
        public final void d(String str, String str2, Long l) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5ec07a5", new Object[]{this, str, str2, l});
            } else if (str != null && str2 != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                mdd b = vxm.b.b(str);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                b.j(str2, j);
            }
        }

        @JvmStatic
        public final void e(String str, String str2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9e3158f", new Object[]{this, str, str2, new Long(j)});
                return;
            }
            ckf.g(str, "pageSession");
            ckf.g(str2, "spanName");
            vxm.b.b(str).g(str2, j);
        }

        @JvmStatic
        public final void f(String str, String str2, long j, String str3, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cefed82d", new Object[]{this, str, str2, new Long(j), str3, map});
                return;
            }
            ckf.g(str, "pageSession");
            ckf.g(str2, "spanName");
            vxm.b.b(str).k(str2, j, str3, map);
        }

        @JvmStatic
        public final void g(String str, String str2, long j, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48b94730", new Object[]{this, str, str2, new Long(j), map});
                return;
            }
            ckf.g(str, "pageSession");
            ckf.g(str2, "spanName");
            vxm.b.b(str).n(str2, j, map);
        }

        public a() {
        }

        @JvmStatic
        public final void a(String str, j9u j9uVar, j9u j9uVar2, Map<String, Object> map, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40694f52", new Object[]{this, str, j9uVar, j9uVar2, map, new Boolean(z), str2});
                return;
            }
            ckf.g(j9uVar, "startNode");
            ckf.g(j9uVar2, "endNode");
            if (!TextUtils.isEmpty(str) && j9uVar.b() >= 0 && j9uVar2.b() >= 0) {
                ckf.d(str);
                e(str, j9uVar.a(), j9uVar.b());
                if (z) {
                    f(str, j9uVar2.a(), j9uVar2.b(), str2, map);
                } else {
                    g(str, j9uVar2.a(), j9uVar2.b(), map);
                }
            }
        }
    }

    static {
        t2o.a(815792173);
    }

    public zno(String str, boolean z) {
        this.f32898a = str;
        this.b = z;
    }

    @JvmStatic
    public static final String h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e98e56c", new Object[]{obj});
        }
        return Companion.b(obj);
    }

    @JvmStatic
    public static final void p(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c65f09f", new Object[]{str, str2, obj});
        } else {
            Companion.c(str, str2, obj);
        }
    }

    @JvmStatic
    public static final void q(String str, String str2, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ec07a5", new Object[]{str, str2, l});
        } else {
            Companion.d(str, str2, l);
        }
    }

    public final void a(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9350f8da", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "biz");
        ckf.g(map, "params");
        vxm.b.b(this.f32898a).b(str, map);
    }

    public final void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c8d454", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "name");
        ckf.g(obj, "value");
        vxm.b.b(this.f32898a).a(str, obj);
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15239fec", new Object[]{this, map});
        } else if (this.c) {
            i(SPAN_DATA_PARSE, SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d0b0c0", new Object[]{this});
        } else if (this.c) {
            this.e.put(SPAN_DATA_PARSE, new j9u(SPAN_DATA_PARSE, SystemClock.uptimeMillis()));
        }
    }

    public final Map<String, Object> g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4cdc78c8", new Object[]{this, map});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isNewSearch", Boolean.valueOf(this.b));
        if (map != null && !map.isEmpty()) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public final void i(String str, long j, Map<String, Object> map, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43b8fc3", new Object[]{this, str, new Long(j), map, new Boolean(z), str2});
            return;
        }
        j9u remove = this.e.remove(str);
        if (remove != null) {
            j9u j9uVar = new j9u(str, j);
            String str3 = this.f32898a;
            if (str3 == null || str3.length() == 0) {
                k9u k9uVar = new k9u(remove, j9uVar);
                k9uVar.d(z);
                k9uVar.b(str2);
                k9uVar.c(map);
                ((ArrayList) this.d).add(k9uVar);
                return;
            }
            Companion.a(this.f32898a, remove, j9uVar, map, z, str2);
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2210692", new Object[]{this, str});
        } else if (this.c) {
            if (str == null || str.length() == 0) {
                this.f32898a = "";
            } else {
                this.f32898a = str;
            }
            if (!((ArrayList) this.d).isEmpty()) {
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    try {
                        ((k9u) it.next()).a(this.f32898a);
                        it.remove();
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5fb8c68", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776d9944", new Object[]{this, map});
        } else if (this.c) {
            i("mtop-request", SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec36890", new Object[]{this, map});
        } else if (this.c) {
            i("mtop-request", SystemClock.uptimeMillis(), g(map), true, null);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1146868", new Object[]{this});
        } else if (this.c) {
            this.e.put("mtop-request", new j9u("mtop-request", SystemClock.uptimeMillis()));
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a2163a", new Object[]{this});
        } else if (this.c) {
            this.e.put(SPAN_PAGE_PROCESS, new j9u(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis()));
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971590d0", new Object[]{this, str});
            return;
        }
        ckf.g(str, "name");
        this.e.put(str, new j9u(str, SystemClock.uptimeMillis()));
    }

    public final void s(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34baca43", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "name");
        i(str, SystemClock.uptimeMillis(), map, false, null);
    }

    public final void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e203019", new Object[]{this, map});
        } else if (this.c) {
            i(SPAN_TEMPLATES_REQUEST, SystemClock.uptimeMillis(), g(map), false, null);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ac5b73", new Object[]{this});
        } else if (this.c) {
            this.e.put(SPAN_TEMPLATES_REQUEST, new j9u(SPAN_TEMPLATES_REQUEST, SystemClock.uptimeMillis()));
        }
    }

    public final void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5f2f6f", new Object[]{this, map});
        } else if (this.c) {
            this.f = true;
            i(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(map), false, "exception");
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (this.c) {
            this.f = true;
            i(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(null), false, null);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7382a68", new Object[]{this});
        } else if (this.c) {
            this.f = true;
            i(SPAN_PAGE_PROCESS, SystemClock.uptimeMillis(), g(null), true, "process terminate");
        }
    }
}
