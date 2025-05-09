package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yuh implements xuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f32359a;

    public yuh(String str) {
        duh duhVar = new duh(1, 1, 30L, str);
        duhVar.setKeepAliveTime(30L, TimeUnit.SECONDS);
        duhVar.allowCoreThreadTimeOut(true);
        this.f32359a = duhVar;
    }

    @Override // tb.xuh
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18716f10", new Object[]{this, runnable});
        } else {
            ((AbstractExecutorService) this.f32359a).submit(runnable);
        }
    }
}
