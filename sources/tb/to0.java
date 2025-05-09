package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class to0 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AliCartCalculateClickSubscriber";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f28834a;

        public a(long j) {
            this.f28834a = j;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/AliCartCalculateClickSubscriber$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            cb4.c(to0.p(to0.this));
            to0.q(to0.this).e().D();
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            kmb r = to0.r(to0.this);
            juv.d(r, "Page_ShoppingCart_REFRESH_CALCULATE_Response", "costTime=" + (System.currentTimeMillis() - this.f28834a));
        }
    }

    static {
        t2o.a(479199360);
    }

    public static /* synthetic */ Object ipc$super(to0 to0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/AliCartCalculateClickSubscriber");
    }

    public static /* synthetic */ fsb p(to0 to0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("39e21f4", new Object[]{to0Var});
        }
        return to0Var.d;
    }

    public static /* synthetic */ kmb q(to0 to0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("f2fa6e26", new Object[]{to0Var});
        }
        return to0Var.j;
    }

    public static /* synthetic */ kmb r(to0 to0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("ca9b2e7", new Object[]{to0Var});
        }
        return to0Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        kmb kmbVar;
        CartGlobal.ControlParas controlParas;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        IDMComponent a2 = lcuVar.a();
        if (a2 != null && (kmbVar = this.j) != null) {
            s(kmbVar, a2);
            CartGlobal w = this.k.w();
            if (w != null && (controlParas = w.getControlParas()) != null && Boolean.TRUE.toString().equals(controlParas.calcualteDetailDegrade())) {
                this.f23048a.l("cartCalculateClick");
                this.f23048a.m("isCheckInPoplayer", "true");
                this.j.k0(a2, this.f23048a, false, new a(System.currentTimeMillis()), null);
            }
        }
    }

    public final void s(kmb kmbVar, IDMComponent iDMComponent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6eba08", new Object[]{this, kmbVar, iDMComponent});
        } else if (iDMComponent != null) {
            try {
                if (iDMComponent.getEventMap() != null && iDMComponent.getEventMap().containsKey("calculateClick")) {
                    List<gsb> list = iDMComponent.getEventMap().get("popCalculateWindow");
                    String str = "";
                    for (gsb gsbVar : list) {
                        if ("openPopupWindow".equals(gsbVar.getType())) {
                            str = gsbVar.getFields().getString("nextRenderRoot");
                        }
                    }
                    if (!str.equals(this.k.z()) || !kmbVar.e().y()) {
                        List<IDMComponent> v = cb4.v(kmbVar.b());
                        JSONArray jSONArray = new JSONArray();
                        if (v != null) {
                            for (IDMComponent iDMComponent2 : v) {
                                jSONArray.add(iDMComponent2.getKey());
                            }
                        }
                        for (gsb gsbVar2 : list) {
                            List<IDMComponent> B = cb4.B(this.k, gsbVar2);
                            if (!z && B != null && !B.isEmpty()) {
                                Iterator<IDMComponent> it = B.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        IDMComponent next = it.next();
                                        if (TextUtils.equals(next.getTag(), "checkedItemList")) {
                                            JSONObject fields = next.getFields();
                                            if (fields == null) {
                                                fields = new JSONObject();
                                            }
                                            fields.put("items", (Object) jSONArray);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            kmbVar.g().h(kmbVar.g().d().l(gsbVar2.getType()).m("componentKey", this.k.u("submit").getKey()).k(gsbVar2).i(iDMComponent));
                        }
                        return;
                    }
                    kmbVar.e().k(false);
                }
            } catch (Throwable th) {
                fdv.b(TAG, "DiscountDetail", "newDiscountDetailError", "deal new discountDetail exception.", th.getMessage());
                ub3.g(TAG, th.getMessage());
            }
        }
    }
}
