package com.taobao.cus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.WVCusPlugin;
import tb.cqw;
import tb.ezl;
import tb.hst;
import tb.jwi;
import tb.kjv;
import tb.kpw;
import tb.ku0;
import tb.lz4;
import tb.nsw;
import tb.t2o;
import tb.tz4;
import tb.uz4;
import tb.vem;
import tb.vz4;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVCusPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626316);
    }

    public static /* synthetic */ Object ipc$super(WVCusPlugin wVCusPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cus/WVCusPlugin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$5(nsw nswVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e59f979", new Object[]{nswVar, wVCallBackContext});
            return;
        }
        nswVar.b("enable", String.valueOf(a.q().v()));
        wVCallBackContext.success(nswVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$6(nsw nswVar, WVCallBackContext wVCallBackContext, String str, String str2, String str3, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("878b6e28", new Object[]{nswVar, wVCallBackContext, str, str2, str3, new Boolean(z), str4});
            return;
        }
        nswVar.a("result", Boolean.valueOf(z));
        nswVar.b("errorMessage", str4);
        wVCallBackContext.success(nswVar);
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "WVAPKUpdatePlugin.directDownload.downloadUrl=" + str + ".version=" + str2 + ".fileSize=" + str3 + ".success=" + z + ".errorMessage=" + str4);
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        final nsw nswVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            nswVar = new nsw();
        } catch (Throwable th) {
            wdm.h("WVAPKUpdatePlugin.execute." + str + ".error.", th);
            wVCallBackContext.error("catchError");
        }
        if ("isPreUpdateOrangeEnable".equals(str)) {
            nswVar.b("enable", String.valueOf(lz4.i().l()));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("isNewStrategyEnable".equals(str)) {
            nswVar.b("enable", String.valueOf(lz4.i().j()));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("isPreUpdateEnable".equals(str)) {
            hst.b(new Runnable() { // from class: tb.bqw
                @Override // java.lang.Runnable
                public final void run() {
                    WVCusPlugin.lambda$execute$5(nsw.this, wVCallBackContext);
                }
            });
            return true;
        } else if ("isPreAPKReady".equals(str)) {
            String f = a.q().f();
            if (!TextUtils.isEmpty(f)) {
                nswVar.b("filePath", f);
                nswVar.a("isReady", Boolean.TRUE);
            } else {
                nswVar.b("filePath", "");
                nswVar.a("isReady", Boolean.FALSE);
            }
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("getABValue".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            nswVar.b("value", vz4.e(parseObject.getString("module"), parseObject.getString(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION)));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("jumpToSettings".equals(str)) {
            if (Build.VERSION.SDK_INT < 26) {
                nswVar.b("errorMsg", "SYSTEM_LEVEL_INVALID");
                wVCallBackContext.error(nswVar);
            } else {
                ezl.f(this.mContext, JSON.parseObject(str2).getBooleanValue("openSettingsHome"));
                uz4.d("jumpToSettings", null, null);
                wVCallBackContext.success(nswVar);
            }
            return true;
        } else if ("installPreDownloadedAPK".equals(str)) {
            nswVar.a("installApkSuccess", Boolean.valueOf(a.q().p(getContext())));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("checkPopExposeInterval".equals(str)) {
            nswVar.b("result", String.valueOf(a.q().c()));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("updatePopExposeTime".equals(str)) {
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp(false);
            tz4.g(tz4.SP_KEY_POP_EXPOSE_TIME, currentTimeStamp);
            kjv.setLastPopTime(currentTimeStamp);
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("getUpdateData".equals(str)) {
            String e = tz4.e(tz4.SP_KEY_UPDATE_MODEL, "");
            if (!TextUtils.isEmpty(e)) {
                nswVar.h(new org.json.JSONObject(e));
            } else {
                nswVar.h(new org.json.JSONObject());
            }
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("getBrand".equals(str)) {
            nswVar.b("brand", Build.BRAND.toLowerCase());
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("enableJumpStoreVIVO".equals(str)) {
            nswVar.a("enable", Boolean.valueOf(vz4.c(this.mContext)));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("jumpStoreVIVO".equals(str)) {
            if (vz4.c(this.mContext)) {
                Intent intent = new Intent();
                String packageName = this.mContext.getPackageName();
                intent.setData(Uri.parse("vivomarket://details?id=" + packageName + "&th_name=self_update"));
                intent.setPackage("com.bbk.appstore");
                intent.setFlags(335544320);
                this.mContext.startActivity(intent);
                nswVar.a("success", Boolean.TRUE);
                wVCallBackContext.success(nswVar);
                return true;
            }
            nswVar.a("success", Boolean.FALSE);
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("ignoreNextMtopTime".equals(str)) {
            tz4.f(tz4.SP_KEY_IGNORE_NEXT_MTOP_TIME, JSON.parseObject(str2).getBooleanValue(jwi.MATCH_IGNORE));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("hasValidMarket".equals(str)) {
            nswVar.a("result", Boolean.valueOf(vz4.a(PopLayer.getReference().getApp())));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("isGPChannel".equals(str)) {
            nswVar.a("result", Boolean.valueOf(vz4.g(PopLayer.getReference().getApp())));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("jumpStore".equals(str)) {
            nswVar.a("result", Boolean.valueOf(vem.i(PopLayer.getReference().getApp(), null)));
            wVCallBackContext.success(nswVar);
            return true;
        } else if ("enableDirectDownload".equals(str)) {
            nswVar.a("result", Boolean.valueOf(a.q().r()));
            wVCallBackContext.success(nswVar);
            return true;
        } else {
            if ("directDownload".equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                String string = parseObject2.getString("fileSize");
                String string2 = parseObject2.getString("md5");
                String string3 = parseObject2.getString("downloadUrl");
                String string4 = parseObject2.getString("version");
                a.q().z(string3, string4, string, string2, new cqw(nswVar, wVCallBackContext, string3, string4, string));
                return true;
            }
            return false;
        }
    }
}
