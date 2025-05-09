package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bmp implements wnq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APP_VERSION = "appVersion";
    public static final String KEY_NEW_DISCOVERY_ORANGE = "newDiscovery";
    public static final String KEY_ORANGE = "orange";
    public static final String KEY_SIMPLE_SWITCH_ORANGE = "simpleOrange";

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16483a;
    public final SharedPreferences b;

    public bmp(Context context) {
        this.b = context.getSharedPreferences("kv_rvision_switch", 0);
        this.f16483a = context.getSharedPreferences("rvision_switch", 0);
    }

    @Override // tb.wnq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d328eb83", new Object[]{this});
            return;
        }
        Set<String> keySet = this.b.getAll().keySet();
        SharedPreferences.Editor edit = this.b.edit();
        for (String str : keySet) {
            if (!TextUtils.equals("elderHome", str) && !TextUtils.equals(LocationCallBack.ORIGIN_ELDER_HOME, str)) {
                edit.remove(str);
            }
        }
        edit.commit();
    }

    @Override // tb.wnq
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660aaede", new Object[]{this, str})).booleanValue();
        }
        this.f16483a.edit().putString("dosa_overseas", str).commit();
        return true;
    }

    @Override // tb.wnq
    public xs7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("a75d384b", new Object[]{this});
        }
        return dsl.c(this.f16483a.getString("dosa", null), true);
    }

    @Override // tb.wnq
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("237b57af", new Object[]{this, str});
        }
        return this.f16483a.getString(str, null);
    }

    @Override // tb.wnq
    public List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1fcef320", new Object[]{this});
        }
        return dsl.f(this.f16483a.getString("windvane", null));
    }

    @Override // tb.wnq
    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f4ed1f", new Object[]{this, str})).booleanValue();
        }
        this.f16483a.edit().putString("dosa", str).commit();
        return true;
    }

    @Override // tb.wnq
    public zzq g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzq) ipChange.ipc$dispatch("211eb943", new Object[]{this, str});
        }
        zzq d = dsl.d(this.f16483a.getString(str, null));
        if (d == null) {
            return zzq.DefaultOrangeAllOpenSwitch;
        }
        return d;
    }

    @Override // tb.wnq
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25197e99", new Object[]{this, str, str2});
        } else {
            this.b.edit().putString(str, str2).commit();
        }
    }

    @Override // tb.wnq
    public Map<String, ?> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a9b9338", new Object[]{this});
        }
        return this.b.getAll();
    }

    @Override // tb.wnq
    public xs7 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("7bd9a743", new Object[]{this});
        }
        return dsl.c(this.f16483a.getString("dosa_overseas", null), false);
    }

    @Override // tb.wnq
    public boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf2283e", new Object[]{this, str, str2})).booleanValue();
        }
        this.f16483a.edit().putString(str, str2).commit();
        return true;
    }

    @Override // tb.wnq
    public String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8180e136", new Object[]{this, str});
        }
        return this.b.getString(str, null);
    }

    public String n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return this.f16483a.getString(str, str2);
    }

    public boolean o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb567a1f", new Object[]{this, str, str2})).booleanValue();
        }
        SharedPreferences.Editor edit = this.f16483a.edit();
        edit.putString(str, str2);
        edit.commit();
        return true;
    }

    @Override // tb.wnq
    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c590e34d", new Object[]{this, str})).booleanValue();
        }
        this.f16483a.edit().putString("windvane", str).commit();
        return true;
    }
}
