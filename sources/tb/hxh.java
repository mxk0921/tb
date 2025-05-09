package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Looper f20944a = null;
    public static final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable d;

        public a(Runnable runnable) {
            this.d = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/util/MUSThreadUtil$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                hxh.b(this.d);
            }
        }
    }

    static {
        t2o.a(982516255);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (f20944a == null) {
            f20944a = Looper.getMainLooper();
        }
        if (f20944a == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af6ae6b", new Object[]{runnable});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public static void c(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba90be81", new Object[]{runnable, new Integer(i)});
        } else {
            b.postDelayed(new a(runnable), i);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44b6a68", new Object[]{runnable});
        } else {
            b.post(runnable);
        }
    }

    public static void e(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b5c8be", new Object[]{runnable, new Integer(i)});
        } else {
            b.postDelayed(runnable, i);
        }
    }

    public static void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
        } else if (a()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }
}
