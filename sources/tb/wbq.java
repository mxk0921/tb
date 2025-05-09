package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wbq implements qcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wbq f = new wbq();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f30592a = new ConcurrentHashMap();
    public final Map<String, String> b = new ConcurrentHashMap();
    public final ndq c = new ndq();
    public final Map<String, Boolean> d = new ConcurrentHashMap();
    public Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements y49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.y49
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bf56534", new Object[]{this, str, new Integer(i)});
            } else if (i > 2) {
                Log.e("SplitCleaner", "installed feature:" + str);
                wbq.c(wbq.this).put(str, Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            try {
                if (n1r.d(bcq.a().e().j())) {
                    Log.e("SplitCleaner", "do feature clean work ......");
                    if (wbq.d(wbq.this).size() > 0) {
                        String[] strArr = (String[]) wbq.d(wbq.this).keySet().toArray(new String[0]);
                        for (int i = 0; i < strArr.length; i++) {
                            if (wbq.c(wbq.this).containsKey(strArr[i])) {
                                wbq.e(wbq.this, strArr[i]);
                                wbq.d(wbq.this).remove(strArr[i]);
                            }
                        }
                    }
                    if (wbq.c(wbq.this).size() > 0) {
                        for (String str : wbq.c(wbq.this).keySet()) {
                            if (wbq.f(wbq.this, str)) {
                                wbq.e(wbq.this, str);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(wbq wbqVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || !str.endsWith(jcq.APK_EXTENSION)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30595a;

        public d(wbq wbqVar, String str) {
            this.f30595a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            return str.equals(this.f30595a);
        }
    }

    static {
        t2o.a(675282946);
    }

    public static /* synthetic */ Map c(wbq wbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4c8e27f", new Object[]{wbqVar});
        }
        return wbqVar.d;
    }

    public static /* synthetic */ Map d(wbq wbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("57eaf40", new Object[]{wbqVar});
        }
        return wbqVar.f30592a;
    }

    public static /* synthetic */ void e(wbq wbqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e525cd96", new Object[]{wbqVar, str});
        } else {
            wbqVar.g(str);
        }
    }

    public static /* synthetic */ boolean f(wbq wbqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8b551db", new Object[]{wbqVar, str})).booleanValue();
        }
        return wbqVar.n(str);
    }

    public static wbq l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wbq) ipChange.ipc$dispatch("5c6da757", new Object[0]);
        }
        return f;
    }

    @Override // tb.qcc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a327943", new Object[]{this, str, str2});
        } else {
            ((ConcurrentHashMap) this.b).put(str, str2);
        }
    }

    @Override // tb.qcc
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d84dc5", new Object[]{this, str});
            return;
        }
        Log.e("SplitCleaner", "onHisFeatureInvalid......:" + str);
        ((ConcurrentHashMap) this.f30592a).put(str, Boolean.TRUE);
    }

    public final void h(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cdad4e", new Object[]{this, file, str});
            return;
        }
        try {
            if (q(file, str).exists()) {
                String absolutePath = q(file, str).getAbsolutePath();
                Log.e("SplitCleaner", "do clean feature work......:" + absolutePath);
                jcq.e(q(file, str));
            }
            if (o(file, str).exists()) {
                String absolutePath2 = o(file, str).getAbsolutePath();
                Log.e("SplitCleaner", "do clean feature work......:" + absolutePath2);
                jcq.e(o(file, str));
            }
            if (p(file, str).exists()) {
                String absolutePath3 = p(file, str).getAbsolutePath();
                Log.e("SplitCleaner", "do clean feature work......:" + absolutePath3);
                jcq.e(p(file, str));
            }
            if (j(file, str).exists()) {
                String absolutePath4 = j(file, str).getAbsolutePath();
                Log.e("SplitCleaner", "do clean feature work......:" + absolutePath4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final File i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2af8a775", new Object[]{this, file});
        }
        try {
            String b2 = mw4.b(bcq.a().e().j());
            if (TextUtils.isEmpty(b2) || !b2.startsWith("arm64")) {
                return new File(file, "oat/arm");
            }
            return new File(file, "oat/arm64");
        } catch (Exception e) {
            e.printStackTrace();
            return new File(file, "oat/arm64");
        }
    }

    public final File j(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c12fbb23", new Object[]{this, file, str});
        }
        return new File(file, "oat/" + str + ".apk.cur.prof");
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3810c3", new Object[]{this});
        } else {
            this.c.a(new b(), 30L, TimeUnit.SECONDS);
        }
    }

    public void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.e = context;
        o49.b().e(new a(), null);
    }

    public final boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6c4ce0d", new Object[]{this, str})).booleanValue();
        }
        if (!mcq.a().a().contains(str) || ddq.a() == null || !ddq.a().a(str, "baseline").equals("baseline")) {
            return false;
        }
        return true;
    }

    public final File o(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("765585b4", new Object[]{this, file, str});
        }
        File i = i(file);
        return new File(i, str + fk7.ODEX_SUFFIX);
    }

    public final File p(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4758dd83", new Object[]{this, file, str});
        }
        return new File(file, "oat/" + str + ".apk.prof");
    }

    public final File q(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("789fe7fb", new Object[]{this, file, str});
        }
        File i = i(file);
        return new File(i, str + fk7.VDEX_SUFFIX);
    }

    public final void g(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1018754d", new Object[]{this, str});
            return;
        }
        try {
            Log.e("SplitCleaner", "do clean feature work......:" + str);
            File file = new File(this.e.getFilesDir(), "splitcompat");
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (!file2.getName().equals(bcq.a().e().n())) {
                        File file3 = new File(file2, "verified-splits");
                        File file4 = new File(file2, "native-libraries");
                        File[] listFiles2 = file3.listFiles(new c(this));
                        if (!(listFiles2 == null || listFiles2.length == 0)) {
                            for (File file5 : listFiles2) {
                                if (file5.getName().equals(str + jcq.APK_EXTENSION)) {
                                    Log.e("SplitCleaner", "do clean feature work......:" + file5.getAbsolutePath());
                                    bcq.a().e().f(file5);
                                    h(file3, str);
                                }
                            }
                            File[] listFiles3 = file4.listFiles(new d(this, str));
                            if (listFiles3 != null && listFiles3.length > 0) {
                                for (File file6 : listFiles3) {
                                    Log.e("SplitCleaner", "do clean feature work......:" + file6.getAbsolutePath());
                                    bcq.a().e().f(file6);
                                }
                            }
                        }
                        Log.e("SplitCleaner", "all feature cleaned in......:" + file3.getAbsolutePath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
