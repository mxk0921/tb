package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.IAbilityResult;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UmiPrivatePublishDraftData implements IAbilityResult {
    public String biz;
    public Map<String, ? extends Object> content;
    public String draftId;
    public Integer failedCode;
    public String mode;
    public List<? extends Map<String, ? extends Object>> photos;
    public Map<String, ? extends Object> shortTitle;
    public Long timestamp;
    public String type;
    public String umiPubSession;
    public String version;
    public List<? extends Map<String, ? extends Object>> videos;

    static {
        t2o.a(525337620);
        t2o.a(144703597);
    }
}
