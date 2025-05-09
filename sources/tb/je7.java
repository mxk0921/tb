package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class je7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f21954a = 2;
    public static final LinkedList<a> b = new LinkedList<>();
    public static final HashMap<String, bxj> c = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final bxj f21955a;

        static {
            t2o.a(352321611);
        }

        public a(bxj bxjVar) {
            this.f21955a = bxjVar;
        }
    }

    static {
        t2o.a(352321610);
    }

    public static void a(bxj bxjVar) {
        a poll;
        bxj bxjVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68db167", new Object[]{bxjVar});
        } else if (bxjVar != null) {
            Iterator<a> it = b.iterator();
            while (it.hasNext()) {
                if (it.next().f21955a == bxjVar) {
                    return;
                }
            }
            LinkedList<a> linkedList = b;
            linkedList.add(new a(bxjVar));
            HashMap<String, bxj> hashMap = c;
            hashMap.put(bxjVar.toString(), bxjVar);
            if (linkedList.size() > f21954a && (poll = linkedList.poll()) != null && (bxjVar2 = poll.f21955a) != null) {
                hashMap.remove(bxjVar2.toString());
                bxjVar2.finishNewDetailContainer();
            }
        }
    }

    public static void b(bxj bxjVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918c2c8a", new Object[]{bxjVar});
            return;
        }
        Iterator<a> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (bxjVar == aVar.f21955a) {
                break;
            }
        }
        if (aVar != null) {
            b.remove(aVar);
            c.remove(aVar.f21955a.toString());
        }
    }
}
