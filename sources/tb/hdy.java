package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hdy c = new hdy();

    /* renamed from: a  reason: collision with root package name */
    public Thread f20568a = null;
    public final LinkedList<Runnable> b = new LinkedList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Process.setThreadPriority(0);
                while (!hdy.a(hdy.this).isEmpty()) {
                    Runnable runnable = (Runnable) hdy.a(hdy.this).get(0);
                    hdy.a(hdy.this).remove(0);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            } catch (Exception unused) {
            } finally {
                hdy.d(hdy.this);
            }
        }
    }

    public static /* synthetic */ LinkedList a(hdy hdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("56da953a", new Object[]{hdyVar});
        }
        return hdyVar.b;
    }

    public static hdy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdy) ipChange.ipc$dispatch("554b59f4", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Thread d(hdy hdyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("1b01a394", new Object[]{hdyVar});
        }
        hdyVar.f20568a = null;
        return null;
    }

    public final synchronized void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        this.b.add(runnable);
        if (this.f20568a == null) {
            Thread thread = new Thread(new a(), "APSecuritySdk");
            this.f20568a = thread;
            thread.start();
        }
    }
}
