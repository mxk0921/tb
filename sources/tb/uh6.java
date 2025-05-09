package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uh6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, JSONObject> f29370a;
    public final Map<String, Map<String, Set<Long>>> b;
    public final Map<String, Map<String, LinkedList<DXTemplateItem>>> c;
    public final DXLongSparseArray<b> d;
    public final Map<String, Set<Long>> e;
    public final LruCache<String, Integer> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, LinkedList<DXTemplateItem>> f29371a;

        static {
            t2o.a(444596963);
        }

        public b(uh6 uh6Var) {
            this.f29371a = new HashMap();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final uh6 f29372a = new uh6();

        static {
            t2o.a(444596964);
        }

        public static /* synthetic */ uh6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uh6) ipChange.ipc$dispatch("85876cde", new Object[0]);
            }
            return f29372a;
        }
    }

    static {
        t2o.a(444596961);
    }

    public static uh6 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uh6) ipChange.ipc$dispatch("c7ab1644", new Object[0]);
        }
        return c.a();
    }

    public static boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d431d394", new Object[]{str})).booleanValue();
        }
        return zg5.K3(str);
    }

    public void A(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9241371", new Object[]{this, str, list});
            return;
        }
        List<DXTemplateItem> c2 = c(str, list);
        if (!(c2 == null || c2.isEmpty())) {
            if (!n(str)) {
                for (DXTemplateItem dXTemplateItem : c2) {
                    u(str, dXTemplateItem, false, true);
                }
            }
            synchronized (this.b) {
                try {
                    for (DXTemplateItem dXTemplateItem2 : c2) {
                        Map map = (Map) ((HashMap) this.b).get(str);
                        if (map == null) {
                            map = new HashMap();
                            ((HashMap) this.b).put(str, map);
                        }
                        Set set = (Set) map.get(dXTemplateItem2.f7343a);
                        if (set == null) {
                            set = new HashSet();
                            map.put(dXTemplateItem2.f7343a, set);
                        }
                        set.add(Long.valueOf(dXTemplateItem2.b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void b(String str, String str2, LinkedList<DXTemplateItem> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934df42b", new Object[]{this, str, str2, linkedList});
        } else if (linkedList != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (this.b) {
                try {
                    Map map = (Map) ((HashMap) this.b).get(str);
                    if (map == null) {
                        map = new HashMap();
                        ((HashMap) this.b).put(str, map);
                    }
                    Set set = (Set) map.get(str2);
                    if (set == null) {
                        set = new HashSet();
                    }
                    Iterator<DXTemplateItem> it = linkedList.iterator();
                    while (it.hasNext()) {
                        DXTemplateItem next = it.next();
                        if (next.i) {
                            it.remove();
                            set.add(Long.valueOf(next.b));
                        }
                    }
                    map.put(str2, set);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public List<DXTemplateItem> c(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("44c05b70", new Object[]{this, str, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DXTemplateItem dXTemplateItem : list) {
            if (wh6.c(str, dXTemplateItem)) {
                arrayList.add(dXTemplateItem);
            }
        }
        return arrayList;
    }

    public final DXTemplateItem d(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("27c34533", new Object[]{this, str, dXTemplateItem});
        }
        JSONObject jSONObject = this.f29370a.get(str);
        if (jSONObject == null || jSONObject.isEmpty()) {
            return e(str, dXTemplateItem);
        }
        return f(str, dXTemplateItem, jSONObject);
    }

    public DXTemplateItem g(String str, long j, DXTemplateItem dXTemplateItem) {
        Collection<String> collection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("b49260f0", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (o(str, j, dXTemplateItem)) {
            x(str, j, dXTemplateItem);
            synchronized (this.d) {
                try {
                    LinkedList linkedList = (LinkedList) ((HashMap) this.d.get(j).f29371a).get(dXTemplateItem.f7343a);
                    if (linkedList != null) {
                        if (linkedList.size() == 0) {
                            return null;
                        }
                        Iterator descendingIterator = linkedList.descendingIterator();
                        long j2 = -1;
                        while (descendingIterator.hasNext()) {
                            DXTemplateItem dXTemplateItem2 = (DXTemplateItem) descendingIterator.next();
                            long j3 = dXTemplateItem2.b;
                            int i = (j3 > dXTemplateItem.b ? 1 : (j3 == dXTemplateItem.b ? 0 : -1));
                            if (i != 0) {
                                if (dXTemplateItem2.f) {
                                    j2 = j3;
                                }
                                if (i >= 0) {
                                    dXTemplateItem2 = null;
                                } else if (j3 < j2) {
                                    return null;
                                }
                            }
                            if (dXTemplateItem2 != null && ((collection = dXTemplateItem.d) == null || !((ArrayList) collection).contains(String.valueOf(dXTemplateItem2.b)))) {
                                return dXTemplateItem2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x003a, DONT_GENERATE, TryCatch #0 {all -> 0x003a, blocks: (B:10:0x0025, B:12:0x0031, B:17:0x003c, B:18:0x003f, B:20:0x004b, B:22:0x0055, B:24:0x005b, B:26:0x005d, B:27:0x0061, B:29:0x0067, B:31:0x0075, B:32:0x0077, B:34:0x0079), top: B:39:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:10:0x0025, B:12:0x0031, B:17:0x003c, B:18:0x003f, B:20:0x004b, B:22:0x0055, B:24:0x005b, B:26:0x005d, B:27:0x0061, B:29:0x0067, B:31:0x0075, B:32:0x0077, B:34:0x0079), top: B:39:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.xh6 i(java.lang.String r9, com.taobao.android.dinamicx.template.download.DXTemplateItem r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.uh6.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "8aac12e8"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r8
            r3 = 1
            r2[r3] = r9
            r9 = 2
            r2[r9] = r10
            java.lang.Object r9 = r0.ipc$dispatch(r1, r2)
            tb.xh6 r9 = (tb.xh6) r9
            return r9
        L_0x001b:
            boolean r0 = tb.wh6.c(r9, r10)
            r1 = 0
            if (r0 == 0) goto L_0x007d
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.LinkedList<com.taobao.android.dinamicx.template.download.DXTemplateItem>>> r0 = r8.c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.LinkedList<com.taobao.android.dinamicx.template.download.DXTemplateItem>>> r2 = r8.c     // Catch: all -> 0x003a
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: all -> 0x003a
            java.lang.Object r2 = r2.get(r9)     // Catch: all -> 0x003a
            java.util.Map r2 = (java.util.Map) r2     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x003c
            java.lang.String r3 = r10.f7343a     // Catch: all -> 0x003a
            java.lang.Object r2 = r2.get(r3)     // Catch: all -> 0x003a
            if (r2 != 0) goto L_0x003f
            goto L_0x003c
        L_0x003a:
            r9 = move-exception
            goto L_0x007b
        L_0x003c:
            r8.w(r9, r10)     // Catch: all -> 0x003a
        L_0x003f:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.LinkedList<com.taobao.android.dinamicx.template.download.DXTemplateItem>>> r2 = r8.c     // Catch: all -> 0x003a
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: all -> 0x003a
            java.lang.Object r9 = r2.get(r9)     // Catch: all -> 0x003a
            java.util.Map r9 = (java.util.Map) r9     // Catch: all -> 0x003a
            if (r9 == 0) goto L_0x0079
            java.lang.String r2 = r10.f7343a     // Catch: all -> 0x003a
            java.lang.Object r9 = r9.get(r2)     // Catch: all -> 0x003a
            java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch: all -> 0x003a
            if (r9 == 0) goto L_0x0079
            int r2 = r9.size()     // Catch: all -> 0x003a
            if (r2 != 0) goto L_0x005d
            monitor-exit(r0)     // Catch: all -> 0x003a
            return r1
        L_0x005d:
            java.util.Iterator r9 = r9.descendingIterator()     // Catch: all -> 0x003a
        L_0x0061:
            boolean r2 = r9.hasNext()     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r9.next()     // Catch: all -> 0x003a
            com.taobao.android.dinamicx.template.download.DXTemplateItem r2 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r2     // Catch: all -> 0x003a
            long r3 = r2.b     // Catch: all -> 0x003a
            long r5 = r10.b     // Catch: all -> 0x003a
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0061
            tb.xh6 r9 = r2.k     // Catch: all -> 0x003a
            monitor-exit(r0)     // Catch: all -> 0x003a
            return r9
        L_0x0079:
            monitor-exit(r0)     // Catch: all -> 0x003a
            goto L_0x007d
        L_0x007b:
            monitor-exit(r0)     // Catch: all -> 0x003a
            throw r9
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uh6.i(java.lang.String, com.taobao.android.dinamicx.template.download.DXTemplateItem):tb.xh6");
    }

    public DXTemplateItem j(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("b6debc32", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (!o(str, j, dXTemplateItem)) {
            return null;
        }
        x(str, j, dXTemplateItem);
        synchronized (this.d) {
            try {
                Iterator descendingIterator = ((LinkedList) ((HashMap) this.d.get(j).f29371a).get(dXTemplateItem.f7343a)).descendingIterator();
                while (descendingIterator.hasNext()) {
                    DXTemplateItem dXTemplateItem2 = (DXTemplateItem) descendingIterator.next();
                    if (dXTemplateItem2.f && dXTemplateItem2.b <= dXTemplateItem.b) {
                        return dXTemplateItem2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DXTemplateItem k(String str, long j, DXTemplateItem dXTemplateItem) {
        Collection<String> collection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f26a1a21", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (o(str, j, dXTemplateItem)) {
            x(str, j, dXTemplateItem);
            synchronized (this.d) {
                try {
                    Iterator descendingIterator = ((LinkedList) ((HashMap) this.d.get(j).f29371a).get(dXTemplateItem.f7343a)).descendingIterator();
                    while (descendingIterator.hasNext()) {
                        DXTemplateItem dXTemplateItem2 = (DXTemplateItem) descendingIterator.next();
                        int i = (dXTemplateItem2.b > dXTemplateItem.b ? 1 : (dXTemplateItem2.b == dXTemplateItem.b ? 0 : -1));
                        if (i != 0 && (!dXTemplateItem2.f || i >= 0)) {
                            dXTemplateItem2 = null;
                        }
                        if (dXTemplateItem2 != null && ((collection = dXTemplateItem.d) == null || !((ArrayList) collection).contains(String.valueOf(dXTemplateItem2.b)))) {
                            return dXTemplateItem2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    public Set<Long> l(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ac577d81", new Object[]{this, str, new Long(j), str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (this.d) {
            try {
                LinkedList linkedList = (LinkedList) ((HashMap) this.d.get(j).f29371a).get(str2);
                if (linkedList == null) {
                    return null;
                }
                if (linkedList.size() == 0) {
                    return null;
                }
                HashSet hashSet = new HashSet();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    DXTemplateItem dXTemplateItem = (DXTemplateItem) it.next();
                    if (dXTemplateItem != null) {
                        hashSet.add(Long.valueOf(dXTemplateItem.b));
                    }
                }
                return hashSet;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m(LinkedList<DXTemplateItem> linkedList, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a9fa15f", new Object[]{this, linkedList, dXTemplateItem})).booleanValue();
        }
        if (linkedList == null || dXTemplateItem == null) {
            return false;
        }
        long j = dXTemplateItem.b;
        int size = linkedList.size();
        if (size == 0) {
            linkedList.add(dXTemplateItem);
            return true;
        } else if (linkedList.getLast() == null || j <= linkedList.getLast().b) {
            Iterator<DXTemplateItem> descendingIterator = linkedList.descendingIterator();
            descendingIterator.next();
            int i = size - 2;
            while (descendingIterator.hasNext()) {
                if (descendingIterator.next().b < j) {
                    linkedList.add(i + 1, dXTemplateItem);
                    return true;
                }
                i--;
            }
            linkedList.addFirst(dXTemplateItem);
            return true;
        } else {
            linkedList.add(dXTemplateItem);
            return true;
        }
    }

    public final boolean o(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7286d7b4", new Object[]{this, str, new Long(j), dXTemplateItem})).booleanValue();
        }
        if (j == 0 || !wh6.c(str, dXTemplateItem)) {
            return false;
        }
        return true;
    }

    public boolean p(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57e3a9ec", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (!wh6.c(str, dXTemplateItem)) {
            return false;
        }
        synchronized (this.b) {
            try {
                Map map = (Map) ((HashMap) this.b).get(str);
                if (map == null) {
                    return false;
                }
                Set set = (Set) map.get(dXTemplateItem.f7343a);
                if (set == null) {
                    return false;
                }
                return set.contains(Long.valueOf(dXTemplateItem.b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4442c491", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (wh6.c(str, dXTemplateItem)) {
            String str2 = str + dXTemplateItem.d();
            synchronized (this.f) {
                try {
                    int y = y(this.f.get(str2));
                    if (y == -1) {
                        return false;
                    }
                    if (y == 0) {
                        Map map = (Map) ((HashMap) this.c).get(str);
                        if (map == null || map.get(dXTemplateItem.f7343a) == null) {
                            w(str, dXTemplateItem);
                        }
                        Map map2 = (Map) ((HashMap) this.c).get(str);
                        if (map2 != null) {
                            LinkedList linkedList = (LinkedList) map2.get(dXTemplateItem.f7343a);
                            if (linkedList != null && !linkedList.isEmpty()) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    DXTemplateItem dXTemplateItem2 = (DXTemplateItem) it.next();
                                    if (dXTemplateItem2.b == dXTemplateItem.b) {
                                        if (dXTemplateItem2.f) {
                                            dXTemplateItem.f = true;
                                            this.f.put(str2, 2);
                                        } else {
                                            dXTemplateItem.f = false;
                                            this.f.put(str2, 1);
                                        }
                                        return true;
                                    }
                                }
                                this.f.put(str2, -1);
                                return false;
                            }
                            this.f.put(str2, -1);
                            return false;
                        }
                        this.f.put(str2, -1);
                        return false;
                    } else if (y == 1) {
                        dXTemplateItem.f = false;
                        return true;
                    } else if (y == 2) {
                        dXTemplateItem.f = true;
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7111b2d8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.f29370a.get(str) != null) {
            return false;
        }
        return true;
    }

    public void s(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f10e6f89", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            this.f29370a.put(str, jSONObject);
        }
    }

    public void t(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9f45c98", new Object[]{this, str, dXTemplateItem});
        } else {
            u(str, dXTemplateItem, true, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:10:0x0031, B:12:0x003d, B:17:0x0049, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:24:0x006f, B:25:0x0073, B:26:0x0077, B:28:0x007d, B:30:0x0091, B:32:0x009b, B:33:0x009f), top: B:78:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(java.lang.String r7, com.taobao.android.dinamicx.template.download.DXTemplateItem r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uh6.u(java.lang.String, com.taobao.android.dinamicx.template.download.DXTemplateItem, boolean, boolean):void");
    }

    public final void w(String str, DXTemplateItem dXTemplateItem) {
        LinkedList<DXTemplateItem> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddada6b4", new Object[]{this, str, dXTemplateItem});
            return;
        }
        synchronized (this.c) {
            try {
                Map map = (Map) ((HashMap) this.c).get(str);
                if (map == null) {
                    map = new HashMap();
                    ((HashMap) this.c).put(str, map);
                }
                if (((LinkedList) map.get(dXTemplateItem.f7343a)) == null) {
                    if (zg5.c4()) {
                        linkedList = sh6.c().g(str, dXTemplateItem);
                        b(str, dXTemplateItem.f7343a, linkedList);
                    } else {
                        linkedList = sh6.c().f(str, dXTemplateItem);
                    }
                    DXTemplateItem d = d(str, dXTemplateItem);
                    if (d != null) {
                        m(linkedList, d);
                    }
                    map.put(dXTemplateItem.f7343a, linkedList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(String str, long j, DXTemplateItem dXTemplateItem) {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bc32a9", new Object[]{this, str, new Long(j), dXTemplateItem});
            return;
        }
        synchronized (this.d) {
            try {
                b bVar = this.d.get(j);
                if (bVar == null) {
                    bVar = new b();
                    this.d.put(j, bVar);
                }
                linkedList = (LinkedList) ((HashMap) bVar.f29371a).get(dXTemplateItem.f7343a);
                if (linkedList == null) {
                    Map map = (Map) ((HashMap) this.c).get(str);
                    if (map == null || map.get(dXTemplateItem.f7343a) == null) {
                        w(str, dXTemplateItem);
                    }
                    Map map2 = (Map) ((HashMap) this.c).get(str);
                    if (map2 != null) {
                        LinkedList linkedList2 = (LinkedList) map2.get(dXTemplateItem.f7343a);
                        if (linkedList2 == null) {
                            ((HashMap) bVar.f29371a).put(dXTemplateItem.f7343a, new LinkedList());
                        } else {
                            ((HashMap) bVar.f29371a).put(dXTemplateItem.f7343a, new LinkedList(linkedList2));
                        }
                    }
                }
            } finally {
            }
        }
        if (linkedList == null) {
            synchronized (this.e) {
                try {
                    String str2 = str + dXTemplateItem.f7343a;
                    Set set = (Set) ((HashMap) this.e).get(str2);
                    if (set == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j));
                        ((HashMap) this.e).put(str2, hashSet);
                    } else {
                        set.add(Long.valueOf(j));
                    }
                } finally {
                }
            }
        }
    }

    public final int y(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d93c48f", new Object[]{this, num})).intValue();
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:10:0x0029, B:12:0x0035, B:17:0x0041, B:18:0x0044, B:20:0x0050, B:22:0x005a, B:23:0x0064, B:25:0x006a, B:27:0x006c), top: B:74:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(java.lang.String r5, long r6, com.taobao.android.dinamicx.template.download.DXTemplateItem r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uh6.z(java.lang.String, long, com.taobao.android.dinamicx.template.download.DXTemplateItem):void");
    }

    public uh6() {
        this.f29370a = new ConcurrentHashMap<>();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new DXLongSparseArray<>();
        this.e = new HashMap();
        this.f = new LruCache<>(100);
    }

    public static boolean v(String str, DXTemplateItem dXTemplateItem, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c46659b", new Object[]{str, dXTemplateItem, str2})).booleanValue();
        }
        h().t(str, dXTemplateItem);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" removeTemplate ");
        if (dXTemplateItem == null) {
            str3 = "null";
        } else {
            str3 = dXTemplateItem.d();
        }
        sb.append(str3);
        la6.b(sb.toString());
        return true;
    }

    public final DXTemplateItem f(String str, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("2e5073fc", new Object[]{this, str, dXTemplateItem, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(dXTemplateItem.f7343a);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            if (DinamicXEngine.j0()) {
                h36.i("DXTemplateInfoManager", str + '|' + dXTemplateItem.f7343a + "无内置");
            }
            return null;
        }
        long longValue = jSONObject2.getLongValue("version");
        if (longValue <= 0) {
            if (DinamicXEngine.j0()) {
                h36.w("DXTemplateInfoManager", str + '|' + dXTemplateItem.f7343a + "内置索引文件版本号非数字或版本号小于1");
            }
            return null;
        }
        String string = jSONObject2.getString(wh6.DX_MAIN_TEMPLATE_NAME);
        if (TextUtils.isEmpty(string)) {
            if (DinamicXEngine.j0()) {
                h36.w("DXTemplateInfoManager", str + '|' + dXTemplateItem.f7343a + "内置索引文件缺少主模板路径");
            }
            return null;
        }
        DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
        dXTemplateItem2.f7343a = dXTemplateItem.f7343a;
        dXTemplateItem2.b = longValue;
        dXTemplateItem2.f = true;
        xh6 xh6Var = new xh6();
        dXTemplateItem2.k = xh6Var;
        xh6Var.f31396a = string;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("other");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            dXTemplateItem2.k.b();
            for (String str2 : jSONObject3.keySet()) {
                dXTemplateItem2.k.b.put(str2, jSONObject3.getString(str2));
            }
        }
        return dXTemplateItem2;
    }

    public final DXTemplateItem e(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("fa16189b", new Object[]{this, str, dXTemplateItem});
        }
        StringBuilder sb = new StringBuilder(dx5.d().b());
        sb.append(str);
        sb.append(wh6.DIR);
        sb.append(dXTemplateItem.f7343a);
        long a2 = wh6.a(u06.b(sb.toString()));
        HashMap hashMap = null;
        if (a2 < 0) {
            return null;
        }
        DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
        dXTemplateItem2.f7343a = dXTemplateItem.f7343a;
        dXTemplateItem2.b = a2;
        sb.append(wh6.DIR);
        sb.append(a2);
        String sb2 = sb.toString();
        String[] b2 = u06.b(sb2);
        if (b2 != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : b2) {
                hashMap2.put(str2, sb2 + wh6.DIR + str2);
            }
            String str3 = (String) hashMap2.get(wh6.DX_MAIN_TEMPLATE_NAME);
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            hashMap2.remove(wh6.DX_MAIN_TEMPLATE_NAME);
            dXTemplateItem2.f = true;
            xh6 xh6Var = new xh6();
            dXTemplateItem2.k = xh6Var;
            if (!hashMap2.isEmpty()) {
                hashMap = hashMap2;
            }
            xh6Var.b = hashMap;
            dXTemplateItem2.k.f31396a = str3;
        }
        return dXTemplateItem2;
    }

    public synchronized int a(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ca63a00", new Object[]{this, str, new Long(j), dXTemplateItem})).intValue();
        }
        if (o(str, j, dXTemplateItem)) {
            x(str, j, dXTemplateItem);
            LinkedList linkedList = (LinkedList) ((HashMap) this.d.get(j).f29371a).get(dXTemplateItem.f7343a);
            int size = linkedList.size();
            Iterator descendingIterator = linkedList.descendingIterator();
            while (descendingIterator.hasNext()) {
                DXTemplateItem dXTemplateItem2 = (DXTemplateItem) descendingIterator.next();
                if (dXTemplateItem.b == dXTemplateItem2.b) {
                    if (dXTemplateItem2.f) {
                        if (DinamicXEngine.j0()) {
                            h36.i("DXTemplateInfoManager", str + '|' + dXTemplateItem.f7343a + "内置被降级，无法再降级");
                        }
                        descendingIterator.remove();
                        return 2;
                    }
                    if (size == 1 && DinamicXEngine.j0()) {
                        h36.i("DXTemplateInfoManager", str + '|' + dXTemplateItem.f7343a + "无内置情况，无法再降级");
                    }
                    descendingIterator.remove();
                    return 1;
                }
            }
        }
        return 0;
    }
}
