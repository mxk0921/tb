package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.FileManager;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ad5;
import tb.ao6;
import tb.av5;
import tb.dx5;
import tb.gvb;
import tb.h36;
import tb.ic5;
import tb.jb6;
import tb.k76;
import tb.ka6;
import tb.kb6;
import tb.ke5;
import tb.la6;
import tb.mu5;
import tb.on6;
import tb.ou5;
import tb.sh6;
import tb.t2o;
import tb.th6;
import tb.u06;
import tb.uh6;
import tb.vwb;
import tb.wh6;
import tb.xh6;
import tb.xv5;
import tb.yh6;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, DXTemplateItem> h = new ConcurrentHashMap();
    public final ou5 d;
    public final Context f;
    public final long g = d().g();
    public final k76 c = new k76(d().D());
    public final th6 e = new th6(d().d);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7331a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f7331a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sh6.c().d(this.f7331a, "dinamicx", this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements vwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f7333a;
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ AtomicInteger c;
            public final /* synthetic */ int d;
            public final /* synthetic */ DXTemplateItem e;

            public a(String str, byte[] bArr, AtomicInteger atomicInteger, int i, DXTemplateItem dXTemplateItem) {
                this.f7333a = str;
                this.b = bArr;
                this.c = atomicInteger;
                this.d = i;
                this.e = dXTemplateItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (dx5.d().j(this.f7333a, this.b) && this.c.incrementAndGet() == this.d) {
                    sh6.c().e(p.this.f15675a, this.e);
                }
            }
        }

        public b() {
        }

        @Override // tb.vwb
        public boolean a(DXTemplateItem dXTemplateItem, Map<String, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d15ce1e", new Object[]{this, dXTemplateItem, map})).booleanValue();
            }
            if (map == null || map.size() <= 0) {
                return false;
            }
            int size = map.size();
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                String key = entry.getKey();
                byte[] value = entry.getValue();
                dx5.d().h(key, value);
                if (zg5.n3()) {
                    p.this.v(atomicInteger, key, size, dXTemplateItem, value, atomicBoolean);
                } else {
                    jb6.h(new mu5(2, new a(key, value, atomicInteger, size, dXTemplateItem)));
                }
            }
            if (!zg5.r2()) {
                uh6 h = uh6.h();
                p pVar = p.this;
                h.z(pVar.f15675a, p.h(pVar), dXTemplateItem);
                return true;
            } else if (atomicBoolean.get()) {
                uh6 h2 = uh6.h();
                p pVar2 = p.this;
                h2.z(pVar2.f15675a, p.h(pVar2), dXTemplateItem);
                return true;
            } else {
                la6.b("1 有文件写入失败 不在通知");
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7334a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ int d;
        public final /* synthetic */ AtomicBoolean e;
        public final /* synthetic */ DXTemplateItem f;

        public c(String str, byte[] bArr, AtomicInteger atomicInteger, int i, AtomicBoolean atomicBoolean, DXTemplateItem dXTemplateItem) {
            this.f7334a = str;
            this.b = bArr;
            this.c = atomicInteger;
            this.d = i;
            this.e = atomicBoolean;
            this.f = dXTemplateItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (dx5.d().j(this.f7334a, this.b) && this.c.incrementAndGet() == this.d) {
                this.e.set(true);
                sh6.c().e(p.this.f15675a, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public final List<DXTemplateItem> f7337a = new ArrayList();

        static {
            t2o.a(444596577);
        }

        public e(p pVar) {
        }
    }

    static {
        t2o.a(444596570);
    }

    public p(av5 av5Var, Context context) {
        super(av5Var);
        this.f = context;
        this.d = new ou5(g.i, av5Var.f().n, h);
        jb6.r(new a(context, d().d()));
        dx5.d().e(context);
        u();
    }

    public static p g(av5 av5Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("c0ab70d4", new Object[]{av5Var, context});
        }
        return new p(av5Var, context);
    }

    public static /* synthetic */ long h(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("346318f2", new Object[]{pVar})).longValue();
        }
        return pVar.g;
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXTemplateManager");
    }

    public static String p(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9643dd", new Object[]{str, dXTemplateItem});
        }
        if (dXTemplateItem != null) {
            return str + dXTemplateItem.d();
        }
        return str + "null";
    }

    public final boolean i(DXTemplateItem dXTemplateItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d4a5ae6", new Object[]{this, dXTemplateItem, str})).booleanValue();
        }
        if (!zg5.B2() && dXTemplateItem.g() == 0) {
            return false;
        }
        String p = p(str, dXTemplateItem);
        for (Map.Entry entry : ((ConcurrentHashMap) h).entrySet()) {
            if (p.equals(entry.getKey())) {
                if (DinamicXEngine.j0()) {
                    h36.b("DXTemplateManager", p + " 已在下载队列中，无需下载 " + ((ConcurrentHashMap) h).size());
                }
                return true;
            }
        }
        ((ConcurrentHashMap) h).put(p, dXTemplateItem);
        return false;
    }

    public void k(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4789e3f", new Object[]{this, dXTemplateItem});
        } else {
            this.e.d(this.f15675a, this.g, dXTemplateItem);
        }
    }

    public void l(List<DXTemplateItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb95e13", new Object[]{this, list, str});
        } else if (zg5.g5()) {
            m(list, str, null, true);
        } else {
            this.d.g(this.f15675a, q(list, str).f7337a, new b(), true);
        }
    }

    public void m(List<DXTemplateItem> list, String str, gvb gvbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f89bfd", new Object[]{this, list, str, gvbVar, new Boolean(z)});
        } else {
            this.d.g(this.f15675a, q(list, str).f7337a, new d(gvbVar), z);
        }
    }

    public DXTemplateItem n(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("93b3119c", new Object[]{this, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        DXTemplateItem a2 = this.e.a(this.f15675a, this.g, dXTemplateItem);
        x("Template_Fetch", this.f15675a, dXTemplateItem, System.nanoTime() - nanoTime, a2);
        return a2;
    }

    public DXTemplateItem o(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("12c999fb", new Object[]{this, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        DXTemplateItem b2 = this.e.b(this.f15675a, this.g, dXTemplateItem);
        yh6.y(this.f15675a, this.g, dXTemplateItem);
        x("Template_Fetch", this.f15675a, dXTemplateItem, System.nanoTime() - nanoTime, b2);
        return b2;
    }

    public final e q(List<DXTemplateItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a239a6d0", new Object[]{this, list, str});
        }
        e eVar = new e(this);
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet(list);
            if (hashSet.size() > 0) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    DXTemplateItem dXTemplateItem = (DXTemplateItem) it.next();
                    if (wh6.b(dXTemplateItem) && !t(dXTemplateItem) && (!zg5.U3() || !i(dXTemplateItem, str))) {
                        ((ArrayList) eVar.f7337a).add(dXTemplateItem);
                    }
                }
            }
        }
        return eVar;
    }

    public synchronized DXWidgetNode r(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("de21fa64", new Object[]{this, dXRuntimeContext});
        }
        return s(dXRuntimeContext, true);
    }

    public boolean t(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5771d2c7", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        boolean q = uh6.h().q(this.f15675a, dXTemplateItem);
        x("Template_Exist", this.f15675a, dXTemplateItem, System.nanoTime() - nanoTime, null);
        return q;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8368992", new Object[]{this});
        } else if (uh6.h().r(this.f15675a)) {
            JSONObject i = u06.i(this.f15675a, wh6.ASSET_PRESET_TEMPLATE_INFOLIST);
            if (ao6.a().d()) {
                JSONObject i2 = u06.i(this.f15675a, wh6.ASSET_SUB_PRESET_TEMPLATE_INFOLIST);
                if (i == null || i2 == null) {
                    uh6.h().s(this.f15675a, i);
                    return;
                }
                i2.putAll(i);
                uh6.h().s(this.f15675a, i2);
                return;
            }
            uh6.h().s(this.f15675a, i);
        }
    }

    public void v(AtomicInteger atomicInteger, String str, int i, DXTemplateItem dXTemplateItem, byte[] bArr, AtomicBoolean atomicBoolean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec1b068", new Object[]{this, atomicInteger, str, new Integer(i), dXTemplateItem, bArr, atomicBoolean});
        } else if (str == null || !str.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
            if (!zg5.r2()) {
                jb6.h(new mu5(2, new c(str, bArr, atomicInteger, i, atomicBoolean, dXTemplateItem)));
            } else if (dx5.d().j(str, bArr) && atomicInteger.incrementAndGet() == i) {
                atomicBoolean.set(true);
                sh6.c().e(this.f15675a, dXTemplateItem);
            }
        } else if (!dx5.d().k(str, bArr, false)) {
            atomicBoolean.set(false);
        } else if (atomicInteger.incrementAndGet() == i) {
            sh6.c().e(this.f15675a, dXTemplateItem);
            atomicBoolean.set(true);
        }
    }

    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0d5cfb", new Object[]{this, new Integer(i)});
        } else {
            this.e.c(i);
        }
    }

    public final void x(String str, String str2, DXTemplateItem dXTemplateItem, long j, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b231b00", new Object[]{this, str, str2, dXTemplateItem, new Long(j), dXTemplateItem2});
            return;
        }
        HashMap hashMap = new HashMap();
        if (dXTemplateItem2 != null && dXTemplateItem2.f) {
            hashMap.put("isPreset", "true");
            hashMap.put("presetTempName", dXTemplateItem2.e());
            hashMap.put("presetTempVer", String.valueOf(dXTemplateItem2.h()));
            if (DinamicXEngine.j0()) {
                h36.g("DXFetchTemplate", str2 + " 访问到了预置模版: " + dXTemplateItem2.d());
            }
        }
        if (dXTemplateItem2 != null && dXTemplateItem2.j) {
            hashMap.put("predownload", "1");
        }
        ic5.u(2, str2, "Template", str, dXTemplateItem, hashMap, j, true);
    }

    public final DXWidgetNode j(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXTemplateItem dXTemplateItem, DXRuntimeContext dXRuntimeContext2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("de6d9eda", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXTemplateItem, dXRuntimeContext2, new Boolean(z)});
        }
        try {
            if (!zg5.W3()) {
                return dXWidgetNode;
            }
            if (dXWidgetNode == null) {
                la6.b("checkRootLayoutWidgetNode widgetNode == null");
                return null;
            } else if (dXRuntimeContext == null) {
                la6.b("checkRootLayoutWidgetNode runtimeContext == null");
                return dXWidgetNode;
            } else if (dXRuntimeContext2 == null) {
                la6.b("checkRootLayoutWidgetNode cloneRuntimeContext == null");
                return dXWidgetNode;
            } else {
                if (!(dXWidgetNode instanceof j) && !(dXWidgetNode instanceof r)) {
                    f fVar = new f(this.f15675a);
                    f.a aVar = new f.a("Pipeline_Detail", "Pipeline_Stage_Get_Template_Widget", f.DXERROR_PIPELINE_LOAD_WT_IS_NULL_OR_NOT_LAYOUT);
                    aVar.e = "getTemplateWT !(widgetNode instanceof DXLayout)";
                    ((ArrayList) fVar.c).add(aVar);
                    ic5.p(fVar);
                    if (zg5.K4(dXRuntimeContext.c())) {
                        boolean M4 = zg5.M4();
                        if (M4) {
                            la6.b("before reload widgetMap: " + dXRuntimeContext.V() + "; cloneWidgetMap: " + dXRuntimeContext2.V());
                        }
                        if (z) {
                            ke5.e().a(dXRuntimeContext.c(), dXRuntimeContext.p(), dXRuntimeContext.r());
                        } else {
                            on6.i().d(dXRuntimeContext.c(), dXRuntimeContext.p(), dXRuntimeContext.r());
                        }
                        if (!(dXTemplateItem == null || dXTemplateItem.k == null)) {
                            dx5.d().a(dXTemplateItem.k.f31396a);
                        }
                        dXWidgetNode = s(dXRuntimeContext, false);
                        if (!(dXWidgetNode instanceof j) && !(dXWidgetNode instanceof r)) {
                            f fVar2 = new f(this.f15675a);
                            f.a aVar2 = new f.a("Pipeline_Detail", "Pipeline_Stage_Get_Template_Widget", f.DXERROR_PIPELINE_LOAD_WT_FROM_BINARY_IS_NULL_OR_NOT_LAYOUT);
                            aVar2.e = "getTemplateWTFromBinary ";
                            if (dXWidgetNode == null) {
                                aVar2.e += "reload widgetNode is null; ";
                            } else {
                                aVar2.e += "reload !(widgetNode instanceof DXLayout); ";
                            }
                            if (M4) {
                                aVar2.e += "widgetMapInfo: " + dXRuntimeContext.V() + "; cloneWidgetMap: " + dXRuntimeContext2.V();
                            }
                            ((ArrayList) fVar2.c).add(aVar2);
                            ic5.p(fVar2);
                        }
                    }
                }
                return dXWidgetNode;
            }
        } catch (Throwable th) {
            xv5.b(th);
            la6.b(xv5.a(th));
            return dXWidgetNode;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements vwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gvb f7335a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f7336a;
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ AtomicInteger c;
            public final /* synthetic */ int d;
            public final /* synthetic */ DXTemplateItem e;

            public a(String str, byte[] bArr, AtomicInteger atomicInteger, int i, DXTemplateItem dXTemplateItem) {
                this.f7336a = str;
                this.b = bArr;
                this.c = atomicInteger;
                this.d = i;
                this.e = dXTemplateItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (dx5.d().j(this.f7336a, this.b) && this.c.incrementAndGet() == this.d) {
                    sh6.c().e(p.this.f15675a, this.e);
                }
            }
        }

        public d(gvb gvbVar) {
            this.f7335a = gvbVar;
        }

        @Override // tb.vwb
        public boolean a(DXTemplateItem dXTemplateItem, Map<String, byte[]> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1d15ce1e", new Object[]{this, dXTemplateItem, map})).booleanValue();
            }
            if (map == null || map.size() <= 0) {
                return false;
            }
            int size = map.size();
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                String key = entry.getKey();
                byte[] value = entry.getValue();
                dx5.d().h(key, value);
                if (zg5.n3()) {
                    p.this.v(atomicInteger, key, size, dXTemplateItem, value, atomicBoolean);
                } else {
                    jb6.h(new mu5(2, new a(key, value, atomicInteger, size, dXTemplateItem)));
                }
            }
            if (!zg5.r2()) {
                uh6 h = uh6.h();
                p pVar = p.this;
                h.z(pVar.f15675a, p.h(pVar), dXTemplateItem);
                return true;
            } else if (atomicBoolean.get()) {
                uh6 h2 = uh6.h();
                p pVar2 = p.this;
                h2.z(pVar2.f15675a, p.h(pVar2), dXTemplateItem);
                gvb gvbVar = this.f7335a;
                if (gvbVar == null) {
                    return true;
                }
                ((ka6.c) gvbVar).a(dXTemplateItem);
                return true;
            } else {
                f fVar = new f("dinamicx");
                fVar.b = dXTemplateItem;
                f.a aVar = new f.a("DX_V4_LOGIC", "DX_V4_LOGIC_ERROR", this.f7335a != null ? f.DX_V4_LOGIC_4100003 : f.DX_V4_LOGIC_4100007);
                if (this.f7335a != null) {
                    str = "remote  有文件写入失败 不在通知";
                } else {
                    str = " engine 有文件写入失败 不在通知";
                }
                aVar.e = str;
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
                la6.b(str);
                return false;
            }
        }
    }

    public synchronized DXWidgetNode s(DXRuntimeContext dXRuntimeContext, boolean z) {
        String str;
        DXWidgetNode dXWidgetNode;
        DXWidgetNode dXWidgetNode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7705634e", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext == null) {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline_Render", "Pipeline_Stage_Get_Template_Widget", f.DX_LOAD_WT_ERROR_400014));
            la6.b(" getTemplateWT DX_LOAD_WT_ERROR_400014  runtimeContext == null ");
            return null;
        } else {
            DXRuntimeContext b2 = dXRuntimeContext.b(null);
            f fVar = new f(this.f15675a);
            b2.i = fVar;
            fVar.b = dXRuntimeContext.p();
            kb6 a2 = b2.o.a();
            b2.o = a2;
            a2.n = null;
            a2.m = null;
            DXTemplateItem p = b2.p();
            if (p == null) {
                ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline_Render", "Pipeline_Stage_Get_Template_Widget", f.DX_LOAD_WT_ERROR_400016));
                la6.b(" getTemplateWT DX_LOAD_WT_ERROR_400016");
                return null;
            } else if (t(p)) {
                xh6 xh6Var = p.k;
                if (xh6Var == null || TextUtils.isEmpty(xh6Var.f31396a)) {
                    p.k = uh6.h().i(this.f15675a, p);
                }
                if (p.k == null) {
                    ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline_Render", "Pipeline_Stage_Get_Template_Widget", f.DX_GET_PACKAGEINFO_NULL));
                    la6.b("getTemplateWT templateItem.packageInfo == null 400011");
                    return null;
                }
                boolean Z = dXRuntimeContext.Z(this.f15675a);
                if (Z) {
                    dXWidgetNode = ke5.e().c(this.f15675a, p, dXRuntimeContext.r());
                } else {
                    dXWidgetNode = on6.i().g(this.f15675a, p, dXRuntimeContext.r());
                }
                if (dXWidgetNode == null) {
                    la6.b(p.d() + " cache widgetTree == null");
                    long nanoTime = System.nanoTime();
                    DXWidgetNode b3 = this.c.b(p, b2, this.f);
                    if (b3 == null) {
                        la6.b(" load widgetTree == null 400012");
                        ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline_Render", "Pipeline_Stage_Get_Template_Widget", f.DX_LOAD_WT_NULL));
                    }
                    ic5.u(3, this.f15675a, "Template", "Pipeline_Stage_Load_Binary", p, null, System.nanoTime() - nanoTime, true);
                    if (b3 != null) {
                        dXRuntimeContext.c0("loadBinaryUseFileCache", "true");
                        dXRuntimeContext.c0("loadBinaryFromCache", "false");
                        b3.setStatFlag(1);
                        if (b3.isV4Node()) {
                            on6.i().l(this.f15675a, p, b3);
                        } else if (Z) {
                            ke5.e().g(this.f15675a, p, b3);
                        } else {
                            on6.i().l(this.f15675a, p, b3);
                        }
                    }
                    dXWidgetNode2 = b3;
                } else {
                    dXRuntimeContext.c0("loadBinaryUseFileCache", "false");
                    dXRuntimeContext.c0("loadBinaryFromCache", "true");
                    h36.v("命中原型树缓存: " + dXRuntimeContext.R());
                    dXWidgetNode2 = dXWidgetNode;
                }
                if (!(dXWidgetNode2 != null || dXRuntimeContext.m() == null || dXRuntimeContext.m().c == null || b2.m() == null || b2.m().c == null)) {
                    ((ArrayList) dXRuntimeContext.m().c).addAll(b2.m().c);
                }
                if (z) {
                    dXWidgetNode2 = j(dXWidgetNode2, dXRuntimeContext, p, b2, Z);
                }
                return dXWidgetNode2;
            } else {
                if (p.k != null) {
                    str = p.d() + p.k.f31396a;
                } else {
                    str = null;
                }
                la6.b(" load widgetTree == null DX_LOAD_WT_ERROR_400015  isTemplateNotExist" + str);
                return null;
            }
        }
    }
}
