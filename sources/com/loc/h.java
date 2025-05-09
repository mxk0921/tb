package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.utils.UserLocation;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import tb.vu3;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h {
    static AMapLocation j;
    static long k;
    static Object l = new Object();
    static long q;
    static boolean t;
    static boolean u;
    public static volatile AMapLocation y;
    private GnssStatus.Callback F;

    /* renamed from: a  reason: collision with root package name */
    Handler f5720a;
    LocationManager b;
    AMapLocationClientOption c;
    ev f;
    private Context z;
    private long A = 0;
    long d = 0;
    boolean e = false;
    private int B = 0;
    int g = 240;
    int h = 80;
    AMapLocation i = null;
    long m = 0;
    float n = 0.0f;
    Object o = new Object();
    Object p = new Object();
    private int C = 0;
    private GpsStatus D = null;
    private GpsStatus.Listener E = null;
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    long v = 0;
    int w = 0;
    LocationListener x = null;
    private String G = null;
    private boolean H = false;
    private int I = 0;
    private boolean J = false;

    public h(Context context, Handler handler) {
        this.f = null;
        this.z = context;
        this.f5720a = handler;
        try {
            this.b = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            fr.a(th, "GpsLocation", "<init>");
        }
        this.f = new ev();
    }

    private void f(AMapLocation aMapLocation) {
        try {
            int i = this.C;
            if (i >= 4) {
                aMapLocation.setGpsAccuracyStatus(1);
            } else if (i == 0) {
                aMapLocation.setGpsAccuracyStatus(-1);
            } else {
                aMapLocation.setGpsAccuracyStatus(0);
            }
        } catch (Throwable unused) {
        }
    }

    private AMapLocation g(AMapLocation aMapLocation) {
        if (!fy.a(aMapLocation) || this.B < 3) {
            return aMapLocation;
        }
        if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
            aMapLocation.setAccuracy(0.0f);
        }
        if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
            aMapLocation.setSpeed(0.0f);
        }
        return this.f.a(aMapLocation);
    }

    private void i() {
        if (this.b != null) {
            try {
                n();
                this.s = true;
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = this.z.getMainLooper();
                }
                this.A = fy.b();
                if (a(this.b)) {
                    if (fy.a() - q >= 259200000) {
                        if (fy.c(this.z, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.b.sendExtraCommand("gps", "force_xtra_injection", null);
                            q = fy.a();
                            SharedPreferences.Editor a2 = fx.a(this.z, "pref");
                            fx.a(a2, "lagt", q);
                            fx.a(a2);
                        } else {
                            fr.a(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                        }
                    }
                    if (this.x == null) {
                        this.x = new a(this);
                    }
                    if (!this.c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) || this.c.getDeviceModeDistanceFilter() <= 0.0f) {
                        this.b.requestLocationUpdates("gps", 900L, 0.0f, this.x, myLooper);
                    } else {
                        this.b.requestLocationUpdates("gps", this.c.getInterval(), this.c.getDeviceModeDistanceFilter(), this.x, myLooper);
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        GnssStatus.Callback callback = new GnssStatus.Callback() { // from class: com.loc.h.1
                            @Override // android.location.GnssStatus.Callback
                            public final void onFirstFix(int i) {
                                h.l();
                            }

                            @Override // android.location.GnssStatus.Callback
                            public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
                                h.this.a(gnssStatus);
                            }

                            @Override // android.location.GnssStatus.Callback
                            public final void onStarted() {
                                h.j();
                            }

                            @Override // android.location.GnssStatus.Callback
                            public final void onStopped() {
                                h.this.k();
                            }
                        };
                        this.F = callback;
                        this.b.registerGnssStatusCallback(callback);
                    } else {
                        GpsStatus.Listener listener = new GpsStatus.Listener() { // from class: com.loc.h.2
                            @Override // android.location.GpsStatus.Listener
                            public final void onGpsStatusChanged(int i) {
                                try {
                                    h hVar = h.this;
                                    LocationManager locationManager = hVar.b;
                                    if (locationManager != null) {
                                        hVar.D = locationManager.getGpsStatus(hVar.D);
                                        if (i == 1) {
                                            h.j();
                                        } else if (i == 2) {
                                            h.this.k();
                                        } else if (i == 3) {
                                            h.l();
                                        } else if (i == 4) {
                                            h.this.m();
                                        }
                                    }
                                } catch (Throwable th) {
                                    new StringBuilder("GpsLocation | onGpsStatusChanged error: ").append(th.getMessage());
                                    fr.a(th, "GpsLocation", "onGpsStatusChanged");
                                }
                            }
                        };
                        this.E = listener;
                        this.b.addGpsStatusListener(listener);
                    }
                    a(8, 14, "no enough satellites#1401", this.c.getHttpTimeOut());
                    return;
                }
                a(8, 14, "no gps provider#1402", 0L);
            } catch (SecurityException e) {
                this.s = false;
                fw.a((String) null, 2121);
                a(2, 12, e.getMessage() + "#1201", 0L);
            } catch (Throwable th) {
                th.getMessage();
                fr.a(th, "GpsLocation", "requestLocationUpdates part2");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.C = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Iterable<GpsSatellite> satellites;
        int i = 0;
        try {
            GpsStatus gpsStatus = this.D;
            if (!(gpsStatus == null || (satellites = gpsStatus.getSatellites()) == null)) {
                Iterator<GpsSatellite> it = satellites.iterator();
                int maxSatellites = this.D.getMaxSatellites();
                while (it.hasNext() && i < maxSatellites) {
                    if (it.next().usedInFix()) {
                        i++;
                    }
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GpsLocation", "GPS_EVENT_SATELLITE_STATUS");
        }
        this.C = i;
    }

    private void n() {
        if (fy.b() - k <= 5000 && fy.a(j)) {
            if (this.c.isMockEnable() || !j.isMock()) {
                this.d = fy.b();
                c(j);
            }
        }
    }

    private static boolean o() {
        try {
            return ((Boolean) fu.a(x.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), x.c("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void c() {
        this.w = 0;
    }

    public final int d() {
        LocationManager locationManager = this.b;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.z.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.s ? 4 : 0;
    }

    public final int e() {
        return this.C;
    }

    private void b(AMapLocation aMapLocation) {
        Handler handler;
        if (fy.a(aMapLocation) && this.f5720a != null) {
            long b = fy.b();
            if (this.c.getInterval() <= 8000 || b - this.v > this.c.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble(DispatchConstants.LATITUDE, aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = 5;
                synchronized (this.o) {
                    try {
                        if (y == null) {
                            handler = this.f5720a;
                        } else if (fy.a(aMapLocation, y) > this.h) {
                            handler = this.f5720a;
                        }
                        handler.sendMessage(obtain);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() == 15 && !AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.c.getLocationMode())) {
            return;
        }
        if (this.c.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.c.getDeviceModeDistanceFilter() > 0.0f) {
            d(aMapLocation);
        } else if (fy.b() - this.v >= this.c.getInterval() - 200) {
            this.v = fy.b();
            d(aMapLocation);
        }
    }

    private void d(AMapLocation aMapLocation) {
        if (this.f5720a != null) {
            Message obtain = Message.obtain();
            obtain.obj = aMapLocation;
            obtain.what = 2;
            this.f5720a.sendMessage(obtain);
        }
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (!fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.c.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint a2 = ft.a(this.z, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(a2.getLatitude());
            aMapLocation.setLongitude(a2.getLongitude());
            aMapLocation.setOffset(this.c.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
        }
    }

    private static void h(AMapLocation aMapLocation) {
        if (fy.a(aMapLocation) && fq.r()) {
            long time = aMapLocation.getTime();
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = fs.a(time, currentTimeMillis, fq.s());
            if (a2 != time) {
                aMapLocation.setTime(a2);
                fw.a(time, currentTimeMillis);
            }
        }
    }

    private AMapLocation p() {
        float f;
        float f2;
        try {
            if (fy.a(this.i) && fq.j() && o()) {
                JSONObject jSONObject = new JSONObject((String) fu.a(x.c("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), x.c("UZ2V0TmF2aUxvY2F0aW9u"), (Object[]) null, (Class<?>[]) null));
                long optLong = jSONObject.optLong("time");
                if (!this.J) {
                    this.J = true;
                    fw.a("useNaviLoc", "use NaviLoc");
                }
                if (fy.a() - optLong <= 5500) {
                    double optDouble = jSONObject.optDouble(DispatchConstants.LATITUDE, vu3.b.GEO_NOT_SUPPORT);
                    double optDouble2 = jSONObject.optDouble(DispatchConstants.LONGTITUDE, vu3.b.GEO_NOT_SUPPORT);
                    float f3 = 0.0f;
                    try {
                        f = Float.parseFloat(jSONObject.optString(UserLocation.KEY_DOUBLE_ACCURACY, "0"));
                    } catch (NumberFormatException unused) {
                        f = 0.0f;
                    }
                    double optDouble3 = jSONObject.optDouble("altitude", vu3.b.GEO_NOT_SUPPORT);
                    try {
                        f2 = Float.parseFloat(jSONObject.optString("bearing", "0"));
                    } catch (NumberFormatException unused2) {
                        f2 = 0.0f;
                    }
                    try {
                        f3 = (Float.parseFloat(jSONObject.optString(TBImageFlowMonitor.SPEED_MEASURE, "0")) * 10.0f) / 36.0f;
                    } catch (NumberFormatException unused3) {
                    }
                    AMapLocation aMapLocation = new AMapLocation(yah.SP_PREFIX_KEY);
                    aMapLocation.setLocationType(9);
                    aMapLocation.setLatitude(optDouble);
                    aMapLocation.setLongitude(optDouble2);
                    aMapLocation.setAccuracy(f);
                    aMapLocation.setAltitude(optDouble3);
                    aMapLocation.setBearing(f2);
                    aMapLocation.setSpeed(f3);
                    aMapLocation.setTime(optLong);
                    aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                    if (fy.a(aMapLocation, this.i) <= 300.0f) {
                        synchronized (this.p) {
                            this.i.setLongitude(optDouble2);
                            this.i.setLatitude(optDouble);
                            this.i.setAccuracy(f);
                            this.i.setBearing(f2);
                            this.i.setSpeed(f3);
                            this.i.setTime(optLong);
                            this.i.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
                        }
                        return aMapLocation;
                    }
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.h.a(com.amap.api.location.AMapLocation, java.lang.String):com.amap.api.location.AMapLocation");
    }

    public final boolean f() {
        AMapLocationClientOption aMapLocationClientOption = this.c;
        return aMapLocationClientOption != null && !aMapLocationClientOption.isOnceLocation() && fy.b() - this.d > 300000;
    }

    public final void a() {
        LocationManager locationManager = this.b;
        if (locationManager != null) {
            try {
                LocationListener locationListener = this.x;
                if (locationListener != null) {
                    locationManager.removeUpdates(locationListener);
                    ((a) this.x).a();
                    this.x = null;
                }
            } catch (Throwable unused) {
            }
            try {
                GpsStatus.Listener listener = this.E;
                if (listener != null) {
                    this.b.removeGpsStatusListener(listener);
                }
            } catch (Throwable unused2) {
            }
            try {
                GnssStatus.Callback callback = this.F;
                if (callback != null) {
                    this.b.unregisterGnssStatusCallback(callback);
                }
            } catch (Throwable unused3) {
            }
            try {
                Handler handler = this.f5720a;
                if (handler != null) {
                    handler.removeMessages(8);
                }
            } catch (Throwable unused4) {
            }
            this.C = 0;
            this.A = 0L;
            this.v = 0L;
            this.d = 0L;
            this.B = 0;
            this.w = 0;
            this.f.a();
            this.i = null;
            this.m = 0L;
            this.n = 0.0f;
            this.G = null;
            this.J = false;
        }
    }

    public final void b(AMapLocationClientOption aMapLocationClientOption) {
        Handler handler;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.c = aMapLocationClientOption;
        if (!(aMapLocationClientOption.getLocationMode() == AMapLocationClientOption.AMapLocationMode.Device_Sensors || (handler = this.f5720a) == null)) {
            handler.removeMessages(8);
        }
        if (this.r != this.c.getGeoLanguage()) {
            synchronized (this.o) {
                y = null;
            }
        }
        this.r = this.c.getGeoLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                this.d = 0L;
                this.C = 0;
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean b() {
        return fy.b() - this.d <= 2800;
    }

    private void a(int i, int i2, String str, long j2) {
        try {
            if (this.f5720a != null && this.c.getLocationMode() == AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                Message obtain = Message.obtain();
                AMapLocation aMapLocation = new AMapLocation("");
                aMapLocation.setProvider("gps");
                aMapLocation.setErrorCode(i2);
                aMapLocation.setLocationDetail(str);
                aMapLocation.setLocationType(1);
                obtain.obj = aMapLocation;
                obtain.what = i;
                this.f5720a.sendMessageDelayed(obtain, j2);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean b(String str) {
        try {
            ArrayList<String> b = fy.b(str);
            ArrayList<String> b2 = fy.b(this.G);
            if (b.size() < 8 || b2.size() < 8) {
                return false;
            }
            return fy.a(this.G, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(GnssStatus gnssStatus) {
        Throwable th;
        int satelliteCount;
        boolean usedInFix;
        int i = 0;
        if (gnssStatus != null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    satelliteCount = gnssStatus.getSatelliteCount();
                    int i2 = 0;
                    while (i < satelliteCount) {
                        try {
                            usedInFix = gnssStatus.usedInFix(i);
                            if (usedInFix) {
                                i2++;
                            }
                            i++;
                        } catch (Throwable th2) {
                            th = th2;
                            i = i2;
                            fr.a(th, "GpsLocation_Gnss", "GPS_EVENT_SATELLITE_STATUS");
                            this.C = i;
                        }
                    }
                    i = i2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        this.C = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        Handler handler = this.f5720a;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location != null) {
            try {
                AMapLocation aMapLocation = new AMapLocation(location);
                if (fy.a(aMapLocation)) {
                    aMapLocation.setProvider("gps");
                    aMapLocation.setLocationType(1);
                    if (!this.e && fy.a(aMapLocation)) {
                        fw.a(this.z, fy.b() - this.A, fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                        this.e = true;
                    }
                    if (fy.a(aMapLocation, this.C)) {
                        aMapLocation.setMock(true);
                        aMapLocation.setTrustedLevel(4);
                        if (!this.c.isMockEnable()) {
                            int i = this.w;
                            if (i > 3) {
                                fw.a((String) null, 2152);
                                aMapLocation.setErrorCode(15);
                                aMapLocation.setLocationDetail("GpsLocation has been mocked!#1501");
                                aMapLocation.setLatitude(vu3.b.GEO_NOT_SUPPORT);
                                aMapLocation.setLongitude(vu3.b.GEO_NOT_SUPPORT);
                                aMapLocation.setAltitude(vu3.b.GEO_NOT_SUPPORT);
                                aMapLocation.setSpeed(0.0f);
                                aMapLocation.setAccuracy(0.0f);
                                aMapLocation.setBearing(0.0f);
                                aMapLocation.setExtras(null);
                                c(aMapLocation);
                                return;
                            }
                            this.w = i + 1;
                            return;
                        }
                    } else {
                        this.w = 0;
                    }
                    aMapLocation.setSatellites(this.C);
                    e(aMapLocation);
                    f(aMapLocation);
                    h(aMapLocation);
                    AMapLocation g = g(aMapLocation);
                    a(g);
                    b(g);
                    synchronized (this.o) {
                        a(g, y);
                    }
                    if (fy.a(g)) {
                        if (this.i != null) {
                            this.m = location.getTime() - this.i.getTime();
                            this.n = fy.a(this.i, g);
                        }
                        synchronized (this.p) {
                            this.i = g.clone();
                        }
                        this.G = null;
                        this.H = false;
                        this.I = 0;
                    }
                    c(g);
                }
            } catch (Throwable th) {
                fr.a(th, "GpsLocation", "onLocationChanged");
            }
        }
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.g = bundle.getInt("I_MAX_GEO_DIS");
                this.h = bundle.getInt("I_MIN_GEO_DIS");
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
                if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    synchronized (this.o) {
                        y = aMapLocation;
                    }
                }
            } catch (Throwable th) {
                fr.a(th, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (fy.a(aMapLocation)) {
            this.d = fy.b();
            synchronized (l) {
                k = fy.b();
                j = aMapLocation.clone();
            }
            this.B++;
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 != null && this.c.isNeedAddress() && fy.a(aMapLocation, aMapLocation2) < this.g) {
            fr.a(aMapLocation, aMapLocation2);
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.c = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.c = new AMapLocationClientOption();
        }
        try {
            q = fx.a(this.z, "pref", "lagt", q);
        } catch (Throwable unused) {
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            if ("gps".equalsIgnoreCase(str)) {
                this.d = 0L;
                this.C = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                u = false;
            } else {
                u = allProviders.contains("gps");
            }
            t = true;
            return u;
        } catch (Throwable th) {
            new StringBuilder("GpsLocation | hasProvider error: ").append(th.getMessage());
            return u;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private h f5723a;

        public a(h hVar) {
            this.f5723a = hVar;
        }

        public final void a() {
            this.f5723a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                new StringBuilder("tid=").append(Thread.currentThread().getId());
                h hVar = this.f5723a;
                if (hVar != null) {
                    hVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                h hVar = this.f5723a;
                if (hVar != null) {
                    hVar.a(str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                h hVar = this.f5723a;
                if (hVar != null) {
                    hVar.a(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }
    }
}
