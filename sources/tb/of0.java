package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class of0 implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f25344a = new AtomicInteger(0);
    public final String b;

    public of0(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        String str = this.b + this.f25344a.getAndIncrement();
        AdapterForTLog.loge(ff0.TAG, "threadName:" + str + " dump:" + Log.getStackTraceString(new Throwable()));
        Thread thread = new Thread(runnable);
        thread.setName(str);
        return thread;
    }
}
