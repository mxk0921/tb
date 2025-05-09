package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.nqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mkj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern c = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public static final b4d d = (b4d) d62.a(b4d.class, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public final jcq f24102a;
    public final wnc b = (wnc) d62.b(wnc.class, "NativeLibraryExtractor");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements nqx.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f24103a;

        public a(mkj mkjVar, HashMap hashMap) {
            this.f24103a = hashMap;
        }

        public void a(ZipEntry zipEntry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0894ca", new Object[]{this, zipEntry});
                return;
            }
            Matcher matcher = mkj.a().matcher(zipEntry.getName());
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Set set = (Set) this.f24103a.get(group);
                if (set == null) {
                    set = new HashSet();
                    this.f24103a.put(group, set);
                }
                set.add(new tjj(zipEntry, group2));
            }
        }
    }

    static {
        t2o.a(677380217);
    }

    public mkj(jcq jcqVar) {
        this.f24102a = jcqVar;
    }

    public static /* synthetic */ Pattern a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
        }
        return c;
    }

    public static void c(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73b3c75", new Object[]{zipFile, zipEntry, file});
            return;
        }
        while (i <= 2) {
            i++;
            f(zipFile, zipEntry, file);
            if (file.exists() && hbi.d(zipFile.getInputStream(zipEntry)).equals(d.a(file.getAbsolutePath()))) {
                return;
            }
        }
        if (file.exists()) {
            file.delete();
        }
        throw new IOException("extract so File:" + file + "failed!");
    }

    public static void f(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ee2238", new Object[]{zipFile, zipEntry, file});
            return;
        }
        byte[] bArr = new byte[4096];
        InputStream inputStream = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                try {
                    throw th;
                } finally {
                    c(inputStream);
                    c(fileOutputStream);
                }
            }
        }
        inputStream = zipFile.getInputStream(zipEntry);
        try {
            fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream;
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            inputStream = inputStream;
            th = th4;
            fileOutputStream = null;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af624bd2", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                Set<ocq> M = this.f24102a.M();
                for (String str : this.f24102a.v()) {
                    Iterator<ocq> it = M.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.equals(it.next().b())) {
                                break;
                            }
                        } else {
                            this.b.c("NativeLibraryExtractor.synchronizeNativeLibs:NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                            this.f24102a.b(str);
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void d(ocq ocqVar, c8q c8qVar) throws IOException {
        Throwable th;
        IOException e;
        HashMap hashMap;
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6952857", new Object[]{this, ocqVar, c8qVar});
            return;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                hashMap = new HashMap();
                zipFile = new ZipFile(ocqVar.c());
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            nqx.a(zipFile, new a(this, hashMap));
            if (hashMap.size() == 0) {
                try {
                    zipFile.close();
                } catch (IOException unused) {
                }
            } else {
                HashMap hashMap2 = new HashMap();
                String b = mw4.b(acq.p().o());
                new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                ArrayList arrayList = new ArrayList(length);
                arrayList.add(b);
                for (int i = 0; i < length; i++) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (hashMap.containsKey(str)) {
                        for (tjj tjjVar : (Set) hashMap.get(str)) {
                            if (!hashMap2.containsKey(tjjVar.f28749a)) {
                                hashMap2.put(tjjVar.f28749a, tjjVar);
                            }
                        }
                    }
                }
                c8qVar.a(zipFile, new HashSet(hashMap2.values()));
                try {
                    zipFile.close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException e3) {
            e = e3;
            zipFile2 = zipFile;
            this.b.d(e, "extract failed:%s", e.getMessage());
            throw e;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public Set g(Set<tjj> set, ocq ocqVar, ZipFile zipFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c57c5a54", new Object[]{this, set, ocqVar, zipFile});
        }
        HashSet hashSet = new HashSet();
        i(ocqVar, set, new ot8(hashSet, ocqVar, zipFile));
        return hashSet;
    }

    public Set<File> h(ocq ocqVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2daf8a31", new Object[]{this, ocqVar});
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        d(ocqVar, new f4i(this, ocqVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    public final void i(ocq ocqVar, Set<tjj> set, e8q e8qVar) throws IOException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800c6325", new Object[]{this, ocqVar, set, e8qVar});
            return;
        }
        for (tjj tjjVar : set) {
            File D = this.f24102a.D(ocqVar.b(), tjjVar.f28749a);
            if (!D.exists() || D.length() != tjjVar.b.getSize()) {
                z = false;
            } else {
                z = true;
            }
            e8qVar.a(tjjVar, D, z);
        }
    }

    public void j(ocq ocqVar, Set set, e8q e8qVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13200b27", new Object[]{this, ocqVar, set, e8qVar});
        } else {
            i(ocqVar, set, e8qVar);
        }
    }

    public Set<File> k(ocq ocqVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f54b8e59", new Object[]{this, ocqVar});
        }
        HashSet hashSet = new HashSet();
        d(ocqVar, new nt8(this, hashSet, ocqVar));
        if (hashSet.size() == 0) {
            return hashSet;
        }
        for (File file : this.f24102a.w(ocqVar.b())) {
            if (!hashSet.contains(file) && Build.VERSION.SDK_INT > 22) {
                this.b.c("NativeLibraryExtractor.synchronizeNativeLib:NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), ocqVar.b(), ocqVar.c().getAbsolutePath());
                this.f24102a.f(file);
            }
        }
        return hashSet;
    }
}
