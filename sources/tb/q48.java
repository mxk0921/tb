package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class q48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f26501a;
    public SharedPreferences b;
    public SharedPreferences c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final q48 f26502a = new q48();

        public static /* synthetic */ q48 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q48) ipChange.ipc$dispatch("e33f0f84", new Object[0]);
            }
            return f26502a;
        }
    }

    public static q48 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q48) ipChange.ipc$dispatch("5c76245f", new Object[0]);
        }
        return b.a();
    }

    public final void a() throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
        } else if (!this.d) {
            throw new IllegalArgumentException("DynamicFeatureManager is not inited");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a0ab74e", new Object[]{this});
            return;
        }
        a();
        this.b.edit().clear().commit();
    }

    public Set<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9c77b8ed", new Object[]{this, str});
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getStringSet("deploy_features_" + str, new HashSet());
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a67cc7", new Object[]{this, str});
        }
        a();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getString("deploy_version_" + str, "");
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        r48.h().i(context);
        this.f26501a = context;
        if (!this.d) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                this.b = this.f26501a.getSharedPreferences("dynamicdeploy_features", 0);
                Context context2 = this.f26501a;
                this.c = context2.getSharedPreferences("dynamicdeploy_features_bak-" + str, 0);
                if (!TextUtils.isEmpty(s11.f()) && context.getPackageName().equals(s11.f())) {
                    j(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.d = true;
        }
    }

    public boolean g(Application application) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10da341d", new Object[]{this, application})).booleanValue();
        }
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            str = "1.0.0";
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences.contains("deploy_version_" + str) || r48.h().c().size() <= 0) {
            return false;
        }
        return true;
    }

    public void h(String str, String str2, boolean z, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2f4601", new Object[]{this, str, str2, new Boolean(z), set});
            return;
        }
        a();
        SharedPreferences.Editor edit = this.b.edit();
        SharedPreferences.Editor putStringSet = edit.putStringSet("deploy_features_" + str, set);
        SharedPreferences.Editor putString = putStringSet.putString("deploy_version_" + str, str2);
        putString.putBoolean("deploy_beta_" + str, z).commit();
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281287bf", new Object[]{this, str, str2});
        } else {
            this.c.edit().putString(str, str2).commit();
        }
    }

    public final void j(String str) {
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

    public q48() {
    }
}
