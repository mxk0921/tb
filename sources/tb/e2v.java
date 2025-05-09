package tb;

import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e2v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_SEQ = "ut_seq";

    /* renamed from: a  reason: collision with root package name */
    public static final List<c> f18238a = new ArrayList();
    public static int b = 0;
    public static List<String> c = null;
    public static String d = null;
    public static boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                e2v.access$000(iaq.a(wu3.c().b(), e2v.UT_SEQ));
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return e2v.UT_SEQ;
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
            } else {
                e2v.access$000(str);
            }
        }
    }

    static {
        t2o.a(962593172);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b88f604", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            e(str);
        }
    }

    public static int b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd157602", new Object[]{new Integer(i), str})).intValue();
        }
        int i2 = -1;
        for (int size = ((ArrayList) f18238a).size() - 1; size >= 0; size--) {
            c cVar = (c) ((ArrayList) f18238a).get(size);
            if (cVar != null && i == cVar.pageId) {
                if (i2 < 0) {
                    i2 = size;
                }
                if (a(str, cVar.pageName)) {
                    return size;
                }
            }
        }
        return i2;
    }

    public static List<String> c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c7fdc670", new Object[]{new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        int size = ((ArrayList) f18238a).size();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (size - 1) - i2;
            if (i3 < 0) {
                break;
            }
            c cVar = (c) ((ArrayList) f18238a).get(i3);
            if (cVar != null) {
                arrayList.add(cVar.spmUrl);
            }
        }
        return arrayList;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!e) {
            e = true;
            nhh.f("UTPageSequenceMgr", "init");
            zdt.c().f(new a());
            UTClientConfigMgr.c().e(new b());
        }
    }

    public static synchronized void e(String str) {
        Map map;
        synchronized (e2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ca5b5bc", new Object[]{str});
            } else if ((str == null || !str.equalsIgnoreCase(d)) && !(str == null && d == null)) {
                d = str;
                iaq.b(wu3.c().b(), UT_SEQ, d);
                String str2 = d;
                if (str2 != null) {
                    try {
                        Map map2 = (Map) JSON.parseObject(str2, Map.class);
                        if (map2 != null && map2.size() > 0 && (map = (Map) map2.get("spm_seq")) != null && map.size() > 0) {
                            b = ((Integer) map.get("count")).intValue();
                            c = (List) map.get("page");
                        }
                    } catch (Exception e2) {
                        nhh.h("UTPageSequenceMgr", e2, new Object[0]);
                    }
                } else {
                    b = 0;
                    c = null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public int pageId;
        public String pageName;
        public String spmUrl;

        static {
            t2o.a(962593175);
        }

        public c() {
            this.pageName = "";
            this.spmUrl = "-";
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d63bb49", new Object[]{new Integer(i)});
            return;
        }
        List<c> list = f18238a;
        int size = ((ArrayList) list).size();
        int i2 = size - 1;
        if (i > i2) {
            nhh.i("UTPageSequenceMgr", "popIndex", Integer.valueOf(i), "maxIndex", Integer.valueOf(i2));
        } else {
            ((ArrayList) list).subList(i + 1, size).clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[Catch: all -> 0x0019, Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:12:0x0022, B:14:0x0037, B:21:0x0047, B:26:0x0057, B:28:0x005d, B:30:0x006c, B:31:0x0071, B:32:0x00a7, B:33:0x00b9, B:35:0x00bd, B:37:0x00c1, B:39:0x00c7), top: B:48:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x0019, Exception -> 0x0043, TryCatch #1 {Exception -> 0x0043, blocks: (B:12:0x0022, B:14:0x0037, B:21:0x0047, B:26:0x0057, B:28:0x005d, B:30:0x006c, B:31:0x0071, B:32:0x00a7, B:33:0x00b9, B:35:0x00bd, B:37:0x00c1, B:39:0x00c7), top: B:48:0x0022, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void pushNode(java.lang.Object r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e2v.pushNode(java.lang.Object, java.util.Map):void");
    }
}
