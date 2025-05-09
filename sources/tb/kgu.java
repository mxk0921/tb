package tb;

import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.FutureEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Event> f22657a = new CopyOnWriteArrayList();
    public final List<FutureEvent> b = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kgu f22658a = new kgu();

        static {
            t2o.a(626000034);
        }

        public static /* synthetic */ kgu a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kgu) ipChange.ipc$dispatch("4142c261", new Object[0]);
            }
            return f22658a;
        }
    }

    static {
        t2o.a(626000033);
    }

    public static kgu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgu) ipChange.ipc$dispatch("fda23406", new Object[0]);
        }
        return a.a();
    }

    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2433ce63", new Object[]{this, event});
        } else {
            ((CopyOnWriteArrayList) this.f22657a).add(event);
        }
    }

    public void b(FutureEvent futureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435dc9da", new Object[]{this, futureEvent});
        } else {
            ((CopyOnWriteArrayList) this.b).add(futureEvent);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5554ac", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f22657a).clear();
        }
    }

    public List<Event> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21ac8524", new Object[]{this});
        }
        return this.f22657a;
    }

    public List<FutureEvent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("40d0fe6e", new Object[]{this});
        }
        return this.b;
    }

    public void g(FutureEvent futureEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e8ab57", new Object[]{this, futureEvent});
        } else {
            ((CopyOnWriteArrayList) this.b).remove(futureEvent);
        }
    }
}
