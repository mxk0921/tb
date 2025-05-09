package com.taobao.android.cachecleaner.autoclear.biz.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BizVerConditionData {
    @JSONField(name = "appVersion")
    public String appVersion;
    @JSONField(name = "osVersion")
    public String osVersion;
    @JSONField(name = "abEnable")
    public boolean abEnable = false;
    @JSONField(name = "abKey")
    public String abKey = "";
    @JSONField(name = "checkKey")
    public String checkKey = "";
    @JSONField(name = "enablePageList")
    public List<PageList> enablePageList = new ArrayList();
    @JSONField(name = "disablePageList")
    public List<PageList> disablePageList = new ArrayList();

    static {
        t2o.a(737148987);
    }
}
