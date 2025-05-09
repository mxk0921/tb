package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.monitor.UpdateMonitorImpl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ckv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fkv f17120a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                ckv.this.onBackground();
            } else if (i == 2) {
                ckv.this.onForeground();
            } else if (i == 50) {
                ckv.this.onExit();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ckv f17121a = new ckv();

        static {
            t2o.a(956301317);
        }

        public static /* synthetic */ ckv access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckv) ipChange.ipc$dispatch("883fa357", new Object[0]);
            }
            return f17121a;
        }
    }

    static {
        t2o.a(956301315);
    }

    public static ckv getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ckv) ipChange.ipc$dispatch("ac6cc8f2", new Object[0]);
        }
        return b.access$000();
    }

    public final df4 a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (df4) ipChange.ipc$dispatch("f7b1491a", new Object[]{this, map});
        }
        String appDispName = m51.getAppDispName();
        df4 df4Var = new df4(Globals.getApplication());
        String ttid = TaoPackageInfo.getTTID();
        df4Var.ttid = ttid;
        df4Var.group = m51.getGroup(ttid);
        df4Var.appName = appDispName;
        df4Var.enableNavProcessor = true;
        df4Var.logoResourceId = Globals.getApplication().getApplicationInfo().icon;
        df4Var.popDialogBeforeInstall = true;
        df4Var.threadExecutorImpl = new aqt();
        df4Var.logImpl = new ayt();
        df4Var.autoStart = !TextUtils.equals(map.get("bootstrapMode"), "1");
        return df4Var;
    }

    public void init(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e11072", new Object[]{this, str, hashMap});
            return;
        }
        if (this.b) {
            Log.e("UpdateManager", "UpdateManager has inited");
        }
        long currentTimeMillis = System.currentTimeMillis();
        UpdateRuntime.processName = str;
        nkv.sCurrentProcessName = str;
        if (!new tpo().initSafemode()) {
            df4 a2 = a(hashMap);
            UpdateRuntime.init(Globals.getApplication(), a2.ttid, a2.appName, a2.group);
            Log.e("UpdateManager", String.format("initUpdateRuntime cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            djv enableMonitor = new djv(a2).enableApkUpdate().enableMonitor(new UpdateMonitorImpl());
            if (a2.autoStart) {
                enableMonitor = enableMonitor.enableCheckUpdateOnStartup();
            }
            fkv fkvVar = new fkv(enableMonitor);
            this.f17120a = fkvVar;
            fkvVar.init(enableMonitor);
            this.b = true;
            c21.c(new a());
            Log.e("UpdateManager", String.format("initUpdate cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        }
    }

    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        fkv fkvVar = this.f17120a;
        if (fkvVar != null) {
            fkvVar.onBackground();
        }
    }

    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        fkv fkvVar = this.f17120a;
        if (fkvVar != null) {
            fkvVar.onExit();
        }
    }

    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        fkv fkvVar = this.f17120a;
        if (fkvVar != null) {
            fkvVar.onForeground();
        }
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else {
            init(str, new HashMap<>());
        }
    }
}
