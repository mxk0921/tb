package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE = "Industry";
    public static final b Companion = new b(null);
    public static final int IMG_BIZ_ID = 65520;
    public static final String IMG_BIZ_TYPE = "IndustryImg";
    public static final String TAG = "DXEngineWrapper";

    /* renamed from: a  reason: collision with root package name */
    public final c f17341a;
    public final DinamicXEngine b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/cv5$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DXEngineConfig.b f17342a = new DXEngineConfig.b(cv5.BIZ_TYPE).X(cv5.IMG_BIZ_ID).Y(cv5.IMG_BIZ_TYPE);
        public final Context b;

        static {
            t2o.a(804257820);
        }

        public a(Context context) {
            ckf.g(context, "context");
            this.b = context;
        }

        public final cv5 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cv5) ipChange.ipc$dispatch("2c7cad54", new Object[]{this});
            }
            return new cv5(this.b, new DinamicXEngine(this.f17342a.F()), null);
        }

        public final a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("17a2c0ce", new Object[]{this, new Boolean(z)});
            }
            this.f17342a.G(z);
            return this;
        }

        public final a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d3154625", new Object[]{this, new Boolean(z)});
            }
            this.f17342a.I(z);
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        static {
            t2o.a(804257821);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, ArrayList<nu5>> f17343a = new HashMap<>();

        static {
            t2o.a(804257822);
            t2o.a(444596939);
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.f17343a.clear();
            }
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            ckf.g(k66Var, "result");
            List<DXTemplateItem> list = k66Var.b;
            if (list != null && !list.isEmpty()) {
                for (DXTemplateItem dXTemplateItem : k66Var.b) {
                    if (this.f17343a.get(dXTemplateItem.f7343a) != null) {
                        ArrayList<nu5> arrayList = this.f17343a.get(dXTemplateItem.f7343a);
                        ckf.d(arrayList);
                        Iterator<nu5> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().b(dXTemplateItem);
                        }
                    }
                }
            }
            List<DXTemplateItem> list2 = k66Var.f22428a;
            if (!(list2 == null || list2.isEmpty())) {
                for (DXTemplateItem dXTemplateItem2 : k66Var.f22428a) {
                    if (this.f17343a.get(dXTemplateItem2.f7343a) != null) {
                        ArrayList<nu5> arrayList2 = this.f17343a.get(dXTemplateItem2.f7343a);
                        ckf.d(arrayList2);
                        Iterator<nu5> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            it2.next().a(dXTemplateItem2);
                        }
                    }
                }
            }
        }

        public final void a(String str, nu5 nu5Var) {
            ArrayList<nu5> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84a239e2", new Object[]{this, str, nu5Var});
                return;
            }
            ckf.g(str, "dxName");
            ckf.g(nu5Var, DataReceiveMonitor.CB_LISTENER);
            if (!this.f17343a.containsKey(str)) {
                this.f17343a.put(str, new ArrayList<>());
            }
            ArrayList<nu5> arrayList2 = this.f17343a.get(str);
            if ((arrayList2 == null || !arrayList2.contains(nu5Var)) && (arrayList = this.f17343a.get(str)) != null) {
                arrayList.add(nu5Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements nu5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c36 f17344a;
        public final /* synthetic */ DXTemplateItem b;
        public final /* synthetic */ DXTemplateItem c;
        public final /* synthetic */ ua6 d;

        public d(c36 c36Var, DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2, ua6 ua6Var) {
            this.f17344a = c36Var;
            this.b = dXTemplateItem;
            this.c = dXTemplateItem2;
            this.d = ua6Var;
        }

        @Override // tb.nu5
        public void a(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daf0aa14", new Object[]{this, dXTemplateItem});
                return;
            }
            ckf.g(dXTemplateItem, "template");
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(cv5.TAG, "download template success " + cv5.this);
            c36 c36Var = this.f17344a;
            if (c36Var != null) {
                c36Var.b(this.b);
            }
            if (b36.a(this.c, this.d.e())) {
                b36.c(this.d, dXTemplateItem, this.f17344a);
            }
        }

        @Override // tb.nu5
        public void b(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecde384d", new Object[]{this, dXTemplateItem});
                return;
            }
            ckf.g(dXTemplateItem, "template");
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(cv5.TAG, "download template failed " + cv5.this);
            f fVar = new f(this.d.c().c());
            fVar.b(String.valueOf((int) f.DX_TEMPLATE_DOWNLOAD_ERROR_60023));
            c36 c36Var = this.f17344a;
            if (c36Var != null) {
                c36Var.c(dXTemplateItem, fVar);
            }
        }
    }

    static {
        t2o.a(804257819);
    }

    public cv5(Context context, DinamicXEngine dinamicXEngine) {
        this.b = dinamicXEngine;
        c cVar = new c();
        this.f17341a = cVar;
        dinamicXEngine.a1(cVar);
    }

    public final DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.b;
    }

    public final void b(ua6 ua6Var, DXTemplateItem dXTemplateItem, c36 c36Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5299a0a", new Object[]{this, ua6Var, dXTemplateItem, c36Var});
            return;
        }
        ckf.g(ua6Var, "renderConfig");
        ckf.g(dXTemplateItem, yg.CACHE_KEY_TEMPLATE_INFO);
        DXTemplateItem u = ua6Var.c().u(dXTemplateItem);
        if (b36.b(u, dXTemplateItem, ua6Var.e())) {
            ckf.f(u, "fetchTemplate");
            b36.c(ua6Var, u, c36Var);
        }
        if (u == null || u.b != dXTemplateItem.b) {
            c cVar = this.f17341a;
            String str = dXTemplateItem.f7343a;
            ckf.f(str, "templateInfo.name");
            cVar.a(str, new d(c36Var, dXTemplateItem, u, ua6Var));
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(TAG, "start download template " + this);
            ua6Var.c().p(xz3.e(dXTemplateItem));
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f17341a.b();
        this.b.o1(this.f17341a);
        this.b.q0();
    }

    public /* synthetic */ cv5(Context context, DinamicXEngine dinamicXEngine, a07 a07Var) {
        this(context, dinamicXEngine);
    }
}
