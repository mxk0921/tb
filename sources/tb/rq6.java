package tb;

import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.vfw.dataloader.DataLoaderEngineImpl;
import com.alibaba.android.ultron.vfw.dataloader.DataParserEngineImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ms6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DATA_PARSER_RESULT = "DataParseResult";

    /* renamed from: a  reason: collision with root package name */
    public final com.alibaba.android.ultron.vfw.instance.a f27550a;
    public final Map<String, wxb> b = new HashMap();
    public final Map<String, xxb> c = new HashMap();
    public final Map<tr6, ms6> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ms6.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ms6.a
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                UnifyLog.m(rq6.this.f27550a.getBizName(), "DataLoadManager", "dataloader finished and refresh finished step6", new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ms6.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ms6.a
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                UnifyLog.m(rq6.this.f27550a.getBizName(), "DataLoadManager", "dataloader finished and refresh finished step6", new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements kr6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public tr6 f27553a;
        public final uq6 b;
        public final com.alibaba.android.ultron.vfw.dataloader.a c;
        public final boolean d;

        static {
            t2o.a(157286594);
            t2o.a(157286607);
        }

        public c(uq6 uq6Var, com.alibaba.android.ultron.vfw.dataloader.a aVar, boolean z) {
            this.b = uq6Var;
            this.c = aVar;
            this.d = z;
        }

        public void a(tr6 tr6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfd20aa0", new Object[]{this, tr6Var});
            } else {
                this.f27553a = tr6Var;
            }
        }

        @Override // tb.kr6
        public lr6 c(lr6 lr6Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lr6) ipChange.ipc$dispatch("26f1b283", new Object[]{this, lr6Var});
            }
            UnifyLog.m(rq6.this.f27550a.getBizName(), "DataLoadManager", "dataLoaderParser task finished step3", new String[0]);
            if (sh4.l()) {
                if (((ConcurrentHashMap) rq6.this.d).containsKey(this.f27553a)) {
                    ((ConcurrentHashMap) rq6.this.d).remove(this.f27553a);
                }
                if (!((ConcurrentHashMap) rq6.this.d).isEmpty()) {
                    UnifyLog.m(rq6.this.f27550a.getBizName(), "DataLoadManager", "当前已有新的DataParse Task", new String[0]);
                    return lr6Var;
                }
            }
            lr6 c = this.b.c(lr6Var);
            this.c.a(rq6.KEY_DATA_PARSER_RESULT, c);
            rq6.a(rq6.this, this.c, this.b, this.d);
            return c;
        }
    }

    static {
        t2o.a(157286591);
    }

    public rq6(com.alibaba.android.ultron.vfw.instance.a aVar) {
        this.f27550a = aVar;
    }

    public static /* synthetic */ void a(rq6 rq6Var, com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4caca24", new Object[]{rq6Var, aVar, uq6Var, new Boolean(z)});
        } else {
            rq6Var.f(aVar, uq6Var, z);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ms6.c();
        ((ConcurrentHashMap) this.d).clear();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8f1022", new Object[]{this});
            return;
        }
        i5e l = this.f27550a.F().l();
        if (l != null) {
            l.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_END);
        }
    }

    public final wxb d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wxb) ipChange.ipc$dispatch("752f05b4", new Object[]{this, str});
        }
        if (tq6.DATA_LOADER_TYPE_CLIENT.equals(str)) {
            return new DataLoaderEngineImpl(this.f27550a);
        }
        return null;
    }

    public final xxb e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xxb) ipChange.ipc$dispatch("2e7767a1", new Object[]{this, str});
        }
        if (tq6.DATA_PARSER_TYPE_SCRIPT.equals(str)) {
            return new DataParserEngineImpl(this.f27550a);
        }
        return null;
    }

    public final void f(com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6411a91c", new Object[]{this, aVar, uq6Var, new Boolean(z)});
            return;
        }
        String b2 = this.f27550a.x().b();
        if (b2 == null) {
            UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataLoaderType is null", new String[0]);
            return;
        }
        wxb wxbVar = (wxb) ((HashMap) this.b).get(b2);
        if (wxbVar == null) {
            wxbVar = d(b2);
            if (wxbVar == null) {
                UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataloader is null, type: ".concat(b2), new String[0]);
                return;
            }
            ((HashMap) this.b).put(b2, wxbVar);
        }
        vq6 c2 = vq6.c(aVar, wxbVar, uq6Var, this.f27550a);
        b bVar = new b();
        UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataloader task start step4", new String[0]);
        if (z) {
            c2.d(true);
            c2.a(bVar);
            return;
        }
        new ms6(c2, bVar).d();
    }

    public void g(com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5e3ef3", new Object[]{this, aVar, uq6Var});
        } else {
            h(aVar, uq6Var, false);
        }
    }

    public void i(com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db083952", new Object[]{this, aVar, uq6Var});
        } else {
            h(aVar, uq6Var, true);
        }
    }

    public final void h(com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da9a701", new Object[]{this, aVar, uq6Var, new Boolean(z)});
            return;
        }
        UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "renderWithContext step1", new String[0]);
        if (aVar == null) {
            c();
            return;
        }
        tq6 x = this.f27550a.x();
        if (x == null) {
            UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "DataLoaderConfig is null", new String[0]);
            c();
            return;
        }
        String c2 = x.c();
        if (c2 == null) {
            UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataParseType is null", new String[0]);
            c();
            return;
        }
        xxb xxbVar = (xxb) ((HashMap) this.c).get(c2);
        if (xxbVar == null) {
            xxbVar = e(c2);
            if (xxbVar == null) {
                UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataLoaderParser is null, type: ".concat(c2), new String[0]);
                c();
                return;
            }
            ((HashMap) this.c).put(c2, xxbVar);
        } else {
            c();
        }
        c cVar = new c(uq6Var, aVar, z);
        tr6 b2 = tr6.b(aVar, xxbVar, cVar);
        cVar.a(b2);
        UnifyLog.m(this.f27550a.getBizName(), "DataLoadManager", "dataLoaderParser task start step2", new String[0]);
        if (z) {
            b2.a(new a());
            return;
        }
        ms6 ms6Var = new ms6(b2);
        ms6Var.d();
        ((ConcurrentHashMap) this.d).put(b2, ms6Var);
    }
}
