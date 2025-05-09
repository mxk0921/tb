package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ln6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597063);
    }

    public static void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e48bf7e", new Object[]{list});
        } else if (list != null) {
            try {
                Iterator it = list.iterator();
                if (it != null) {
                    while (it.hasNext()) {
                        Object next = it.next();
                        if ((next instanceof WeakReference) && ((WeakReference) next).get() == null) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
    }
}
