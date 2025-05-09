package com.taobao.themis.inside.adapter;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.concurrent.ExecutorService;
import tb.qqt;
import tb.s4s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TLogAdapterImpl implements TMSLogger.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_MODULE = "Themis";

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13527a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TLogAdapterImpl tLogAdapterImpl) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "ThemisLogThread-" + Process.myPid();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13528a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f13528a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLog.logd(TLogAdapterImpl.TLOG_MODULE, this.f13528a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f13529a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public c(Throwable th, String str, String str2) {
            this.f13529a = th;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Throwable th = this.f13529a;
            if (th == null) {
                TLog.loge(TLogAdapterImpl.TLOG_MODULE, this.b, this.c);
                Log.e(this.b, this.c);
                return;
            }
            TLog.loge(TLogAdapterImpl.TLOG_MODULE, this.b, this.c, th);
            Log.e(this.b, this.c, this.f13529a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13530a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Throwable c;

        public d(String str, String str2, Throwable th) {
            this.f13530a = str;
            this.b = str2;
            this.c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLog.logw(TLogAdapterImpl.TLOG_MODULE, this.f13530a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13531a;
        public final /* synthetic */ String b;

        public e(String str, String str2) {
            this.f13531a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLog.logi(TLogAdapterImpl.TLOG_MODULE, this.f13531a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13532a;
        public final /* synthetic */ String b;

        public f(String str, String str2) {
            this.f13532a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLog.logv(TLogAdapterImpl.TLOG_MODULE, this.f13532a, this.b);
            }
        }
    }

    static {
        t2o.a(837812270);
        t2o.a(839909497);
    }

    public TLogAdapterImpl() {
        if (AdapterForTLog.isValid()) {
            s4s.e().a(TLOG_MODULE, LogLevel.D);
        }
        if (this.f13527a == null) {
            this.f13527a = VExecutors.newSingleThreadExecutor(new a(this));
        }
    }

    public final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779a949", new Object[]{this, runnable});
            return;
        }
        ExecutorService executorService = this.f13527a;
        if (executorService != null) {
            executorService.execute(runnable);
        } else {
            TLog.loge(TLOG_MODULE, "TLog线程未准备好");
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else {
            a(new b(str, str2));
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            a(new c(th, str, str2));
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else {
            a(new e(str, str2));
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
        } else {
            a(new f(str, str2));
        }
    }

    @Override // com.taobao.themis.kernel.basic.TMSLogger.Adapter
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
        } else {
            a(new d(str, str2, th));
        }
    }
}
