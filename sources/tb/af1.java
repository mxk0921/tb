package tb;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class af1 extends ovt {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    synchronized (af1.class) {
                        af1.b();
                        throw null;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    @Nullable
    public static af1 b() throws InterruptedException {
        throw null;
    }
}
