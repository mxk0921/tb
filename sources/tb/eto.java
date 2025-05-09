package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f18809a = new AtomicReference(null);

    static {
        t2o.a(676331668);
    }

    public static omd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omd) ipChange.ipc$dispatch("3887f88c", new Object[0]);
        }
        return (omd) f18809a.get();
    }

    public static void b(omd omdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cfee1c", new Object[]{omdVar});
        } else {
            sng.a(f18809a, null, omdVar);
        }
    }
}
