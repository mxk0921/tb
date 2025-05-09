package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a4p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_PERMISSION_BIZ_NAME = "TB_SHOPPING_PROCESS";

    /* renamed from: a  reason: collision with root package name */
    public static volatile TBLocationDTO f15539a;
    public static long b;
    public static final String[] c = {p78.ACCESS_FINE_LOCATION};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a4p.a(TBLocationClient.d());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f15540a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends xpo {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/service/SearchLocationService$2$1");
            }

            @Override // tb.xpo
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                a4p.b(bVar.f15540a, bVar.b, bVar.c);
            }
        }

        public b(d dVar, Context context, boolean z) {
            this.f15540a = dVar;
            this.b = context;
            this.c = z;
        }

        @Override // tb.gjb
        public void a(qzl qzlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("475e28c8", new Object[]{this, qzlVar});
                return;
            }
            int i = qzlVar.b[0];
            String str = qzlVar.c[0];
            if (i == 0) {
                AppMonitor.Alarm.commitSuccess("tbsearch", "requireLocationPermission");
                Coordinator.execute(new a());
            } else if (i == -1) {
                AppMonitor.Alarm.commitFail("tbsearch", "requireLocationPermission", String.valueOf(i), str);
                c4p.m("SearchLocationService", "checkBizPermission: denied with msg " + str);
                Context context = this.b;
                if (context instanceof Activity) {
                    kl7.d((Activity) context, Localization.q(R.string.taobao_app_1005_1_16699) + Localization.q(R.string.taobao_app_1005_1_16668));
                    return;
                }
                a6p.c("", Localization.q(R.string.taobao_app_1005_1_16657), 0);
            } else {
                AppMonitor.Alarm.commitFail("tbsearch", "requireLocationPermission", String.valueOf(i), str);
                Toast.makeText(Globals.getApplication(), Localization.q(R.string.taobao_app_1005_1_16657), 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements unr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f15541a;

        public c(d dVar) {
            this.f15541a = dVar;
        }

        @Override // tb.unr
        public void onLocationChanged(TBLocationDTO tBLocationDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                return;
            }
            if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
                a4p.a(tBLocationDTO);
            }
            d dVar = this.f15541a;
            if (dVar != null) {
                dVar.a(tBLocationDTO);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(TBLocationDTO tBLocationDTO);
    }

    static {
        t2o.a(815792190);
    }

    public static /* synthetic */ TBLocationDTO a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("3289da3d", new Object[]{tBLocationDTO});
        }
        f15539a = tBLocationDTO;
        return tBLocationDTO;
    }

    public static /* synthetic */ void b(d dVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62788ee", new Object[]{dVar, context, new Boolean(z)});
        } else {
            g(dVar, context, z);
        }
    }

    public static TBLocationDTO c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("738c00aa", new Object[0]);
        }
        if (!d(Globals.getApplication())) {
            return null;
        }
        Coordinator.execute(new a());
        return f15539a;
    }

    public static void e(d dVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafdcfbe", new Object[]{dVar, context, new Boolean(z)});
        } else if (context == null) {
            Log.e("SearchLocationService", "context is null");
        } else if (d(context)) {
            g(dVar, context, z);
        } else if (!z) {
            if (dVar != null) {
                dVar.a(null);
            }
        } else if (o4p.L1()) {
            com.taobao.runtimepermission.a.c(context, c).x(true).u(new b(dVar, context, z)).t("TB_SHOPPING_PROCESS").B(true).y(0L).w(Localization.q(R.string.taobao_app_1005_1_16678)).m();
        } else if (dVar != null) {
            dVar.a(null);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd14ee2", new Object[]{context});
            return;
        }
        int y = o4p.y(30) * 60000;
        c4p.m("SearchLocationService", "initiativeLocationIfOvertime: current interval is " + y);
        if (System.currentTimeMillis() - b >= y) {
            e(null, context, false);
        }
    }

    public static void g(d dVar, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c272921", new Object[]{dVar, context, new Boolean(z)});
        } else if (d(context)) {
            b = System.currentTimeMillis();
            TBLocationOption tBLocationOption = new TBLocationOption();
            if (!o4p.G1() || z) {
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
            } else {
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.TWO_HOUR);
            }
            tBLocationOption.setRegionType(TBLocationOption.RegionType.DISTRICT);
            TBLocationClient.g(context).h(tBLocationOption, new c(dVar), Looper.getMainLooper());
        }
    }

    public static boolean d(Context context) {
        qzl d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a42a47", new Object[]{context})).booleanValue();
        }
        if (!o4p.t0() || (d2 = com.taobao.runtimepermission.a.d(context, "TB_SHOPPING_PROCESS", c)) == null) {
            return false;
        }
        int i = d2.b[0];
        if (i == 0) {
            AppMonitor.Alarm.commitSuccess("tbsearch", "locationPermission");
            return true;
        }
        String str = d2.c[0];
        c4p.m("SearchLocationService", "checkBizPermission: denied with msg " + str);
        AppMonitor.Alarm.commitFail("tbsearch", "locationPermission", String.valueOf(i), str);
        return false;
    }
}
