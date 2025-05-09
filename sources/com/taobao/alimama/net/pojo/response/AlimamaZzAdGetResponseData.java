package com.taobao.alimama.net.pojo.response;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AlimamaZzAdGetResponseData implements IMTOPDataObject {
    @JSONField(name = "httpStatusCode")
    public String httpStatusCode;
    @JSONField(name = "model")
    public List<AlimamaZzAd> model;

    static {
        t2o.a(1018167365);
        t2o.a(589299906);
    }
}
