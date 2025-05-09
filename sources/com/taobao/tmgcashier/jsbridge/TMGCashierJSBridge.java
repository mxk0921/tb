package com.taobao.tmgcashier.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.tmgcashier.TMGCashierActivity;
import com.taobao.tmgcashier.googlepay.TMGGooglePayUtils;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.t6s;
import tb.v6s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMGCashierJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMGCashierJSBridge";
    public WVCallBackContext mCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements v6s.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acec28d8", new Object[]{this, new Boolean(z)});
            } else if (z) {
                TMGCashierJSBridge.this.mCallback.success();
            } else {
                TMGCashierJSBridge.this.mCallback.error();
            }
        }
    }

    static {
        t2o.a(860880910);
    }

    private void checkIsAvailableGooglePay(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87d4026", new Object[]{this, str, wVCallBackContext});
        } else {
            v6s.a(this.mContext, new a());
        }
    }

    private synchronized void closeCashier(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437e7739", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            sendMsg2Activity(1002, null);
        }
    }

    private void getPrefetchData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6975f45", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.isNull("url") ? null : jSONObject.getString("url"))) {
                TLog.logd("tmgcashier", TAG, "getPrefetchData url 为空！");
            } else {
                sendMsg2Activity(1007, wVCallBackContext);
            }
        } catch (Exception e) {
            TLog.logd("tmgcashier", TAG, "getPrefetchData error:" + e.getMessage());
        }
    }

    public static /* synthetic */ Object ipc$super(TMGCashierJSBridge tMGCashierJSBridge, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/jsbridge/TMGCashierJSBridge");
    }

    private synchronized void onBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9089baa", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            if (this.mContext instanceof TMGCashierActivity) {
                sendMsg2Activity(1005, null);
            } else {
                nsw nswVar = new nsw();
                nswVar.j("HY_FAILED");
                wVCallBackContext.error(nswVar);
            }
        }
    }

    private synchronized void onCardSelected(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac77145b", new Object[]{this, str});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra("data", str);
            Context context = this.mContext;
            if (context instanceof Activity) {
                ((Activity) context).setResult(-1, intent);
            }
            sendMsg2Activity(1002, null);
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    private synchronized void onPayResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad505d7", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("resultCode");
            String string = jSONObject.getString("resultMsg");
            Intent intent = new Intent(t6s.BRIDGE_BROADCAST_ACTION_PAY_RESULT);
            intent.putExtra("code", optInt);
            intent.putExtra("message", string);
            Context context = this.mContext;
            if (context != null) {
                LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
            }
            sendMsg2Activity(1002, null);
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    private synchronized void openBrowser(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808ecb4c", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    String string = new JSONObject(str).getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(string));
                        intent.addFlags(268435456);
                        this.mContext.startActivity(intent);
                        this.mCallback.success();
                    } else {
                        setErrorParamCallback(wVCallBackContext);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    setErrorParamCallback(wVCallBackContext);
                }
            } else {
                setErrorParamCallback(wVCallBackContext);
            }
        }
    }

    private synchronized void openH5Page(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0e11f7", new Object[]{this, str});
            return;
        }
        try {
            sendMsg2Activity(1004, str);
            this.mCallback.success();
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    private synchronized void pushPage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57724d7", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            this.mCallback = wVCallBackContext;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.mCallback.success();
                    sendMsg2Activity(1003, jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    setErrorParamCallback(wVCallBackContext);
                }
            } else {
                setErrorParamCallback(wVCallBackContext);
            }
        }
    }

    private void reFreshPage(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b844b2fb", new Object[]{this, str});
        } else {
            sendMsg2Activity(1001, str);
        }
    }

    private void sendMsg2Activity(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24f7c90", new Object[]{this, new Integer(i), obj});
        } else if (this.mContext instanceof TMGCashierActivity) {
            Message obtain = Message.obtain();
            obtain.what = i;
            if (obj != null) {
                obtain.obj = obj;
            }
            ((TMGCashierActivity) this.mContext).f13833a.sendMessage(obtain);
        }
    }

    private void setErrorParamCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e314110", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    private void skip2GooglePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ed5bed", new Object[]{this, str});
        } else {
            sendMsg2Activity(1008, str);
        }
    }

    private void skip2TNGD(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4834fb", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                TLog.logd("cash4android", TAG, "skip2TNGD params 为空！");
                return;
            }
            Nav withFlags = Nav.from(this.mContext).allowEscape().withFlags(268435456);
            Uri parse = Uri.parse(new JSONObject(str).getString("url"));
            if ("tngdwallet".equalsIgnoreCase(parse.getScheme())) {
                withFlags.toUri(parse);
            }
        } catch (Exception e) {
            e.printStackTrace();
            TLog.logd("cash4android", TAG, e.getMessage());
        }
    }

    private synchronized void startPayment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14862d5", new Object[]{this, str});
            return;
        }
        try {
            sendMsg2Activity(1006, new JSONObject(str).optString("url"));
        } catch (Exception unused) {
            setErrorParamCallback(this.mCallback);
        }
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (i == 800 && i2 == -1) {
            if (this.mCallback != null) {
                this.mCallback.success(new nsw());
            }
        } else if (i != 2001 || i2 != -1) {
            this.mCallback.error(new nsw());
        } else if (this.mCallback != null) {
            nsw nswVar = new nsw();
            nswVar.b("region", intent.getStringExtra("regionString"));
            this.mCallback.success(nswVar);
        }
        super.onActivityResult(i, i2, intent);
    }

    private synchronized void chooseMobileArea(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05697d7", new Object[]{this, str});
            return;
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Bundle bundle = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("hotCountryTitle");
                String optString3 = jSONObject.optString("locale");
                String optString4 = jSONObject.optString("errorMsg");
                if (!TextUtils.isEmpty(optString)) {
                    bundle.putString("title", optString);
                }
                if (!TextUtils.isEmpty(optString2)) {
                    bundle.putString("hotCountryTitle", optString2);
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("locale", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("errorMsg", optString4);
                }
                bundle.putBoolean("from_jsbridge", true);
                bundle.putBoolean("from_login", true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Nav.from(activity).forResult(2001).withExtras(bundle).toUri("https://my.m.taobao.com/go/openMobileArea");
        }
    }

    private synchronized void pushNewNavigationPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c57a5a", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            if (jSONObject.optInt("isClose", 1) == 1) {
                sendMsg2Activity(1002, null);
            }
            Nav.from(this.mContext).toUri(optString);
            this.mCallback.success();
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mCallback = wVCallBackContext;
        if ("onBack".equals(str)) {
            onBack(wVCallBackContext);
        } else if (t6s.BRIDGE_ACTION_CLOSECASHIER.equals(str)) {
            closeCashier(str2, wVCallBackContext);
        } else if (t6s.BRIDGE_ACTION_PUSHPAGE.equals(str)) {
            pushPage(str2, wVCallBackContext);
        } else if (t6s.BRIDGE_ACTION_PUSHNEWNAVIGATIONPAGE.equals(str)) {
            pushNewNavigationPage(str2);
        } else if (t6s.BRIDGE_ACTION_OPENBROWSER.equals(str)) {
            openBrowser(str2, wVCallBackContext);
        } else if (t6s.BRIDGE_ACTION_STARTPAYMENT.equals(str)) {
            startPayment(str2);
        } else if (t6s.BRIDGE_ACTION_CHOOSEMOBILEAREA.equals(str)) {
            chooseMobileArea(str2);
        } else if (t6s.BRIDGE_ACTION_ONCARDSELECTED.equals(str)) {
            onCardSelected(str2);
        } else if (t6s.BRIDGE_ACTION_ONPAYRESULT.equals(str)) {
            onPayResult(str2);
        } else if (t6s.BRIDGE_ACTION_OPENH5PAGE.equals(str)) {
            openH5Page(str2);
        } else if (t6s.BRIDGE_ACTION_SETINFO.equals(str)) {
            onCardSelected(str2);
        } else if ("reload".equals(str) || "replace".equals(str)) {
            try {
                reFreshPage(str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (t6s.BRIDGE_ACTION_GETPREFETCHDATA.equals(str)) {
            getPrefetchData(str2, wVCallBackContext);
        } else if (t6s.BRIDGE_ACTION_SKIP2TNGD.equals(str)) {
            skip2TNGD(str2);
        } else if (t6s.BRIDGE_ACTION_SKIP2_GOOGLE_PAY.equals(str)) {
            Context context = this.mContext;
            if (context instanceof TMGCashierActivity) {
                try {
                    TMGGooglePayUtils.startGooglePay((TMGCashierActivity) context, str2);
                } catch (Throwable th) {
                    TLog.loge("tmgcashier", TAG, "startGooglePay error:" + th.getMessage());
                    this.mCallback.error();
                }
            } else {
                skip2GooglePay(str2);
            }
        } else if (!t6s.BRIDGE_ACTION_CHECK_GOOGLE_PAY.equals(str)) {
            return false;
        } else {
            checkIsAvailableGooglePay(str2, wVCallBackContext);
        }
        return true;
    }
}
