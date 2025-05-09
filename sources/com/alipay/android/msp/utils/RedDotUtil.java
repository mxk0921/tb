package com.alipay.android.msp.utils;

import android.text.TextUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.settings.base.SettingsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RedDotUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static JSONObject sSettingsRedDot;

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            loadSp();
        }
    }

    public static boolean isShow(String str, int i, String str2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c991d879", new Object[]{str, new Integer(i), str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || (jSONObject = sSettingsRedDot) == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (TextUtils.equals(jSONObject.getJSONArray(str).getString(i), str2)) {
            return false;
        }
        return true;
    }

    private static void loadSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2cb08ea", new Object[0]);
            return;
        }
        try {
            sSettingsRedDot = new JSONObject(PrefUtils.getString(SettingsConstants.SP_FILE, "redDot", "{}"));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            sSettingsRedDot = null;
        }
    }

    private static void saveSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6df841", new Object[0]);
            return;
        }
        try {
            JSONObject jSONObject = sSettingsRedDot;
            if (jSONObject != null) {
                PrefUtils.putString(SettingsConstants.SP_FILE, "redDot", jSONObject.toString());
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public static void setRedDotToken(String str, int i, String str2) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2da829d", new Object[]{str, new Integer(i), str2});
        } else if (!TextUtils.isEmpty(str2)) {
            if (sSettingsRedDot == null) {
                sSettingsRedDot = new JSONObject();
            }
            try {
                jSONArray = sSettingsRedDot.getJSONArray(str);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                jSONArray = null;
            }
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            try {
                jSONArray.put(i, str2);
                sSettingsRedDot.put(str, jSONArray);
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
            saveSp();
        }
    }
}
