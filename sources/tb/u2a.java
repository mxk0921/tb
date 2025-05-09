package tb;

import android.app.Application;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.UmidtokenInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.NetWorkUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u2a extends e20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean g = false;
    public AMapLocationClient h = null;

    static {
        t2o.a(789577733);
    }

    public u2a(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.GDLOCATION, hashMap);
    }

    public static /* synthetic */ TBLocationOption i(u2a u2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("d968c8fa", new Object[]{u2aVar});
        }
        return u2aVar.f18219a;
    }

    public static /* synthetic */ Object ipc$super(u2a u2aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/location/impl/GDLocation");
    }

    public static /* synthetic */ TBLocationOption j(u2a u2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("1ccf383b", new Object[]{u2aVar});
        }
        return u2aVar.f18219a;
    }

    public static /* synthetic */ void k(u2a u2aVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21972110", new Object[]{u2aVar, tBLocationDTO});
        } else {
            u2aVar.h(tBLocationDTO);
        }
    }

    public static /* synthetic */ Application l(u2a u2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a4f1cf50", new Object[]{u2aVar});
        }
        return u2aVar.e;
    }

    public static /* synthetic */ TBLocationOption m(u2a u2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("e70285fe", new Object[]{u2aVar});
        }
        return u2aVar.f18219a;
    }

    public static /* synthetic */ void n(u2a u2aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b8bcd0", new Object[]{u2aVar, hashMap});
        } else {
            u2aVar.g(hashMap);
        }
    }

    public static /* synthetic */ void o(u2a u2aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eba0e6f", new Object[]{u2aVar, hashMap});
        } else {
            u2aVar.g(hashMap);
        }
    }

    public static /* synthetic */ void p(u2a u2aVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bb600e", new Object[]{u2aVar, hashMap});
        } else {
            u2aVar.g(hashMap);
        }
    }

    @Override // tb.e20
    public LocationTypeEnum a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("4d2b50ed", new Object[]{this});
        }
        if (NetWorkUtils.isNetworkAvailable(Globals.getApplication())) {
            return LocationTypeEnum.NLPLOCATION;
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements AMapLocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29085a;
        public final /* synthetic */ HashMap b;

        /* compiled from: Taobao */
        /* renamed from: tb.u2a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C1064a implements LocationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TBLocationDTO f29086a;

            public C1064a(TBLocationDTO tBLocationDTO) {
                this.f29086a = tBLocationDTO;
            }

            @Override // android.location.LocationListener
            public void onProviderEnabled(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
                }
            }

            @Override // android.location.LocationListener
            public void onStatusChanged(String str, int i, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
                }
            }

            @Override // android.location.LocationListener
            public void onLocationChanged(Location location) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
                    return;
                }
                if (location == null || this.f29086a == null) {
                    str = "";
                } else {
                    str = location.getLatitude() + "-" + location.getLongitude() + "|" + this.f29086a.latitude + "-" + this.f29086a.longitude;
                }
                awv.b(zah.REAL_TIME_LOCATION, true, "{\"regionType\":\"" + u2a.this.d() + "\",\"latlng\":\"" + str + "\"}", u2a.this.c());
            }

            @Override // android.location.LocationListener
            public void onProviderDisabled(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
                    return;
                }
                awv.b(zah.REAL_TIME_LOCATION, true, "{\"regionType\":\"" + u2a.this.d() + "\"}", u2a.this.c());
            }
        }

        public a(boolean z, HashMap hashMap) {
            this.f29085a = z;
            this.b = hashMap;
        }

        @Override // com.amap.api.location.AMapLocationListener
        public void onLocationChanged(AMapLocation aMapLocation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9853887", new Object[]{this, aMapLocation});
                return;
            }
            if (aMapLocation == null) {
                if (!this.f29085a) {
                    this.b.put(zah.d, "14");
                }
                TLog.loge("lbs_GDLocation", "高德定位失败, amapLocation == null");
                u2a.p(u2a.this, this.b);
                this.b.put("regionType", u2a.this.d());
                awv.b(zah.REAL_TIME_LOCATION, false, this.b.toString(), u2a.this.c());
            } else if (aMapLocation.getErrorCode() == 0) {
                TBLocationDTO tBLocationDTO = new TBLocationDTO();
                if (u2a.this.q(aMapLocation, tBLocationDTO)) {
                    if ("gps".equals(aMapLocation.getProvider())) {
                        u2a.this.e(LocationTypeEnum.GPSLOCATION);
                    }
                    tBLocationDTO.regionType = u2a.i(u2a.this) != null ? Integer.valueOf(u2a.j(u2a.this).getRegionType().getKey()) : null;
                    u2a.k(u2a.this, tBLocationDTO);
                    if (OrangeConfig.getInstance().getConfig("passivelocation", "compareToTbserver", "off").equals("on")) {
                        awv.h(u2a.l(u2a.this), u2a.m(u2a.this), new C1064a(tBLocationDTO));
                    } else {
                        awv.b(zah.REAL_TIME_LOCATION, true, "{\"regionType\":\"" + u2a.this.d() + "\"}", u2a.this.c());
                    }
                } else {
                    if (!this.f29085a) {
                        this.b.put(zah.d, "12");
                    }
                    u2a.n(u2a.this, this.b);
                    this.b.put("regionType", u2a.this.d());
                    awv.b(zah.REAL_TIME_LOCATION, false, this.b.toString(), u2a.this.c());
                }
            } else {
                TLog.loge("lbs_GDLocation", "高德定位失败 = " + aMapLocation.getErrorCode());
                HashMap hashMap = this.b;
                String str = zah.e;
                hashMap.put(str, aMapLocation.getErrorCode() + "");
                u2a.o(u2a.this, this.b);
                this.b.put("regionType", u2a.this.d());
                awv.b(zah.REAL_TIME_LOCATION, false, this.b.toString(), u2a.this.c());
            }
            AMapLocationClient aMapLocationClient = u2a.this.h;
            if (aMapLocationClient != null) {
                aMapLocationClient.stopLocation();
                u2a.this.h.onDestroy();
            }
        }
    }

    @Override // tb.e20
    public void b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb229e7", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        AppMonitor.Counter.commit("passivelocation", "GDLocation", 1.0d);
        String str = zah.d;
        hashMap.put(str, "12");
        if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "gdLocation", "on"))) {
            TLog.logi("lbs_GDLocation", "降级高德定位");
            g(hashMap);
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 23 && !((LocationManager) Globals.getApplication().getSystemService("location")).isProviderEnabled("gps")) {
                hashMap.put(str, "10");
                z = true;
            }
            if (!awv.c(this.e.getApplicationContext())) {
                TLog.logi("lbs_GDLocation", "权限不足, 降级高德定位");
                hashMap.put(str, "11");
                g(hashMap);
                return;
            }
        } catch (Exception unused) {
        }
        if (!this.g) {
            this.g = true;
            try {
                UmidtokenInfo.setUmidtoken(Globals.getApplication().getApplicationContext(), SecurityGuardManager.getInstance(Globals.getApplication().getApplicationContext()).getUMIDComp().getSecurityToken());
            } catch (Exception unused2) {
            }
        }
        AMapLocationClientOption.setLocationProtocol(AMapLocationClientOption.AMapLocationProtocol.HTTPS);
        try {
            this.h = new AMapLocationClient(this.e);
        } catch (Exception e) {
            TLog.loge("lbs_GDLocation", "高德定位失败,初始化异常: " + e.toString());
            AppMonitor.Counter.commit("passivelocation", "GD_AMapClientInitFailed", 1.0d);
            AMapLocationClient.updatePrivacyShow(Globals.getApplication(), true, true);
            AMapLocationClient.updatePrivacyAgree(Globals.getApplication(), true);
        }
        AMapLocationClient aMapLocationClient = this.h;
        if (aMapLocationClient == null) {
            g(hashMap);
            return;
        }
        aMapLocationClient.setLocationListener(new a(z, hashMap));
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        if (this.f18219a.getAccuracy() == TBLocationOption.Accuracy.TENMETER) {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        } else {
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
        }
        aMapLocationClientOption.setNeedAddress(true).setOnceLocation(true).setMockEnable(true).setInterval(2000L);
        this.h.setLocationOption(aMapLocationClientOption);
        this.h.startLocation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r5.endsWith("市") != false) goto L_0x008f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q(com.amap.api.location.AMapLocation r12, com.taobao.location.common.TBLocationDTO r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u2a.q(com.amap.api.location.AMapLocation, com.taobao.location.common.TBLocationDTO):boolean");
    }
}
