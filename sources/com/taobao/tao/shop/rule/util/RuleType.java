package com.taobao.tao.shop.rule.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum RuleType {
    invalide,
    ruleSet,
    combination,
    collection,
    text,
    url,
    host,
    path,
    fragment,
    parameter,
    jsonParameter;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RuleType ruleType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/rule/util/RuleType");
    }

    public static RuleType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleType) ipChange.ipc$dispatch("8e27ca83", new Object[]{str});
        }
        return (RuleType) Enum.valueOf(RuleType.class, str);
    }
}
