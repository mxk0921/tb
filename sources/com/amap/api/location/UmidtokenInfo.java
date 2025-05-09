package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.loc.fr;
import com.loc.o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UmidtokenInfo {
    private static AMapLocationClient d;

    /* renamed from: a  reason: collision with root package name */
    static Handler f4591a = new Handler();
    static String b = null;
    private static long e = 30000;
    static boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements AMapLocationListener {
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.d != null) {
                    UmidtokenInfo.f4591a.removeCallbacksAndMessages(null);
                    UmidtokenInfo.d.onDestroy();
                }
            } catch (Throwable th) {
                fr.a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    public static String getUmidtoken() {
        return b;
    }

    public static void setLocAble(boolean z) {
        c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        synchronized (UmidtokenInfo.class) {
            try {
                b = str;
                o.a(str);
                if (d == null && c) {
                    a aVar = new a();
                    d = new AMapLocationClient(context);
                    AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                    aMapLocationClientOption.setOnceLocation(true);
                    aMapLocationClientOption.setNeedAddress(false);
                    d.setLocationOption(aMapLocationClientOption);
                    d.setLocationListener(aVar);
                    d.startLocation();
                    f4591a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (UmidtokenInfo.d != null) {
                                    UmidtokenInfo.d.onDestroy();
                                }
                            } catch (Throwable th) {
                                fr.a(th, "UmidListener", "postDelayed");
                            }
                        }
                    }, 30000L);
                }
            } catch (Throwable th) {
                fr.a(th, "UmidListener", "setUmidtoken");
            }
        }
    }
}
