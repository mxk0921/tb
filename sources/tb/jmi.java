package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<wa> f22078a = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963141);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963140);
    }

    public final boolean a(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e0b9370", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "messageSender");
        Iterator<wa> it = this.f22078a.iterator();
        while (it.hasNext()) {
            if (it.next().m(str)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean b(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e133a3a", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "messageSender");
        ckf.g(str2, BaseOuterComponent.b.NAME);
        for (wa waVar : this.f22078a) {
            if (waVar.n(str, str2)) {
                z = true;
            }
        }
        return z;
    }

    public final void c(wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc75d22a", new Object[]{this, waVar});
            return;
        }
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "MessageCenter", "注册消息观察者，messageObserver=" + waVar);
        if (!this.f22078a.contains(waVar)) {
            this.f22078a.add(waVar);
        }
    }

    public final void d(String str, List<String> list, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a097f1a", new Object[]{this, str, list, waVar});
            return;
        }
        ckf.g(str, "messageSender");
        ckf.g(list, vff.REGISTER_OR_UNREGISTER_MESSAGES_ARGS_MESSAGE_NAMES);
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "MessageCenter", "注册消息，messageSender=" + str + "，messageNames=" + list + "，messageObserver=" + waVar);
        c(waVar);
        waVar.k(str, list);
    }

    public final void e(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ac519d", new Object[]{this, bmiVar});
            return;
        }
        ckf.g(bmiVar, "message");
        vgh.c(this, "MessageCenter", "发送消息，message=" + bmiVar);
        for (wa waVar : this.f22078a) {
            if (tx1.Companion.a(bmiVar.c())) {
                waVar.o(bmiVar);
            } else if (waVar.n(bmiVar.e(), bmiVar.c())) {
                waVar.o(bmiVar);
            }
        }
    }

    public final void f(wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5658b3f1", new Object[]{this, waVar});
            return;
        }
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "MessageCenter", "解注册消息观察者，messageObserver=" + waVar);
        this.f22078a.remove(waVar);
    }

    public final void g(String str, List<String> list, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdeb8f3", new Object[]{this, str, list, waVar});
            return;
        }
        ckf.g(str, "messageSender");
        ckf.g(list, vff.REGISTER_OR_UNREGISTER_MESSAGES_ARGS_MESSAGE_NAMES);
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "MessageCenter", "解注册消息，messageSender=" + str + "，messageNames=" + list + "，messageObserver=" + waVar);
        waVar.q(str, list);
        if (!waVar.l()) {
            f(waVar);
        }
    }

    public final void h(String str, wa waVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901c602", new Object[]{this, str, waVar});
            return;
        }
        ckf.g(str, "messageSender");
        ckf.g(waVar, "messageObserver");
        vgh.c(this, "MessageCenter", "解注册消息，messageSender=" + str + "，messageObserver=" + waVar);
        waVar.p(str);
        if (!waVar.l()) {
            f(waVar);
        }
    }
}
