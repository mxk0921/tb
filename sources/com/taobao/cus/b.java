package com.taobao.cus;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.cus.CusDataController;
import com.taobao.cus.b;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import tb.cqw;
import tb.hst;
import tb.jcq;
import tb.lz4;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.uz4;
import tb.vz4;
import tb.wdm;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.cus.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0548b {
    }

    static {
        t2o.a(790626313);
    }

    public static /* synthetic */ boolean c(b bVar, Context context, CusDataController.ApkDownloadContext apkDownloadContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7b2d105", new Object[]{bVar, context, apkDownloadContext})).booleanValue();
        }
        return bVar.h(context, apkDownloadContext);
    }

    public void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdfabb9", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Coordinator.execute(new Runnable() { // from class: tb.mja
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.j(str);
                }
            });
        }
    }

    public void e(final String str, final String str2, final String str3, final String str4, final AbstractC0548b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2b72e", new Object[]{this, str, str2, str3, str4, bVar});
        } else {
            hst.b(new Runnable() { // from class: tb.lja
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.k(bVar, str, str2, str3, str4);
                }
            });
        }
    }

    public final String f(Long l, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a3007ca", new Object[]{this, l, str});
        }
        onf onfVar = new onf();
        onfVar.b = l.longValue();
        onfVar.d = str;
        return rv7.e().f(g(), onfVar);
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d4e774c", new Object[]{this});
        }
        return vz4.f(PopLayer.getReference().getApp()) + "/appupdate/grayDownload/";
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e632e49", new Object[]{this})).booleanValue();
        }
        boolean e = lz4.i().e();
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "isDirectDownloadEnable.start.enableGrayDownload=" + e);
        return e;
    }

    public final int l(CusDataController.ApkDownloadContext apkDownloadContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7299cc7e", new Object[]{this, apkDownloadContext})).intValue();
        }
        if (apkDownloadContext != null) {
            try {
                if (apkDownloadContext.isValid()) {
                    onf onfVar = new onf();
                    onfVar.f25507a = apkDownloadContext.downloadUrl;
                    onfVar.d = apkDownloadContext.fileName;
                    onfVar.b = apkDownloadContext.fileSize;
                    zu7 zu7Var = new zu7();
                    upl uplVar = new upl();
                    uplVar.f29547a = "newAPPUpdate";
                    uplVar.g = apkDownloadContext.filePath;
                    uplVar.c = 4;
                    zu7Var.b = uplVar;
                    ArrayList arrayList = new ArrayList();
                    zu7Var.f33016a = arrayList;
                    arrayList.add(onfVar);
                    return rv7.e().b(zu7Var, new a(apkDownloadContext));
                }
            } catch (Throwable th) {
                wdm.h("PreDownloadCenter.startDownload.error", th);
            }
        }
        return -1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CusDataController.ApkDownloadContext f10316a;

        public a(CusDataController.ApkDownloadContext apkDownloadContext) {
            this.f10316a = apkDownloadContext;
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            } else {
                wdm.d("GrayDownloader.directDownload.startDownload.onDownloadProgress.i=%s", Integer.valueOf(i));
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
                wdm.d("GrayDownloader.directDownload.onFinish.result=%s", Boolean.valueOf(z));
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            } else {
                wdm.d("GrayDownloader.directDownload.onNetworkLimit.i=%s", Integer.valueOf(i));
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            wdm.d("GrayDownloader.directDownload.onDownloadFinish.url=%s.filePath=%s", str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", "");
            hashMap.put("success", "true");
            uz4.c(uz4.MONITOR_POINT_FINISH_GRAY, this.f10316a, hashMap);
            b.c(b.this, Globals.getApplication(), com.taobao.cus.a.q().i());
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            wdm.d("GrayDownloader.directDownload.onDownloadError.url=%s.errorCode=%s.msg=%s", str, Integer.valueOf(i), str2);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", String.valueOf(i));
            hashMap.put("success", "false");
            uz4.c(uz4.MONITOR_POINT_FINISH_GRAY, this.f10316a, hashMap);
        }
    }

    public final boolean h(Context context, CusDataController.ApkDownloadContext apkDownloadContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9e715c", new Object[]{this, context, apkDownloadContext})).booleanValue();
        }
        try {
            HashMap hashMap = new HashMap();
            if (apkDownloadContext == null) {
                hashMap.put("errorCode", "lastDownloadContextIsNull");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK_GRAY, null, hashMap);
                uz4.d("DirectDownloadInstallApk", null, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext=null", new Object[0]);
                return false;
            } else if (TextUtils.isEmpty(apkDownloadContext.filePath)) {
                hashMap.put("errorCode", "filePathIsNull");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK_GRAY, apkDownloadContext, hashMap);
                uz4.d("DirectDownloadInstallApk", null, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext.filePath=null", new Object[0]);
                return false;
            } else {
                File file = new File(apkDownloadContext.filePath, apkDownloadContext.fileName);
                if (file.exists() && file.getPath().endsWith(jcq.APK_EXTENSION)) {
                    context.startActivity(vz4.b(context, file));
                    hashMap.put("errorCode", "");
                    hashMap.put("success", "true");
                    uz4.c(uz4.MONITOR_POINT_INSTALL_APK_GRAY, apkDownloadContext, hashMap);
                    uz4.d("DirectDownloadInstallApk", null, hashMap);
                    return true;
                }
                hashMap.put("errorCode", "fileNotExistOrInvalid");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK_GRAY, apkDownloadContext, hashMap);
                uz4.d("DirectDownloadInstallApk", null, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext.fileNotExistOrInvalid", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.installApk.error", th);
            return false;
        }
    }

    public final /* synthetic */ void k(AbstractC0548b bVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38babc38", new Object[]{this, bVar, str, str2, str3, str4});
            return;
        }
        try {
            if (i()) {
                CusDataController.ApkDownloadContext apkDownloadContext = new CusDataController.ApkDownloadContext();
                apkDownloadContext.downloadUrl = str;
                apkDownloadContext.appVersion = str2;
                apkDownloadContext.fileSize = Long.parseLong(str3);
                apkDownloadContext.fileMd5 = str4;
                apkDownloadContext.fileName = str2 + jcq.APK_EXTENSION;
                apkDownloadContext.filePath = g();
                if (apkDownloadContext.isValid()) {
                    String f = f(Long.valueOf(apkDownloadContext.fileSize), apkDownloadContext.fileName);
                    if (!TextUtils.isEmpty(f)) {
                        wdm.d("GrayDownloader.directDownload.fileIsReady.return.apkFileReadyPath=%s", f);
                        h(PopLayer.getReference().getApp(), apkDownloadContext);
                        HashMap hashMap = new HashMap();
                        hashMap.put("errorCode", "");
                        hashMap.put("success", "true");
                        uz4.c(uz4.MONITOR_POINT_INSTALL_APK_GRAY, apkDownloadContext, hashMap);
                        if (bVar != null) {
                            ((cqw) bVar).a(false, "alreadyExist");
                            return;
                        }
                        return;
                    }
                    com.taobao.cus.a.q().C(apkDownloadContext);
                    d(apkDownloadContext.appVersion);
                    l(apkDownloadContext);
                    if (bVar != null) {
                        ((cqw) bVar).a(true, "");
                    }
                } else if (bVar != null) {
                    ((cqw) bVar).a(false, "noValidApkDownloadContext");
                }
            } else if (bVar != null) {
                ((cqw) bVar).a(false, "notEnableGrayDownload");
            }
        } catch (Throwable th) {
            wdm.h("GrayDownloader.directDownload.error", th);
            if (bVar != null) {
                ((cqw) bVar).a(false, "catchError=" + th.getMessage());
            }
        }
    }

    public final /* synthetic */ void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840d54aa", new Object[]{this, str});
            return;
        }
        try {
            String g = g();
            File[] listFiles = new File(g).listFiles();
            wdm.d("PreDownloadCenter.clearApkFiles.storePath=%s.", g);
            if (!(listFiles == null || listFiles.length == 0)) {
                for (File file : listFiles) {
                    String name = file.getName();
                    wdm.d("BaseDownloadCenter.clearApkFiles.fileName=%s.", name);
                    if (!TextUtils.isEmpty(name) && name.endsWith(jcq.APK_EXTENSION)) {
                        String substring = name.substring(0, name.indexOf(jcq.APK_EXTENSION));
                        String versionName = Globals.getVersionName();
                        boolean z = vz4.i(versionName, substring) >= 0;
                        if (!z) {
                            z = vz4.i(str, substring) != 0;
                        }
                        if (z) {
                            file.delete();
                            HashMap hashMap = new HashMap();
                            hashMap.put("fileName", name);
                            hashMap.put("filePath", file.getAbsolutePath());
                            uz4.c(uz4.MONITOR_POINT_GRAY_CLEAR_FILES, null, hashMap);
                            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "GrayDownloadCenter.clearApkFile.本地文件版本低.删除.fileVersion=" + substring + ".curAppVersion=" + versionName + ".targetAppVersion=" + str);
                        }
                        wdm.d("PreDownloadCenter.clearApkFile.shouldDelete=%s.fileVersion=%s.curAppVersion=%s.targetAppVersion=%s", Boolean.valueOf(z), substring, versionName, str);
                    }
                }
                return;
            }
            wdm.d("PreDownloadCenter.clearApkFiles.下载目录无文件", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.clearApkFiles.error", th);
        }
    }
}
