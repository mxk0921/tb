package com.amap.api.fence;

import android.app.PendingIntent;
import android.content.Context;
import com.amap.api.location.DPoint;
import com.loc.a;
import com.loc.fr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GeoFenceClient {
    public static final int GEOFENCE_IN = 1;
    public static final int GEOFENCE_OUT = 2;
    public static final int GEOFENCE_STAYED = 4;

    /* renamed from: a  reason: collision with root package name */
    Context f4574a;
    a b;

    public GeoFenceClient(Context context) {
        this.f4574a = null;
        this.b = null;
        try {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f4574a = applicationContext;
                this.b = a(applicationContext);
                return;
            }
            throw new IllegalArgumentException("Context参数不能为null");
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "<init>");
        }
    }

    private static a a(Context context) {
        return new a(context);
    }

    public void addGeoFence(DPoint dPoint, float f, String str) {
        try {
            this.b.a(dPoint, f, str);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "addGeoFence round");
        }
    }

    public PendingIntent createPendingIntent(String str) {
        try {
            return this.b.a(str);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "creatPendingIntent");
            return null;
        }
    }

    public List<GeoFence> getAllGeoFence() {
        ArrayList arrayList = new ArrayList();
        try {
            return this.b.b();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "getGeoFenceList");
            return arrayList;
        }
    }

    public boolean isPause() {
        try {
            return this.b.i();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "isPause");
            return true;
        }
    }

    public void pauseGeoFence() {
        try {
            this.b.f();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "pauseGeoFence");
        }
    }

    public void removeGeoFence() {
        try {
            this.b.a();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "removeGeoFence");
        }
    }

    public void resumeGeoFence() {
        try {
            this.b.h();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "resumeGeoFence");
        }
    }

    public void setActivateAction(int i) {
        try {
            this.b.a(i);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "setActivatesAction");
        }
    }

    public void setGeoFenceAble(String str, boolean z) {
        try {
            this.b.a(str, z);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "setGeoFenceAble");
        }
    }

    public void setGeoFenceListener(GeoFenceListener geoFenceListener) {
        try {
            this.b.a(geoFenceListener);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "setGeoFenceListener");
        }
    }

    public void addGeoFence(String str, String str2) {
        try {
            this.b.a(str, str2);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "addGeoFence district");
        }
    }

    public boolean removeGeoFence(GeoFence geoFence) {
        try {
            return this.b.a(geoFence);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "removeGeoFence1");
            return false;
        }
    }

    public void addGeoFence(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            this.b.a(str, str2, dPoint, f, i, str3);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(String str, String str2, String str3, int i, String str4) {
        try {
            this.b.a(str, str2, str3, i, str4);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "addGeoFence searche");
        }
    }

    public void addGeoFence(List<DPoint> list, String str) {
        try {
            this.b.a(list, str);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceClient", "addGeoFence polygon");
        }
    }
}
