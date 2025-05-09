package com.taobao.taobao;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.nav.Nav;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.CashDeskPayStatusQuery;
import com.taobao.taobao.a;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.CashDeskLog;
import com.uc.webview.export.extension.UCCore;
import tb.a8d;
import tb.af3;
import tb.bf3;
import tb.rvl;
import tb.xal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b implements a8d, a.AbstractC0733a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12906a;
    public final a8d b;
    public final PayRequest c;
    public final com.taobao.taobao.a d;
    public volatile boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements CashDeskPayStatusQuery.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "订单状态查询失败：" + str);
            b bVar = b.this;
            String successUrl = b.g(bVar).getSuccessUrl();
            b.i(bVar, successUrl, new PayResultInfo(Constant.CODE_GET_TOKEN_SUCCESS, "async code:" + str, str2, b.g(b.this)));
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "订单状态查询：成功");
            b bVar = b.this;
            b.h(bVar, b.g(bVar).getSuccessUrl(), new PayResultInfo("9000", "9000", str, b.g(b.this)));
        }
    }

    public b(Context context, PayRequest payRequest, a8d a8dVar) {
        this.f12906a = context;
        this.c = payRequest;
        this.b = a8dVar;
        if (payRequest.isUseStandardSdk() || payRequest.isCallWXSDK()) {
            com.taobao.taobao.a aVar = new com.taobao.taobao.a();
            this.d = aVar;
            aVar.a(this);
        }
    }

    public static /* synthetic */ PayRequest g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("a2d02bfc", new Object[]{bVar});
        }
        return bVar.c;
    }

    public static /* synthetic */ void h(b bVar, String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab1a8bf", new Object[]{bVar, str, payResultInfo});
        } else {
            bVar.q(str, payResultInfo);
        }
    }

    public static /* synthetic */ void i(b bVar, String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdd29e", new Object[]{bVar, str, payResultInfo});
        } else {
            bVar.p(str, payResultInfo);
        }
    }

    @Override // tb.a8d
    public void a(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "pay finish ：abort");
        w(payResultInfo);
        n(str, payResultInfo);
    }

    @Override // tb.a8d
    public void b(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "pay finish :failure");
        w(payResultInfo);
        p(str, payResultInfo);
    }

    @Override // tb.a8d
    public void c(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
            return;
        }
        w(payResultInfo);
        q(str, payResultInfo);
    }

    @Override // com.taobao.taobao.a.AbstractC0733a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eb91b6", new Object[]{this});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "onCancelPay");
        o();
    }

    @Override // tb.a8d
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "pay finish ：onExecuteOriPay");
        a8d a8dVar = this.b;
        if (a8dVar != null) {
            a8dVar.e(str);
        }
    }

    @Override // com.taobao.taobao.a.AbstractC0733a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519a650f", new Object[]{this});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "B2F");
        o();
    }

    public final String j(String str, PayResultInfo.ExtendInfo extendInfo, PayResultInfo.SharePayData sharePayData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e1e8793", new Object[]{this, str, extendInfo, sharePayData});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(sharePayData.payurl)) {
            buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, Uri.encode(sharePayData.payurl));
        }
        if (!TextUtils.isEmpty(sharePayData.amount)) {
            buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, Uri.encode(sharePayData.amount));
        }
        if (!TextUtils.isEmpty(extendInfo.payerUserId)) {
            buildUpon.appendQueryParameter("daifuUserId", Uri.encode(extendInfo.payerUserId));
        }
        return buildUpon.build().toString();
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3abfaa69", new Object[]{this, str});
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("tradeHybrid", "true");
        String orderIds = this.c.getOrderIds();
        if (TextUtils.isEmpty(orderIds)) {
            appendQueryParameter.appendQueryParameter("preRequestStorageKey", "paySuccessOrderId_" + orderIds);
        }
        String from = this.c.getFrom();
        if (!TextUtils.isEmpty(from)) {
            appendQueryParameter.appendQueryParameter("openFrom", from);
        }
        return appendQueryParameter.build().toString();
    }

    public final String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6373901", new Object[]{this, str, str2});
        }
        if ("8".equals(str2) || str == null || str.split(",").length != 1) {
            return CashdeskConstants.ORDER_LIST_URL;
        }
        return "http://tm.m.taobao.com/order/order_detail.htm?bizOrderId=" + str + "&archive=0&payOrderId=" + str + "&downgrade2native=true";
    }

    public final String m(PayResultInfo payResultInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("953546fc", new Object[]{this, payResultInfo, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return l(this.c.getOrderIds(), str2);
        }
        if (!this.c.isCallWXSDK()) {
            return Uri.parse(str).buildUpon().appendQueryParameter("alipayResult", Uri.encode(payResultInfo.alipayResult)).build().toString();
        }
        return str;
    }

    public final void n(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddff3e03", new Object[]{this, str, payResultInfo});
            return;
        }
        a8d a8dVar = this.b;
        if (a8dVar != null) {
            a8dVar.a(str, payResultInfo);
        }
        t(m(payResultInfo, this.c.getUnSuccessUrl(), null), payResultInfo, false);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240922cc", new Object[]{this});
            return;
        }
        com.taobao.taobao.a aVar = this.d;
        if (aVar != null) {
            aVar.e(this);
        }
        new CashDeskPayStatusQuery(this.f12906a).startRequest(this.c.getOrderIds(), new a());
    }

    public final void q(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a704d256", new Object[]{this, str, payResultInfo});
            return;
        }
        a8d a8dVar = this.b;
        if (a8dVar != null) {
            a8dVar.c(str, payResultInfo);
        }
        t(m(payResultInfo, this.c.getSuccessUrl(), null), payResultInfo, true);
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ea89d2", new Object[]{this, str});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "PaySuccessPop" + currentTimeMillis;
        buildUpon.appendQueryParameter("paySuccessPopId", str2);
        buildUpon.appendQueryParameter("tradeHybridStartTime", String.valueOf(currentTimeMillis));
        com.taobao.taobao.internal.helper.a.a((Activity) this.f12906a, "CashDeskPaySuccess", str2, buildUpon.build().toString());
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "pay finish 状态 release");
        com.taobao.taobao.a aVar = this.d;
        if (aVar != null) {
            aVar.e(this);
            this.d.d();
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a418c1e", new Object[]{this});
            return;
        }
        com.taobao.taobao.a aVar = this.d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void w(PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16043e8", new Object[]{this, payResultInfo});
        } else if (this.c.isCallWXSDK()) {
            bf3.k(this.c.getExtAttrMap(), payResultInfo.resultStatus, payResultInfo.alipayResult);
        } else {
            bf3.b(this.c.getExtAttrMap(), this.c.getPayMethod(), payResultInfo.resultStatus, payResultInfo.alipayResult);
        }
    }

    public final boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb02965", new Object[]{this, str})).booleanValue();
        }
        if (str.contains("isTBBuyFloatMode=true") || str.contains("99tm=true")) {
            return true;
        }
        return false;
    }

    public final void p(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e57c0bdd", new Object[]{this, str, payResultInfo});
        } else if ("8001".equals(payResultInfo.resultStatus)) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "不支持的支付方式，不需要跳转或者前端回调");
        } else {
            a8d a8dVar = this.b;
            if (a8dVar != null) {
                a8dVar.b(str, payResultInfo);
            }
            t(m(payResultInfo, this.c.getUnSuccessUrl(), payResultInfo.memo), payResultInfo, false);
        }
    }

    public final void r(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71effa51", new Object[]{this, str, new Boolean(z)});
            return;
        }
        String a2 = af3.a(str);
        if (!z || !x(a2)) {
            Nav from = Nav.from(this.f12906a);
            if (this.c.isSingleTop()) {
                from.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
            } else if (this.c.isNeedPop()) {
                from.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else if (xal.a("enableClearTop", true)) {
                from.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            }
            String k = k(a2);
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "打开URL：" + k);
            from.toUri(k);
            return;
        }
        s(a2);
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "浮层样式打开支付成功");
    }

    public final void t(String str, PayResultInfo payResultInfo, boolean z) {
        PayResultInfo.SharePayData sharePayData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624ef143", new Object[]{this, str, payResultInfo, new Boolean(z)});
        } else if (this.e) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "已经收到支付结果，不需要再执行");
        } else {
            this.e = true;
            v();
            if (!z && ("4000".equals(payResultInfo.resultStatus) || "5002".equals(payResultInfo.resultStatus))) {
                Toast.makeText(this.f12906a, "支付失败，请稍后重试", 1).show();
            }
            rvl.f(this.f12906a, null, payResultInfo.from, payResultInfo.alipayResult, z);
            if (PayPasswrdValidateBridge.wvCallBack != null) {
                PayPasswrdValidateBridge.handleAlipayResult(payResultInfo.resultStatus, payResultInfo.memo, payResultInfo.openTime, payResultInfo.resultString, payResultInfo.extendInfoStr);
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "前端自定义模式，参数： " + payResultInfo.alipayResult);
                return;
            }
            PayResultInfo.Result result = payResultInfo.result;
            if (result == null || result.isJumpUrl) {
                PayResultInfo.ExtendInfo extendInfo = payResultInfo.extendInfo;
                if (!(extendInfo == null || (sharePayData = payResultInfo.sharePayData) == null)) {
                    j(str, extendInfo, sharePayData);
                }
                r(str, z);
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "支付结果：isJumpUrl");
        }
    }
}
