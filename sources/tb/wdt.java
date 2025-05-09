package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Runnable f30642a;
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f30643a;

        public a(Runnable runnable) {
            this.f30643a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Runnable runnable = this.f30643a;
            if (runnable != null) {
                runnable.run();
            }
            while (wdt.a(wdt.this) != null) {
                Runnable a2 = wdt.a(wdt.this);
                wdt.b(wdt.this, null);
                a2.run();
            }
            wdt.c(wdt.this, false);
        }
    }

    public static /* synthetic */ Runnable a(wdt wdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("e9fdfff3", new Object[]{wdtVar});
        }
        return wdtVar.f30642a;
    }

    public static /* synthetic */ Runnable b(wdt wdtVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("165b0b73", new Object[]{wdtVar, runnable});
        }
        wdtVar.f30642a = runnable;
        return runnable;
    }

    public static /* synthetic */ boolean c(wdt wdtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e593d54", new Object[]{wdtVar, new Boolean(z)})).booleanValue();
        }
        wdtVar.b = z;
        return z;
    }

    public synchronized void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
        } else if (this.b) {
            this.f30642a = runnable;
        } else {
            this.b = true;
            srt.a(new a(runnable), false);
        }
    }
}
