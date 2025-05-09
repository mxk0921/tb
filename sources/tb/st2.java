package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class st2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f28257a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<yve> f28258a = new ArrayList();
        public final List<yve> b = new ArrayList();
        public final Map<yve, Long> c = new HashMap();

        static {
            t2o.a(737149056);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("63c8687a", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("44f178a3", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ List c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("74a8aca4", new Object[]{aVar});
            }
            return aVar.f28258a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(yve yveVar);

        void b(yve yveVar);

        void c(yve yveVar, long j);
    }

    static {
        t2o.a(737149055);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da582f44", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.f28257a).add(bVar);
        }
    }

    public a b(yve yveVar, yve yveVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a6ed54f1", new Object[]{this, yveVar, yveVar2});
        }
        a aVar = new a();
        if (TextUtils.equals(yveVar.getName(), yveVar2.getName())) {
            d(yveVar, yveVar2, aVar);
            c(yveVar, yveVar2, aVar);
            return aVar;
        }
        TLog.loge(yr2.MODULE, "CacheTreeDiffer", "differ: root directories are inconsistent!");
        return null;
    }

    public final void c(yve yveVar, yve yveVar2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29eb239", new Object[]{this, yveVar, yveVar2, aVar});
            return;
        }
        if (yveVar.getSize() != yveVar2.getSize() && !a.a(aVar).containsKey(yveVar2)) {
            a.a(aVar).put(yveVar2, Long.valueOf(yveVar2.getSize() - yveVar.getSize()));
            Iterator it = ((ArrayList) this.f28257a).iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(yveVar2, yveVar2.getSize() - yveVar.getSize());
            }
        }
        for (yve yveVar3 : yveVar2.children()) {
            yve e = e(yveVar3, yveVar.children());
            if (e == null) {
                a.c(aVar).add(yveVar3);
                Iterator it2 = ((ArrayList) this.f28257a).iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).b(yveVar3);
                }
            } else {
                c(e, yveVar3, aVar);
            }
        }
    }

    public final void d(yve yveVar, yve yveVar2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424a6500", new Object[]{this, yveVar, yveVar2, aVar});
            return;
        }
        if (yveVar.getSize() != yveVar2.getSize() && !a.a(aVar).containsKey(yveVar2)) {
            a.a(aVar).put(yveVar2, Long.valueOf(yveVar2.getSize() - yveVar.getSize()));
            Iterator it = ((ArrayList) this.f28257a).iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(yveVar2, yveVar2.getSize() - yveVar.getSize());
            }
        }
        for (yve yveVar3 : yveVar.children()) {
            yve e = e(yveVar3, yveVar2.children());
            if (e == null) {
                a.b(aVar).add(yveVar3);
                Iterator it2 = ((ArrayList) this.f28257a).iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).a(yveVar3);
                }
            } else {
                d(yveVar3, e, aVar);
            }
        }
    }

    public final yve e(yve yveVar, List<yve> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yve) ipChange.ipc$dispatch("a2a03208", new Object[]{this, yveVar, list});
        }
        if (yveVar.getName() == null) {
            return null;
        }
        for (yve yveVar2 : list) {
            if (yveVar.getName().equals(yveVar2.getName())) {
                return yveVar2;
            }
        }
        return null;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        ((ArrayList) this.f28257a).clear();
        super.finalize();
    }
}
