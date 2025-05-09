package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.dxDownload")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dg extends ms implements iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public s f;
    public fm g;
    public long h;
    public CopyOnWriteArrayList<AURARenderComponent> i;
    public ExecutorService j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Serializable f17781a;

        /* compiled from: Taobao */
        /* renamed from: tb.dg$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class C0904a implements mbb<AURARenderComponent, Boolean> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0904a(a aVar) {
            }

            /* renamed from: b */
            public Boolean a(AURARenderComponent aURARenderComponent) {
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Boolean) ipChange.ipc$dispatch("5faca3fc", new Object[]{this, aURARenderComponent});
                }
                try {
                    if (aURARenderComponent == null) {
                        return Boolean.FALSE;
                    }
                    AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
                    if (aURARenderComponentData == null) {
                        return Boolean.FALSE;
                    }
                    AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
                    if (aURARenderComponentContainer == null) {
                        return Boolean.FALSE;
                    }
                    if (!aURARenderComponent.isRenderAbleLeaf() || !dm.f17906a.equals(aURARenderComponentContainer.containerType)) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    rj.d("DO_FLAT_EXCEPTION", th.getMessage());
                    return Boolean.FALSE;
                }
            }
        }

        public a(Serializable serializable) {
            this.f17781a = serializable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            dg.P0(dg.this);
            long currentTimeMillis = System.currentTimeMillis();
            bm.b(((AURARenderIO) this.f17781a).getRenderTree(), dg.Q0(dg.this), new C0904a(this));
            rbb g = ck.g();
            g.e("拍平渲染树耗时：" + (System.currentTimeMillis() - currentTimeMillis), ck.b.b().i("AURA/performance").a());
            dg dgVar = dg.this;
            dg.S0(dgVar, dg.R0(dgVar), dg.Q0(dg.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Adapter f17782a;

        public b(RecyclerView.Adapter adapter) {
            this.f17782a = adapter;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ck.g().e("DX下载完成后刷新界面#真实开始刷新", ck.b.b().l("AURAAspectLifeCycleDxDownloadExtension").a());
            RecyclerView.Adapter adapter = this.f17782a;
            if (adapter instanceof mcb) {
                ((mcb) adapter).h(true);
            } else {
                adapter.notifyDataSetChanged();
            }
        }
    }

    static {
        t2o.a(81788955);
        t2o.a(444596939);
    }

    public static /* synthetic */ void P0(dg dgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e490a925", new Object[]{dgVar});
        } else {
            dgVar.U0();
        }
    }

    public static /* synthetic */ CopyOnWriteArrayList Q0(dg dgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("9f410031", new Object[]{dgVar});
        }
        return dgVar.i;
    }

    public static /* synthetic */ s R0(dg dgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("db36543b", new Object[]{dgVar});
        }
        return dgVar.f;
    }

    public static /* synthetic */ void S0(dg dgVar, s sVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfd2a9b", new Object[]{dgVar, sVar, list});
        } else {
            dgVar.T0(sVar, list);
        }
    }

    public static /* synthetic */ Object ipc$super(dg dgVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1162528052:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
                return null;
            case -25033014:
                super.onCreate((lo) objArr[0], (yi) objArr[1]);
                return null;
            case 1111077198:
                super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            case 1335413541:
                super.beforeFlowExecute((AURAInputData) objArr[0], (cg) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/aspect/AURAAspectLifeCycleDxDownloadExtension");
        }
    }

    public final void T0(s sVar, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42b8e7", new Object[]{this, sVar, list});
        } else if (!bh.a(list)) {
            List<DXTemplateItem> c = vwu.c(list);
            if (!(bh.a(c) || sVar == null)) {
                try {
                    for (ss ssVar : J0().f(ss.class)) {
                        ssVar.m0(c);
                    }
                } catch (Exception unused) {
                }
                this.h = System.currentTimeMillis();
                sVar.h(c);
            }
        }
    }

    public final void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a7aad1", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<AURARenderComponent> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList == null) {
            this.i = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList.clear();
        }
    }

    public final void V0(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e3c89f", new Object[]{this, list});
            return;
        }
        try {
            for (ss ssVar : J0().f(ss.class)) {
                ssVar.L(list);
            }
        } catch (Exception unused) {
        }
    }

    public final void W0() {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99da7ea", new Object[]{this});
            return;
        }
        ck.g().e("DX下载完成后刷新界面#第一行", ck.b.b().l("AURAAspectLifeCycleDxDownloadExtension").a());
        AURAGlobalData L0 = L0();
        if (L0 != null && (recyclerView = (RecyclerView) L0.get("render_view", RecyclerView.class)) != null && (adapter = recyclerView.getAdapter()) != null) {
            if (this.g == null) {
                this.g = new fm();
            }
            this.g.b(new b(adapter));
        }
    }

    public final void X0(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72469f89", new Object[]{this, loVar, yiVar});
            return;
        }
        List<dbb> f = yiVar.f(dbb.class);
        s sVar = (s) loVar.g("DXEngineRouter", s.class);
        if (sVar != null) {
            this.f = sVar;
        } else {
            Iterator it = f.iterator();
            DXEngineConfig dXEngineConfig = null;
            while (it.hasNext() && (dXEngineConfig = ((dbb) it.next()).getConfig()) == null) {
            }
            if (dXEngineConfig == null) {
                String d = loVar.d();
                dXEngineConfig = new DXEngineConfig.b(d).Q(2).Y(d).F();
            }
            this.f = new s(dXEngineConfig);
        }
        for (dbb dbbVar : f) {
            dbbVar.O(this.f);
        }
        this.f.s(38447420286L, new ph());
        this.f.s(7023701163946200378L, new oh());
        this.f.s(-489609274268614298L, new lj());
        this.f.t(this);
        L0().update("auraRenderDxEngine", this.f);
    }

    public final void Y0(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f47b04", new Object[]{this, k66Var});
            return;
        }
        try {
            List<DXTemplateItem> list = k66Var.b;
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (DXTemplateItem dXTemplateItem : list) {
                    sb.append("name=");
                    sb.append(dXTemplateItem.e());
                    sb.append("version=");
                    sb.append(dXTemplateItem.h());
                    sb.append("\n");
                }
                ck.g().e("DX下载失败", ck.b.b().l("AURAAspectLifeCycleDxDownloadExtension").g(yg.CACHE_KEY_TEMPLATE_INFO, sb.toString()).a());
            }
        } catch (Exception unused) {
        }
    }

    public final void Z0(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57a05ac", new Object[]{this, list});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.h;
        try {
            Map map = (Map) K0().get("downloadTemplateAndRefresh", Map.class);
            if (map == null) {
                map = new HashMap();
            }
            map.put("downloadTemplateCostTime", Long.valueOf(currentTimeMillis));
            K0().update("downloadTemplateAndRefresh", map);
            rbb g = ck.g();
            g.e("下载模版耗时：" + currentTimeMillis, ck.b.b().i("AURA/performance").a());
        } catch (Exception unused) {
        }
    }

    public final void a1(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16af66c7", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : list) {
                b1(dXTemplateItem);
            }
        }
    }

    public final void b1(DXTemplateItem dXTemplateItem) {
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec5626e", new Object[]{this, dXTemplateItem});
        } else if (!bh.a(this.i)) {
            Iterator<AURARenderComponent> it = this.i.iterator();
            while (it.hasNext()) {
                AURARenderComponentData aURARenderComponentData = it.next().data;
                if (!(aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null)) {
                    String str = aURARenderComponentContainer.name;
                    if (!TextUtils.isEmpty(str) && dm.f17906a.equals(aURARenderComponentContainer.containerType) && str.equals(dXTemplateItem.f7343a)) {
                        aURARenderComponentContainer.version = String.valueOf(dXTemplateItem.b);
                        aURARenderComponentContainer.url = dXTemplateItem.c;
                        aURARenderComponentContainer.identifySuffix = String.valueOf(System.currentTimeMillis());
                        aURARenderComponentContainer.isPreset = false;
                    }
                }
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeFlowExecute(AURAInputData aURAInputData, cg cgVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f98cb25", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, cgVar);
        s sVar = (s) L0().get("auraRenderDxEngine", s.class);
        if (sVar == null) {
            X0(M0(), J0());
        }
        rbb g = ck.g();
        if (sVar == null) {
            str = "没命中engineRouter缓存";
        } else {
            str = "命中engineRouter缓存";
        }
        g.e(str, ck.b.b().i("AURA/performance").a());
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (pm.RENDER_SERVICE_CODE.equals(cgVar.b())) {
            Serializable data = aURAInputData.getData();
            if (data instanceof AURARenderIO) {
                ExecutorService executorService = this.j;
                if (executorService == null) {
                    ck.g().f("beforeServiceExecute#mThreadExecutor is null", ck.b.b().l("AURAAspectLifeCycleDxDownloadExtension").a());
                } else {
                    executorService.execute(new a(data));
                }
            }
        }
    }

    @Override // tb.ms, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.j = dn.d(1, 1, 3L, TimeUnit.SECONDS, "AURADxDownloadExtension");
    }

    @Override // tb.ms, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        }
    }

    @Override // tb.ms, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.j;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.j.shutdownNow();
            } catch (Exception e) {
                rbb g = ck.g();
                g.b("AURAAspectLifeCycleDxDownloadExtension", "onDestroy", "停止线程池报错：" + e.getMessage());
            }
        }
        s sVar = this.f;
        if (sVar != null) {
            sVar.B(this);
            DinamicXEngine k = this.f.k();
            if (k != null) {
                k.q0();
            }
        }
        CopyOnWriteArrayList<AURARenderComponent> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
        } else if (k66Var != null) {
            Y0(k66Var);
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null && !list.isEmpty()) {
                Z0(list);
                V0(list);
                a1(list);
                W0();
            }
        }
    }
}
