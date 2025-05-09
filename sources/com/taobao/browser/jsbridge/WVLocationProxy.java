package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVLocation;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.location.common.TBLocationDTO;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hzl;
import tb.nsw;
import tb.p78;
import tb.r4p;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVLocationProxy extends WVLocation {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_CODE = 0;
    private static final String TAG = "WVLocationProxy";
    private WVCallBackContext prevCallback;
    private ArrayList<WVCallBackContext> mCallbacks = new ArrayList<>();
    private String mParams = "";
    private boolean mGetLocationAfterResult = false;

    static {
        t2o.a(619708526);
    }

    public static /* synthetic */ String access$000(WVLocationProxy wVLocationProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba7588d", new Object[]{wVLocationProxy});
        }
        return wVLocationProxy.mParams;
    }

    public static /* synthetic */ void access$100(WVLocationProxy wVLocationProxy, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6683a2", new Object[]{wVLocationProxy, tBLocationDTO});
        } else {
            wVLocationProxy.dealLocationData(tBLocationDTO);
        }
    }

    private void dealLocationData(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428cff62", new Object[]{this, tBLocationDTO});
            return;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList == null || arrayList.isEmpty()) {
            v7t.i(TAG, "GetLocation wrapResult callbackContext is null");
        } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess()) {
            Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                WVCallBackContext next = it.next();
                nsw nswVar = new nsw();
                if (tBLocationDTO == null) {
                    nswVar.b("msg", "location = null");
                    v7t.d(TAG, "location = null");
                } else {
                    nswVar.b("msg", "fail to location, errCode=[" + tBLocationDTO.getErrorCode() + "]");
                    v7t.d(TAG, "fail to location");
                }
                next.error(nswVar);
            }
            this.mCallbacks.clear();
        } else {
            double doubleValue = Double.valueOf(tBLocationDTO.getLongitude()).doubleValue();
            double doubleValue2 = Double.valueOf(tBLocationDTO.getLatitude()).doubleValue();
            if (doubleValue <= -1.0E-6d || doubleValue >= 1.0E-6d || doubleValue2 <= -1.0E-6d || doubleValue2 >= 1.0E-6d) {
                nsw nswVar2 = new nsw();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("longitude", doubleValue);
                    jSONObject.put("latitude", doubleValue2);
                    jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, tBLocationDTO.getAccuracy());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                nswVar2.k();
                nswVar2.d("coords", jSONObject);
                if (v7t.h()) {
                    v7t.a(TAG, " getLocation success. longitude: " + doubleValue + " latitude: " + doubleValue2);
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("city", tBLocationDTO.getCityName());
                    jSONObject2.put(r4p.KEY_CITY_CODE, tBLocationDTO.getCityCode());
                    jSONObject2.put(r4p.KEY_COUNTRY_CODE, tBLocationDTO.getAreaCode());
                    jSONObject2.put("area", tBLocationDTO.getAreaName());
                    jSONObject2.put("addressLine", tBLocationDTO.getAddress());
                    if (v7t.h()) {
                        v7t.a(TAG, " getAddress success. " + tBLocationDTO.getAddress());
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                nswVar2.d(WXAddressModule2.PLUGIN_NAME, jSONObject2);
                Iterator<WVCallBackContext> it2 = this.mCallbacks.iterator();
                while (it2.hasNext()) {
                    it2.next().success(nswVar2);
                }
                this.mCallbacks.clear();
                return;
            }
            v7t.d(TAG, "getLocation: longitude and latitude is zero.");
            Iterator<WVCallBackContext> it3 = this.mCallbacks.iterator();
            while (it3.hasNext()) {
                nsw nswVar3 = new nsw();
                nswVar3.b("msg", "longitude=[" + doubleValue + "]; latitude=[" + doubleValue2 + "]");
                it3.next().error(nswVar3);
            }
            this.mCallbacks.clear();
        }
    }

    public static /* synthetic */ Object ipc$super(WVLocationProxy wVLocationProxy, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVLocationProxy");
    }

    @Override // android.taobao.windvane.jsbridge.api.WVLocation, tb.kpw
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mParams = str2;
        this.prevCallback = wVCallBackContext;
        if (!"getLocation".equals(str)) {
            return false;
        }
        try {
            if (vpw.commonConfig.x0) {
                this.mGetLocationAfterResult = new JSONObject(str2).optBoolean("getLocationAfterResult", false);
                if (ContextCompat.checkSelfPermission(this.mContext, p78.ACCESS_FINE_LOCATION) == 0) {
                    getLocation(wVCallBackContext, this.mParams);
                } else {
                    Context context = this.mContext;
                    if (context instanceof Activity) {
                        ActivityCompat.requestPermissions((Activity) context, new String[]{p78.ACCESS_FINE_LOCATION}, 0);
                    }
                    if (!this.mGetLocationAfterResult) {
                        getLocation(wVCallBackContext, this.mParams);
                    }
                }
            } else {
                hzl.b(this.mContext, new String[]{p78.ACCESS_FINE_LOCATION}).i(new Runnable() { // from class: com.taobao.browser.jsbridge.WVLocationProxy.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        WVLocationProxy wVLocationProxy = WVLocationProxy.this;
                        wVLocationProxy.getLocation(wVCallBackContext, WVLocationProxy.access$000(wVLocationProxy));
                    }
                }).h(new Runnable() { // from class: com.taobao.browser.jsbridge.WVLocationProxy.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        nsw nswVar = new nsw();
                        nswVar.b("msg", "no permission");
                        wVCallBackContext.error(nswVar);
                    }
                }).d();
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.api.WVLocation, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.kpw
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (this.mGetLocationAfterResult && i == 0 && strArr != null && iArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.equals(strArr[i2], p78.ACCESS_FINE_LOCATION)) {
                    if (iArr[i2] == 0) {
                        getLocation(this.prevCallback, this.mParams);
                    } else {
                        nsw nswVar = new nsw("HY_NO_PERMISSION");
                        WVCallBackContext wVCallBackContext = this.prevCallback;
                        if (wVCallBackContext != null) {
                            wVCallBackContext.error(nswVar);
                        }
                        Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
                        while (it.hasNext()) {
                            it.next().error(nswVar);
                        }
                        this.mCallbacks.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r8.equals("ONE_HOUR") == false) goto L_0x0049;
     */
    @Override // android.taobao.windvane.jsbridge.api.WVLocation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getLocation(android.taobao.windvane.jsbridge.WVCallBackContext r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.jsbridge.WVLocationProxy.getLocation(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }
}
