package com.taobao.taobao.alipayapi;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.HashMap;
import java.util.Map;
import tb.a8d;
import tb.ckf;
import tb.d1a;
import tb.ff3;
import tb.g1p;
import tb.qe1;
import tb.vvl;
import tb.wxl;
import tb.xhi;
import tb.xhv;
import tb.z7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AsyncQueryPay implements z7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a8d f12902a;
    public PayRequest b;
    public final vvl c;
    public wxl d;
    public final Activity e;

    public AsyncQueryPay(Activity activity) {
        ckf.g(activity, "context");
        this.e = activity;
        this.c = new vvl(activity);
    }

    public static final /* synthetic */ wxl b(AsyncQueryPay asyncQueryPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wxl) ipChange.ipc$dispatch("7fd4f79b", new Object[]{asyncQueryPay});
        }
        return asyncQueryPay.d;
    }

    public static final /* synthetic */ void c(AsyncQueryPay asyncQueryPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf2391", new Object[]{asyncQueryPay});
        } else {
            asyncQueryPay.i();
        }
    }

    public static final /* synthetic */ void d(AsyncQueryPay asyncQueryPay, Activity activity, d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636f890b", new Object[]{asyncQueryPay, activity, d1aVar});
        } else {
            asyncQueryPay.k(activity, d1aVar);
        }
    }

    public final a8d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8d) ipChange.ipc$dispatch("cc1c414b", new Object[]{this});
        }
        return this.f12902a;
    }

    public final Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.e;
    }

    public final HashMap<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8abc9da6", new Object[]{this});
        }
        return null;
    }

    public final PayRequest h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("528d8b4a", new Object[]{this});
        }
        return this.b;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else if (this.c.isShowing()) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "hideLoading");
            this.c.dismiss();
        }
    }

    public z7d j(a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7d) ipChange.ipc$dispatch("fd55855", new Object[]{this, a8dVar});
        }
        this.f12902a = a8dVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [tb.qe1] */
    public final void k(Activity activity, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a515b3b9", new Object[]{this, activity, d1aVar});
            return;
        }
        JSONObject parseObject = JSON.parseObject("{\"fields\":{\"bizId\":\"purchase\",\"content\":{\"fields\":{\"cloaseIcon\":\"https://img.alicdn.com/imgextra/i2/O1CN01j1tWo31fzmAKbYkbt_!!6000000004078-2-tps-84-84.png\",\"darkCloseIcon\":\"https://img.alicdn.com/imgextra/i1/O1CN01QlbIxb1tzgiDcBOPn_!!6000000005973-2-tps-84-84.png\",\"icon\":\"https://img.alicdn.com/imgextra/i4/O1CN01SQbMuW1GR5mJjey54_!!6000000000618-2-tps-1044-623.png\",\"singleButton\":{\"action\":\"singleButtonClose\",\"text\":\"我知道了\"},\"subTitle\":\"请检查网络设置，可以通过订单列表查看订单支付结果\",\"title\":\"网络不太好\"}},\"extConfig\":{\"refreshType\":\"downloadFirst\",\"template\":{\"name\":\"cashier_error_pop\",\"url\":\"https://dinamicx.alibabausercontent.com/pub/cashier_error_pop/1732513950537/cashier_error_pop.zip\",\"version\":\"1732513950537\"}},\"popConfig\":{\"animation\":\"bottomInOut\",\"gravity\":\"bottom\",\"matchContent\":\"true\",\"maxHeight\":\"1.0\",\"panEnable\":\"true\",\"shouldShowClose\":\"false\",\"showLoading\":\"true\",\"tapEnable\":\"true\"},\"popId\":\"tbCashierAsyncPopId\"},\"type\":\"stdPop.showDx\"}");
        if (d1aVar != null) {
            d1aVar = new qe1(d1aVar);
        }
        xhi.f(activity, parseObject, (Runnable) d1aVar);
    }

    public final void m(g1p g1pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525fa7c7", new Object[]{this, g1pVar});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "AsyncQueryPay: step3 开启异步支付");
        new PayAsyncQueryScope(new AsyncQueryPay$startQueryTask$payAsyncQueryScope$1(this)).h(g1pVar);
    }

    @Override // tb.z7d
    public void a(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef63387", new Object[]{this, payRequest});
            return;
        }
        ckf.g(payRequest, "payRequest");
        this.b = payRequest;
        payRequest.setPayMethod(payRequest.getInstitutionCode() + "_async");
        wxl wxlVar = new wxl(this.e, PayRequest.CALL_ASYNC_QUERY);
        this.d = wxlVar;
        Map<String, String> extAttrMap = payRequest.getExtAttrMap();
        if (extAttrMap == null) {
            extAttrMap = new HashMap<>();
        }
        wxlVar.q(extAttrMap, false);
        g1p searchConfig = payRequest.getSearchConfig();
        if (searchConfig != null) {
            wxl wxlVar2 = this.d;
            if (wxlVar2 != null) {
                wxlVar2.t();
            }
            l(payRequest.getLoadingText());
            m(searchConfig);
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf6b8d0", new Object[]{this, str});
        } else if (!this.c.isShowing()) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "showLoading");
            vvl vvlVar = this.c;
            if (str == null) {
                str = ff3.DEFAULT_LOADING_TEXT;
            }
            vvlVar.a(str);
            this.c.setCancelable(false);
            this.c.show();
        }
    }
}
