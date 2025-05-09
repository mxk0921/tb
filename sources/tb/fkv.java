package tb;

import android.preference.PreferenceManager;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureDynamicJSBridge;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<vjv> f19374a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ df4 val$config;

        public a(df4 df4Var) {
            this.val$config = df4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Log.e("UpdateSDK", "init initcpuArch");
            fkv.access$000(fkv.this, this.val$config);
            tg4.getInstance().init(this.val$config);
            FeatureDynamicJSBridge.init();
            Log.e("UpdateSDK", "init initcpuArch done");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ djv val$updateBuilder;

        public b(djv djvVar) {
            this.val$updateBuilder = djvVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (vjv vjvVar : fkv.access$100(fkv.this)) {
                try {
                    Log.e("UpdateSDK", "init updater:" + vjvVar.getClass().getName());
                    vjvVar.init(this.val$updateBuilder.config.application);
                    Log.e("UpdateSDK", "init updater done:" + vjvVar.getClass().getName());
                } catch (Exception e) {
                    Log.e("UpdateSDK", "init updater Exception:".concat(vjvVar.getClass().getName()));
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (vjv vjvVar : fkv.access$100(fkv.this)) {
                vjvVar.onForeground();
            }
        }
    }

    static {
        t2o.a(954204169);
    }

    public fkv(djv djvVar) {
        ArrayList arrayList = new ArrayList();
        this.f19374a = arrayList;
        phe pheVar = new phe();
        df4 df4Var = djvVar.config;
        if (df4Var != null) {
            if (!kjv.inited) {
                kjv.getInstance().init(df4Var.application, df4Var.group, df4Var.ttid, df4Var.isOutApk, new bjv());
                arrayList.add(new jt6(df4Var));
            }
            arrayList.add(new xx3());
            InstantPatchUpdater.instance().setStartFromBackground(!df4Var.autoStart);
            kjv.getInstance().registerListener(gjv.HOTPATCH, InstantPatchUpdater.instance());
            arrayList.add(InstantPatchUpdater.instance());
            kjv.getInstance().registerListener(gjv.CPPINLINEPATCH, yq2.instance());
            arrayList.add(yq2.instance());
            arrayList.add(com.taobao.update.dynamicfeature.a.instance());
            if (djvVar.apkUpdateEnabled) {
                arrayList.add(new r11());
            }
            pheVar.addTask("initcpuArch", pheVar.getTasks().createTask(new a(df4Var), TimeUnit.SECONDS, 1L));
            pheVar.addTask("initTask", pheVar.getTasks().createTask(new b(djvVar)));
            pheVar.idleRun();
        }
    }

    public static /* synthetic */ void access$000(fkv fkvVar, df4 df4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5a3f26", new Object[]{fkvVar, df4Var});
        } else {
            fkvVar.a(df4Var);
        }
    }

    public static /* synthetic */ List access$100(fkv fkvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2345001c", new Object[]{fkvVar});
        }
        return fkvVar.f19374a;
    }

    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f19374a).iterator();
        while (it.hasNext()) {
            ((vjv) it.next()).onBackground();
        }
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f19374a).iterator();
        while (it.hasNext()) {
            ((vjv) it.next()).onExit();
        }
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        } else {
            UpdateRuntime.execute(new c());
        }
    }

    public final void a(df4 df4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd817fa9", new Object[]{this, df4Var});
            return;
        }
        int currentRuntimeCpuArchValue = lw4.getCurrentRuntimeCpuArchValue(df4Var.application);
        String versionName = nkv.getVersionName();
        if (PreferenceManager.getDefaultSharedPreferences(df4Var.application).getInt(versionName.concat("_bit_runtime"), 0) == 0) {
            AppMonitor.Counter.commit("update-sdk", "bit-runtime", currentRuntimeCpuArchValue);
            PreferenceManager.getDefaultSharedPreferences(df4Var.application).edit().putInt(versionName.concat("_bit_runtime"), currentRuntimeCpuArchValue).apply();
        }
    }

    public void init(djv djvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95c764b", new Object[]{this, djvVar});
            return;
        }
        try {
            if (djvVar.checkUpdateOnStartUp) {
                kjv.getInstance().startUpdate(true, false);
            }
            new lkv().initSwitchConfig(djvVar.config);
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("mtb_plugin", "true");
            df4.blackDialogActivity.addAll(djvVar.config.application.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).getStringSet(gjv.BLACK_POP_ACTIVITIES, new HashSet()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
