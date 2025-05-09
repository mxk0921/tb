package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zm7 extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HandlerThread f32864a;
    public static a b;
    private static boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444596341);
        }

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/log/DinamicLogThread$OrderedHandler");
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a3198ca", new Object[]{this, runnable});
            } else if (runnable != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    obtain.obj = runnable;
                    sendMessage(obtain);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Object obj = message.obj;
                if (obj != null && (obj instanceof Runnable)) {
                    ((Runnable) obj).run();
                }
            } catch (Throwable unused) {
            }
            super.handleMessage(message);
        }
    }

    static {
        t2o.a(444596340);
    }

    private zm7(String str) {
        super(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[0])).booleanValue();
        }
        return c;
    }

    public static synchronized void b(String str) {
        Looper looper;
        synchronized (zm7.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
                return;
            }
            if (!c) {
                zm7 zm7Var = new zm7(str);
                f32864a = zm7Var;
                try {
                    zm7Var.start();
                } catch (Throwable unused) {
                }
                try {
                    looper = f32864a.getLooper();
                } catch (Throwable unused2) {
                    looper = null;
                }
                b = new a(looper);
                c = true;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(zm7 zm7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/log/DinamicLogThread");
    }
}
