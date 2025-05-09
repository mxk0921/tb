package com.taobao.passivelocation.gathering.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;
import com.taobao.tao.Globals;
import tb.bda;
import tb.ich;
import tb.mdh;
import tb.t2o;
import tb.tbj;
import tb.unr;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REPORT_SOURCE = "locationreport";

    /* renamed from: a  reason: collision with root package name */
    public String f11445a = null;
    public b b = null;
    public long c = 0;
    public long d = 0;
    public final unr e = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
            } else {
                LocationChangedReceiver.b(LocationChangedReceiver.this, tBLocationDTO);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577854);
        }

        public b(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/gathering/receiver/LocationChangedReceiver$StartGatherThread");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocationChangedReceiver.a(LocationChangedReceiver.this);
            }
        }
    }

    static {
        t2o.a(789577852);
    }

    public static /* synthetic */ void a(LocationChangedReceiver locationChangedReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11a28e", new Object[]{locationChangedReceiver});
        } else {
            locationChangedReceiver.e();
        }
    }

    public static /* synthetic */ void b(LocationChangedReceiver locationChangedReceiver, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2becb3d", new Object[]{locationChangedReceiver, tBLocationDTO});
        } else {
            locationChangedReceiver.f(tBLocationDTO);
        }
    }

    public static /* synthetic */ Object ipc$super(LocationChangedReceiver locationChangedReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/gathering/receiver/LocationChangedReceiver");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20826c8", new Object[]{this});
        } else {
            AppMonitor.Stat.commit("network", "responeTime", DimensionValueSet.create().setValue("locationtime", "locationtime"), MeasureValueSet.create().setValue("timevalue", this.d - this.c));
        }
    }

    public final TBLocationOption d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption) ipChange.ipc$dispatch("cf0a0e54", new Object[]{this});
        }
        TBLocationOption tBLocationOption = new TBLocationOption();
        tBLocationOption.setDataModel(TBLocationOption.DataModel.DEFAULT);
        tBLocationOption.setAccuracy(TBLocationOption.Accuracy.DEFAULT);
        tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.SEC_MIN);
        tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
        return tBLocationOption;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb229e7", new Object[]{this});
            return;
        }
        try {
            if (new ich(bda.a()).a()) {
                if (ich.e) {
                    mdh.a("lbs_passive.loc_LCRE", "[onReceive] 电量低不采集位置信息");
                    return;
                }
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] 开始定位 ");
                if (ich.f) {
                    AppMonitor.Counter.commit("passivelocation", "backlocationtotal", 1.0d);
                } else {
                    AppMonitor.Counter.commit("passivelocation", "locationtotal", 1.0d);
                }
                TBLocationClient g = TBLocationClient.g(bda.a());
                mdh.a("lbs_passive.loc_LCRE", "[startGather] start");
                g.h(d(), this.e, Looper.getMainLooper());
            }
        } catch (Exception unused) {
        }
    }

    public final void f(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0838e1e", new Object[]{this, tBLocationDTO});
            return;
        }
        try {
            if (tBLocationDTO == null) {
                if (this.b != null) {
                    this.b = null;
                }
                AppMonitor.Counter.commit("passivelocation", "locationfailed", 1.0d);
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] 被定定位失败");
                return;
            }
            if (tBLocationDTO.isNavSuccess()) {
                AppMonitor.Counter.commit("passivelocation", "locationsuccess", 1.0d);
                String latitude = tBLocationDTO.getLatitude();
                String longitude = tBLocationDTO.getLongitude();
                Integer accuracy = tBLocationDTO.getAccuracy();
                Location location = new Location("gps");
                location.setLatitude(Double.parseDouble(latitude));
                location.setLongitude(Double.parseDouble(longitude));
                if (accuracy != null) {
                    location.setAccuracy(accuracy.floatValue());
                } else {
                    location.setAccuracy(0.0f);
                }
                Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
                intent.setPackage(Globals.getApplication().getPackageName());
                intent.putExtra(yah.EXTRA_KEY_LOCATION, location);
                intent.putExtra("location_source_key", this.f11445a);
                Globals.getApplication().startService(intent);
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] 被定定位采集结果: " + location.toString());
            } else {
                AppMonitor.Counter.commit("passivelocation", "locationfailed", 1.0d);
                if (tBLocationDTO.getErrorCode() != null) {
                    String num = tBLocationDTO.getErrorCode().toString();
                    mdh.a("lbs_passive.loc_LCRE", "[onReceive] 被定定位失败, errorcode:" + num);
                }
            }
            this.d = System.currentTimeMillis();
            c();
        } catch (Exception unused) {
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e415774", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("locationtime");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("timevalue");
        AppMonitor.register("passivelocation", "locationtime", create2, create);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        AppMonitor.Counter.commit("passivelocation", "LocationChangedReceiver", 1.0d);
        yah.d = System.currentTimeMillis();
        mdh.a("lbs_passive.loc_LCRE", "[onReceive] invoked begin, start_time=" + yah.d);
        if (intent != null) {
            if (intent.hasExtra("alarm")) {
                str = intent.getStringExtra("alarm");
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else if (intent.hasExtra(tbj.REQUEST_UPDATES)) {
                str = intent.getStringExtra(tbj.REQUEST_UPDATES);
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else if (intent.hasExtra(REPORT_SOURCE)) {
                str = intent.getStringExtra(REPORT_SOURCE);
                mdh.a("lbs_passive.loc_LCRE", "[onReceive] location source: " + str);
            } else {
                mdh.d("lbs_passive.loc_LCRE", "[onReceive] location " + intent.toString());
                str = null;
            }
            this.f11445a = str;
            try {
                g();
                this.c = System.currentTimeMillis();
                b bVar = new b("passiveGatherLocationTask");
                this.b = bVar;
                Coordinator.postTask(bVar);
            } catch (Exception e) {
                mdh.c("lbs_passive.loc_LCRE", "[onReceive] error", e);
            }
        } else {
            mdh.d("lbs_passive.loc_LCRE", "intent is null");
        }
    }
}
