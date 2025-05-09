package tb;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ebn implements dbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dbn f18451a;
    public final long b = uos.b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ unq f18452a;
        public final /* synthetic */ y69 b;

        public a(unq unqVar, y69 y69Var) {
            this.f18452a = unqVar;
            this.b = y69Var;
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
                return;
            }
            RSoLog.d("fetchAsync() result=" + b79Var.toString());
            this.f18452a.d("end", "begin");
            ebn.f(ebn.this, b79Var, this.f18452a, "fetchAsync");
            this.b.onFetchFinished(b79Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements c52 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c52 f18453a;

        public b(ebn ebnVar, c52 c52Var) {
            this.f18453a = c52Var;
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
                return;
            }
            RSoLog.d("batchFetchAsync() result=" + d52Var.toString());
            this.f18453a.b(d52Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b79 f18454a;
        public final /* synthetic */ String b;
        public final /* synthetic */ unq c;

        public c(b79 b79Var, String str, unq unqVar) {
            this.f18454a = b79Var;
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
            hashMap.put(ngd.ARGS_LIB_NAME, this.f18454a.e());
            hashMap.put(ngd.ARGS_CALL_TYPE, this.b);
            hashMap.put(ngd.ARGS_INTERVAL_FROM_INIT, Long.valueOf(uos.b() - ebn.g(ebn.this)));
            hashMap.put("resultMajorVer", trq.h(this.f18454a.f()));
            hashMap.put("resultMinorVer", trq.h(this.f18454a.g()));
            hashMap.put("source", this.f18454a.h());
            hashMap.putAll(this.c.b());
            if (this.f18454a.i()) {
                rbn.j(ngd.POINT_FETCHER, hashMap);
            } else {
                rbn.h(ngd.POINT_FETCHER, hashMap, this.f18454a.c());
            }
        }
    }

    public ebn(dbn dbnVar) {
        this.f18451a = dbnVar;
    }

    public static /* synthetic */ void f(ebn ebnVar, b79 b79Var, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae29a802", new Object[]{ebnVar, b79Var, unqVar, str});
        } else {
            ebnVar.h(b79Var, unqVar, str);
        }
    }

    public static /* synthetic */ long g(ebn ebnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8926869", new Object[]{ebnVar})).longValue();
        }
        return ebnVar.b;
    }

    @Override // tb.dbn
    public d52 a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d52) ipChange.ipc$dispatch("b9db9619", new Object[]{this, list});
        }
        try {
            RSoLog.d("batchFetch() enter -> libName=" + list);
            d52 a2 = this.f18451a.a(list);
            RSoLog.d("batchFetch() result=" + a2.toString());
            return a2;
        } catch (Throwable th) {
            return d52.a(RSoException.error(6201, th));
        }
    }

    @Override // tb.dbn
    public void b(String str, y69 y69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dc04a6", new Object[]{this, str, y69Var});
            return;
        }
        try {
            RSoLog.d("fetchAsync() enter -> libName=" + str);
            unq unqVar = new unq("fetchAsync");
            unqVar.c("begin");
            this.f18451a.b(str, new a(unqVar, y69Var));
        } catch (Throwable th) {
            y69Var.onFetchFinished(b79.b(str, RSoException.error(6201, th)));
        }
    }

    @Override // tb.dbn
    public b79 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("b1bac3d7", new Object[]{this, str});
        }
        try {
            RSoLog.d("fetchSync() enter -> libName=" + str);
            unq unqVar = new unq("fetchSync");
            unqVar.c("begin");
            b79 c2 = this.f18451a.c(str);
            unqVar.d("end", "begin");
            h(c2, unqVar, "fetchSync");
            RSoLog.d("fetchSync() result=" + c2.toString());
            return c2;
        } catch (Throwable th) {
            return b79.b(str, RSoException.error(6201, th));
        }
    }

    @Override // tb.dbn
    public b79 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b79) ipChange.ipc$dispatch("d96d27dc", new Object[]{this, str});
        }
        try {
            RSoLog.d("fetch() enter -> libName=" + str);
            unq unqVar = new unq(CredentialRpcData.ACTION_FETCH);
            unqVar.c("begin");
            b79 d = this.f18451a.d(str);
            unqVar.d("end", "begin");
            h(d, unqVar, CredentialRpcData.ACTION_FETCH);
            RSoLog.d("fetch() result=" + d.toString());
            return d;
        } catch (Throwable th) {
            return b79.b(str, RSoException.error(6201, th));
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
            RSoLog.d("batchFetchAsync() enter -> libName=" + list);
            this.f18451a.e(list, new b(this, c52Var));
        } catch (Throwable th) {
            c52Var.b(d52.a(RSoException.error(6201, th)));
        }
    }

    public final void h(b79 b79Var, unq unqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978cbf68", new Object[]{this, b79Var, unqVar, str});
        } else {
            rbn.i("fetcher-tracker", new c(b79Var, str, unqVar));
        }
    }
}
