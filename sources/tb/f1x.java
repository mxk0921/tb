package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class f1x implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOGTAG = "websync";
    private static final int f = 101;
    private static int g = 100;
    private static int h = 300000;

    /* renamed from: a  reason: collision with root package name */
    private Thread f18950a;
    private String b;
    public Handler c;
    public l1x d;
    private int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/patronus/simplecookie/WebSyncManager$SyncHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 101) {
                try {
                    f1x.this.g();
                    sendMessageDelayed(obtainMessage(101), f1x.a());
                } catch (Throwable th) {
                    Log.wtf(f1x.LOGTAG, th);
                }
            }
        }
    }

    public f1x(Context context, String str) {
        this.b = str;
        if (context != null) {
            this.d = l1x.h(context);
            Thread thread = new Thread(this);
            this.f18950a = thread;
            thread.setName(this.b);
            this.f18950a.start();
            return;
        }
        throw new IllegalStateException("WebSyncManager can't be created without context");
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return h;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf620d1", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22389c11", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeMessages(101);
            this.c.sendMessageDelayed(this.c.obtainMessage(101), h);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ca8024", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null) {
            int i = this.e + 1;
            this.e = i;
            if (i == 1) {
                this.c.sendMessageDelayed(handler.obtainMessage(101), h);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264823c4", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                handler.removeMessages(101);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c36d9a2", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeMessages(101);
            this.c.sendMessageDelayed(this.c.obtainMessage(101), g);
        }
    }

    public abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Looper.prepare();
        this.c = new b();
        b();
        Process.setThreadPriority(10);
        this.c.sendMessageDelayed(this.c.obtainMessage(101), h);
        Looper.loop();
    }
}
