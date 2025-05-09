package com.taobao.tao.alipay.cashdesk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.ext.event.util.AlipayUtil;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.taobao.b;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.CashDeskLog;
import com.uc.webview.export.extension.UCCore;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.af3;
import tb.bf3;
import tb.cf3;
import tb.ds8;
import tb.ef3;
import tb.ff3;
import tb.gf3;
import tb.hav;
import tb.hf3;
import tb.if3;
import tb.kql;
import tb.qbv;
import tb.rvl;
import tb.u1a;
import tb.v9v;
import tb.wxl;
import tb.xal;
import tb.xhi;
import tb.xp3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CashDeskActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RESULT_INTENT_KEY = "cashDeskResult";
    public HashMap<String, String> D0;
    public if3 E0;
    public PayResultInfo F0;
    public b G0;
    public String H0;
    public com.taobao.taobao.utils.a I0;
    public wxl c;

    public static /* synthetic */ String a(CashDeskActivity cashDeskActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46c8289", new Object[]{cashDeskActivity, str});
        }
        cashDeskActivity.H0 = str;
        return str;
    }

    public static /* synthetic */ void b(CashDeskActivity cashDeskActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fc886", new Object[]{cashDeskActivity, new Boolean(z)});
        } else {
            cashDeskActivity.v3(z);
        }
    }

    public static /* synthetic */ PayResultInfo c(CashDeskActivity cashDeskActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayResultInfo) ipChange.ipc$dispatch("abb17ca9", new Object[]{cashDeskActivity});
        }
        return cashDeskActivity.F0;
    }

    public static /* synthetic */ PayResultInfo d(CashDeskActivity cashDeskActivity, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayResultInfo) ipChange.ipc$dispatch("297d814b", new Object[]{cashDeskActivity, payResultInfo});
        }
        cashDeskActivity.F0 = payResultInfo;
        return payResultInfo;
    }

    public static /* synthetic */ void e(CashDeskActivity cashDeskActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6013e096", new Object[]{cashDeskActivity, str});
        } else {
            cashDeskActivity.t3(str);
        }
    }

    public static /* synthetic */ b f(CashDeskActivity cashDeskActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a8547b28", new Object[]{cashDeskActivity});
        }
        return cashDeskActivity.G0;
    }

    public static /* synthetic */ boolean g(CashDeskActivity cashDeskActivity, String str, PayResultInfo payResultInfo, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b21d01d", new Object[]{cashDeskActivity, str, payResultInfo, bVar})).booleanValue();
        }
        return cashDeskActivity.h(str, payResultInfo, bVar);
    }

    public static /* synthetic */ Object ipc$super(CashDeskActivity cashDeskActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/cashdesk/CashDeskActivity");
        }
    }

    public static /* synthetic */ HashMap l3(CashDeskActivity cashDeskActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a6b50e94", new Object[]{cashDeskActivity});
        }
        return cashDeskActivity.D0;
    }

    public static /* synthetic */ if3 m3(CashDeskActivity cashDeskActivity, if3 if3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (if3) ipChange.ipc$dispatch("19833c14", new Object[]{cashDeskActivity, if3Var});
        }
        cashDeskActivity.E0 = if3Var;
        return if3Var;
    }

    public final String A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7905aabb", new Object[]{this});
        }
        boolean J3 = J3();
        String str = this.D0.get("signStr");
        if (!TextUtils.isEmpty(str)) {
            if (!J3) {
                return str;
            }
            try {
                return URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                bf3.g("DECODE_EXCEPTION", e.getMessage());
            }
        }
        Uri data = getIntent().getData();
        return data != null ? J3 ? data.getQuery() != null ? data.getQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "").replaceAll("&encodeParams=true", "") : str : data.getEncodedQuery() != null ? data.getEncodedQuery().replaceAll("&taobaoCheckPayPasswordAction=true", "") : str : str;
    }

    public final String B3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbc479d6", new Object[]{this, str});
        }
        if (str == null || str.contains(",")) {
            return CashdeskConstants.ORDER_LIST_URL;
        }
        return ("http://tm.m.taobao.com/order/order_detail.htm?bizOrderId=" + str + "&archive=0&payOrderId=" + str).concat("&downgrade2native=true");
    }

    public final String E3(String str, String str2, PayResultInfo payResultInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b0bb76c", new Object[]{this, str, str2, payResultInfo, new Boolean(z)});
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            if (payResultInfo != null) {
                Uri.Builder buildUpon = parse.buildUpon();
                String path = parse.getPath();
                if (path == null || path.isEmpty()) {
                    buildUpon.appendPath("");
                }
                buildUpon.appendQueryParameter("alipayResult", Uri.encode(payResultInfo.alipayResult));
                str2 = buildUpon.toString();
            }
            R3(str2, z);
            return str2;
        }
        String B3 = B3(str);
        R3(B3, z);
        return B3;
    }

    public final boolean F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cbb7ad", new Object[]{this})).booleanValue();
        }
        HashMap<String, String> hashMap = this.D0;
        if (hashMap == null) {
            return false;
        }
        return !TextUtils.isEmpty(hashMap.get("agednessVersion"));
    }

    public final boolean I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24781169", new Object[]{this})).booleanValue();
        }
        return "true".equals(this.D0.get(CashdeskConstants.VALIDATE_ARGS));
    }

    public final boolean J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5abeff11", new Object[]{this})).booleanValue();
        }
        return "true".equals(this.D0.get(CashdeskConstants.ENCODE_PARAMS));
    }

    public final boolean P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("203cb3e7", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(this.D0.get("alipayURL"));
    }

    public final void Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7705c064", new Object[]{this});
            return;
        }
        U3();
        V3();
    }

    public final void R3(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ff71fe", new Object[]{this, str, new Boolean(z)});
            return;
        }
        String a2 = af3.a(str);
        if (!z || !Z3(a2)) {
            Nav from = Nav.from(this);
            if (N3()) {
                from.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
            } else if (K3()) {
                from.withFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            }
            String s3 = s3(a2);
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "跳转到：" + s3);
            from.toUri(s3);
            return;
        }
        S3(a2);
    }

    public final void S3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ea89d2", new Object[]{this, str});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Map<String, String> b = gf3.b(this.D0);
        if (b != null) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String str2 = "PaySuccessPop" + System.currentTimeMillis();
        buildUpon.appendQueryParameter("paySuccessPopId", str2);
        com.taobao.taobao.internal.helper.a.a(this, "CashDeskPaySuccess", str2, buildUpon.toString());
    }

    public final void T3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81ff8bc", new Object[]{this, intent});
            return;
        }
        this.c.t();
        com.taobao.taobao.utils.a aVar = new com.taobao.taobao.utils.a("alipay", this.D0);
        this.I0 = aVar;
        aVar.b();
        W3();
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "拉起支付宝收银台");
        startActivity(intent);
    }

    public final void V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e2d2ce", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = this.D0;
        if (hashMap == null) {
            hav.g("CashDeskActivity", "preRequestPaySuccess:", "invalid params");
        } else {
            af3.c(this, hashMap.get("orderids"), this.D0.get("backURL"));
        }
    }

    public final void W3() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e419cafb", new Object[]{this});
            return;
        }
        if (O3()) {
            bVar = u3(this.D0);
        } else {
            bVar = null;
        }
        this.G0 = bVar;
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_SUCCESS");
        intentFilter.addAction("com.alipay.android.app.pay.ACTION_PAY_FAILED");
        instance.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.tao.alipay.cashdesk.CashDeskActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/cashdesk/CashDeskActivity$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                instance.unregisterReceiver(this);
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "支付宝收银结束:" + intent.getAction());
                CashDeskActivity.d(CashDeskActivity.this, new PayResultInfo(intent));
                if (CashDeskActivity.l3(CashDeskActivity.this) == null) {
                    bf3.g("PARAMS_EMPTY", CashDeskActivity.c(CashDeskActivity.this).alipayResult);
                    CashDeskLog.e(CashDeskLog.TagLevel.CORE, "PARAMS_EMPTY:" + CashDeskActivity.c(CashDeskActivity.this).alipayResult);
                    return;
                }
                CashDeskActivity.c(CashDeskActivity.this).from = (String) CashDeskActivity.l3(CashDeskActivity.this).get("from");
                if (!"9000".equals(CashDeskActivity.c(CashDeskActivity.this).resultStatus) || CashDeskActivity.c(CashDeskActivity.this).extendInfo == null || TextUtils.isEmpty(CashDeskActivity.c(CashDeskActivity.this).extendInfo.authCode)) {
                    CashDeskActivity.g(CashDeskActivity.this, intent.getAction(), CashDeskActivity.c(CashDeskActivity.this), CashDeskActivity.f(CashDeskActivity.this));
                    CashDeskActivity.this.finish();
                    return;
                }
                CashDeskActivity cashDeskActivity = CashDeskActivity.this;
                CashDeskActivity.e(cashDeskActivity, CashDeskActivity.c(cashDeskActivity).extendInfo.authCode);
                bf3.f(bf3.a.a("cashdesk_pv").tag("jumpBindAccount").dimension("d1", CashDeskActivity.c(CashDeskActivity.this).from).dimension("d2", "alipay").sampling(1.0f));
            }
        }, intentFilter);
    }

    public final void X3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2468cb59", new Object[]{this, str, str2});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        Intent intent = new Intent(CashdeskConstants.CASHDESK_BROADCAST_RESULT_ACTION);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("result", str2);
        }
        instance.sendBroadcast(intent);
    }

    public final void Y3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8371f76a", new Object[]{this, intent});
        } else if (intent != null && this.D0 != null) {
            String sid = Login.getSid();
            String str = this.D0.get("agednessVersion");
            if (TextUtils.isEmpty(sid)) {
                intent.putExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS, "{\"agednessVersion\":\"" + str + "\"}");
                return;
            }
            intent.putExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS, "{\"user_token\":\"" + sid + "\",\"user_token_type\":\"tbsid\",\"agednessVersion\":\"" + str + "\"}");
        }
    }

    public final boolean Z3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb02965", new Object[]{this, str})).booleanValue();
        }
        if (!xal.a("enableNewFloatMode", true)) {
            return gf3.c(this.D0);
        }
        if (str.contains("isTBBuyFloatMode=true") || str.contains("99tm=true")) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void b4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cb6c6d", new Object[]{this});
        } else if (H3()) {
            X3(null, null);
            finish();
        } else {
            String str = this.D0.get("alipayURL");
            Nav.from(this).toUri(str);
            finish();
            ef3.h(str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        b bVar = this.G0;
        if (bVar != null) {
            bVar.u();
        }
        if (L3()) {
            setResult(-1);
        }
        super.finish();
    }

    public final void i(b bVar, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebc7cb9", new Object[]{this, bVar, payResultInfo});
        } else if (payResultInfo == null) {
        } else {
            if (bVar != null) {
                bVar.c(this.D0.get("backURL"), payResultInfo);
            } else {
                PayPasswrdValidateBridge.handleAlipayResult(payResultInfo.resultStatus, payResultInfo.memo, payResultInfo.openTime, payResultInfo.resultString, payResultInfo.extendInfoStr);
            }
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d650d31", new Object[]{this})).booleanValue();
        }
        if3 if3Var = this.E0;
        if (if3Var == null || if3Var.a() == null) {
            return false;
        }
        return "bindAccount".equals(this.E0.a().c());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 6540) {
            i(this.G0, this.F0);
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.D0 = null;
        this.E0 = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        HashMap<String, String> b = kql.b(intent);
        this.D0 = b;
        if (b == null) {
            finish();
        }
    }

    public final void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77879e7", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        String A3 = A3();
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "getSignStr ：" + A3);
        if (!TextUtils.isEmpty(A3)) {
            intent.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, A3);
        }
        if (F3()) {
            Y3(intent);
        } else {
            String sid = Login.getSid();
            if (!TextUtils.isEmpty(sid)) {
                intent.putExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS, "{\"user_token\": \"" + sid + "\",\"user_token_type\": \"tbsid\"}");
            }
        }
        q3(intent);
        T3(intent);
    }

    public final void r3(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848e04cf", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
            String string = jSONObject2.getString("url");
            String A3 = A3();
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "getSignStr ：" + A3);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(A3)) {
                jSONObject2.put("url", (Object) Uri.parse(string).buildUpon().appendQueryParameter("signStr", A3).toString());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("backURL", (Object) this.D0.get("backURL"));
                jSONObject3.put("unSuccessUrl", (Object) this.D0.get("unSuccessUrl"));
                jSONObject3.putAll(this.D0);
                jSONObject2.put("content", (Object) jSONObject3);
            }
        }
    }

    public final void t3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fe5c1", new Object[]{this, str});
            return;
        }
        String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("x_region_info");
        Uri.Builder buildUpon = Uri.parse(w3()).buildUpon();
        buildUpon.appendQueryParameter(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, str);
        buildUpon.appendQueryParameter(MspGlobalDefine.LANG, globalProperty);
        String uri = buildUpon.build().toString();
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "跳转到绑卡页面：" + uri);
        Nav.from(this).forResult(6540).toUri(uri);
    }

    public final b u3(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5633249", new Object[]{this, hashMap});
        }
        PayRequest payRequest = new PayRequest();
        payRequest.setExtAttrMap(hashMap);
        payRequest.setCashierParam(this.E0);
        payRequest.setActionParams(hashMap.get("signStr"));
        payRequest.setFrom(hashMap.get("from"));
        payRequest.setOrderIds(z3(hashMap));
        payRequest.setSuccessUrl(hashMap.get("backURL"));
        payRequest.setUnSuccessUrl(hashMap.get("unSuccessUrl"));
        payRequest.setNextAction(hashMap.get("cashierType"));
        return new b(this, payRequest, null);
    }

    public final String w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79984104", new Object[]{this});
        }
        if (EnvironmentSwitcher.a() == 0) {
            return "https://passport.taobao.com/ac/h5/alipay_bind_by_auth_code?bizEntrance=alipay_success_recommend_bind&fromSite=0";
        }
        return "https://passportpre.taobao.com/ac/h5/alipay_bind_by_auth_code?bizEntrance=alipay_success_recommend_bind&fromSite=0";
    }

    public final JSONObject x3(HashMap<String, String> hashMap) {
        JSONObject jSONObject;
        PayRequest c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a8d7c97b", new Object[]{this, hashMap});
        }
        if3 if3Var = this.E0;
        if (if3Var != null) {
            jSONObject = if3Var.d();
        } else {
            jSONObject = null;
        }
        if (jSONObject != null || (c = hf3.b().c()) == null || c.getExtAttrMap() == null) {
            return jSONObject;
        }
        return y3(hashMap);
    }

    public final JSONObject y3(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("739b3ec7", new Object[]{this, hashMap});
        }
        String str = hashMap.get("cashierParam");
        if (str == null) {
            hav.d("CashDeskActivity", "cashierParamsStr 为null");
            return null;
        }
        JSONObject a2 = cf3.a(str);
        if (a2 != null) {
            return a2.getJSONObject("sdkExtParams");
        }
        hav.d("CashDeskActivity", "cashierParams 为null");
        return null;
    }

    public final String z3(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a24c8642", new Object[]{this, map});
        }
        String str = map.get("orderids");
        return TextUtils.isEmpty(str) ? map.get("orderIds") : str;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements u1a<String, if3, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public Object invoke(String str, if3 if3Var) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("29ebc662", new Object[]{this, str, if3Var});
            }
            if (str != null) {
                CashDeskActivity.l3(CashDeskActivity.this).put("signStr", str);
            }
            CashDeskActivity.m3(CashDeskActivity.this, if3Var);
            CashDeskActivity.a(CashDeskActivity.this, "alipay");
            CashDeskActivity cashDeskActivity = CashDeskActivity.this;
            if (str == null) {
                z = false;
            }
            CashDeskActivity.b(cashDeskActivity, z);
            return null;
        }
    }

    public final boolean O3() {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70fde49f", new Object[]{this})).booleanValue();
        }
        if3 if3Var = this.E0;
        if (if3Var == null || (d = if3Var.d()) == null) {
            return false;
        }
        return d.getBooleanValue("useStandardSdk");
    }

    public final void U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569e4fbb", new Object[]{this});
        } else if (v9v.i("new_purchase", "preRenderPaySuccessInCashDesk", true)) {
            HashMap<String, String> hashMap = this.D0;
            if (hashMap == null || !TextUtils.equals(ds8.UT_PAGE_NAME, hashMap.get("from"))) {
                hav.g("CashDeskActivity", "preRenderPaySuccess:", "not from purchase");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) this);
            qbv.j().a(UltronTradeHybridStage.ON_RENDER_END, "purchase", jSONObject);
        }
    }

    public final void a4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f271b1d", new Object[]{this});
            return;
        }
        String str = this.D0.get("signStr");
        Intent intent = new Intent();
        intent.setPackage(getPackageName());
        intent.setAction(CashdeskConstants.ALIPAY_ACTION);
        intent.putExtra(CashdeskConstants.ALIPAY_SIGN_STR, str == null ? "" : str);
        if (F3()) {
            Y3(intent);
        } else {
            String sid = Login.getSid();
            if (!TextUtils.isEmpty(sid)) {
                intent.putExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS, "{\"user_token\": \"" + sid + "\",\"user_token_type\": \"tbsid\"}");
            }
        }
        q3(intent);
        intent.putExtra("create_live_connection", true);
        intent.putExtra("msp_pre_load", true);
        intent.putExtra("callback_url", ff3.ORDER_LIST_ALL);
        T3(intent);
        ef3.g(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "进入收银台");
        bf3.i();
        HashMap<String, String> b = kql.b(getIntent());
        this.D0 = b;
        if (b == null) {
            finish();
            return;
        }
        bf3.e("enterCashDesk", 0, b.get("from"));
        new ff3(this, this.D0).d(new a());
        Q3();
    }

    public final void q3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293c02d1", new Object[]{this, intent});
            return;
        }
        JSONObject a2 = cf3.a(intent.getStringExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS));
        if (a2 == null) {
            a2 = new JSONObject();
        }
        String f = xp3.f(this, true);
        if (!TextUtils.isEmpty(f)) {
            a2.put(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY, (Object) f);
        }
        JSONObject x3 = x3(this.D0);
        if (x3 != null) {
            a2.putAll(x3);
        }
        intent.putExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS, a2.toJSONString());
    }

    public final String s3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3abfaa69", new Object[]{this, str});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (xal.a("appendTradeHybrid", true)) {
            buildUpon.appendQueryParameter("tradeHybrid", "true");
        }
        HashMap<String, String> hashMap = this.D0;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("orderids"))) {
            buildUpon.appendQueryParameter("preRequestStorageKey", "paySuccessOrderId_" + this.D0.get("orderids"));
        }
        HashMap<String, String> hashMap2 = this.D0;
        String str2 = hashMap2 != null ? hashMap2.get("from") : null;
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("openFrom", str2);
        }
        buildUpon.appendQueryParameter("payMethod", "cashDesk");
        return buildUpon.build().toString();
    }

    public final boolean H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c1cdfe2", new Object[]{this})).booleanValue();
        }
        String str = this.D0.get("broadcast");
        return "1".equals(str) || "true".equals(str);
    }

    public final boolean K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c49d5c", new Object[]{this})).booleanValue();
        }
        String str = this.D0.get(CashdeskConstants.KEY_NEED_POP);
        return "1".equals(str) || "true".equals(str);
    }

    public final boolean L3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f42f2f2", new Object[]{this})).booleanValue();
        }
        HashMap<String, String> hashMap = this.D0;
        if (hashMap == null) {
            return false;
        }
        String str = hashMap.get("result");
        return "1".equals(str) || "true".equals(str);
    }

    public final boolean M3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0667217", new Object[]{this})).booleanValue();
        }
        String str = this.D0.get("simplepay");
        return "1".equals(str) || "true".equals(str);
    }

    public final boolean N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b41cee", new Object[]{this})).booleanValue();
        }
        String str = this.D0.get(CashdeskConstants.KEY_SINGLE_TOP);
        return "1".equals(str) || "true".equals(str);
    }

    public final void v3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72367c8e", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = this.D0.get("from");
        boolean O3 = O3();
        if (O3) {
            bf3.f(bf3.a.a("cashdesk_pv").tag("支付宝换端支付").dimension("d1", str).dimension("d2", "alipay").sampling(1.0f));
            this.H0 = "alipay_standard";
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "拉支付宝app支付");
        }
        if (!O3 || xp3.g(this)) {
            wxl wxlVar = new wxl(this, PayRequest.CALL_ALIPAY_SDK);
            this.c = wxlVar;
            wxlVar.p(this.D0);
            if (z) {
                bf3.e("asyncRecall", 6, str);
            }
            if (m()) {
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "execute bindAccount");
                if3 if3Var = this.E0;
                if (!(if3Var == null || if3Var.a() == null)) {
                    JSONObject a2 = this.E0.a().a();
                    r3(a2);
                    xhi.h(this, a2, null);
                }
                bf3.f(bf3.a.a("cashdesk_pv").tag("快绑账号").dimension("d1", str).dimension("d2", "alipay").sampling(1.0f));
                bf3.e("bindAccount", 8, str);
                finish();
            } else if (I3()) {
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "execute aliPayValidate");
                p3();
                if (!z) {
                    bf3.e("aliPayValidate", 1, str);
                }
            } else if (M3()) {
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "execute simplePay");
                a4();
                if (!z) {
                    bf3.e("simplePay", 2, str);
                }
            } else if (P3()) {
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "execute wap");
                b4();
                if (!z) {
                    bf3.e("wap", 3, str);
                }
            } else {
                CashDeskLog.e(CashDeskLog.TagLevel.CORE, "not fund type, finish!");
                finish();
            }
        } else {
            bf3.f(bf3.a.a("aacMonitor").tag("换端支付-未安装支付宝").dimension("d1", str).sampling(1.0f));
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "请下载最新版支付宝APP后完成本次支付");
            xhi.i("请下载最新版支付宝APP后完成本次支付");
            finish();
        }
    }

    public final boolean h(String str, PayResultInfo payResultInfo, b bVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b64b2d1", new Object[]{this, str, payResultInfo, bVar})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        this.c.s(payResultInfo.openTime, payResultInfo.renderTime, payResultInfo.resultStatus);
        rvl.e(this, str, payResultInfo.from, payResultInfo.alipayResult, TextUtils.equals(str, "com.alipay.android.app.pay.ACTION_PAY_SUCCESS"));
        if (H3()) {
            X3(str, payResultInfo.alipayResult);
            return true;
        }
        String str4 = this.D0.get("orderids");
        String str5 = this.D0.get("backURL");
        String str6 = this.D0.get("unSuccessUrl");
        String str7 = this.D0.get(AlipayUtil.KEY_ALIPAY_BLOCK);
        bf3.b(this.D0, this.H0, payResultInfo.resultStatus, payResultInfo.alipayResult);
        if (PayPasswrdValidateBridge.isNeedResultCallback()) {
            i(bVar, payResultInfo);
            ef3.d(payResultInfo.alipayResult);
            return true;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "支付结果：" + payResultInfo.resultStatus);
        if (TextUtils.equals(str, "com.alipay.android.app.pay.ACTION_PAY_SUCCESS")) {
            com.taobao.taobao.utils.a aVar = this.I0;
            if (aVar != null) {
                aVar.c();
            }
            ef3.c();
            if ("9000".equals(payResultInfo.resultStatus) && (str3 = payResultInfo.resultString) != null) {
                try {
                    JSONObject parseObject = JSON.parseObject(str3);
                    if (!parseObject.containsKey("isJumpUrl") || ((Boolean) parseObject.get("isJumpUrl")).booleanValue()) {
                        JSONObject parseObject2 = JSON.parseObject(payResultInfo.resultString);
                        if (parseObject2.containsKey("biz_type") && TextUtils.equals(parseObject2.getString("biz_type"), "share_pp") && !TextUtils.isEmpty(payResultInfo.extendInfoStr)) {
                            JSONObject parseObject3 = JSON.parseObject(payResultInfo.extendInfoStr);
                            if (parseObject3.containsKey("sharepayData")) {
                                JSONObject parseObject4 = JSON.parseObject(parseObject3.getString("sharepayData"));
                                String string = parseObject4.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL);
                                String string2 = parseObject4.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
                                if (!TextUtils.isEmpty(string)) {
                                    Uri parse = Uri.parse(str5);
                                    Uri.Builder buildUpon = parse.buildUpon();
                                    String path = parse.getPath();
                                    if (path == null || path.length() == 0) {
                                        buildUpon.appendPath("");
                                    }
                                    buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, Uri.encode(string));
                                    if (!TextUtils.isEmpty(string2)) {
                                        buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, Uri.encode(string2));
                                    }
                                    if (parseObject3.containsKey("payerUserId")) {
                                        buildUpon.appendQueryParameter("daifuUserId", Uri.encode(parseObject3.getString("payerUserId")));
                                    }
                                    str5 = buildUpon.toString();
                                }
                            }
                        }
                    } else {
                        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "支付结果：isJumpUrl");
                        return true;
                    }
                } catch (Exception e) {
                    CashDeskLog.e(CashDeskLog.TagLevel.CORE, Log.getStackTraceString(e));
                }
            }
            if (TextUtils.isEmpty(str7)) {
                if (bVar != null) {
                    bVar.c(null, payResultInfo);
                } else {
                    E3(str4, str5, null, true);
                    return true;
                }
            }
            return true;
        }
        if (TextUtils.equals(str, "com.alipay.android.app.pay.ACTION_PAY_FAILED")) {
            ef3.b(payResultInfo);
            ef3.a(payResultInfo);
            hav.d("CashDeskActivity", "支付宝支付失败 错误码：" + payResultInfo.resultStatus);
            if (!TextUtils.isEmpty(str7)) {
                str2 = str6;
            } else if (bVar != null) {
                str2 = str6;
                bVar.b(str2, payResultInfo);
            } else {
                str2 = str6;
                E3(str4, str2, payResultInfo, false);
                com.taobao.taobao.utils.a aVar2 = this.I0;
                if (aVar2 != null) {
                    aVar2.a(payResultInfo.resultStatus);
                }
            }
            if (!"6001".equals(payResultInfo.resultStatus)) {
                ef3.e(payResultInfo, this.D0.get("signStr"), str2, K3());
            }
        }
        ef3.f(payResultInfo.alipayResult);
        return true;
    }
}
