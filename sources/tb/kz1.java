package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradePriceViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeRichTextViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g2s;
import tb.h4l;
import tb.twl;
import tb.xxr;
import tb.z1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class kz1 implements fdd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_CONTEXT_KEY_PRESENTER = "dianmicContextKeyPresenter";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f23014a;
    public ct1 b;
    public BaseViewManager c;
    public bpt d;
    public mcu e;
    public String f;
    public spq g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ux f23015a;

        static {
            t2o.a(155189367);
        }

        public a(ux uxVar) {
            this.f23015a = uxVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1000274106) {
                return new Boolean(super.e(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
            }
            if (hashCode == -882511587) {
                super.j((JSONObject) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/presenter/BasePresenter$NextRpcCallback");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else {
                this.f23015a.a(i, mtopResponse, obj, z, map);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                this.f23015a.b(i, mtopResponse, obj, fsbVar, map);
            }
        }

        @Override // tb.ux
        public void c(List<JSONObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daca3f86", new Object[]{this, list});
            } else if (list != null) {
                kz1.this.b.f(list);
                fsb j = kz1.this.j();
                if (j != null) {
                    String bizName = j.getBizName();
                    hav.d(bizName, "异步数据刷新，个数=" + list.size());
                }
                kz1.this.x(j);
            }
        }

        @Override // tb.ux
        public boolean e(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4610746", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                return uxVar.e(i, mtopResponse, obj);
            }
            return super.e(i, mtopResponse, obj);
        }

        @Override // tb.ux
        public void g(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("608b8323", new Object[]{this, streamOtherResponse});
                return;
            }
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                uxVar.g(streamOtherResponse);
            }
        }

        @Override // tb.ux
        public void h(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8700e9de", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                uxVar.h(i, mtopResponse, obj);
            }
        }

        @Override // tb.ux
        public void i(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c18694c3", new Object[]{this, new Integer(i), mtopResponse, obj, map});
                return;
            }
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                uxVar.i(i, mtopResponse, obj, map);
            }
        }

        @Override // tb.ux
        public void j(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb65f11d", new Object[]{this, jSONObject});
                return;
            }
            super.j(jSONObject);
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                uxVar.j(jSONObject);
            }
        }

        @Override // tb.ux
        public void l(fsb fsbVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64a3aac8", new Object[]{this, fsbVar, streamRemoteMainResponse, list});
                return;
            }
            ux uxVar = this.f23015a;
            if (uxVar != null) {
                uxVar.l(fsbVar, streamRemoteMainResponse, list);
            }
        }

        @Override // tb.ux
        public boolean n(String str, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a91f55b", new Object[]{this, str, list})).booleanValue();
            }
            return this.f23015a.n(str, list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends spq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(155189368);
        }

        public b(Context context, String str) {
            super(context, str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1976831329) {
                super.c((etd) objArr[0], (ux) objArr[1]);
                return null;
            } else if (hashCode == -340779013) {
                super.b((etd) objArr[0], objArr[1], (ux) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/trade/presenter/BasePresenter$StreamUltronRequestClient");
            }
        }

        @Override // tb.spq
        public void b(etd etdVar, Object obj, ux uxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb01ffb", new Object[]{this, etdVar, obj, uxVar});
            } else {
                super.b(etdVar, obj, new a(uxVar));
            }
        }

        @Override // tb.spq
        public void c(etd etdVar, ux uxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a2bf29f", new Object[]{this, etdVar, uxVar});
            } else {
                super.c(etdVar, new a(uxVar));
            }
        }
    }

    static {
        t2o.a(155189366);
        t2o.a(155189374);
        t2o.a(83886085);
    }

    public kz1(Activity activity) {
        this(activity, null);
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7051078", new Object[]{this});
            return;
        }
        this.c.X(TradePriceViewConstructor.VIEW_TAG, new TradePriceViewConstructor());
        this.c.X(TradeRichTextViewConstructor.VIEW_TAG, new TradeRichTextViewConstructor());
        this.c.X(TradeTextInputConstructor.VIEW_TAG, new TradeTextInputConstructor());
        this.c.Z(z1s.DX_WIDGET_ID, new z1s.a());
        this.c.Z(g2s.DX_WIDGET_ID, new g2s.a());
        this.c.Z(xxr.DX_WIDGET_ID, new xxr.e());
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc16af3c", new Object[]{this});
        } else {
            duv.a().b(new xtv());
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de05d9b5", new Object[]{this, str});
        } else if (m() == null) {
            this.g = new b(this.f23014a, str);
        }
    }

    public void D(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfe4c0a", new Object[]{this, str, z9eVar});
        } else {
            this.c.I(str, z9eVar);
        }
    }

    public void E(String str, qbe qbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a57b02", new Object[]{this, str, qbeVar});
        } else {
            this.c.J(str, qbeVar);
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
            return;
        }
        this.f = str;
        BaseViewManager baseViewManager = this.c;
        if (baseViewManager != null) {
            baseViewManager.M(str);
        }
    }

    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46af6d3", new Object[]{this, new Integer(i)});
        } else {
            this.c.Q(i);
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb9fd24", new Object[]{this});
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b8ce71", new Object[]{this});
            return;
        }
        spq m = m();
        if (m == null) {
            m = this.g;
        }
        if (m != null) {
            m.a();
        }
    }

    @Override // tb.fdd
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbb6018", new Object[]{this, iDMComponent});
        } else {
            this.b.g(iDMComponent);
        }
    }

    @Override // tb.fdd
    public fsb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("b8d7dd5a", new Object[]{this});
        }
        return this.b.c();
    }

    @Override // tb.fdd
    public ct1 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct1) ipChange.ipc$dispatch("e8f7e1cb", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.fdd
    public BaseViewManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseViewManager) ipChange.ipc$dispatch("7fe08c81", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.fdd
    public bpt f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpt) ipChange.ipc$dispatch("c4475383", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.fdd
    public mcu g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcu) ipChange.ipc$dispatch("525bb466", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.fdd
    public Activity getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.f23014a;
    }

    public lcu h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("1095c580", new Object[]{this});
        }
        return this.e.d();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9092a4c", new Object[]{this});
        }
    }

    public fsb j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("d0d51af9", new Object[]{this});
        }
        ct1 ct1Var = this.b;
        if (ct1Var == null) {
            return null;
        }
        return ct1Var.c;
    }

    public twl.b k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twl.b) ipChange.ipc$dispatch("54e61c8", new Object[]{this});
        }
        return null;
    }

    public h4l.b l(gsb gsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4l.b) ipChange.ipc$dispatch("a983b1e3", new Object[]{this, gsbVar});
        }
        return null;
    }

    public spq m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spq) ipChange.ipc$dispatch("594f00ba", new Object[]{this});
        }
        return this.g;
    }

    public void n(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5e7e5e", new Object[]{this, iDMComponent, str});
        }
    }

    public boolean o() {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3a97594", new Object[]{this})).booleanValue();
        }
        fsb c = this.b.c();
        if (c == null || (components = c.getComponents()) == null || components.size() <= 0) {
            return false;
        }
        return true;
    }

    public void p(ct1 ct1Var, BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97923c24", new Object[]{this, ct1Var, baseViewManager});
            return;
        }
        this.b = ct1Var;
        this.c = baseViewManager;
        bpt w = w();
        this.d = w;
        if (w == null) {
            this.d = new bpt(this.f23014a);
        }
        mcu mcuVar = new mcu(this);
        this.e = mcuVar;
        this.c.H(mcuVar);
        A();
        z();
        q();
        y();
        B();
    }

    public void q() {
        Map<String, Class<? extends qtd>> a2 = ql8.a();
        if (a2 != null && !a2.isEmpty()) {
            try {
                for (Map.Entry<String, Class<? extends qtd>> entry : a2.entrySet()) {
                    this.e.c(entry.getKey(), (qtd) entry.getValue().newInstance());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void r(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        } else {
            this.c.w(linearLayout, recyclerView, linearLayout2);
        }
    }

    public void s(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.e.l(i, i2, intent);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        mcu mcuVar = this.e;
        if (mcuVar != null) {
            mcuVar.f();
        }
        BaseViewManager baseViewManager = this.c;
        if (baseViewManager != null) {
            baseViewManager.m();
        }
        Activity activity = this.f23014a;
        if (activity != null) {
            z9v.u(activity).k(this.f23014a);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        BaseViewManager baseViewManager = this.c;
        if (baseViewManager != null) {
            baseViewManager.z();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            UnifyLog.j(this.f);
        }
    }

    public bpt w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpt) ipChange.ipc$dispatch("ed111d4e", new Object[]{this});
        }
        return null;
    }

    public void x(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2868fc", new Object[]{this, fsbVar});
        } else {
            this.c.B(this.b.d());
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b39693", new Object[]{this});
            return;
        }
        E(gw3.BRIDGE_TAG, new gw3(this));
        E(e7a.BRIDGE_TAG, new e7a(this));
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ec01f2", new Object[]{this});
            return;
        }
        this.c.W("gradient", new mia());
        this.c.W("theme", new qot());
        this.c.W("platform", new z4m());
        this.c.Y(k06.a(t1s.PARSER_TAG), new t1s());
        this.c.Y(k06.a(s1s.PARSER_TAG), new s1s());
        this.c.Y(k06.a("theme"), new c2s());
    }

    public kz1(Activity activity, Fragment fragment) {
        this.f = "default";
        this.f23014a = activity;
        ((vc3) this).c();
        System.currentTimeMillis();
    }
}
