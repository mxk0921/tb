package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a10;
import tb.ed4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u07<ExposeKey, ExposeData> implements i4c<ExposeKey, ExposeData, a10.b<ExposeData>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f29055a;
    public final LruCache<ExposeKey, a10.b<ExposeData>> b;

    static {
        t2o.a(444597139);
        t2o.a(444597125);
    }

    public u07() {
        this(new Handler(Looper.getMainLooper()), new LruCache(8));
    }

    public h4c<ExposeKey, ExposeData> a(qp8<ExposeKey, ExposeData> qp8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4c) ipChange.ipc$dispatch("6a5dd3ae", new Object[]{this, qp8Var, new Long(j)});
        }
        ed4.a aVar = new ed4.a();
        if (j > 0) {
            aVar.c(j);
        }
        aVar.f(qp8Var).h(qp8Var).d(this.f29055a).b(this.b).g(qp8Var).e(qp8Var);
        return aVar.a();
    }

    public u07(Handler handler, LruCache<ExposeKey, a10.b<ExposeData>> lruCache) {
        this.f29055a = handler;
        this.b = lruCache;
    }
}
