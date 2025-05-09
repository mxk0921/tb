package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.index.d;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class tan implements igd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f28596a;
    public final d b;
    public final c c;
    public final obn d;
    public final kgd e;
    public final b7o f;
    public final ws3 g;

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
                tan.a(tan.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                } else if (!tan.d(tan.this).b()) {
                    RSoLog.d("RSoCleaner, skip removeExpiredRuntimeDir in other process");
                } else {
                    goq.d(tan.d(tan.this).getApp());
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                tan.b(tan.this);
            } catch (Throwable th) {
                rbn.g("RSoCleaner,cleanExpiredLib", th);
            }
            try {
                tan.c(tan.this);
            } catch (Throwable th2) {
                rbn.g("RSoCleaner,checkDamagedLib", th2);
            }
            rbn.i("RSoCleaner,removeExpiredRuntimeDir", new a());
        }
    }

    public tan(cgd cgdVar, d dVar, c cVar, obn obnVar, kgd kgdVar, b7o b7oVar, ws3 ws3Var) {
        this.f28596a = cgdVar;
        this.b = dVar;
        this.c = cVar;
        this.d = obnVar;
        this.e = kgdVar;
        this.f = b7oVar;
        this.g = ws3Var;
    }

    public static /* synthetic */ void a(tan tanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fa536b", new Object[]{tanVar});
        } else {
            tanVar.l();
        }
    }

    public static /* synthetic */ void b(tan tanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404ea8ac", new Object[]{tanVar});
        } else {
            tanVar.f();
        }
    }

    public static /* synthetic */ void c(tan tanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a2fded", new Object[]{tanVar});
        } else {
            tanVar.e();
        }
    }

    public static /* synthetic */ kgd d(tan tanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgd) ipChange.ipc$dispatch("72a340bd", new Object[]{tanVar});
        }
        return tanVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.io.File r5, java.util.List<java.lang.String> r6, java.util.Set<java.lang.String> r7, java.lang.String r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tan.g(java.io.File, java.util.List, java.util.Set, java.lang.String, java.util.List):void");
    }

    public final boolean i(String str, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487dbd47", new Object[]{this, str, soFileInfo})).booleanValue();
        }
        try {
            z6o b2 = j.b(this.b, str);
            if (trq.d(soFileInfo.getMd5(), b2.d())) {
                RSoLog.d("RSoCleaner, last cache equals current info, libName=" + str);
                return true;
            } else if (this.f.h(b2).j()) {
                return false;
            } else {
                RSoLog.d("RSoCleaner, last cache need keep, !result.isSuccess(), libName=" + str);
                return true;
            }
        } catch (Throwable unused) {
            RSoLog.b("RSoCleaner, isLastInfoUseful, " + str + " from last not exists in current");
            return true;
        }
    }

    public final List<String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b5c1d34", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (SoIndexData soIndexData : this.c.j()) {
                for (Map.Entry<String, SoIndexData.SoIndexEntry> entry : soIndexData.getEntries().entrySet()) {
                    String key = entry.getKey();
                    Map<String, SoIndexData.SoFileInfo> files = entry.getValue().getFiles();
                    SoIndexData.SoFileInfo soFileInfo = files.get(this.e.d());
                    if (soFileInfo == null) {
                        RSoLog.d("RSoCleaner, last cache, lastCacheInfo == null, indexEntry.getFiles()=" + files);
                    } else if (i(key, soFileInfo)) {
                        arrayList.add(soFileInfo.provideStorageKey());
                        RSoLog.d("RSoCleaner, last cache useful, add to results, , libName=" + key + ", key=" + soFileInfo.provideStorageKey());
                    }
                }
            }
        } catch (Throwable th) {
            rbn.g("RSoCleaner,listUselessLastCache", th);
        }
        return arrayList;
    }

    public final Set<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("78456d11", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        try {
            Collection<SoIndexData.SoFileInfo> o = this.b.o();
            for (SoIndexData.SoFileInfo soFileInfo : o) {
                if (soFileInfo == null) {
                    RSoLog.d("RSoCleaner, list info, info == null, infoList=" + o);
                } else {
                    hashSet.add(soFileInfo.provideStorageKey());
                }
            }
        } catch (Throwable th) {
            rbn.g("listUsefulStorageKeys", th);
        }
        return hashSet;
    }

    @Override // tb.igd
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
            return;
        }
        RSoLog.d("RSoCleaner, triggerCleaner(), enter ");
        qbn.d(new a());
        qbn.e(new b(), TimeUnit.SECONDS.toMillis(30L));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa76b1f", new Object[]{this});
            return;
        }
        RSoLog.d("RSoCleaner, checkDamagedLib(),    enter ");
        if (!this.f28596a.a("key_switch_check_damaged_lib_enabled", true)) {
            RSoLog.d("RSoCleaner, checkDamagedLib(), skipped: enabled == false");
            return;
        }
        List<File> f = this.d.f();
        RSoLog.d("RSoCleaner, checkDamagedLib(), existingLibDir.size=" + f.size());
        ArrayList arrayList = new ArrayList();
        for (File file : f) {
            String name = file.getName();
            if (ws3.b(name)) {
                arrayList.clear();
                jg9.l(file, arrayList);
                if (h(arrayList, name)) {
                    uos.e(file);
                    RSoLog.d("RSoCleaner, checkDamagedLib(), will delete damaged libDir=" + file.getPath());
                }
            } else if (ws3.c(name)) {
                rbn.e("RSoCleaner, checkDamagedLib, name not as Md5, error", file.getPath());
            }
        }
        RSoLog.d("RSoCleaner, checkDamagedLib(), finish");
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4633850", new Object[]{this});
            return;
        }
        RSoLog.d("RSoCleaner, cleanExpiredLib(),    enter ");
        if (!this.f28596a.a("key_cleaner_enabled3", true)) {
            RSoLog.g("RSoCleaner, cleanExpiredLib(), skipped: cleanerEnabled == false");
            return;
        }
        List<File> f = this.d.f();
        RSoLog.d("RSoCleaner, cleanExpiredLib(), existingLibDir.size=" + f.size());
        Iterator<File> it = f.iterator();
        while (it.hasNext()) {
            RSoLog.d("RSoCleaner, cleanExpiredLib(), existingLibDir=" + it.next().getName());
        }
        Set<String> k = k();
        RSoLog.d("RSoCleaner, cleanExpiredLib(), libUsefulStorageKeys.size=" + k.size());
        Iterator<String> it2 = k.iterator();
        while (it2.hasNext()) {
            RSoLog.d("RSoCleaner, cleanExpiredLib(), libUsefulStorageKey=" + it2.next());
        }
        if (k.size() <= 1 || k.size() >= 5) {
            List<String> j = j();
            RSoLog.d("RSoCleaner, cleanExpiredLib(), usefulLastCacheKeys=" + j);
            String n = this.b.n();
            RSoLog.d("RSoCleaner, cleanExpiredLib(), advancedContent.length=" + n.length());
            List<String> d = this.g.d();
            for (File file : f) {
                g(file, j, k, n, d);
            }
            RSoLog.d("RSoCleaner, cleanExpiredLib(), finish ");
            return;
        }
        rbn.e("RSoCleaner, cleanExpiredLib(), libUsefulStorageKeys not available", k.toString());
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4f8bc5", new Object[]{this});
            return;
        }
        Collection<File> k = jg9.k(new File(this.d.d()), false);
        HashMap hashMap = new HashMap();
        long j = 0;
        for (File file : k) {
            j += file.length();
        }
        long j2 = (j / 1000) / 1000;
        if (j2 > 180) {
            rbn.e("storage>180", k.toString());
        }
        hashMap.put("rSoStore_Space", Long.valueOf(j2));
        hashMap.put("ext_Space", Integer.valueOf(k.size()));
        rbn.d(ngd.POINT_CLEANER_SPACE, hashMap);
        RSoLog.d("RSoCleaner, trackUsedSpace(), finish ");
    }

    public final boolean h(List<File> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d2fb658", new Object[]{this, list, str})).booleanValue();
        }
        if (list.size() == 0) {
            return false;
        }
        for (File file : list) {
            if (file.getName().endsWith(jcq.SO_EXTENSION) && !this.e.a(str, file.getPath())) {
                rbn.e("RSoCleaner,damagedLib", "path=" + file.getPath() + ", size=" + file.length());
                return true;
            }
        }
        return false;
    }
}
