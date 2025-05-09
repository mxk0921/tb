package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lyp<S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile S f23649a;
    public final CopyOnWriteArrayList<a<S>> b = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a<S> {
        void a(S s);
    }

    static {
        t2o.a(80740719);
        t2o.a(80740721);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public S b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (S) ipChange.ipc$dispatch("c0ccd90", new Object[]{this});
        }
        return this.f23649a;
    }

    public void c(S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd76b44", new Object[]{this, s});
        } else {
            d(s);
        }
    }

    public void d(S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7d10b2", new Object[]{this, s});
        } else if (s != null && !a(this.f23649a, s)) {
            this.f23649a = s;
            Iterator<a<S>> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(this.f23649a);
            }
        }
    }
}
