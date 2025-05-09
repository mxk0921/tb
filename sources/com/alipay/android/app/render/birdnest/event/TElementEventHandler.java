package com.alipay.android.app.render.birdnest.event;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface TElementEventHandler {

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum EventType {
        GENERIC,
        CLICK,
        ASYNC_EVENT
    }

    boolean onAsyncEvent(EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback);

    boolean onEvent(EventType eventType, String str, JSONObject jSONObject, Object obj);

    String onGetCustomAttr(Object obj, String str);
}
