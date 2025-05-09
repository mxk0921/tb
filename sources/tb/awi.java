package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.alibaba.android.split.core.missingsplits.MissingSplitsActivity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class awi implements xvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wnc e = (wnc) d62.b(wnc.class, "MissingSplitsManagerImpl");

    /* renamed from: a  reason: collision with root package name */
    public final Context f16045a;
    public final Runtime b;
    public final wvi c;
    public final AtomicReference d;

    static {
        t2o.a(677380186);
        t2o.a(677380184);
    }

    public awi(Context context, Runtime runtime, wvi wviVar, AtomicReference atomicReference) {
        this.f16045a = context;
        this.b = runtime;
        this.c = wviVar;
        this.d = atomicReference;
    }

    @Override // tb.xvi
    public final boolean a() {
        boolean z;
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77a93d33", new Object[]{this})).booleanValue();
        }
        if (!c()) {
            if (this.c.d()) {
                this.c.b();
                this.b.exit(0);
            }
            return false;
        }
        Iterator it = f().iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.AppTask appTask = (ActivityManager.AppTask) it.next();
                if (appTask.getTaskInfo() != null) {
                    intent4 = appTask.getTaskInfo().baseIntent;
                    if (intent4 != null) {
                        intent5 = appTask.getTaskInfo().baseIntent;
                        if (intent5.getComponent() != null) {
                            intent6 = appTask.getTaskInfo().baseIntent;
                            if (MissingSplitsActivity.class.getName().equals(intent6.getComponent().getClassName())) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                Iterator it2 = f().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it2.next()).getTaskInfo();
                    if (taskInfo != null) {
                        intent = taskInfo.baseIntent;
                        if (intent != null) {
                            intent2 = taskInfo.baseIntent;
                            if (intent2.getComponent() != null) {
                                intent3 = taskInfo.baseIntent;
                                if (b(intent3.getComponent())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.c.a();
                for (ActivityManager.AppTask appTask2 : f()) {
                    appTask2.finishAndRemoveTask();
                }
                if (z) {
                    this.f16045a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f16045a, MissingSplitsActivity.class), 1, 1);
                    this.f16045a.startActivity(new Intent(this.f16045a, MissingSplitsActivity.class).addFlags(884998144));
                }
                this.b.exit(0);
            }
        }
        return true;
    }

    public final boolean b(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cc4013", new Object[]{this, componentName})).booleanValue();
        }
        String className = componentName.getClassName();
        try {
            Class<?> cls = Class.forName(className);
            while (cls != null) {
                if (cls.equals(Activity.class)) {
                    return true;
                }
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != cls) {
                    cls = superclass;
                } else {
                    cls = null;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            e.e("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            if (this.f16045a.getPackageManager().getActivityInfo(componentName, 0) != null) {
                return true;
            }
            return false;
        }
    }

    public final boolean c() {
        boolean booleanValue;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86e9ab9f", new Object[]{this})).booleanValue();
        }
        synchronized (this.d) {
            try {
                if (((Boolean) this.d.get()) == null) {
                    AtomicReference atomicReference = this.d;
                    if (d()) {
                        Set e2 = e();
                        if (!e2.isEmpty()) {
                            if (e2.size() == 1 && e2.contains("")) {
                            }
                        }
                        z = true;
                    }
                    atomicReference.set(Boolean.valueOf(z));
                }
                booleanValue = ((Boolean) this.d.get()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7db4cda", new Object[]{this})).booleanValue();
        }
        try {
            Bundle bundle = this.f16045a.getPackageManager().getApplicationInfo(this.f16045a.getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            if (Boolean.TRUE.equals(bundle.get("com.android.vending.splits.required"))) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            e.e("App '%s' is not found in the PackageManager", this.f16045a.getPackageName());
            return false;
        }
    }

    public final Set e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("db65dd04", new Object[]{this});
        }
        try {
            PackageInfo packageInfo = this.f16045a.getPackageManager().getPackageInfo(this.f16045a.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            String[] strArr = packageInfo.splitNames;
            if (strArr != null) {
                Collections.addAll(hashSet, strArr);
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException unused) {
            e.e("App '%s' is not found in PackageManager", this.f16045a.getPackageName());
            return Collections.emptySet();
        }
    }

    public final List f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ab585c92", new Object[]{this});
        }
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f16045a.getSystemService("activity")).getAppTasks();
        if (appTasks != null) {
            return appTasks;
        }
        return Collections.emptyList();
    }
}
