package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f17318a = new AtomicReference(null);

    static {
        t2o.a(676331667);
    }

    public static qmd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qmd) ipChange.ipc$dispatch("cb13a4b5", new Object[0]);
        }
        return (qmd) f17318a.get();
    }

    public static void b(qmd qmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41f1f", new Object[]{qmdVar});
        } else {
            sng.a(f17318a, null, qmdVar);
        }
    }
}
