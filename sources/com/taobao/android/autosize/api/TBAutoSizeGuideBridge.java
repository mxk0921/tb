package com.taobao.android.autosize.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.tao.log.TLog;
import tb.h7r;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBAutoSizeGuideBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_FOLD_STATUS = "getFoldStatus";
    private static final String GET_MANUFACTURE = "getManufacture";
    private static final String IS_FOLD_DEVICE_ACTION = "isFoldDevice";
    private static final String IS_IN_MAGIC_WINDOW_MODE = "isInMagicWindowMode";
    private static final String IS_PORTRAIT_LAYOUT = "isPortraitLayout";
    private static final String IS_TABLET_ACTION = "isTablet";
    private static final String START_SETTING_ACTIVITY = "startSettingActivity";
    private static final String TAG = "TBAutoSize.PopLayerBridge";

    private static Activity getActivity(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("22f2a7a2", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private void getFoldStatus(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6d031", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        String f = FoldPosture.f(TBDeviceUtils.a(iWVWebView.getContext()));
        nswVar.b("foldStatus", f);
        TLog.loge(TAG, "foldStatus=" + f);
        wVCallBackContext.success(nswVar);
    }

    private void getManufacture(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3924cf", new Object[]{this, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        String str = Build.MANUFACTURER;
        nswVar.b(h7r.MANUFACTURER, str.toLowerCase());
        TLog.loge(TAG, "manufacture=" + str.toLowerCase());
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(TBAutoSizeGuideBridge tBAutoSizeGuideBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/api/TBAutoSizeGuideBridge");
    }

    private void isFoldDevice(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d16769", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        boolean p = TBDeviceUtils.p(iWVWebView.getContext());
        nswVar.a("isFolder", Boolean.valueOf(p));
        TLog.loge(TAG, "isFolder=" + p);
        wVCallBackContext.success(nswVar);
    }

    private void isInMagicWindowMode(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc319c39", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        boolean D = TBDeviceUtils.D(getActivity(iWVWebView.getView()));
        nswVar.a(IS_IN_MAGIC_WINDOW_MODE, Boolean.valueOf(D));
        TLog.loge(TAG, "isInMagicWindowMode=" + D);
        wVCallBackContext.success(nswVar);
    }

    private void isPortraitLayout(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de509457", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        boolean T = TBAutoSizeConfig.x().T(getActivity(iWVWebView.getView()));
        nswVar.a(IS_PORTRAIT_LAYOUT, Boolean.valueOf(T));
        TLog.loge(TAG, "isPortraitLayout=" + T);
        wVCallBackContext.success(nswVar);
    }

    private void isTablet(IWVWebView iWVWebView, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9f16598", new Object[]{this, iWVWebView, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        boolean P = TBDeviceUtils.P(iWVWebView.getContext());
        nswVar.a(IS_TABLET_ACTION, Boolean.valueOf(P));
        TLog.loge(TAG, "isTablet=" + P);
        wVCallBackContext.success(nswVar);
    }

    private void startSettingActivity(IWVWebView iWVWebView, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf5b26f", new Object[]{this, iWVWebView, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            Intent intent = new Intent();
            intent.addFlags(268435456);
            Context context = iWVWebView.getContext();
            if (context == null) {
                nswVar.b("msg", "error: context is null");
                TLog.loge(TAG, "error: context is null");
                wVCallBackContext.error(nswVar);
                return;
            }
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.hashCode() == -759499589 && lowerCase.equals("xiaomi")) {
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applicationmode.ApplicationModeActivity"));
            }
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("action");
            String string2 = parseObject.getString("pkg");
            String string3 = parseObject.getString("cls");
            if (!TextUtils.isEmpty(string)) {
                intent.setAction(string);
            }
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                intent.setComponent(new ComponentName(string2, string3));
            }
            if (TextUtils.isEmpty(intent.getAction()) && intent.getComponent() == null) {
                intent.setAction("android.settings.SETTINGS");
            }
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                nswVar.b("msg", "error: resolveActivity fail.");
                TLog.loge(TAG, "error: resolveActivity fail.");
                wVCallBackContext.error(nswVar);
                return;
            }
            TLog.loge(TAG, "action=" + string + " pkg=" + string2 + " cls=" + string3 + " intentAction=" + intent.getAction() + " intentComponent=" + intent.getComponent() + " context=" + context);
            context.startActivity(intent);
            wVCallBackContext.success(nswVar);
        } catch (Exception e) {
            nswVar.b("msg", "error: JSONException: " + str);
            wVCallBackContext.error(nswVar);
            TLog.loge(TAG, "startSettingActivity: ", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r10.equals(com.taobao.android.autosize.api.TBAutoSizeGuideBridge.IS_PORTRAIT_LAYOUT) == false) goto L_0x005b;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r10, java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.api.TBAutoSizeGuideBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
