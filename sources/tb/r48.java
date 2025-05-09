package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f27093a;
    public SharedPreferences b;
    public SharedPreferences c;
    public boolean d;
    public String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final r48 f27094a = new r48();

        public static /* synthetic */ r48 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r48) ipChange.ipc$dispatch("84a2e020", new Object[0]);
            }
            return f27094a;
        }
    }

    public static r48 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r48) ipChange.ipc$dispatch("324e66a5", new Object[0]);
        }
        return b.a();
    }

    public final void a() throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
        } else if (!this.d) {
            throw new IllegalArgumentException("DynamicFeatureManager2 is not inited");
        }
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8419e998", new Object[]{this, str});
            return;
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences.contains("deployed_" + str)) {
            SharedPreferences.Editor edit = this.b.edit();
            SharedPreferences sharedPreferences2 = this.b;
            Set<String> stringSet = sharedPreferences2.getStringSet("features_" + str, new HashSet());
            Set<String> stringSet2 = this.b.getStringSet("deploy_features", new HashSet());
            for (String str2 : stringSet) {
                edit.remove(str2);
            }
            stringSet2.removeAll(stringSet);
            SharedPreferences.Editor putStringSet = edit.putBoolean("deployed_" + str, false).putStringSet("deploy_features", stringSet2);
            SharedPreferences.Editor remove = putStringSet.remove("features_" + str);
            remove.putBoolean("bata_" + str, false).commit();
        }
    }

    public Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c02b7bce", new Object[]{this});
        }
        a();
        return this.b.getStringSet("deploy_versions", new HashSet());
    }

    public Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5325fda3", new Object[]{this});
        }
        a();
        return this.b.getStringSet("deploy_features", new HashSet());
    }

    public Set<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9c77b8ed", new Object[]{this, str});
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        if (!sharedPreferences.contains("deployed_" + str) || !j(str)) {
            return new HashSet();
        }
        SharedPreferences sharedPreferences2 = this.b;
        return sharedPreferences2.getStringSet("features_" + str, new HashSet());
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d104c953", new Object[]{this, str, str2});
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getString("deploy_feature_version_" + str + "_" + str2, "");
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d710e22f", new Object[]{this, str});
        }
        a();
        String string = this.b.getString(str, "");
        if (TextUtils.isEmpty(string) || !this.b.getStringSet("deploy_versions", new HashSet()).contains(string)) {
            return "";
        }
        return string;
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else if (!this.d) {
            this.f27093a = context;
            try {
                this.e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                Context context2 = this.f27093a;
                this.b = context2.getSharedPreferences("dynamicdeploy_features_" + this.e, 0);
                Context context3 = this.f27093a;
                this.c = context3.getSharedPreferences("dynamicdeploy_features_bak-" + this.e, 0);
                if (!TextUtils.isEmpty(s11.f()) && context.getPackageName().equals(s11.f())) {
                    n(this.e);
                }
                this.d = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4d15a5", new Object[]{this, str})).booleanValue();
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getBoolean("deployed_" + str, false);
    }

    public boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6c6204", new Object[]{this, str})).booleanValue();
        }
        a();
        return d().contains(str);
    }

    public synchronized void l(String str, String str2, boolean z, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2f4601", new Object[]{this, str, str2, new Boolean(z), set});
            return;
        }
        a();
        if (str.equals(this.e)) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(set);
            hashSet.addAll(this.b.getStringSet("deploy_features", new HashSet()));
            HashSet hashSet2 = new HashSet();
            hashSet2.addAll(this.b.getStringSet("deploy_versions", new HashSet()));
            hashSet2.add(str2);
            SharedPreferences.Editor edit = this.b.edit();
            for (String str3 : set) {
                if (this.b.contains(str3)) {
                    String string = this.b.getString(str3, "");
                    b(string);
                    hashSet2.remove(string);
                }
                edit.putString(str3, str2);
            }
            SharedPreferences.Editor putStringSet = edit.putBoolean("deployed_" + str2, true).putStringSet("deploy_features", hashSet).putStringSet("deploy_versions", hashSet2);
            SharedPreferences.Editor putStringSet2 = putStringSet.putStringSet("features_" + str2, set);
            putStringSet2.putBoolean("beta_" + str2, z).commit();
        }
    }

    public void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281287bf", new Object[]{this, str, str2});
            return;
        }
        a();
        this.c.edit().putString(str, str2).commit();
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6be34e", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ?> entry : this.c.getAll().entrySet()) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString("deploy_feature_version_" + str + "_" + entry.getKey(), (String) entry.getValue()).commit();
        }
        this.c.edit().clear().commit();
    }

    public r48() {
        this.e = null;
    }
}
