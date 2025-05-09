package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.H5PopActivity;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.nav.Nav;
import com.taobao.location.client.TBLocationClient;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.utils.TBWXConfigManger;
import java.util.HashMap;
import org.json.JSONObject;
import tb.ef0;
import tb.gf0;
import tb.hzl;
import tb.kf0;
import tb.kpw;
import tb.mf0;
import tb.mtv;
import tb.nsw;
import tb.oyl;
import tb.p78;
import tb.rf0;
import tb.sf0;
import tb.u58;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddressKinshipBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ASYNC_GET_RECOMMEND_ADDRESS = "asyncGetRecommendAddress";
    public static final String ACTION_CHECK_LOCATION_PERMISSION = "checkLocationPermission";
    public static final String ACTION_CHOOSE_ADDRESS = "chooseAddress";
    public static final String ACTION_EDIT_ADDRESS = "callAddressPage";
    public static final String ACTION_EDIT_MAP = "callMapPage";
    public static final String ACTION_GET_ALL_RECOMMEND_ADDRESS = "getAllRecommendAddressData";
    public static final String ACTION_GET_RECOMMEND_ADDRESS = "getRecommendAddress";
    public static final String ACTION_PICK_ADDRESS = "callListPage";
    public static final String ACTION_PICK_ADDRESS_V2 = "callListPageV2";
    public static final String ACTION_REQUEST_LOCATION_PERMISSION = "requestLocationPermission";
    public static final String ACTION_SWITCH_RECOMMEND_ADDRESS = "changeRecommendAddress";
    public static final String ACTION_SYNC_RECOMMEND_ADDRESS = "syncRecommendAddress";
    public static final String ACTION_UPDATE_RECOMMEND_ADDRESS = "updateRecommendAddress";
    public static final String ACTION_UPDATE_RECOMMEND_ADDRESS_STATUS = "updateRecommendAddressStatus";
    public static final String PLUGIN_NAME = "aluAddress";
    public static final String TAG = "aluAddress";
    private final int REQUEST_LOCATION_PERMISSION = 1024;
    public WVCallBackContext mCallback;
    private long mExecuteMs;
    private InnerReceiver mInnerReceiver;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class InnerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_AUS_UPLOAD_RESULT = "aus_upload_result";
        public static final String KEY_AUS_OSSBUCKETNAME = "ossBucketName";
        public static final String KEY_AUS_OSSENDPOINT = "ossEndpoint";
        public static final String KEY_AUS_OSSOBJECTKEY = "ossObjectKey";

        /* renamed from: a  reason: collision with root package name */
        public WVCallBackContext f6306a;

        public InnerReceiver(WVCallBackContext wVCallBackContext) {
            this.f6306a = wVCallBackContext;
        }

        public static /* synthetic */ Object ipc$super(InnerReceiver innerReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/address/wrapper/weex/AddressKinshipBridge$InnerReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (this.f6306a != null) {
                    nsw nswVar = new nsw();
                    if (TextUtils.equals(intent.getAction(), ACTION_AUS_UPLOAD_RESULT)) {
                        String stringExtra = intent.getStringExtra("ossBucketName");
                        String stringExtra2 = intent.getStringExtra(KEY_AUS_OSSENDPOINT);
                        String stringExtra3 = intent.getStringExtra("ossObjectKey");
                        AdapterForTLog.loge("aluAddress", "recv ossBucketName:" + stringExtra + " ossEndpoint:" + stringExtra2 + " ossObjectKey:" + stringExtra3);
                        nswVar.b("ossBucketName", stringExtra);
                        nswVar.b(KEY_AUS_OSSENDPOINT, stringExtra2);
                        nswVar.b("ossObjectKey", stringExtra3);
                        if (TextUtils.isEmpty(stringExtra3)) {
                            this.f6306a.error(nswVar);
                        } else {
                            this.f6306a.success(nswVar);
                        }
                        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                        this.f6306a = null;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f6307a;

        public a(AddressKinshipBridge addressKinshipBridge, WVCallBackContext wVCallBackContext) {
            this.f6307a = wVCallBackContext;
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else if (this.f6307a != null) {
                nsw nswVar = new nsw();
                nswVar.a("code", Integer.valueOf(i));
                nswVar.b("message", str);
                this.f6307a.error(nswVar);
            }
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                AddressKinshipBridge.callSuccess(this.f6307a, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f6308a;

        public b(AddressKinshipBridge addressKinshipBridge, WVCallBackContext wVCallBackContext) {
            this.f6308a = wVCallBackContext;
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else if (this.f6308a != null) {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                nswVar.a("code", Integer.valueOf(i));
                nswVar.b("message", str);
                this.f6308a.error(nswVar);
            }
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                AddressKinshipBridge.callSuccess(this.f6308a, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f6309a;

        public c(WVCallBackContext wVCallBackContext) {
            this.f6309a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AddressKinshipBridge.access$000(AddressKinshipBridge.this, this.f6309a, oyl.PERMISSION_DENY);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f6310a;

        public d(WVCallBackContext wVCallBackContext) {
            this.f6310a = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AddressKinshipBridge.access$000(AddressKinshipBridge.this, this.f6310a, "grant");
            }
        }
    }

    public static /* synthetic */ void access$000(AddressKinshipBridge addressKinshipBridge, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c90848", new Object[]{addressKinshipBridge, wVCallBackContext, str});
        } else {
            addressKinshipBridge.requestLocationResultCallback(wVCallBackContext, str);
        }
    }

    private void asyncGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bc0d85", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            mf0.a(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), "frontInvoke", TextUtils.equals(jSONObject.optString("forceRefresh"), "true"), jSONObject.optString("bizName"), new a(this, wVCallBackContext));
        } catch (Exception unused) {
            if (wVCallBackContext != null) {
                callError(wVCallBackContext, "HY_FAILED");
            }
        }
    }

    public static void callError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d934d8", new Object[]{wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.j(str);
            wVCallBackContext.error(nswVar);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        mtv.c("ChooseAddressResult", "", "", hashMap);
    }

    public static void callSuccess(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fee493", new Object[]{wVCallBackContext, str});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.b("data", str);
            wVCallBackContext.success(nswVar);
        }
    }

    private void checkLocationPermission(WVCallBackContext wVCallBackContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97fc4d0", new Object[]{this, wVCallBackContext});
            return;
        }
        if (TBLocationClient.f()) {
            str = "true";
        } else {
            str = "false";
        }
        requestLocationResultCallback(wVCallBackContext, str);
    }

    private void getAllGlobalRecommendAddressData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9f9dbe", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            callSuccess(wVCallBackContext, mf0.d(this.mContext, new JSONObject(str).optString("bizIdentity")));
        } catch (Exception unused) {
            if (wVCallBackContext != null) {
                callError(wVCallBackContext, "HY_FAILED");
            }
        }
    }

    private void getGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a2e25f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            RecommendedAddress f = mf0.f(this.mContext, new JSONObject(str).optString("bizIdentity"));
            if (f == null) {
                str2 = "";
            } else {
                str2 = JSON.toJSONString(f);
            }
            callSuccess(wVCallBackContext, str2);
        } catch (Exception unused) {
            if (wVCallBackContext != null) {
                callError(wVCallBackContext, "HY_FAILED");
            }
        }
    }

    private void handleAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfecfa", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            openPickPage(this.mContext, str);
        } catch (Exception unused) {
            WVCallBackContext wVCallBackContext2 = this.mCallback;
            if (wVCallBackContext2 != null) {
                callError(wVCallBackContext2, "HY_PARAM_ERR");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AddressKinshipBridge addressKinshipBridge, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/wrapper/weex/AddressKinshipBridge");
        }
    }

    private void requestGPSPermission(WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aa1486", new Object[]{this, wVCallBackContext, new Boolean(z)});
            return;
        }
        LocationManager locationManager = (LocationManager) this.mContext.getSystemService("location");
        if (locationManager != null && locationManager.isProviderEnabled("gps")) {
            requestLocationPermission(wVCallBackContext);
        } else if (z) {
            this.mCallback = wVCallBackContext;
            Intent intent = new Intent();
            intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
            ((Activity) this.mContext).startActivityForResult(intent, 1024);
        } else {
            requestLocationResultCallback(wVCallBackContext, oyl.PERMISSION_DENY);
        }
    }

    private void requestLocationPermission(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6f1d97", new Object[]{this, wVCallBackContext});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (ContextCompat.checkSelfPermission(this.mContext, p78.ACCESS_FINE_LOCATION) != 0) {
                try {
                    if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) this.mContext, p78.ACCESS_FINE_LOCATION)) {
                        hzl.b(this.mContext, new String[]{p78.ACCESS_FINE_LOCATION}).i(new d(wVCallBackContext)).h(new c(wVCallBackContext)).d();
                        return;
                    }
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.mContext.getPackageName()));
                        intent.addCategory("android.intent.category.DEFAULT");
                        ((Activity) this.mContext).startActivityForResult(intent, 999);
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (wVCallBackContext != null) {
                        wVCallBackContext.error(th.getMessage());
                    }
                }
            } else {
                requestLocationResultCallback(wVCallBackContext, "grant");
            }
        }
    }

    private void requestLocationResultCallback(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d160b94", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext != null) {
            nsw nswVar = new nsw();
            nswVar.j("HY_SUCCESS");
            nswVar.b("result", str);
            wVCallBackContext.success(nswVar);
        }
    }

    private void switchGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d68223d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            mf0.k(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), jSONObject.optString(z9u.KEY_TAOKE_BIZSCENE), new b(this, wVCallBackContext));
        } catch (Exception unused) {
            if (wVCallBackContext != null) {
                callError(wVCallBackContext, "HY_FAILED");
            }
        }
    }

    private void syncGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767471a4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            mf0.l(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), "frontInvoke");
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } catch (Exception unused) {
            if (wVCallBackContext != null) {
                callError(wVCallBackContext, "HY_FAILED");
            }
        }
    }

    public void enableHookNativeBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e897a1c8", new Object[]{this, wVCallBackContext});
            return;
        }
        if (this.mContext instanceof H5PopActivity) {
            H5PopActivity.f = true;
        }
        wVCallBackContext.success();
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mInnerReceiver != null) {
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mInnerReceiver);
            this.mInnerReceiver = null;
        }
    }

    @JSMethod(uiThread = true)
    public void takePhoto(Activity activity, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362b9fcb", new Object[]{this, activity, str, wVCallBackContext});
            return;
        }
        try {
            if (this.mInnerReceiver != null) {
                LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mInnerReceiver);
                this.mInnerReceiver = null;
            }
            this.mInnerReceiver = new InnerReceiver(wVCallBackContext);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(InnerReceiver.ACTION_AUS_UPLOAD_RESULT);
            LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mInnerReceiver, intentFilter);
            boolean d2 = u58.d(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
            mtv.c("takePhoto", WXAddressModule2.PLUGIN_NAME, "install:" + d2, null);
            Nav.from(this.mContext).toUri(kf0.a(this.mContext, "https://my.m.taobao.com/deliver/ocr_address.htm"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JSMethod(uiThread = true)
    public void updateRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93a188f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            mf0.n(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("type"), TextUtils.equals(jSONObject.optString("writeClient"), "true"), jSONObject.optString("data"));
            if (wVCallBackContext != null) {
                nsw nswVar = new nsw();
                nswVar.j("HY_SUCCESS");
                wVCallBackContext.success(nswVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext != null) {
                wVCallBackContext.error();
            }
        }
    }

    @JSMethod(uiThread = true)
    public void updateRecommendAddressStatus(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75202161", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            mf0.o(this.mContext, jSONObject.optString("addressId"), jSONObject.optString("bizName"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Context context = this.mContext;
        if (context != null && (context instanceof Activity)) {
            u58.h((Activity) context, i, i2, intent, false);
        }
        if (i == 2001) {
            mf0.i(i, i2, intent);
        } else if (i == 1024) {
            requestGPSPermission(this.mCallback, false);
        } else {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra(gf0.K_DELIVERY_ID);
                if (i == 700) {
                    WVCallBackContext wVCallBackContext = this.mCallback;
                    if (wVCallBackContext == null || stringExtra == null) {
                        callError(wVCallBackContext, "HY_PARAM_ERR");
                    } else {
                        nsw nswVar = new nsw();
                        nswVar.j("HY_SUCCESS");
                        nswVar.b("addressId", stringExtra);
                        this.mCallback.success(nswVar);
                    }
                } else {
                    WVCallBackContext wVCallBackContext2 = this.mCallback;
                    if (wVCallBackContext2 == null || stringExtra == null) {
                        callError(wVCallBackContext2, "HY_FAILED");
                    } else {
                        nsw nswVar2 = new nsw();
                        nswVar2.j("HY_SUCCESS");
                        nswVar2.b("requestCode", i + "");
                        nswVar2.b("resultCode", i2 + "");
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            for (String str : extras.keySet()) {
                                String valueOf = String.valueOf(extras.get(str));
                                if (!TextUtils.isEmpty(valueOf)) {
                                    nswVar2.b(str, valueOf);
                                    if (TextUtils.equals(str, gf0.K_DELIVERY_ID)) {
                                        nswVar2.b(sf0.K_DELIVERY_ID, valueOf);
                                    }
                                }
                            }
                        }
                        this.mCallback.success(nswVar2);
                    }
                }
            } else if (i2 != 0 || i == 700 || this.mCallback == null) {
                WVCallBackContext wVCallBackContext3 = this.mCallback;
                if (wVCallBackContext3 != null) {
                    callError(wVCallBackContext3, "HY_FAILED");
                }
            } else {
                nsw nswVar3 = new nsw();
                nswVar3.b("code", "0");
                nswVar3.j("HY_FAILED");
                this.mCallback.error(nswVar3);
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    private void isSupportNativeMap(WVCallBackContext wVCallBackContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d78e44", new Object[]{this, wVCallBackContext});
            return;
        }
        boolean w = rf0.w();
        boolean a2 = u58.a(this.mContext);
        boolean j = rf0.j("isSupportAMap");
        nsw nswVar = new nsw();
        nswVar.a(TBWXConfigManger.WX_SUPPORT_KEY, Boolean.valueOf(a2 && j && !w));
        nswVar.a("addressInstall", Boolean.valueOf(a2));
        nswVar.a("isSupportNativeMap", Boolean.valueOf(j));
        nswVar.a("systemWebView", Boolean.valueOf(w));
        boolean b2 = u58.b(this.mContext);
        boolean j2 = rf0.j("isSupportGMap");
        boolean f = u58.f(this.mContext);
        if (!b2 || !j2 || !f || w) {
            z = false;
        }
        nswVar.a("supportGoogleMap", Boolean.valueOf(z));
        nswVar.a("addressOverseaInstall", Boolean.valueOf(b2));
        nswVar.a("isSupportNativeGoogleMap", Boolean.valueOf(j2));
        nswVar.a("isGooglePlayServicesAvailable", Boolean.valueOf(f));
        mtv.c("isSupportNativeMap", nswVar.m(), String.valueOf(System.currentTimeMillis() - this.mExecuteMs), null);
        AdapterForTLog.loge("aluAddress", "isSupportNativeMap data:" + nswVar.m());
        wVCallBackContext.success(nswVar);
    }

    public static void openPickPage(Context context, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c28beb1", new Object[]{context, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        Bundle bundle = new Bundle();
        bundle.putString(gf0.K_SELECTED_ADDRESS_ID, jSONObject.getString("addressId"));
        bundle.putString("agencyReceiveDesc", "0");
        bundle.putBoolean(gf0.K_ENABLE_AGENCY, false);
        bundle.putBoolean("enableKinShip", true);
        bundle.putString("kinShipUserId", jSONObject.getString("relationId"));
        bundle.putInt(gf0.K_SUPPORT_ABROAD_STATION, 0);
        bundle.putInt(gf0.K_ENABLE_ABROAD_STATION, 0);
        bundle.putString("source", "");
        IpChange ipChange2 = sf0.$ipChange;
        bundle.putString(gf0.K_SITES, "");
        Nav.from(context).withExtras(bundle).forResult(700).toUri(kf0.a(context, "https://my.m.taobao.com/deliver/select_address_list.htm"));
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mExecuteMs = System.currentTimeMillis();
        AdapterForTLog.loge("aluAddress", "aluAddress action:" + str + " params:" + str2);
        StringBuilder sb = new StringBuilder("");
        sb.append(this.mExecuteMs);
        mtv.c(str, sb.toString(), "", null);
        if (ACTION_CHOOSE_ADDRESS.equals(str)) {
            handleAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_PICK_ADDRESS.equals(str)) {
            openAddress("pickAddress", str2, wVCallBackContext);
            return true;
        } else if (ACTION_PICK_ADDRESS_V2.equals(str)) {
            openAddress("pickAddressV2", str2, wVCallBackContext);
            return true;
        } else if (ACTION_EDIT_ADDRESS.equals(str)) {
            openAddress("editAddress", str2, wVCallBackContext);
            return true;
        } else if (ACTION_EDIT_MAP.equals(str)) {
            openAddress("openAddressMap", str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_RECOMMEND_ADDRESS.equals(str)) {
            getGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_ALL_RECOMMEND_ADDRESS.equals(str)) {
            getAllGlobalRecommendAddressData(str2, wVCallBackContext);
            return true;
        } else if (ACTION_SYNC_RECOMMEND_ADDRESS.equals(str)) {
            syncGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_ASYNC_GET_RECOMMEND_ADDRESS.equals(str)) {
            asyncGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_SWITCH_RECOMMEND_ADDRESS.equals(str)) {
            switchGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else {
            if (ACTION_CHECK_LOCATION_PERMISSION.equals(str)) {
                Context context = this.mContext;
                if (context != null && (context instanceof Activity)) {
                    checkLocationPermission(wVCallBackContext);
                    return true;
                }
            } else if (ACTION_REQUEST_LOCATION_PERMISSION.equals(str)) {
                Context context2 = this.mContext;
                if (context2 != null && (context2 instanceof Activity)) {
                    requestGPSPermission(wVCallBackContext, true);
                    return true;
                }
            } else if (ACTION_UPDATE_RECOMMEND_ADDRESS.equals(str)) {
                Context context3 = this.mContext;
                if (context3 != null && (context3 instanceof Activity)) {
                    updateRecommendAddress(str2, wVCallBackContext);
                    return true;
                }
            } else if (ACTION_UPDATE_RECOMMEND_ADDRESS_STATUS.equals(str)) {
                Context context4 = this.mContext;
                if (context4 != null && (context4 instanceof Activity)) {
                    updateRecommendAddressStatus(str2, wVCallBackContext);
                    return true;
                }
            } else if ("getCache".equals(str)) {
                Context context5 = this.mContext;
                if (context5 != null && (context5 instanceof Activity)) {
                    SharedPreferences sharedPreferences = context5.getSharedPreferences("homepage_common", 0);
                    nsw nswVar = new nsw();
                    nswVar.b("cacheValue", sharedPreferences.getString("tb_homepage_clientCache_lbs", ""));
                    wVCallBackContext.success(nswVar);
                    return true;
                }
            } else if ("takePhoto".equals(str)) {
                Context context6 = this.mContext;
                if (context6 != null && (context6 instanceof Activity)) {
                    takePhoto((Activity) context6, str2, wVCallBackContext);
                    return true;
                }
            } else if ("isSupportNativeMap".equals(str)) {
                isSupportNativeMap(wVCallBackContext);
                return true;
            } else if ("enableHookNativeBack".equals(str)) {
                enableHookNativeBack(wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openAddress(java.lang.String r18, java.lang.String r19, android.taobao.windvane.jsbridge.WVCallBackContext r20) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.openAddress(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }
}
