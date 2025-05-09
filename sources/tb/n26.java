package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n26 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final r86 f24462a;
    public static final r86 b;
    public static final r86 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof t86) || !(obj2 instanceof t86)) {
                return 0;
            }
            t86 t86Var = (t86) obj;
            t86 t86Var2 = (t86) obj2;
            int i = t86Var.f28564a - t86Var2.f28564a;
            if (i == 0) {
                return (int) (t86Var.c - t86Var2.c);
            }
            return i;
        }
    }

    static {
        t2o.a(444597022);
        a aVar = new a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f24462a = new r86(1, 1, 3L, timeUnit, new PriorityBlockingQueue(20480, aVar), new hi6("DXLanguagePatch", true));
        b = new r86(1, 1, 3L, timeUnit, new PriorityBlockingQueue(20480, aVar), new hi6("DXLanguageNewN", true));
        c = new r86(1, 1, 3L, timeUnit, new PriorityBlockingQueue(20480, aVar), new hi6("DXLanguageOptN", true));
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda3c73b", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            if (zg5.y3()) {
                h36.v(" DXLanguageUtil runForLanguage bugfix new");
                b.execute(runnable);
            } else if (zg5.D3()) {
                h36.v(" DXLanguageUtil runForLanguage perf opt new");
                c.execute(runnable);
            } else {
                h36.v(" DXLanguageUtil runForLanguage new");
                f24462a.execute(runnable);
            }
        }
    }
}
