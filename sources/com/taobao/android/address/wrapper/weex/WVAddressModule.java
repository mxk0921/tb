package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.AddressParams;
import com.taobao.android.address.wrapper.widget.RealtimeSpeechView;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.uc.webview.export.extension.UCExtension;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ef0;
import tb.gf0;
import tb.hbq;
import tb.kf0;
import tb.kpw;
import tb.mtv;
import tb.nsw;
import tb.r4p;
import tb.rf0;
import tb.sf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WVAddressModule extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHOOSE_ADDRESS = "userChoosedAddress";
    private static final String ACTION_GET_ADDRESS_PARAMS = "getAddressParams";
    private static final String ACTION_OPEN_H5_PAGE = "openH5Page";
    public static final String ACTION_SPEECH_RECOGNITION = "speechRecognition";
    public static final String ACTION_SUPPORT_SPEECH_RECOGNITION = "isSupportSpeechRecognizer";
    public static final String ACTION_USER_SWITCH_RECOMMEND_ADDRESS = "onUserChangeRecommendAddress";
    public static final String PLUGIN_NAME = "ALBBAddress";
    private static hbq speechRecognitionDialog;
    private String currentSelectType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f6311a;

        public a(WVAddressModule wVAddressModule, WVCallBackContext wVCallBackContext) {
            this.f6311a = wVCallBackContext;
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else if (this.f6311a != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", i);
                    jSONObject.put("message", str);
                    nsw nswVar = new nsw();
                    nswVar.h(jSONObject);
                    this.f6311a.error(nswVar);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", str);
                nsw nswVar = new nsw();
                nswVar.h(jSONObject);
                this.f6311a.success(nswVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6312a;
        public final /* synthetic */ ef0 b;

        public b(Activity activity, ef0 ef0Var) {
            this.f6312a = activity;
            this.b = ef0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity activity = this.f6312a;
            Toast.makeText(activity, activity.getString(R.string.address_request_record_auto_fail), 0).show();
            ef0 ef0Var = this.b;
            if (ef0Var != null) {
                ef0Var.onFail(1, "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6313a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ef0 c;

        public c(Activity activity, String str, ef0 ef0Var) {
            this.f6313a = activity;
            this.b = str;
            this.c = ef0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVAddressModule.access$000(this.f6313a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements RealtimeSpeechView.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ef0 f6314a;

        public d(ef0 ef0Var) {
            this.f6314a = ef0Var;
        }

        @Override // com.taobao.android.address.wrapper.widget.RealtimeSpeechView.j
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            WVAddressModule.access$100().dismiss();
            ef0 ef0Var = this.f6314a;
            if (ef0Var != null) {
                ef0Var.onFail(0, "");
            }
        }

        @Override // com.taobao.android.address.wrapper.widget.RealtimeSpeechView.j
        public void onRecognizedCompleted(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5ca4b07", new Object[]{this, str});
                return;
            }
            WVAddressModule.access$100().dismiss();
            ef0 ef0Var = this.f6314a;
            if (ef0Var != null) {
                ef0Var.onSuccess(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RealtimeSpeechView f6315a;
        public final /* synthetic */ ef0 b;

        public e(RealtimeSpeechView realtimeSpeechView, ef0 ef0Var) {
            this.f6315a = realtimeSpeechView;
            this.b = ef0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            RealtimeSpeechView realtimeSpeechView = this.f6315a;
            if (realtimeSpeechView != null) {
                realtimeSpeechView.cancelRecorder();
            }
            ef0 ef0Var = this.b;
            if (ef0Var != null) {
                ef0Var.onFail(0, "");
            }
        }
    }

    public static /* synthetic */ void access$000(Activity activity, String str, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ada70f7", new Object[]{activity, str, ef0Var});
        } else {
            showRecognitionDialog(activity, str, ef0Var);
        }
    }

    public static /* synthetic */ hbq access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbq) ipChange.ipc$dispatch("6f6251ad", new Object[0]);
        }
        return speechRecognitionDialog;
    }

    public static void cancel(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a717693", new Object[]{activity});
            return;
        }
        activity.setResult(0);
        activity.finish();
    }

    public static void destoryRecognition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3778290a", new Object[0]);
            return;
        }
        speechRecognitionDialog = null;
        speechRecognitionDialog = null;
    }

    public static /* synthetic */ Object ipc$super(WVAddressModule wVAddressModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/wrapper/weex/WVAddressModule");
        }
    }

    private void returnErr(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29cc959", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("message", "fail");
            nsw nswVar = new nsw();
            nswVar.h(jSONObject);
            wVCallBackContext.error(nswVar);
        } catch (Throwable unused) {
        }
    }

    public static void speechRecognition(Activity activity, String str, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae676c7c", new Object[]{activity, str, ef0Var});
        } else {
            com.taobao.runtimepermission.a.c(activity, new String[]{"android.permission.RECORD_AUDIO"}).t(WXAddressModule2.PLUGIN_NAME).w(activity.getString(R.string.address_request_record_auto)).x(true).y(0L).A(new c(activity, str, ef0Var)).z(new b(activity, ef0Var)).m();
        }
    }

    public static void stopRecognition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3fbc5c", new Object[0]);
            return;
        }
        hbq hbqVar = speechRecognitionDialog;
        if (hbqVar != null && hbqVar.isShowing()) {
            speechRecognitionDialog.cancel();
        }
    }

    public void callbackParams(String str, WVCallBackContext wVCallBackContext) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16dd7b9", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null && (context = this.mContext) != null) {
            Activity activity = (Activity) context;
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                Intent intent = new Intent();
                if (TextUtils.isEmpty(str) || parseObject.isEmpty()) {
                    cancel(activity);
                } else {
                    intent.putExtra("data", str);
                    activity.setResult(-1, intent);
                    activity.finish();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                cancel(activity);
            }
        }
    }

    public void getAddressParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aea3532", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null || this.mContext == null) {
            returnErr(wVCallBackContext);
        } else {
            try {
                nsw nswVar = new nsw();
                nswVar.h(sf0.c());
                wVCallBackContext.success(nswVar);
            } catch (Exception e2) {
                e2.printStackTrace();
                returnErr(wVCallBackContext);
            }
        }
    }

    public void getParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0bfcca", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null) {
            try {
                nsw nswVar = new nsw();
                JSONObject jSONObject = new JSONObject();
                Map<String, Object> map = sf0.h;
                if (map != null) {
                    jSONObject.put("data", JSON.toJSONString(map));
                } else {
                    jSONObject.put("data", JSON.parse(sf0.j));
                }
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            } catch (Throwable th) {
                wVCallBackContext.error();
                th.printStackTrace();
            }
        }
    }

    @JSMethod(uiThread = true)
    public void navToWeex(String str, WVCallBackContext wVCallBackContext) {
        try {
            Field declaredField = WXSDKManager.getInstance().getClass().getDeclaredField("sInstanceId");
            declaredField.setAccessible(true);
            AtomicInteger atomicInteger = (AtomicInteger) declaredField.get(WXSDKManager.getInstance());
            WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(String.valueOf(atomicInteger.get()));
            if (sDKInstance == null) {
                for (int i = atomicInteger.get() - 1; i > 0; i--) {
                    sDKInstance = WXSDKManager.getInstance().getSDKInstance(String.valueOf(i));
                    if (sDKInstance != null) {
                        break;
                    }
                }
            }
            if (sDKInstance != null) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                HashMap hashMap = new HashMap();
                for (String str2 : parseObject.keySet()) {
                    hashMap.put(str2, parseObject.get(str2));
                }
                sDKInstance.B(parseObject.getString("eventName"), hashMap);
                wVCallBackContext.success();
                return;
            }
            wVCallBackContext.error();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1 && i2 == 1) {
            Context context = this.mContext;
            if (context != null) {
                executeActivityResult((Activity) context, intent, false);
            }
        } else if (i == 9876 && i2 == 9876) {
            Context context2 = this.mContext;
            if (context2 != null) {
                storeFinish((Activity) context2, intent, this.currentSelectType);
            }
        } else if (i == 2) {
            Context context3 = this.mContext;
            if (context3 != null) {
                executeActivityResult((Activity) context3, intent, true);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        destoryRecognition();
        super.onDestroy();
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        stopRecognition();
    }

    @JSMethod(uiThread = true)
    public void onUserSwitchRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9fb1a4", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null || (context = this.mContext) == null || !(context instanceof Activity)) {
            cancel((Activity) this.mContext);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Intent intent = new Intent();
                intent.putExtra("data", jSONObject.optString("data"));
                intent.putExtra("type", jSONObject.optString("type"));
                intent.putExtra("bizIdentity", jSONObject.optString("bizIdentity"));
                ((Activity) this.mContext).setResult(-1, intent);
                ((Activity) this.mContext).finish();
            } catch (Throwable unused) {
                cancel((Activity) this.mContext);
            }
        }
    }

    public void openAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a54d18", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("nativeScheme");
            String optString2 = jSONObject.optString("addressUrl");
            String optString3 = jSONObject.optString("data");
            String optString4 = jSONObject.optString("bizId");
            String optString5 = jSONObject.optString(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
            if (TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString4)) {
                optString = "http://my.m.taobao.com/deliver/common_address.htm?bizId=" + optString4;
                if (!TextUtils.isEmpty(optString3)) {
                    optString = optString + "&data=" + optString3;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("data", optString3);
            if (!TextUtils.isEmpty(optString5)) {
                bundle.putString("encodedUrlParams", Uri.encode(optString5));
            }
            bundle.putString(sf0.K_COMMON_ADDRESS_URL, optString2);
            String a2 = kf0.a(this.mContext, optString);
            if (jSONObject.has("requestCode")) {
                Nav.from(this.mContext).withExtras(bundle).forResult(Integer.parseInt(jSONObject.optString("requestCode"))).toUri(a2);
            } else {
                Nav.from(this.mContext).withExtras(bundle).toUri(a2);
            }
            wVCallBackContext.success();
        } catch (Exception e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @JSMethod(uiThread = true)
    public void openH5Page(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99683bb4", new Object[]{this, str, wVCallBackContext});
        } else if (this.mContext != null && !TextUtils.isEmpty(str)) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                String openH5Page = openH5Page((Activity) context, str);
                if (!TextUtils.isEmpty(openH5Page)) {
                    this.currentSelectType = openH5Page;
                }
            }
        }
    }

    @JSMethod(uiThread = true)
    public void userChoosedAddress(String str, WVCallBackContext wVCallBackContext) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8e4780", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null || str == null || (context = this.mContext) == null || !(context instanceof Activity)) {
            Context context2 = this.mContext;
            if (context2 != null && (context2 instanceof Activity)) {
                cancel((Activity) context2);
            }
        } else {
            userChoosedAddress((Activity) context, str);
        }
    }

    private static void showRecognitionDialog(Activity activity, String str, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05d5269", new Object[]{activity, str, ef0Var});
            return;
        }
        speechRecognitionDialog = new hbq(activity);
        RealtimeSpeechView realtimeSpeechView = new RealtimeSpeechView(activity, str);
        speechRecognitionDialog.setContentView(realtimeSpeechView);
        ViewGroup.LayoutParams layoutParams = realtimeSpeechView.getLayoutParams();
        layoutParams.width = activity.getResources().getDisplayMetrics().widthPixels;
        realtimeSpeechView.setLayoutParams(layoutParams);
        realtimeSpeechView.setRealTimeSpeechListener(new d(ef0Var));
        speechRecognitionDialog.getWindow().setGravity(80);
        speechRecognitionDialog.setCanceledOnTouchOutside(true);
        speechRecognitionDialog.setOnCancelListener(new e(realtimeSpeechView, ef0Var));
        speechRecognitionDialog.show();
        mtv.c(RealtimeSpeechView.SPEECH_PAGE, "show", "", null);
    }

    public static void storeFinish(Activity activity, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c87474", new Object[]{activity, intent, str});
        } else if (intent == null) {
            cancel(activity);
        } else {
            String stringExtra = intent.getStringExtra("data");
            if (TextUtils.isEmpty(stringExtra)) {
                cancel(activity);
                return;
            }
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(stringExtra);
            parseObject.put("selectType", (Object) str);
            String jSONString = parseObject.toJSONString();
            Intent intent2 = new Intent();
            intent2.putExtra(gf0.K_SITE_INFO, jSONString);
            intent2.putExtra(gf0.K_ADDRESS_TYPE, 2);
            activity.setResult(-1, intent2);
            activity.finish();
        }
    }

    public static void executeActivityResult(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536cffbd", new Object[]{activity, intent, new Boolean(z)});
        } else if (intent == null) {
            cancel(activity);
        } else {
            String stringExtra = intent.getStringExtra("data");
            if (TextUtils.isEmpty(stringExtra)) {
                cancel(activity);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String optString = jSONObject.optString("deliveryAddressId");
                String optString2 = jSONObject.optString(gf0.K_LINK_ADDRESS_ID);
                Intent intent2 = new Intent();
                intent2.putExtra(gf0.K_DELIVERY_ID, optString);
                if (z) {
                    intent2.putExtra(gf0.K_ADDRESS_TYPE, 3);
                    intent2.putExtra(gf0.K_LINK_ADDRESS_ID, optString2);
                } else {
                    intent2.putExtra(gf0.K_ADDRESS_TYPE, 1);
                }
                if (sf0.g || rf0.j("needFull")) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && !TextUtils.equals("deliveryAddressId", next) && !TextUtils.equals(gf0.K_LINK_ADDRESS_ID, next)) {
                            String optString3 = jSONObject.optString(next);
                            if (!TextUtils.isEmpty(optString3)) {
                                intent2.putExtra(next, optString3);
                            }
                        }
                    }
                }
                activity.setResult(-1, intent2);
                activity.finish();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getParams".equals(str)) {
            getParams(str2, wVCallBackContext);
            return true;
        } else if (OpenAddressImplementor.EVENT_TYPE.equals(str)) {
            openAddress(str2, wVCallBackContext);
            return true;
        } else if ("callbackParams".equals(str)) {
            callbackParams(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_ADDRESS_PARAMS.equals(str)) {
            getAddressParams(str2, wVCallBackContext);
            return true;
        } else if (ACTION_CHOOSE_ADDRESS.equals(str)) {
            userChoosedAddress(str2, wVCallBackContext);
            return true;
        } else if ("openH5Page".equals(str)) {
            openH5Page(str2, wVCallBackContext);
            return true;
        } else if (ACTION_USER_SWITCH_RECOMMEND_ADDRESS.equals(str)) {
            onUserSwitchRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if ("messageToWeex".equals(str)) {
            navToWeex(str2, wVCallBackContext);
            return true;
        } else {
            if ("messageToH5".equals(str)) {
                WVStandardEventCenter.postNotificationToJS(this.mWebView, "addressMessageToH5", str2);
            } else if (BehavorID.OPENPAGE.equals(str)) {
                try {
                    Nav.from(this.mContext).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(kf0.a(this.mContext, new JSONObject(str2).optString("url")));
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    returnErr(wVCallBackContext);
                }
            } else if ("closeWebView".equals(str)) {
                Context context = this.mContext;
                if (context != null && (context instanceof Activity)) {
                    ((Activity) context).finish();
                    return true;
                }
            } else if (ACTION_SPEECH_RECOGNITION.equals(str)) {
                speechRecognition((Activity) this.mContext, str2, new a(this, wVCallBackContext));
                return true;
            } else if (ACTION_SUPPORT_SPEECH_RECOGNITION.equals(str)) {
                wVCallBackContext.success();
                return true;
            }
            returnErr(wVCallBackContext);
            return false;
        }
    }

    public static String openH5Page(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ced1feb7", new Object[]{activity, str});
        }
        String str2 = "";
        if (activity != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                String optString2 = jSONObject.optString("addressType");
                if (TextUtils.isEmpty(optString)) {
                    return str2;
                }
                if (TextUtils.equals(optString2, "1")) {
                    Nav.from(activity).forResult(1).toUri(kf0.a(activity, optString));
                } else if (TextUtils.equals(optString2, "2")) {
                    AddressParams addressParams = sf0.f;
                    if (!(addressParams == null || addressParams.sites == null)) {
                        int optInt = jSONObject.optInt("siteIndex");
                        JSONArray jSONArray = new JSONArray(sf0.f.sites);
                        if (jSONArray.length() > optInt) {
                            str2 = ((JSONObject) jSONArray.get(optInt)).optString("type");
                        }
                    }
                    Nav.from(activity).forResult(9876).toUri(kf0.a(activity, optString));
                } else if (TextUtils.equals(optString2, "3")) {
                    Nav.from(activity).forResult(2).toUri(kf0.a(activity, optString));
                } else {
                    Nav.from(activity).toUri(kf0.a(activity, optString));
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public static void userChoosedAddress(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c481d5", new Object[]{activity, str});
        } else if (activity != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() <= 0) {
                    cancel(activity);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra(gf0.K_DELIVERY_ID, jSONObject.optString(sf0.K_DELIVERY_ID));
                intent.putExtra(gf0.K_ADDRESS_TYPE, Integer.parseInt(jSONObject.optString("addressType")));
                intent.putExtra(gf0.K_SITE_INFO, jSONObject.optString(gf0.K_SITE_INFO));
                intent.putExtra(r4p.KEY_STORE_ID, jSONObject.optString(r4p.KEY_STORE_ID));
                intent.putExtra("shopType", jSONObject.optString("shopType"));
                if (sf0.g || rf0.j("needFull")) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && !TextUtils.equals(sf0.K_DELIVERY_ID, next) && !TextUtils.equals("addressType", next) && !TextUtils.equals(gf0.K_SITE_INFO, next) && !TextUtils.equals(r4p.KEY_STORE_ID, next) && !TextUtils.equals("shopType", next)) {
                            String optString = jSONObject.optString(next);
                            if (!TextUtils.isEmpty(optString)) {
                                intent.putExtra(next, optString);
                            }
                        }
                    }
                }
                activity.setResult(-1, intent);
                activity.finish();
            } catch (Throwable unused) {
                cancel(activity);
            }
        } else {
            cancel(activity);
        }
    }
}
