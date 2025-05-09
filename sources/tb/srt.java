package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class srt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f28240a = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f28241a;

        public a(Runnable runnable) {
            this.f28241a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(10);
            this.f28241a.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f28242a;

        public b(Runnable runnable) {
            this.f28242a = runnable;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downloader/util/ThreadUtil$2");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f28242a.run();
            }
        }
    }

    public static void a(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467641a", new Object[]{runnable, new Boolean(z)});
            return;
        }
        ypt yptVar = xh4.d;
        if (yptVar != null) {
            ((a25) yptVar).a(runnable, z);
            return;
        }
        a aVar = new a(runnable);
        new Thread(aVar, "download thread " + f28240a.getAndIncrement()).start();
    }

    public static void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{runnable, new Long(j)});
            return;
        }
        ypt yptVar = xh4.d;
        if (yptVar != null) {
            ((a25) yptVar).c(runnable, j);
        } else {
            new Timer("download-sdk").schedule(new b(runnable), j);
        }
    }
}
