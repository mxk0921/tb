package com.loc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import org.json.JSONObject;
import tb.pg1;
import tb.r4p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i {
    a c;
    private Context d;
    private WebView f;

    /* renamed from: a  reason: collision with root package name */
    Object f5724a = new Object();
    private AMapLocationClient e = null;
    private String g = "AMap.Geolocation.cbk";
    AMapLocationClientOption b = null;
    private volatile boolean h = false;

    /* compiled from: Taobao */
    /* renamed from: com.loc.i$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5726a;

        public AnonymousClass2(String str) {
            this.f5726a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = i.this.f;
            webView.loadUrl("javascript:" + i.this.g + "('" + this.f5726a + "')");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements AMapLocationListener {
        public a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (i.this.h) {
                i.this.b(i.b(aMapLocation));
            }
        }
    }

    public i(Context context, WebView webView) {
        this.f = null;
        this.c = null;
        this.d = context.getApplicationContext();
        this.f = webView;
        this.c = new a();
    }

    @JavascriptInterface
    public final void getLocation(String str) {
        synchronized (this.f5724a) {
            try {
                if (this.h) {
                    a(str);
                    AMapLocationClient aMapLocationClient = this.e;
                    if (aMapLocationClient != null) {
                        aMapLocationClient.setLocationOption(this.b);
                        this.e.stopLocation();
                        this.e.startLocation();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @JavascriptInterface
    public final void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.h && (aMapLocationClient = this.e) != null) {
            aMapLocationClient.stopLocation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(AMapLocation aMapLocation) {
        String locationDetail;
        JSONObject jSONObject = new JSONObject();
        String str = "errorInfo";
        if (aMapLocation == null) {
            jSONObject.put("errorCode", -1);
            locationDetail = "unknownError";
        } else if (aMapLocation.getErrorCode() == 0) {
            jSONObject.put("errorCode", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", aMapLocation.getLongitude());
            jSONObject2.put("y", aMapLocation.getLatitude());
            jSONObject2.put("precision", aMapLocation.getAccuracy());
            jSONObject2.put("type", aMapLocation.getLocationType());
            jSONObject2.put("country", aMapLocation.getCountry());
            jSONObject2.put("province", aMapLocation.getProvince());
            jSONObject2.put("city", aMapLocation.getCity());
            jSONObject2.put(r4p.KEY_CITY_CODE, aMapLocation.getCityCode());
            jSONObject2.put("district", aMapLocation.getDistrict());
            jSONObject2.put("adCode", aMapLocation.getAdCode());
            jSONObject2.put("street", aMapLocation.getStreet());
            jSONObject2.put("streetNum", aMapLocation.getStreetNum());
            jSONObject2.put(pg1.ATOM_EXT_floor, aMapLocation.getFloor());
            jSONObject2.put(WXAddressModule2.PLUGIN_NAME, aMapLocation.getAddress());
            jSONObject.put("result", jSONObject2);
            return jSONObject.toString();
        } else {
            jSONObject.put("errorCode", aMapLocation.getErrorCode());
            jSONObject.put(str, aMapLocation.getErrorInfo());
            str = "locationDetail";
            locationDetail = aMapLocation.getLocationDetail();
        }
        jSONObject.put(str, locationDetail);
        return jSONObject.toString();
    }

    public final void a() {
        if (this.f != null && this.d != null && !this.h) {
            try {
                this.f.getSettings().setJavaScriptEnabled(true);
                this.f.addJavascriptInterface(this, "AMapAndroidLoc");
                if (!TextUtils.isEmpty(this.f.getUrl())) {
                    this.f.reload();
                }
                if (this.e == null) {
                    AMapLocationClient aMapLocationClient = new AMapLocationClient(this.d);
                    this.e = aMapLocationClient;
                    aMapLocationClient.setLocationListener(this.c);
                }
                this.h = true;
            } catch (Throwable unused) {
            }
        }
    }

    public final void b() {
        synchronized (this.f5724a) {
            try {
                this.h = false;
                AMapLocationClient aMapLocationClient = this.e;
                if (aMapLocationClient != null) {
                    aMapLocationClient.unRegisterLocationListener(this.c);
                    this.e.stopLocation();
                    this.e.onDestroy();
                    this.e = null;
                }
                this.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            WebView webView = this.f;
            if (webView != null) {
                webView.evaluateJavascript("javascript:" + this.g + "('" + str + "')", new ValueCallback<String>() { // from class: com.loc.i.1
                    @Override // android.webkit.ValueCallback
                    public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                    }
                });
            }
        } catch (Throwable th) {
            fr.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:21:0x0054, B:23:0x005b, B:24:0x005f, B:25:0x0063, B:26:0x0068, B:28:0x0071), top: B:34:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:21:0x0054, B:23:0x005b, B:24:0x005f, B:25:0x0063, B:26:0x0068, B:28:0x0071), top: B:34:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:21:0x0054, B:23:0x005b, B:24:0x005f, B:25:0x0063, B:26:0x0068, B:28:0x0071), top: B:34:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r10) {
        /*
            r9 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r9.b
            if (r0 != 0) goto L_0x000b
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r9.b = r0
        L_0x000b:
            r0 = 5
            r1 = 30000(0x7530, double:1.4822E-319)
            r3 = 1
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: all -> 0x0050
            r5.<init>(r10)     // Catch: all -> 0x0050
            java.lang.String r10 = "to"
            long r1 = r5.optLong(r10, r1)     // Catch: all -> 0x0050
            java.lang.String r10 = "useGPS"
            int r10 = r5.optInt(r10, r3)     // Catch: all -> 0x0050
            if (r10 != r3) goto L_0x0027
            r10 = 1
            goto L_0x0028
        L_0x0027:
            r10 = 0
        L_0x0028:
            java.lang.String r6 = "watch"
            int r6 = r5.optInt(r6, r4)     // Catch: all -> 0x004f
            if (r6 != r3) goto L_0x0032
            r4 = 1
        L_0x0032:
            java.lang.String r6 = "interval"
            int r0 = r5.optInt(r6, r0)     // Catch: all -> 0x004b
            java.lang.String r6 = "callback"
            r7 = 0
            java.lang.String r5 = r5.optString(r6, r7)     // Catch: all -> 0x004b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: all -> 0x004b
            if (r6 != 0) goto L_0x0048
        L_0x0045:
            r9.g = r5     // Catch: all -> 0x004b
            goto L_0x0054
        L_0x0048:
            java.lang.String r5 = "AMap.Geolocation.cbk"
            goto L_0x0045
        L_0x004b:
            r8 = r4
            r4 = r10
            r10 = r8
            goto L_0x0051
        L_0x004f:
            r4 = r10
        L_0x0050:
            r10 = 0
        L_0x0051:
            r8 = r4
            r4 = r10
            r10 = r8
        L_0x0054:
            com.amap.api.location.AMapLocationClientOption r5 = r9.b     // Catch: all -> 0x0079
            r5.setHttpTimeOut(r1)     // Catch: all -> 0x0079
            if (r10 == 0) goto L_0x0063
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: all -> 0x0079
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: all -> 0x0079
        L_0x005f:
            r10.setLocationMode(r1)     // Catch: all -> 0x0079
            goto L_0x0068
        L_0x0063:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: all -> 0x0079
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: all -> 0x0079
            goto L_0x005f
        L_0x0068:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: all -> 0x0079
            r1 = r4 ^ 1
            r10.setOnceLocation(r1)     // Catch: all -> 0x0079
            if (r4 == 0) goto L_0x0079
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: all -> 0x0079
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: all -> 0x0079
            r10.setInterval(r0)     // Catch: all -> 0x0079
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.i.a(java.lang.String):void");
    }
}
