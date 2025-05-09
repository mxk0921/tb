package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.av5;
import tb.eb5;
import tb.evb;
import tb.fl6;
import tb.fvb;
import tb.g76;
import tb.kb6;
import tb.la6;
import tb.lub;
import tb.mvb;
import tb.mw5;
import tb.ov5;
import tb.pb6;
import tb.ph5;
import tb.ql6;
import tb.qub;
import tb.qwb;
import tb.t2o;
import tb.vy8;
import tb.wx5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRuntimeContext implements Cloneable, qwb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REFRESH_ALL = 0;
    public static final int REFRESH_PART = 1;
    public static final int REFRESH_PART_FROM_WINDOW_CHANGED = 2;

    /* renamed from: a  reason: collision with root package name */
    public DXWidgetNode f7292a;
    public WeakReference<JSONObject> b;
    public Map<String, mw5> c;
    public Object d;
    public int e;
    public ql6 f;
    public String g;
    public String h;
    public f i;
    public int k;
    public int l;
    public ov5 m;
    public kb6 o;
    public a p;
    public DXTemplateItem q;
    public int j = 0;
    public int n = -1;
    public int r = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXRefreshType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public DXTemplateItem f7293a;
        public JSONObject b;
        public f c;

        static {
            t2o.a(444596554);
        }
    }

    static {
        t2o.a(444596553);
        t2o.a(444597887);
    }

    public DXRuntimeContext(av5 av5Var) {
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba14c7b7", new Object[]{this});
        }
        if (p() == null || i() == null) {
            return "";
        }
        return p().f7343a + "_" + p().b + "_" + System.identityHashCode(i()) + "w:" + M() + "h:" + K();
    }

    public void A0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafdc9fa", new Object[]{this, aVar});
        } else {
            this.p = aVar;
        }
    }

    public lub B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lub) ipChange.ipc$dispatch("10322034", new Object[]{this});
        }
        if (s() == null) {
            return null;
        }
        return s().h();
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd985600", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public View D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89cf52db", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.f7292a;
        if (dXWidgetNode == null) {
            return null;
        }
        if (this.p != null) {
            return dXWidgetNode.getNativeView();
        }
        if (eb5.w()) {
            DXWidgetNode dXWidgetNode2 = this.f7292a;
            if (dXWidgetNode2 == null || dXWidgetNode2.getFlattenNode() == null) {
                return null;
            }
            return this.f7292a.getFlattenNode().z();
        }
        DXWidgetNode y = y();
        if (y == null || y.getWRView() == null) {
            return null;
        }
        return y.getWRView().get();
    }

    public vy8 E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vy8) ipChange.ipc$dispatch("e8125baf", new Object[]{this});
        }
        return this.o.o;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1a46b94", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public DXLongSparseArray<evb> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("4bee4d0f", new Object[]{this});
        }
        return this.o.f;
    }

    public DXWidgetNode H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("aeb0ff5a", new Object[]{this});
        }
        if (L() == null) {
            return null;
        }
        return L().getExpandWidgetNode();
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c65a479", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a36360", new Object[]{this})).intValue();
        }
        return this.o.c;
    }

    public int K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd0e8074", new Object[]{this})).intValue();
        }
        int i = this.o.b;
        if (i == 0) {
            return pb6.i();
        }
        return i;
    }

    public DXRootView L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("52cdab33", new Object[]{this});
        }
        WeakReference<DXRootView> weakReference = this.o.q;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d26c823", new Object[]{this})).intValue();
        }
        int i = this.o.f22533a;
        if (i == 0) {
            return pb6.j();
        }
        return i;
    }

    public kb6 N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kb6) ipChange.ipc$dispatch("acd22bb1", new Object[]{this});
        }
        return this.o;
    }

    public Object O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5618c037", new Object[]{this});
        }
        return this.d;
    }

    public int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8bef4f8", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public ql6 Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ql6) ipChange.ipc$dispatch("3c513063", new Object[]{this});
        }
        return this.f;
    }

    public String R() {
        DXTemplateItem dXTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a67390ae", new Object[]{this});
        }
        a aVar = this.p;
        if (aVar != null) {
            dXTemplateItem = aVar.f7293a;
        } else {
            dXTemplateItem = this.q;
        }
        if (dXTemplateItem == null) {
            return "tplNUll";
        }
        return dXTemplateItem.d();
    }

    public fl6 S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fl6) ipChange.ipc$dispatch("bed6a089", new Object[]{this});
        }
        return this.o.n;
    }

    public int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("636c93c4", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72a8df58", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public DXWidgetNode W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("99cab402", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.f7292a;
        if (dXWidgetNode == null) {
            return null;
        }
        if (!dXWidgetNode.isFlatten()) {
            return this.f7292a;
        }
        return this.f7292a.getReferenceNode();
    }

    public DXLongSparseArray<qub> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("4167c168", new Object[]{this});
        }
        return this.o.e;
    }

    public void a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340e00e6", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            this.o = dXRuntimeContext.o;
        }
    }

    public DXRuntimeContext b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("82e4c948", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext dXRuntimeContext = new DXRuntimeContext(s());
        dXRuntimeContext.o = this.o;
        dXRuntimeContext.p = this.p;
        dXRuntimeContext.f7292a = dXWidgetNode;
        dXRuntimeContext.b = this.b;
        dXRuntimeContext.d = this.d;
        dXRuntimeContext.e = this.e;
        dXRuntimeContext.i = this.i;
        dXRuntimeContext.n0(this.j);
        dXRuntimeContext.l = this.l;
        dXRuntimeContext.k = this.k;
        dXRuntimeContext.c = this.c;
        dXRuntimeContext.n = this.n;
        dXRuntimeContext.q = this.q;
        dXRuntimeContext.r = this.r;
        dXRuntimeContext.f = this.f;
        return dXRuntimeContext;
    }

    public boolean b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ec146f", new Object[]{this})).booleanValue();
        }
        int i = this.l;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.o.d;
    }

    public DXRuntimeContext c0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("a50132fc", new Object[]{this, str, str2});
        }
        kb6 kb6Var = this.o;
        if (kb6Var.p == null) {
            kb6Var.p = new ConcurrentHashMap();
        }
        this.o.p.put(str, str2);
        return this;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbacdd01", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.g) || p() == null || i() == null)) {
            this.g = p().f7343a + "_" + p().b + "_" + System.identityHashCode(i()) + "w:" + M() + "h:" + K();
        }
        return this.g;
    }

    public void d0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.o.h = new WeakReference<>(context);
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d664f82d", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.h) || p() == null || O() == null)) {
            this.h = p().f7343a + "_" + p().b + "_" + System.identityHashCode(O()) + "w:" + M() + "h:" + K();
        }
        return this.h;
    }

    public void e0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc7757", new Object[]{this, dVar});
        } else {
            this.o.k = new WeakReference<>(dVar);
        }
    }

    public DXEngineConfig f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("2f487a5b", new Object[]{this});
        }
        if (s() == null) {
            return null;
        }
        return s().c();
    }

    public void f0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            this.b = new WeakReference<>(jSONObject);
        }
        a aVar = this.p;
        if (aVar != null) {
            aVar.b = jSONObject;
        }
    }

    public SparseArray<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("f73660e1", new Object[]{this});
        }
        g76 dxOriginTreeProperty = this.f7292a.getDxOriginTreeProperty();
        if (dxOriginTreeProperty != null) {
            return dxOriginTreeProperty.a();
        }
        return null;
    }

    public void g0(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb76a07", new Object[]{this, fVar});
        } else {
            this.i = fVar;
        }
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.o.h;
        if (weakReference == null || weakReference.get() == null) {
            return DinamicXEngine.x();
        }
        return this.o.h.get();
    }

    public void h0(WeakReference<m> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a22ca9", new Object[]{this, weakReference});
        } else {
            this.o.j = weakReference;
        }
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        a aVar = this.p;
        if (aVar != null) {
            return aVar.b;
        }
        WeakReference<JSONObject> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void i0(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213e393", new Object[]{this, dXTemplateItem});
            return;
        }
        a aVar = this.p;
        if (aVar != null) {
            aVar.f7293a = dXTemplateItem;
        } else {
            this.q = dXTemplateItem;
        }
    }

    public fvb j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvb) ipChange.ipc$dispatch("f3e32216", new Object[]{this});
        }
        if (s() == null) {
            return null;
        }
        return s().i();
    }

    public void j0(Map<String, mw5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7316d913", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public d k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("10e7c55", new Object[]{this});
        }
        WeakReference<d> weakReference = this.o.k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void k0(ov5 ov5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc751bd", new Object[]{this, ov5Var});
        } else {
            this.m = ov5Var;
        }
    }

    public ph5 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph5) ipChange.ipc$dispatch("fabcb241", new Object[]{this});
        }
        WeakReference<ph5> weakReference = this.o.i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c49780a", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public f m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c56b4755", new Object[]{this});
        }
        a aVar = this.p;
        if (aVar != null) {
            return aVar.c;
        }
        return this.i;
    }

    public void m0(vy8 vy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725e8777", new Object[]{this, vy8Var});
        } else {
            this.o.o = vy8Var;
        }
    }

    public Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("99e82c7", new Object[]{this});
        }
        return this.o.p;
    }

    public void n0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b6448e", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public m o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("676df99d", new Object[]{this});
        }
        WeakReference<m> weakReference = this.o.j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void o0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244bf449", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public DXTemplateItem p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("e3552b21", new Object[]{this});
        }
        a aVar = this.p;
        if (aVar != null) {
            return aVar.f7293a;
        }
        return this.q;
    }

    public void p0(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dd9ab1", new Object[]{this, dXRootView});
            return;
        }
        kb6 kb6Var = this.o;
        if (kb6Var != null) {
            kb6Var.q = new WeakReference<>(dXRootView);
        }
    }

    @Deprecated
    public Object q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ea6f751", new Object[]{this});
        }
        return this.o.m;
    }

    public void q0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1a65eb", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    public DinamicXEngine r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        av5 s = s();
        if (s == null) {
            return null;
        }
        return s.f();
    }

    public void r0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab62b12", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public av5 s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (av5) ipChange.ipc$dispatch("351370a9", new Object[]{this});
        }
        return this.o.l;
    }

    public void s0(ql6 ql6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f21c95", new Object[]{this, ql6Var});
        } else {
            this.f = ql6Var;
        }
    }

    public Map<String, mw5> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a9d7873", new Object[]{this});
        }
        return this.c;
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586b18c6", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public ov5 u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ov5) ipChange.ipc$dispatch("f8e85b13", new Object[]{this});
        }
        return this.m;
    }

    public void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d8f3b2", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public DXLongSparseArray<mvb> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("4492bbbe", new Object[]{this});
        }
        WeakReference<DXLongSparseArray<mvb>> weakReference = this.o.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void v0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.f7292a = dXWidgetNode;
        }
    }

    public mvb w(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mvb) ipChange.ipc$dispatch("a5e0b4ad", new Object[]{this, new Long(j)});
        }
        WeakReference<DXLongSparseArray<mvb>> weakReference = this.o.g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.o.g.get().get(j);
    }

    public boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28bcafe0", new Object[]{this})).booleanValue();
        }
        if (j() != null) {
            return true;
        }
        return false;
    }

    public SparseArray<byte[]> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("ca60ae12", new Object[]{this});
        }
        g76 dxOriginTreeProperty = this.f7292a.getDxOriginTreeProperty();
        if (dxOriginTreeProperty != null) {
            return dxOriginTreeProperty.b();
        }
        return null;
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3c064f", new Object[]{this, new Integer(i)});
        } else {
            this.o.b = i;
        }
    }

    public final DXWidgetNode y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c9b16a74", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.f7292a;
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode.isFlatten()) {
            return this.f7292a;
        }
        return this.f7292a.getReferenceNode();
    }

    public void y0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0430386", new Object[]{this, new Integer(i)});
        } else {
            this.o.f22533a = i;
        }
    }

    public wx5 z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wx5) ipChange.ipc$dispatch("853ec54d", new Object[]{this, new Integer(i)});
        }
        g76 dxOriginTreeProperty = this.f7292a.getDxOriginTreeProperty();
        if (dxOriginTreeProperty == null || dxOriginTreeProperty.d() == null) {
            return null;
        }
        return dxOriginTreeProperty.d().get(i);
    }

    public DXRuntimeContext z0(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("7326849f", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext dXRuntimeContext = new DXRuntimeContext(s());
        dXRuntimeContext.o = this.o;
        dXRuntimeContext.p = new a();
        dXRuntimeContext.f7292a = dXWidgetNode;
        dXRuntimeContext.b = this.b;
        dXRuntimeContext.d = this.d;
        dXRuntimeContext.e = this.e;
        dXRuntimeContext.i = this.i;
        dXRuntimeContext.n0(this.j);
        dXRuntimeContext.l = this.l;
        dXRuntimeContext.k = this.k;
        dXRuntimeContext.c = this.c;
        dXRuntimeContext.n = this.n;
        dXRuntimeContext.q = this.q;
        dXRuntimeContext.r = this.r;
        dXRuntimeContext.f = this.f;
        return dXRuntimeContext;
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6f13369", new Object[]{this});
        }
        if (this.o.e == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < this.o.e.size(); i++) {
            jSONObject.put(String.valueOf(this.o.e.keyAt(i)), (Object) this.o.e.valueAt(i).getClass().getName());
        }
        return jSONObject.toJSONString();
    }

    public boolean Y() {
        f fVar;
        List<f.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        a aVar = this.p;
        if (aVar != null) {
            fVar = aVar.c;
        } else {
            fVar = this.i;
        }
        return (fVar == null || (list = fVar.c) == null || list.size() <= 0) ? false : true;
    }

    public boolean Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f02d4682", new Object[]{this, str})).booleanValue();
        }
        if (!p().i(str)) {
            return false;
        }
        if (L() instanceof DXButterRootView) {
            return true;
        }
        la6.b("开关不一致，createview 阶段关闭，renderTemplate 阶段开启" + R());
        return false;
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e62b91", new Object[]{this})).booleanValue();
        }
        if (s() == null || s().c() == null || !s().c().G()) {
            return W() != null && W().isOpenNewFastReturnLogic();
        }
        return true;
    }
}
