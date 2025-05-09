package tb;

import com.alibaba.android.icart.core.data.model.CartOpenPopupWindowEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import tb.imb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z2l extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements imb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CartOpenPopupWindowEventModel f32492a;

        /* compiled from: Taobao */
        /* renamed from: tb.z2l$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1113a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1113a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    bd4.g(z2l.t(z2l.this));
                }
            }
        }

        public a(CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel) {
            this.f32492a = cartOpenPopupWindowEventModel;
        }

        @Override // tb.imb.a
        public void a(cfx cfxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6259ec21", new Object[]{this, cfxVar});
            } else if (cfxVar != null && !cfxVar.j()) {
                CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel = this.f32492a;
                if (cartOpenPopupWindowEventModel != null && cartOpenPopupWindowEventModel.isFilterPopLayer()) {
                    z2l.p(z2l.this).H();
                }
                cb4.Y(z2l.q(z2l.this));
                if (sca.x(z2l.r(z2l.this))) {
                    cb4.X(z2l.s(z2l.this));
                }
                pav.i(new RunnableC1113a(), 300L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements g1a<oc3, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public xhv invoke(oc3 oc3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("d420f3af", new Object[]{this, oc3Var});
            }
            if (z2l.u(z2l.this) == null) {
                return null;
            }
            bd4.g(z2l.v(z2l.this));
            return null;
        }
    }

    static {
        t2o.a(479199448);
    }

    public static /* synthetic */ Object ipc$super(z2l z2lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/OpenCartPopupWindowSubscriber");
    }

    public static /* synthetic */ zxb p(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("31a261b8", new Object[]{z2lVar});
        }
        return z2lVar.k;
    }

    public static /* synthetic */ kmb q(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("c0988494", new Object[]{z2lVar});
        }
        return z2lVar.j;
    }

    public static /* synthetic */ zxb r(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("e535fc3a", new Object[]{z2lVar});
        }
        return z2lVar.k;
    }

    public static /* synthetic */ zxb s(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("beffc97b", new Object[]{z2lVar});
        }
        return z2lVar.k;
    }

    public static /* synthetic */ kmb t(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("6c3b0797", new Object[]{z2lVar});
        }
        return z2lVar.j;
    }

    public static /* synthetic */ kmb u(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("fac68898", new Object[]{z2lVar});
        }
        return z2lVar.j;
    }

    public static /* synthetic */ kmb v(z2l z2lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("89520999", new Object[]{z2lVar});
        }
        return z2lVar.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        Exception e;
        CartOpenPopupWindowEventModel cartOpenPopupWindowEventModel;
        List<IDMComponent> B;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        gsb g = g();
        if (g != null && g.getFields() != null) {
            IDMComponent u = this.k.u("elevator");
            if (u != null && u.isNormalComponent()) {
                cb4.a0(this.k, "elevator", false);
                this.j.e().E(4);
            }
            DXRootView dXRootView = null;
            try {
                cartOpenPopupWindowEventModel = (CartOpenPopupWindowEventModel) JSON.parseObject(g.getFields().toJSONString(), CartOpenPopupWindowEventModel.class);
            } catch (Exception e2) {
                e = e2;
                cartOpenPopupWindowEventModel = null;
            }
            try {
                this.k.B().N(cartOpenPopupWindowEventModel.isNeedRefreshForNoFilter());
            } catch (Exception e3) {
                e = e3;
                UnifyLog.d("OpenCartPopupWindowSubscriber", "parse pop window event error," + e.getMessage());
                B = cb4.B(this.k, g);
                jSONObject = c().getJSONObject("options");
                if (jSONObject != null) {
                    dXRootView = bd4.c(this.j.e().q(), "submit");
                }
                if (cartOpenPopupWindowEventModel != null) {
                    B = this.j.Q().b(B);
                }
                String string = g.getFields().getString("nextRenderRoot");
                this.j.V().e();
                a aVar = new a(cartOpenPopupWindowEventModel);
                b bVar = new b();
                h1z h1zVar = new h1z();
                h1zVar.c(aVar);
                h1zVar.d(bVar);
                this.j.e().G0(dXRootView, string, B, cartOpenPopupWindowEventModel, h1zVar);
                bd4.g(this.j);
            }
            B = cb4.B(this.k, g);
            jSONObject = c().getJSONObject("options");
            if (jSONObject != null && jSONObject.getBooleanValue("cartIsAboveSubmit")) {
                dXRootView = bd4.c(this.j.e().q(), "submit");
            }
            if (cartOpenPopupWindowEventModel != null && cartOpenPopupWindowEventModel.isFilterPopLayer()) {
                B = this.j.Q().b(B);
            }
            String string2 = g.getFields().getString("nextRenderRoot");
            this.j.V().e();
            a aVar2 = new a(cartOpenPopupWindowEventModel);
            b bVar2 = new b();
            h1z h1zVar2 = new h1z();
            h1zVar2.c(aVar2);
            h1zVar2.d(bVar2);
            this.j.e().G0(dXRootView, string2, B, cartOpenPopupWindowEventModel, h1zVar2);
            bd4.g(this.j);
        }
    }
}
