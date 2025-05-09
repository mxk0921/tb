package tb;

import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridDestroyPolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbsku.TBXSkuCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.bcv;
import tb.fcv;
import tb.hcv;
import tb.jcv;
import tb.mbv;
import tb.pbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<hcv> f16964a = new ArrayList();

    static {
        t2o.a(157286811);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c3a2fb3", new Object[]{str});
        }
        if (EnvironmentSwitcher.a() == 0) {
            return str.replace(".wapa.", ".m.");
        }
        return str.replace(".m.", ".wapa.");
    }

    public mbv b(String str) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbv) ipChange.ipc$dispatch("41a13004", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = ((ArrayList) this.f16964a).iterator();
        while (it.hasNext()) {
            hcv hcvVar = (hcv) it.next();
            if (!(hcvVar == null || (list = hcvVar.b) == null)) {
                for (mbv mbvVar : list) {
                    if (mbvVar != null) {
                        if (!UltronTradeHybridSwitcherHelper.e(hcvVar.f20547a, mbvVar.f23930a)) {
                            String str2 = hcvVar.f20547a;
                            String str3 = mbvVar.f23930a;
                            hav.d("UltronTradeHybridConfig.getPreRenderModel", str2 + "-" + str3 + " enableTradeHybrid is FALSE");
                        } else if (mbv.a(str, mbvVar.b)) {
                            return mbvVar;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public hcv c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcv) ipChange.ipc$dispatch("4b71d33f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = ((ArrayList) this.f16964a).iterator();
        while (it.hasNext()) {
            hcv hcvVar = (hcv) it.next();
            if (hcvVar != null && TextUtils.equals(str, hcvVar.f20547a)) {
                return hcvVar;
            }
        }
        return null;
    }

    public mbv d(String str) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbv) ipChange.ipc$dispatch("7e9e55b6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = ((ArrayList) this.f16964a).iterator();
        while (it.hasNext()) {
            hcv hcvVar = (hcv) it.next();
            if (!(hcvVar == null || (list = hcvVar.b) == null)) {
                for (mbv mbvVar : list) {
                    if (mbvVar != null) {
                        if (!UltronTradeHybridSwitcherHelper.e(hcvVar.f20547a, mbvVar.f23930a)) {
                            String str2 = hcvVar.f20547a;
                            String str3 = mbvVar.f23930a;
                            hav.d("UltronTradeHybridConfig.getTMSPreRenderModel", str2 + "-" + str3 + " enableTradeHybrid is FALSE");
                        } else if (mbv.a(str, mbvVar.j)) {
                            return mbvVar;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static cbv a() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cbv) ipChange.ipc$dispatch("579c9ea3", new Object[0]);
        }
        mbv a2 = new mbv.b().c(dbv.BIZ_PAY_SUCCESS).i(HybridPreRenderHelper.h("purchase", dbv.BIZ_PAY_SUCCESS)).g(1).b(v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_PURCHASE, dbv.QUERY_ASYNC_CREATE_INSTANCE, true)).f(UltronTradeHybridStage.ON_RENDER_END).j("none").d("destroy").a();
        hcv a3 = new hcv.b().g("purchase").c(Arrays.asList(a2)).a();
        hcv a4 = new hcv.b().g("tbWaitPayDetail").c(Arrays.asList(a2)).a();
        hcv a5 = new hcv.b().g("waitPay").c(Arrays.asList(a2)).a();
        hcv a6 = new hcv.b().g("alipay").f(Arrays.asList(new fcv.b().b(dbv.BIZ_PAY_SUCCESS).e(new pbv.b().c("mtop.trade.receipt.rendersimplepaysuccess").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_TRADE").e(JSON.parseObject("{'mainBizOrderIdsStr':'${orderIds}','sourceType':'normal','params':'${preRequestParams}'}")).a()).j(new jcv.a().d("${storageKey}").c(30000L).b("none").a()).i(UltronTradeHybridStage.ON_CONTAINER_CREATE).c("${enablePreRequest}").g(dbv.PRE_RENDER_URL_PAY_SUCCESS).a())).d(Arrays.asList(new bcv.b().b(dbv.BIZ_PAY_SUCCESS).c(ebv.FRONT_END_URL_PAY_SUCCESS).d(UltronTradeHybridStage.ON_CONTAINER_CREATE).a())).a();
        hcv a7 = new hcv.b().g(ae2.BizKeyPaysuccess).c(Arrays.asList(new mbv.b().c(dbv.BIZ_ORDER_DETAIL).i(HybridPreRenderHelper.h(ae2.BizKeyPaysuccess, dbv.BIZ_ORDER_DETAIL)).g(1).f(UltronTradeHybridStage.ON_RENDER_END).j(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).d("destroy").a())).a();
        mbv.b b = new mbv.b().c(dbv.BIZ_REFUND_LIST).i(HybridPreRenderHelper.h("mytaobao", dbv.BIZ_REFUND_LIST)).g(1).b(HybridPreRenderHelper.i());
        if (HybridPreRenderHelper.Companion.i()) {
            str = UltronTradeHybridInstanceRenderMode.SURFACE;
        } else {
            str = UltronTradeHybridInstanceRenderMode.TEXTURE;
        }
        mbv a8 = b.h(str).f(UltronTradeHybridStage.ON_CONTAINER_RESUME).d("destroy").a();
        fcv l = p9b.l();
        List<fcv> f = p9b.f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(l);
        arrayList.addAll(f);
        List asList = Arrays.asList(new unm("//img.alicdn.com/tfs/TB1hqbLsz39YK4jSZPcXXXrUFXa-240-240.png", 240, 240, false), new unm("//gw.alicdn.com/imgextra/i1/O1CN01Qg3xsj1JB0gVHN8ax_!!6000000000989-2-tps-216-144.png", 216, 144, false));
        List asList2 = Arrays.asList(new unm("//img.alicdn.com/imgextra/i4/O1CN01whBg321DOqqCEMWf8_!!6000000000207-49-tps-20-33.webp", 20, 33, false), new unm("//gw.alicdn.com/imgextra/i4/O1CN01aeOuY31HZcjuQciy0_!!6000000000772-2-tps-36-36.png", 36, 36, false), new unm("//gw.alicdn.com/imgextra/i3/O1CN015JBQO21OpNP8WSu6I_!!6000000001754-2-tps-80-80.png", 80, 80, false), new unm("//gw.alicdn.com/imgextra/i2/O1CN01IBkgQN26Fy77Dv9zk_!!6000000007633-2-tps-80-36.png", 80, 36, false), new unm("//gw.alicdn.com/imgextra/i3/O1CN018zfJt01Yxl2qy08VF_!!6000000003126-2-tps-77-36.png", 77, 36, false));
        dcv dcvVar = new dcv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_CONTAINER_RESUME, asList, true);
        dcv dcvVar2 = new dcv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_TOUCH_DOWN, null, true);
        hcv a9 = new hcv.b().g("mytaobao").e(Arrays.asList(new dcv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_RENDER_END, asList, true), dcvVar, new dcv(dbv.BIZ_REFUND_LIST, UltronTradeHybridStage.ON_CONTAINER_RESUME, asList2, false), dcvVar2)).f(arrayList).c(Collections.singletonList(a8)).b(Arrays.asList(new hbv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_CONTAINER_CREATE, true, 0L))).a();
        hcv a10 = new hcv.b().g(TBXSkuCore.CONTAINER_TYPE_NEWBUY).c(Arrays.asList(a2)).a();
        mbv.b e = new mbv.b().c(dbv.BIZ_CONFIRM_GOOD).i(HybridPreRenderHelper.h("orderList", dbv.BIZ_CONFIRM_GOOD)).g(1).f(UltronTradeHybridStage.ON_EVENT_CHAIN_AFTER).j("none").d(UltronTradeHybridDestroyPolicy.DESTROY_ON_STAGE).e(UltronTradeHybridStage.ON_CONFIRM_SUCCESS_FLOAT_CLOSE);
        if (v9v.i("babelorder", "enableConfirmGoodForceSurfaceView", true)) {
            str2 = UltronTradeHybridInstanceRenderMode.SURFACE;
        } else {
            str2 = UltronTradeHybridInstanceRenderMode.TEXTURE;
        }
        mbv a11 = e.h(str2).a();
        bcv a12 = new bcv.b().b(dbv.BIZ_CONFIRM_GOOD).c(ebv.FRONT_END_URL_CONFIRM_GOOD).d(UltronTradeHybridStage.ON_DATA_PRE_LOAD).a();
        hcv a13 = new hcv.b().g("orderList").f(Arrays.asList(p9b.g())).c(Arrays.asList(a11, new mbv.b().c(dbv.BIZ_LOGISTICS).i(HybridPreRenderHelper.h("orderList", dbv.BIZ_LOGISTICS)).g(1).f(UltronTradeHybridStage.ON_CONTAINER_RESUME).j(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).d("destroy").a())).d(Arrays.asList(a12)).e(Arrays.asList(new dcv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_CONTAINER_DESTROY, asList, true), new dcv(dbv.BIZ_REFUND_LIST, UltronTradeHybridStage.ON_CONTAINER_DESTROY, null, false))).b(Arrays.asList(new hbv(dbv.BIZ_ORDER_LIST, UltronTradeHybridStage.ON_NAV, true, 0L))).a();
        hcv a14 = new hcv.b().g(ae2.BizKeyOrderDetail).c(Arrays.asList(new mbv.b().c(dbv.BIZ_LOGISTICS).i(HybridPreRenderHelper.h(ae2.BizKeyOrderDetail, dbv.BIZ_LOGISTICS)).g(1).f(UltronTradeHybridStage.ON_IDLE).j("none").d("destroy").a(), a11)).d(Arrays.asList(a12)).a();
        hcv a15 = new hcv.b().g("refundList").c(Arrays.asList(new mbv.b().c(dbv.BIZ_REFUND_DETAIL).k(dbv.TMS_PRE_RENDER_URL_REFUND_DETAIL).l(Arrays.asList("isPrerender", "bizOrderId", "disputeId", "type", "jt_pt_navStartTime", "openFrom", "tradeHybrid", "forceThemis")).f(UltronTradeHybridStage.ON_CONTAINER_CREATE).j(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD).a())).e(Arrays.asList(new dcv(dbv.BIZ_REFUND_LIST, UltronTradeHybridStage.ON_DATA_CHANGED, null, false))).a();
        hcv a16 = new hcv.b().g("refundProcess").f(Arrays.asList(l)).e(Arrays.asList(new dcv(dbv.BIZ_REFUND_LIST, UltronTradeHybridStage.ON_CONTAINER_RESUME, asList2, false))).a();
        fcv k = p9b.k(UltronTradeHybridStage.ON_NAV);
        fcv k2 = p9b.k(UltronTradeHybridStage.ON_IDLE);
        hcv a17 = new hcv.b().g("detail").e(Arrays.asList(new dcv("rateList", UltronTradeHybridStage.ON_TOUCH_DOWN, null, false))).f(Arrays.asList(k, k2)).a();
        hcv a18 = new hcv.b().g("ask_list").f(Collections.singletonList(p9b.e())).a();
        hcv a19 = new hcv.b().g("ask_list_item_info").f(Collections.singletonList(p9b.d())).a();
        hcv a20 = new hcv.b().g("rate_home_list").f(Collections.singletonList(p9b.i())).a();
        hcv a21 = new hcv.b().g("rate_home_info").f(Collections.singletonList(p9b.h())).a();
        hcv a22 = new hcv.b().g("rate_home_rated_list").f(Collections.singletonList(p9b.j())).a();
        cbv cbvVar = new cbv();
        ((ArrayList) cbvVar.f16964a).addAll(Arrays.asList(a3, a4, a5, a6, a7, a9, a10, a13, a14, a15, a16, a17, a18, a19, a20, a22, a21));
        return cbvVar;
    }
}
