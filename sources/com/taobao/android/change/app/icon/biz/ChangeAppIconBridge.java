package com.taobao.android.change.app.icon.biz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.hxv;
import tb.kpw;
import tb.l9m;
import tb.nsw;
import tb.qh3;
import tb.sh3;
import tb.t2o;
import tb.t4v;
import tb.ubl;
import tb.umb;
import tb.vh3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ChangeAppIconBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BASE64PNG = "base64png";
    public static final String KEY_CHANGETYPE = "changeType";
    public static final String KEY_CURRENTICON = "currentIcon";
    public static final String KEY_DEVICEBRAND = "deviceBrand";
    public static final String KEY_DEVICEMODEL = "deviceModel";
    public static final String KEY_ICONNAME = "iconName";
    public static final String KEY_OSVERSION = "osVersion";
    public static final String KEY_RESULT = "result";
    public static final String KEY_SUPPORTEDICONS = "supportedIcons";
    private static final String TAG = "ChangeIconAlternateBridge";
    private ChangeAppIconReceiver mChangeAppIconReceiver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements umb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f6521a;
        public final /* synthetic */ WVCallBackContext b;

        public a(ChangeAppIconBridge changeAppIconBridge, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f6521a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.umb
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.umb
        public void onResult(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4d1d691", new Object[]{this, bundle});
                return;
            }
            boolean z = bundle.getBoolean("result");
            boolean z2 = bundle.getBoolean("moreIcons");
            boolean z3 = bundle.getBoolean("timeOut");
            AdapterForTLog.loge(ChangeAppIconBridge.TAG, "onResult result:" + z + " moreIcons:" + z2 + " timeOut:" + z3);
            this.f6521a.a("result", Boolean.valueOf(z));
            this.f6521a.a("moreIcons", Boolean.valueOf(z2));
            this.f6521a.a("timeOut", Boolean.valueOf(z3));
            this.b.success(this.f6521a);
        }
    }

    static {
        t2o.a(285212675);
    }

    private void callError(WVCallBackContext wVCallBackContext, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e160b8", new Object[]{this, wVCallBackContext, exc});
            return;
        }
        AdapterForTLog.loge(TAG, "callError error", exc);
        exc.printStackTrace();
        wVCallBackContext.onFailure(new nsw());
    }

    public static /* synthetic */ Object ipc$super(ChangeAppIconBridge changeAppIconBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/change/app/icon/biz/ChangeAppIconBridge");
    }

    public void changeAppIcon(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ef0f38", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            nsw nswVar = new nsw();
            ChangeAppIconJSModel changeAppIconJSModel = (ChangeAppIconJSModel) hxv.g(str, ChangeAppIconJSModel.class);
            if (changeAppIconJSModel == null) {
                wVCallBackContext.onFailure(nswVar);
            } else if (!changeAppIconJSModel.isBackgroud()) {
                qh3.g(this.mContext, changeAppIconJSModel);
            } else {
                vh3.f().d(changeAppIconJSModel, new a(this, nswVar, wVCallBackContext));
            }
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void getDeviceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3316e8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            nsw nswVar = new nsw();
            nswVar.b("deviceBrand", Build.BRAND);
            nswVar.b(KEY_DEVICEMODEL, Build.MODEL);
            nswVar.b("osVersion", Build.VERSION.RELEASE);
            wVCallBackContext.onSuccess(nswVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void listIcons(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e76fd6a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, AppIconComponentName> entry : qh3.s().entrySet()) {
                AppIconComponentName value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(KEY_ICONNAME, value.iconName);
                String b = l9m.b(this.mContext, value);
                jSONObject.put(KEY_BASE64PNG, b);
                if (TextUtils.isEmpty(b)) {
                    t4v.a(t4v.PAGE_NAME, "listIcons", value.iconName, "base64Str null", null);
                }
                jSONArray.put(jSONObject);
            }
            AppIconComponentName l = qh3.l(this.mContext);
            nsw nswVar = new nsw();
            nswVar.b(KEY_CURRENTICON, l.iconName);
            nswVar.c(KEY_SUPPORTEDICONS, jSONArray);
            wVCallBackContext.success(nswVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void setIcon(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dedc189", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(KEY_ICONNAME);
            String optString2 = jSONObject.optString("changeType");
            HashMap hashMap = new HashMap();
            hashMap.put(KEY_ICONNAME, optString);
            AppIconComponentName appIconComponentName = qh3.s().get(optString);
            if (appIconComponentName == null) {
                t4v.a(t4v.PAGE_NAME, "setIcon", "model is null", null, hashMap);
                wVCallBackContext.onFailure(nswVar);
                return;
            }
            if (TextUtils.isEmpty(optString2)) {
                optString2 = "SILENT";
            }
            nswVar.b("changeType", optString2);
            hashMap.put("model", appIconComponentName.toString());
            hashMap.put("changeType", optString2);
            t4v.a(t4v.PAGE_NAME, "setIcon", "success", null, hashMap);
            if (TextUtils.equals(optString2, "SILENT")) {
                if (this.mChangeAppIconReceiver != null) {
                    LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mChangeAppIconReceiver);
                    this.mChangeAppIconReceiver = null;
                }
                this.mChangeAppIconReceiver = new ChangeAppIconReceiver(wVCallBackContext);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(sh3.ACTION_CHANGE_APP_ICON_RESULT);
                LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mChangeAppIconReceiver, intentFilter);
                qh3.f(this.mContext, appIconComponentName);
            } else if (TextUtils.equals(optString2, "BG")) {
                wVCallBackContext.onSuccess(nswVar);
                qh3.e(appIconComponentName);
            } else if (TextUtils.equals(optString2, "NOW")) {
                wVCallBackContext.onSuccess(nswVar);
                qh3.d(appIconComponentName);
            } else {
                wVCallBackContext.onFailure(nswVar);
            }
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void supportsAlternateIcons(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28084cb2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            nsw nswVar = new nsw();
            nswVar.a("result", Boolean.valueOf(ubl.a(ubl.ORANGE_KEY_CHANGE_APP_SUPPORT_JS_CHANGE_APP_ICON, "true")));
            wVCallBackContext.success(nswVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ChangeAppIconReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WVCallBackContext f6520a;

        static {
            t2o.a(285212677);
        }

        public ChangeAppIconReceiver(WVCallBackContext wVCallBackContext) {
            this.f6520a = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(ChangeAppIconReceiver changeAppIconReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/change/app/icon/biz/ChangeAppIconBridge$ChangeAppIconReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (this.f6520a != null) {
                    nsw nswVar = new nsw();
                    if (TextUtils.equals(intent.getAction(), sh3.ACTION_CHANGE_APP_ICON_RESULT)) {
                        boolean booleanExtra = intent.getBooleanExtra("result", false);
                        boolean booleanExtra2 = intent.getBooleanExtra("moreIcons", false);
                        boolean booleanExtra3 = intent.getBooleanExtra("timeOut", false);
                        int intExtra = intent.getIntExtra("enableLaunchers", 1);
                        AdapterForTLog.loge(ChangeAppIconBridge.TAG, "recv result:" + booleanExtra + " moreIcons:" + booleanExtra2 + " timeOut:" + booleanExtra3 + " enableLaunchers:" + intExtra);
                        nswVar.a("result", Boolean.valueOf(booleanExtra));
                        nswVar.a("moreIcons", Boolean.valueOf(booleanExtra2));
                        nswVar.a("timeOut", Boolean.valueOf(booleanExtra3));
                        nswVar.a("enableLaunchers", Integer.valueOf(intExtra));
                        if (booleanExtra) {
                            this.f6520a.success(nswVar);
                        } else {
                            this.f6520a.onFailure(nswVar);
                        }
                        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                        this.f6520a = null;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("supportsAlternateIcons".equals(str)) {
            supportsAlternateIcons(str2, wVCallBackContext);
            return true;
        } else if ("listIcons".equals(str)) {
            listIcons(str2, wVCallBackContext);
            return true;
        } else if ("setIcon".equals(str)) {
            setIcon(str2, wVCallBackContext);
            return true;
        } else if ("changeAppIcon".equals(str)) {
            changeAppIcon(str2, wVCallBackContext);
            return true;
        } else if (DeviceInfoJsBridge.ACTION.equals(str)) {
            getDeviceInfo(str2, wVCallBackContext);
            return true;
        } else {
            wVCallBackContext.error();
            return false;
        }
    }
}
