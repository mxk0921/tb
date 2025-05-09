package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f19467a = true;
    public static final Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(668991607);
        }

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/util/ShopRouterThreadManager$ShopRouterWorkerHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c cVar;
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            Object obj = message.obj;
            if ((obj instanceof c) && (runnable = (cVar = (c) obj).b) != null) {
                String str = cVar.f19468a;
                mvr.c("shop router start task : " + str);
                long currentTimeMillis = System.currentTimeMillis();
                runnable.run();
                long currentTimeMillis2 = System.currentTimeMillis();
                mvr.c("shop router task : " + str + " , cost : " + (currentTimeMillis2 - currentTimeMillis));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f19468a;
        public Runnable b;

        static {
            t2o.a(668991608);
        }

        public c() {
        }
    }

    static {
        t2o.a(668991605);
        HandlerThread handlerThread = new HandlerThread("ShopRouterWorkerThread");
        handlerThread.start();
        b = new b(handlerThread.getLooper());
    }

    public static void a(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad379839", new Object[]{runnable, str});
            return;
        }
        if (f19467a) {
            b(runnable, str);
        } else {
            AsyncTask.execute(runnable);
        }
        f19467a = jvr.p().e();
    }

    public static void b(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfef4da", new Object[]{runnable, str});
        } else if (runnable != null) {
            c cVar = new c();
            cVar.f19468a = str;
            cVar.b = runnable;
            Message obtain = Message.obtain(b);
            obtain.obj = cVar;
            obtain.sendToTarget();
        }
    }
}
