package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ibn implements hbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hbn f21213a;
    public final long b = uos.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ unq f21214a;
        public final /* synthetic */ u5h b;

        public a(unq unqVar, u5h u5hVar) {
            this.f21214a = unqVar;
            this.b = u5hVar;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            RSoLog.d("loadAsync() result=" + l6hVar.toString());
            this.f21214a.d("end", "begin");
            ibn.d(ibn.this, l6hVar, this.f21214a, "loadAsync");
            this.b.onLoadFinished(l6hVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l6h f21215a;
        public final /* synthetic */ String b;
        public final /* synthetic */ unq c;

        public b(l6h l6hVar, String str, unq unqVar) {
            this.f21215a = l6hVar;
            this.b = str;
            this.c = unqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(ngd.ARGS_LIB_NAME, this.f21215a.d());
            hashMap.put(ngd.ARGS_LOAD_FROM, this.f21215a.e());
            hashMap.put(ngd.ARGS_CALL_TYPE, this.b);
            hashMap.put(ngd.ARGS_INTERVAL_FROM_INIT, Long.valueOf(uos.b() - ibn.e(ibn.this)));
            hashMap.put("resultMajorVer", trq.h(this.f21215a.f()));
            hashMap.put("resultMinorVer", trq.h(this.f21215a.g()));
            hashMap.put("source", this.f21215a.h());
            hashMap.putAll(this.c.b());
            if (this.f21215a.i()) {
                rbn.j(ngd.POINT_LOADER, hashMap);
            } else {
                rbn.h(ngd.POINT_LOADER, hashMap, this.f21215a.c());
            }
        }
    }

    public ibn(hbn hbnVar) {
        this.f21213a = hbnVar;
    }

    public static /* synthetic */ void d(ibn ibnVar, l6h l6hVar, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548872d0", new Object[]{ibnVar, l6hVar, unqVar, str});
        } else {
            ibnVar.f(l6hVar, unqVar, str);
        }
    }

    public static /* synthetic */ long e(ibn ibnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e34b1585", new Object[]{ibnVar})).longValue();
        }
        return ibnVar.b;
    }

    @Override // tb.hbn
    public void a(String str, u5h u5hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e1402", new Object[]{this, str, u5hVar});
            return;
        }
        try {
            RSoLog.d("loadAsync() enter -> libName=" + str);
            unq unqVar = new unq("loadAsync");
            unqVar.c("begin");
            this.f21213a.a(str, new a(unqVar, u5hVar));
        } catch (Throwable th) {
            u5hVar.onLoadFinished(l6h.b(str, RSoException.error(5101, th)));
        }
    }

    @Override // tb.hbn
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f98724", new Object[]{this, str})).booleanValue();
        }
        return this.f21213a.b(str);
    }

    @Override // tb.hbn
    public l6h c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("8aed7eb3", new Object[]{this, str});
        }
        try {
            RSoLog.d("loadSync() -> enter() " + str);
            unq unqVar = new unq("loadSync");
            unqVar.c("begin");
            l6h c = this.f21213a.c(str);
            unqVar.d("end", "begin");
            f(c, unqVar, "loadSync");
            RSoLog.d("loadSync() result=" + c.toString());
            return c;
        } catch (Throwable th) {
            return l6h.b(str, RSoException.error(5101, th));
        }
    }

    public final void f(l6h l6hVar, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4c26e6", new Object[]{this, l6hVar, unqVar, str});
        } else {
            rbn.i("loader-tracker", new b(l6hVar, str, unqVar));
        }
    }

    @Override // tb.hbn
    public l6h load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6h) ipChange.ipc$dispatch("e22015f8", new Object[]{this, str});
        }
        try {
            RSoLog.d("load() -> enter() " + str);
            unq unqVar = new unq("load");
            unqVar.c("begin");
            l6h load = this.f21213a.load(str);
            unqVar.d("end", "begin");
            f(load, unqVar, "load");
            RSoLog.d("load() result=" + load.toString());
            return load;
        } catch (Throwable th) {
            return l6h.b(str, RSoException.error(5101, th));
        }
    }
}
