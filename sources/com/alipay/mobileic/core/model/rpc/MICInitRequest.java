package com.alipay.mobileic.core.model.rpc;

import com.alipay.mobileic.common.service.model.ToString;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MICInitRequest extends ToString implements Serializable {
    public String bizId;
    public String bizRequestData;
    public String envData;
    public Map<String, Object> externParams;
    public String sceneId;
}
