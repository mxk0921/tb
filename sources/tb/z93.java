package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.event.model.ConfirmDialogModel;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z93 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends gmb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kmb f32622a;
        public final /* synthetic */ lcu b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ JSONObject d;

        public a(kmb kmbVar, lcu lcuVar, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f32622a = kmbVar;
            this.b = lcuVar;
            this.c = jSONObject;
            this.d = jSONObject2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAdjustOperateSubscriber$1");
        }

        @Override // tb.gmb, tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ub3.g("CartAdjustOperateSubscriber", "弹窗出错," + errorResult.getMsg());
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
            } else {
                z93.p(z93.this, this.f32622a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends gmb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lcu f32623a;

        public b(lcu lcuVar) {
            this.f32623a = lcuVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAdjustOperateSubscriber$2");
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
                return;
            }
            gsb y = cb4.y(z93.r(z93.this).j().getComponentByName(z93.q(z93.this).getKey()), this.f32623a.g(), this.f32623a.d());
            if (y != null) {
                this.f32623a.k(y);
            }
            z93.s(z93.this, this.f32623a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f32624a;

        public c(List list) {
            this.f32624a = list;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAdjustOperateSubscriber$3");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            lbq.b(c9x.CART_BIZ_NAME, "AdjustOperate", retCode, retMsg);
            hav.g(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber", "#onError,", retCode, ",", retMsg);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            hav.g(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber", "#onSuccess");
            for (IDMComponent iDMComponent : this.f32624a) {
                z93.t(z93.this).Q(iDMComponent);
            }
            z93.u(z93.this).V().g();
        }
    }

    static {
        t2o.a(479199368);
    }

    public static /* synthetic */ Object ipc$super(z93 z93Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartAdjustOperateSubscriber");
    }

    public static /* synthetic */ void p(z93 z93Var, kmb kmbVar, lcu lcuVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125979e7", new Object[]{z93Var, kmbVar, lcuVar, jSONObject, jSONObject2});
        } else {
            z93Var.w(kmbVar, lcuVar, jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ IDMComponent q(z93 z93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("6ff473cc", new Object[]{z93Var});
        }
        return z93Var.e;
    }

    public static /* synthetic */ kmb r(z93 z93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("4e835c52", new Object[]{z93Var});
        }
        return z93Var.j;
    }

    public static /* synthetic */ void s(z93 z93Var, lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956e597f", new Object[]{z93Var, lcuVar});
        } else {
            z93Var.x(lcuVar);
        }
    }

    public static /* synthetic */ zxb t(z93 z93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("32623139", new Object[]{z93Var});
        }
        return z93Var.k;
    }

    public static /* synthetic */ kmb u(z93 z93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("dbe0c415", new Object[]{z93Var});
        }
        return z93Var.j;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (lcuVar == null) {
            ub3.g("CartAdjustOperateSubscriber", "tradeEvent is null");
        } else {
            hav.g(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber", "#start,triggerArea=", lcuVar.g(), ",eventType=", lcuVar.d());
            IDMComponent iDMComponent = this.e;
            if (iDMComponent == null) {
                hav.g(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber", "#mComponent为空");
            } else if (z(iDMComponent)) {
                v(lcuVar);
            } else if (A(lcuVar)) {
                hav.g(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber", "#confirm dialog");
            } else {
                x(lcuVar);
            }
        }
    }

    public final void v(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72c3343", new Object[]{this, lcuVar});
            return;
        }
        kmb kmbVar = this.j;
        if (kmbVar != null) {
            Object c2 = lcuVar.c();
            if (!(c2 instanceof DMEvent)) {
                hav.a("CartAdjustOperateSubscriber", "eventParams类型错误");
                return;
            }
            JSONObject fields = ((DMEvent) c2).getFields();
            if (fields == null) {
                hav.a("CartAdjustOperateSubscriber", "fields为空");
                return;
            }
            JSONObject jSONObject = fields.getJSONObject("operateConfirmDialog");
            if (jSONObject == null) {
                hav.a("CartAdjustOperateSubscriber", "operateConfirmDialog为空");
                return;
            }
            xk0 a2 = xk0.a();
            a2.f31435a = jSONObject.getString("title");
            a2.b = jSONObject.getString("message");
            a2.e = jSONObject.getString("cancelBtn");
            a2.d = jSONObject.getString("confirmBtn");
            bii.a().b(kmbVar.getContext(), a2, new a(kmbVar, lcuVar, fields, jSONObject));
        }
    }

    public final List<IDMComponent> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("88a22e8e", new Object[]{this});
        }
        String tag = this.e.getTag();
        HashSet hashSet = new HashSet();
        if ("submit".equals(tag)) {
            List<IDMComponent> v = cb4.v(this.d);
            if (v != null) {
                hashSet.addAll(v);
            }
        } else if (FactoryType.TYPE_INVALID.equals(tag)) {
            List<IDMComponent> n = ((u55) this.d).n();
            if (n != null) {
                for (IDMComponent iDMComponent : n) {
                    if (iDMComponent != null && "invalidItem".equals(iDMComponent.getTag())) {
                        hashSet.add(iDMComponent);
                    }
                }
            }
        } else {
            hashSet.addAll(cb4.D(this.e, this.j));
        }
        return new ArrayList(hashSet);
    }

    public final void w(kmb kmbVar, lcu lcuVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15d7b5", new Object[]{this, kmbVar, lcuVar, jSONObject, jSONObject2});
            return;
        }
        fsb fsbVar = this.d;
        if (fsbVar instanceof u55) {
            if (((u55) fsbVar).getRootComponent() == null) {
                hav.a("CartAdjustOperateSubscriber", "找不到root");
                return;
            }
            String string = jSONObject2.getString("loadingMessage");
            List<IDMComponent> z = cb4.z((u55) fsbVar);
            if (z == null) {
                hav.a("CartAdjustOperateSubscriber", "没有失效商品");
                return;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
            if (jSONObject3 == null) {
                hav.a("CartAdjustOperateSubscriber", ",customExParams为空");
                jSONObject3 = new JSONObject();
            }
            HashMap hashMap = new HashMap();
            hashMap.put(RequestConfig.CUSTOM_EXPARAMS, jSONObject3.toJSONString());
            HashMap hashMap2 = new HashMap();
            List<String> b2 = bd4.b(z);
            hashMap2.put("operateItems", b2);
            lcuVar.m("operateItems", b2);
            n(g(), hashMap2);
            fe3 fe3Var = new fe3();
            fe3Var.k(this.e);
            fe3Var.h(lcuVar);
            fe3Var.j(true);
            fe3Var.i(string);
            fe3Var.g(hashMap);
            kmbVar.l0(fe3Var, null);
        }
    }

    public final void x(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f413a3f6", new Object[]{this, lcuVar});
            return;
        }
        if (FactoryType.TYPE_INVALID.equals(this.e.getTag())) {
            if (lcuVar.g().equals("addFavorClick")) {
                juv.b(this.j, "Page_ShoppingCart_InvalidTitle_AddFavor", new String[0]);
            } else if (lcuVar.g().equals("deleteClick")) {
                juv.b(this.j, "Page_ShoppingCart_InvalidTitle_Clear", new String[0]);
            }
        }
        List<IDMComponent> y = y();
        List<String> b2 = bd4.b(y);
        if (b2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("operateItems", b2);
            lcuVar.m("operateItems", b2);
            n(g(), hashMap);
            hav.f(c9x.CART_BIZ_NAME, "CartAdjustOperateSubscriber#sendRespondRequest", hashMap);
            this.j.k0(this.e, lcuVar, true, new c(y), null);
        }
    }

    public final boolean A(lcu lcuVar) {
        IDMComponent iDMComponent;
        ConfirmDialogModel confirmDialogModel;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1182803d", new Object[]{this, lcuVar})).booleanValue();
        }
        gsb g = g();
        if (g == null) {
            return false;
        }
        Integer num = -1;
        List<IDMComponent> y = y();
        if (y == null || y.isEmpty()) {
            String q = Localization.q(R.string.taobao_app_1028_1_21669);
            be3.c(this.b, q);
            ub3.f(q);
            return false;
        }
        int size = y.size();
        JSONObject jSONObject = null;
        if (size > 0) {
            iDMComponent = null;
            for (IDMComponent iDMComponent2 : y) {
                Integer num2 = (Integer) cb4.x(iDMComponent2, Integer.class, "cancelTextPriority");
                if (num2 != null && num2.intValue() > num.intValue()) {
                    iDMComponent = iDMComponent2;
                    num = num2;
                }
            }
        } else {
            iDMComponent = null;
        }
        if (iDMComponent != null && num.intValue() >= 0 && iDMComponent.getEventMap() != null) {
            Iterator<gsb> it = iDMComponent.getEventMap().get(this.f23048a.g()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                gsb next = it.next();
                if (next != null && "cartAdjustOperate".equals(next.getType())) {
                    jSONObject = next.getFields().getJSONObject("operateConfirmDialog");
                    break;
                }
            }
        } else {
            jSONObject = g.getFields().getJSONObject("operateConfirmDialog");
        }
        if (jSONObject == null || jSONObject.isEmpty() || (confirmDialogModel = (ConfirmDialogModel) JSON.toJavaObject(jSONObject, ConfirmDialogModel.class)) == null || !(this.b instanceof Activity)) {
            return false;
        }
        try {
            str = String.format(confirmDialogModel.getMessage(), Integer.valueOf(size));
        } catch (Exception unused) {
            str = confirmDialogModel.getMessage();
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(confirmDialogModel.getTitle())) {
            str = confirmDialogModel.getTitle();
        }
        xk0 a2 = xk0.a();
        a2.b = str;
        a2.f31435a = confirmDialogModel.getTitle();
        a2.e = confirmDialogModel.getCancelBtn();
        a2.d = confirmDialogModel.getConfirmBtn();
        bii.a().b((Activity) this.b, a2, new b(lcuVar));
        try {
            hdv.a().commitFeedback(c9x.CART_BIZ_NAME, str, UmTypeKey.DIALOG, "biz", confirmDialogModel.getTitle());
        } catch (Throwable unused2) {
        }
        return true;
    }

    public final boolean z(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117df29", new Object[]{this, iDMComponent})).booleanValue();
        }
        return "submit".equals(iDMComponent.getTag()) && (fields = iDMComponent.getFields()) != null && "invalidTab".equals(fields.getString("type"));
    }
}
