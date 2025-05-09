package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.augecore.data.GroupData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<String> f19326a;
    public final CopyOnWriteArrayList<HashMap> b;
    public final CopyOnWriteArrayList<HashMap> c;
    public final Map<String, String> d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fj1.a(fj1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            Set<Map.Entry> entrySet = fj1.b(fj1.this).entrySet();
            if (entrySet.size() > 0) {
                for (Map.Entry entry : entrySet) {
                    if (ej1.h((String) entry.getValue())) {
                        fj1.a(fj1.this);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ej1.h(ej1.f())) {
                fj1.a(fj1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fj1.a(fj1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f19331a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Set c;

        public e(ArrayList arrayList, List list, Set set) {
            this.f19331a = arrayList;
            this.b = list;
            this.c = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f19331a.size() == this.b.size()) {
                for (String str : this.c) {
                    if (ej1.h((String) fj1.b(fj1.this).get(str))) {
                        fj1.a(fj1.this);
                    }
                }
            } else if (ej1.h(ej1.f())) {
                fj1.a(fj1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19332a;
        public final /* synthetic */ String b;
        public final /* synthetic */ yf4 c;

        public f(String str, String str2, yf4 yf4Var) {
            this.f19332a = str;
            this.b = str2;
            this.c = yf4Var;
        }

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
                return;
            }
            fj1.c(fj1.this, this.f19332a, list, this.b, this.c);
            fj1.this.g(list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19333a;
        public final /* synthetic */ List b;
        public final /* synthetic */ yf4 c;

        public g(String str, List list, yf4 yf4Var) {
            this.f19333a = str;
            this.b = list;
            this.c = yf4Var;
        }

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
                return;
            }
            fj1.d(fj1.this, this.f19333a, list, this.b, this.c);
            fj1.this.g(list);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
            } else {
                fj1.this.f19326a.clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements ry4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(fj1 fj1Var) {
        }

        @Override // tb.ry4
        public void a(List<GroupData> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd4c35c3", new Object[]{this, list, str});
            } else {
                fj1.n().g(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fj1 f19335a = new fj1(null);

        public static /* synthetic */ fj1 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fj1) ipChange.ipc$dispatch("66ac41fd", new Object[0]);
            }
            return f19335a;
        }
    }

    public /* synthetic */ fj1(a aVar) {
        this();
    }

    public static /* synthetic */ void a(fj1 fj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d6b57d", new Object[]{fj1Var});
        } else {
            fj1Var.h();
        }
    }

    public static /* synthetic */ Map b(fj1 fj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d7a7111", new Object[]{fj1Var});
        }
        return fj1Var.d;
    }

    public static /* synthetic */ void c(fj1 fj1Var, String str, List list, String str2, yf4 yf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c31989", new Object[]{fj1Var, str, list, str2, yf4Var});
        } else {
            fj1Var.f(str, list, str2, yf4Var);
        }
    }

    public static /* synthetic */ void d(fj1 fj1Var, String str, List list, List list2, yf4 yf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679a0c4f", new Object[]{fj1Var, str, list, list2, yf4Var});
        } else {
            fj1Var.e(str, list, list2, yf4Var);
        }
    }

    public static List<String> m(List<GroupData> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc5a3326", new Object[]{list, list2});
        }
        ArrayList arrayList = new ArrayList();
        if (!(list == null || list.size() == 0 || list2 == null || list2.size() == 0)) {
            for (String str : list2) {
                for (GroupData groupData : list) {
                    String crowd = groupData.getCrowd();
                    if (crowd != null && TextUtils.equals(crowd, str)) {
                        arrayList.add(crowd);
                    }
                }
            }
        }
        return arrayList;
    }

    public static fj1 n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fj1) ipChange.ipc$dispatch("d5a59da2", new Object[0]);
        }
        return j.a();
    }

    public static boolean o(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd96bf6d", new Object[]{str, list})).booleanValue();
        }
        for (GroupData groupData : list) {
            if (groupData != null) {
                String expireTime = groupData.getExpireTime();
                if (TextUtils.equals(groupData.getCrowd(), str) && ej1.h(expireTime)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(List<GroupData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59a26b8e", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0 || str == null) {
            return false;
        }
        for (GroupData groupData : list) {
            if (groupData != null && TextUtils.equals(str, groupData.getCrowd())) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a60594bc", new Object[]{str, list})).booleanValue();
        }
        for (GroupData groupData : list) {
            if (groupData != null && TextUtils.equals(groupData.getCrowd(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void e(String str, List<GroupData> list, List<String> list2, yf4 yf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24137db8", new Object[]{this, str, list, list2, yf4Var});
            return;
        }
        List<String> m = m(list, list2);
        yf4Var.b(m);
        ktv.a(ktv.ASYN_CHECK_SUCCESS, str, list2, m);
    }

    public final void f(String str, List<GroupData> list, String str2, yf4 yf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28ee956", new Object[]{this, str, list, str2, yf4Var});
            return;
        }
        boolean p = p(list, str2);
        yf4Var.a(p);
        HashMap hashMap = new HashMap();
        hashMap.put(str2, p + "");
        ktv.b(ktv.ASYN_CHECK_SUCCESS, str, hashMap);
    }

    public void g(List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc0456e", new Object[]{this, list});
            return;
        }
        if (this.f19326a.size() > 0) {
            gj1.c().d(new h());
        }
        Iterator<HashMap> it = this.b.iterator();
        while (it.hasNext()) {
            HashMap next = it.next();
            if (next != null) {
                String str = (String) next.get("groupId");
                String str2 = (String) next.get("token");
                f((String) next.get("bizCode"), list, str, (yf4) next.get("configGetListner"));
            }
        }
        this.b.clear();
        Iterator<HashMap> it2 = this.c.iterator();
        while (it2.hasNext()) {
            HashMap next2 = it2.next();
            if (next2 != null) {
                List<String> list2 = (List) next2.get("crowdListIn");
                String str3 = (String) next2.get("token");
                e((String) next2.get("bizCode"), list, list2, (yf4) next2.get("configGetListner"));
            }
        }
        this.c.clear();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e058db", new Object[]{this});
        } else {
            gj1.c().d(new i(this));
        }
    }

    public List<String> j(String str, List<String> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb193c8e", new Object[]{this, str, list, str2});
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0 && !TextUtils.isEmpty(str2)) {
            ej1.j(str);
            Map<String, String> map = this.d;
            if (map == null || ((ConcurrentHashMap) map).size() == 0) {
                Coordinator.execute(new d());
                ktv.a(ktv.SYN_CHECK_SUCCESS, str, list, arrayList);
            } else {
                Set<String> keySet = ((ConcurrentHashMap) this.d).keySet();
                for (String str3 : list) {
                    for (String str4 : keySet) {
                        if (TextUtils.equals(str3, str4)) {
                            arrayList.add(str3);
                        }
                    }
                }
                Coordinator.execute(new e(arrayList, list, keySet));
                ktv.a(ktv.SYN_CHECK_SUCCESS, str, list, arrayList);
                return arrayList;
            }
        }
        return arrayList;
    }

    public final void k(String str, List<String> list, yf4 yf4Var, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8faa913e", new Object[]{this, str, list, yf4Var, str2});
        } else if (gj1.c().c) {
            HashMap hashMap = new HashMap();
            hashMap.put("crowdListIn", list);
            hashMap.put("configGetListner", yf4Var);
            hashMap.put("token", str2);
            hashMap.put("bizCode", str);
            this.c.add(hashMap);
        } else {
            gj1.c().d(new g(str, list, yf4Var));
        }
    }

    public final void l(String str, String str2, yf4 yf4Var, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99fcab6", new Object[]{this, str, str2, yf4Var, str3});
        } else if (gj1.c().c) {
            HashMap hashMap = new HashMap();
            hashMap.put("groupId", str2);
            hashMap.put("configGetListner", yf4Var);
            hashMap.put("token", str3);
            hashMap.put("bizCode", str);
            this.b.add(hashMap);
        } else {
            gj1.c().d(new f(str, str2, yf4Var));
        }
    }

    public void u(List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695d1446", new Object[]{this, list});
            return;
        }
        Map<String, String> map = this.d;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
            if (list != null) {
                for (GroupData groupData : list) {
                    if (groupData != null) {
                        ((ConcurrentHashMap) this.d).put(groupData.getCrowd(), groupData.getExpireTime());
                    }
                }
            }
        }
    }

    public void v(List<GroupData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcab96b", new Object[]{this, list, str});
            return;
        }
        dj1.f(gj1.GROUP_DATA, list);
        dj1.e(gj1.GROUP_DATA_EXPIRE_TIME, str);
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f36214", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ce45", new Object[]{this, str});
        } else {
            dj1.e(gj1.GROUP_DATA_LOW_BUYER, str);
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321b6512", new Object[]{this, str});
        } else {
            this.e = "1".equals(str);
        }
    }

    public fj1() {
        this.f19326a = new CopyOnWriteArrayList<>();
        this.b = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new ConcurrentHashMap();
        this.e = false;
    }

    public void i(String str, List<String> list, yf4 yf4Var, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cbedd0", new Object[]{this, str, list, yf4Var, str2});
        } else if (yf4Var == null) {
            hj1.a(jj1.LOG_TAG, "configGetListner 空了");
        } else if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || TextUtils.isEmpty(str2)) {
            yf4Var.b(null);
            hj1.a(jj1.LOG_TAG, "传入的人群id集合  空了");
        } else {
            ej1.j(str);
            ArrayList arrayList = new ArrayList();
            if (!t()) {
                hj1.a(jj1.LOG_TAG, "本地数据为空，需要请求接口");
                k(str, list, yf4Var, str2);
                return;
            }
            List<GroupData> c2 = dj1.c(gj1.GROUP_DATA);
            String f2 = ej1.f();
            for (String str3 : list) {
                if (q(str3, c2)) {
                    if (o(str3, c2)) {
                        k(str, list, yf4Var, str2);
                        hj1.a(jj1.LOG_TAG, "本地数据过期，需要请求接口，重新拉取数据");
                        z = true;
                    } else {
                        arrayList.add(str3);
                    }
                } else if (ej1.h(f2)) {
                    k(str, list, yf4Var, str2);
                    z = true;
                }
            }
            if (!z) {
                yf4Var.b(arrayList);
                ktv.a(ktv.ASYN_CHECK_SUCCESS, str, list, arrayList);
            }
        }
    }

    public void r(String str, String str2, yf4 yf4Var, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4967e", new Object[]{this, str, str2, yf4Var, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || yf4Var == null || TextUtils.isEmpty(str3)) {
            hj1.a(jj1.LOG_TAG, "groupId或者configGetListner空了");
        } else {
            ej1.j(str);
            List<GroupData> c2 = dj1.c(gj1.GROUP_DATA);
            String f2 = ej1.f();
            if (!t()) {
                hj1.a(jj1.LOG_TAG, "本地数据为空，需要请求接口获取数据");
                l(str, str2, yf4Var, str3);
                return;
            }
            for (GroupData groupData : c2) {
                String crowd = groupData.getCrowd();
                String expireTime = groupData.getExpireTime();
                if (TextUtils.equals(crowd, str2)) {
                    if (ej1.h(expireTime)) {
                        hj1.a(jj1.LOG_TAG, "请求GroupId在本地人群里面，但是数据过期，需要重新请求接口");
                        l(str, str2, yf4Var, str3);
                        return;
                    }
                    yf4Var.a(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put(str2, "true");
                    ktv.b(ktv.ASYN_CHECK_SUCCESS, str, hashMap);
                    hj1.a(jj1.LOG_TAG, "请求GroupId在本地人群里面,返回结果：true");
                    return;
                }
            }
            if (ej1.h(f2)) {
                hj1.a(jj1.LOG_TAG, "人群不在本地，但是数据过期，需要重新请求接口");
                l(str, str2, yf4Var, str3);
                return;
            }
            yf4Var.a(false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "false");
            ktv.b(ktv.ASYN_CHECK_SUCCESS, str, hashMap2);
        }
    }

    public boolean s(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("865ac201", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            hj1.a(jj1.LOG_TAG, "bizCode或者crowdId为空了");
            return false;
        }
        ej1.j(str);
        Map<String, String> map = this.d;
        if (map == null || ((ConcurrentHashMap) map).size() == 0) {
            if (!t()) {
                Coordinator.execute(new a());
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str2, "false");
            ktv.b(ktv.SYN_CHECK_SUCCESS, str, hashMap);
            return false;
        } else if (((ConcurrentHashMap) this.d).containsKey(str2)) {
            Coordinator.execute(new b());
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "true");
            ktv.b(ktv.SYN_CHECK_SUCCESS, str, hashMap2);
            return true;
        } else {
            Coordinator.execute(new c());
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str2, "false");
            ktv.b(ktv.SYN_CHECK_SUCCESS, str, hashMap3);
            return false;
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccc46f1c", new Object[]{this})).booleanValue();
        }
        if (!ej1.h(dj1.b(gj1.GROUP_DATA_EXPIRE_TIME, "0"))) {
            return true;
        }
        hj1.a(jj1.LOG_TAG, "对比外层过期时间，过期，重新拉取数据");
        return false;
    }
}
