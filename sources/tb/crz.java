package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.brz;
import tb.w6z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class crz implements brz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String NANO_COMPOSE_MAIN_FILE_SUFFIX = ".dx";

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> f17274a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737224);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737223);
        t2o.a(598737219);
    }

    public crz() {
        new ReentrantReadWriteLock();
    }

    @Override // tb.brz
    public ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b03d1710", new Object[]{this});
        }
        return this.f17274a;
    }

    @Override // tb.brz
    public TemplateItem b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("5db7206a", new Object[]{this, str, str2, new Long(j)});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        ConcurrentSkipListMap<Long, TemplateItem> e = e(str, str2);
        if (e == null) {
            return null;
        }
        return e.get(Long.valueOf(j));
    }

    @Override // tb.brz
    public ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("2ec33311", new Object[]{this});
        }
        return this.b;
    }

    public final TemplateItem g(String str, long j, String str2, boolean z) {
        String str3;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("d365960f", new Object[]{this, str, new Long(j), str2, new Boolean(z)});
        }
        List d = ybn.d(ybn.INSTANCE, null, str, 1, null);
        if (d == null) {
            str3 = null;
        } else {
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (tsq.w((String) obj, NANO_COMPOSE_MAIN_FILE_SUFFIX, false, 2, null)) {
                    break;
                }
            }
            str3 = (String) obj;
        }
        if (str3 == null) {
            return null;
        }
        TemplateItem templateItem = new TemplateItem(str2, j, "");
        templateItem.i(str + wh6.DIR + str3);
        templateItem.h(z);
        return templateItem;
    }

    public boolean f(String str, TemplateItem templateItem) {
        ConcurrentSkipListMap<Long, TemplateItem> putIfAbsent;
        ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> putIfAbsent2;
        ConcurrentSkipListMap<Long, TemplateItem> putIfAbsent3;
        ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> putIfAbsent4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478ab9fa", new Object[]{this, str, templateItem})).booleanValue();
        }
        ckf.g(str, "businessId");
        ckf.g(templateItem, "templateMeta");
        if (templateItem.f()) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> c = c();
            ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap = c.get(str);
            if (concurrentHashMap == null && (putIfAbsent4 = c.putIfAbsent(str, (concurrentHashMap = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap = putIfAbsent4;
            }
            ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap2 = concurrentHashMap;
            String c2 = templateItem.c();
            ConcurrentSkipListMap<Long, TemplateItem> concurrentSkipListMap = concurrentHashMap2.get(c2);
            if (concurrentSkipListMap == null && (putIfAbsent3 = concurrentHashMap2.putIfAbsent(c2, (concurrentSkipListMap = new ConcurrentSkipListMap<>()))) != null) {
                concurrentSkipListMap = putIfAbsent3;
            }
            concurrentSkipListMap.put(Long.valueOf(templateItem.e()), templateItem);
            return true;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> a2 = a();
        ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap3 = a2.get(str);
        if (concurrentHashMap3 == null && (putIfAbsent2 = a2.putIfAbsent(str, (concurrentHashMap3 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap3 = putIfAbsent2;
        }
        ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap4 = concurrentHashMap3;
        String c3 = templateItem.c();
        ConcurrentSkipListMap<Long, TemplateItem> concurrentSkipListMap2 = concurrentHashMap4.get(c3);
        if (concurrentSkipListMap2 == null && (putIfAbsent = concurrentHashMap4.putIfAbsent(c3, (concurrentSkipListMap2 = new ConcurrentSkipListMap<>()))) != null) {
            concurrentSkipListMap2 = putIfAbsent;
        }
        concurrentSkipListMap2.put(Long.valueOf(templateItem.e()), templateItem);
        return true;
    }

    @Override // tb.brz
    public ConcurrentSkipListMap<Long, TemplateItem> e(String str, String str2) {
        TemplateItem h;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentSkipListMap) ipChange.ipc$dispatch("7c96be59", new Object[]{this, str, str2});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        ConcurrentSkipListMap<Long, TemplateItem> b = brz.b.b(this, str, str2);
        if (b != null) {
            return b;
        }
        ReentrantReadWriteLock.ReadLock readLock = o0z.INSTANCE.a(str).readLock();
        readLock.lock();
        try {
            String b2 = w6z.Companion.a().b(str, str2);
            v6z v6zVar = v6z.INSTANCE;
            if (!v6zVar.a(b2)) {
                readLock.unlock();
                return null;
            }
            ConcurrentSkipListMap<Long, TemplateItem> b3 = brz.b.b(this, str, str2);
            if (b3 != null) {
                readLock.unlock();
                return b3;
            }
            List<String> b4 = v6zVar.b(b2);
            int size = b4.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    File file = new File(b4.get(i));
                    if (file.isDirectory()) {
                        String name = file.getName();
                        ckf.f(name, "dir.name");
                        Long o = ssq.o(name);
                        if (!(o == null || (h = h(file, o.longValue(), str2, false)) == null)) {
                            f(str, h);
                        }
                    }
                    i = i2;
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            readLock.unlock();
            return brz.b.b(this, str, str2);
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    public final TemplateItem h(File file, long j, String str, boolean z) {
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("bcd07330", new Object[]{this, file, new Long(j), str, new Boolean(z)});
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                file2 = listFiles[i];
                if (file2.isFile()) {
                    String name = file2.getName();
                    ckf.f(name, "it.name");
                    if (tsq.w(name, NANO_COMPOSE_MAIN_FILE_SUFFIX, false, 2, null)) {
                        break;
                    }
                }
            }
        }
        file2 = null;
        if (file2 == null) {
            return null;
        }
        TemplateItem templateItem = new TemplateItem(str, j, "");
        String absolutePath = file2.getAbsolutePath();
        ckf.f(absolutePath, "it.absolutePath");
        templateItem.i(absolutePath);
        templateItem.h(z);
        return templateItem;
    }

    @Override // tb.brz
    public TemplateItem d(String str, String str2, long j, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("eaf386f5", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        TemplateItem a2 = brz.b.a(this, str, str2, j, z);
        if (a2 != null) {
            return a2;
        }
        w6z.a aVar = w6z.Companion;
        String c = aVar.a().c(str, str2, j);
        ybn ybnVar = ybn.INSTANCE;
        if (ybn.b(ybnVar, null, c, 1, null)) {
            str3 = c;
        } else if (!z) {
            return null;
        } else {
            String a3 = aVar.a().a(str, str2);
            if (!ybn.b(ybnVar, null, a3, 1, null)) {
                return null;
            }
            for (String str4 : ybn.d(ybnVar, null, a3, 1, null)) {
                Long o = ssq.o(str4);
                if (o != null) {
                    TemplateItem g = g(a3 + wh6.DIR + str4, o.longValue(), str2, true);
                    if (g != null && f(str, g)) {
                        return g;
                    }
                }
            }
            str3 = a3;
        }
        TemplateItem g2 = g(str3, j, str2, true);
        if (g2 == null) {
            return null;
        }
        f(str, g2);
        return g2;
    }
}
