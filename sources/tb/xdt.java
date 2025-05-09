package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f31325a = new Handler(Looper.getMainLooper());
    public static Handler b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/util/TaskExecutor$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            try {
                Object obj = message.obj;
                if (obj != null && (obj instanceof Runnable)) {
                    xdt.a((Runnable) obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(1034944688);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98d6708", new Object[]{runnable});
        } else {
            t45.c().e(runnable);
        }
    }

    public static void b(int i, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a26ac9", new Object[]{new Integer(i), runnable, new Long(j)});
            return;
        }
        if (b == null) {
            e();
        }
        try {
            Message obtain = Message.obtain(b, i);
            obtain.obj = runnable;
            b.sendMessageDelayed(obtain, j);
        } catch (Exception e) {
            kgh.d("TaskExecutor", e.getMessage(), e);
        }
    }

    public static void c(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee91560", new Object[]{runnable, new Long(j)});
        } else {
            b(0, runnable, j);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57128a53", new Object[]{runnable});
        } else {
            f31325a.post(runnable);
        }
    }

    public static synchronized void e() {
        synchronized (xdt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53914255", new Object[0]);
            } else if (b == null) {
                String str = "HandlerThread #" + System.currentTimeMillis();
                HandlerThread a2 = wsa.a(str);
                if (a2 == null) {
                    a2 = new HandlerThread(str, 1);
                }
                a2.start();
                b = new a(a2.getLooper());
            }
        }
    }

    public static void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913730c0", new Object[]{new Integer(i)});
            return;
        }
        if (b == null) {
            e();
        }
        b.removeMessages(i);
    }
}
