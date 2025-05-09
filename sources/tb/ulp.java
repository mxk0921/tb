package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ulp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ulp b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f29475a;

    public static ulp c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ulp) ipChange.ipc$dispatch("40c297f0", new Object[]{context});
        }
        if (context != null) {
            if (b == null) {
                synchronized (ulp.class) {
                    try {
                        if (b != null) {
                            return b;
                        }
                        b = new ulp();
                        b.f29475a = gmp.c(context.getApplicationContext(), context.getPackageName() + "_mytaobao_preferences");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return b;
        }
        throw new IllegalArgumentException("context cannot be null!");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f29475a;
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        return false;
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f29475a;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(str, z);
        }
        return z;
    }

    public int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        SharedPreferences sharedPreferences = this.f29475a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, i);
        }
        return i;
    }

    public SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("ffdc17dd", new Object[]{this});
        }
        return this.f29475a;
    }

    public boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932aec2e", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f29475a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        return edit.commit();
    }
}
