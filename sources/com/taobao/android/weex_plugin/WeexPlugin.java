package com.taobao.android.weex_plugin;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.tao.TaobaoApplication;
import io.unicorn.adapter.UnicornAdapterJNI;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dwh;
import tb.fs9;
import tb.g8q;
import tb.hdh;
import tb.ppx;
import tb.yio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlugin implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean mPreload = new AtomicBoolean(false);
    private static final AtomicBoolean mPreloadInside = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/WeexPlugin$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                WeexPlugin.doPreloadSo();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/WeexPlugin$2");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Trace.beginSection("WeexPreloadSo_zcache");
            try {
                ppx.a();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_plugin/WeexPlugin$3");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Trace.beginSection("WeexPreloadSo_zcache");
            try {
                ppx.a();
            } finally {
                Trace.endSection();
            }
        }
    }

    public static void doPreloadSo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe51181", new Object[0]);
        } else if (!mPreloadInside.getAndSet(true)) {
            if (!WeexInitSwitch.isIsSoPreloadBatch()) {
                doPreloadSoInternalWithRemote();
            } else if (WeexInitSwitch.isRemoteQking()) {
                doPreloadSoInternalWithRemote();
            } else {
                doPreloadSoInternalLocal();
            }
        }
    }

    private static void doPreloadSoInternalLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84506d5b", new Object[0]);
            return;
        }
        hdh.b(dwh.TAG, "PreloadSO(Local) start");
        try {
            synchronized (MUSCommonNativeBridge.e()) {
                synchronized (fs9.e()) {
                    synchronized (Runtime.getRuntime()) {
                        Trace.beginSection("WeexPreloadSo_riverlogger");
                        try {
                            g8q.a();
                            Trace.endSection();
                            AsyncTask.THREAD_POOL_EXECUTOR.execute(new c());
                            Trace.beginSection("WeexPreloadSo_weex");
                            try {
                                com.taobao.android.weex.b.d().g();
                                Trace.endSection();
                                Trace.beginSection("WeexPreloadSo_unicorn");
                                try {
                                    UnicornAdapterJNI.instance().preloadSo();
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            }
            hdh.b(dwh.TAG, "PreloadSO finish");
        } catch (Throwable th) {
            hdh.c(dwh.TAG, "PreloadSO load fail", th);
        }
    }

    private static void doPreloadSoInternalWithRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b670e9ea", new Object[0]);
            return;
        }
        hdh.b(dwh.TAG, "PreloadSO(Remote) start");
        try {
            Trace.beginSection("WeexPreloadSo_riverlogger");
            g8q.a();
            Trace.endSection();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b());
            Trace.beginSection("WeexPreloadSo_quickjs");
            WeexInitSwitch.loadRemoteQking(TaobaoApplication.sApplication);
            Trace.endSection();
            Trace.beginSection("WeexPreloadSo_weex");
            com.taobao.android.weex.b.d().g();
            Trace.endSection();
            Trace.beginSection("WeexPreloadSo_unicorn");
            UnicornAdapterJNI.instance().preloadSo();
            Trace.endSection();
            hdh.b(dwh.TAG, "PreloadSO finish");
        } catch (Throwable th) {
            hdh.c(dwh.TAG, "PreloadSO load fail", th);
        }
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        return TaobaoApplication.sApplication;
    }

    public static Double getProcessStartUpTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("a9dd7b27", new Object[0]);
        }
        return null;
    }

    public static void preloadSo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7765f44c", new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 29 && WeexInitSwitch.isSoPreload() && !mPreload.getAndSet(true)) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new a());
        }
    }

    private static void preloadSoInternal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2220c533", new Object[]{str});
            return;
        }
        Trace.beginSection("WeexPreloadSo_" + str);
        try {
            System.loadLibrary(str);
        } finally {
            Trace.endSection();
        }
    }

    public static void setProcessStartUpTimestamp(Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1432b17", new Object[]{d});
        }
    }

    @Deprecated
    public static void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
        }
    }
}
