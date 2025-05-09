package com.alibaba.triver.kit.api.proxy;

import com.alibaba.ariver.kernel.common.Proxiable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IEnvProxy extends Proxiable {
    public static final String ALIAPP = "AliApp";
    public static final String ARIVERAPP = "AriverApp";

    String getAppGroup();

    String getEnvValue(String str);
}
