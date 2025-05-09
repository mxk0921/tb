package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.manager.NetworkManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jdt f16357a;
    public final List<zzp> c = new ArrayList();
    public final List<zzp> d = new ArrayList();
    public final List<zzp> e = new ArrayList();
    public final List<a0q> f = new ArrayList();
    public final List<a0q> g = new ArrayList();
    public final Set<zzp> h = new HashSet();
    public final b b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f16358a = new a();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static class a implements Comparator<c> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: a */
            public int compare(c cVar, c cVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("594bcc7f", new Object[]{this, cVar, cVar2})).intValue();
                }
                int i = cVar2.b - cVar.b;
                if (i != 0) {
                    return i;
                }
                int i2 = cVar.d - cVar2.d;
                if (i2 != 0) {
                    return i2;
                }
                return cVar.e - cVar2.e;
            }
        }

        public void a(List<c> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe211e16", new Object[]{this, list});
            } else {
                Collections.sort(list, this.f16358a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public zzp f16359a;
        public int b = -99;
        public int c;
        public int d;
        public int e;
    }

    public bft(jdt jdtVar) {
        this.f16357a = jdtVar;
    }

    public final boolean a(c cVar, NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6075b272", new Object[]{this, cVar, aVar})).booleanValue();
        }
        int i = aVar.f10393a;
        if (i != 0 && (cVar.c & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean b(zet zetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f1da824", new Object[]{this, zetVar})).booleanValue();
        }
        if (zetVar == null || 2 != zetVar.f32713a) {
            return false;
        }
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        ((ArrayList) this.d).clear();
        ((ArrayList) this.e).clear();
        ((ArrayList) this.c).clear();
        ((ArrayList) this.f).clear();
        ((ArrayList) this.g).clear();
    }

    public void c(NetworkManager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2beb3e", new Object[]{this, aVar});
            return;
        }
        fs7.c("TaskRanker", "start rank", new Object[0]);
        d();
        ArrayList arrayList = new ArrayList();
        for (zzp zzpVar : this.f16357a.b()) {
            if (((HashSet) this.h).contains(zzpVar)) {
                fs7.c("TaskRanker", "rank", "task is hold , not need to run", zzpVar.e);
            } else if (zzpVar.f33127a && !TextUtils.isEmpty(zzpVar.d)) {
                ((ArrayList) this.d).add(zzpVar);
            } else if (zzpVar.f33127a || zzpVar.b >= 0) {
                List<zet> list = this.f16357a.f21940a.get(zzpVar);
                if (list == null) {
                    fs7.h("TaskRanker", "rank", "task map value is null");
                } else {
                    c cVar = null;
                    for (zet zetVar : list) {
                        if (b(zetVar)) {
                            fs7.g("TaskRanker", "rank", "user cancle so remove task", zetVar);
                            ((ArrayList) this.f).add(new a0q(zzpVar, zetVar));
                        } else if (1 != zetVar.f32713a) {
                            if (cVar == null) {
                                cVar = new c();
                                cVar.f16359a = zzpVar;
                            }
                            int i = cVar.b;
                            int i2 = zetVar.c.b;
                            if (i < i2) {
                                cVar.b = i2;
                                cVar.d = zetVar.e.indexOf(zzpVar.e);
                                zzpVar.f = zetVar.c;
                            }
                            int i3 = cVar.e;
                            if (i3 == 0 || i3 > zetVar.b) {
                                cVar.e = zetVar.b;
                            }
                            cVar.c = zetVar.c.c | cVar.c;
                            zzpVar.h = zzpVar.h;
                        }
                    }
                    if (cVar != null) {
                        if (a(cVar, aVar)) {
                            arrayList.add(cVar);
                        } else {
                            for (zet zetVar2 : list) {
                                ((ArrayList) this.g).add(new a0q(zzpVar, zetVar2));
                            }
                        }
                    }
                }
            } else {
                ((ArrayList) this.e).add(zzpVar);
            }
        }
        this.b.a(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ArrayList) this.c).add(((c) it.next()).f16359a);
        }
    }
}
