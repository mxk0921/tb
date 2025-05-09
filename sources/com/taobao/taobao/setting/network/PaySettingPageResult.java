package com.taobao.taobao.setting.network;

import com.taobao.taobao.setting.item.PaySettingItem;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PaySettingPageResult implements IMTOPDataObject {
    public List<PaySettingItem> result;

    public List<PaySettingItem> getResult() {
        return this.result;
    }

    public void setResult(List<PaySettingItem> list) {
        this.result = list;
    }
}
