package com.taobao.tao.powermsg.managers;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.managers.MultiSubscribeManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.b5n;
import tb.iyv;
import tb.jg4;
import tb.n8l;
import tb.t2o;
import tb.x4u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "StateManager";

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayMap<String, ArrayMap<String, C0718a>> f12583a = new ArrayMap<>();
    public static final Map<String, x4u> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.powermsg.managers.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class C0718a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12584a;
        public String d;
        public String e;
        public String f;
        public String b = "";
        public String c = "";
        public boolean g = false;
        public int h = 1;
        public int i = 3;
        public final ArrayMap<String, String> j = new ArrayMap<>();
        public final ArrayList<MultiSubscribeManager.f> k = new ArrayList<>();
        public final ArrayList<MultiSubscribeManager.f> l = new ArrayList<>();

        static {
            t2o.a(628097278);
        }

        public static String b(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9984e99", new Object[]{new Integer(i), str});
            }
            return i + "c:" + str;
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e3fe30", new Object[]{this, str})).booleanValue();
            }
            String str2 = this.c;
            if (str == null) {
                str = "";
            }
            return str2.equals(str);
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67dae25a", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.c = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "SubscribeItem{status=" + this.f12584a + ", topic='" + this.b + "', bizTag='" + this.c + "', pChannel='" + this.d + "', from='" + this.e + "', ext='" + this.f + "', bind=" + this.j + '}';
        }
    }

    static {
        t2o.a(628097277);
    }

    public static synchronized boolean b(int i, String str, String str2, String str3) {
        C0718a aVar;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef0086dd", new Object[]{new Integer(i), str, str2, str3})).booleanValue();
            }
            ArrayMap<String, C0718a> arrayMap = f12583a.get(str);
            if (arrayMap == null || (aVar = arrayMap.get(iyv.j(str2))) == null) {
                return true;
            }
            return aVar.a(str2);
        }
    }

    public static synchronized List<C0718a> c() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a6ca0415", new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            for (ArrayMap<String, C0718a> arrayMap : f12583a.values()) {
                arrayList.addAll(arrayMap.values());
            }
            return arrayList;
        }
    }

    public static synchronized Pair<Integer, Integer> d(String str, String str2) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("aa78a085", new Object[]{str, str2});
            }
            C0718a e = e(str, iyv.j(str2));
            if (e != null) {
                return new Pair<>(Integer.valueOf(e.h), Integer.valueOf(e.i));
            }
            return new Pair<>(1, 3);
        }
    }

    public static synchronized C0718a e(String str, String str2) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0718a) ipChange.ipc$dispatch("f8c44d9e", new Object[]{str, str2});
            }
            ArrayMap<String, C0718a> arrayMap = f12583a.get(str);
            if (arrayMap == null) {
                return null;
            }
            return arrayMap.get(str2);
        }
    }

    public static x4u f(int i, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("a19e7fda", new Object[]{new Integer(i), str});
        } else {
            obj = ((ConcurrentHashMap) b).get(g(i, str));
        }
        return (x4u) obj;
    }

    public static String g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38c9f160", new Object[]{new Integer(i), str});
        }
        return i + "_" + str;
    }

    public static boolean i(String str, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3871743", new Object[]{str, str2})).booleanValue();
        }
        C0718a e = e(str, iyv.j(str2));
        if (e == null || ((i = e.f12584a) != 2 && i != 3)) {
            return false;
        }
        return true;
    }

    public static synchronized boolean j(String str) {
        boolean z = false;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88b391b4", new Object[]{str})).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && f12583a.containsKey(str)) {
                z = true;
            }
            return z;
        }
    }

    public static synchronized C0718a k(String str, String str2, String str3, String str4, String str5, String str6) {
        C0718a aVar;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0718a) ipChange.ipc$dispatch("569c556d", new Object[]{str, str2, str3, str4, str5, str6});
            }
            ArrayMap<String, ArrayMap<String, C0718a>> arrayMap = f12583a;
            ArrayMap<String, C0718a> arrayMap2 = arrayMap.get(str);
            if (arrayMap2 == null) {
                arrayMap2 = new ArrayMap<>();
                arrayMap.put(str, arrayMap2);
                aVar = null;
            } else {
                aVar = arrayMap2.get(str2);
            }
            if (aVar == null) {
                aVar = new C0718a();
                aVar.b = str;
                aVar.d = str4;
                aVar.e = str5;
                aVar.f = str6;
                aVar.c(str3);
                arrayMap2.put(str2, aVar);
            }
            return aVar;
        }
    }

    public static void l(int i, String str, x4u x4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fd122f", new Object[]{new Integer(i), str, x4uVar});
            return;
        }
        String g = g(i, str);
        if (!n8l.e() || !((ConcurrentHashMap) b).containsKey(g)) {
            ((ConcurrentHashMap) b).put(g, x4uVar);
        }
    }

    public static synchronized void m(String str, String str2) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa41d76a", new Object[]{str, str2});
                return;
            }
            ArrayMap<String, ArrayMap<String, C0718a>> arrayMap = f12583a;
            ArrayMap<String, C0718a> arrayMap2 = arrayMap.get(str);
            if (arrayMap2 != null) {
                arrayMap2.remove(str2);
                if (arrayMap2.size() < 1) {
                    arrayMap.remove(str);
                }
            }
        }
    }

    public static synchronized void o(String str, String str2, int i, int i2) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a252de39", new Object[]{str, str2, new Integer(i), new Integer(i2)});
                return;
            }
            e(str, iyv.j(str2));
            n(str, str2, i, i2);
        }
    }

    public static x4u p(int i, String str) {
        Object remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            remove = ipChange.ipc$dispatch("5b650d94", new Object[]{new Integer(i), str});
        } else {
            remove = ((ConcurrentHashMap) b).remove(g(i, str));
        }
        return (x4u) remove;
    }

    public static synchronized int q(int i, String str, String str2, String str3) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("21adf817", new Object[]{new Integer(i), str, str2, str3})).intValue();
            }
            C0718a e = e(str, iyv.j(str2));
            if (e == null) {
                return 0;
            }
            ArrayMap<String, String> arrayMap = e.j;
            if (TextUtils.isEmpty(str3)) {
                str3 = "_default";
            }
            arrayMap.remove(C0718a.b(i, str3));
            return e.j.size();
        }
    }

    public static boolean h(int i, String str, String str2, String str3) {
        ArrayMap<String, String> arrayMap;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a9d49a", new Object[]{new Integer(i), str, str2, str3})).booleanValue();
        }
        C0718a e = e(str, iyv.j(str2));
        if (e != null) {
            arrayMap = e.j;
            str4 = C0718a.b(i, TextUtils.isEmpty(str3) ? "_default" : str3);
            if (arrayMap.get(str4) != null) {
                return true;
            }
        } else {
            arrayMap = null;
            str4 = null;
        }
        if (!"ubee".equals(str3)) {
            Boolean valueOf = Boolean.valueOf(e == null);
            if (arrayMap == null) {
                str5 = "null";
            } else {
                str5 = arrayMap.toString();
            }
            MsgLog.g(TAG, "isSubscribed >", valueOf, "key:", str4, "map:", str5);
        }
        return false;
    }

    public static synchronized void n(String str, String str2, int i, int i2) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df839a5", new Object[]{str, str2, new Integer(i), new Integer(i2)});
                return;
            }
            C0718a k = k(str, iyv.j(str2), str2, null, null, null);
            if (i2 <= 0) {
                if (b5n.a(i)) {
                    i2 = jg4.a("push_aside_pull_duration", 3);
                } else {
                    i2 = jg4.a("pull_duration", 1);
                }
            }
            if (i > 0 && i2 > 0 && !(k.h == i && k.i == i2)) {
                MsgLog.g(TAG, "set role >", Integer.valueOf(i), "duration:", Integer.valueOf(i2), "topic:", str, "bizTag:", str2);
                k.h = i;
                k.i = i2;
            }
        }
    }

    public static synchronized int a(int i, String str, String str2, String str3) {
        C0718a aVar;
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7ebb7c93", new Object[]{new Integer(i), str, str2, str3})).intValue();
            }
            ArrayMap<String, ArrayMap<String, C0718a>> arrayMap = f12583a;
            ArrayMap<String, C0718a> arrayMap2 = arrayMap.get(str);
            if (arrayMap.size() > 1) {
                MsgMonitor.b("POWERMSG", "sub_err_together", "" + arrayMap.size(), 1.0d);
            }
            if (arrayMap.size() >= 60) {
                MsgLog.g(TAG, "cannot Subscribe,SUB_TOPIC_LMT!!! >", Integer.valueOf(i), "topic:", str, str2);
                return -3012;
            }
            if (!(arrayMap2 == null || (aVar = arrayMap2.get(iyv.j(str2))) == null)) {
                if (aVar.g) {
                    return 1000;
                }
                String b2 = C0718a.b(i, TextUtils.isEmpty(str3) ? "_default" : str3);
                if (!aVar.a(str2) || aVar.j.get(b2) != null) {
                    return -3011;
                }
            }
            return 1000;
        }
    }
}
