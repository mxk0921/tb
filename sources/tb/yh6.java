package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yh6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEANUP = "CleanUp";
    public static final String CONFIG_KEY_BIZTYPE = "bizType";
    public static final String CONFIG_KEY_DELETE_INTERVAL = "deleteInterval";
    public static final String CONFIG_KEY_DELETE_STRATEGY = "deleteStrategy";
    public static final String CONFIG_KEY_EXPIRED_STRATEGY = "expiredStrategy";
    public static final String CONFIG_KEY_EXPIRED_TIME = "expiredTime";
    public static final String CONFIG_KEY_RETAIN_COUNT = "retainCount";
    public static final String CONFIG_KEY_RETAIN_ORDER = "retainOrder";
    public static final String CONFIG_KEY_TEMPLATE_NAME = "templateName";
    public static final int DEFAULT_DELETE_INTERVAL = 7;
    public static final String DEFAULT_DELETE_STRATEGY = "mark_dirty";
    public static final String DEFAULT_EXPIRED_STRATEGY = "lastModified";
    public static final int DEFAULT_EXPIRED_TIME = 365;
    public static final int DEFAULT_RETAIN_COUNT = 3;
    public static final String DEFAULT_RETAIN_ORDER = "version";
    public static final String DELETE_STRATEGY_ALL_DELETE = "all_delete";
    public static final String DELETE_STRATEGY_MARK_DIRTY_DELETE_FILE = "mark_dirty";
    public static final String EXPIRED_STRATEGY_LAST_MODIFIED = "lastModified";
    public static final String RETAIN_ORDER_VERSION = "version";
    public static final String SP_KEY_LATEST_EXEC_TIME = "latest_exec_time";
    public static final String SP_NAME = "dx_template_storage";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            return file.isDirectory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            return file.isDirectory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            return file.isDirectory();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            return (int) (Long.parseLong(file.getName()) - Long.parseLong(file2.getName()));
        }
    }

    static {
        t2o.a(444596965);
    }

    public static /* synthetic */ void a(String str, String str2, DXTemplateItem dXTemplateItem, Map map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97329f53", new Object[]{str, str2, dXTemplateItem, map, new Long(j)});
        } else {
            w(str, str2, dXTemplateItem, map, j);
        }
    }

    public static long b(File file) {
        File[] listFiles;
        long b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99902053", new Object[]{file})).longValue();
        }
        long j = 0;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    b2 = file2.length();
                } else if (file2.isDirectory()) {
                    b2 = b(file2);
                }
                j += b2;
            }
        }
        return j;
    }

    @Deprecated
    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91f7b90a", new Object[0])).longValue();
        }
        boolean z = true;
        long j = 0;
        if (!z()) {
            if (DinamicXEngine.j0()) {
                h36.g("DXTemplateStorageManager", "最近已执行过一次文件删除, 跳过");
            }
            x(0L, true);
            return 0L;
        }
        try {
            Map<String, Map<String, f>> e2 = e();
            if (e2 != null && !e2.isEmpty()) {
                for (Map.Entry<String, Map<String, f>> entry : e2.entrySet()) {
                    String key = entry.getKey();
                    Map<String, f> value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null && !value.isEmpty()) {
                        for (f fVar : value.values()) {
                            j += d(key, fVar);
                        }
                    }
                }
            }
            t();
            z = false;
        } catch (Throwable th) {
            v(th);
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXTemplateStorageManager", "deleteStaleTemplateFiles deletedSize: " + j + "KB");
        }
        if (!z) {
            x(j, false);
        }
        u(j);
        return j;
    }

    public static long d(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a2bfedd", new Object[]{str, fVar})).longValue();
        }
        if (fVar == null) {
            return 0L;
        }
        String i = i();
        int hashCode = i.hashCode();
        if (hashCode == 931332064) {
            i.equals("mark_dirty");
        } else if (hashCode == 1099440649 && i.equals(DELETE_STRATEGY_ALL_DELETE)) {
            if (!sh6.c().b(str, fVar.f32087a)) {
                return 0L;
            }
            uh6.h().A(str, fVar.f32087a);
            return fVar.a(str);
        }
        if (!sh6.c().k(str, fVar.f32087a)) {
            return 0L;
        }
        uh6.h().A(str, fVar.f32087a);
        return fVar.a(str);
    }

    public static Map<String, Map<String, f>> e() {
        File[] listFiles;
        Map<String, f> f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e523ee80", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        String c2 = dx5.d().c();
        Map<String, Set<String>> p = p();
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        File file = new File(c2);
        if (!file.exists() || (listFiles = file.listFiles(new a())) == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            if ((r(file2.getName()) || q(file2.getName()) || p.containsKey(file2.getName()) || zg5.S4()) && (f2 = f(file2)) != null) {
                hashMap.put(file2.getName(), f2);
            }
        }
        return hashMap;
    }

    public static Map<String, f> f(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("292cc124", new Object[]{file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        File[] listFiles = file.listFiles(new b());
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            f g = g(name, file2);
            if (g != null) {
                hashMap.put(file2.getName(), g);
            }
        }
        return hashMap;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6acf9200", new Object[0])).intValue();
        }
        return srf.e(CONFIG_KEY_DELETE_INTERVAL, zg5.U2(), 7) * wu2.DAY;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cae0f845", new Object[0]);
        }
        return srf.h(CONFIG_KEY_DELETE_STRATEGY, zg5.U2(), "mark_dirty");
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2a9746d", new Object[]{str});
        }
        return srf.h(CONFIG_KEY_EXPIRED_STRATEGY, zg5.a3(str), "lastModified");
    }

    public static long k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41b167e1", new Object[]{str})).longValue();
        }
        return srf.e("expiredTime", zg5.a3(str), DEFAULT_EXPIRED_TIME) * 86400000;
    }

    public static int l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("317ef558", new Object[]{str})).intValue();
        }
        return srf.e(CONFIG_KEY_RETAIN_COUNT, zg5.a3(str), 3);
    }

    public static Comparator<File> m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Comparator) ipChange.ipc$dispatch("bf2929ab", new Object[]{str});
        }
        String h = srf.h(CONFIG_KEY_RETAIN_ORDER, zg5.a3(str), "version");
        if (h.hashCode() == 351608024) {
            h.equals("version");
        }
        return new d();
    }

    public static SharedPreferences n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("25a999ae", new Object[0]);
        }
        Context x = DinamicXEngine.x();
        if (x == null) {
            return null;
        }
        return x.getSharedPreferences(SP_NAME, 0);
    }

    public static Map<String, Set<String>> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("852422cb", new Object[0]);
        }
        JSONArray Z2 = zg5.Z2();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < Z2.size(); i++) {
            JSONObject jSONObject = Z2.getJSONObject(i);
            String string = jSONObject.getString("bizType");
            String string2 = jSONObject.getString(CONFIG_KEY_TEMPLATE_NAME);
            if (hashMap.containsKey(string)) {
                ((Set) hashMap.get(string)).add(string2);
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(string2);
                hashMap.put(string, hashSet);
            }
        }
        return hashMap;
    }

    public static Map<String, Set<String>> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd0a9ea6", new Object[0]);
        }
        JSONArray e3 = zg5.e3();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < e3.size(); i++) {
            JSONObject jSONObject = e3.getJSONObject(i);
            String string = jSONObject.getString("bizType");
            String string2 = jSONObject.getString(CONFIG_KEY_TEMPLATE_NAME);
            if (hashMap.containsKey(string)) {
                ((Set) hashMap.get(string)).add(string2);
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(string2);
                hashMap.put(string, hashSet);
            }
        }
        return hashMap;
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d431d394", new Object[]{str})).booleanValue();
        }
        return zg5.K3(str);
    }

    public static boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5f059cc", new Object[]{str})).booleanValue();
        }
        return zg5.X3(str);
    }

    public static boolean s(String str, long j, long j2, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90181ce7", new Object[]{str, new Long(j), new Long(j2), file})).booleanValue();
        }
        if (!file.exists()) {
            return false;
        }
        if (str.hashCode() == 1959003007) {
            str.equals("lastModified");
        }
        if (j - file.lastModified() >= j2) {
            return true;
        }
        return false;
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddab7911", new Object[0]);
            return;
        }
        SharedPreferences n = n();
        if (n != null) {
            n.edit().putLong(SP_KEY_LATEST_EXEC_TIME, System.currentTimeMillis()).apply();
        }
    }

    public static void u(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e929c906", new Object[]{new Long(j)});
            return;
        }
        try {
            jb6.i(new e(j));
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void v(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dd521e", new Object[]{th});
            return;
        }
        xv5.b(th);
        com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("dinamicx");
        fVar.c = new ArrayList();
        f.a aVar = new f.a("native", "native_crash", com.taobao.android.dinamicx.f.DX_ERROR_STORAGE_PERF_ERROR);
        aVar.e = xv5.a(th);
        fVar.c.add(aVar);
        ic5.p(fVar);
    }

    public static void w(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557148ac", new Object[]{str, str2, dXTemplateItem, map, new Long(j)});
        } else {
            ic5.u(0, str2, CLEANUP, str, dXTemplateItem, map, j, true);
        }
    }

    public static void x(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6558c2", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        try {
            com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f("dinamicx");
            fVar.c = new ArrayList();
            f.a aVar = new f.a("native", "native_crash", z ? com.taobao.android.dinamicx.f.DX_ERROR_STORAGE_PERF_SUCCESS_SKIP : com.taobao.android.dinamicx.f.DX_ERROR_STORAGE_PERF_SUCCESS);
            if (z) {
                aVar.e = "DXTemplateStorageManager: 最近已执行过一次文件删除, 跳过";
            } else {
                aVar.e = "DXTemplateStorageManager deleteStaleTemplateFiles deletedSize: " + j + "KB";
            }
            fVar.c.add(aVar);
            ic5.p(fVar);
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void y(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73142b9c", new Object[]{str, new Long(j), dXTemplateItem});
        } else if ((r(str) || q(str) || p().containsKey(str)) && zg5.S4() && !TextUtils.isEmpty(str) && dXTemplateItem != null) {
            try {
                if (uh6.h().p(str, dXTemplateItem)) {
                    com.taobao.android.dinamicx.f fVar = new com.taobao.android.dinamicx.f(str);
                    fVar.c = new ArrayList();
                    f.a aVar = new f.a("Template_Fetch", "Engine_Fetch", com.taobao.android.dinamicx.f.DX_ERROR_FETCH_TEMPLATE_DIRTY);
                    ((ArrayList) fVar.c).add(aVar);
                    fVar.b = dXTemplateItem;
                    try {
                        Set<Long> l = uh6.h().l(str, j, dXTemplateItem.f7343a);
                        if (l != null) {
                            aVar.e = "templateVersions: " + TextUtils.join(",", l);
                        }
                    } catch (Exception e2) {
                        aVar.e = "templateVersions: error " + xv5.a(e2);
                    }
                    ic5.p(fVar);
                    if (DinamicXEngine.j0()) {
                        h36.g("DXTemplateStorageManager", "访问了已被删除的模版: " + dXTemplateItem.d());
                    }
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae34e970", new Object[0])).booleanValue();
        }
        int h = h();
        SharedPreferences n = n();
        if (n == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - n.getLong(SP_KEY_LATEST_EXEC_TIME, currentTimeMillis) >= h) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final List<File> b = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        public final List<DXTemplateItem> f32087a = new ArrayList();

        static {
            t2o.a(444596973);
        }

        public f(String str, List<File> list) {
            for (File file : list) {
                String name = file.getName();
                if (!TextUtils.isEmpty(name)) {
                    long g = o66.g(name);
                    if (g != 0) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        dXTemplateItem.f7343a = str;
                        dXTemplateItem.b = g;
                        this.f32087a.add(dXTemplateItem);
                        this.b.add(file);
                    }
                }
            }
        }

        public long a(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd1ed196", new Object[]{this, str})).longValue();
            }
            long[] jArr = new long[1];
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (!yh6.q(str)) {
                    boolean a2 = u06.a(file, jArr);
                    StringBuilder sb = new StringBuilder("deleteDir ");
                    if (a2) {
                        str2 = "success";
                    } else {
                        str2 = "fail";
                    }
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(file.getAbsolutePath());
                    String sb2 = sb.toString();
                    if (DinamicXEngine.j0()) {
                        h36.g("DXTemplateStorageManager", sb2);
                    }
                    la6.b("DXTemplateStorageManager: " + sb2);
                }
            }
            return jArr[0] / 1024;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f32086a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements FileFilter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(e eVar) {
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                }
                return file.isDirectory();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements FileFilter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(e eVar) {
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                }
                return file.isDirectory();
            }
        }

        public e(long j) {
            this.f32086a = j;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/template/DXTemplateStorageManager$5");
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            e eVar = this;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{eVar});
                return;
            }
            long nanoTime = System.nanoTime();
            HashMap hashMap = new HashMap();
            hashMap.put("deletedSize", String.valueOf(eVar.f32086a));
            hashMap.put("strategy", yh6.i());
            hashMap.put("expiredTime", String.valueOf((int) yh6.DEFAULT_EXPIRED_TIME));
            hashMap.put("remainCount", String.valueOf(3));
            hashMap.put(yh6.CONFIG_KEY_DELETE_INTERVAL, String.valueOf(yh6.h()));
            String c = dx5.d().c();
            if (!TextUtils.isEmpty(c)) {
                File file = new File(c);
                if (!(!file.exists() || (listFiles = file.listFiles(new a(eVar))) == null || listFiles.length == 0)) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        long b2 = yh6.b(file2) / 1024;
                        if (b2 > 1024) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("size", (Object) Long.valueOf(b2));
                            jSONObject.put("bizType", (Object) file2.getName());
                            jSONArray.add(jSONObject);
                        }
                        File[] listFiles2 = file2.listFiles(new b(eVar));
                        if (!(listFiles2 == null || listFiles2.length == 0)) {
                            int i2 = 0;
                            for (int length2 = listFiles2.length; i2 < length2; length2 = length2) {
                                File file3 = listFiles2[i2];
                                long b3 = yh6.b(file3) / 1024;
                                if (b3 > zg5.b3()) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("size", (Object) Long.valueOf(b3));
                                    jSONObject2.put("bizType", (Object) file2.getName());
                                    jSONObject2.put("template", (Object) file3.getName());
                                    jSONArray2.add(jSONObject2);
                                }
                                i2++;
                                listFiles2 = listFiles2;
                            }
                        }
                        i++;
                        eVar = this;
                    }
                    String json = jSONArray.toString();
                    String json2 = jSONArray2.toString();
                    hashMap.put("existFiles", json);
                    hashMap.put("templateFiles", json2);
                    hashMap.put("totalSize", String.valueOf(yh6.b(file) / 1024));
                    yh6.a(yh6.CLEANUP, yh6.CLEANUP, null, hashMap, System.nanoTime() - nanoTime);
                }
            }
        }
    }

    public static f g(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("79cf3dcc", new Object[]{str, file});
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Set<String> set = o().get(str);
        if (set != null && set.contains(name)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> set2 = p().get(str);
        if (set2 == null) {
            set2 = new HashSet<>();
        }
        File[] listFiles = file.listFiles(new c());
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        Arrays.sort(listFiles, m(str));
        long currentTimeMillis = System.currentTimeMillis();
        int l = l(str);
        String j = j(str);
        long k = k(str);
        for (int i = 0; i < listFiles.length; i++) {
            File file2 = listFiles[i];
            if (i < listFiles.length - l || set2.contains(name)) {
                arrayList.add(file2);
            } else if (s(j, currentTimeMillis, k, new File(file2, wh6.DX_MAIN_TEMPLATE_NAME))) {
                arrayList.add(file2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f(name, arrayList);
    }
}
