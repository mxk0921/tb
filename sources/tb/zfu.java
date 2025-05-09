package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.EventProcessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zfu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "TriggerEngine";
    public static final zfu b = new zfu();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f32735a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, List<egu<?, ?, ?>>> f32736a = new HashMap<>();

        /* compiled from: Taobao */
        /* renamed from: tb.zfu$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public interface AbstractC1116a {
            void a(egu<?, ?, ?> eguVar);
        }

        static {
            t2o.a(1034944723);
        }

        public void a(egu<?, ?, ?> eguVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe545ebe", new Object[]{this, eguVar});
                return;
            }
            ArrayList<String> b = eguVar.f18568a.b();
            if (b == null || b.size() <= 0) {
                b("__other__", eguVar);
                return;
            }
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                b(it.next(), eguVar);
            }
        }

        public final void b(String str, egu<?, ?, ?> eguVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60f3eedd", new Object[]{this, str, eguVar});
                return;
            }
            List<egu<?, ?, ?>> list = this.f32736a.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f32736a.put(str, list);
            }
            list.add(eguVar);
        }

        public final void c(List<egu<?, ?, ?>> list, AbstractC1116a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5f6fad0", new Object[]{this, list, aVar});
            } else if (list != null) {
                for (egu<?, ?, ?> eguVar : list) {
                    aVar.a(eguVar);
                }
            }
        }

        public void d(UserTrackDO userTrackDO, AbstractC1116a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12ae15aa", new Object[]{this, userTrackDO, aVar});
                return;
            }
            String valueOf = String.valueOf(userTrackDO.getEventId());
            c(this.f32736a.get(valueOf), aVar);
            String pageName = userTrackDO.getPageName();
            if (pageName != null) {
                HashMap<String, List<egu<?, ?, ?>>> hashMap = this.f32736a;
                c(hashMap.get(valueOf + "#" + pageName), aVar);
            }
            c(this.f32736a.get("__other__"), aVar);
        }

        public void e(Map<String, String> map, AbstractC1116a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4908921e", new Object[]{this, map, aVar});
                return;
            }
            String valueOf = String.valueOf(map.get("event_category"));
            c(this.f32736a.get(valueOf), aVar);
            String str = map.get("page_name");
            if (str != null) {
                HashMap<String, List<egu<?, ?, ?>>> hashMap = this.f32736a;
                c(hashMap.get(valueOf + "#" + str), aVar);
            }
            c(this.f32736a.get("__other__"), aVar);
        }

        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4a8a337", new Object[]{this, str});
                return;
            }
            for (Map.Entry<String, List<egu<?, ?, ?>>> entry : this.f32736a.entrySet()) {
                Iterator<egu<?, ?, ?>> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next().b(), str)) {
                        it.remove();
                    }
                }
            }
        }
    }

    static {
        t2o.a(1034944722);
    }

    public zfu() {
        new HashMap();
    }

    public static zfu e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfu) ipChange.ipc$dispatch("14c8e4f8", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ void f(Map map, ArrayList arrayList, egu eguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7263dfe9", new Object[]{map, arrayList, eguVar});
        } else if ((eguVar instanceof cqq) && ((cqq) eguVar).g(map) == EventProcessResult.RESULT_COMPLETE) {
            arrayList.add(eguVar);
        }
    }

    public void c(String str, h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2938d77", new Object[]{this, str, h45Var});
            return;
        }
        synchronized (this) {
            try {
                l(str, h45Var.h());
                for (j45 j45Var : h45Var.l()) {
                    egu<?, ?, ?> a2 = fgu.a(j45Var.b(), h45Var.h(), j45Var.a());
                    if (a2 != null) {
                        j(str, a2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<String, String> d(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da1d2568", new Object[]{this, userTrackDO});
        }
        if (userTrackDO.getEventId() == -19999) {
            return hq6.b(userTrackDO);
        }
        return hq6.d(userTrackDO);
    }

    public final /* synthetic */ void g(UserTrackDO userTrackDO, ArrayList arrayList, egu eguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a76ec93", new Object[]{this, userTrackDO, arrayList, eguVar});
        } else if (eguVar instanceof t3v) {
            if (((t3v) eguVar).c(userTrackDO) == EventProcessResult.RESULT_COMPLETE) {
                arrayList.add(eguVar);
            }
        } else if ((eguVar instanceof hh3) && ((hh3) eguVar).g(d(userTrackDO)) == EventProcessResult.RESULT_COMPLETE) {
            arrayList.add(eguVar);
        }
    }

    public ArrayList<egu<?, ?, ?>> h(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3d78cfd", new Object[]{this, map});
        }
        final ArrayList<egu<?, ?, ?>> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                for (a aVar : this.f32735a.values()) {
                    aVar.e(map, new a.AbstractC1116a() { // from class: tb.xfu
                        @Override // tb.zfu.a.AbstractC1116a
                        public final void a(egu eguVar) {
                            zfu.f(map, arrayList, eguVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public ArrayList<egu<?, ?, ?>> i(final UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6da8fcf6", new Object[]{this, userTrackDO});
        }
        final ArrayList<egu<?, ?, ?>> arrayList = new ArrayList<>();
        synchronized (this) {
            try {
                for (a aVar : this.f32735a.values()) {
                    aVar.d(userTrackDO, new a.AbstractC1116a() { // from class: tb.yfu
                        @Override // tb.zfu.a.AbstractC1116a
                        public final void a(egu eguVar) {
                            zfu.this.g(userTrackDO, arrayList, eguVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void j(String str, egu<?, ?, ?> eguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("333183d4", new Object[]{this, str, eguVar});
            return;
        }
        a aVar = this.f32735a.get(str);
        if (aVar == null) {
            aVar = new a();
            this.f32735a.put(str, aVar);
        }
        aVar.a(eguVar);
    }

    public void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc100d", new Object[]{this, str, str2});
            return;
        }
        synchronized (this) {
            l(str, str2);
        }
    }

    public final void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfacb9f", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.f32735a.get(str);
        if (aVar != null) {
            aVar.f(str2);
        }
    }
}
