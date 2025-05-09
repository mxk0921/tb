package com.alipay.android.app.cctemplate.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DrmUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static JSONObject getDrmValueFromKey(Context context, String str, JSONObject jSONObject) {
        String str2 = "null";
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", "Context 为空");
                return jSONObject;
            }
            JSONObject jSONObject2 = (JSONObject) DrmManager.class.getMethod("getDrmValueFromKey", String.class).invoke(DrmManager.class.getMethod("getInstance", Context.class).invoke(null, context), str);
            StringBuilder sb = new StringBuilder("获取 DRM 开关 ");
            sb.append(str);
            sb.append("，返回 ");
            if (jSONObject2 != null) {
                str2 = jSONObject2.toJSONString();
            }
            sb.append(str2);
            LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb.toString());
            return jSONObject2;
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                StringBuilder sb2 = new StringBuilder("获取 DRM 开关时发生异常，返回 ");
                sb2.append(jSONObject == null ? str2 : jSONObject.toJSONString());
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb2.toString());
                StringBuilder sb3 = new StringBuilder("获取 DRM 开关 ");
                sb3.append(str);
                sb3.append("，返回 ");
                if (jSONObject != null) {
                    str2 = jSONObject.toJSONString();
                }
                sb3.append(str2);
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb3.toString());
                return jSONObject;
            } finally {
                StringBuilder sb4 = new StringBuilder("获取 DRM 开关 ");
                sb4.append(str);
                sb4.append("，返回 ");
                if (jSONObject != null) {
                    str2 = jSONObject.toJSONString();
                }
                sb4.append(str2);
                LogUtils.record(2, "DrmUtil::getDrmValueFromKey", sb4.toString());
            }
        }
    }

    public static String getRawDrmValueFromKey(Context context, String str, String str2) {
        String str22 = "null";
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", "Context 为空");
                return str22;
            }
            String str3 = (String) DrmManager.class.getMethod("getRawDrmValueFromKey", String.class).invoke(DrmManager.class.getMethod("getInstance", Context.class).invoke(null, context), str);
            StringBuilder sb = new StringBuilder("获取 DRM 开关 ");
            sb.append(str);
            sb.append("，返回 ");
            if (str3 != null) {
                str22 = str3;
            }
            sb.append(str22);
            LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb.toString());
            return str3;
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", "获取 DRM 开关时发生异常，返回 ".concat(str22 == null ? str22 : str22));
                StringBuilder sb2 = new StringBuilder("获取 DRM 开关 ");
                sb2.append(str);
                sb2.append("，返回 ");
                if (str22 != null) {
                    str22 = str22;
                }
                sb2.append(str22);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb2.toString());
                return str22;
            } finally {
                StringBuilder sb3 = new StringBuilder("获取 DRM 开关 ");
                sb3.append(str);
                sb3.append("，返回 ");
                if (str22 == null) {
                    r14 = str22;
                }
                sb3.append(r14);
                LogUtils.record(2, "DrmUtil::getRawDrmValueFromKey", sb3.toString());
            }
        }
    }

    public static boolean procGraySwitchWithRate(Context context, int i, boolean z) {
        StringBuilder sb;
        try {
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "获取 DRM 开关时发生异常，返回 " + z);
                sb = new StringBuilder("获取 DRM 开关 ");
            } finally {
                LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "获取 DRM 开关 " + z + "，返回 " + z);
            }
        }
        if (context == null) {
            LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", "Context 为空");
            return z;
        }
        z = ((Boolean) DrmManager.class.getMethod("procGraySwitchWithRate", Context.class, Integer.TYPE).invoke(DrmManager.class.getMethod("getInstance", Context.class).invoke(null, context), context, Integer.valueOf(i))).booleanValue();
        sb = new StringBuilder("获取 DRM 开关 ");
        sb.append(z);
        sb.append("，返回 ");
        sb.append(z);
        LogUtils.record(2, "DrmUtil::procGraySwitchWithRate", sb.toString());
        return z;
    }

    public static boolean isDrmDegraded(Context context, String str, boolean z, boolean z2) {
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::isDrmDegraded", "Context 为空");
                return z2;
            }
            return ((Boolean) DrmManager.class.getMethod("isDegrade", String.class, Boolean.TYPE, Context.class).invoke(DrmManager.class.getMethod("getInstance", Context.class).invoke(null, context), str, Boolean.valueOf(z), context)).booleanValue();
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::isDrmDegraded", "获取 DRM 开关时发生异常，返回 " + z2);
                return z2;
            } finally {
                LogUtils.record(2, "DrmUtil::isDrmDegraded", "获取 DRM 开关 " + str + "，返回 " + z2);
            }
        }
    }

    public static boolean isDrmGray(Context context, String str, boolean z, boolean z2) {
        try {
            if (context == null) {
                LogUtils.record(2, "DrmUtil::isDrmGray", "Context 为空");
                return z2;
            }
            return ((Boolean) DrmManager.class.getMethod("isGray", String.class, Boolean.TYPE, Context.class).invoke(DrmManager.class.getMethod("getInstance", Context.class).invoke(null, context), str, Boolean.valueOf(z), context)).booleanValue();
        } catch (Throwable th) {
            try {
                LogUtils.printExceptionStackTrace(th);
                LogUtils.record(2, "DrmUtil::isDrmGray", "获取 DRM 开关时发生异常，返回 " + z2);
                return z2;
            } finally {
                LogUtils.record(2, "DrmUtil::isDrmGray", "获取 DRM 开关 " + str + "，返回 " + z2);
            }
        }
    }
}
