package com.taobao.cus;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.config.model.CusContentModel;
import com.taobao.tao.Globals;
import com.taobao.update.datasource.local.UpdateInfo;
import java.io.Serializable;
import tb.kjv;
import tb.lz4;
import tb.t2o;
import tb.tz4;
import tb.vz4;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CusDataController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CusContentModel f10311a;
    public UpdateInfo.UpdateData b;
    public ApkDownloadContext c;
    public ApkDownloadContext d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ApkDownloadContext implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String appVersion;
        public String downloadUrl;
        public String fileMd5;
        public String fileName;
        public String filePath;
        public long fileSize;

        static {
            t2o.a(790626306);
        }

        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.appVersion) || TextUtils.isEmpty(this.downloadUrl) || this.fileSize <= 0) {
                return false;
            }
            return true;
        }
    }

    static {
        t2o.a(790626305);
    }

    public UpdateInfo.UpdateData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("38565600", new Object[]{this});
        }
        if (this.b == null) {
            this.b = kjv.getInstance().getApkUpdateData();
        }
        return this.b;
    }

    public ApkDownloadContext c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkDownloadContext) ipChange.ipc$dispatch("97319aaa", new Object[]{this});
        }
        if (this.c == null) {
            String e = tz4.e(tz4.SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE, "");
            if (!TextUtils.isEmpty(e)) {
                this.c = (ApkDownloadContext) JSON.parseObject(e, ApkDownloadContext.class);
            }
        }
        return this.c;
    }

    public ApkDownloadContext d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkDownloadContext) ipChange.ipc$dispatch("63db90c7", new Object[]{this});
        }
        if (this.d == null) {
            String e = tz4.e(tz4.SP_KEY_LAST_DOWNLOAD_CONTEXT_GRAY, "");
            if (!TextUtils.isEmpty(e)) {
                this.d = (ApkDownloadContext) JSON.parseObject(e, ApkDownloadContext.class);
            }
        }
        return this.d;
    }

    public final boolean e(CusContentModel cusContentModel) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f007b209", new Object[]{this, cusContentModel})).booleanValue();
        }
        if (cusContentModel == null) {
            return false;
        }
        if (!cusContentModel.success) {
            wdm.d("UpdateDataController.isUpdateContentValid.apkUpdateModel.success=false.", new Object[0]);
            return false;
        }
        long h = lz4.i().h();
        long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
        if (cusContentModel.serverTimestamp + (1000 * h) < currentTimeStamp) {
            z = true;
        } else {
            z = false;
        }
        wdm.d("UpdateDataController.isUpdateContentValid.dataOutOfTime=%s.updateDataValidInterval=%s.curTime=%s.serverTimestamp=%s.", Boolean.valueOf(z), Long.valueOf(h), Long.valueOf(currentTimeStamp), Long.valueOf(cusContentModel.serverTimestamp));
        if (z || TextUtils.isEmpty(cusContentModel.localAppVersion)) {
            return false;
        }
        String versionName = Globals.getVersionName();
        if (vz4.i(cusContentModel.localAppVersion, versionName) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        wdm.d("UpdateDataController.isUpdateContentValid.versionChanged=%s.curAppVersion=%s.localAppVersion=%s.", Boolean.valueOf(z2), versionName, cusContentModel.localAppVersion);
        return !z2;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be86520a", new Object[]{this})).booleanValue();
        }
        CusContentModel b = b();
        if (b == null) {
            wdm.d("UpdateDataController.needUpdate.apkUpdateModel=null.return.false.", new Object[0]);
            return false;
        } else if (!b.needUpdate) {
            wdm.d("UpdateDataController.needUpdate.apkUpdateModel.needUpdate=false.return.false.", new Object[0]);
            return false;
        } else if (vz4.i(b.updateAppVersion, Globals.getVersionName()) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void g(CusContentModel cusContentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce84ace", new Object[]{this, cusContentModel});
        } else if (e(cusContentModel)) {
            this.f10311a = cusContentModel;
            tz4.h(tz4.SP_KEY_UPDATE_MODEL, JSON.toJSONString(cusContentModel));
        }
    }

    public void h(ApkDownloadContext apkDownloadContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69af2769", new Object[]{this, apkDownloadContext});
            return;
        }
        this.c = apkDownloadContext;
        if (apkDownloadContext != null) {
            str = JSON.toJSONString(apkDownloadContext);
        } else {
            str = "";
        }
        tz4.h(tz4.SP_KEY_LAST_DOWNLOAD_CONTEXT_PRE, str);
    }

    public void i(ApkDownloadContext apkDownloadContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c546436c", new Object[]{this, apkDownloadContext});
            return;
        }
        this.d = apkDownloadContext;
        if (apkDownloadContext != null) {
            str = JSON.toJSONString(apkDownloadContext);
        } else {
            str = "";
        }
        tz4.h(tz4.SP_KEY_LAST_DOWNLOAD_CONTEXT_GRAY, str);
    }

    public CusContentModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CusContentModel) ipChange.ipc$dispatch("f78719f3", new Object[]{this});
        }
        if (this.f10311a == null) {
            String e = tz4.e(tz4.SP_KEY_UPDATE_MODEL, "");
            if (!TextUtils.isEmpty(e)) {
                CusContentModel cusContentModel = (CusContentModel) JSON.parseObject(e, CusContentModel.class);
                if (!e(cusContentModel)) {
                    wdm.d("UpdateDataController.getApkUpdateModel.updateContentModel.Invalid.return.null.", new Object[0]);
                    return null;
                }
                this.f10311a = cusContentModel;
            }
        }
        return this.f10311a;
    }
}
