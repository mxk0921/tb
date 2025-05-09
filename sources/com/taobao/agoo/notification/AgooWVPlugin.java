package com.taobao.agoo.notification;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hi0;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.xpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AgooWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ENABLE_NOTIFICATION = "enableNotification";
    private static final String ACTION_NOTIFICATION_ENABLED = "isNotificationEnabled";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_SCENE = "scene";
    private static final String KEY_TYPE = "type";
    private static final String TAG = "AgooWVPlugin";
    public static final String WV_NAME = "WVAgoo";

    static {
        t2o.a(343933305);
    }

    public static /* synthetic */ Object ipc$super(AgooWVPlugin agooWVPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/agoo/notification/AgooWVPlugin");
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        ALog.e(TAG, "initialize", "context", context, "webView", iWVWebView);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        String str3;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        ALog.e(TAG, xpc.RECORD_EXECUTE, "action", str, "params", str2);
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            ALog.e(TAG, "execute json err", e, "action", str, "params", str2);
            jSONObject = null;
        }
        if (ACTION_ENABLE_NOTIFICATION.equals(str)) {
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.optString("scene");
            }
            if (jSONObject != null) {
                i = jSONObject.optInt("type");
            }
            hi0.d(this.mContext, str3, i);
            return true;
        } else if (!ACTION_NOTIFICATION_ENABLED.equals(str)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                nsw nswVar = nsw.RET_SUCCESS;
                nswVar.a(KEY_ENABLED, Boolean.valueOf(hi0.g(this.mContext)));
                wVCallBackContext.success();
                ALog.e(TAG, "isNotificationEnabled result: " + nswVar.m(), new Object[0]);
            }
            return true;
        }
    }
}
