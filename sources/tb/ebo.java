package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ebo<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f18455a = new CountDownLatch(1);
    public volatile T b = null;

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed5da69", new Object[]{this, t});
            return;
        }
        this.b = t;
        RSoLog.d("ResultHolder, updateResult enter");
        this.f18455a.countDown();
    }

    public T b(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21d860e7", new Object[]{this, new Integer(i)});
        }
        if (this.b != null) {
            return this.b;
        }
        if (this.f18455a.await(i, TimeUnit.SECONDS)) {
            return this.b;
        }
        return null;
    }

    public T c(int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7db9b697", new Object[]{this, new Integer(i)});
        }
        if (this.b != null) {
            return this.b;
        }
        RSoLog.d("ResultHolder, waitForResult2 enter, waitSeconds=" + i);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f18455a.await(i, TimeUnit.SECONDS)) {
            return this.b;
        }
        RSoLog.d("ResultHolder, waitForResult2 timeout, waitSeconds=" + i);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= i * 1000 * 1.5d) {
            return null;
        }
        T b = b(i);
        rbn.e("waitForResult2", "elapsed duration = " + elapsedRealtime2 + ", retry result = " + b);
        return b;
    }
}
