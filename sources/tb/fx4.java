package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.AndroidInstantRuntime;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.android.alibaba.ip.server.Restarter;
import com.android.alibaba.ip.utils.RefectUtils;
import com.android.tools.ir.runtime.Dex2oatService;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fx4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Executor EXECUTOR = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    public final UncaughtCrashHeader f19593a;
    public final List<i> b;
    public final Lock c;
    public Application d;
    public SharedPreferences e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
                return;
            }
            ApplicationInfo applicationInfo = fx4.a(fx4.this) != null ? fx4.a(fx4.this).getApplicationInfo() : null;
            if (applicationInfo != null) {
                map.put("apksize", Long.valueOf(new File(s11.e).length()));
                map.put("nativepath_exist", applicationInfo.nativeLibraryDir + "_" + new File(applicationInfo.nativeLibraryDir).exists());
            }
            map.put("patchVersion", fx4.b(fx4.this).getString("instantpatch_effective_version", ""));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
            } else if (th != null && th.getStackTrace().length > 1) {
                if ((th instanceof NoSuchMethodException) || (th instanceof NoSuchFieldException) || (th instanceof NoSuchMethodError) || (th instanceof NoSuchFieldError)) {
                    String className = th.getStackTrace()[0].getClassName();
                    String className2 = th.getStackTrace()[1].getClassName();
                    if (className.endsWith("$ipReplace") || className.equals(AndroidInstantRuntime.class.getName()) || className2.endsWith("$ipReplace")) {
                        fx4.e(fx4.this);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(fx4 fx4Var) {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
            } else {
                map.put("update_progress", System.getProperty("update_patch", "no inited"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(fx4 fx4Var) {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
                return;
            }
            if (mcq.a() == null) {
                obj = "";
            } else {
                obj = mcq.a().a();
            }
            map.put("installed_features", obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(fx4 fx4Var) {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
                return;
            }
            try {
                map.put("dynamic_deploy_features", q48.e().c(s11.b));
                map.put("featureUpdateVersion", q48.e().d(s11.b));
                Set<String> c = r48.h().c();
                map.put("featureUpdateVersion2", c);
                for (String str : c) {
                    map.put("dynamic_deploy_features2_" + str, r48.h().e(str));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            try {
                fx4.f(fx4.this).lock();
                ArrayList arrayList = new ArrayList(fx4.g(fx4.this));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((i) arrayList.get(i)).a(thread, th, hashMap);
                }
                return hashMap;
            } finally {
                fx4.f(fx4.this).unlock();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface i {
        void a(Thread thread, Throwable th, Map<String, Object> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fx4 f19600a = new fx4(null);

        public static /* synthetic */ fx4 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fx4) ipChange.ipc$dispatch("8f72284", new Object[0]);
            }
            return f19600a;
        }
    }

    public /* synthetic */ fx4(a aVar) {
        this();
    }

    public static /* synthetic */ Application a(fx4 fx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("ce46a5b4", new Object[]{fx4Var});
        }
        return fx4Var.d;
    }

    public static /* synthetic */ SharedPreferences b(fx4 fx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("9a07cf58", new Object[]{fx4Var});
        }
        return fx4Var.e;
    }

    public static /* synthetic */ Pair c(fx4 fx4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("73456637", new Object[]{fx4Var, str});
        }
        return fx4Var.l(str);
    }

    public static /* synthetic */ List d(fx4 fx4Var, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("302fc133", new Object[]{fx4Var, activity});
        }
        return fx4Var.j(activity);
    }

    public static /* synthetic */ void e(fx4 fx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22657b61", new Object[]{fx4Var});
        } else {
            fx4Var.i();
        }
    }

    public static /* synthetic */ Lock f(fx4 fx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lock) ipChange.ipc$dispatch("485472a6", new Object[]{fx4Var});
        }
        return fx4Var.c;
    }

    public static /* synthetic */ List g(fx4 fx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c954b749", new Object[]{fx4Var});
        }
        return fx4Var.b;
    }

    public static fx4 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fx4) ipChange.ipc$dispatch("f898dcdf", new Object[0]);
        }
        return j.a();
    }

    public void h(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3969b9a9", new Object[]{this, iVar});
            return;
        }
        ((ReentrantLock) this.c).lock();
        ArrayList arrayList = new ArrayList(this.b);
        arrayList.add(iVar);
        ((ArrayList) this.b).clear();
        ((ArrayList) this.b).addAll(arrayList);
        ((ReentrantLock) this.c).unlock();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59017d50", new Object[]{this});
            return;
        }
        String string = PreferenceManager.getDefaultSharedPreferences(this.d).getString("instantpatch_effective_version", "");
        if (!PreferenceManager.getDefaultSharedPreferences(this.d).getString("instantpatch_invalid_version", "").equals(string)) {
            Log.e("CrashDataMonitor", "clear patchinfo " + string + "because patch proplem");
            InstantPatcher.create(this.d).purge();
            akv.getInstance(this.d).clearCache();
            PreferenceManager.getDefaultSharedPreferences(this.d).edit().putString("instantpatch_invalid_version", string).apply();
        }
    }

    public final List<Object> j(Activity activity) {
        ArrayList arrayList = new ArrayList();
        AssetManager assets = activity.getAssets();
        try {
            Field declaredField = AssetManager.class.getDeclaredField("mApkAssets");
            declaredField.setAccessible(true);
            Object[] objArr = (Object[]) declaredField.get(assets);
            if (objArr != null) {
                for (Object obj : objArr) {
                    arrayList.add(obj);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public Application k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.d;
    }

    public void n(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.d = application;
        this.e = PreferenceManager.getDefaultSharedPreferences(application);
        a aVar = new a();
        b bVar = new b();
        c cVar = new c(application);
        d dVar = new d();
        h(aVar);
        h(bVar);
        h(cVar);
        h(dVar);
        h(new e(this));
        h(new f(this));
        h(new g(this));
        o();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1551b71f", new Object[]{this});
            return;
        }
        TCrashSDK.instance().addJvmUncaughtCrashListener(new h());
        try {
            this.f19593a.addHeaderInfo("apksize", String.valueOf(new File(s11.e).length()));
            this.f19593a.addHeaderInfo("apk_channel", this.d.getResources().getString(this.d.getResources().getIdentifier("ttid", "string", this.d.getPackageName())));
            this.f19593a.addHeaderInfo("featureUpdateVersion", q48.e().d(s11.b));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    fx4.a(fx4.this).startService(new Intent(fx4.a(fx4.this), Dex2oatService.class));
                }
            }
        }

        public b() {
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i == 22 || i == 21) {
                try {
                    str = fx4.a(fx4.this).getPackageManager().getPackageInfo(fx4.a(fx4.this).getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    str = "";
                }
                if (th instanceof NoClassDefFoundError) {
                    SharedPreferences b = fx4.b(fx4.this);
                    boolean z = b.getBoolean("fixdex2oat_" + str, false);
                    map.put("fixed_oat", Boolean.valueOf(z));
                    Pair c = fx4.c(fx4.this, th.getMessage());
                    map.put("class_count", c.first);
                    map.put("class_exist", c.second);
                    if (((Integer) c.first).intValue() < 70000) {
                        Log.e("CrashDataMonitor", "classes count:" + c.first);
                        if (z) {
                            Log.e("CrashDataMonitor", "new oat File is generate but also crash so need reinstall");
                            SharedPreferences.Editor edit = fx4.b(fx4.this).edit();
                            edit.putBoolean("should_reinstall_" + str, true).apply();
                            s11.j(fx4.a(fx4.this));
                            return;
                        }
                        SharedPreferences.Editor edit2 = fx4.b(fx4.this).edit();
                        edit2.putBoolean("need_dex2oat_" + str, true).apply();
                        fx4.EXECUTOR.execute(new a());
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f19597a;

        public c(Application application) {
            this.f19597a = application;
        }

        @Override // tb.fx4.i
        public void a(Thread thread, Throwable th, Map<String, Object> map) {
            String str;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0adf78c", new Object[]{this, thread, th, map});
            } else if (th instanceof Resources.NotFoundException) {
                try {
                    str = fx4.a(fx4.this).getPackageManager().getPackageInfo(fx4.a(fx4.this).getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    str = "";
                }
                fx4.b(fx4.this).edit().putBoolean("should_checkRes_" + str, true).apply();
                if (c21.i() != null) {
                    map.put("top_act_AssetsManager", c21.i().getAssets() + " " + fx4.d(fx4.this, c21.i()));
                    map.put("top_act_name", c21.i().toString());
                }
                List<Activity> activities = Restarter.getActivities(this.f19597a, false);
                if (activities != null) {
                    for (Activity activity : activities) {
                        map.put("actAssets_" + i, activity.getAssets() + " " + fx4.d(fx4.this, activity));
                        StringBuilder sb = new StringBuilder("act_name_");
                        sb.append(i);
                        map.put(sb.toString(), activity.toString());
                        i++;
                    }
                }
            }
        }
    }

    public fx4() {
        this.f19593a = TCrashSDK.instance().getCrashCaughtHeader();
        this.b = new ArrayList();
        this.c = new ReentrantLock();
    }

    public final Pair<Integer, Boolean> l(String str) {
        Object fieldGet;
        Field field;
        Object[] objArr;
        int i2 = 0;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a319b22b", new Object[]{this, str});
        }
        Field field2 = RefectUtils.field(fx4.class.getClassLoader(), "pathList");
        String[] strArr = null;
        if (!(field2 == null || (fieldGet = RefectUtils.fieldGet(fx4.class.getClassLoader(), field2)) == null || (field = RefectUtils.field(fieldGet, "dexElements")) == null || (objArr = (Object[]) RefectUtils.fieldGet(fieldGet, field)) == null || objArr.length <= 0)) {
            for (Object obj : objArr) {
                DexFile dexFile = (DexFile) RefectUtils.fieldGet(obj, RefectUtils.field(obj, "dexFile"));
                if (dexFile.getName().toLowerCase().contains("taobao")) {
                    strArr = (String[]) RefectUtils.fieldGet(dexFile.entries(), RefectUtils.field(dexFile.entries(), "mNameList"));
                }
            }
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.equals(str2)) {
                    break;
                }
            }
        }
        z = false;
        if (strArr != null) {
            i2 = strArr.length;
        }
        return new Pair<>(Integer.valueOf(i2), Boolean.valueOf(z));
    }
}
