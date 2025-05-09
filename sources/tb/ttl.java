package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ttl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28952a;
    public final String b;
    public final String c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public String errorMessage;
        public boolean mIsSuccess;
        public File mPatchFilesDir;

        static {
            t2o.a(948961290);
        }
    }

    static {
        t2o.a(948961288);
    }

    public ttl(String str, String str2, String str3, String str4) {
        this.f28952a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static /* synthetic */ String access$000(ttl ttlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33e864c4", new Object[]{ttlVar});
        }
        return ttlVar.b;
    }

    public static /* synthetic */ String access$100(ttl ttlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2771699", new Object[]{ttlVar, str});
        }
        return ttlVar.c(str);
    }

    public static /* synthetic */ String access$200(ttl ttlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d19da5f8", new Object[]{ttlVar, str});
        }
        return ttlVar.b(str);
    }

    public static /* synthetic */ String access$300(ttl ttlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0c43557", new Object[]{ttlVar, str});
        }
        return ttlVar.a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        throw new java.io.FileNotFoundException("Failed to ensure directory: " + r4.getAbsolutePath());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void unzip(java.io.File r6, java.io.File r7) throws java.io.IOException {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.ttl.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "780b09d"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r6 = 1
            r3[r6] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r6)
            r2.<init>(r3)
            r1.<init>(r2)
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: all -> 0x0078
        L_0x0028:
            java.util.zip.ZipEntry r2 = r1.getNextEntry()     // Catch: all -> 0x0078
            if (r2 == 0) goto L_0x009b
            java.lang.String r3 = r2.getName()     // Catch: all -> 0x0078
            java.lang.String r4 = ".."
            boolean r3 = r3.contains(r4)     // Catch: all -> 0x0078
            if (r3 == 0) goto L_0x003b
            goto L_0x0028
        L_0x003b:
            java.io.File r3 = new java.io.File     // Catch: all -> 0x0078
            java.lang.String r4 = r2.getName()     // Catch: all -> 0x0078
            r3.<init>(r7, r4)     // Catch: all -> 0x0078
            boolean r4 = r2.isDirectory()     // Catch: all -> 0x0078
            if (r4 == 0) goto L_0x004c
            r4 = r3
            goto L_0x0050
        L_0x004c:
            java.io.File r4 = r3.getParentFile()     // Catch: all -> 0x0078
        L_0x0050:
            boolean r5 = r4.isDirectory()     // Catch: all -> 0x0078
            if (r5 != 0) goto L_0x007a
            boolean r5 = r4.mkdirs()     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x005d
            goto L_0x007a
        L_0x005d:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException     // Catch: all -> 0x0078
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x0078
            r7.<init>()     // Catch: all -> 0x0078
            java.lang.String r0 = "Failed to ensure directory: "
            r7.append(r0)     // Catch: all -> 0x0078
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: all -> 0x0078
            r7.append(r0)     // Catch: all -> 0x0078
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x0078
            r6.<init>(r7)     // Catch: all -> 0x0078
            throw r6     // Catch: all -> 0x0078
        L_0x0078:
            r6 = move-exception
            goto L_0x009f
        L_0x007a:
            boolean r2 = r2.isDirectory()     // Catch: all -> 0x0078
            if (r2 == 0) goto L_0x0081
            goto L_0x0028
        L_0x0081:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: all -> 0x0078
            r2.<init>(r3)     // Catch: all -> 0x0078
        L_0x0086:
            int r3 = r1.read(r6)     // Catch: all -> 0x0091
            r4 = -1
            if (r3 == r4) goto L_0x0093
            r2.write(r6, r0, r3)     // Catch: all -> 0x0091
            goto L_0x0086
        L_0x0091:
            r6 = move-exception
            goto L_0x0097
        L_0x0093:
            r2.close()     // Catch: all -> 0x0078
            goto L_0x0028
        L_0x0097:
            r2.close()     // Catch: all -> 0x0078
            throw r6     // Catch: all -> 0x0078
        L_0x009b:
            r1.close()
            return
        L_0x009f:
            r1.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ttl.unzip(java.io.File, java.io.File):void");
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("710cb35b", new Object[]{this, str});
        }
        return this.c + "/" + str + ".lock";
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d9dc9e7", new Object[]{this, str});
        }
        return c(str) + "/jni/" + this.d;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfd3c818", new Object[]{this, str});
        }
        return this.c + "/" + str + "_unzipped";
    }

    public b prepareInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b3f8ba71", new Object[]{this});
        }
        if (new File(a(this.b)).exists()) {
            File file = new File(b(this.b));
            if (file.exists()) {
                b bVar = new b();
                bVar.mPatchFilesDir = file;
                bVar.mIsSuccess = true;
                return bVar;
            }
        }
        zu7 zu7Var = new zu7();
        onf onfVar = new onf();
        onfVar.f25507a = this.f28952a;
        String str = this.b;
        onfVar.c = str;
        onfVar.d = str;
        zu7Var.f33016a.add(onfVar);
        upl uplVar = zu7Var.b;
        uplVar.f29547a = gjv.CPPINLINEPATCH;
        uplVar.g = this.c;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        b bVar2 = new b();
        rv7.e().b(zu7Var, new a(bVar2, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            bVar2.mIsSuccess = false;
        }
        return bVar2;
    }

    public b prepareUnInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a42ba18", new Object[]{this});
        }
        if (!new File(a(this.b)).exists()) {
            return null;
        }
        File file = new File(b(this.b));
        if (!file.exists()) {
            return null;
        }
        b bVar = new b();
        bVar.mPatchFilesDir = file;
        bVar.mIsSuccess = true;
        return bVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ b val$installInfo;

        public a(b bVar, CountDownLatch countDownLatch) {
            this.val$installInfo = bVar;
            this.val$countDownLatch = countDownLatch;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            b bVar = this.val$installInfo;
            bVar.mIsSuccess = false;
            bVar.errorMessage = "download_error";
            this.val$countDownLatch.countDown();
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
            } else {
                this.val$countDownLatch.countDown();
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else if (!cbi.isMd5Same(ttl.access$000(ttl.this), str2)) {
                this.val$installInfo.mIsSuccess = false;
            } else {
                try {
                    File file = new File(str2);
                    ttl ttlVar = ttl.this;
                    ttl.unzip(file, new File(ttl.access$100(ttlVar, ttl.access$000(ttlVar))));
                    ttl ttlVar2 = ttl.this;
                    File file2 = new File(ttl.access$200(ttlVar2, ttl.access$000(ttlVar2)));
                    if (!file2.exists()) {
                        this.val$installInfo.mIsSuccess = false;
                        return;
                    }
                    ttl ttlVar3 = ttl.this;
                    new File(ttl.access$300(ttlVar3, ttl.access$000(ttlVar3))).createNewFile();
                    b bVar = this.val$installInfo;
                    bVar.mIsSuccess = true;
                    bVar.mPatchFilesDir = file2;
                } catch (Throwable unused) {
                    b bVar2 = this.val$installInfo;
                    bVar2.mIsSuccess = false;
                    bVar2.errorMessage = "unzip_error";
                }
            }
        }
    }
}
