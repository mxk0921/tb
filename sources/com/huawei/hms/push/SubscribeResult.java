package com.huawei.hms.push;

import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.support.api.client.Result;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SubscribeResult extends Result {

    /* renamed from: a  reason: collision with root package name */
    private String f5439a;
    private List<SubscribedItem> b;

    public String getErrorMsg() {
        return this.f5439a;
    }

    public List<SubscribedItem> getSubscribedItems() {
        return this.b;
    }

    public void setErrorMsg(String str) {
        this.f5439a = str;
    }

    public void setSubscribedItems(List<SubscribedItem> list) {
        this.b = list;
    }
}
