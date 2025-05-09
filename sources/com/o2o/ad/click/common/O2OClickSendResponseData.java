package com.o2o.ad.click.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OClickSendResponseData implements IMTOPDataObject, Serializable {
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "o2otrackid")
    public String o2otrackid;

    static {
        t2o.a(1019215884);
        t2o.a(589299906);
    }
}
