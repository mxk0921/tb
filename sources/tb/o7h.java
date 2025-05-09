package tb;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o7h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f25187a;
    public String b;
    public final SparseBooleanArray c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o7h f25188a = new o7h();

        static {
            t2o.a(654311448);
        }

        public static /* synthetic */ o7h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o7h) ipChange.ipc$dispatch("55f66af6", new Object[0]);
            }
            return f25188a;
        }
    }

    static {
        t2o.a(654311446);
    }

    public static o7h b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7h) ipChange.ipc$dispatch("f7e90011", new Object[0]);
        }
        return b.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694f2279", new Object[]{this, str});
        } else {
            this.f25187a.edit().putString(str, "").apply();
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae458e69", new Object[]{this});
        }
        return this.f25187a.getString("remote_clean_data_ids", "");
    }

    public SparseBooleanArray e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseBooleanArray) ipChange.ipc$dispatch("d2341c2e", new Object[]{this});
        }
        return this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("401c4cdb", new Object[]{this});
        }
        return this.f25187a.getString("remote_clean_version", "");
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        try {
            this.b = d.d.getPackageManager().getPackageInfo(d.d.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return this.b;
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ae2c27f", new Object[]{this, str});
        }
        return this.f25187a.getString(str, "");
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dc0ec", new Object[]{this, str});
        } else {
            this.f25187a.edit().putString("remote_clean_version", str).apply();
        }
    }

    public void k(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b172161f", new Object[]{this, bool});
        } else {
            this.f25187a.edit().putBoolean("safe_clean_enabled", bool.booleanValue()).apply();
        }
    }

    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aec7f46", new Object[]{this, str, str2});
        } else {
            this.f25187a.edit().putString(str, str2).apply();
        }
    }

    public final String m() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d427cb2", new Object[]{this});
        }
        SparseBooleanArray clone = this.c.clone();
        StringBuilder sb = new StringBuilder();
        while (i < clone.size()) {
            sb.append(clone.keyAt(i));
            i++;
            if (i < clone.size()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public o7h() {
        this.f25187a = null;
        this.b = "";
        this.c = new SparseBooleanArray();
        String g = g();
        this.f25187a = d.d.getSharedPreferences("simple_clean_" + g, 0);
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            for (String str : Arrays.asList(d.split(","))) {
                this.c.put(Integer.parseInt(str), true);
            }
        }
    }

    public Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("68d7a45f", new Object[]{this});
        }
        return Boolean.valueOf(this.f25187a.getBoolean("safe_clean_enabled", true));
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88d90ae4", new Object[]{this, new Integer(i)});
        } else if (!this.c.get(i)) {
            this.c.put(i, true);
            this.f25187a.edit().putString("remote_clean_data_ids", m()).apply();
        }
    }
}
