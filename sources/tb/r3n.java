package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r3n INSTANCE = new r3n();

    static {
        t2o.a(845152384);
    }

    @JvmStatic
    public static final void a(Context context, String str, q3n q3nVar, q3n q3nVar2, q3n q3nVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d428b3c9", new Object[]{context, str, q3nVar, q3nVar2, q3nVar3});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "type");
        if (q3nVar != null) {
            TMSLogger.f("PubTimesFatigueUtils", "increase appTimesFatigue: " + q3nVar.b() + ", " + q3nVar.a() + ", " + q3nVar.c());
            INSTANCE.c(context, str, q3nVar);
        }
        if (q3nVar2 != null) {
            TMSLogger.f("PubTimesFatigueUtils", "increase userTimesFatigue: " + q3nVar2.b() + ", " + q3nVar2.a() + ", " + q3nVar2.c());
            INSTANCE.c(context, str, q3nVar2);
        }
        if (q3nVar2 != null && q3nVar3 != null) {
            TMSLogger.f("PubTimesFatigueUtils", "increase globalTimesFatigue: " + q3nVar3.b() + ", " + q3nVar3.a() + ", " + q3nVar3.c());
            INSTANCE.c(context, ckf.p(q3nVar3.b(), "_global"), q3nVar3);
        }
    }

    public static /* synthetic */ void b(Context context, String str, q3n q3nVar, q3n q3nVar2, q3n q3nVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d3ee39", new Object[]{context, str, q3nVar, q3nVar2, q3nVar3, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            q3nVar = null;
        }
        if ((i & 8) != 0) {
            q3nVar2 = null;
        }
        if ((i & 16) != 0) {
            q3nVar3 = null;
        }
        a(context, str, q3nVar, q3nVar2, q3nVar3);
    }

    public static /* synthetic */ boolean e(Context context, String str, q3n q3nVar, q3n q3nVar2, q3n q3nVar3, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318f6c17", new Object[]{context, str, q3nVar, q3nVar2, q3nVar3, new Integer(i), obj})).booleanValue();
        }
        if ((i & 4) != 0) {
            q3nVar = null;
        }
        if ((i & 8) != 0) {
            q3nVar2 = null;
        }
        if ((i & 16) != 0) {
            q3nVar3 = null;
        }
        return d(context, str, q3nVar, q3nVar2, q3nVar3);
    }

    @JvmStatic
    public static final boolean d(Context context, String str, q3n q3nVar, q3n q3nVar2, q3n q3nVar3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c666e633", new Object[]{context, str, q3nVar, q3nVar2, q3nVar3})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(str, "type");
        if (!q9s.q2()) {
            TMSLogger.b("PubTimesFatigueUtils", "timesFatigueMDayNTimes is disabled");
            return false;
        } else if (q3nVar == null && q3nVar2 == null) {
            TMSLogger.b("PubTimesFatigueUtils", "timesFatigueMDayNTimes, appTimesFatigue and userTimesFatigue are disabled");
            return true;
        } else {
            boolean f = q3nVar != null ? INSTANCE.f(context, str, q3nVar) : false;
            if (q3nVar2 == null) {
                return f;
            }
            r3n r3nVar = INSTANCE;
            boolean z2 = r3nVar.f(context, str, q3nVar2) || f;
            if (q3nVar3 == null) {
                return z2;
            }
            if (!r3nVar.f(context, ckf.p(q3nVar3.b(), "_global"), q3nVar3) && !z2) {
                z = false;
            }
            return z;
        }
    }

    public final void c(Context context, String str, q3n q3nVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b620b533", new Object[]{this, context, str, q3nVar});
        } else if (q3nVar.a() == 0 || q3nVar.c() == 0) {
            TMSLogger.b("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's dayValue or timesValue is 0");
        } else {
            if (q3nVar.a() == -1) {
                TMSLogger.a("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's dayValue is -1");
                q3nVar.d(9999999);
            }
            if (q3nVar.c() == -1) {
                TMSLogger.a("PubTimesFatigueUtils", "addTimesMDayNTimes, timesFatigue's timesValue is -1");
                q3nVar.e(9999999);
            }
            wcs.h(context, "pub_add_guide_times_" + q3nVar.b() + '_' + str, wcs.a(context, str2, 0) + 1);
        }
    }

    public final boolean f(Context context, String str, q3n q3nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfeea018", new Object[]{this, context, str, q3nVar})).booleanValue();
        }
        if (q3nVar.a() == 0 || q3nVar.c() == 0) {
            TMSLogger.b("PubTimesFatigueUtils", "timesFatigue's dayValue or timesValue is 0");
            return true;
        }
        if (q3nVar.a() == -1) {
            TMSLogger.a("PubTimesFatigueUtils", "timesFatigue's dayValue is -1");
            q3nVar.d(9999999);
        }
        if (q3nVar.c() == -1) {
            TMSLogger.a("PubTimesFatigueUtils", "timesFatigue's timesValue is -1");
            q3nVar.e(9999999);
        }
        String str2 = "pub_add_guide_start_time_" + q3nVar.b() + '_' + str;
        long b = wcs.b(context, str2, 0L);
        int a2 = wcs.a(context, "pub_add_guide_times_" + q3nVar.b() + '_' + str, 0);
        TMSLogger.a("PubTimesFatigueUtils", "type: " + str + ", id: " + q3nVar.b() + ", dayValue: " + q3nVar.a() + ", timeValue: " + q3nVar.c());
        TMSLogger.a("PubTimesFatigueUtils", "type: " + str + ", id: " + q3nVar.b() + ", addCount: " + a2 + ", duration: " + (System.currentTimeMillis() - b));
        if (b == 0 || System.currentTimeMillis() - b > q3nVar.a() * RemoteMessageConst.DEFAULT_TTL * 1000) {
            wcs.h(context, str2, System.currentTimeMillis());
        } else if (a2 >= q3nVar.c()) {
            return true;
        }
        return false;
    }
}
