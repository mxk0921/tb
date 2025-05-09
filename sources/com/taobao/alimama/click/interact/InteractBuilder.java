package com.taobao.alimama.click.interact;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.rff;
import tb.t2o;
import tb.vzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InteractBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mUrl;
    private Map<String, String> mArgsMap = new HashMap();
    private Map<String, String> mUtMap = new HashMap();
    private Map<String, String> mMacroMap = new HashMap();

    static {
        t2o.a(1017118764);
    }

    public InteractBuilder(String str) {
        this.mUrl = str;
    }

    public String commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70abe22", new Object[]{this});
        }
        return new rff(this.mUrl, this.mArgsMap, this.mMacroMap).g();
    }

    public InteractBuilder withArg(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("851da0d", new Object[]{this, str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mArgsMap.put(str, str2);
        }
        return this;
    }

    public InteractBuilder withArgPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("13e7b60e", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }

    public InteractBuilder withArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("c4aa68bd", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.putAll(map);
        }
        return this;
    }

    public InteractBuilder withMacroArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("3ea32edd", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.put("macroArgs", vzo.n(map));
            this.mMacroMap = map;
        }
        return this;
    }

    public InteractBuilder withNameSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("952b3768", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mArgsMap.put("namespace", str);
        }
        return this;
    }

    public InteractBuilder withUtArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("10e7e65e", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.mArgsMap.put("utArgs", vzo.n(map));
            this.mUtMap = map;
        }
        return this;
    }
}
