package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile bqm b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16553a = n.j().b().getSharedPreferences("ut-ab", 0);

    static {
        t2o.a(961544378);
    }

    public static synchronized bqm a() {
        synchronized (bqm.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bqm) ipChange.ipc$dispatch("32e45413", new Object[0]);
            }
            if (b == null) {
                synchronized (bqm.class) {
                    if (b == null) {
                        b = new bqm();
                    }
                }
            }
            return b;
        }
    }

    public long b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            return this.f16553a.getLong(str, j);
        } catch (Exception e) {
            ku0.j("Preferences.getLong", e);
            return j;
        }
    }

    public SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        return this.f16553a;
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        try {
            return this.f16553a.getString(str, str2);
        } catch (Exception e) {
            ku0.j("Preferences.getString", e);
            return str2;
        }
    }

    public void e(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ffffc8", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            this.f16553a.edit().putLong(str, j).commit();
        } catch (Exception e) {
            ku0.j("Preferences.putLong", e);
        }
    }

    public void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cfc422", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            this.f16553a.edit().putLong(str, j).apply();
        } catch (Exception e) {
            ku0.j("Preferences.putLongAsync", e);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
            return;
        }
        try {
            this.f16553a.edit().putString(str, str2).commit();
        } catch (Exception e) {
            ku0.j("Preferences.putString", e);
        }
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda9077", new Object[]{this, str, str2});
            return;
        }
        try {
            this.f16553a.edit().putString(str, str2).apply();
        } catch (Exception e) {
            ku0.j("Preferences.putStringAsync", e);
        }
    }
}
