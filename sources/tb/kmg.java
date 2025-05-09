package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kmg implements Callable<Object[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f22758a;
    public final /* synthetic */ v1e b;
    public final /* synthetic */ HashMap c;

    public kmg(Context context, v1e v1eVar, HashMap hashMap) {
        this.f22758a = context;
        this.b = v1eVar;
        this.c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.concurrent.Callable
    public Object[] call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return j8u.b(this.f22758a, this.b, this.c);
    }
}
