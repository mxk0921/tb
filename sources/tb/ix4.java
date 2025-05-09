package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimeZone;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ix4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ix4 b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21626a;

    public ix4(Context context) {
        this.f21626a = context;
    }

    public static ix4 b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ix4) ipChange.ipc$dispatch("43e173ef", new Object[]{context});
        }
        if (b == null) {
            synchronized (ix4.class) {
                b = new ix4(context);
            }
        }
        return b;
    }

    public final boolean d(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b43292a", new Object[]{this, new Long(j), new Long(j2), new Integer(i)})).booleanValue();
        }
        if (j - j2 > i * 3600000) {
            return true;
        }
        return false;
    }

    public final boolean l(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce16474", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        long j3 = j - j2;
        if (j3 >= 86400000 || j3 <= -86400000 || q(j) != q(j2)) {
            return false;
        }
        return true;
    }

    public final long q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f15a890", new Object[]{this, new Long(j)})).longValue();
        }
        return (j + TimeZone.getDefault().getOffset(j)) / 86400000;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327a302e", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).edit();
        edit.putBoolean("launch_crash", false);
        edit.apply();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fabca8", new Object[]{this})).booleanValue();
        }
        long j = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getLong("safemode_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j == 0) {
            return false;
        }
        return d(currentTimeMillis, j, 4);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72c9f0a9", new Object[]{this})).booleanValue();
        }
        return this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getBoolean("launch_crash", false);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afdc067", new Object[]{this})).booleanValue();
        }
        long j = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getLong("safemode_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j == 0) {
            return false;
        }
        return l(j, currentTimeMillis);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c410883", new Object[]{this})).booleanValue();
        }
        int i = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getInt("safemode_count", 1);
        return i != 1 && i > 2;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a764c3e", new Object[]{this})).booleanValue();
        }
        return System.currentTimeMillis() - this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getLong("safemode_time", 0L) < xg4.DEFAULT_SMALL_MAX_AGE;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("facaa458", new Object[]{this})).booleanValue();
        }
        return this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getBoolean(mpo.LAUNCH_CRASH_KEY, true);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7638fca4", new Object[]{this})).booleanValue();
        }
        return this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).getBoolean(mpo.NORMAL_CRASH_KEY, true);
    }

    public boolean j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e2ef4e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0);
        boolean z = sharedPreferences.getBoolean("normal_crash", false);
        return z ? sharedPreferences.getInt("normal_crash_hash", 0) == i : z;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4043925c", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).edit();
        edit.putBoolean("launch_crash", true);
        edit.commit();
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcae9a5b", new Object[]{this, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).edit();
        edit.putBoolean("normal_crash", true);
        edit.putInt("normal_crash_hash", i);
        edit.commit();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6763f7", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0).edit();
        edit.putInt("safemode_count", 1);
        edit.putLong("safemode_time", System.currentTimeMillis());
        edit.putBoolean("normal_crash", false);
        edit.putBoolean("launch_crash", false);
        edit.putInt("normal_crash_hash", 0);
        edit.commit();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b85dcf", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.f21626a.getSharedPreferences(mpo.SAFEMODE_SP_NAME, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("safemode_count", sharedPreferences.getInt("safemode_count", 0) + 1);
        edit.putLong("safemode_time", System.currentTimeMillis());
        edit.putBoolean("normal_crash", false);
        edit.putBoolean("launch_crash", false);
        edit.putInt("normal_crash_hash", 0);
        edit.commit();
    }
}
