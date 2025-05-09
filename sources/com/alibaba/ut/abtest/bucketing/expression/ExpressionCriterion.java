package com.alibaba.ut.abtest.bucketing.expression;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ExpressionCriterion {
    @JSONField(name = "criterions")
    public List<ExpressionCriterion> criterions;
    @JSONField(name = "fieldName")
    public String name;
    @JSONField(name = "type")
    public String operator;
    @JSONField(name = "fieldValue")
    public String value;

    static {
        t2o.a(961544277);
    }
}
