package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.alibaba.android.split.core.splitinstall.SplitInstallException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import tb.acq;
import tb.al9;
import tb.bcq;
import tb.ccq;
import tb.d62;
import tb.eto;
import tb.gdq;
import tb.jcq;
import tb.jvc;
import tb.nj4;
import tb.o49;
import tb.obq;
import tb.omd;
import tb.t2o;
import tb.um8;
import tb.wnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SplitLoaderInternal implements gdq, al9.c, al9.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context context;
    private String mCurrentActivity;
    private String mCurrentTab;
    private final Executor mExecutor;
    private final SplitApkChecker splitApkChecker;
    private final ccq splitCompatLoader;
    private final jcq splitFileLogic;
    private LinkedBlockingQueue<SplitLoaderRunnable> mIdleInstallQueue = new LinkedBlockingQueue<>();
    private final ArrayMap<Set<String>, WeakReference<SplitLoaderRunnable>> mFeatureInstallMap = new ArrayMap<>();
    private jvc monitor = (jvc) d62.a(jvc.class, new Object[0]);
    private wnc mLogger = (wnc) d62.b(wnc.class, "SplitLoaderInternal");
    private omd iScene = eto.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface CopyAndVerifyCallback {
        void onFailure(nj4.a aVar);

        void onSuccess();
    }

    static {
        t2o.a(677380165);
        t2o.a(677380262);
        t2o.a(676331532);
        t2o.a(676331533);
    }

    public SplitLoaderInternal(Context context, Executor executor, SplitApkChecker splitApkChecker, jcq jcqVar, ccq ccqVar) {
        this.context = context;
        this.splitFileLogic = jcqVar;
        this.splitApkChecker = splitApkChecker;
        this.mExecutor = executor;
        this.splitCompatLoader = ccqVar;
    }

    public static /* synthetic */ jcq access$000(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcq) ipChange.ipc$dispatch("daa0abfe", new Object[]{splitLoaderInternal});
        }
        return splitLoaderInternal.splitFileLogic;
    }

    public static /* synthetic */ jvc access$100(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvc) ipChange.ipc$dispatch("644867a7", new Object[]{splitLoaderInternal});
        }
        return splitLoaderInternal.monitor;
    }

    public static /* synthetic */ Context access$200(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("74694d8e", new Object[]{splitLoaderInternal});
        }
        return splitLoaderInternal.context;
    }

    public static /* synthetic */ LinkedBlockingQueue access$300(SplitLoaderInternal splitLoaderInternal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedBlockingQueue) ipChange.ipc$dispatch("1ff4b305", new Object[]{splitLoaderInternal});
        }
        return splitLoaderInternal.mIdleInstallQueue;
    }

    private static void close(FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3fa932", new Object[]{fileChannel});
        } else if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Throwable unused) {
            }
        }
    }

    private final synchronized Integer copySplitApkLock(String str, AssetFileDescriptor assetFileDescriptor, nj4.a aVar) {
        FileChannel channel;
        FileLock fileLock;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3ae77f40", new Object[]{this, str, assetFileDescriptor, aVar});
        }
        int i = -13;
        this.mLogger.c("copySplitApkLock:", new Object[0]);
        try {
            channel = new RandomAccessFile(this.splitFileLogic.x(), "rw").getChannel();
            fileLock = null;
        } catch (Exception e) {
            this.mLogger.d(e, "Error locking files.", new Object[0]);
            aVar.f24770a = -13;
            aVar.b.append("Error locking files");
        }
        try {
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
            }
            if (fileLock != null) {
                copySplitApk(str, assetFileDescriptor);
                i = Integer.valueOf(verifyApkFiles(aVar, Arrays.asList(str)));
            }
            if (fileLock != null) {
                fileLock.release();
            }
            if (channel != null) {
                close(channel);
            }
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (fileLock != null) {
                    fileLock.release();
                }
                if (channel != null) {
                    close(channel);
                }
                throw th2;
            }
        }
    }

    private Set<String> getFeatures(List<Intent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5c32825a", new Object[]{this, list});
        }
        HashSet hashSet = new HashSet();
        for (Intent intent : list) {
            hashSet.add(intent.getStringExtra("split_id"));
        }
        return hashSet;
    }

    private void triggerIdleFeatureInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffdd298", new Object[]{this});
        } else {
            this.mExecutor.execute(new Runnable() { // from class: com.alibaba.android.split.core.internal.SplitLoaderInternal.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (true) {
                        try {
                            SplitLoaderRunnable splitLoaderRunnable = (SplitLoaderRunnable) SplitLoaderInternal.access$300(SplitLoaderInternal.this).poll();
                            if (splitLoaderRunnable != null) {
                                splitLoaderRunnable.run();
                            } else {
                                return;
                            }
                        } catch (Exception unused) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                }
            });
        }
    }

    public final void copyAndVerify(List<Intent> list, um8 um8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c42fdc", new Object[]{this, list, um8Var});
            return;
        }
        nj4.a aVar = new nj4.a();
        copySplitApkLock(list, aVar);
        int i = aVar.f24770a;
        if (i == 0) {
            um8Var.f();
        } else {
            um8Var.e(10, i, aVar.b.toString());
        }
    }

    public final int copySplitApk(List<Intent> list, nj4.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd6df9f5", new Object[]{this, list, aVar})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (Intent intent : list) {
                String stringExtra = intent.getStringExtra("split_id");
                if (o49.b().a(stringExtra) <= 1 || !this.splitFileLogic.E(stringExtra).exists()) {
                    if (intent.getData() == null && this.splitFileLogic.K(stringExtra).exists() && o49.b().a(stringExtra) == 1) {
                        arrayList.add(stringExtra);
                    } else if (intent.getData() != null) {
                        copySplitApk(stringExtra, this.context.getContentResolver().openAssetFileDescriptor(intent.getData(), "r"));
                        arrayList.add(stringExtra);
                    }
                }
            }
            return verifyApkFiles(aVar, arrayList);
        } catch (Exception e) {
            this.mLogger.d(e, "Error copying splits.", new Object[0]);
            StringBuilder sb = aVar.b;
            sb.append("Error copying splits:" + e.getMessage());
            return -13;
        }
    }

    public SplitApkChecker getSplitApkChecker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitApkChecker) ipChange.ipc$dispatch("6f0b47fa", new Object[]{this});
        }
        return this.splitApkChecker;
    }

    @Override // tb.gdq
    public final void load(List<Intent> list, um8 um8Var) {
        omd omdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f9e91", new Object[]{this, list, um8Var});
        } else if (this.splitCompatLoader.a()) {
            SplitLoaderRunnable splitLoaderRunnable = new SplitLoaderRunnable(this, list, um8Var);
            Set<String> features = getFeatures(list);
            if (TextUtils.isEmpty(this.mCurrentActivity) || (omdVar = this.iScene) == null || !omdVar.isInit()) {
                this.mExecutor.execute(splitLoaderRunnable);
                return;
            }
            omd omdVar2 = this.iScene;
            if (omdVar2 == null || !omdVar2.b(this.mCurrentActivity, this.mCurrentTab, (String[]) features.toArray(new String[0]))) {
                this.mIdleInstallQueue.offer(splitLoaderRunnable);
                this.mFeatureInstallMap.put(features, new WeakReference<>(splitLoaderRunnable));
                return;
            }
            this.mExecutor.execute(splitLoaderRunnable);
        } else {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
    }

    @Override // tb.al9.c
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else if (this.iScene != null) {
            this.mCurrentActivity = null;
            triggerIdleFeatureInstall();
        }
    }

    @Override // tb.al9.c
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        }
    }

    @Override // tb.al9.c
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    @Override // tb.al9.d
    public void onTabChanged(int i, String str) {
        WeakReference<SplitLoaderRunnable> removeAt;
        SplitLoaderRunnable splitLoaderRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mCurrentTab = str;
        if (this.iScene != null) {
            List<String> d = eto.a().d(this.mCurrentActivity, this.mCurrentTab);
            if (d == null || d.size() <= 0) {
                triggerIdleFeatureInstall();
                return;
            }
            for (String str2 : d) {
                for (int size = this.mFeatureInstallMap.size() - 1; size >= 0; size--) {
                    if (!(!this.mFeatureInstallMap.keyAt(size).contains(str2) || (removeAt = this.mFeatureInstallMap.removeAt(size)) == null || (splitLoaderRunnable = removeAt.get()) == null)) {
                        this.mIdleInstallQueue.remove(splitLoaderRunnable);
                        this.mExecutor.execute(splitLoaderRunnable);
                    }
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SplitLoaderInternal{mCurrentActivity='" + this.mCurrentActivity + "', mCurrentTab='" + this.mCurrentTab + "', mIdleInstallQueue ='" + this.mIdleInstallQueue + "'}";
    }

    private static void close(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a12b31", new Object[]{outputStream});
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.al9.c
    public void onActivityCreate(String str) {
        SplitLoaderRunnable splitLoaderRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18625fbb", new Object[]{this, str});
        } else if (this.iScene != null) {
            this.mCurrentActivity = str;
            this.mCurrentTab = "default";
            if (!TextUtils.isEmpty(str) && this.mCurrentActivity.startsWith("com.taobao.tao.welcome")) {
                this.mCurrentActivity = obq.BIZ_NAME;
            }
            if (!TextUtils.isEmpty(this.mCurrentActivity)) {
                if (this.mCurrentActivity.equals(obq.BIZ_NAME)) {
                    this.mCurrentTab = "homePage";
                }
                List<String> a2 = this.iScene.a(this.mCurrentActivity);
                if (a2 == null || a2.size() == 0) {
                    triggerIdleFeatureInstall();
                    return;
                }
                for (String str2 : a2) {
                    for (int size = this.mFeatureInstallMap.size() - 1; size >= 0; size--) {
                        if (this.mFeatureInstallMap.keyAt(size).contains(str2) && (splitLoaderRunnable = this.mFeatureInstallMap.remove(Integer.valueOf(size)).get()) != null) {
                            this.mIdleInstallQueue.remove(splitLoaderRunnable);
                            this.mExecutor.execute(splitLoaderRunnable);
                        }
                    }
                }
            }
        }
    }

    public int verifyApkFiles(nj4.a aVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb106fba", new Object[]{this, aVar, list})).intValue();
        }
        try {
            if (!this.splitApkChecker.verifySplitFiles(aVar, list)) {
                this.mLogger.c("Split verification failed.", new Object[0]);
                aVar.b.append("Split verification failed.");
                aVar.f24770a = -11;
                return -11;
            }
            this.mLogger.c("Splits verified.", new Object[0]);
            return 0;
        } catch (Exception e) {
            StringBuilder sb = aVar.b;
            sb.append("Error verifying splits." + e.getMessage());
            aVar.f24770a = -11;
            this.mLogger.d(e, "Error verifying splits.", new Object[0]);
            return -11;
        }
    }

    private static void close(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7157974", new Object[]{inputStream});
        } else if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void copyAndVerify(String str, AssetFileDescriptor assetFileDescriptor, CopyAndVerifyCallback copyAndVerifyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44906d4", new Object[]{this, str, assetFileDescriptor, copyAndVerifyCallback});
            return;
        }
        nj4.a aVar = new nj4.a();
        if (copySplitApkLock(str, assetFileDescriptor, aVar).intValue() == 0 && aVar.f24770a == 0) {
            if (copyAndVerifyCallback != null) {
                copyAndVerifyCallback.onSuccess();
            }
        } else if (copyAndVerifyCallback != null) {
            copyAndVerifyCallback.onFailure(aVar);
        }
    }

    public final boolean emulate(um8 um8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7962f979", new Object[]{this, um8Var})).booleanValue();
        }
        try {
            if (!this.splitCompatLoader.b(this.context, (String[]) um8Var.a().f().toArray(new String[0]))) {
                this.mLogger.c("Emulating splits failed.", new Object[0]);
                um8Var.e(4, -12, "Emulating splits failed");
                return false;
            }
            um8Var.d();
            return true;
        } catch (Exception e) {
            this.mLogger.d(e, "Error emulating splits.", new Object[0]);
            for (String str : um8Var.a().f()) {
                this.monitor.b(str, false, "install", 0L, -1, e.getMessage(), acq.p().t());
            }
            um8Var.e(4, -12, "Error emulating splits " + e.getMessage());
            return false;
        }
    }

    @Override // tb.gdq
    public final void load(final String str, AssetFileDescriptor assetFileDescriptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28ec814", new Object[]{this, str, assetFileDescriptor});
        } else if (this.splitCompatLoader.a()) {
            try {
                if (this.splitApkChecker.verifySplitApksFromFile(str)) {
                    bcq.a().g(this.context, false, str);
                } else {
                    final long currentTimeMillis = System.currentTimeMillis();
                    copyAndVerify(str, assetFileDescriptor, new CopyAndVerifyCallback() { // from class: com.alibaba.android.split.core.internal.SplitLoaderInternal.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alibaba.android.split.core.internal.SplitLoaderInternal.CopyAndVerifyCallback
                        public void onFailure(nj4.a aVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("16310b5f", new Object[]{this, aVar});
                            } else {
                                SplitLoaderInternal.access$100(SplitLoaderInternal.this).b(str, false, "verify", System.currentTimeMillis() - currentTimeMillis, aVar.f24770a, aVar.b.toString(), 0L);
                            }
                        }

                        @Override // com.alibaba.android.split.core.internal.SplitLoaderInternal.CopyAndVerifyCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                                return;
                            }
                            SplitLoaderInternal.access$100(SplitLoaderInternal.this).b(str, true, "verify", System.currentTimeMillis() - currentTimeMillis, 0, "", SplitLoaderInternal.access$000(SplitLoaderInternal.this).m());
                            try {
                                if (!bcq.a().g(SplitLoaderInternal.access$200(SplitLoaderInternal.this), true, str)) {
                                    SplitLoaderInternal.access$100(SplitLoaderInternal.this).b(str, false, "install", 0L, -1, "local install failed", SplitLoaderInternal.access$000(SplitLoaderInternal.this).m());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                if (e instanceof SplitInstallException) {
                                    SplitLoaderInternal.access$100(SplitLoaderInternal.this).b(str, false, "install", 0L, -1, e.getCause().getMessage(), SplitLoaderInternal.access$000(SplitLoaderInternal.this).m());
                                }
                            }
                        }
                    });
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r8.splitFileLogic.E(r9).exists() == false) goto L_0x0046;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void copySplitApk(java.lang.String r9, android.content.res.AssetFileDescriptor r10) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.split.core.internal.SplitLoaderInternal.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "4da4dfa3"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r0 = 1
            r3[r0] = r9
            r9 = 2
            r3[r9] = r10
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            tb.jcq r1 = r8.splitFileLogic
            java.io.File r1 = r1.K(r9)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: all -> 0x0032
            if (r3 == 0) goto L_0x0034
            long r3 = r1.length()     // Catch: all -> 0x0032
            long r5 = r10.getLength()     // Catch: all -> 0x0032
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0046
            goto L_0x0034
        L_0x0032:
            r9 = move-exception
            goto L_0x007a
        L_0x0034:
            boolean r3 = r1.exists()     // Catch: all -> 0x0032
            if (r3 != 0) goto L_0x0073
            tb.jcq r3 = r8.splitFileLogic     // Catch: all -> 0x0032
            java.io.File r9 = r3.E(r9)     // Catch: all -> 0x0032
            boolean r9 = r9.exists()     // Catch: all -> 0x0032
            if (r9 != 0) goto L_0x0073
        L_0x0046:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch: all -> 0x0032
            java.io.FileInputStream r3 = r10.createInputStream()     // Catch: all -> 0x0032
            r9.<init>(r3)     // Catch: all -> 0x0032
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: all -> 0x0069
            r2.<init>(r1)     // Catch: all -> 0x0069
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: all -> 0x0062
        L_0x0058:
            int r3 = r9.read(r1)     // Catch: all -> 0x0062
            if (r3 <= 0) goto L_0x0064
            r2.write(r1, r0, r3)     // Catch: all -> 0x0062
            goto L_0x0058
        L_0x0062:
            r0 = move-exception
            goto L_0x006d
        L_0x0064:
            close(r2)     // Catch: all -> 0x0069
            r2 = r9
            goto L_0x0073
        L_0x0069:
            r0 = move-exception
            r2 = r9
            r9 = r0
            goto L_0x007a
        L_0x006d:
            throw r0     // Catch: all -> 0x006e
        L_0x006e:
            r0 = move-exception
            close(r2)     // Catch: all -> 0x0069
            throw r0     // Catch: all -> 0x0069
        L_0x0073:
            r10.close()
            close(r2)
            return
        L_0x007a:
            throw r9     // Catch: all -> 0x007b
        L_0x007b:
            r9 = move-exception
            r10.close()
            close(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.internal.SplitLoaderInternal.copySplitApk(java.lang.String, android.content.res.AssetFileDescriptor):void");
    }

    private final Integer copySplitApkLock(List<Intent> list, nj4.a aVar) {
        FileChannel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a4735dfe", new Object[]{this, list, aVar});
        }
        int i = -13;
        aVar.f24770a = -13;
        FileLock fileLock = null;
        try {
            try {
                channel = new RandomAccessFile(this.splitFileLogic.x(), "rw").getChannel();
            } catch (Exception e) {
                StringBuilder sb = aVar.b;
                sb.append("Error locking files." + e.getMessage());
                this.mLogger.d(e, "Error locking files.", new Object[0]);
                if (0 != 0) {
                    close((FileChannel) null);
                }
            }
            try {
                try {
                    fileLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                }
                if (fileLock != null) {
                    int copySplitApk = copySplitApk(list, aVar);
                    i = Integer.valueOf(copySplitApk);
                    aVar.f24770a = copySplitApk;
                }
                if (fileLock != null) {
                    fileLock.release();
                }
                if (channel != null) {
                    close(channel);
                }
                return i;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                close((FileChannel) null);
            }
            throw th;
        }
    }
}
