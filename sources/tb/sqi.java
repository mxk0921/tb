package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedList;
import tb.uqi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sqi implements uqi.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MessageServiceQueue";
    public static sqi c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, LinkedList<tqi>> f28218a = new HashMap<>();
    public final HashMap<String, uqi> b = new HashMap<>();

    static {
        t2o.a(806356165);
        t2o.a(806356172);
    }

    public static sqi l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sqi) ipChange.ipc$dispatch("b3be745f", new Object[0]);
        }
        if (c == null) {
            c = new sqi();
        }
        return c;
    }

    @Override // tb.uqi.c
    public void a(int i, uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4c2ff3", new Object[]{this, new Integer(i), uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            f(uqiVar);
            k(uqiVar);
        }
    }

    public final void b(tqi tqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9539deed", new Object[]{this, tqiVar});
        } else if (tqiVar == null || !tqiVar.h()) {
            o("addTaskQueue task isNotLegal");
        } else {
            o("addTaskQueue task：" + tqiVar);
            LinkedList<tqi> linkedList = this.f28218a.get(tqiVar.f());
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.f28218a.put(tqiVar.f(), linkedList);
            }
            linkedList.addLast(tqiVar);
        }
    }

    @Override // tb.uqi.c
    public void d(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd4a63f", new Object[]{this, uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            g(uqiVar);
            k(uqiVar);
        }
    }

    public final void f(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3c0c2b", new Object[]{this, uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("changeStateOnEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            uqi uqiVar2 = this.b.get(uqiVar.p());
            if (uqiVar2 == null) {
                o("changeStateOnEnterFail error - cant find targetMessageServiceTransaction");
                return;
            }
            o("changeStateOnEnterFail messageServiceTransaction = " + uqiVar2);
            if (!uqiVar.n().equals(uqiVar2.n())) {
                o("changeStateOnEnterFail error - pmSession not equal");
                return;
            }
            switch (uqiVar2.o()) {
                case 10:
                    uqiVar2.C(101);
                    o("changeStateOnEnterSuccess remove");
                    this.b.remove(uqiVar2.p());
                    return;
                case 11:
                case 12:
                    o("changeStateOnEnterSuccess error - state err");
                    return;
                default:
                    return;
            }
        }
    }

    public final void g(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c233cbe0", new Object[]{this, uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("changeStateOnEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            uqi uqiVar2 = this.b.get(uqiVar.p());
            if (uqiVar2 == null) {
                o("changeStateOnEnterSuccess error - cant find targetMessageServiceTransaction");
                return;
            }
            o("changeStateOnEnterSuccess messageServiceTransaction = " + uqiVar2);
            if (!uqiVar.n().equals(uqiVar2.n())) {
                o("changeStateOnEnterSuccess error - pmSession not equal");
                return;
            }
            switch (uqiVar2.o()) {
                case 10:
                    o("changeStateOnEnterSuccess changeState SUBSCRIBED");
                    uqiVar2.C(11);
                    return;
                case 11:
                case 12:
                    o("changeStateOnEnterSuccess error - state err");
                    return;
                default:
                    return;
            }
        }
    }

    public final void h(uqi uqiVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f048708", new Object[]{this, uqiVar, new Boolean(z)});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("changeStateOnLeave messageServiceTransaction isNotLegal");
        } else {
            uqi uqiVar2 = this.b.get(uqiVar.p());
            if (uqiVar2 == null) {
                o("changeStateOnLeave error - cant find targetMessageServiceTransaction");
                return;
            }
            o("changeStateOnLeave messageServiceTransaction = " + uqiVar2);
            if (!uqiVar.n().equals(uqiVar2.n())) {
                o("changeStateOnLeave error - pmSession not equal");
                return;
            }
            switch (uqiVar2.o()) {
                case 10:
                case 11:
                    o("changeStateOnLeave error - state err");
                    return;
                case 12:
                    if (z) {
                        i = 102;
                    } else {
                        i = 103;
                    }
                    uqiVar2.C(i);
                    o("changeStateOnLeave remove");
                    this.b.remove(uqiVar2.p());
                    return;
                default:
                    return;
            }
        }
    }

    public final void i(tqi tqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89836d5", new Object[]{this, tqiVar});
            return;
        }
        uqi uqiVar = new uqi(tqiVar);
        uqiVar.D();
        uqiVar.C(10);
        uqiVar.B(this);
        this.b.put(tqiVar.f(), uqiVar);
    }

    public final void j(uqi uqiVar, tqi tqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1139e8e0", new Object[]{this, uqiVar, tqiVar});
            return;
        }
        uqiVar.E();
        uqiVar.C(12);
    }

    public final void k(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cdab7e2", new Object[]{this, uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("executeNextTask messageServiceTransaction isNotLegal");
        } else {
            o("executeNextTask callbackServiceTransaction = " + uqiVar);
            LinkedList<tqi> linkedList = this.f28218a.get(uqiVar.p());
            if (linkedList == null) {
                o("executeNextTask queue == null");
                return;
            }
            tqi removeFirst = linkedList.removeFirst();
            if (removeFirst != null) {
                if (removeFirst.i()) {
                    m(removeFirst);
                } else {
                    n(removeFirst);
                }
            }
            if (linkedList.isEmpty()) {
                o("executeNextTask queue.isEmpty remove queue");
                this.f28218a.remove(uqiVar.p());
            }
        }
    }

    public void m(tqi tqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ab12b1", new Object[]{this, tqiVar});
        } else if (tqiVar == null || !tqiVar.h()) {
            o("handleSubscribeTask task isNotLegal");
        } else {
            o("handleSubscribeTask init task: " + tqiVar);
            uqi uqiVar = this.b.get(tqiVar.f());
            if (uqiVar == null) {
                i(tqiVar);
                return;
            }
            o("handleSubscribeTask messageServiceTransaction = " + uqiVar);
            if (tqiVar.e().equals(uqiVar.n())) {
                o("handleSubscribeTask error -  pmSession equal error call");
                return;
            }
            switch (uqiVar.o()) {
                case 10:
                case 12:
                    o("handleSubscribeTask addTaskQueue");
                    b(tqiVar);
                    return;
                case 11:
                    o("handleSubscribeTask directExecuteUnSubscribeTask");
                    j(uqiVar, new hgv(uqiVar));
                    b(tqiVar);
                    return;
                default:
                    return;
            }
        }
    }

    public void n(tqi tqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d2a12a", new Object[]{this, tqiVar});
        } else if (tqiVar == null || !tqiVar.h()) {
            o("handleUnSubscribeTask task isNotLegal");
        } else {
            o("handleUnSubscribeTask init task: " + tqiVar);
            uqi uqiVar = this.b.get(tqiVar.f());
            if (uqiVar == null) {
                o("handleUnSubscribeTask error - drop task messageServiceTransaction = null");
                return;
            }
            o("handleUnSubscribeTask messageServiceTransaction = " + uqiVar);
            if (tqiVar.e().equals(uqiVar.n())) {
                switch (uqiVar.o()) {
                    case 10:
                        o("handleUnSubscribeTask addTaskQueue");
                        b(tqiVar);
                        return;
                    case 11:
                        o("handleUnSubscribeTask directExecute");
                        j(uqiVar, tqiVar);
                        return;
                    case 12:
                        o("handleUnSubscribeTask error -  drop task error call");
                        return;
                    default:
                        return;
                }
            } else {
                o("handleUnSubscribeTask drop task pmSession not equal");
            }
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        String str2 = xlr.TAG;
        eir.a(str2, "MessageServiceQueue-" + str);
    }

    @Override // tb.uqi.c
    public void c(uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c83d600", new Object[]{this, uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            h(uqiVar, true);
            k(uqiVar);
        }
    }

    @Override // tb.uqi.c
    public void e(int i, uqi uqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d65bf4", new Object[]{this, new Integer(i), uqiVar});
        } else if (uqiVar == null || !uqiVar.r()) {
            o("onEnterSuccess messageServiceTransaction isNotLegal");
        } else {
            h(uqiVar, false);
            k(uqiVar);
        }
    }
}
