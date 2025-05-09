package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.order.constants.OrderBizCode;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.nbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class obv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Pair<Long, Long>> f25290a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25291a;
        public final /* synthetic */ DXTemplateItem b;

        public a(String str, DXTemplateItem dXTemplateItem) {
            this.f25291a = str;
            this.b = dXTemplateItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            DXTemplateItem dXTemplateItem;
            Pair pair;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f25291a) && (dXTemplateItem = this.b) != null && !TextUtils.isEmpty(dXTemplateItem.f7343a) && this.b.b != -1 && (pair = (Pair) obv.a().remove(this.b.f7343a)) != null && (obj = pair.first) != null && pair.second != null && ((Long) obj).longValue() < ((Long) pair.second).longValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("d1", this.f25291a);
                hashMap.put("d2", this.b.f7343a);
                hashMap.put("d3", String.valueOf(this.b.b));
                hashMap.put("d4", String.valueOf(this.b.g));
                nbv.c("dxTemplate", "renderStage", ((Long) pair.second).longValue() - ((Long) pair.first).longValue(), v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_DX_MONITOR, "renderTemplateSampling", 0.001f), hashMap);
                ConcurrentHashMap b = obv.b();
                b.put(this.b.f7343a + "_" + this.b.b, Boolean.TRUE);
            }
        }
    }

    static {
        t2o.a(157286912);
    }

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6789008f", new Object[0]);
        }
        return f25290a;
    }

    public static /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("21008e2e", new Object[0]);
        }
        return b;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80bddc74", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (mbv.a(str, dbv.PRE_RENDER_URL_ORDER_DETAIL)) {
            return dbv.BIZ_ORDER_DETAIL;
        }
        if (mbv.a(str, dbv.PRE_RENDER_URL_PAY_SUCCESS)) {
            return dbv.BIZ_PAY_SUCCESS;
        }
        if (mbv.a(str, dbv.PRE_RENDER_URL_REFUND_LIST)) {
            return dbv.BIZ_REFUND_LIST;
        }
        if (mbv.a(str, dbv.PRE_RENDER_URL_CONFIRM_GOOD)) {
            return dbv.BIZ_CONFIRM_GOOD;
        }
        if (mbv.a(str, dbv.PRE_RENDER_URL_LOGISTICS)) {
            return dbv.BIZ_LOGISTICS;
        }
        return "";
    }

    public static float d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91dc5b6b", new Object[]{str})).floatValue();
        }
        if (TextUtils.equals(str, dbv.BIZ_ORDER_DETAIL)) {
            return 1.0E-4f;
        }
        return 0.001f;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1753cd33", new Object[]{str});
        }
        if (TextUtils.equals(str, "mtop.trade.receipt.rendersimplepaysuccess")) {
            return dbv.BIZ_PAY_SUCCESS;
        }
        if (TextUtils.equals(str, "mtop.taobao.order.query.detailv2") || TextUtils.equals(str, "mtop.taobao.order.batchquery.detail")) {
            return dbv.BIZ_ORDER_DETAIL;
        }
        if (TextUtils.equals(str, "mtop.order.dopay")) {
            return dbv.BIZ_CONFIRM_GOOD;
        }
        if (TextUtils.equals(str, "mtop.taobao.rate.detaillist.get") || TextUtils.equals(str, "mtop.taobao.rate.detaillist.preload")) {
            return "rateList";
        }
        if (TextUtils.equals(str, "mtop.taobao.rate.raterinfo.get") || TextUtils.equals(str, "mtop.taobao.rate.portallist.get") || TextUtils.equals(str, "mtop.alibaba.review.buyer.query.my.review")) {
            return dbv.BIZ_RATE_HOME;
        }
        if (TextUtils.equals(str, "mtop.taobao.wdj.list.item.info") || TextUtils.equals(str, "mtop.taobao.wdj.list.merge.search")) {
            return "askList";
        }
        return "";
    }

    public static float f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4211aa2a", new Object[]{str})).floatValue();
        }
        if (TextUtils.equals(str, dbv.BIZ_ORDER_DETAIL)) {
            return 1.0E-4f;
        }
        return 0.001f;
    }

    public static void h(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d111541c", new Object[]{new Boolean(z), str, str2});
        } else if (TextUtils.isEmpty(str)) {
            hav.d("UltronTradeHybridJSTrackerUtil.reportPreRender", "bizName is empty!");
        } else {
            if (!z) {
                hav.d("UltronTradeHybridJSTrackerUtil.reportPreRender", "errorMsg:" + str2);
            }
            nbv.a(nbv.a.a("preRender_" + str).success(z).message(str2).sampling(d(str)));
        }
    }

    public static void i(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31ef107", new Object[]{new Boolean(z), str, str2});
        } else {
            h(z, c(str), str2);
        }
    }

    public static void j(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816d4f01", new Object[]{new Boolean(z), str, str2});
        } else if (TextUtils.isEmpty(str)) {
            hav.d("UltronTradeHybridJSTrackerUtil.reportPreRequest", "bizName is empty!");
        } else {
            nbv.a(nbv.a.a("preRequest_" + str).success(z).message(str2).sampling(f(str)));
        }
    }

    public static void k(boolean z, MtopResponse mtopResponse, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97f7154", new Object[]{new Boolean(z), mtopResponse, str});
            return;
        }
        if (mtopResponse == null) {
            str2 = "";
        } else {
            str2 = mtopResponse.getApi();
        }
        nbv.b(nbv.b.o(str2, z).n(r9v.a(mtopResponse)).message(str).sampling(f(e(str2))));
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ae084e", new Object[0]);
            return;
        }
        f25290a.clear();
        b.clear();
    }

    public static void g(boolean z, String str, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90231c20", new Object[]{new Boolean(z), str, dXRootView});
        } else if (dXRootView != null && !TextUtils.isEmpty(str) && dXRootView.getDxTemplateItem() != null) {
            if ((TextUtils.equals(str, c9x.CART_BIZ_NAME) || TextUtils.equals(str, OrderBizCode.orderList)) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_DX_MONITOR, "enableReportRenderTemplate", false)) {
                DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
                ConcurrentHashMap<String, Boolean> concurrentHashMap = b;
                if (!(concurrentHashMap == null || TextUtils.isEmpty(dxTemplateItem.f7343a) || dxTemplateItem.b == -1)) {
                    if (concurrentHashMap.containsKey(dxTemplateItem.f7343a + "_" + dxTemplateItem.b)) {
                        return;
                    }
                }
                if (z) {
                    f25290a.put(dxTemplateItem.f7343a, new Pair<>(Long.valueOf(System.currentTimeMillis()), 0L));
                    return;
                }
                ConcurrentHashMap<String, Pair<Long, Long>> concurrentHashMap2 = f25290a;
                if (concurrentHashMap2.containsKey(dxTemplateItem.f7343a)) {
                    concurrentHashMap2.put(dxTemplateItem.f7343a, new Pair<>(concurrentHashMap2.remove(dxTemplateItem.f7343a).first, Long.valueOf(System.currentTimeMillis())));
                    pav.k(new a(str, dxTemplateItem));
                }
            }
        }
    }
}
