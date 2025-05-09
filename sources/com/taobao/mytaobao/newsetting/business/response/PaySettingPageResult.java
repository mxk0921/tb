package com.taobao.mytaobao.newsetting.business.response;

import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PaySettingPageResult implements IMTOPDataObject {
    public List<PaySettingItem> result;

    static {
        t2o.a(745537833);
        t2o.a(589299906);
    }

    public List<PaySettingItem> getResult() {
        return this.result;
    }

    public void setResult(List<PaySettingItem> list) {
        this.result = list;
    }
}
