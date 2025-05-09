package com.taobao.android.cachecleaner.autoclear.biz.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.cachecleaner.autoclear.data.MatchBasedData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BizActionData {
    public static final String TYPE_COMMON = "common";
    public static final String TYPE_CUSTOM = "custom";
    @JSONField(name = "bizId")
    public String bizId;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "pathList")
    public List<String> pathList = new ArrayList();
    @JSONField(name = "configList")
    public List<MatchBasedData> configList = new ArrayList();
    @JSONField(name = "extra")
    public Map<String, String> extra = new HashMap();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface ClearType {
    }

    static {
        t2o.a(737148981);
    }
}
