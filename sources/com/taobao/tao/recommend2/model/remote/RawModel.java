package com.taobao.tao.recommend2.model.remote;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RawModel implements IMTOPDataObject, Serializable {
    private String bizName;
    private String btn;
    private JSONObject fields;
    private String id;
    private String ref;
    private String tag;
    private String type;

    static {
        t2o.a(729809626);
        t2o.a(589299906);
    }

    public String getBizName() {
        return this.bizName;
    }

    public String getBtn() {
        return this.btn;
    }

    public JSONObject getFields() {
        return this.fields;
    }

    public String getId() {
        return this.id;
    }

    public String getRef() {
        return this.ref;
    }

    public String getTag() {
        return this.tag;
    }

    public String getType() {
        return this.type;
    }

    public void setBizName(String str) {
        this.bizName = str;
    }

    public void setBtn(String str) {
        this.btn = str;
    }

    public void setFields(JSONObject jSONObject) {
        this.fields = jSONObject;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRef(String str) {
        this.ref = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
