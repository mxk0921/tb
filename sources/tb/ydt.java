package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ydt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f32006a = null;
    public static final List<Runnable> b = new ArrayList();
    public static boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/util/TaskExecutor$1");
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
                if (obj instanceof Runnable) {
                    ydt.b((Runnable) obj);
                }
            } catch (Throwable th) {
                ku0.j("TaskExecutor.handleMessage", th);
            }
        }
    }

    static {
        t2o.a(961544383);
        new Handler(Looper.getMainLooper());
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("935ed9f1", new Object[0]);
        }
        if (f32006a == null) {
            synchronized (ydt.class) {
                try {
                    if (f32006a == null) {
                        HandlerThread handlerThread = new HandlerThread("TaskExecutor");
                        handlerThread.start();
                        f32006a = new a(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32006a;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98d6708", new Object[]{runnable});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public static void c(int i, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a26ac9", new Object[]{new Integer(i), runnable, new Long(j)});
            return;
        }
        try {
            if (f32006a == null) {
                a();
            }
            Message obtain = Message.obtain(f32006a, i);
            obtain.obj = runnable;
            f32006a.sendMessageDelayed(obtain, j);
        } catch (Throwable th) {
            ku0.j("TaskExecutor.executeBackgroundDelayed", th);
        }
    }

    public static void d(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee91560", new Object[]{runnable, new Long(j)});
        } else {
            c(0, runnable, j);
        }
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf069848", new Object[]{runnable});
            return;
        }
        synchronized (ydt.class) {
            try {
                if (!c) {
                    ((ArrayList) b).add(runnable);
                } else {
                    b(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f16668da", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            if (f32006a == null) {
                a();
            }
            return f32006a.hasMessages(i);
        } catch (Throwable th) {
            ku0.j("TaskExecutor.hasBackgroundCallbacks", th);
            return false;
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de93bd9", new Object[0]);
            return;
        }
        synchronized (ydt.class) {
            try {
                c = true;
                Iterator it = ((ArrayList) b).iterator();
                while (it.hasNext()) {
                    b((Runnable) it.next());
                }
                ((ArrayList) b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913730c0", new Object[]{new Integer(i)});
            return;
        }
        try {
            if (f32006a == null) {
                a();
            }
            f32006a.removeMessages(i);
        } catch (Throwable th) {
            ku0.j("TaskExecutor.removeBackgroundCallbacks", th);
        }
    }
}
