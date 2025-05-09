package com.taobao.taobao.alipayapi;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a8d;
import tb.ff3;
import tb.wxl;
import tb.xhi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AsyncQueryPay$startQueryTask$payAsyncQueryScope$1 implements PayAsyncQueryScope.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AsyncQueryPay f12903a;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/taobao/alipayapi/AsyncQueryPay$startQueryTask$payAsyncQueryScope$1$onFailure$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ PayResultInfo c;

        public a(String str, PayResultInfo payResultInfo) {
            this.b = str;
            this.c = payResultInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a8d e = AsyncQueryPay$startQueryTask$payAsyncQueryScope$1.this.f12903a.e();
            if (e != null) {
                e.b(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/taobao/alipayapi/AsyncQueryPay$startQueryTask$payAsyncQueryScope$1$onMarketingPop$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ PayResultInfo c;

        public b(String str, PayResultInfo payResultInfo) {
            this.b = str;
            this.c = payResultInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a8d e = AsyncQueryPay$startQueryTask$payAsyncQueryScope$1.this.f12903a.e();
            if (e != null) {
                e.c(this.b, this.c);
            }
        }
    }

    public AsyncQueryPay$startQueryTask$payAsyncQueryScope$1(AsyncQueryPay asyncQueryPay) {
        this.f12903a = asyncQueryPay;
    }

    @Override // com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope.a
    public void a(JSONObject jSONObject, String str, String str2) {
        String str3;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ff1d92", new Object[]{this, jSONObject, str, str2});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "AsyncQueryPay: step4 异步支付回调失败");
        wxl b2 = AsyncQueryPay.b(this.f12903a);
        if (b2 != null) {
            b2.r("100002");
        }
        HashMap<String, String> g = this.f12903a.g();
        if (g == null || (str3 = g.get("unSuccessUrl")) == null) {
            str3 = ff3.ORDER_LIST_ALL;
        }
        PayResultInfo payResultInfo = new PayResultInfo("100002", "status:" + str, "failure", this.f12903a.h());
        AsyncQueryPay.c(this.f12903a);
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("pageData")) == null) {
            AsyncQueryPay asyncQueryPay = this.f12903a;
            AsyncQueryPay.d(asyncQueryPay, asyncQueryPay.f(), new AsyncQueryPay$startQueryTask$payAsyncQueryScope$1$onFailure$2(this, str3, payResultInfo));
            return;
        }
        xhi.f(this.f12903a.f(), jSONObject2, new a(str3, payResultInfo));
    }

    @Override // com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope.a
    public void b(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed14d7bf", new Object[]{this, jSONObject});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "AsyncQueryPay: step4 异步支付回调去支付推荐");
        wxl b2 = AsyncQueryPay.b(this.f12903a);
        if (b2 != null) {
            b2.r("9000");
        }
        HashMap<String, String> g = this.f12903a.g();
        if (g == null || (str = g.get("backURL")) == null) {
            str = ff3.ORDER_LIST_ALL;
        }
        PayResultInfo payResultInfo = new PayResultInfo("9000", "status:0", "success", this.f12903a.h());
        AsyncQueryPay.c(this.f12903a);
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("pageData")) != null) {
            xhi.f(this.f12903a.f(), jSONObject2, new b(str, payResultInfo));
        }
    }

    @Override // com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope.a
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf4d72d", new Object[]{this, jSONObject});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "AsyncQueryPay: step4 异步支付回调去收银台");
        wxl b2 = AsyncQueryPay.b(this.f12903a);
        if (b2 != null) {
            b2.r("6001");
        }
        AsyncQueryPay.c(this.f12903a);
        a8d e = this.f12903a.e();
        if (e != null) {
            e.e(jSONObject != null ? jSONObject.getString("signStr") : null);
        }
    }

    @Override // com.taobao.tao.alipay.cashdesk.scope.PayAsyncQueryScope.a
    public void onSuccess() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "AsyncQueryPay: step4 异步支付回调成功");
        wxl b2 = AsyncQueryPay.b(this.f12903a);
        if (b2 != null) {
            b2.r("9000");
        }
        HashMap<String, String> g = this.f12903a.g();
        if (g == null || (str = g.get("backURL")) == null) {
            str = ff3.ORDER_LIST_ALL;
        }
        PayResultInfo payResultInfo = new PayResultInfo("9000", "status:0", "success", this.f12903a.h());
        AsyncQueryPay.c(this.f12903a);
        a8d e = this.f12903a.e();
        if (e != null) {
            e.c(str, payResultInfo);
        }
    }
}
