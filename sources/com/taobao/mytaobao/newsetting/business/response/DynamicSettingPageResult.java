package com.taobao.mytaobao.newsetting.business.response;

import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DynamicSettingPageResult implements IMTOPDataObject {
    public List<List<DynamicSettingItem>> result;

    static {
        t2o.a(745537831);
        t2o.a(589299906);
    }

    public List<List<DynamicSettingItem>> getResult() {
        return this.result;
    }

    public void setResult(List<List<DynamicSettingItem>> list) {
        this.result = list;
    }
}
