package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.tracelog.TraceModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f0b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_CREATE = "Home_OnCreate";
    public static final String HOME_CREATE_CONTAINER = "Home_CreateContainer";
    public static final String HOME_CREATE_VIEW = "Home_OnCreateView";
    public static final String HOME_DATA_PROCESS_TRIGGER = "Home_DataProcessTrigger";
    public static final String HOME_LAYOUT = "Home_Layout";
    public static final String HOME_MAIN_PRERENDER = "Home_Main_Prerender";
    public static final String HOME_NAVI = "Home_Navi";
    public static final String HOME_RENDER = "Home_Render";
    public static final String HOME_RESUME = "Home_OnResume";
    public static final String HOME_START = "Home_OnStart";
    public static final String HOME_SUB_PRERENDER = "Home_Sub_Prerender";
    public static final String HOME_VISIBLE = "Home_Visible";
    public static final String HOME_VISIBLE_ONLY = "Home_VisibleOnly";
    public static final Map<String, f0b> f = new ConcurrentHashMap();
    public static final Object g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f18920a;
    public final g9u c;
    public final AtomicBoolean d;
    public final Map<String, TraceModel> b = new ConcurrentHashMap();
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends wpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f18921a;
        public final /* synthetic */ TraceModel b;
        public final /* synthetic */ boolean c;

        public a(Map map, TraceModel traceModel, boolean z) {
            this.f18921a = map;
            this.b = traceModel;
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/tracelog/HomeGlobalTrace$1");
        }

        @Override // tb.wpo
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4e76a87", new Object[]{this});
            } else {
                f0b.a(f0b.this, this.f18921a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(729809878);
    }

    public f0b(String str) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.d = atomicBoolean;
        this.f18920a = str;
        this.c = new g9u(str);
        if (!p7p.k()) {
            atomicBoolean.set(true);
        }
    }

    public static /* synthetic */ void a(f0b f0bVar, Map map, TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a488b9", new Object[]{f0bVar, map, traceModel, new Boolean(z)});
        } else {
            f0bVar.g(map, traceModel, z);
        }
    }

    public static f0b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f0b) ipChange.ipc$dispatch("3a23465a", new Object[0]);
        }
        return j(null);
    }

    public static f0b j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f0b) ipChange.ipc$dispatch("a87cfcbe", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, yyj.e().f())) {
            str = yyj.e().k();
        }
        Map<String, f0b> map = f;
        f0b f0bVar = (f0b) ((ConcurrentHashMap) map).get(str);
        if (f0bVar == null) {
            synchronized (g) {
                if (f0bVar == null) {
                    try {
                        f0bVar = new f0b(str);
                        ((ConcurrentHashMap) map).put(str, f0bVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return f0bVar;
    }

    public final void b(TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a904c2b0", new Object[]{this, traceModel, new Boolean(z)});
        } else if (traceModel != null) {
            k(1, traceModel, z);
            k(3, traceModel, z);
            k(2, traceModel, z);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ecf683b", new Object[]{this, str});
        } else {
            d(str, null);
        }
    }

    public void d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06395ea", new Object[]{this, str, map});
        } else {
            e(str, map, SystemClock.uptimeMillis());
        }
    }

    public void e(String str, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f9e1a", new Object[]{this, str, map, new Long(j)});
        } else if (g0b.a(h())) {
            TraceModel traceModel = (TraceModel) ((ConcurrentHashMap) this.b).remove(str);
            if (traceModel == null) {
                TLog.loge("home", "GlobalTrace", str + " endTrace failed, no startModel");
                return;
            }
            traceModel.endModel(map, j);
            b(traceModel, false);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e917b897", new Object[]{this, str});
        } else {
            u5r.f(str);
        }
    }

    public final void g(Map<String, ov> map, TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8180152", new Object[]{this, map, traceModel, new Boolean(z)});
            return;
        }
        for (ov ovVar : map.values()) {
            if (ovVar != null) {
                ovVar.a(traceModel, z);
            }
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f18920a;
    }

    public final void k(int i, TraceModel traceModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec83be6", new Object[]{this, new Integer(i), traceModel, new Boolean(z)});
            return;
        }
        Map<String, ov> b = this.c.b(i);
        if (b != null && !b.isEmpty()) {
            a aVar = new a(b, traceModel, z);
            if (i == 2) {
                aVar.run();
            } else if (i == 3) {
                this.e.post(aVar);
            } else if (!this.d.get()) {
                aVar.run();
            } else {
                m5a.a().e(aVar);
            }
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6907ad7d", new Object[]{this, str});
        } else {
            n(str, 1, g0b.e(), SystemClock.uptimeMillis());
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3060a4b", new Object[]{this, str});
        } else {
            n(str, 1, g0b.f(), SystemClock.uptimeMillis());
        }
    }

    public void n(String str, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694a5205", new Object[]{this, str, new Integer(i), new Long(j), new Long(j2)});
        } else if (g0b.a(h())) {
            b(new TraceModel(str, i, j, j2, true), false);
        }
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e288dc7", new Object[]{this, new Boolean(z)});
        } else {
            this.d.set(z);
        }
    }

    public void p(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf24d2f", new Object[]{this, str, new Integer(i)});
        } else {
            q(str, i, null);
        }
    }

    public void q(String str, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a3aa76", new Object[]{this, str, new Integer(i), map});
        } else {
            r(str, i, map, true);
        }
    }

    public void r(String str, int i, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d2571e", new Object[]{this, str, new Integer(i), map, new Boolean(z)});
        } else if (g0b.a(h()) && this.d.get()) {
            if (((TraceModel) ((ConcurrentHashMap) this.b).get(str)) != null) {
                TLog.loge("home", "GlobalTrace", str + " startTrace already have startModel。replace with new time, key=" + str);
                if (!z) {
                    return;
                }
            }
            TraceModel traceModel = new TraceModel(str, i, map);
            ((ConcurrentHashMap) this.b).put(str, traceModel);
            b(traceModel, true);
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b9181e", new Object[]{this, str});
        } else {
            u5r.i(str);
        }
    }
}
