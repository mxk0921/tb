package com.taobao.android.tbuprofen.plugin;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.mock.ARTUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bad;
import tb.drx;
import tb.n8m;
import tb.t2o;
import tb.urr;
import tb.wrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DefaultPlugin implements bad {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_LIB_NAME = "tbuprofen-plugin";
    public static final int TBP_VERBOSE_CLASS = 2;
    public static final int TBP_VERBOSE_GC = 1;
    public static final int TBP_VERBOSE_JNI = 4;
    public static final int TBP_VERBOSE_OTHER = 0;

    /* renamed from: a  reason: collision with root package name */
    public PluginEventHandler f9628a;
    public final wrr b;
    public final String c;
    public boolean d = false;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity;

        static {
            int[] iArr = new int[PluginCapacity.values().length];
            $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity = iArr;
            try {
                iArr[PluginCapacity.FUN_BIG_ALLOC_MONITOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_GC_MONITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_MAIN_LOCK_MONITOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_CAUGHT_EXCEPTION_MONITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_CLASS_PREPARED_MONITOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_SIGQUIT_DUMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_DUMP_HEAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[PluginCapacity.FUNC_THREAD_MONITOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        t2o.a(824180795);
        t2o.a(822083588);
    }

    public DefaultPlugin(wrr wrrVar, String str) {
        this.b = wrrVar;
        this.c = str;
    }

    private native int forkDumpHeapInstanceNative(String str, long j, long j2, int i, String str2, int i2, int i3, long j3);

    private native int forkDumpHeapReferenceNative(String str, String str2, int i, int i2, long j);

    private native int setCallback(PluginEventHandler pluginEventHandler);

    public native void GC();

    public int a(String str, long j, long j2, int i, String str2, int i2, int i3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57225092", new Object[]{this, str, new Long(j), new Long(j2), new Integer(i), str2, new Integer(i2), new Integer(i3), new Long(j3)})).intValue();
        }
        if (!this.d) {
            urr.a("DefaultPlugin", "DumpInstanceInfo is disable!", new Object[0]);
            return 201;
        } else if (!this.e.compareAndSet(false, true)) {
            urr.a("DefaultPlugin", "Current in dump process!", new Object[0]);
            return 202;
        } else {
            urr.a("DefaultPlugin", "ForkDumpInstance!", new Object[0]);
            int forkDumpHeapInstanceNative = forkDumpHeapInstanceNative(str, j, j2, i, str2, i2, i3, j3);
            this.e.set(false);
            return forkDumpHeapInstanceNative;
        }
    }

    public int b(String str, String str2, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2957e33", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j)})).intValue();
        }
        if (!this.d) {
            urr.a("DefaultPlugin", "DumpReferenceInfo is disable!", new Object[0]);
            return 201;
        } else if (!this.e.compareAndSet(false, true)) {
            urr.a("DefaultPlugin", "Current in dump process!", new Object[0]);
            return 202;
        } else {
            urr.a("DefaultPlugin", "dumpHeapReference!", new Object[0]);
            this.e.set(false);
            return -1;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fd71786", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return PLUGIN_LIB_NAME;
    }

    public boolean e() {
        wrr wrrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6def6671", new Object[]{this})).booleanValue();
        }
        if (!drx.b() || (wrrVar = this.b) == null || !wrrVar.h(this) || this.f9628a != null) {
            return false;
        }
        PluginEventHandler pluginEventHandler = new PluginEventHandler();
        this.f9628a = pluginEventHandler;
        if (setCallback(pluginEventHandler) == 0) {
            return true;
        }
        return false;
    }

    public native long getAllocSize();

    public native long getGCCount();

    public native long getGCPauseTime();

    public native long getThreadCount();

    public void m(n8m n8mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455372b", new Object[]{this, n8mVar});
            return;
        }
        PluginEventHandler pluginEventHandler = this.f9628a;
        if (pluginEventHandler != null && n8mVar != null) {
            pluginEventHandler.addEventListener(n8mVar);
        }
    }

    public void n(PluginCapacity pluginCapacity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0bebb3f", new Object[]{this, pluginCapacity, new Boolean(z)});
            return;
        }
        switch (a.$SwitchMap$com$taobao$android$tbuprofen$plugin$PluginCapacity[pluginCapacity.ordinal()]) {
            case 1:
                f(z);
                return;
            case 2:
                i(z);
                return;
            case 3:
                j(z);
                return;
            case 4:
                g(z);
                return;
            case 5:
                h(z);
                return;
            case 6:
                k(z);
                return;
            case 7:
                this.d = z;
                urr.f("DefaultPlugin", "DumpHeapInfo: " + this.d, new Object[0]);
                return;
            case 8:
                l(z);
                return;
            default:
                return;
        }
    }

    public native void setArgs(int i, boolean z, boolean z2);

    public native void setVerboseFlag(int i, boolean z);

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bee6b127", new Object[]{this, new Boolean(z)});
            return;
        }
        urr.f("DefaultPlugin", "monitorBigMemAlloc:" + z, new Object[0]);
        if (!TBProfConfig.p()) {
            this.b.j(TBPEvent.TBP_EVENT_VM_OBJECT_ALLOC, z);
        } else if (ARTUtil.c() == 0) {
            try {
                if (TBProfConfig.q()) {
                    urr.f("DefaultPlugin", "enterGCCriticalSection", new Object[0]);
                    ARTUtil.a();
                }
                this.b.j(TBPEvent.TBP_EVENT_VM_OBJECT_ALLOC, z);
                if (TBProfConfig.q()) {
                    ARTUtil.b();
                    urr.f("DefaultPlugin", "exitGCCriticalSection", new Object[0]);
                }
            } catch (Throwable th) {
                if (TBProfConfig.q()) {
                    ARTUtil.b();
                    urr.f("DefaultPlugin", "exitGCCriticalSection", new Object[0]);
                }
                throw th;
            }
        } else {
            urr.b("DefaultPlugin", "mutator held! Do not enable VM_OBJECT_ALLOC", new Object[0]);
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99fe81f", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            urr.f("DefaultPlugin", "monitorCatchException:" + z, new Object[0]);
            this.b.j(TBPEvent.TBP_EVENT_EXCEPTION_CATCH, z);
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973ce9e4", new Object[]{this, new Boolean(z)});
            return;
        }
        urr.f("DefaultPlugin", "monitorClassPrepare:" + z, new Object[0]);
        this.b.j(TBPEvent.TBP_EVENT_CLASS_LOAD, z);
        this.b.j(TBPEvent.TBP_EVENT_CLASS_PREPARE, z);
    }

    public final void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54654937", new Object[]{this, new Boolean(z)});
            return;
        }
        urr.f("DefaultPlugin", "monitorGC:" + z, new Object[0]);
        this.b.j(TBPEvent.TBP_EVENT_GARBAGE_COLLECTION_START, z);
        this.b.j(TBPEvent.TBP_EVENT_GARBAGE_COLLECTION_FINISH, z);
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74f19d9", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT >= 28) {
            urr.f("DefaultPlugin", "monitorMainThreadLongBlock:" + z, new Object[0]);
            this.b.j(TBPEvent.TBP_EVENT_MONITOR_CONTENDED_ENTER, z);
            this.b.j(TBPEvent.TBP_EVENT_MONITOR_CONTENDED_ENTERED, z);
            this.b.j(TBPEvent.TBP_EVENT_MONITOR_WAIT, z);
            this.b.j(TBPEvent.TBP_EVENT_MONITOR_WAITED, z);
        }
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e676053", new Object[]{this, new Boolean(z)});
            return;
        }
        urr.f("DefaultPlugin", "monitorSigQuitDump:" + z, new Object[0]);
        this.b.j(TBPEvent.TBP_EVENT_DATA_DUMP_REQUEST, z);
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5cfa6", new Object[]{this, new Boolean(z)});
            return;
        }
        urr.f("DefaultPlugin", "monitorThreadRun:" + z, new Object[0]);
        this.b.j(TBPEvent.TBP_EVENT_THREAD_START, z);
        this.b.j(TBPEvent.TBP_EVENT_THREAD_END, z);
    }
}
