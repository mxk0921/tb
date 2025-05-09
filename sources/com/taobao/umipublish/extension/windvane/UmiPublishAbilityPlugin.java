package com.taobao.umipublish.extension.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.extension.windvane.abilities.DownloadFilesAbility;
import com.taobao.umipublish.extension.windvane.abilities.DownloadMaterialAbility;
import com.taobao.umipublish.extension.windvane.abilities.ImageStokeAbility;
import com.taobao.umipublish.extension.windvane.abilities.KfcCheckAbility;
import com.taobao.umipublish.extension.windvane.abilities.WVListener;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.taobao.umipublish.util.RemoteEnvUtil;
import java.util.HashMap;
import java.util.Map;
import tb.kpw;
import tb.m3v;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiPublishAbilityPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PKG_NAME = "com.taobao.umipublish.extension.windvane.abilities";
    public static final String PLUGIN_NAME = "WVUmiPublishAbility";
    private static final Map<String, Class<? extends BaseAbility>> sAbilityMap;
    private static final Map<String, String> sAbilityNameMap;

    public static /* synthetic */ void access$000(UmiPublishAbilityPlugin umiPublishAbilityPlugin, BaseAbility baseAbility, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee7e439", new Object[]{umiPublishAbilityPlugin, baseAbility, str, wVCallBackContext});
        } else {
            umiPublishAbilityPlugin.doExecute(baseAbility, str, wVCallBackContext);
        }
    }

    private void doExecute(BaseAbility baseAbility, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68fc6c", new Object[]{this, baseAbility, str, wVCallBackContext});
            return;
        }
        baseAbility.setContext(this.mContext);
        baseAbility.setListener(new WVListener(wVCallBackContext));
        baseAbility.execute(JSON.parseObject(str));
    }

    public static /* synthetic */ Object ipc$super(UmiPublishAbilityPlugin umiPublishAbilityPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiPublishAbilityPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        BaseAbility baseAbility;
        if (!TextUtils.isEmpty(str) && wVCallBackContext != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("className", PLUGIN_NAME);
            hashMap.put("funcName", str);
            new m3v("Page_GGTabs", "gg111.19920601").a(WindvaneCall.TAG, hashMap, true);
            Class<? extends BaseAbility> cls = sAbilityMap.get(str);
            final String str3 = sAbilityNameMap.get(str);
            if (cls == null && str3 == null) {
                return false;
            }
            try {
                if (cls != null) {
                    baseAbility = (BaseAbility) cls.newInstance();
                } else if (RemoteEnvUtil.c("guangguang", false)) {
                    baseAbility = (BaseAbility) Class.forName(str3).newInstance();
                } else {
                    RemoteEnvUtil.a(this.mContext, "guangguang", new RemoteEnvUtil.a() { // from class: com.taobao.umipublish.extension.windvane.UmiPublishAbilityPlugin.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                        public void a(String str4, String str5) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str4, str5});
                            } else {
                                wVCallBackContext.error();
                            }
                        }

                        @Override // com.taobao.umipublish.util.RemoteEnvUtil.a
                        public void b() {
                            WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                            try {
                                UmiPublishAbilityPlugin.access$000(UmiPublishAbilityPlugin.this, (BaseAbility) Class.forName(str3).newInstance(), str2, wVCallBackContext2);
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                odg.c(UmiPublishAbilityPlugin.PLUGIN_NAME, "execute ability error! e:" + stackTraceString);
                                UmiPublishMonitor.w().o(UmiPublishAbilityPlugin.PLUGIN_NAME, "-1", "execute_ability_error", stackTraceString);
                                wVCallBackContext2.error();
                            }
                        }
                    });
                    baseAbility = null;
                }
                doExecute(baseAbility, str2, wVCallBackContext);
                return true;
            } catch (Throwable th) {
                String stackTraceString = Log.getStackTraceString(th);
                odg.c(PLUGIN_NAME, "execute ability error! e:" + stackTraceString);
                UmiPublishMonitor.w().o(PLUGIN_NAME, "-1", "execute_ability_error", stackTraceString);
            }
        }
        return false;
    }

    static {
        t2o.a(944767088);
        HashMap hashMap = new HashMap();
        sAbilityMap = hashMap;
        HashMap hashMap2 = new HashMap();
        sAbilityNameMap = hashMap2;
        hashMap.put("downloadFiles", DownloadFilesAbility.class);
        hashMap.put("downloadMaterialByIds", DownloadMaterialAbility.class);
        hashMap.put("kfcCheck", KfcCheckAbility.class);
        hashMap.put("imageCutoutAndStoke", ImageStokeAbility.class);
        hashMap2.put("uploadFiles", "com.taobao.umipublish.extension.windvane.abilities.UploadFilesAbility");
        hashMap2.put("contentPublish", "com.taobao.umipublish.extension.windvane.abilities.ContentPublishAbility");
        hashMap2.put("templateExport", "com.taobao.umipublish.extension.windvane.abilities.TemplateExportAbility");
        hashMap2.put("localImage2Base64", "com.taobao.umipublish.extension.windvane.abilities.LocalImage2Base64Ability");
        hashMap2.put("queryTaskStatus", "com.taobao.umipublish.extension.windvane.abilities.QueryTaskStatusAbility");
    }
}
