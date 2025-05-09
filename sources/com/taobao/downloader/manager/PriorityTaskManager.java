package com.taobao.downloader.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.manager.NetworkManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.a0q;
import tb.bft;
import tb.byi;
import tb.cvg;
import tb.fs7;
import tb.ift;
import tb.jdt;
import tb.l0j;
import tb.qkc;
import tb.set;
import tb.srt;
import tb.tu7;
import tb.wdt;
import tb.wet;
import tb.wu7;
import tb.xh4;
import tb.zet;
import tb.zzp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PriorityTaskManager implements NetworkManager.NetChangeListener, wet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PriTaskManager";
    private NetworkManager networkManager;
    private final List<zzp> curDownloadingList = new ArrayList();
    private jdt dataSource = new jdt();
    private wdt taskExecutor = new wdt();
    private ift taskSelector = new ift();
    private bft taskRanker = new bft(this.dataSource);
    private c taskDispatchThread = new c();
    private wu7 downloadManager = new wu7();

    public PriorityTaskManager() {
        NetworkManager e = NetworkManager.e(xh4.f31395a);
        this.networkManager = e;
        e.h(this);
    }

    public static /* synthetic */ jdt access$100(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jdt) ipChange.ipc$dispatch("15194354", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.dataSource;
    }

    public static /* synthetic */ List access$200(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d253c45a", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.curDownloadingList;
    }

    public static /* synthetic */ wu7 access$300(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wu7) ipChange.ipc$dispatch("48f14581", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.downloadManager;
    }

    public static /* synthetic */ void access$400(PriorityTaskManager priorityTaskManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd10ba9", new Object[]{priorityTaskManager, new Boolean(z)});
        } else {
            priorityTaskManager.dispatchTask(z);
        }
    }

    public static /* synthetic */ NetworkManager access$500(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkManager) ipChange.ipc$dispatch("c9abb8f3", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.networkManager;
    }

    public static /* synthetic */ bft access$600(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bft) ipChange.ipc$dispatch("f7804bbb", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.taskRanker;
    }

    public static /* synthetic */ ift access$700(PriorityTaskManager priorityTaskManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ift) ipChange.ipc$dispatch("8e0cb2ac", new Object[]{priorityTaskManager});
        }
        return priorityTaskManager.taskSelector;
    }

    private void dispatchTask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6398796e", new Object[]{this, new Boolean(z)});
        } else if (!z || this.networkManager.f().f10393a != 0) {
            this.taskExecutor.d(this.taskDispatchThread);
        }
    }

    public void modifyTask(int i, byi byiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5d0218", new Object[]{this, new Integer(i), byiVar});
            return;
        }
        this.dataSource.d(i, byiVar);
        dispatchTask(true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Runnable f10395a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements tu7.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f4c3241d", new Object[]{this, new Boolean(z)});
                } else if (z) {
                    PriorityTaskManager.access$400(PriorityTaskManager.this, true);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                PriorityTaskManager.access$400(PriorityTaskManager.this, true);
                c.a(c.this, null);
            }
        }

        private c() {
        }

        public static /* synthetic */ Runnable a(c cVar, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("85c07758", new Object[]{cVar, runnable});
            }
            cVar.f10395a = runnable;
            return runnable;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48ea64a9", new Object[]{this});
                return;
            }
            Iterator it = ((ArrayList) PriorityTaskManager.access$600(PriorityTaskManager.this).f).iterator();
            while (it.hasNext()) {
                a0q a0qVar = (a0q) it.next();
                if (PriorityTaskManager.access$200(PriorityTaskManager.this).contains(a0qVar.f15470a)) {
                    PriorityTaskManager.access$200(PriorityTaskManager.this).remove(a0qVar.f15470a);
                    PriorityTaskManager.access$300(PriorityTaskManager.this).b(a0qVar.f15470a);
                    fs7.g(PriorityTaskManager.TAG, "cancelDownload as in current downloading list", "cancel item", a0qVar.f15470a.e);
                } else {
                    fs7.g(PriorityTaskManager.TAG, "cancelDownload but not is in current downloading list callback only", "cancel item", a0qVar.f15470a.e);
                }
                zzp zzpVar = new zzp();
                zzpVar.b = -16;
                zzpVar.f33127a = false;
                zzpVar.e = a0qVar.f15470a.e;
                zet zetVar = a0qVar.b;
                zzpVar.f = zetVar.c;
                ((cvg) zetVar.d).a(zzpVar);
                PriorityTaskManager.access$100(PriorityTaskManager.this).e(a0qVar.f15470a, a0qVar.b);
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99a7f64f", new Object[]{this});
                return;
            }
            Iterator it = ((ArrayList) PriorityTaskManager.access$600(PriorityTaskManager.this).e).iterator();
            while (it.hasNext()) {
                zzp zzpVar = (zzp) it.next();
                if (zzpVar.b == -20) {
                    zzpVar.b(true);
                } else if (zzpVar.j.a()) {
                    zzpVar.b(false);
                    e();
                } else {
                    List<zet> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.get(zzpVar);
                    if (list != null) {
                        Iterator<zet> it2 = list.iterator();
                        while (it2.hasNext()) {
                            zet next = it2.next();
                            int i = next.c.d;
                            if (i == 0) {
                                ((cvg) next.d).a(zzpVar);
                                if (PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.containsKey(zzpVar)) {
                                    it2.remove();
                                    if (list.isEmpty()) {
                                        PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.remove(zzpVar);
                                    }
                                }
                                PriorityTaskManager.access$100(PriorityTaskManager.this).c(next.b, 2);
                            }
                            if (1 == i) {
                                ((cvg) next.d).a(zzpVar);
                                if (PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.containsKey(zzpVar)) {
                                    it2.remove();
                                    if (list.isEmpty()) {
                                        PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.remove(zzpVar);
                                    }
                                }
                            } else if (2 == i) {
                                ((HashSet) PriorityTaskManager.access$600(PriorityTaskManager.this).h).add(zzpVar.a());
                            }
                        }
                    }
                }
            }
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fff81e9a", new Object[]{this});
                return;
            }
            Iterator it = ((ArrayList) PriorityTaskManager.access$600(PriorityTaskManager.this).d).iterator();
            while (it.hasNext()) {
                zzp zzpVar = (zzp) it.next();
                List<zet> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.get(zzpVar);
                if (list != null) {
                    for (zet zetVar : list) {
                        ((cvg) zetVar.d).a(zzpVar);
                    }
                }
                PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.remove(zzpVar);
            }
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79b449ac", new Object[]{this});
            } else if (this.f10395a == null) {
                b bVar = new b();
                this.f10395a = bVar;
                srt.b(bVar, 10000);
            }
        }

        private void f(List<zzp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2aa982", new Object[]{this, list});
                return;
            }
            for (zzp zzpVar : list) {
                if (!PriorityTaskManager.access$200(PriorityTaskManager.this).contains(zzpVar)) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).d(zzpVar, new b(zzpVar));
                    fs7.g(PriorityTaskManager.TAG, "start download", zzpVar.e);
                } else {
                    fs7.g(PriorityTaskManager.TAG, "task is already running, no need to start again", zzpVar.e);
                }
                List<zet> list2 = PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.get(zzpVar);
                if (list2 != null) {
                    for (zet zetVar : list2) {
                        set setVar = zetVar.d;
                        if (setVar != null) {
                            ((cvg) setVar).f(zzpVar.e.f25507a, true);
                        }
                    }
                }
            }
        }

        private void g(List<zzp> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1123d22", new Object[]{this, list});
                return;
            }
            HashSet hashSet = new HashSet();
            Iterator it = ((ArrayList) PriorityTaskManager.access$600(PriorityTaskManager.this).g).iterator();
            while (it.hasNext()) {
                a0q a0qVar = (a0q) it.next();
                if (PriorityTaskManager.access$200(PriorityTaskManager.this).contains(a0qVar.f15470a)) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).e(a0qVar.f15470a);
                    ((cvg) a0qVar.b.d).f(a0qVar.f15470a.e.f25507a, false);
                    fs7.g(PriorityTaskManager.TAG, "stopDownload as in current downloading list", "network limit item", a0qVar.f15470a.e);
                } else {
                    zet zetVar = a0qVar.b;
                    if (zetVar.c.f) {
                        hashSet.add(zetVar);
                    }
                    fs7.g(PriorityTaskManager.TAG, "stopDownload but not is in current downloading list", "network limit item", a0qVar.f15470a.e);
                }
            }
            for (zzp zzpVar : PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                if (!list.contains(zzpVar) && zzpVar != null && !zzpVar.f33127a) {
                    PriorityTaskManager.access$300(PriorityTaskManager.this).f(zzpVar, false);
                    fs7.g(PriorityTaskManager.TAG, "stopDownload as not in start download list", "current downloading item", zzpVar.e);
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                zet zetVar2 = (zet) it2.next();
                fs7.c(PriorityTaskManager.TAG, "stopDownload ask if can change network", "taskParam", zetVar2);
                ((cvg) zetVar2.d).g(PriorityTaskManager.access$500(PriorityTaskManager.this).f().f10393a, zetVar2.c, new a());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                PriorityTaskManager.access$600(PriorityTaskManager.this).c(PriorityTaskManager.access$500(PriorityTaskManager.this).f());
                fs7.c(PriorityTaskManager.TAG, "dispatch", "all tasks ready to download", Integer.valueOf(((ArrayList) PriorityTaskManager.access$600(PriorityTaskManager.this).c).size()));
                d();
                PriorityTaskManager.access$700(PriorityTaskManager.this);
                List<zzp> a2 = ift.a(PriorityTaskManager.access$600(PriorityTaskManager.this).c);
                fs7.c(PriorityTaskManager.TAG, "dispatch", "tasks start to download", Integer.valueOf(a2.size()));
                f(a2);
                g(a2);
                b();
                c();
                PriorityTaskManager.access$200(PriorityTaskManager.this).clear();
                PriorityTaskManager.access$200(PriorityTaskManager.this).addAll(a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements qkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final zzp f10394a;

        public b(zzp zzpVar) {
            this.f10394a = zzpVar;
        }

        @Override // tb.qkc
        public void b(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40d708fb", new Object[]{this, new Long(j), str});
                return;
            }
            List<zet> list = PriorityTaskManager.access$100(PriorityTaskManager.this).f21940a.get(this.f10394a);
            if (list != null) {
                for (zet zetVar : list) {
                    ((cvg) zetVar.d).b(j, str);
                }
            }
        }

        @Override // tb.qkc
        public void a(zzp zzpVar) {
            l0j.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fa86c4e", new Object[]{this, zzpVar});
                return;
            }
            fs7.g(PriorityTaskManager.TAG, "onResult", "task", zzpVar);
            if (!zzpVar.f33127a && (aVar = zzpVar.k) != null) {
                l0j.c(aVar, "stat");
            }
            if (zzpVar.f33127a || !zzpVar.j.a()) {
                l0j.c(zzpVar.k, "stat");
            }
            synchronized (PriorityTaskManager.access$200(PriorityTaskManager.this)) {
                try {
                    PriorityTaskManager.access$200(PriorityTaskManager.this).remove(zzpVar);
                    if (PriorityTaskManager.access$300(PriorityTaskManager.this) != null) {
                        PriorityTaskManager.access$300(PriorityTaskManager.this).c(zzpVar);
                    }
                    PriorityTaskManager.access$400(PriorityTaskManager.this, false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.wet
    public void modifyTask(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbd5146", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.dataSource.c(i, i2);
        dispatchTask(true);
    }

    @Override // com.taobao.downloader.manager.NetworkManager.NetChangeListener
    public void onChange(NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ceef181", new Object[]{this, aVar});
            return;
        }
        fs7.g(TAG, "onChange network", "status", Integer.valueOf(aVar.f10393a));
        if (aVar.f10393a != 0) {
            ((HashSet) this.taskRanker.h).clear();
            dispatchTask(false);
        }
    }

    @Override // tb.wet
    public void addTask(List<zzp> list, zet zetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31182468", new Object[]{this, list, zetVar});
            return;
        }
        fs7.c(TAG, "addTask", "item size", Integer.valueOf(list.size()), "param", zetVar);
        this.taskRanker.h.removeAll(list);
        synchronized (this.curDownloadingList) {
            this.dataSource.a(list, zetVar);
        }
        if (zetVar.e == null) {
            zetVar.e = new ArrayList();
            for (zzp zzpVar : list) {
                zetVar.e.add(zzpVar.e);
            }
        }
        dispatchTask(true);
    }
}
