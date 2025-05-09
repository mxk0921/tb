package tb;

import android.os.ConditionVariable;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.a;
import com.flybird.deploy.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import tb.j8u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class i8u implements Callable<Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j8u.a f21160a;
    public final /* synthetic */ ConcurrentHashMap b;

    public i8u(j8u.a aVar, ConcurrentHashMap concurrentHashMap) {
        this.f21160a = aVar;
        this.b = concurrentHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        try {
            String str = this.f21160a.c;
            IpChange ipChange2 = a.$ipChange;
            ConditionVariable conditionVariable = new ConditionVariable();
            a.b[] bVarArr = new a.b[1];
            Throwable[] thArr = new Throwable[1];
            a.b(str, new b(bVarArr, conditionVariable, thArr));
            conditionVariable.block();
            Throwable th = thArr[0];
            if (th == null) {
                this.b.put(this.f21160a, bVarArr[0]);
                return null;
            }
            throw th;
        } catch (Throwable th2) {
            pgh.g("joinDownloadCheckedTemplates error", th2);
            return null;
        }
    }
}
