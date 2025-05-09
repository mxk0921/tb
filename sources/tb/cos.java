package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.atomic.CallAblAbility;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.BatchAddCartImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CheckPresaleImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.InviteRateImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.QuerySMBagPriceImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.SetRemindImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor;
import com.taobao.android.detail.ttdetail.transfer.handler.DXDataParserDetailGetImageRadio;
import com.taobao.android.detail.ttdetail.transfer.widget.AliDetailScrollerLayoutWidgetNode;
import com.taobao.android.detail.ttdetail.transfer.widget.DXDetailProfitAnimLayoutWidgetNode;
import com.taobao.android.detail.ttdetail.transfer.widget.DXTBDetailRichTextWidgetNode;
import java.util.concurrent.ConcurrentHashMap;
import tb.du5;
import tb.eu5;
import tb.fnx;
import tb.gnx;
import tb.gu5;
import tb.kos;
import tb.kqv;
import tb.nkx;
import tb.qfe;
import tb.ue6;
import tb.umx;
import tb.vmx;
import tb.xg7;
import tb.yjx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262855);
    }

    public static void a(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebc48a6", new Object[]{ze7Var, context});
            return;
        }
        go2 go2Var = new go2(context, ze7Var);
        ze7Var.b().i(go2.EVENT_TYPE, go2Var);
        ze7Var.b().i(go2.EVENT_TYPE_ALTERNATIVE, go2Var);
        me0 me0Var = new me0(context, ze7Var);
        ze7Var.b().i(me0.EVENT_TYPE, me0Var);
        ze7Var.b().i(me0.EVENT_TYPE_ALTERNATIVE, me0Var);
        v5l v5lVar = new v5l(context, ze7Var);
        ze7Var.b().i(v5l.EVENT_TYPE, v5lVar);
        ze7Var.b().i(v5l.EVENT_TYPE_ALTERNATIVE, v5lVar);
        n4l n4lVar = new n4l(context, ze7Var);
        ze7Var.b().i(n4l.EVENT_TYPE, n4lVar);
        ze7Var.b().i(n4l.EVENT_TYPE_ALTERNATIVE, n4lVar);
        OpenAddressImplementor openAddressImplementor = new OpenAddressImplementor(context, ze7Var);
        ze7Var.b().i(OpenAddressImplementor.EVENT_TYPE, openAddressImplementor);
        ze7Var.b().i(OpenAddressImplementor.EVENT_TYPE_ALTERNATIVE, openAddressImplementor);
        ze7Var.b().i(OpenAddressImplementor.EVENT_TYPE_ALTERNATIVE_BACK_UP, openAddressImplementor);
        r4l r4lVar = new r4l(context, ze7Var);
        ze7Var.b().i("openShare", r4lVar);
        ze7Var.b().i("share", r4lVar);
        AddWaitingImplementor addWaitingImplementor = new AddWaitingImplementor(context, ze7Var);
        ze7Var.b().i(AddWaitingImplementor.EVENT_TYPE, addWaitingImplementor);
        ze7Var.b().i(AddWaitingImplementor.EVENT_TYPE_ALTERNATIVE, addWaitingImplementor);
        i4l i4lVar = new i4l(context, ze7Var);
        ze7Var.b().i(i4l.EVENT_TYPE, i4lVar);
        ze7Var.b().i(i4l.EVENT_TYPE_ALTERNATIVE, i4lVar);
        g4l g4lVar = new g4l(context);
        ze7Var.b().i(g4l.EVENT_TYPE, g4lVar);
        ze7Var.b().i(g4l.EVENT_TYPE_ALTERNATIVE, g4lVar);
        e5l e5lVar = new e5l(context, ze7Var);
        ze7Var.b().i(e5l.EVENT_TYPE, e5lVar);
        ze7Var.b().i(e5l.EVENT_TYPE_ALTERNATIVE, e5lVar);
        ze7Var.b().i("disappear", new pp7(context, ze7Var));
        ze7Var.b().i("ut_exposure", new hvv(context, ze7Var));
        ze7Var.b().i(SetRemindImplementor.EVENT_TYPE, new SetRemindImplementor(context, ze7Var));
        ze7Var.b().i(ag0.EVENT_TYPE, new ag0(context, ze7Var));
        ze7Var.b().i("request", new j4o(context, ze7Var));
        ze7Var.b().i(CheckPresaleImplementor.EVENT_TYPE, new CheckPresaleImplementor(context, ze7Var));
        ze7Var.b().i(f4l.EVENT_TYPE, new f4l(context, ze7Var));
        ze7Var.b().i(ts7.EVENT_TYPE, new ts7(context, ze7Var));
        ze7Var.b().i(q0r.EVENT_TYPE, new q0r(context, ze7Var));
        ze7Var.b().i("toast", new f0u(context));
        ze7Var.b().i(c3l.EVENT_TYPE, new c3l(context, ze7Var));
        ze7Var.b().i(rlq.EVENT_TYPE, new rlq(context));
        ze7Var.b().i(s4l.EVENT_TYPE, new s4l(context, ze7Var));
        ze7Var.b().i(d5l.EVENT_TYPE, new d5l(context, ze7Var));
        ze7Var.b().i(x3l.EVENT_TYPE, new x3l(context, ze7Var));
        ze7Var.b().i(TitleLongClickImplementor.EVENT_TYPE, new TitleLongClickImplementor(context, ze7Var));
        ze7Var.b().i(p4l.EVENT_TYPE, new p4l(context, ze7Var));
        ze7Var.b().i(i3l.EVENT_TYPE, new i3l(context, ze7Var));
        ze7Var.b().i(aq3.EVENT_TYPE, new aq3(context, ze7Var));
        ze7Var.b().i(CollectorImplementor.EVENT_TYPE, new CollectorImplementor(context, ze7Var));
        ze7Var.b().i(qxt.EVENT_TYPE, new qxt(context, ze7Var));
        ze7Var.b().i(h2q.EVENT_TYPE, new h2q(context, ze7Var));
        ze7Var.b().i(f2q.EVENT_TYPE, new f2q(context, ze7Var));
        ze7Var.b().i(g2q.EVENT_TYPE, new g2q(context, ze7Var));
        ze7Var.b().i(eyf.EVENT_TYPE, new eyf(context, ze7Var));
        ze7Var.b().i(InviteRateImplementor.EVENT_TYPE, new InviteRateImplementor(context, ze7Var));
        ze7Var.b().i(QuerySMBagPriceImplementor.EVENT_TYPE, new QuerySMBagPriceImplementor(context, ze7Var));
        ze7Var.b().i(BatchAddCartImplementor.EVENT_TYPE, new BatchAddCartImplementor(context, ze7Var));
        ze7Var.b().i(hzy.EVENT_TYPE, new hzy(context, ze7Var));
    }

    public static void b(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01f2f6d", new Object[]{ze7Var, context});
            return;
        }
        gos.b(ze7Var, context);
        a(ze7Var, context);
        d(ze7Var, context);
        c(ze7Var, context);
        f(ze7Var, context);
        g(ze7Var, context);
        e(ze7Var.g());
    }

    public static void c(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66debbf9", new Object[]{ze7Var, context});
            return;
        }
        ze7Var.d().i("native", "headerPic", new bkj());
        ze7Var.d().i("native", ekj.NAME, new ekj());
        ze7Var.d().i("native", "navBar", new qkj());
        ze7Var.d().i("native", ef7.NAME, new ef7());
        ze7Var.d().i("native", "descSuffixShrink", new if7());
        ze7Var.d().i("native", ie7.NAME, new ie7());
        ze7Var.d().i("native", kf7.NAME, new kf7());
        ze7Var.d().i("native", hny.NAME, new hny());
    }

    public static void d(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca37d623", new Object[]{ze7Var, context});
            return;
        }
        ze7Var.e().q(hzh.PARSER_ID, new hzh(context, ze7Var));
        ze7Var.e().q(kns.PARSER_ID, new kns(context, ze7Var));
    }

    public static void e(eo7 eo7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce71dfdf", new Object[]{eo7Var});
            return;
        }
        eo7Var.F(DXTBDetailRichTextWidgetNode.DETAIL_WIDGET_ID, new DXTBDetailRichTextWidgetNode.d());
        eo7Var.F(vmx.c, new vmx.b());
        eo7Var.F(qfe.DX_EVENT_ID, new qfe.a());
        eo7Var.F(gnx.d, new gnx.b());
        eo7Var.F(umx.i, new umx.c());
        eo7Var.F(yjx.h, new yjx.a());
        eo7Var.F(ue6.DXTBLIVEVIEW_TBLIVEVIEW, new ue6.a());
        eo7Var.F(fnx.DXXSHADOWTEXTVIEW_XSHADOWTEXTVIEW, new fnx.a());
        eo7Var.F(nkx.DXXQINTERACTAVATARANIMATIONVIEW_XQINTERACTAVATARANIMATIONVIEW, new nkx.a());
        eo7Var.F(AliDetailScrollerLayoutWidgetNode.DX_WIDGET_ID, new AliDetailScrollerLayoutWidgetNode.b());
        eo7Var.F(du5.VIEW_IDENTITY, new du5.a());
        eo7Var.F(eu5.VIEW_IDENTITY, new eu5.a());
        eo7Var.F(xg7.VIEW_IDENTITY, new xg7.c());
        eo7Var.F(gu5.DETAIL_WIDGET_ID, new gu5.a());
        eo7Var.F(q3z.DXDETAILPRICEANIMVIEW_DETAILPRICEANIMVIEW, new q3z());
        eo7Var.F(DXDetailProfitAnimLayoutWidgetNode.DXDETAILPROFITANIMLAYOUT_DETAILPROFITANIMLAYOUT, new DXDetailProfitAnimLayoutWidgetNode());
        eo7Var.C(si5.DX_PARSER_CANSHOWINSINGLELINE, new si5());
        eo7Var.C(oi5.DX_PARSER_BYTELENGTH, new oi5());
        eo7Var.C(y18.DX_PARSER_ID, new y18());
        eo7Var.C(DXDataParserDetailGetImageRadio.DX_PARSER_ID, new DXDataParserDetailGetImageRadio());
        eo7Var.C(ki5.DX_PARSER_ID, new ki5());
        if (nj7.h()) {
            eo7Var.C(pj5.DX_PARSER_DX_ENV, new kos.a());
        }
        eo7Var.C(vj5.DX_PARSER_DETAILURLENCODE, new vj5());
        eo7Var.C(sj5.DX_PARSER_DETAILAPPVERSION, new sj5());
        eo7Var.C(yn5.DX_PARSER_LOCALDATE, new yn5());
        eo7Var.C(sn5.DX_PARSER_KVSTORAGEGETITEM, new sn5());
        eo7Var.C(mn5.DX_PARSER_ITEMSUPPORT, new mn5());
        eo7Var.C(tj5.Companion.a(), new tj5());
        eo7Var.C(ln5.DX_PARSER_ITEMINFO, new ln5());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        eo7Var.D(fu5.DX_EVENT_DETAILSKUSCROLLED, new fu5(concurrentHashMap));
        eo7Var.C(uj5.DX_PARSER_DETAILSKUGETSCROLLED, new uj5(concurrentHashMap));
    }

    public static void f(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797651fe", new Object[]{ze7Var, context});
            return;
        }
        ze7Var.g().A(kqv.DX_ABILITY_ID, new kqv.a(context, ze7Var));
        ze7Var.g().B("ttDetail", kqv.NAME, new kqv.a(context, ze7Var));
        ze7Var.g().A(CallAblAbility.DX_ABILITY_ID, new CallAblAbility.a(context, ze7Var));
        ze7Var.g().B("ttDetail", CallAblAbility.NAME, new CallAblAbility.a(context, ze7Var));
    }

    public static void g(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c37177", new Object[]{ze7Var, context});
            return;
        }
        j(ze7Var, context);
        i(ze7Var, context);
        h(ze7Var, context);
    }

    public static void h(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276f1570", new Object[]{ze7Var, context});
        }
    }

    public static void i(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d25cfa9", new Object[]{ze7Var, context});
        } else {
            ze7Var.g().D(wra.DX_EVENT_ID, new wra(context, ze7Var));
        }
    }

    public static void j(ze7 ze7Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ddb35", new Object[]{ze7Var, context});
        }
    }
}
