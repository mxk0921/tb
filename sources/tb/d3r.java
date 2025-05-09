package tb;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d3r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static d3r b;

    /* renamed from: a  reason: collision with root package name */
    public final String f17555a;

    static {
        t2o.a(961544382);
    }

    public d3r() {
        String str;
        try {
            str = n.j().b().getPackageManager().getPackageInfo(n.j().b().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            ogh.l("SystemInformation", "System information constructed with a context that apparently doesn't exist.");
            str = null;
        }
        this.f17555a = str;
    }

    public static d3r c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3r) ipChange.ipc$dispatch("737c602e", new Object[0]);
        }
        if (b == null) {
            synchronized (d3r.class) {
                try {
                    if (b == null) {
                        b = new d3r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[]{this});
        }
        return this.f17555a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        SharedPreferences sharedPreferences = n.j().b().getSharedPreferences("ut_setting", 4);
        if (sharedPreferences != null) {
            return sharedPreferences.getString("channel", null);
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return UTDevice.getUtdid(n.j().b());
    }
}
