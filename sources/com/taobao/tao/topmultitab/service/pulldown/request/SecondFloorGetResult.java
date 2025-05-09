package com.taobao.tao.topmultitab.service.pulldown.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecondFloorGetResult implements IMTOPDataObject, Serializable {
    @JSONField(name = "result")
    public SecondFloorConfigResult secondFloorConfigResult;

    static {
        t2o.a(729810293);
        t2o.a(589299906);
    }

    public JSONObject getExt() {
        SecondFloorConfigResult secondFloorConfigResult = this.secondFloorConfigResult;
        if (secondFloorConfigResult == null) {
            return null;
        }
        return secondFloorConfigResult.ext;
    }

    public List<JSONObject> getSections() {
        List<JSONObject> list;
        SecondFloorConfigResult secondFloorConfigResult = this.secondFloorConfigResult;
        if (secondFloorConfigResult == null || (list = secondFloorConfigResult.sections) == null || list.isEmpty()) {
            return null;
        }
        return this.secondFloorConfigResult.sections;
    }
}
