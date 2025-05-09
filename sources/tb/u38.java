package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.detail.rate.vivid.ability.RegisterReceiverAbility;
import com.taobao.detail.rate.vivid.ability.XRateTranslateAbility;
import com.taobao.detail.rate.widget.DXMegaVideoWidgetNodeV2;
import com.taobao.statistic.TBS;
import java.util.Iterator;
import java.util.List;
import tb.a38;
import tb.ahn;
import tb.fgn;
import tb.ggn;
import tb.ifp;
import tb.lht;
import tb.rmx;
import tb.svp;
import tb.tmx;
import tb.vno;
import tb.xz4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u38 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final u38 INSTANCE = new u38();
    public static final String NAME_SPACE = "swifty_rate_kit";

    public final q26 a(int i, int i2, double d, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q26) ipChange.ipc$dispatch("3e4e70e0", new Object[]{this, new Integer(i), new Integer(i2), new Double(d), new Integer(i3), new Integer(i4)});
        }
        q26 q26Var = new q26();
        q26Var.f26456a = i;
        q26Var.b = i2;
        if (i3 != q26Var.d) {
            q26Var.c = kl6.f(DXWidgetNode.getAbsoluteGravity(i3, i4));
            q26Var.d = i3;
        }
        return q26Var;
    }

    public final DinamicXEngine b(y7 y7Var, RegisterReceiverAbility.a aVar, Context context) {
        int i = 2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("9f36ee1b", new Object[]{this, y7Var, aVar, context});
        }
        ufp ufpVar = ufp.INSTANCE;
        boolean a2 = ufpVar.a();
        boolean z2 = !a2;
        boolean b = onm.INSTANCE.b();
        boolean z3 = context != null && n9l.INSTANCE.I() && zhn.w(context);
        d1g d1gVar = d1g.INSTANCE;
        DXEngineConfig.b R = new DXEngineConfig.b(d1gVar.a()).Q(1).J(y7Var).g0(b).R(z2);
        n9l n9lVar = n9l.INSTANCE;
        if (!n9lVar.X() && !b) {
            i = 0;
        }
        DXEngineConfig.b b0 = R.j0(i).V(n9lVar.M()).X(d1gVar.b()).Y(d1gVar.c()).b0(b);
        xgn xgnVar = xgn.INSTANCE;
        if (xgnVar.o() && !a2) {
            z = true;
        }
        DXEngineConfig F = b0.W(z).H(z3, z3).a0(xgnVar.i() ? 1 : 0).F();
        ckf.f(F, "DXEngineConfig.Builder(K…\n                .build()");
        DinamicXEngine dinamicXEngine = new DinamicXEngine(F);
        if (z3 && (context instanceof Activity)) {
            dinamicXEngine.l1((Activity) context);
        }
        dinamicXEngine.V0(xn5.DX_PARSER_LIST_FILTER, new xn5());
        dinamicXEngine.V0(kr5.DX_PARSER_TBORANGE, new kr5());
        dinamicXEngine.V0(qn5.DX_PARSER_KV2JSON, new qn5());
        dinamicXEngine.V0(nn5.Companion.a(), new nn5());
        dinamicXEngine.V0(m96.Companion.a(), new m96());
        dinamicXEngine.V0(rp5.Companion.a(), new rp5());
        dinamicXEngine.V0(vm5.DX_PARSER_INDEXOFVALUEFORKEYPATH, new vm5());
        dinamicXEngine.V0(vm5.DX_PARSER_INDEXOFVALUEFORKEYPATH, new vm5());
        dinamicXEngine.V0(cq5.DX_PARSER_RLLIST2MAP, new cq5());
        dinamicXEngine.V0(oq5.DX_PARSER_STRIMPLODE, new oq5());
        dinamicXEngine.V0(bo5.DX_PARSER_MAPIMPLODE, new bo5());
        dinamicXEngine.V0(ao5.DX_PARSER_MAP_CONCAT, new ao5());
        dinamicXEngine.V0(tp5.DX_PARSER_RATEUNITEXCHANGE, new tp5());
        dinamicXEngine.V0(dl5.Companion.a(), new dl5());
        dinamicXEngine.V0(uk5.Companion.a(), new uk5());
        dinamicXEngine.V0(rq5.Companion.a(), new rq5());
        dinamicXEngine.V0(ut5.DX_PARSER_VALUEFORKEYPATH, new ut5());
        dinamicXEngine.V0(ii5.Companion.a(), new ii5());
        dinamicXEngine.V0(bq5.Companion.a(), new bq5());
        dinamicXEngine.V0(bi5.Companion.a(), new bi5());
        dinamicXEngine.V0(op5.Companion.a(), new op5());
        dinamicXEngine.V0(yj5.DX_PARSER_DICREMOVEBYKEY, new yj5());
        dinamicXEngine.V0(qp5.DX_PARSER_RATEINDEXOFARRAY, new qp5());
        dinamicXEngine.V0(sp5.DX_PARSER_RATELISTUSERHEADPIC, new sp5());
        if (ufpVar.a()) {
            dinamicXEngine.e1(xe6.Companion.a(), new xe6());
        } else {
            dinamicXEngine.e1(xe6.Companion.a(), new DXMegaVideoWidgetNodeV2());
        }
        dinamicXEngine.e1(ai6.Companion.a(), new ai6());
        dinamicXEngine.e1(ni6.Companion.a(), new ni6());
        dinamicXEngine.e1(sd6.Companion.a(), new sd6());
        dinamicXEngine.e1(sc5.DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGFLOWVIEW, new sc5());
        dinamicXEngine.W0(d28.Companion.a(), new d28());
        dinamicXEngine.W0(ru5.DX_EVENT_DXEVENTSCROLLSTATECHANGE, new ru5());
        if (n9lVar.L()) {
            dinamicXEngine.W0(mv5.DX_EVENT_EVENTCHAIN, new y46());
        }
        dinamicXEngine.J0(svp.SHOWRATESKUPOP, new svp.a());
        dinamicXEngine.J0(a38.Companion.a(), new a38.a());
        dinamicXEngine.J0(RegisterReceiverAbility.Companion.a(), aVar);
        dinamicXEngine.J0(tmx.XRATEWINDVANEV2, new tmx.c());
        dinamicXEngine.J0(XRateTranslateAbility.XRATETRANSLATE, new XRateTranslateAbility.a());
        dinamicXEngine.J0(xz4.CUSTOMAPM, new xz4.a());
        dinamicXEngine.J0(ggn.RATEFIRSTFRAMETRACK, new ggn.a());
        dinamicXEngine.J0(fgn.RATEFIRSTFRAMEPICTURERENDER, new fgn.a());
        dinamicXEngine.J0(vno.SRKPREREQUEST, new vno.b());
        dinamicXEngine.J0(lht.TBTRADEJSTRACKERREPORT, new lht.a());
        dinamicXEngine.J0(rmx.XRATEOPENPREVIEWV2, new rmx.a());
        dinamicXEngine.J0(ahn.RATELOADINGVIEWFIRSTFRAMEPICTURERENDER, new ahn.a());
        dinamicXEngine.J0(ifp.SETRATELISTABINFO, new ifp.a());
        dinamicXEngine.v().j("-6435166934211554155", xr6.class, "split");
        dinamicXEngine.v().j("dataProcessSplit", xr6.class, "split");
        return dinamicXEngine;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2801763", new Object[]{this});
            return;
        }
        y28 y28Var = y28.INSTANCE;
        y28Var.d(String.valueOf((long) ut5.DX_PARSER_VALUEFORKEYPATH), NAME_SPACE, new ut5());
        y28Var.d(String.valueOf((long) cq5.DX_PARSER_RLLIST2MAP), NAME_SPACE, new cq5());
    }

    public final void e(ViewGroup viewGroup, j jVar, q26 q26Var) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85406a2b", new Object[]{this, viewGroup, jVar, q26Var});
            return;
        }
        ckf.g(viewGroup, "viewGroup");
        ckf.g(jVar, a.MSG_SOURCE_PARENT);
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            ckf.d(q26Var);
            layoutParams = jVar.generateLayoutParams(q26Var);
        } else {
            ckf.d(q26Var);
            layoutParams = jVar.generateLayoutParams(q26Var, layoutParams2);
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void d(k66 k66Var) {
        List<DXTemplateItem> list;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93a33e2", new Object[]{this, k66Var});
            return;
        }
        Object obj = null;
        if (!(k66Var == null || (list = k66Var.b) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                DXTemplateItem dXTemplateItem = (DXTemplateItem) next;
                if (dXTemplateItem != null && (str = dXTemplateItem.f7343a) != null && str.equals(n9l.INSTANCE.m())) {
                    obj = next;
                    break;
                }
            }
            obj = (DXTemplateItem) obj;
        }
        if (obj != null) {
            String str2 = "failedTemplate:" + obj + ", requestList:" + k66Var.c;
            v7t.d(d1g.INSTANCE.a(), "模板下载失败. " + str2);
            TBS.Ext.commitEvent("Page_DetailComments2", 2201, "Page_DetailComments_renderend", null, null, "success=0,reason=dxDownload,errDetail=" + str2);
        }
    }
}
