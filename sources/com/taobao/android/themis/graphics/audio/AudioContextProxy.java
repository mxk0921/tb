package com.taobao.android.themis.graphics.audio;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.rhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AudioContextProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadPoolExecutor executorService;
    private final rhb audioContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9655a;

        public a(boolean z) {
            this.f9655a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).m(this.f9655a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9656a;

        public b(boolean z) {
            this.f9656a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).n(this.f9656a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f9657a;

        public c(float f) {
            this.f9657a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).q(this.f9657a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9658a;

        public d(boolean z) {
            this.f9658a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).l(this.f9658a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Callable<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public Float call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("3f0b6a2e", new Object[]{this});
            }
            if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                return Float.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).f());
            }
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Callable<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* renamed from: a */
        public Float call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Float) ipChange.ipc$dispatch("3f0b6a2e", new Object[]{this});
            }
            if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                return Float.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).e());
            }
            return Float.valueOf(0.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a99c6222", new Object[]{this});
            }
            if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                return Boolean.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).g());
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Callable<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        /* renamed from: a */
        public Integer call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("5404efcc", new Object[]{this});
            }
            if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                return Integer.valueOf(AudioContextProxy.access$000(AudioContextProxy.this).d());
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class i implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "audiocontext_jsbinding");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).r();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9667a;

        public n(int i) {
            this.f9667a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).j(this.f9667a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9668a;

        public o(String str) {
            this.f9668a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).o(this.f9668a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9669a;

        public p(int i) {
            this.f9669a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).p(this.f9669a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9670a;

        public q(boolean z) {
            this.f9670a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AudioContextProxy.access$000(AudioContextProxy.this) != null) {
                AudioContextProxy.access$000(AudioContextProxy.this).k(this.f9670a);
            }
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i());
        executorService = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public AudioContextProxy(rhb rhbVar, long j2) {
        this.audioContext = rhbVar;
        if (rhbVar != null) {
            rhbVar.a(j2);
        }
    }

    public static /* synthetic */ rhb access$000(AudioContextProxy audioContextProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rhb) ipChange.ipc$dispatch("351651f2", new Object[]{audioContextProxy});
        }
        return audioContextProxy.audioContext;
    }

    private void excuteTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd9d4c0", new Object[]{this, runnable});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = executorService;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(runnable);
        }
    }

    private <T> T excuteTaskForResult(Callable<T> callable, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d7ad7f7", new Object[]{this, callable, t});
        }
        ThreadPoolExecutor threadPoolExecutor = executorService;
        if (threadPoolExecutor == null) {
            return t;
        }
        try {
            return threadPoolExecutor.submit(callable).get();
        } catch (InterruptedException | ExecutionException unused) {
            return t;
        }
    }

    public static native void nativeFireEvent(long j2, String str, String str2);

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        rhb rhbVar = this.audioContext;
        if (rhbVar != null) {
            rhbVar.f27383a = -1L;
        }
        excuteTask(new m());
    }

    public int getBufferd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ce40d68", new Object[]{this})).intValue();
        }
        return ((Integer) excuteTaskForResult(new h(), 0)).intValue();
    }

    public float getCurrentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf1327", new Object[]{this})).floatValue();
        }
        return ((Float) excuteTaskForResult(new f(), Float.valueOf(0.0f))).floatValue();
    }

    public float getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a81", new Object[]{this})).floatValue();
        }
        return ((Float) excuteTaskForResult(new e(), Float.valueOf(0.0f))).floatValue();
    }

    public boolean isPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec0d383", new Object[]{this})).booleanValue();
        }
        return ((Boolean) excuteTaskForResult(new g(), Boolean.FALSE)).booleanValue();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            excuteTask(new k());
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            excuteTask(new j());
        }
    }

    public void seek(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i2)});
        } else {
            excuteTask(new n(i2));
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new q(z));
        }
    }

    public void setIsRecordPlayState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d7158d", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new d(z));
        }
    }

    public void setLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new a(z));
        }
    }

    public void setObeyMuteSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1756017", new Object[]{this, new Boolean(z)});
        } else {
            excuteTask(new b(z));
        }
    }

    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            excuteTask(new o(str));
        }
    }

    public void setStartTime(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c9436f", new Object[]{this, new Integer(i2)});
        } else {
            excuteTask(new p(i2));
        }
    }

    public void setVolume(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
        } else {
            excuteTask(new c(f2));
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            excuteTask(new l());
        }
    }
}
