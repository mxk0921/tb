package com.taobao.message.lab.comfrm.inner2.resource;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.config.PatchInfo;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.File;
import java.util.HashMap;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PatchUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919733);
    }

    public static boolean equals(PatchInfo patchInfo, PatchInfo patchInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c63246a", new Object[]{patchInfo, patchInfo2})).booleanValue();
        }
        if (patchInfo == null && patchInfo2 != null) {
            return true;
        }
        if (patchInfo != null && patchInfo2 == null) {
            return true;
        }
        if (patchInfo == null || patchInfo2 == null || TextUtils.equals(patchInfo.patchVersion, patchInfo2.patchVersion)) {
            return false;
        }
        return true;
    }

    public static String getDir(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d7ffc7", new Object[]{patchInfo});
        }
        String diskFileDir = FileUtil.getDiskFileDir(ApplicationUtil.getApplication(), Constants.Monitor.POINT_PATCH);
        StringBuilder sb = new StringBuilder();
        sb.append(diskFileDir);
        String str = File.separator;
        sb.append(str);
        sb.append(ApplicationBuildInfo.getAppVersionName());
        sb.append(str);
        sb.append(patchInfo.patchVersion);
        return sb.toString();
    }

    public static void commitMonitor(String str, String str2, String str3, boolean z, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851ba916", new Object[]{str, str2, str3, new Boolean(z), str4});
            return;
        }
        HashMap hashMap = new HashMap(4);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("patchVersion", str);
        }
        hashMap.put(v4s.PARAM_UPLOAD_STAGE, str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("file", str3);
        if (TextUtils.isEmpty(str4)) {
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            hashMap.put("hit", str5);
            AppMonitor.Alarm.commitSuccess(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_PATCH, JSON.toJSONString(hashMap));
            return;
        }
        String jSONString = JSON.toJSONString(hashMap);
        Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(1015).errCode(str4).errMsg("ResourceManager Patch Error").ext("param", jSONString).build());
        AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_PATCH, jSONString, str4, "");
    }
}
