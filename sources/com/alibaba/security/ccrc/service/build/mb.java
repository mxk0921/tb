package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface mb {
    String a();

    void a(AbstractC1148bb bbVar);

    void a(String str, AbstractC1151cb cbVar);

    boolean a(String str);

    String algoCode();

    boolean b();

    boolean c();

    Map<String, Object> detect(CCRCRiskSample cCRCRiskSample);

    void release();
}
