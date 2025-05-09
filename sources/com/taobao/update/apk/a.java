package com.taobao.update.apk;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.UpdateRuntime;
import tb.b5g;
import tb.c3k;
import tb.c62;
import tb.ekv;
import tb.hdt;
import tb.lg8;
import tb.q11;
import tb.t2o;
import tb.z9k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APEFFICIENCY = "apefficiency";

    /* renamed from: a  reason: collision with root package name */
    public final ekv f14083a;

    static {
        t2o.a(953155590);
    }

    public a() {
        this.f14083a = null;
        try {
            this.f14083a = (ekv) c62.getInstance(ekv.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public hdt execute(boolean z, boolean z2, MainUpdateData mainUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hdt) ipChange.ipc$dispatch("63a47224", new Object[]{this, new Boolean(z), new Boolean(z2), mainUpdateData});
        }
        ApkUpdateContext apkUpdateContext = null;
        try {
            Intent intent = new Intent("app_update_msg");
            intent.putExtra("hasApkUpdate", true);
            UpdateRuntime.getContext().sendBroadcast(intent);
            apkUpdateContext = a(z, z2, mainUpdateData);
            ekv ekvVar = this.f14083a;
            if (ekvVar != null) {
                ekvVar.commit("apefficiency");
            }
            if (apkUpdateContext.isForceUpdate() && !apkUpdateContext.isDownloadError) {
                UpdateRuntime.log("UpdateFlowController start to do KillAppProcessor ");
                new b5g().execute(apkUpdateContext);
            }
        } catch (Throwable th) {
            UpdateRuntime.log("do apk update error", th);
        }
        return apkUpdateContext;
    }

    public final ApkUpdateContext a(boolean z, boolean z2, MainUpdateData mainUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkUpdateContext) ipChange.ipc$dispatch("5530fc67", new Object[]{this, new Boolean(z), new Boolean(z2), mainUpdateData});
        }
        ApkUpdateContext apkUpdateContext = new ApkUpdateContext();
        apkUpdateContext.context = UpdateRuntime.getContext();
        apkUpdateContext.background = z;
        apkUpdateContext.mainUpdate = mainUpdateData;
        String str = mainUpdateData.version;
        String downloadUrl = mainUpdateData.getDownloadUrl();
        ekv ekvVar = this.f14083a;
        if (ekvVar != null) {
            ekvVar.add("apefficiency", true, "revupdate", "", "", str, downloadUrl, 0L, 0L);
        }
        UpdateRuntime.log("UpdateFlowController start to execute in background " + z);
        q11.getProcessor(lg8.class).execute(apkUpdateContext);
        ekv ekvVar2 = this.f14083a;
        if (ekvVar2 != null) {
            ekvVar2.add("apefficiency", apkUpdateContext.success, "disk", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, downloadUrl, 0L, 0L);
        }
        if (!apkUpdateContext.success) {
            UpdateRuntime.log("UpdateFlowController failed to pass EnvCheckProcessor " + apkUpdateContext);
            return apkUpdateContext;
        }
        if (!z2) {
            UpdateRuntime.log("UpdateFlowController start to do apk update ");
            q11.getProcessor(z9k.class).execute(apkUpdateContext);
            ekv ekvVar3 = this.f14083a;
            if (ekvVar3 != null) {
                ekvVar3.add("apefficiency", apkUpdateContext.success, "notifytimes", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, downloadUrl, 0L, 0L);
            }
            if (!apkUpdateContext.success) {
                if (apkUpdateContext.exceedUpdateTimes.booleanValue()) {
                    UpdateRuntime.log("update check not pass, exceedUpdateTimes=true");
                } else {
                    UpdateRuntime.log("update check not pass, exceedUpdateTimes=false");
                }
                UpdateRuntime.log("UpdateFlowController failed to pass NotifyTimesCheckProcessor " + apkUpdateContext);
                return apkUpdateContext;
            }
        }
        return (apkUpdateContext.isForceUpdate() || apkUpdateContext.notifyPolicy == ApkUpdateContext.NotifyPolicy.DEFAULT) ? c3k.getInstance().doUpdate(apkUpdateContext, z2, str, downloadUrl) : apkUpdateContext;
    }
}
