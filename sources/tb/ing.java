package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ing {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<zjc> f21447a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ing f21448a = new ing();

        static {
            t2o.a(626000030);
        }

        public static /* synthetic */ ing a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ing) ipChange.ipc$dispatch("9c54b32f", new Object[0]);
            }
            return f21448a;
        }
    }

    static {
        t2o.a(626000029);
    }

    public static ing b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ing) ipChange.ipc$dispatch("52a8ca54", new Object[0]);
        }
        return a.a();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd4bda9", new Object[]{this, str, str2});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f21447a).iterator();
        while (it.hasNext()) {
            zjc zjcVar = (zjc) it.next();
            if (zjcVar != null) {
                try {
                    zjcVar.a(str, str2);
                } catch (Throwable th) {
                    wdm.h("LifeCycleListenerManager.dispatchOnEnterPage.error", th);
                }
            }
        }
    }

    public void c(zjc zjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2bc5c4", new Object[]{this, zjcVar});
        } else if (zjcVar != null && !((CopyOnWriteArrayList) this.f21447a).contains(zjcVar)) {
            ((CopyOnWriteArrayList) this.f21447a).add(zjcVar);
        }
    }

    public void d(zjc zjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1991eb", new Object[]{this, zjcVar});
        } else if (zjcVar != null) {
            ((CopyOnWriteArrayList) this.f21447a).remove(zjcVar);
        }
    }
}
