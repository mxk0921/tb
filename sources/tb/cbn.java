package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cbn implements dbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f16959a;
    public final agd b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements nan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y69 f16960a;
        public final /* synthetic */ String b;

        public a(y69 y69Var, String str) {
            this.f16960a = y69Var;
            this.b = str;
        }

        @Override // tb.nan
        public void a(pan panVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("168e9942", new Object[]{this, panVar});
                return;
            }
            try {
                this.f16960a.onFetchFinished(cbn.f(cbn.this, this.b, panVar));
            } catch (Throwable th) {
                this.f16960a.onFetchFinished(b79.b(this.b, RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_CALLBACK_FAILED, th)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f16961a = new AtomicInteger(0);
        public final /* synthetic */ List b;
        public final /* synthetic */ List c;
        public final /* synthetic */ c52 d;

        public b(cbn cbnVar, List list, List list2, c52 c52Var) {
            this.b = list;
            this.c = list2;
            this.d = c52Var;
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
                return;
            }
            int incrementAndGet = this.f16961a.incrementAndGet();
            this.b.add(b79Var);
            if (incrementAndGet >= this.c.size()) {
                this.d.b(d52.e(this.b));
            }
        }
    }

    public cbn(cgd cgdVar, d dVar, agd agdVar) {
        this.f16959a = cgdVar;
        this.b = agdVar;
    }

    public static /* synthetic */ b79 f(cbn cbnVar, String str, pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("3ca043af", new Object[]{cbnVar, str, panVar});
        }
        return cbnVar.g(str, panVar);
    }

    @Override // tb.dbn
    public d52 a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("b9db9619", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(d(str));
        }
        return d52.e(arrayList);
    }

    @Override // tb.dbn
    public void b(String str, y69 y69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dc04a6", new Object[]{this, str, y69Var});
            return;
        }
        try {
            if (this.f16959a.h(str)) {
                RSoLog.a("fetchAsync -> failure , lib in config is disabled, libName=" + str);
                y69Var.onFetchFinished(b79.a(str, 6003));
                return;
            }
            this.b.a(str, new a(y69Var, str));
        } catch (Throwable th) {
            y69Var.onFetchFinished(b79.b(str, RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_FAILED, th)));
        }
    }

    @Override // tb.dbn
    public b79 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("b1bac3d7", new Object[]{this, str});
        }
        try {
            if (!this.f16959a.h(str)) {
                return g(str, this.b.c(str));
            }
            RSoLog.a("fetchAsync -> failure , lib in config is disabled, libName=" + str);
            return b79.a(str, 6003);
        } catch (Throwable th) {
            return b79.b(str, RSoException.error((int) RSoException.ERROR_FETCH_SYNC_FAILED, th));
        }
    }

    @Override // tb.dbn
    public b79 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("d96d27dc", new Object[]{this, str});
        }
        try {
            if (!this.f16959a.h(str)) {
                return g(str, this.b.b(str));
            }
            RSoLog.a("fetch -> failure , lib in config is disabled, libName=" + str);
            return b79.a(str, 6003);
        } catch (Throwable th) {
            return b79.b(str, RSoException.error(5000, th));
        }
    }

    @Override // tb.dbn
    public void e(List<String> list, c52 c52Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7032327", new Object[]{this, list, c52Var});
            return;
        }
        try {
            b bVar = new b(this, new CopyOnWriteArrayList(), list, c52Var);
            for (String str : list) {
                b(str, bVar);
            }
        } catch (Throwable th) {
            c52Var.b(d52.a(RSoException.error((int) RSoException.ERROR_FETCH_ASYNC_FAILED, th)));
        }
    }

    public final b79 g(String str, pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("51709f88", new Object[]{this, str, panVar});
        }
        a7o b2 = panVar.b();
        SoIndexData.SoFileInfo c = b2.c();
        if (b2.j()) {
            return b79.j(str, b2.f()).l(c.getMajorVersion(), c.getMinorVersion()).k(b2.i());
        }
        RSoException b3 = b2.b();
        if (b3 == null) {
            b3 = RSoException.error(6401, b2.e() + " needed by " + str + " fetch failed");
        }
        return b79.b(str, b3).k(b2.i());
    }
}
