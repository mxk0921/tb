package com.taobao.cus;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.cus.CusDataController;
import com.taobao.cus.a;
import com.taobao.cus.b;
import com.taobao.cus.config.model.CusContentModel;
import com.taobao.cus.config.model.CusModel;
import com.taobao.tao.Globals;
import com.taobao.update.datasource.local.UpdateInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.dhb;
import tb.gb1;
import tb.hst;
import tb.iu2;
import tb.j9t;
import tb.jcq;
import tb.kjv;
import tb.lz4;
import tb.onf;
import tb.r0k;
import tb.r4p;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.tz4;
import tb.ud7;
import tb.upl;
import tb.uz4;
import tb.vz4;
import tb.wdm;
import tb.yyb;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f10312a;
    public CusDataController b;
    public com.taobao.cus.b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final a f10315a = new a();

        static {
            t2o.a(790626310);
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("19843f31", new Object[0]);
            }
            return f10315a;
        }
    }

    static {
        t2o.a(790626307);
    }

    public static /* synthetic */ CusDataController b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusDataController) ipChange.ipc$dispatch("1dbec95", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static a q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2b2fb8ac", new Object[0]);
        }
        return c.a();
    }

    public final int A(CusDataController.ApkDownloadContext apkDownloadContext, tu7 tu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e016de6", new Object[]{this, apkDownloadContext, tu7Var})).intValue();
        }
        if (apkDownloadContext == null) {
            return -1;
        }
        try {
            String m = m();
            if (TextUtils.isEmpty(m)) {
                return -1;
            }
            onf onfVar = new onf();
            onfVar.f25507a = apkDownloadContext.downloadUrl;
            onfVar.d = apkDownloadContext.appVersion + jcq.APK_EXTENSION;
            if (lz4.i().a()) {
                onfVar.c = apkDownloadContext.fileMd5;
            }
            onfVar.b = apkDownloadContext.fileSize;
            zu7 zu7Var = new zu7();
            upl uplVar = new upl();
            uplVar.f29547a = "newAPPUpdate";
            uplVar.g = m;
            uplVar.c = 4;
            zu7Var.b = uplVar;
            ArrayList arrayList = new ArrayList();
            zu7Var.f33016a = arrayList;
            arrayList.add(onfVar);
            apkDownloadContext.fileName = onfVar.d;
            apkDownloadContext.filePath = new File(m, onfVar.d).getAbsolutePath();
            this.b.h(apkDownloadContext);
            return rv7.e().b(zu7Var, tu7Var);
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.startDownload.error", th);
            return -1;
        }
    }

    public void C(CusDataController.ApkDownloadContext apkDownloadContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c546436c", new Object[]{this, apkDownloadContext});
        } else {
            this.b.i(apkDownloadContext);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ff6faf", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mz4
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.w();
                }
            });
        }
    }

    public CusDataController.ApkDownloadContext e(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusDataController.ApkDownloadContext) ipChange.ipc$dispatch("2fce8a3c", new Object[]{this, cusContentModel});
        }
        if (cusContentModel != null) {
            try {
                if (cusContentModel.success && cusContentModel.downloadApk != null) {
                    CusDataController.ApkDownloadContext apkDownloadContext = new CusDataController.ApkDownloadContext();
                    apkDownloadContext.appVersion = cusContentModel.updateAppVersion;
                    CusContentModel.CusFileInfo cusFileInfo = cusContentModel.downloadApk;
                    apkDownloadContext.downloadUrl = cusFileInfo.url;
                    apkDownloadContext.fileMd5 = cusFileInfo.md5;
                    apkDownloadContext.fileSize = Long.parseLong(cusFileInfo.fileSize);
                    return apkDownloadContext;
                }
            } catch (Throwable th) {
                wdm.h("UpdateDataController.createApkDownloadContext.error", th);
                return null;
            }
        }
        wdm.d("UpdateDataController.startPreDownload.mUpdateContentModel=null", new Object[0]);
        return null;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd4b01b3", new Object[]{this});
        }
        CusDataController.ApkDownloadContext c2 = this.b.c();
        if (c2 == null) {
            return null;
        }
        onf onfVar = new onf();
        onfVar.b = c2.fileSize;
        onfVar.d = c2.fileName;
        return rv7.e().f(m(), onfVar);
    }

    public Application g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.f10312a;
    }

    public final long h(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc0afa51", new Object[]{this, cusContentModel})).longValue();
        }
        long lastPopTime = kjv.getLastPopTime();
        if (lastPopTime <= 0) {
            wdm.d("PreDownloadCenter.getGlobalPopExpectTime.lastGlobalPopExposeTime<=0.lastGlobalPopExposeTime=%s", Long.valueOf(lastPopTime));
            return -1L;
        }
        long f = lz4.i().f() * 86400;
        long j = cusContentModel.freqIntervalSecs;
        if (j >= f) {
            j = f;
        }
        wdm.d("PreDownloadCenter.getGlobalPopExpectTime.intervalSec=%s.freqIntervalSecs=%s.globalPopIntervalSec=%s.", Long.valueOf(j), Long.valueOf(cusContentModel.freqIntervalSecs), Long.valueOf(f));
        long j2 = (1000 * j) + lastPopTime;
        wdm.d("PreDownloadCenter.getGlobalPopExpectTime.globalPopExpectTime=%s.lastGlobalPopExposeTime=%s.intervalSec=%s", Long.valueOf(j2), Long.valueOf(lastPopTime), Long.valueOf(j));
        return j2;
    }

    public CusDataController.ApkDownloadContext i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusDataController.ApkDownloadContext) ipChange.ipc$dispatch("97e51553", new Object[]{this});
        }
        return this.b.d();
    }

    public final long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4884f7b1", new Object[]{this})).longValue();
        }
        return tz4.c(tz4.SP_KEY_POP_EXPOSE_TIME, 0L);
    }

    public final long k(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1692b5", new Object[]{this, cusContentModel})).longValue();
        }
        long h = h(cusContentModel);
        long l = l(cusContentModel);
        long max = Math.max(l, h);
        wdm.d("PreDownloadCenter.getNextExposeTime.finalExpectTime=%s.globalPopExpectTime=%s.popLayerPopExpectTime=%s", Long.valueOf(max), Long.valueOf(h), Long.valueOf(l));
        return max;
    }

    public final long l(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("137019ee", new Object[]{this, cusContentModel})).longValue();
        }
        long j = j();
        if (j > 0) {
            return j + (cusContentModel.freqIntervalSecs * 1000);
        }
        wdm.d("PreDownloadCenter.getPopLayerPopExpectTime.lastPopExposeTime<=0.lastPopExposeTime=%s", Long.valueOf(j));
        return -1L;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a786ace0", new Object[]{this});
        }
        return vz4.f(PopLayer.getReference().getApp()) + "/appupdate/preDownload/";
    }

    public void o(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f10312a = application;
        this.b = new CusDataController();
        this.c = new com.taobao.cus.b();
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e632e49", new Object[]{this})).booleanValue();
        }
        return this.c.i();
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d9cf82f", new Object[]{this})).booleanValue();
        }
        if (!s() || !t()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void w() {
        String str;
        boolean z;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1351e2", new Object[]{this});
            return;
        }
        try {
            String m = m();
            File[] listFiles = new File(m).listFiles();
            wdm.d("PreDownloadCenter.clearApkFiles.storePath=%s.", m);
            if (!(listFiles == null || listFiles.length == 0)) {
                CusContentModel b2 = this.b.b();
                if (b2 != null) {
                    str = b2.updateAppVersion;
                } else {
                    str = null;
                }
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file = listFiles[i2];
                    String name = file.getName();
                    Object[] objArr = new Object[i];
                    objArr[0] = name;
                    wdm.d("BaseDownloadCenter.clearApkFiles.fileName=%s.", objArr);
                    if (!TextUtils.isEmpty(name) && name.endsWith(jcq.APK_EXTENSION)) {
                        String substring = name.substring(0, name.indexOf(jcq.APK_EXTENSION));
                        String versionName = Globals.getVersionName();
                        if (vz4.i(versionName, substring) >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z && !TextUtils.isEmpty(str)) {
                            if (vz4.i(str, substring) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            file.delete();
                            HashMap hashMap = new HashMap();
                            hashMap.put("fileName", name);
                            hashMap.put("filePath", file.getAbsolutePath());
                            uz4.c(uz4.MONITOR_POINT_CLEAR_FILES, null, hashMap);
                            uz4.d("clearApkFiles", null, hashMap);
                            wdm.d("PreDownloadCenter.clearApkFile.本地文件版本低.删除.fileVersion=%s.curAppVersion=%s.targetAppVersion=%s", substring, versionName, str);
                        }
                        wdm.d("PreDownloadCenter.clearApkFile.shouldDelete=%s.fileVersion=%s.curAppVersion=%s.targetAppVersion=%s", Boolean.valueOf(z), substring, versionName, str);
                    }
                    i2++;
                    i = 1;
                }
                return;
            }
            wdm.d("PreDownloadCenter.clearApkFiles.下载目录无文件", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.clearApkFiles.error", th);
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be86520a", new Object[]{this})).booleanValue();
        }
        return this.b.f();
    }

    public void z(String str, String str2, String str3, String str4, b.AbstractC0548b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef69bb0", new Object[]{this, str, str2, str3, str4, bVar});
        } else {
            this.c.e(str, str2, str3, str4, bVar);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.cus.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0547a implements yyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0547a() {
        }

        @Override // tb.yyb
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da277f39", new Object[]{this, str});
            } else {
                wdm.d("PreDownloadCenter.requestUpdateInfo.onResponseError=%s", str);
            }
        }

        @Override // tb.yyb
        public void b(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad91c6f4", new Object[]{this, str});
            } else if (!TextUtils.isEmpty(str)) {
                hst.b(new Runnable() { // from class: tb.nz4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0547a.this.d(str);
                    }
                });
            }
        }

        public final /* synthetic */ void d(String str) {
            List<CusContentModel> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ccffce6", new Object[]{this, str});
                return;
            }
            try {
                wdm.d("PreDownloadCenter.requestUpdateInfo.onResponseSuccess=%s", str);
                CusModel cusModel = (CusModel) JSON.parseObject(str).getJSONObject("contentMap").getObject("promote_update", CusModel.class);
                if (cusModel.success && (list = cusModel.content) != null && !list.isEmpty()) {
                    a.b(a.this).g(cusModel.content.get(0));
                }
            } catch (Throwable th) {
                wdm.h("PreDownloadCenter.requestUpdateInfo.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CusDataController.ApkDownloadContext f10314a;

        public b(a aVar, CusDataController.ApkDownloadContext apkDownloadContext) {
            this.f10314a = apkDownloadContext;
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
            } else {
                wdm.d("Updater.startDownload.onDownloadProgress.i=%s", Integer.valueOf(i));
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            wdm.d("Updater.startDownload.onFinish.result=%s", Boolean.valueOf(z));
            uz4.d("PreDownloadOnFinish", this.f10314a, null);
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            wdm.d("Updater.startDownload.onNetworkLimit.i=%s", Integer.valueOf(i));
            uz4.d("PreDownloadNetWorkLimit", this.f10314a, null);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            wdm.d("Updater.startDownload.onDownloadFinish.url=%s.filePath=%s", str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", "");
            hashMap.put("success", "true");
            uz4.c(uz4.MONITOR_POINT_FINISH, this.f10314a, hashMap);
            uz4.d(uz4.MONITOR_POINT_FINISH, this.f10314a, hashMap);
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            wdm.d("Updater.startDownload.onDownloadStateChange.url=%s.isDownloading=%s", str, Boolean.valueOf(z));
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("isDownloading", String.valueOf(z));
            uz4.d("PreDownloadDownloadStateChange", this.f10314a, hashMap);
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            wdm.d("Updater.startDownload.onDownloadError.url=%s.errorCode=%s.msg=%s", str, Integer.valueOf(i), str2);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", String.valueOf(i));
            hashMap.put("success", "false");
            uz4.c(uz4.MONITOR_POINT_FINISH, this.f10314a, hashMap);
            uz4.d("PreDownloadError", this.f10314a, hashMap);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac65690", new Object[]{this});
            return;
        }
        uz4.d(uz4.MONITOR_POINT_START, null, null);
        boolean s = s();
        boolean t = t();
        HashMap hashMap = new HashMap();
        if (!s || !t) {
            if (!s) {
                hashMap.put("errorCode", "downloadStrategyEnableIsFalse");
            } else {
                hashMap.put("errorCode", "downloadStrategySettingsEnableIsFalse");
            }
            hashMap.put("success", "false");
            uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
            uz4.d("PreDownloadStartFail", null, hashMap);
            wdm.d("Updater.startPreDownload.enable=false.downloadStrategyEnable=%s.downloadStrategySettingsEnable=%s", Boolean.valueOf(s), Boolean.valueOf(t));
        } else if (!x()) {
            hashMap.put("errorCode", "needUpdate=false");
            hashMap.put("success", "false");
            uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
            uz4.d("PreDownloadStartFail", null, hashMap);
            wdm.d("Updater.startPreDownload.needUpdate=false", new Object[0]);
        } else {
            CusContentModel b2 = this.b.b();
            if (b2 == null) {
                hashMap.put("errorCode", "updateStrategyIsNull");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
                uz4.d("PreDownloadStartFail", null, hashMap);
                wdm.d("Updater.startPreDownload.updateStrategyIsNull", new Object[0]);
            } else if (!"preDownload".equals(b2.updateStrategy)) {
                hashMap.put("errorCode", "updateStrategyNotPreDownload.updateStrategy=" + b2.updateStrategy);
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
                uz4.d("PreDownloadStartFail", null, hashMap);
                wdm.d("Updater.startPreDownload.updateStrategyNotPreDownload.updateStrategy=%s", b2.updateStrategy);
            } else if (!n(b2)) {
                hashMap.put("errorCode", "notHitPreDownloadTimeWindow");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
                uz4.d("PreDownloadStartFail", null, hashMap);
                wdm.d("Updater.startPreDownload.notHitPreDownloadTimeWindow", new Object[0]);
            } else {
                CusDataController.ApkDownloadContext e = e(b2);
                if (e == null) {
                    hashMap.put("errorCode", "apkDownloadContextIsFalse");
                    hashMap.put("success", "false");
                    uz4.c(uz4.MONITOR_POINT_START, null, hashMap);
                    uz4.d("PreDownloadStartFail", null, hashMap);
                    wdm.d("Updater.startPreDownload.apkDownloadContext=null.return", new Object[0]);
                    return;
                }
                String f = f();
                if (!TextUtils.isEmpty(f)) {
                    hashMap.put("errorCode", "AlreadyExist");
                    hashMap.put("success", "false");
                    uz4.c(uz4.MONITOR_POINT_START, e, hashMap);
                    uz4.d("PreDownloadStartFail", e, hashMap);
                    wdm.d("Updater.startPreDownload.fileIsReady.return.apkFileReadyPath=%s", f);
                    return;
                }
                wdm.d("Updater.startPreDownload.", new Object[0]);
                A(e, new b(this, e));
                hashMap.put("errorCode", "");
                hashMap.put("success", "true");
                uz4.c(uz4.MONITOR_POINT_START, e, hashMap);
                uz4.d("PreDownloadStartSuccess", e, hashMap);
            }
        }
    }

    public final boolean D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62c26cf7", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject.containsKey(r4p.KEY_IS_BETA) && jSONObject.containsKey("batchType") && jSONObject.containsKey("batchCreateTime");
    }

    public boolean c() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c93e9cbd", new Object[]{this})).booleanValue();
        }
        CusContentModel b2 = this.b.b();
        if (b2 == null || b2.freqIntervalSecs <= 0) {
            if (b2 != null) {
                obj = Long.valueOf(b2.freqIntervalSecs);
            } else {
                obj = "null";
            }
            wdm.d("PreDownloadCenter.checkPopExposeInterval.freqIntervalSecsInValid=%s", obj);
            return false;
        }
        long k = k(b2);
        if (k <= 0) {
            wdm.d("PreDownloadCenter.checkPopExposeInterval.nextExposeTime<=0.nextExposeTime=%s", Long.valueOf(k));
            return true;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        boolean z = k < currentTimeStamp;
        wdm.d("PreDownloadCenter.checkPopExposeInterval.passInterval=%s.nextExposeTime=%s.freqIntervalSecs=%s.curTime=%s", Boolean.valueOf(z), Long.valueOf(k), Long.valueOf(b2.freqIntervalSecs), Long.valueOf(currentTimeStamp));
        return z;
    }

    public boolean p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb6ce644", new Object[]{this, context})).booleanValue();
        }
        try {
            CusDataController.ApkDownloadContext c2 = this.b.c();
            HashMap hashMap = new HashMap();
            if (c2 == null) {
                hashMap.put("errorCode", "lastDownloadContextIsNull");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK, null, hashMap);
                uz4.d("PreDownloadInstallApkFail", null, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext=null", new Object[0]);
                return false;
            } else if (TextUtils.isEmpty(c2.filePath)) {
                hashMap.put("errorCode", "filePathIsNull");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK, c2, hashMap);
                uz4.d("PreDownloadInstallApkFail", c2, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext.filePath=null", new Object[0]);
                return false;
            } else {
                File file = new File(c2.filePath);
                if (file.exists() && file.getPath().endsWith(jcq.APK_EXTENSION)) {
                    context.startActivity(vz4.b(context, file));
                    hashMap.put("errorCode", "");
                    hashMap.put("success", "true");
                    uz4.c(uz4.MONITOR_POINT_INSTALL_APK, c2, hashMap);
                    uz4.d(uz4.MONITOR_POINT_INSTALL_APK, c2, hashMap);
                    return true;
                }
                hashMap.put("errorCode", "fileNotExistOrInvalid");
                hashMap.put("success", "false");
                uz4.c(uz4.MONITOR_POINT_INSTALL_APK, c2, hashMap);
                uz4.d("PreDownloadInstallApkFail", c2, hashMap);
                wdm.d("PreDownloadCenter.installApk.lastDownloadContext.fileNotExistOrInvalid", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.installApk.error", th);
            return false;
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4530d7d3", new Object[]{this})).booleanValue();
        }
        boolean j = lz4.i().j();
        boolean l = lz4.i().l();
        boolean g = vz4.g(this.f10312a);
        wdm.f("apkDownload", "", "wifiPreDownloadEnable" + l + ".isNewStrategyEnable=" + j + ".isGPChannel=" + g);
        return j && l && !g;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7669cb56", new Object[]{this})).booleanValue();
        }
        try {
            dhb b2 = j9t.e(PopLayer.getReference().getApp(), "architecture").b();
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = (Boolean) b2.d("architecture", r0k.KEY_WIFI_AUTO_DOWNLOAD, bool, null);
            if (bool2 != null) {
                return bool2.equals(bool);
            }
            return false;
        } catch (Throwable th) {
            wdm.h("PreDownloadCenter.isDownloadStrategySettingsEnable.error", th);
            return false;
        }
    }

    public String u() {
        JSONObject jSONObject;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb819efb", new Object[]{this});
        }
        try {
            UpdateInfo.UpdateData a2 = this.b.a();
            if (!(a2 == null || (jSONObject = a2.value) == null || jSONObject.isEmpty())) {
                JSONObject jSONObject2 = a2.value;
                String string = jSONObject2.getString("version");
                if (D(jSONObject2)) {
                    boolean booleanValue = jSONObject2.getBooleanValue(r4p.KEY_IS_BETA);
                    String string2 = jSONObject2.getString("batchType");
                    z = !booleanValue && "FULL".equals(string2);
                    wdm.d("Updater.isInUpdatePeriod.isBeta=%s.batchType=%s", Boolean.valueOf(booleanValue), string2);
                } else {
                    z = vz4.h(string);
                    wdm.d("Updater.isInUpdatePeriod.appVersion=%s", string);
                }
                if (z) {
                    return "";
                }
                wdm.d("Updater.isInUpdatePeriod.isNotOfficialVersion", new Object[0]);
                return "NOT_OFFICIAL_FULL_VERSION";
            }
            wdm.d("Updater.isInUpdatePeriod.apkUpdateData=null", new Object[0]);
            return "APK_VALUE_NULL";
        } catch (Throwable th) {
            wdm.h("BaseDownloadCenter.isInUpdatePeriod.error", th);
            return iu2.CALENDAR_ERROR_CATCH;
        }
    }

    public void y() {
        CusContentModel b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7d3e8d", new Object[]{this});
        } else if (!lz4.i().j()) {
            wdm.d("PreDownloadCenter.requestUpdateInfo.isNewStrategyEnable=false.return", new Object[0]);
        } else if (vz4.g(this.f10312a)) {
            wdm.d("PreDownloadCenter.requestUpdateInfo.isGPChannel=true.return", new Object[0]);
        } else if (tz4.b(tz4.SP_KEY_IGNORE_NEXT_MTOP_TIME, false) || (b2 = this.b.b()) == null || b2.nextRefreshTime <= PopLayer.getReference().getCurrentTimeStamp(false) / 1000) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("taobao_android");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("canJumpStoreAutoUpdate", (Object) String.valueOf(vz4.c(this.f10312a)));
            if (lz4.i().o()) {
                jSONObject.put("arch", (Object) String.valueOf(gb1.a(this.f10312a)));
            } else {
                jSONObject.put("arch", (Object) "-1");
            }
            jSONObject.put("apiLevel", (Object) Integer.valueOf(Build.VERSION.SDK_INT));
            ud7.d().e("promote_update", arrayList, jSONObject, new C0547a());
        } else {
            wdm.d("PreDownloadCenter.requestUpdateInfo.nextRefreshTimeNotReach.nextRefreshTime=%s", Long.valueOf(b2.nextRefreshTime));
        }
    }

    public boolean n(CusContentModel cusContentModel) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b992932a", new Object[]{this, cusContentModel})).booleanValue();
        }
        if (cusContentModel == null || cusContentModel.freqIntervalSecs <= 0) {
            if (cusContentModel != null) {
                obj = Long.valueOf(cusContentModel.freqIntervalSecs);
            } else {
                obj = "null";
            }
            wdm.d("PreDownloadCenter.hitPreDownloadTimeWindow.freqIntervalSecsInValid=%s", obj);
            return false;
        }
        long k = k(cusContentModel);
        if (k <= 0) {
            wdm.d("PreDownloadCenter.hitPreDownloadTimeWindow.nextExposeTime<=0.nextExposeTime=%s", Long.valueOf(k));
            return true;
        }
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        long g = lz4.i().g() * 86400;
        boolean z = currentTimeStamp > k - g;
        wdm.d("PreDownloadCenter.hitPreDownloadTimeWindow.canDownload=%s.curTime=%s.nextExposeTime=%s.preDownloadWindowSec=%s", Boolean.valueOf(z), Long.valueOf(currentTimeStamp), Long.valueOf(k), Long.valueOf(g));
        return z;
    }
}
