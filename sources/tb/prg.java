package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class prg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Handler f26253a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends HandlerThread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(String str, int i) {
            super(str, i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 628981620) {
                super.onLooperPrepared();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umbrella/link/LinkLogWorker$1");
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("257d7f74", new Object[]{this});
                return;
            }
            super.onLooperPrepared();
            Looper looper = getLooper();
            if (looper != null) {
                prg.a(prg.this, new Handler(looper));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f26255a;
        private String b;
        private String c;
        private String d;
        private String e;

        public void a(String str, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a6ee102", new Object[]{this, str, str2, str3, str4, str5});
                return;
            }
            this.f26255a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public abstract void b();

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                b();
            } catch (Throwable th) {
                d71.c(th, this.f26255a, this.b, this.c, this.d, this.e);
            }
        }
    }

    public prg() {
        new a("UM_SDK_LINK_LOG", 10).start();
    }

    public static /* synthetic */ Handler a(prg prgVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e53c95cb", new Object[]{prgVar, handler});
        }
        prgVar.f26253a = handler;
        return handler;
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982994b7", new Object[]{this, bVar});
            return;
        }
        Handler handler = this.f26253a;
        if (handler == null) {
            bVar.run();
        } else {
            handler.post(bVar);
        }
    }
}
