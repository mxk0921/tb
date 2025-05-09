package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class olk<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f25460a = new ArrayList();

    static {
        t2o.a(468713786);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5de3fa", new Object[]{this, t});
        } else if (d(t)) {
            ir9.b("ObserverList", "监听器 " + t.getClass().getSimpleName() + " 已经注册");
        } else {
            ((ArrayList) this.f25460a).add(t);
        }
    }

    public List<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ad51f96", new Object[]{this});
        }
        return this.f25460a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18a66467", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.f25460a).size();
    }

    public boolean d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0570437", new Object[]{this, t})).booleanValue();
        }
        return ((ArrayList) this.f25460a).contains(t);
    }

    public void e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a8b49d", new Object[]{this, t});
        } else {
            ((ArrayList) this.f25460a).remove(t);
        }
    }
}
