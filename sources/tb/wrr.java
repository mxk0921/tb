package tb;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.TBPEngineNative;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import com.taobao.android.tbuprofen.mock.ARTUtil;
import com.taobao.android.tbuprofen.mock.JDWPMockUtils;
import com.taobao.android.tbuprofen.mock.RuntimeMockUtils;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f30878a;
    public final Context b;
    public final rrr c;
    public TBPEngineNative d;
    public osd e;
    public bad f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final wrr f30879a;

        static {
            t2o.a(822083593);
        }

        public b(Context context, boolean z) {
            wrr wrrVar = new wrr(context);
            this.f30879a = wrrVar;
            wrr.a(wrrVar).f27572a = z;
        }

        public wrr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wrr) ipChange.ipc$dispatch("ac67b722", new Object[]{this});
            }
            return this.f30879a;
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("50a24f3e", new Object[]{this, new Boolean(z)});
            }
            wrr.a(this.f30879a).h = z;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7bc1bbf", new Object[]{this, new Boolean(z)});
            }
            wrr.a(this.f30879a).f = z;
            return this;
        }

        public b d(TBPLogLevel tBPLogLevel, TBPLogLevel tBPLogLevel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d461d41", new Object[]{this, tBPLogLevel, tBPLogLevel2});
            }
            wrr.a(this.f30879a).c = tBPLogLevel;
            wrr.a(this.f30879a).b = tBPLogLevel2;
            return this;
        }

        public b e(osd osdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5a6c4422", new Object[]{this, osdVar});
            }
            wrr.a(this.f30879a).d = osdVar;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a2aecbf1", new Object[]{this, new Boolean(z)});
            }
            wrr.a(this.f30879a).getClass();
            return this;
        }
    }

    static {
        t2o.a(822083591);
    }

    public static /* synthetic */ rrr a(wrr wrrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrr) ipChange.ipc$dispatch("4ae3799d", new Object[]{wrrVar});
        }
        return wrrVar.c;
    }

    public static b c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("76a9b264", new Object[]{context, new Boolean(z)});
        }
        return new b(context, z);
    }

    public final boolean b(Context context) {
        File b2 = trr.b(context);
        if (b2 == null || !b2.exists()) {
            this.e.b(osd.ERR_MISS_AGENT_SO, "");
            urr.b("TBPManager", "Can't find the agent so.", new Object[0]);
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            urr.d("TBPManager", "attachTBPAgent....", new Object[0]);
            try {
                if (!d()) {
                    return false;
                }
                Debug.attachJvmtiAgent(b2.getAbsolutePath(), null, context.getClassLoader());
            } catch (IOException e) {
                osd osdVar = this.e;
                osdVar.b(osd.ERR_ATTACH_AGNET_EXCEPTION, "IOException: " + e.getMessage());
                e.printStackTrace();
                urr.c("TBPManager", e, "Failed to attachTBPAgent", new Object[0]);
                return false;
            } catch (SecurityException e2) {
                osd osdVar2 = this.e;
                osdVar2.b(osd.ERR_ATTACH_AGNET_EXCEPTION, "SecurityException: " + e2.getMessage());
                e2.printStackTrace();
                urr.c("TBPManager", e2, "Failed to attachTBPAgent", new Object[0]);
                return false;
            }
        } else if (i >= 26) {
            urr.d("TBPManager", "Reflect attachTBPAgent....", new Object[0]);
            try {
                Method method = Class.forName("dalvik.system.VMDebug").getMethod("attachAgent", String.class);
                method.setAccessible(true);
                if (!d()) {
                    return false;
                }
                method.invoke(null, b2.getAbsolutePath());
            } catch (Exception e3) {
                this.e.b(osd.ERR_ATTACH_AGNET_EXCEPTION, asr.c(e3));
                urr.c("TBPManager", e3, "Failed to reflect attachTBPAgent", new Object[0]);
                return false;
            }
        }
        urr.d("TBPManager", "attachTBPAgent Successfully!", new Object[0]);
        return true;
    }

    public final TBPEngineNative e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPEngineNative) ipChange.ipc$dispatch("468953fe", new Object[]{this});
        }
        try {
            urr.d("TBPManager", "Init TBP engine!", new Object[0]);
            TBPEngineNative tBPEngineNative = new TBPEngineNative();
            if (tBPEngineNative.a(this.c)) {
                return tBPEngineNative;
            }
            return null;
        } catch (Exception e) {
            urr.b("TBPManager", "initEngine", e);
            return null;
        }
    }

    public synchronized boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        try {
            if (!asr.e()) {
                return false;
            }
            if (!this.c.f27572a) {
                Log.e("TBPManager", "TBP is disable by launchConfig");
                return false;
            } else if (this.f30878a.get() == 2) {
                return true;
            } else {
                this.f30878a.set(1);
                osd osdVar = this.c.d;
                if (osdVar == null) {
                    this.e = new v67();
                } else {
                    this.e = osdVar;
                }
                this.e.a();
                TBPEngineNative g = g();
                this.d = g;
                if (g == null) {
                    this.f30878a.set(3);
                    return false;
                }
                this.f30878a.set(2);
                this.e.f();
                return true;
            }
        } catch (Exception e) {
            this.e.b(osd.ERR_INIT_EXCEPTION, asr.c(e));
            urr.c("TBPManager", e, "Failed to attachAgent", new Object[0]);
            return false;
        }
    }

    public final TBPEngineNative g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPEngineNative) ipChange.ipc$dispatch("dc1890d4", new Object[]{this});
        }
        boolean d = asr.d(this.b);
        urr.d("TBPManager", "Load Engine..... Debuggable: %b, SDKVer: %d", Boolean.valueOf(d), Integer.valueOf(Build.VERSION.SDK_INT));
        try {
            if (this.c.f && asr.f(this.b)) {
                this.e.b(osd.ERR_VIRTUAL, "");
                urr.g("TBPManager", "Is On Virtual Env", new Object[0]);
                return null;
            } else if (!d && !i(this.b)) {
                if (!d && this.c.g) {
                    k();
                }
                return null;
            } else if (!b(this.b)) {
                if (!d && this.c.g) {
                    k();
                }
                return null;
            } else {
                TBPEngineNative e = e();
                if (!d && this.c.g) {
                    k();
                }
                return e;
            }
        } finally {
            if (!d && this.c.g) {
                k();
            }
        }
    }

    public synchronized boolean j(TBPEvent tBPEvent, boolean z) {
        boolean z2 = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95d1e285", new Object[]{this, tBPEvent, new Boolean(z)})).booleanValue();
            }
            TBPEngineNative tBPEngineNative = this.d;
            if (tBPEngineNative == null) {
                return false;
            }
            if (tBPEngineNative.monitorEventNative(tBPEvent.getIndex(), z) != 0) {
                z2 = false;
            }
            return z2;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4911ddb", new Object[]{this});
            return;
        }
        JDWPMockUtils.d();
        RuntimeMockUtils.e();
    }

    public wrr(Context context) {
        this.f30878a = new AtomicInteger(0);
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        if (applicationContext == null) {
            this.b = context;
        }
        this.d = null;
        this.c = new rrr();
        this.f = null;
    }

    public final boolean d() {
        int c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c9bca5b", new Object[]{this})).booleanValue();
        }
        if (this.c.h) {
            if (!ARTUtil.d()) {
                urr.b("TBPManager", "ARTUtil have not init.", new Object[0]);
                return false;
            }
            int i = 3;
            do {
                c = ARTUtil.c();
                if (c == 0) {
                    break;
                }
                i--;
                try {
                    Thread.sleep(50L);
                    continue;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    continue;
                }
            } while (i > 0);
            if (c != 0) {
                urr.b("TBPManager", "mutator_lock_ is shared held, do not attachTBPAgent..", new Object[0]);
                this.e.b(osd.ERR_MUTATOR_HELD, String.valueOf(c));
                return false;
            }
        }
        return true;
    }

    public final boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7dbdd5", new Object[]{this, context})).booleanValue();
        }
        urr.d("TBPManager", "mockNoneDebuggable", new Object[0]);
        try {
            String loadLibrary = zrr.c().loadLibrary("tbuprofen-util");
            if (!TextUtils.isEmpty(loadLibrary)) {
                this.e.b(osd.ERR_SYS_LOAD_MOCK_EXCEPTION, loadLibrary);
                urr.b("TBPManager", "Failed to load tbuprofen-util. %s", loadLibrary);
                return false;
            }
            int b2 = RuntimeMockUtils.b(context, this.c.b, this.e);
            if (b2 != 0) {
                this.e.b(osd.ERR_RUNTIME_MOCK_INIT, String.valueOf(b2));
                urr.b("TBPManager", "Failed to init RuntimeMockUtils!", new Object[0]);
                return false;
            } else if (!JDWPMockUtils.c(this.e)) {
                urr.b("TBPManager", "Failed to mock jdwp!", new Object[0]);
                return false;
            } else if (Build.VERSION.SDK_INT < 28 || this.c.e == 805372417) {
                return RuntimeMockUtils.d();
            } else {
                return true;
            }
        } catch (Throwable th) {
            this.e.b(osd.ERR_SYS_LOAD_MOCK_EXCEPTION, asr.c(th));
            urr.c("TBPManager", th, "Couldn't load tbuprofen-util Library.", new Object[0]);
            return false;
        }
    }

    public synchronized boolean h(bad badVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d46e9bb0", new Object[]{this, badVar})).booleanValue();
        }
        if (!(badVar == null || this.d == null)) {
            bad badVar2 = this.f;
            if (badVar2 != null) {
                urr.g("TBPManager", "The plugin %s had loaded!", ((DefaultPlugin) badVar2).d());
                return false;
            }
            this.f = badVar;
            String d = ((DefaultPlugin) badVar).d();
            this.e.c(d);
            String b2 = zrr.c().b(d);
            if (TextUtils.isEmpty(b2)) {
                String str = "Can't find plugin " + d + ". RemoteSo:" + zrr.c().a();
                this.e.d(d, osd.ERR_LOAD_PLUGIN_EXCEPTION, str);
                urr.b("TBPManager", "loadPlugin %s error. %s", d, str);
                return false;
            }
            int loadPluginNative = this.d.loadPluginNative(b2, ((DefaultPlugin) badVar).c());
            if (loadPluginNative == 0) {
                try {
                    String loadLibrary = zrr.c().loadLibrary(d);
                    if (!TextUtils.isEmpty(loadLibrary)) {
                        this.e.b(osd.ERR_LOAD_PLUGIN_EXCEPTION, loadLibrary);
                        urr.b("TBPManager", "loadPlugin % error. %s", d, loadLibrary);
                        return false;
                    }
                    this.e.e(d);
                    return true;
                } catch (Exception e) {
                    this.e.d(d, osd.ERR_LOAD_PLUGIN_EXCEPTION, asr.c(e));
                    urr.c("TBPManager", e, "loadPlugin %s", d);
                }
            } else {
                this.e.d(d, osd.ERR_LOAD_PLUGIN_ERROR, String.valueOf(loadPluginNative));
            }
            return false;
        }
        return false;
    }
}
