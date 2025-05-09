package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wuq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<jlk> f30939a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wuq f30940a = new wuq();

        public static /* synthetic */ wuq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wuq) ipChange.ipc$dispatch("6daf745b", new Object[0]);
            }
            return f30940a;
        }
    }

    public static wuq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wuq) ipChange.ipc$dispatch("61bbb856", new Object[0]);
        }
        return a.a();
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ab0b2c", new Object[]{this, obj});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30939a).iterator();
        while (it.hasNext()) {
            ((jlk) it.next()).call(obj);
        }
    }
}
