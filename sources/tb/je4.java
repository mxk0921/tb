package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class je4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21951a;
    public final String b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a<T> {
        T call();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void run() throws Exception;
    }

    static {
        t2o.a(407896096);
    }

    public je4(String str, String str2, String str3) {
        this.f21951a = str;
        this.b = str2;
        this.c = str3;
    }

    public <T> T a(a<T> aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4b17c4b8", new Object[]{this, aVar, str});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = aVar.call();
        q19.b().commit(this.f21951a, this.b, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        return call;
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9073cb94", new Object[]{this, str, new Long(j)});
        } else {
            q19.b().commit(this.f21951a, this.b, "fileSize", "false", str, j);
        }
    }

    public <T> T c(a<T> aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("89b2748f", new Object[]{this, aVar, str});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = aVar.call();
        q19.b().commit(this.f21951a, this.b, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        return call;
    }

    public <T> T d(Callable<T> callable, String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dad40c6", new Object[]{this, callable, str, str2});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        T call = callable.call();
        q19.b().commit(this.f21951a, str2, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
        return call;
    }

    public void e(b bVar, String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c180108", new Object[]{this, bVar, str, str2});
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        bVar.run();
        q19.b().commit(this.f21951a, str2, this.c, "false", str, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
    }
}
