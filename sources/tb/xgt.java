package tb;

import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.tao.log.TLog;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xgt implements rlh {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f31384a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements qqt {
        public a(xgt xgtVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            return "TbLottieLogger";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31385a;

        public b(String str) {
            this.f31385a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TLog.logd("TbLottie_Module", k6g.TAG, this.f31385a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31386a;

        public c(String str) {
            this.f31386a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TLog.logw("TbLottie_Module", k6g.TAG, this.f31386a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31387a;
        final /* synthetic */ Throwable b;

        public d(String str, Throwable th) {
            this.f31387a = str;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            TLog.loge("TbLottie_Module", k6g.TAG, this.f31387a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f31388a;

        public e(String str) {
            this.f31388a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TLog.loge("TbLottie_Module", k6g.TAG, this.f31388a);
        }
    }

    public xgt() {
        if (this.f31384a == null) {
            this.f31384a = VExecutors.newSingleThreadExecutor(new a(this));
        }
    }

    public void a(String str) {
        d(new b(str));
    }

    public void b(String str) {
        d(new e(str));
    }

    public void c(String str, Throwable th) {
        d(new d(str, th));
    }

    public final void d(Runnable runnable) {
        ExecutorService executorService = this.f31384a;
        if (executorService != null) {
            executorService.execute(runnable);
        } else {
            TLog.loge("TbLottie_Module", "mLogExecutor==null");
        }
    }

    public void e(String str) {
        d(new c(str));
    }
}
