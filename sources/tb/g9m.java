package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<Boolean> f19815a = new AtomicReference<>(null);

    static {
        t2o.a(677380287);
    }

    public static boolean a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b256ee65", new Object[]{context})).booleanValue();
        }
        if (!vcq.a(context).f().contains(acq.PLUGIN_NAME)) {
            return false;
        }
        AtomicReference<Boolean> atomicReference = f19815a;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("taobao_plugin", 0);
        SharedPreferences.Editor edit = context.getSharedPreferences("taobao_plugin", 0).edit();
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            str = "";
        }
        if (!str.equals(sharedPreferences.getString("plugin_version_name", ""))) {
            if (acq.G(context)) {
                edit.putString("plugin_version_name", str).putBoolean("plugin_first_load", false).apply();
            }
            sng.a(f19815a, null, Boolean.TRUE);
        } else {
            boolean z = sharedPreferences.getBoolean("plugin_first_load", true);
            if (z && acq.G(context)) {
                edit.putBoolean("plugin_first_load", false).apply();
            }
            sng.a(f19815a, null, Boolean.valueOf(z));
        }
        return f19815a.get().booleanValue();
    }
}
