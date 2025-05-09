package com.taobao.passivelocation.gathering.service;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.report.service.LocationReportService;
import com.taobao.tao.Globals;
import tb.ich;
import tb.mdh;
import tb.np6;
import tb.t2o;
import tb.u5a;
import tb.v5a;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationGatheringService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_CHANGED_ACTION = "com.taobao.passivelocation.gathering.service.LOCATION_GATHERING_ACTION";
    public static final String LOCATION_GATHERING_START_ACTION = "com.taobao.passivelocation.gathering.service.LOCATION_GATHERING_START_ACTION";

    /* renamed from: a  reason: collision with root package name */
    public ContentResolver f11448a;
    public ich b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Intent f11449a;

        static {
            t2o.a(789577857);
        }

        public a(String str, Intent intent) {
            super(str);
            this.f11449a = intent;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/gathering/service/LocationGatheringService$startGatherThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocationGatheringService.a(LocationGatheringService.this, this.f11449a);
            }
        }
    }

    static {
        t2o.a(789577856);
    }

    public LocationGatheringService() {
        this("LocationGatheringService");
    }

    public static /* synthetic */ void a(LocationGatheringService locationGatheringService, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb58da3c", new Object[]{locationGatheringService, intent});
        } else {
            locationGatheringService.b(intent);
        }
    }

    public static void f(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa89904", new Object[]{location});
            return;
        }
        Intent intent = new Intent("com.taobao.passivelocation.gathering.service.LOCATION_RESULT_ACTION");
        intent.putExtra("com.taobao.passivelocation.gathering.service.LOCATION_RESULT_OBJ", location);
        intent.setPackage(yah.f31937a.getPackageName());
        Globals.getApplication().sendBroadcast(intent);
    }

    public static /* synthetic */ Object ipc$super(LocationGatheringService locationGatheringService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/passivelocation/gathering/service/LocationGatheringService");
        }
    }

    public final void c(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2a246c", new Object[]{this, location});
            return;
        }
        try {
            Intent intent = new Intent(LocationReportService.LOCATION_UPLOAD_ACTION);
            intent.putExtra(LocationReportService.LOCATION_EXTRA_REPORT_ACTION, location);
            intent.setPackage(yah.f31937a.getPackageName());
            yah.f31937a.startService(intent);
        } catch (Exception e) {
            mdh.c("lbs_passive.loc_LGS", "Report异常", e);
        }
    }

    public final String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39edfa6b", new Object[]{this, intent});
        }
        if (intent.hasExtra("location_source_key")) {
            String stringExtra = intent.getStringExtra("location_source_key");
            mdh.a("lbs_passive.loc_LGS", "[onHandleIntent] source=" + stringExtra);
            return stringExtra;
        }
        mdh.e("lbs_passive.loc_LGS", "[onHandleIntent] source null");
        return null;
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b1868e8", new Object[]{this, str})).booleanValue();
        }
        if (!LOCATION_GATHERING_START_ACTION.equals(str) && LOCATION_CHANGED_ACTION.equals(str)) {
            return true;
        }
        return false;
    }

    public final void g(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54d5d6b", new Object[]{this, location});
        } else {
            new np6(getApplicationContext()).d(this.f11448a, v5a.a(location));
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        mdh.a("lbs_passive.loc_LGS", "[onCreate] begin");
        super.onCreate();
        yah.f31937a = getApplicationContext();
        this.f11448a = getContentResolver();
        this.b = new ich(getApplicationContext());
        AppMonitor.Counter.commit("passivelocation", "LocationGatheringService", 1.0d);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passiveGather", "on"))) {
            mdh.b("lbs_passive.loc_LGS", "LocationGather降级");
        } else {
            mdh.a("lbs_passive.loc_LGS", "[onHandleIntent] begin");
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                mdh.a("lbs_passive.loc_LGS", "[onHandleIntent] intent null or action null");
            } else {
                b(intent);
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        mdh.a("lbs_passive.loc_LGS", "[onStart] begin");
        super.onStart(intent, i);
        if (intent != null && !TextUtils.isEmpty(intent.getAction()) && LOCATION_GATHERING_START_ACTION.equals(intent.getAction())) {
            mdh.a("lbs_passive.loc_LGS", "[onStart] invoke GatheringCommand.startGathering");
            new u5a().a(getApplicationContext(), ich.f);
        }
    }

    public LocationGatheringService(String str) {
        super(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        if (r5.getLatitude().doubleValue() <= tb.vu3.b.GEO_NOT_SUPPORT) goto L_0x0134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        if (r5.getLongitude().doubleValue() <= tb.vu3.b.GEO_NOT_SUPPORT) goto L_0x0134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        r0 = (int) ((tb.abh.d((int) (r5.getLongitude().doubleValue() * 3600000.0d), (int) (r5.getLatitude().doubleValue() * 3600000.0d), (int) (r15.getLongitude() * 3600000.0d), (int) (r15.getLatitude() * 3600000.0d), 3600000.0d) * 1000.0d) + 0.5d);
        r1 = com.taobao.orange.OrangeConfig.getInstance().getConfig("gps", "gatherNormalDistance", "500");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (r1 == null) goto L_0x0120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
        if (r1.isEmpty() != false) goto L_0x0120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
        r1 = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
        r1 = 500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0122, code lost:
        if (r0 >= r1) goto L_0x012a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
        tb.mdh.a("lbs_passive.loc_LGS", "[onHandleIntent] 与上次位置距离较近且在距离配置范围内不上报位置~");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
        g(r15);
        c(r15);
        f(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.passivelocation.gathering.service.LocationGatheringService.b(android.content.Intent):void");
    }
}
