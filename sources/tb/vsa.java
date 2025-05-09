package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vsa extends HandlerThread implements fpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30221a;
    private final Handler b = new Handler(getLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/pool/thread/HandlerThreadEx$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                vsa.this.quit();
            }
        }
    }

    static {
        t2o.a(982516209);
        t2o.a(982516212);
    }

    public vsa(String str) {
        super(str);
        start();
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(vsa vsaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/pool/thread/HandlerThreadEx");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538dc92b", new Object[]{this});
        } else {
            quitSafely();
        }
    }

    public void b(Runnable runnable, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8db77271", new Object[]{this, runnable, mUSDKInstance});
            return;
        }
        Message obtain = Message.obtain(this.b, runnable);
        obtain.obj = mUSDKInstance.getToken();
        this.b.sendMessageDelayed(obtain, 0L);
    }

    public void c(Runnable runnable, Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7c9263", new Object[]{this, runnable, obj, new Long(j)});
        } else {
            this.b.postAtTime(runnable, obj, j);
        }
    }

    public void d(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{this, runnable, new Long(j)});
        } else {
            this.b.postDelayed(runnable, j);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public void g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270f6c2f", new Object[]{this, runnable});
        } else {
            this.b.removeCallbacks(runnable);
        }
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue();
        }
        return this.f30221a;
    }

    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cd0d1c", new Object[]{this, obj});
        } else {
            this.b.removeCallbacksAndMessages(obj);
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75c1875", new Object[]{this, new Integer(i)});
        } else {
            this.f30221a = i;
        }
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257d7f74", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 23) {
                Process.setThreadPriority(-4);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.fpc
    public void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else {
            this.b.post(runnable);
        }
    }
}
