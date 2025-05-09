package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.loc.bo;
import com.loc.d;
import com.loc.fr;
import com.loc.fw;
import com.loc.o;
import com.loc.t;
import com.loc.u;
import org.json.JSONObject;
import tb.bmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AMapLocationClient {

    /* renamed from: a  reason: collision with root package name */
    Context f4577a;
    d b;

    public AMapLocationClient(Context context) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.f4577a = context.getApplicationContext();
                this.b = new d(context, null, null);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "AMClt", "ne1");
        }
    }

    private static void a(Context context) throws Exception {
        u a2 = t.a(context, fr.c());
        if (a2.f5760a != t.c.SuccessCode) {
            Log.e("AMapLocationClient", a2.b);
            throw new Exception(a2.b);
        }
    }

    public static String getDeviceId(Context context) {
        return o.q(context);
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f4578a = str;
        } catch (Throwable th) {
            fr.a(th, "AMClt", "sKey");
        }
    }

    public static void setHost(String str) {
        if (TextUtils.isEmpty(str)) {
            bo.f5597a = -1;
            str = "";
        } else {
            bo.f5597a = 1;
        }
        bo.b = str;
    }

    public static void updatePrivacyAgree(Context context, boolean z) {
        t.a(context, z, fr.c());
    }

    public static void updatePrivacyShow(Context context, boolean z, boolean z2) {
        t.a(context, z, z2, fr.c());
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(z);
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "dBackL");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(i, notification);
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "eBackL");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                return dVar.e();
            }
            return null;
        } catch (Throwable th) {
            fr.a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public String getVersion() {
        return "6.2.0";
    }

    public boolean isStarted() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                return dVar.a();
            }
            return false;
        } catch (Throwable th) {
            fr.a(th, "AMClt", "isS");
            return false;
        }
    }

    public void onDestroy() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.d();
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "onDy");
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(webView);
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "sttAssL1");
        }
    }

    public void startLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.b();
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", bmv.MSGTYPE_START_LOG);
        }
    }

    public void stopAssistantLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.f();
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "stAssL");
        }
    }

    public void stopLocation() {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", bmv.MSGTYPE_START_LOG);
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            d dVar = this.b;
            if (dVar != null) {
                dVar.b(aMapLocationListener);
            }
        } catch (Throwable th) {
            fr.a(th, "AMClt", "unRL");
        }
    }

    public AMapLocationClient(Context context, Intent intent) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.f4577a = context.getApplicationContext();
                this.b = new d(this.f4577a, intent, null);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) throws Exception {
        a(context);
        try {
            if (context != null) {
                this.f4577a = context.getApplicationContext();
                this.b = new d(this.f4577a, null, looper);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "AMClt", "ne3");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener != null) {
                d dVar = this.b;
                if (dVar != null) {
                    dVar.a(aMapLocationListener);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("listener参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "AMClt", "sLocL");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption != null) {
                d dVar = this.b;
                if (dVar != null) {
                    dVar.a(aMapLocationClientOption);
                }
                if (aMapLocationClientOption.b) {
                    aMapLocationClientOption.b = false;
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(aMapLocationClientOption.c)) {
                        jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.c);
                    }
                    fw.a(this.f4577a, "O019", jSONObject);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("LocationManagerOption参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "AMClt", "sLocnO");
        }
    }
}
