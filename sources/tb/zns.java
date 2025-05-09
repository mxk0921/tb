package tb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.async.a;
import com.taobao.android.detail.ttdetail.async.mtop.MtopRequester;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zns {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f32901a;
    public final yns b;
    public JSONObject d;
    public RecyclerView f;
    public final HashMap<String, oa4<nb4>> c = new HashMap<>();
    public final HashMap<String, Integer> e = new HashMap<>();
    public final HashMap<String, Boolean> g = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912262225);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                ckf.h(jSONObject, "responseData");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements MtopRequester.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ nb4 b;
        public final /* synthetic */ com.taobao.android.detail.ttdetail.async.a c;

        public c(nb4 nb4Var, com.taobao.android.detail.ttdetail.async.a aVar) {
            this.b = nb4Var;
            this.c = aVar;
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.mtop.MtopRequester.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ckf.h(jSONObject, "responseData");
            zns.a(zns.this, this.c, this.b);
        }
    }

    static {
        t2o.a(912262224);
    }

    public zns(ze7 ze7Var, yns ynsVar) {
        ckf.h(ze7Var, "detailContext");
        ckf.h(ynsVar, "ttDetailLayoutNode");
        this.f32901a = ze7Var;
        this.b = ynsVar;
        try {
            f();
        } catch (Exception e) {
            tgh.c("TTDetailPreRequestHandler", "TTDetailPreRequestHandler init: Exception", e);
        }
    }

    public static final /* synthetic */ void a(zns znsVar, com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394a4390", new Object[]{znsVar, aVar, nb4Var});
        } else {
            znsVar.g(aVar, nb4Var);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ze7 ze7Var = this.f32901a;
        if (ze7Var != null) {
            sr2.Companion.b(ze7Var);
        }
    }

    public final JSONObject d(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2d272a58", new Object[]{this, nb4Var});
        }
        JSONObject f = yc4.f(nb4Var);
        if (f == null || f.isEmpty()) {
            return yc4.n(nb4Var);
        }
        return f;
    }

    public final void e(int i, int i2, int i3) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b00e388", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        try {
            if (this.d != null) {
                for (String str : this.e.keySet()) {
                    Boolean bool = Boolean.TRUE;
                    if (!ckf.b(this.g.get(str), bool) && (recyclerView = this.f) != null) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                            if (findLastVisibleItemPosition >= 0) {
                                Integer num = this.e.get(str);
                                if (num == null) {
                                    num = 0;
                                }
                                if (ckf.i(findLastVisibleItemPosition, num.intValue()) < 0) {
                                }
                            }
                            oa4<nb4> oa4Var = this.c.get(str);
                            if (oa4Var instanceof hrj) {
                                ((hrj) oa4Var).x();
                                HashMap<String, Boolean> hashMap = this.g;
                                ckf.c(str, "key");
                                hashMap.put(str, bool);
                            } else if ((oa4Var instanceof DinamicXComponent) && ((DinamicXComponent) oa4Var).getComponentData() != null && yc4.p(((DinamicXComponent) oa4Var).getComponentData())) {
                                nb4 componentData = ((DinamicXComponent) oa4Var).getComponentData();
                                ckf.c(componentData, "component.componentData");
                                JSONObject d = d(componentData);
                                if (d != null) {
                                    com.taobao.android.detail.ttdetail.async.a aVar = new com.taobao.android.detail.ttdetail.async.a(d);
                                    nb4 componentData2 = ((DinamicXComponent) oa4Var).getComponentData();
                                    ckf.c(componentData2, "component.componentData");
                                    if (c(componentData2)) {
                                        nb4 componentData3 = ((DinamicXComponent) oa4Var).getComponentData();
                                        ckf.c(componentData3, "component.componentData");
                                        h(aVar, componentData3);
                                    } else {
                                        nb4 componentData4 = ((DinamicXComponent) oa4Var).getComponentData();
                                        ckf.c(componentData4, "component.componentData");
                                        g(aVar, componentData4);
                                    }
                                    HashMap<String, Boolean> hashMap2 = this.g;
                                    ckf.c(str, "key");
                                    hashMap2.put(str, bool);
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                }
            }
        } catch (Exception e) {
            tgh.c("TTDetailPreRequestHandler", "handlePreRequest: Exception", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zns.f():void");
    }

    public final void g(com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var) {
        a.c c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0eb76b", new Object[]{this, aVar, nb4Var});
        } else if (aVar != null && (c2 = aVar.c()) != null) {
            new sr2(this.f32901a, c2, nb4Var).m(new b());
        }
    }

    public final void h(com.taobao.android.detail.ttdetail.async.a aVar, nb4 nb4Var) {
        a.C0351a a2;
        a.c a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104ae06e", new Object[]{this, aVar, nb4Var});
        } else if (aVar != null && (a2 = aVar.a()) != null && (a3 = a2.a()) != null) {
            new sr2(this.f32901a, a3, nb4Var).m(new c(nb4Var, aVar));
        }
    }

    public final boolean c(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71132a88", new Object[]{this, nb4Var})).booleanValue();
        }
        List<ir> b2 = nb4Var.b(AsyncProcessor.EVENT_LIST_NAME);
        if (b2 != null) {
            for (ir irVar : b2) {
                ckf.c(irVar, "abilityParam");
                if (ckf.b("shopRecommendV2", irVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }
}
