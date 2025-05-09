package tb;

import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f27916a;
    public final String b;

    static {
        t2o.a(157286694);
    }

    public sav(String str) {
        this.b = str;
        b();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22089d33", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.e(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor runnable is NULL");
        } else {
            ThreadPoolExecutor threadPoolExecutor = this.f27916a;
            if (threadPoolExecutor == null) {
                UnifyLog.e(PreloadAsyncComponent.TAG, this.b + " dispatchToAsyncSerialExecutor SerialExecutor is NULL");
                return;
            }
            try {
                threadPoolExecutor.execute(runnable);
            } catch (Exception unused) {
                UnifyLog.e(PreloadAsyncComponent.TAG, "Exception when dispatchToAsyncSerialExecutor");
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569c8bfd", new Object[]{this});
        } else {
            this.f27916a = pav.e(1, 1, 30L, TimeUnit.SECONDS, "UltronSerialExecutor");
        }
    }
}
