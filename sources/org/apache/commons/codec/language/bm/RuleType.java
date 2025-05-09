package org.apache.commons.codec.language.bm;

import com.alipay.android.msp.constants.MspGlobalDefine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES(MspGlobalDefine.RULES);
    
    private final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
