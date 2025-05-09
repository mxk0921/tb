package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sao implements agd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final agd f27912a;
    public final ws3 b;
    public final Map<String, pan> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements nan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nan f27913a;

        public a(nan nanVar) {
            this.f27913a = nanVar;
        }

        @Override // tb.nan
        public void a(pan panVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("168e9942", new Object[]{this, panVar});
            } else {
                this.f27913a.a(sao.d(sao.this, panVar));
            }
        }
    }

    public sao(agd agdVar, ws3 ws3Var) {
        this.f27912a = agdVar;
        this.b = ws3Var;
    }

    public static /* synthetic */ pan d(sao saoVar, pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("bce27a8b", new Object[]{saoVar, panVar});
        }
        return saoVar.f(panVar);
    }

    @Override // tb.agd
    public void a(String str, nan nanVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202931b2", new Object[]{this, str, nanVar});
            return;
        }
        pan panVar = (pan) ((ConcurrentHashMap) this.c).get(str);
        if (panVar == null || !panVar.f()) {
            this.f27912a.a(str, new a(nanVar));
            return;
        }
        e(panVar);
        RSoLog.d("Restrictive-> fetchAsync result = " + panVar);
        nanVar.a(panVar);
    }

    @Override // tb.agd
    public pan b(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("74404968", new Object[]{this, str});
        }
        pan panVar = (pan) ((ConcurrentHashMap) this.c).get(str);
        if (panVar == null || !panVar.f()) {
            return f(this.f27912a.b(str));
        }
        e(panVar);
        RSoLog.d("Restrictive-> fetch result = " + panVar);
        return panVar;
    }

    @Override // tb.agd
    public pan c(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("f3fef1e3", new Object[]{this, str});
        }
        pan panVar = (pan) ((ConcurrentHashMap) this.c).get(str);
        if (panVar == null || !panVar.f()) {
            return f(this.f27912a.c(str));
        }
        e(panVar);
        RSoLog.d("Restrictive-> fetchSync result = " + panVar);
        return panVar;
    }

    public final void e(pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1538f2", new Object[]{this, panVar});
            return;
        }
        a7o b = panVar.b();
        if (!qan.a(b.i())) {
            b.m(qan.FROM_RESTRICTIVE);
        }
    }

    public final pan f(pan panVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pan) ipChange.ipc$dispatch("7e99cb1a", new Object[]{this, panVar});
        }
        if (panVar.f() && ((ConcurrentHashMap) this.c).get(panVar.d()) == null) {
            ((ConcurrentHashMap) this.c).put(panVar.d(), panVar);
            RSoLog.d("Restrictive-> update result = " + panVar);
            this.b.a(panVar.b().d());
        }
        return panVar;
    }
}
