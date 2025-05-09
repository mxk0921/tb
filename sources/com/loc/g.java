package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AMapLocation f5716a = null;
    private static String b = "CoarseLocation";
    private static long q;
    private static boolean r;
    private static boolean s;
    private static boolean t;
    private static boolean u;
    private ev f;
    private Handler j;
    private Context k;
    private LocationManager n;
    private AMapLocationClientOption o;
    private long c = 0;
    private boolean d = false;
    private int e = 0;
    private int g = 240;
    private int h = 80;
    private int i = 0;
    private long l = 0;
    private int m = 0;
    private Object p = new Object();
    private boolean v = true;
    private AMapLocationClientOption.GeoLanguage w = AMapLocationClientOption.GeoLanguage.DEFAULT;
    private LocationListener x = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private g f5717a;

        public a(g gVar) {
            this.f5717a = gVar;
        }

        public final void a() {
            this.f5717a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                g gVar = this.f5717a;
                if (gVar != null) {
                    gVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                g gVar = this.f5717a;
                if (gVar != null) {
                    gVar.g();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            "gps".equalsIgnoreCase(str);
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                g gVar = this.f5717a;
                if (gVar != null) {
                    gVar.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public g(Context context, Handler handler) {
        this.f = null;
        this.k = context;
        this.j = handler;
        try {
            this.n = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            fr.a(th, b, "<init>");
        }
        this.f = new ev();
    }

    private static ew a(int i, String str) {
        ew ewVar = new ew("");
        ewVar.setErrorCode(i);
        ewVar.setLocationDetail(str);
        return ewVar;
    }

    private void c(AMapLocation aMapLocation) {
        if (this.o.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.o.getDeviceModeDistanceFilter() > 0.0f) {
            d(aMapLocation);
        } else if (fy.b() - this.l >= this.o.getInterval() - 200) {
            this.l = fy.b();
            d(aMapLocation);
        }
    }

    private void d() {
        c(a(12, "定位服务没有开启，请在设置中打开定位服务开关#1206"));
    }

    private void e() {
        c(a(20, "模糊权限下不支持连续定位#2006"));
    }

    private AMapLocation f(AMapLocation aMapLocation) {
        if (!fy.a(aMapLocation) || this.e < 3) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            this.i = 0;
        } catch (Throwable unused) {
        }
    }

    public final int b() {
        LocationManager locationManager = this.n;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.v ? 4 : 0;
    }

    private static int b(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getInt("satellites");
        }
        return 0;
    }

    private boolean c() {
        boolean z = true;
        try {
            if (fy.c() >= 28) {
                if (this.n == null) {
                    this.n = (LocationManager) this.k.getApplicationContext().getSystemService("location");
                }
                z = ((Boolean) fu.a(this.n, "isLocationEnabled", new Object[0])).booleanValue();
            }
            if (fy.c() >= 24 && fy.c() < 28) {
                if (Settings.Secure.getInt(this.k.getContentResolver(), "location_mode", 0) == 0) {
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    private void d(AMapLocation aMapLocation) {
        if (this.j != null) {
            Message obtain = Message.obtain();
            obtain.obj = aMapLocation;
            obtain.what = 101;
            this.j.sendMessage(obtain);
        }
    }

    private void e(AMapLocation aMapLocation) {
        try {
            if (!fr.a(aMapLocation.getLatitude(), aMapLocation.getLongitude()) || !this.o.isOffset()) {
                aMapLocation.setOffset(false);
                aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
                return;
            }
            DPoint a2 = ft.a(this.k, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
            aMapLocation.setLatitude(a2.getLatitude());
            aMapLocation.setLongitude(a2.getLongitude());
            aMapLocation.setOffset(this.o.isOffset());
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_GCJ02);
        } catch (Throwable th) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType(AMapLocation.COORD_TYPE_WGS84);
            new StringBuilder("CoarseLocation | offset error: ").append(th.getMessage());
        }
    }

    private void f() {
        if (this.n != null) {
            try {
                this.v = true;
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    myLooper = this.k.getMainLooper();
                }
                this.c = fy.b();
                if (b(this.n)) {
                    if (this.x == null) {
                        this.x = new a(this);
                    }
                    this.n.requestLocationUpdates("network", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, myLooper);
                }
                if (a(this.n)) {
                    if (fy.a() - q >= 259200000) {
                        if (fy.c(this.k, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==")) {
                            this.n.sendExtraCommand("gps", "force_xtra_injection", null);
                            q = fy.a();
                            SharedPreferences.Editor a2 = fx.a(this.k, "pref");
                            fx.a(a2, "lagt", q);
                            fx.a(a2);
                        } else {
                            fr.a(new Exception("n_alec"), "OPENSDK_CL", "rlu_n_alec");
                        }
                    }
                    if (this.x == null) {
                        this.x = new a(this);
                    }
                    this.n.requestLocationUpdates("gps", this.o.getInterval(), this.o.getDeviceModeDistanceFilter(), this.x, myLooper);
                }
                if (s || u) {
                    a(100, "系统返回定位结果超时#2002", this.o.getHttpTimeOut());
                }
                if (!s && !u) {
                    a(100, "系统定位当前不可用#2003", 0L);
                }
            } catch (SecurityException e) {
                this.v = false;
                fw.a((String) null, 2121);
                a(101, e.getMessage() + "#2004", 0L);
            } catch (Throwable th) {
                new StringBuilder("CoarseLocation | requestLocationUpdates error: ").append(th.getMessage());
                fr.a(th, "CoarseLocation", "requestLocationUpdates part2");
            }
        }
    }

    private static void g(AMapLocation aMapLocation) {
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

    public final void a() {
        LocationManager locationManager = this.n;
        if (locationManager != null) {
            try {
                LocationListener locationListener = this.x;
                if (locationListener != null) {
                    locationManager.removeUpdates(locationListener);
                    ((a) this.x).a();
                    this.x = null;
                }
            } catch (Throwable th) {
                new StringBuilder("CoarseLocation | removeUpdates error ").append(th.getMessage());
            }
            try {
                Handler handler = this.j;
                if (handler != null) {
                    handler.removeMessages(100);
                }
            } catch (Throwable unused) {
            }
            this.i = 0;
            this.c = 0L;
            this.l = 0L;
            this.e = 0;
            this.m = 0;
            this.f.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (i == 0) {
            try {
                this.i = 0;
            } catch (Throwable unused) {
            }
        }
    }

    private void b(AMapLocation aMapLocation) {
        Handler handler;
        if (fy.a(aMapLocation) && this.j != null) {
            long b2 = fy.b();
            if (this.o.getInterval() <= 8000 || b2 - this.l > this.o.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble(DispatchConstants.LATITUDE, aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = 102;
                synchronized (this.p) {
                    try {
                        if (f5716a == null) {
                            handler = this.j;
                        } else if (fy.a(aMapLocation, f5716a) > this.h) {
                            handler = this.j;
                        }
                        handler.sendMessage(obtain);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private void a(int i, String str, long j) {
        try {
            if (this.j != null) {
                Message obtain = Message.obtain();
                AMapLocation aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(20);
                aMapLocation.setLocationDetail(str);
                aMapLocation.setLocationType(11);
                obtain.obj = aMapLocation;
                obtain.what = i;
                this.j.sendMessageDelayed(obtain, j);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(AMapLocationClientOption aMapLocationClientOption) {
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.o = aMapLocationClientOption;
        new StringBuilder("option: ").append(this.o.toString());
        this.j.removeMessages(100);
        if (this.w != this.o.getGeoLanguage()) {
            synchronized (this.p) {
                f5716a = null;
            }
        }
        this.w = this.o.getGeoLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:7:0x000c, B:10:0x0018, B:13:0x0026, B:17:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x005b, B:28:0x0074, B:30:0x007a, B:32:0x0089, B:34:0x008e, B:36:0x00ba, B:38:0x00be, B:39:0x00c0, B:40:0x00db, B:43:0x00e2, B:41:0x00dc, B:42:0x00e1), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:7:0x000c, B:10:0x0018, B:13:0x0026, B:17:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x005b, B:28:0x0074, B:30:0x007a, B:32:0x0089, B:34:0x008e, B:36:0x00ba, B:38:0x00be, B:39:0x00c0, B:40:0x00db, B:43:0x00e2, B:41:0x00dc, B:42:0x00e1), top: B:52:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #3 {all -> 0x002a, blocks: (B:7:0x000c, B:10:0x0018, B:13:0x0026, B:17:0x0031, B:19:0x003b, B:21:0x0041, B:22:0x005b, B:28:0x0074, B:30:0x007a, B:32:0x0089, B:34:0x008e, B:36:0x00ba, B:38:0x00be, B:39:0x00c0, B:40:0x00db, B:43:0x00e2, B:41:0x00dc, B:42:0x00e1), top: B:52:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.location.Location r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.g.a(android.location.Location):void");
    }

    private static boolean b(LocationManager locationManager) {
        try {
            if (t) {
                return u;
            }
            boolean isProviderEnabled = locationManager.isProviderEnabled("network");
            u = isProviderEnabled;
            t = true;
            return isProviderEnabled;
        } catch (Throwable th) {
            new StringBuilder("CoarseLocation | hasProvider error: ").append(th.getMessage());
            return u;
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
                    synchronized (this.p) {
                        f5716a = aMapLocation;
                    }
                }
            } catch (Throwable th) {
                fr.a(th, "CoarseLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (fy.a(aMapLocation)) {
            this.e++;
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 != null && this.o.isNeedAddress() && fy.a(aMapLocation, aMapLocation2) < this.g) {
            fr.a(aMapLocation, aMapLocation2);
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.o = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.o = new AMapLocationClientOption();
        }
        new StringBuilder("option: ").append(this.o.toString());
        if (!this.o.isOnceLocation()) {
            e();
        } else if (!c()) {
            d();
        } else {
            try {
                q = fx.a(this.k, "pref", "lagt", q);
            } catch (Throwable unused) {
            }
            f();
        }
    }

    private static boolean a(LocationManager locationManager) {
        try {
            if (r) {
                return s;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders == null || allProviders.size() <= 0) {
                s = false;
            } else {
                s = allProviders.contains("gps");
            }
            r = true;
            return s;
        } catch (Throwable th) {
            new StringBuilder("CoarseLocation | hasProvider error: ").append(th.getMessage());
            return s;
        }
    }
}
