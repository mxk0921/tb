package com.taobao.global.setting.util;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.mba;
import tb.quv;
import tb.tfp;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GuideUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f10588a = new HashMap();
    public static final Set<String> b = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class FatigueObject {
        public int fatigue;
        public String key;

        private FatigueObject() {
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b72d4027", new Object[]{str});
        }
        return "mytao_guide_" + str;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a0d7cd", new Object[]{str});
        }
        return "mytao_guide_remote_" + str;
    }

    public static void d() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca269ac8", new Object[0]);
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "settingExt", "{\"fatigue\":[{\"key\":\"muteCountDown\",\"fatigue\":\"5\"},{\"key\":\"muteOpenTip\",\"fatigue\":\"1\"},{\"key\":\"muteOnPop\",\"fatigue\":\"1\"},{\"key\":\"muteOffPop\",\"fatigue\":\"1\"}]}");
        if (!TextUtils.isEmpty(config)) {
            try {
                JSONObject parseObject = JSON.parseObject(config);
                if (!(parseObject == null || (jSONArray = parseObject.getJSONArray("fatigue")) == null || jSONArray.size() <= 0)) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        FatigueObject fatigueObject = (FatigueObject) jSONArray.getObject(i, FatigueObject.class);
                        if (fatigueObject != null) {
                            ((HashMap) f10588a).put(fatigueObject.key, Integer.valueOf(fatigueObject.fatigue));
                            int i2 = tfp.c().getInt(b(fatigueObject.key), -1);
                            if (i2 != -1 || fatigueObject.fatigue < 0) {
                                int i3 = fatigueObject.fatigue;
                                if (i2 != i3 && i3 >= 0) {
                                    tfp.c().edit().putInt(a(fatigueObject.key), fatigueObject.fatigue).commit();
                                }
                            } else {
                                tfp.c().edit().putInt(b(fatigueObject.key), fatigueObject.fatigue).apply();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                y7t.a("GuideUtils", Log.getStackTraceString(e));
            }
        }
    }

    public static void e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52164349", new Object[]{str, str2, new Integer(i)});
            return;
        }
        AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_GET_CONSUME_FATIGUE, quv.a(str, str2, i), 1.0d);
        ((HashSet) b).add(str2);
        tfp.c().edit().putInt(a(str2), i).apply();
    }

    public static synchronized boolean c(String str, String str2, boolean z) {
        synchronized (GuideUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4919b47", new Object[]{str, str2, new Boolean(z)})).booleanValue();
            }
            AppMonitor.Counter.commit(quv.PAGE_NAME, quv.ARG1_NEED_SHOW_GUIDE, quv.b(str, str2, z), 1.0d);
            if ("muteCountDown".equals(str2) && mba.b().c()) {
                return false;
            }
            int i = tfp.c().getInt(a(str2), -1);
            Map<String, Integer> map = f10588a;
            if (((HashMap) map).size() == 0) {
                d();
            }
            if (i == -1 && ((HashMap) map).containsKey(str2)) {
                i = ((Integer) ((HashMap) map).get(str2)).intValue();
            }
            if (((HashSet) b).contains(str2)) {
                return false;
            }
            if (i <= 0) {
                return false;
            }
            if (z) {
                e(str, str2, i - 1);
            }
            return true;
        }
    }
}
