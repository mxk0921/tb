package com.alibaba.ability.impl.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsLocationAbility;
import com.taobao.android.abilityidl.ability.LocationData;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import java.util.Map;
import kotlin.Deprecated;
import tb.a07;
import tb.cjf;
import tb.ckf;
import tb.dnc;
import tb.j8d;
import tb.kch;
import tb.kdb;
import tb.nyl;
import tb.p78;
import tb.t2o;
import tb.tao;
import tb.unr;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class LocationAbility extends AbsLocationAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements LocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dnc f1966a;
        public final /* synthetic */ LocationManager b;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.location.LocationAbility$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0046a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Location b;

            public RunnableC0046a(Location location) {
                this.b = location;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                dnc dncVar = a.this.f1966a;
                LocationData locationData = new LocationData();
                locationData.longitude = String.valueOf(this.b.getLongitude());
                locationData.latitude = String.valueOf(this.b.getLatitude());
                xhv xhvVar = xhv.INSTANCE;
                dncVar.o0(locationData);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public b(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                dnc dncVar = a.this.f1966a;
                dncVar.O(new ErrorResult("500", "系统中禁用了定位能力: " + this.b, (Map) null, 4, (a07) null));
            }
        }

        public a(dnc dncVar, LocationManager locationManager) {
            this.f1966a = dncVar;
            this.b = locationManager;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
                return;
            }
            ckf.g(location, "location");
            MegaUtils.C(new RunnableC0046a(location));
            this.b.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
                return;
            }
            ckf.g(str, "provider");
            MegaUtils.C(new b(str));
            this.b.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
            } else {
                ckf.g(str, "provider");
            }
        }

        @Override // android.location.LocationListener
        @Deprecated(message = "Deprecated in Java")
        public void onStatusChanged(String str, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ dnc b;
        public final /* synthetic */ Context c;

        public b(dnc dncVar, Context context) {
            this.b = dncVar;
            this.c = context;
        }

        @Override // tb.unr
        public final void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
            } else if (tBLocationDTO == null || !tBLocationDTO.isNavSuccess) {
                LocationAbility.access$getLocationByLocationService(LocationAbility.this, this.c, this.b);
            } else {
                this.b.o0(LocationAbility.access$convert2LocationData(LocationAbility.this, tBLocationDTO));
            }
        }
    }

    static {
        t2o.a(115343362);
    }

    public static final /* synthetic */ LocationData access$convert2LocationData(LocationAbility locationAbility, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationData) ipChange.ipc$dispatch("db9883e4", new Object[]{locationAbility, tBLocationDTO});
        }
        return locationAbility.a(tBLocationDTO);
    }

    public static final /* synthetic */ void access$getLocationByLocationService(LocationAbility locationAbility, Context context, dnc dncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257b8526", new Object[]{locationAbility, context, dncVar});
        } else {
            locationAbility.b(context, dncVar);
        }
    }

    public static /* synthetic */ Object ipc$super(LocationAbility locationAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/location/LocationAbility");
    }

    public final LocationData a(TBLocationDTO tBLocationDTO) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Long l;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationData) ipChange.ipc$dispatch("dc43af7", new Object[]{this, tBLocationDTO});
        }
        LocationData locationData = new LocationData();
        String str11 = null;
        if (tBLocationDTO != null) {
            str = tBLocationDTO.longitude;
        } else {
            str = null;
        }
        locationData.longitude = str;
        if (tBLocationDTO != null) {
            str2 = tBLocationDTO.latitude;
        } else {
            str2 = null;
        }
        locationData.latitude = str2;
        if (tBLocationDTO == null || (num = tBLocationDTO.accuracy) == null) {
            str3 = null;
        } else {
            str3 = String.valueOf(num.intValue());
        }
        locationData.accuracy = str3;
        if (tBLocationDTO != null) {
            str4 = tBLocationDTO.address;
        } else {
            str4 = null;
        }
        locationData.address = str4;
        if (tBLocationDTO != null) {
            str5 = tBLocationDTO.cityName;
        } else {
            str5 = null;
        }
        locationData.city = str5;
        if (tBLocationDTO != null) {
            str6 = tBLocationDTO.areaName;
        } else {
            str6 = null;
        }
        locationData.area = str6;
        if (tBLocationDTO != null) {
            str7 = tBLocationDTO.countryName;
        } else {
            str7 = null;
        }
        locationData.country = str7;
        if (tBLocationDTO != null) {
            str8 = tBLocationDTO.provinceName;
        } else {
            str8 = null;
        }
        locationData.province = str8;
        if (tBLocationDTO != null) {
            str9 = tBLocationDTO.cityCode;
        } else {
            str9 = null;
        }
        locationData.cityCode = str9;
        if (tBLocationDTO != null) {
            str10 = tBLocationDTO.areaCode;
        } else {
            str10 = null;
        }
        locationData.areaCode = str10;
        if (!(tBLocationDTO == null || (l = tBLocationDTO.timeStamp) == null)) {
            str11 = String.valueOf(l.longValue());
        }
        locationData.timeStamp = str11;
        return locationData;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocationAbility
    public tao<LocationData, ErrorResult> getCache(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("84b81590", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        TBLocationDTO d = TBLocationClient.d();
        if (d == null) {
            return new tao<>(new LocationData(), null, 2, null);
        }
        if (d.isNavSuccess) {
            return new tao<>(a(d), null, 2, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "errorCode", (String) d.errorCode);
        xhv xhvVar = xhv.INSTANCE;
        String json = jSONObject.toString();
        ckf.f(json, "JSONObject().apply {\n   …             }.toString()");
        return new tao<>(null, new ErrorResult("500", json, (Map) null, 4, (a07) null));
    }

    public final void b(Context context, dnc dncVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de67ee79", new Object[]{this, context, dncVar});
            return;
        }
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            LocationManager locationManager = (LocationManager) systemService;
            if (locationManager != null) {
                a aVar = new a(dncVar, locationManager);
                locationManager.requestLocationUpdates("network", 1000L, 1.0f, aVar, Looper.getMainLooper());
                locationManager.requestLocationUpdates("gps", 1000L, 1.0f, aVar, Looper.getMainLooper());
                return;
            }
            dncVar.O(new ErrorResult("400", "request location by location service fail", (Map) null, 4, (a07) null));
        } catch (Exception unused) {
            dncVar.O(new ErrorResult("500", "request location by location service fail", (Map) null, 4, (a07) null));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsLocationAbility
    public void request(kdb kdbVar, kch kchVar, dnc dncVar) {
        TBLocationOption.Accuracy accuracy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebf8bd7", new Object[]{this, kdbVar, kchVar, dncVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(kchVar, "params");
        ckf.g(dncVar, "events");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            j8d i = cjf.INSTANCE.i();
            Map<String, Boolean> map = null;
            nyl a2 = i != null ? i.a(kchVar.f22564a, new String[]{p78.ACCESS_FINE_LOCATION}) : null;
            if (a2 != null) {
                map = a2.a();
            }
            if (map != null && ckf.b(a2.a().get(p78.ACCESS_FINE_LOCATION), Boolean.FALSE)) {
                dncVar.O(new ErrorResult("NO_PERMISSION", "permission ACCESS_FINE_LOCATION required", (Map) null, 4, (a07) null));
            } else if (kchVar.d) {
                TBLocationOption tBLocationOption = new TBLocationOption();
                try {
                    String str = kchVar.b;
                    ckf.f(str, "params.expires");
                    tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(str));
                    if (ckf.b("HIGH_MODE", kchVar.c)) {
                        accuracy = TBLocationOption.Accuracy.TENMETER;
                    } else {
                        accuracy = TBLocationOption.Accuracy.DEFAULT;
                    }
                    tBLocationOption.setAccuracy(accuracy);
                    TBLocationClient.g(kdbVar.l().getContext()).h(tBLocationOption, new b(dncVar, context), Looper.getMainLooper());
                } catch (IllegalArgumentException unused) {
                    dncVar.O(new ErrorResult("400", "expires \"" + kchVar + ".expires\" dose not exist", (Map) null, 4, (a07) null));
                }
            } else {
                b(context, dncVar);
            }
        } else {
            dncVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        }
    }
}
