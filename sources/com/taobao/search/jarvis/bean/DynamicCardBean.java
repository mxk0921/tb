package com.taobao.search.jarvis.bean;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.io.Serializable;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DynamicCardBean implements Serializable {
    public boolean firstRender = true;
    public BaseCellBean mDynamicCellBean;
    public JSONObject mOriginData;
    public Map<String, TemplateBean> mTemplates;
    public String style;

    static {
        t2o.a(815792288);
    }
}
