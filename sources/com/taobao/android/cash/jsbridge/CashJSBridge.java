package com.taobao.android.cash.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.activity.CustomBrowserActivity;
import com.taobao.android.cash.activity.CustomHalfWXActivity;
import com.taobao.android.cash.activity.TMGWeex2Activity;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.qj4;
import tb.t2o;
import tb.t6s;
import tb.x4x;
import tb.y7s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CashJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CashJSBridge";
    public static final String Tag = "login.cash";
    public WVCallBackContext mCallback;
    public String mPayLoadingUrl = x4x.e;

    static {
        t2o.a(416284705);
    }

    public static /* synthetic */ Context access$000(CashJSBridge cashJSBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("b2394269", new Object[]{cashJSBridge});
        }
        return cashJSBridge.mContext;
    }

    private synchronized void closeCashier(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437e7739", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
            TLog.loge(Tag, "Callback is null");
        } else {
            Context context = this.mContext;
            if (!(context instanceof CustomHalfWXActivity) && !(context instanceof TMGWeex2Activity) && !(context instanceof CustomBrowserActivity)) {
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
            sendLocalBroadCast(new Intent("com.ali.user.cash.close.all"));
            CustomHalfWXActivity.j = str;
        }
    }

    private void getPrefetchData(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6975f45", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.isNull("url") ? null : jSONObject.getString("url"))) {
                TLog.logd(x4x.FRONT_CASHIER_MODULE_NAME, "frontCashier", "getPrefetchData url 为空！");
                return;
            }
            sendLocalBroadCast(new Intent("com.ali.user.cash.bridge.requestPrefetchData"));
            TLog.logd(x4x.FRONT_CASHIER_MODULE_NAME, "frontCashier", "register:" + this);
            this.mContext.getApplicationContext().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.cash.jsbridge.CashJSBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/cash/jsbridge/CashJSBridge$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if ("com.ali.user.cash.bridge.responsePrefetchData".equals(intent.getAction())) {
                        try {
                            CashJSBridge.access$000(CashJSBridge.this).getApplicationContext().unregisterReceiver(this);
                        } catch (Exception e) {
                            TLog.logd(x4x.FRONT_CASHIER_MODULE_NAME, "frontCashier", "unRegister:" + CashJSBridge.this + "," + e.getMessage());
                        }
                        boolean booleanExtra = intent.getBooleanExtra("fail", false);
                        String stringExtra = intent.getStringExtra("resultData");
                        if (booleanExtra) {
                            nsw nswVar = new nsw();
                            nswVar.j("HY_FAILED");
                            wVCallBackContext.error(nswVar);
                            return;
                        }
                        wVCallBackContext.success(stringExtra);
                    }
                }
            }, new IntentFilter("com.ali.user.cash.bridge.responsePrefetchData"));
        } catch (Exception e) {
            TLog.logd(x4x.FRONT_CASHIER_MODULE_NAME, TAG, "getPrefetchData error:" + e.getMessage());
        }
    }

    private void getWeexFromOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc70356", new Object[]{this});
            return;
        }
        try {
            this.mPayLoadingUrl = OrangeConfig.getInstance().getConfig("cash4android", "payloading_url", x4x.e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(CashJSBridge cashJSBridge, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cash/jsbridge/CashJSBridge");
    }

    private synchronized void onBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9089baa", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
            TLog.loge(Tag, "Callback is null");
        } else {
            Context context = this.mContext;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                activity.setResult(0);
                activity.finish();
                activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
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
            Intent intent = new Intent("com.ali.user.cash.card.selected");
            intent.putExtra("data", str);
            sendLocalBroadCast(intent);
            sendLocalBroadCast(new Intent("com.ali.user.cash.close.all.weex"));
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
            sendLocalBroadCast(intent);
            sendLocalBroadCast(new Intent("com.ali.user.cash.close.all"));
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    private synchronized void openBrowser(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808ecb4c", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
            TLog.loge(Tag, "Callback is null");
        } else {
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

    private synchronized void pushPage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57724d7", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
            TLog.loge(Tag, "Callback is null");
        } else {
            this.mCallback = wVCallBackContext;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("url");
                    if (y7s.a(this.mContext, string)) {
                        this.mCallback.success();
                        return;
                    }
                    int optInt = jSONObject.optInt("height");
                    int i = jSONObject.getInt("fullPage");
                    Intent intent = new Intent(this.mContext, CustomHalfWXActivity.class);
                    intent.putExtra(qj4.e, string);
                    intent.putExtra(qj4.c, string);
                    intent.putExtra("height", optInt);
                    intent.putExtra("type", x4x.f31148a);
                    intent.putExtra("fullPage", i);
                    Context context = this.mContext;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        activity.startActivityForResult(intent, 800);
                        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
                        this.mCallback.success();
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

    private void reFreshPage(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b844b2fb", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        Uri uri = null;
        String string = jSONObject.isNull("url") ? null : jSONObject.getString("url");
        Context context = this.mContext;
        if (context instanceof TMGWeex2Activity) {
            TMGWeex2Activity tMGWeex2Activity = (TMGWeex2Activity) context;
            if (string != null) {
                uri = Uri.parse(Uri.decode(string));
            }
            tMGWeex2Activity.s3(uri);
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

    private void skip2TNGD(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1a4b8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                TLog.logd("cash4android", TAG, "skip2TNGD params 为空！");
                wVCallBackContext.error("skip2TNGD params 为空！");
                return;
            }
            Nav withFlags = Nav.from(this.mContext).allowEscape().withFlags(268435456);
            Uri parse = Uri.parse(new JSONObject(str).getString("url"));
            if (!"tngdwallet".equalsIgnoreCase(parse.getScheme())) {
                wVCallBackContext.error("只支持tngdwallet类型schema");
            } else if (withFlags.toUri(parse)) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error("Nav error!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            TLog.logd("cash4android", TAG, e.getMessage());
            wVCallBackContext.error(e.getMessage());
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

    public boolean sendLocalBroadCast(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9ca1a6", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
        TLog.logd(Tag, intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
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

    private synchronized void openH5Page(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0e11f7", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            int optInt = jSONObject.optInt("hasNavBar", 1);
            Intent intent = new Intent(this.mContext, CustomBrowserActivity.class);
            intent.putExtra("url", optString);
            intent.putExtra("hasNavBar", optInt);
            this.mContext.startActivity(intent);
            this.mCallback.success();
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
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
            int optInt = jSONObject.optInt("isClose", 1);
            Nav.from(this.mContext).toUri(optString);
            if (optInt == 1) {
                Context context = this.mContext;
                if (!(context instanceof CustomHalfWXActivity) && !(context instanceof TMGWeex2Activity) && !(context instanceof CustomBrowserActivity)) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
                sendLocalBroadCast(new Intent("com.ali.user.cash.close.all"));
            }
            this.mCallback.success();
        } catch (Exception e) {
            e.printStackTrace();
            setErrorParamCallback(this.mCallback);
        }
    }

    private synchronized void startPayment(String str) {
        String str2;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14862d5", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("url")) {
                String string = jSONObject.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    y7s.a(this.mContext, string);
                    return;
                }
            }
            String optString = jSONObject.optString("queryString");
            getWeexFromOrange();
            Intent intent = new Intent(this.mContext, CustomHalfWXActivity.class);
            String str3 = this.mPayLoadingUrl;
            if (str3.indexOf("?") == -1) {
                str2 = (str3 + "?") + optString;
            } else {
                str2 = (str3 + "&") + optString;
            }
            intent.putExtra("fullPage", 1);
            intent.putExtra("type", x4x.c);
            intent.putExtra(qj4.e, str2);
            intent.putExtra(qj4.c, str2);
            this.mContext.startActivity(intent);
            context = this.mContext;
        } catch (Exception unused) {
            setErrorParamCallback(this.mCallback);
        }
        if (!(context instanceof CustomHalfWXActivity) && !(context instanceof TMGWeex2Activity) && !(context instanceof CustomBrowserActivity)) {
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        }
        sendLocalBroadCast(new Intent("com.ali.user.cash.close.all"));
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
        } else if (!t6s.BRIDGE_ACTION_SKIP2TNGD.equalsIgnoreCase(str)) {
            return false;
        } else {
            skip2TNGD(str2, wVCallBackContext);
        }
        return true;
    }
}
