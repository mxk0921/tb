package com.alibaba.security.ccrc.service.model;

import com.alibaba.security.ccrc.action.WukongActionCode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbsWukongActionRiskResult extends AbsWukongRiskResult {
    public WukongActionCode actionCode;
    public Map<String, Object> algoResults;
    public String metaId;
    public String sampleID;
    public boolean success;
}
