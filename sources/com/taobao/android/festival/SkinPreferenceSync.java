package com.taobao.android.festival;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SkinPreferenceSync {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "PreferTheme";

    static {
        t2o.a(464519179);
    }

    public static Map<String, String> loadUserPreference(List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af72ea39", new Object[]{list});
        }
        HashMap hashMap = new HashMap();
        SkinConfig M = FestivalMgr.i().M();
        if (M != null) {
            str = JSON.toJSONString(new UniversalSkinConfig(M.skinCode, M.skinUrl, M.version));
        } else {
            str = "";
        }
        hashMap.put(BIZ_NAME, str);
        return hashMap;
    }

    public static Map<String, Boolean> writeUserPreference(Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdc2d5ae", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        String str = map.get(BIZ_NAME);
        if (!TextUtils.isEmpty(str)) {
            try {
                UniversalSkinConfig universalSkinConfig = (UniversalSkinConfig) JSON.parseObject(str, UniversalSkinConfig.class);
                if (universalSkinConfig != null && universalSkinConfig.isValidConfig()) {
                    SkinConfig skinConfig = new SkinConfig(universalSkinConfig.skinCode, universalSkinConfig.skinUrl);
                    skinConfig.version = universalSkinConfig.version;
                    FestivalMgr.i().L(skinConfig);
                }
            } catch (Exception e) {
                TLog.loge(BIZ_NAME, "error, skin = " + str, e);
            }
        }
        z = true;
        hashMap.put(BIZ_NAME, Boolean.valueOf(z));
        return hashMap;
    }
}
