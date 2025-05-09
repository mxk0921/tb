package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.core.internal.ApkSignatureSchemeGetter;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tb.b4d;
import tb.d62;
import tb.jcq;
import tb.nj4;
import tb.o49;
import tb.qcq;
import tb.t2o;
import tb.wnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SplitApkChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context context;
    private final ObjectInvoker objectInvoker;
    private final jcq splitFileLogic;
    private b4d optService = (b4d) d62.a(b4d.class, new Object[0]);
    private wnc mLogger = (wnc) d62.b(wnc.class, "SplitApkChecker");

    static {
        t2o.a(677380160);
    }

    public SplitApkChecker(Context context, jcq jcqVar, ObjectInvoker objectInvoker) {
        this.splitFileLogic = jcqVar;
        this.objectInvoker = objectInvoker;
        this.context = context;
    }

    public static /* synthetic */ jcq access$000(SplitApkChecker splitApkChecker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcq) ipChange.ipc$dispatch("bf3db5c7", new Object[]{splitApkChecker});
        }
        return splitApkChecker.splitFileLogic;
    }

    private static X509Certificate getCertificate(Signature signature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate) ipChange.ipc$dispatch("987df462", new Object[]{signature});
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e(wnc.MODULE, "Cannot decode certificate.", e);
            return null;
        }
    }

    private final Signature[] getSignatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("29ea9070", new Object[]{this});
        }
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean verifySplitApksFromFile(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45d63c13", new Object[]{this, str})).booleanValue();
        }
        return this.splitFileLogic.E(str).exists();
    }

    private boolean copyIO(File file, File file2) {
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9623e14", new Object[]{this, file, file2})).booleanValue();
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            bufferedInputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            file.delete();
            return true;
        } catch (Throwable unused3) {
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            if (file2.exists()) {
                file2.delete();
            } else {
                file.delete();
            }
            return false;
        }
    }

    private final boolean isCertificatesValid(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffb7749c", new Object[]{this, str, list})).booleanValue();
        }
        try {
            X509Certificate[][] certificates = ApkSignatureSchemeGetter.getCertificates(str);
            if (!(certificates == null || certificates.length == 0 || certificates[0].length == 0)) {
                if (list.isEmpty()) {
                    this.mLogger.c(wnc.MODULE, "No certificates found for app.");
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    for (X509Certificate[] x509CertificateArr : certificates) {
                        if (!((ApkSignatureSchemeGetter.VerbatimX509Certificate) x509CertificateArr[0]).getWrapped().equals(x509Certificate)) {
                        }
                    }
                    this.mLogger.c("Flexa There's an app certificate that doesn't sign the split.", new Object[0]);
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean isMd5Right(File file) {
        SplitFileInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf8964a", new Object[]{this, file})).booleanValue();
        }
        return file != null && file.exists() && (a2 = ((qcq) d62.a(qcq.class, new Object[0])).a(jcq.G(file.getName()))) != null && !TextUtils.isEmpty(a2.md5) && a2.md5.equals(this.optService.a(file.getAbsolutePath()));
    }

    private boolean isRightFile(File file) {
        SplitFileInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d92545f0", new Object[]{this, file})).booleanValue();
        }
        return file != null && file.exists() && (a2 = ((qcq) d62.a(qcq.class, new Object[0])).a(jcq.G(file.getName()))) != null && !TextUtils.isEmpty(a2.md5) && a2.md5.equals(this.optService.a(file.getAbsolutePath()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean verifySplitApksFromIntent(java.util.List<android.content.Intent> r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.android.split.core.internal.SplitApkChecker.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "6d5a851a"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L_0x0027
            return r0
        L_0x0027:
            java.lang.Object r2 = r6.next()
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r3 = "split_id"
            java.lang.String r2 = r2.getStringExtra(r3)
            tb.jcq r3 = r5.splitFileLogic
            java.io.File r3 = r3.E(r2)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x004b
            tb.o49 r3 = tb.o49.b()
            int r2 = r3.a(r2)
            if (r2 <= r0) goto L_0x004b
            goto L_0x0020
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.SplitApkChecker.verifySplitApksFromIntent(java.util.List):boolean");
    }

    public final boolean verifySplitFiles(nj4.a aVar, final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53c14a89", new Object[]{this, aVar, list})).booleanValue();
        }
        try {
            File L = this.splitFileLogic.L();
            ArrayList arrayList = new ArrayList();
            Signature[] signatures = getSignatures();
            if (signatures != null) {
                for (Signature signature : signatures) {
                    X509Certificate certificate = getCertificate(signature);
                    if (certificate != null) {
                        arrayList.add(certificate);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                File[] listFiles = L.listFiles(new FileFilter() { // from class: com.alibaba.android.split.core.internal.SplitApkChecker.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
                        }
                        List list2 = list;
                        SplitApkChecker.access$000(SplitApkChecker.this);
                        return list2.contains(jcq.G(file.getName()));
                    }
                });
                if (listFiles == null) {
                    return true;
                }
                Arrays.sort(listFiles);
                for (int length = listFiles.length - 1; length >= 0; length--) {
                    File file = listFiles[length];
                    String G = jcq.G(file.getName());
                    try {
                        if (!isCertificatesValid(file.getAbsolutePath(), arrayList)) {
                            this.mLogger.c("Split verification failure:" + G + ": Certificates is inValid! ", new Object[0]);
                            if (!isMd5Right(file)) {
                                this.mLogger.c("Split verification failure:" + G + ":" + this.optService.a(file.getAbsolutePath()) + " file length:" + file.length(), new Object[0]);
                                StringBuilder sb = aVar.b;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Split verification failure:");
                                sb2.append(G);
                                sb2.append(":");
                                sb2.append(file.length());
                                sb.append(sb2.toString());
                                o49.b().c().b(G, 0);
                                file.delete();
                                this.mLogger.c("Split verification failure1.", new Object[0]);
                                return false;
                            }
                            this.mLogger.c("Split verification md5 right!", new Object[0]);
                        }
                        try {
                            if (this.splitFileLogic.E(G).isFile() && isRightFile(this.splitFileLogic.E(G))) {
                                this.mLogger.c(" verifiedSplitFile is exits and isRightFile !." + this.splitFileLogic.E(G).getAbsolutePath(), new Object[0]);
                            } else if (!copyIO(file, this.splitFileLogic.E(G))) {
                                this.mLogger.c("copyIO Split from unverified to verfiied File." + file.getAbsolutePath(), new Object[0]);
                                if (!copyIO(file, this.splitFileLogic.E(G)) || !isRightFile(this.splitFileLogic.E(G))) {
                                    if (this.splitFileLogic.E(G).exists()) {
                                        this.mLogger.c("Split verification failure2. verifiedSplitFile length:" + this.splitFileLogic.E(G).getAbsolutePath() + this.splitFileLogic.E(G).length(), new Object[0]);
                                        this.splitFileLogic.E(G).delete();
                                    }
                                    if (file.exists() && !isRightFile(file)) {
                                        this.mLogger.c("Split verification failure2. unverifiedSplitFile length:" + file.getAbsolutePath() + file.length(), new Object[0]);
                                        file.delete();
                                        o49.b().c().b(G, 0);
                                    }
                                    if (!file.exists()) {
                                        o49.b().c().b(G, 0);
                                    }
                                    aVar.b.append("Cannot write verified split");
                                    return false;
                                }
                            } else if (!isRightFile(this.splitFileLogic.E(G))) {
                                this.mLogger.c("rename file success but file is not right", new Object[0]);
                                this.splitFileLogic.E(G).delete();
                                if (!file.exists()) {
                                    o49.b().c().b(G, 0);
                                }
                                return false;
                            }
                        } catch (IOException e) {
                            this.mLogger.d(e, "Cannot write verified split.", new Object[0]);
                            aVar.b.append("Cannot write verified split");
                            try {
                                if (this.splitFileLogic.E(G).exists()) {
                                    this.mLogger.c("Split verification failure3. verifiedSplitFile length:" + this.splitFileLogic.E(G).length(), new Object[0]);
                                    this.splitFileLogic.E(G).delete();
                                }
                                if (!file.exists()) {
                                    this.mLogger.c("Split verification failure3. unverifiedSplitFile length:" + file.length(), new Object[0]);
                                    o49.b().c().b(G, 0);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return false;
                        }
                    } catch (Exception e3) {
                        this.mLogger.d(e3, "Split verification error.", new Object[0]);
                        aVar.b.append("Split verification error");
                        o49.b().c().b(G, 0);
                        if (file.exists()) {
                            file.delete();
                        }
                        return false;
                    }
                }
                return true;
            }
            this.mLogger.c("No app certificates found.", new Object[0]);
            aVar.b.append("No app certificates found");
            return false;
        } catch (IOException unused) {
            aVar.f24770a = -11;
            aVar.b.append("Cannot access directory for unverified splits");
            this.mLogger.c("verifySplitFiles:Cannot access directory for unverified splits.", new Object[0]);
            return false;
        }
    }
}
