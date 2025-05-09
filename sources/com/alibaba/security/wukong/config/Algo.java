package com.alibaba.security.wukong.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Algo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALGO_TYPE_CPP = "cpp";
    public static final String ALGO_TYPE_PY = "python";
    public String code;
    public Map<String, Object> config;
    public boolean preRun;
    public String type;
    public String version;

    public boolean isCpp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17d8c424", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.type) || !this.type.equalsIgnoreCase(ALGO_TYPE_CPP)) {
            return false;
        }
        return true;
    }

    public boolean isPython() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c902e431", new Object[]{this})).booleanValue();
        }
        return !TextUtils.isEmpty(this.type) && this.type.equalsIgnoreCase("python");
    }

    public boolean isSupport(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36fe101a", new Object[]{this, str})).booleanValue();
        }
        Map<String, Object> map = this.config;
        if (map == null || (jSONArray = (JSONArray) map.get("supportSampleTypes")) == null) {
            return true;
        }
        for (String str2 : JSON.parseArray(JsonUtils.toJSONString(jSONArray), String.class)) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
