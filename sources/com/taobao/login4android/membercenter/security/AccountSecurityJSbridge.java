package com.taobao.login4android.membercenter.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.utils.NavUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import org.json.JSONObject;
import tb.fsw;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AccountSecurityJSbridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MENU_H5 = "h5";
    public static final String MENU_MENU = "menu";
    public static final String MENU_NATIVE = "native";
    public static String TAG = "login.AccountSecurityJS";
    private BroadcastReceiver receiver;

    public static /* synthetic */ void access$000(AccountSecurityJSbridge accountSecurityJSbridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c1ac91", new Object[]{accountSecurityJSbridge, wVCallBackContext});
        } else {
            accountSecurityJSbridge.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(AccountSecurityJSbridge accountSecurityJSbridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3084a052", new Object[]{accountSecurityJSbridge, wVCallBackContext});
        } else {
            accountSecurityJSbridge.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    private void accountSecurityAction(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405cb471", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("menuStyle");
            String optString2 = jSONObject.optString("hrefUrl");
            String optString3 = jSONObject.optString("scene");
            if (!"h5".equals(optString) && !"menu".equals(optString)) {
                if ("native".equals(optString)) {
                    if (TextUtils.isEmpty(optString3)) {
                        setErrorCallback(wVCallBackContext);
                    } else {
                        registerBroadcast(wVCallBackContext);
                        Login.navByScene(this.mContext, optString3);
                    }
                }
            }
            if (TextUtils.isEmpty(optString2)) {
                setErrorCallback(wVCallBackContext);
            } else {
                NavUtil.navTo(this.mContext, optString2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            setErrorCallback(wVCallBackContext);
        }
    }

    private void doWhenReceiveSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be28a9", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        if (this.receiver != null) {
            LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).unregisterReceiver(this.receiver);
            this.receiver = null;
        }
    }

    private void doWhenReceivedCancel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e383c4", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        if (this.receiver != null) {
            LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).unregisterReceiver(this.receiver);
            this.receiver = null;
        }
    }

    public static /* synthetic */ Object ipc$super(AccountSecurityJSbridge accountSecurityJSbridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/security/AccountSecurityJSbridge");
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            fsw.h("aluAccountSecurityJSbridge", AccountSecurityJSbridge.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b175a2", new Object[]{this, wVCallBackContext});
            return;
        }
        this.receiver = new BroadcastReceiver() { // from class: com.taobao.login4android.membercenter.security.AccountSecurityJSbridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/membercenter/security/AccountSecurityJSbridge$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    if (!LoginResActions.WEB_ACTIVITY_RESULT.equals(intent.getAction()) || !"true".equals(intent.getStringExtra("isSuc"))) {
                        AccountSecurityJSbridge.access$100(AccountSecurityJSbridge.this, wVCallBackContext);
                    } else {
                        AccountSecurityJSbridge.access$000(AccountSecurityJSbridge.this, wVCallBackContext);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(LoginResActions.WEB_ACTIVITY_CANCEL);
        intentFilter.addAction(LoginResActions.WEB_ACTIVITY_RESULT);
        LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).registerReceiver(this.receiver, intentFilter);
    }

    private void setErrorCallback(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c17fa6f", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j("HY_PARAM_ERR");
        wVCallBackContext.error(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"accountSecurityAction".equals(str)) {
            return false;
        }
        accountSecurityAction(wVCallBackContext, str2);
        return true;
    }

    static {
        t2o.a(70254966);
    }
}
