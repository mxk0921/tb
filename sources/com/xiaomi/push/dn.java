package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dn {

    /* renamed from: a  reason: collision with root package name */
    private static int f14829a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f846a = true;

    private static int a(Context context) {
        if (f14829a <= 0) {
            f14829a = j.b(context);
        }
        return f14829a;
    }

    private static void b(Context context, long j, int i) {
        dk.a(DMComponent.RESET);
        m594a(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    public static void c(Context context, long j, boolean z) {
        ah.a(context).a(new dq(context, j, z));
    }

    public static void d(Context context, long j, boolean z) {
        ah.a(context).a(new dr(context, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            try {
                dk.a("recordSendMsg start");
                int a2 = a(z);
                SharedPreferences a3 = m594a(context);
                long j2 = a3.getLong("start_time", 0L);
                if (j2 <= 0) {
                    a(context, a3, j, a2);
                }
                if (a2 == 1) {
                    i = a3.getInt("on_up_count", 0) + 1;
                    putInt = a3.edit().putInt("on_up_count", i);
                } else {
                    i = a3.getInt("off_up_count", 0) + 1;
                    putInt = a3.edit().putInt("off_up_count", i);
                }
                putInt.apply();
                a(context, j2, j, i, a2);
                dk.a("recordSendMsg complete");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void j(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            try {
                dk.a("recordReceiveMsg start");
                int a2 = a(z);
                SharedPreferences a3 = m594a(context);
                long j2 = a3.getLong("start_time", 0L);
                if (j2 <= 0) {
                    a(context, a3, j, a2);
                }
                if (a2 == 1) {
                    i = a3.getInt("on_down_count", 0) + 1;
                    putInt = a3.edit().putInt("on_down_count", i);
                } else {
                    i = a3.getInt("off_down_count", 0) + 1;
                    putInt = a3.edit().putInt("off_down_count", i);
                }
                putInt.apply();
                a(context, j2, j, i, a2);
                dk.a("recordReceiveMsg complete");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void k(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            try {
                dk.a("recordPing start");
                int a2 = a(z);
                SharedPreferences a3 = m594a(context);
                long j2 = a3.getLong("start_time", 0L);
                if (j2 <= 0) {
                    a(context, a3, j, a2);
                }
                if (a2 == 1) {
                    i = a3.getInt("on_ping_count", 0) + 1;
                    putInt = a3.edit().putInt("on_ping_count", i);
                } else {
                    i = a3.getInt("off_ping_count", 0) + 1;
                    putInt = a3.edit().putInt("off_ping_count", i);
                }
                putInt.apply();
                a(context, j2, j, i, a2);
                dk.a("recordPing complete");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void l(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            try {
                dk.a("recordPong start");
                int a2 = a(z);
                SharedPreferences a3 = m594a(context);
                long j2 = a3.getLong("start_time", 0L);
                if (j2 <= 0) {
                    a(context, a3, j, a2);
                }
                if (a2 == 1) {
                    i = a3.getInt("on_pong_count", 0) + 1;
                    putInt = a3.edit().putInt("on_pong_count", i);
                } else {
                    i = a3.getInt("off_pong_count", 0) + 1;
                    putInt = a3.edit().putInt("off_pong_count", i);
                }
                putInt.apply();
                a(context, j2, j, i, a2);
                dk.a("recordPong complete");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    public static void b(Context context, long j, boolean z) {
        ah.a(context).a(new dp(context, j, z));
    }

    /* renamed from: a  reason: collision with other method in class */
    private static SharedPreferences m594a(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static dl m595a(Context context) {
        SharedPreferences a2 = m594a(context);
        dl dlVar = new dl();
        dlVar.a(a2.getInt("off_up_count", 0));
        dlVar.b(a2.getInt("off_down_count", 0));
        dlVar.c(a2.getInt("off_ping_count", 0));
        dlVar.d(a2.getInt("off_pong_count", 0));
        dlVar.a(a2.getLong("off_duration", 0L));
        dlVar.e(a2.getInt("on_up_count", 0));
        dlVar.f(a2.getInt("on_down_count", 0));
        dlVar.g(a2.getInt("on_ping_count", 0));
        dlVar.h(a2.getInt("on_pong_count", 0));
        dlVar.b(a2.getLong("on_duration", 0L));
        dlVar.c(a2.getLong("start_time", 0L));
        dlVar.d(a2.getLong(ExperimentDO.COLUMN_END_TIME, 0L));
        dlVar.i(a2.getInt("xmsf_vc", 0));
        dlVar.j(a2.getInt("android_vc", 0));
        return dlVar;
    }

    private static void a(Context context, long j, int i) {
        dk.a("upload");
        new dm().a(context, m595a(context));
        b(context, j, i);
    }

    private static void a(Context context, long j, long j2, int i, int i2) {
        if (j <= 0) {
            return;
        }
        if (m596a(context) || i >= 1073741823 || j2 - j >= 86400000) {
            m594a(context).edit().putLong(ExperimentDO.COLUMN_END_TIME, j2).apply();
            a(context, j2, i2);
        }
    }

    public static void a(Context context, long j, boolean z) {
        ah.a(context).a(new Cdo(context, j, z));
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j, int i) {
        dk.a("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m596a(Context context) {
        boolean z = false;
        if (f846a) {
            f846a = false;
            SharedPreferences a2 = m594a(context);
            int i = a2.getInt("xmsf_vc", 0);
            int i2 = a2.getInt("android_vc", 0);
            if (!(i == 0 || i2 == 0 || (i == a(context) && i2 == Build.VERSION.SDK_INT))) {
                z = true;
            }
        }
        dk.a("isVcChanged = " + z);
        return z;
    }
}
