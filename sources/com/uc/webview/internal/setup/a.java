package com.uc.webview.internal.setup;

import android.content.Context;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.b;
import com.uc.webview.base.io.d;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.extension.JSILoader;
import com.uc.webview.internal.e;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a extends c {
    private static volatile AbstractC0839a c;
    private final Context d;
    private final n e;
    private final b f;
    private final ArrayList<File> g = new ArrayList<>();

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.setup.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AbstractC0839a {
        void a(File[] fileArr);
    }

    public a(Context context, n nVar) {
        this.d = context;
        this.e = nVar;
        this.f = PathUtils.a(context, "Cleaner");
    }

    public static void a(AbstractC0839a aVar) {
        synchronized (a.class) {
            c = aVar;
        }
    }

    private boolean b(File file) {
        synchronized (a.class) {
            try {
                if (c == null) {
                    return false;
                }
                File[] c2 = c(file);
                if (!(c2 == null || c2.length == 0)) {
                    Log.i("Cleaner", "use deleter to delete " + Arrays.toString(c2));
                    c.a(c2);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private File[] c(File file) {
        File[] listFiles;
        try {
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (File file2 : listFiles) {
                    if (file2.isDirectory() && !d.a(this.g, file2)) {
                        arrayList.add(file2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return (File[]) arrayList.toArray(new File[arrayList.size()]);
            }
            return null;
        } catch (Throwable th) {
            Log.w("Cleaner", "findDelDirs failed", th);
            return null;
        }
    }

    private void i() {
        try {
            this.f.a();
            j();
            l();
            k();
            com.uc.webview.base.task.d.a("cleanAbf", new Runnable() { // from class: com.uc.webview.internal.setup.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this);
                }
            }, 15000L);
        } finally {
            try {
            } finally {
            }
        }
    }

    private void j() {
        l g = o.b().g();
        if (g != null && !e.e()) {
            a(g.t());
        }
        a(JSILoader.getUsingDir());
        File e = PathUtils.e(this.d);
        if (!b(e)) {
            d.a("Cleaner-ud", e, true, this.g);
        }
    }

    private void k() {
        IDownloadHandle iDownloadHandle;
        n nVar = this.e;
        if (nVar != null && (iDownloadHandle = nVar.i) != null) {
            iDownloadHandle.delete();
        }
    }

    private void l() {
        try {
            File[] listFiles = PathUtils.getDirCache(this.d).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file != null && file.isDirectory() && file.getName().startsWith(".tmp_unz_")) {
                        d.a("tmpunz-o", file, false, (ArrayList<File>) null);
                    }
                }
            }
            File[] listFiles2 = PathUtils.i(this.d).listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    if (file2 != null && file2.isDirectory() && !com.uc.webview.base.zip.a.a(file2)) {
                        d.a("tmpunz", file2, false, (ArrayList<File>) null);
                    }
                }
            }
        } catch (Throwable th) {
            Log.w("Cleaner", "cleanTmpUnz failed", th);
        }
    }

    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
    public /* synthetic */ c.C0833c call() throws Exception {
        return call();
    }

    @Override // com.uc.webview.base.task.c
    public final void d() {
        synchronized (PathUtils.a()) {
            i();
        }
    }

    @Override // com.uc.webview.base.task.c
    public final String e() {
        return "Cleaner";
    }

    @Override // com.uc.webview.base.task.c
    public final int f() {
        return StartupTimingKeys.CLEANER;
    }

    public final void h() {
        d();
    }

    public final a a(File file) {
        if (file != null && !this.g.contains(file)) {
            this.g.add(file);
        }
        return this;
    }

    @Override // com.uc.webview.base.task.c
    public final c a() {
        return a(3000L);
    }

    public static /* synthetic */ void a(a aVar) {
        synchronized (a.class) {
            try {
                String[] strArr = {"ucwa/wa_upload_new.wa", "shared_prefs/UC_WA_STAT.xml"};
                for (int i = 0; i < 2; i++) {
                    d.c("Cleaner-ab", new File(aVar.d.getApplicationInfo().dataDir, strArr[i]));
                }
                String[] strArr2 = {"app_cyclone", "app_ucmsdk"};
                for (int i2 = 0; i2 < 2; i2++) {
                    d.a("Cleaner-af", new File(aVar.d.getApplicationInfo().dataDir, strArr2[i2]));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
