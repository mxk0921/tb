package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wnc c = (wnc) d62.b(wnc.class, "SplitInstallService");

    /* renamed from: a  reason: collision with root package name */
    public final Context f30958a;
    public final PackageManager b;

    static {
        t2o.a(677380182);
    }

    public wvi(Context context, PackageManager packageManager) {
        this.f30958a = context;
        this.b = packageManager;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecba6b1", new Object[]{this});
            return;
        }
        c.a("Disabling all non-activity components", new Object[0]);
        e(c(), 2);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f03876", new Object[]{this});
            return;
        }
        c.a("Resetting enabled state of all non-activity components", new Object[0]);
        e(c(), 0);
    }

    public final List c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e520dbf9", new Object[]{this});
        }
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.b.getPackageInfo(this.f30958a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            c.e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0f2602", new Object[]{this})).booleanValue();
        }
        for (ComponentInfo componentInfo : c()) {
            if (this.b.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                c.b("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        c.b("All non-activity components are disabled", new Object[0]);
        return true;
    }

    public final void e(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3560fcaa", new Object[]{this, list, new Integer(i)});
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            this.b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }
}
