package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.IAbilityResult;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.Map;
import tb.jk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ErrorViewWidgetRequestError implements IAbilityResult {
    public String api;
    public String code;
    public String mappingCode;
    public String message;
    public String reqFalcoId;
    public String responseCode;
    public String url;

    static {
        t2o.a(525336880);
        t2o.a(144703597);
    }

    public ErrorViewWidgetRequestError() {
    }

    public ErrorViewWidgetRequestError(Map<String, ? extends Object> map) {
        this();
        this.api = MegaUtils.x(map, "api", null);
        this.url = MegaUtils.x(map, "url", null);
        this.responseCode = MegaUtils.x(map, TBImageFlowMonitor.RESPONSE_CODE_MEASURE, null);
        this.mappingCode = MegaUtils.x(map, jk.KEY_MAPPING_CODE, null);
        this.code = MegaUtils.x(map, "code", null);
        this.message = MegaUtils.x(map, "message", null);
        this.reqFalcoId = MegaUtils.x(map, "reqFalcoId", null);
    }
}
