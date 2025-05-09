package com.alipay.android.app.render.birdnest.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.render.birdnest.event.TElementEventHandler;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EventHandlerWrapper implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TElementEventHandler handler;

    public EventHandlerWrapper(TElementEventHandler tElementEventHandler) {
        this.handler = tElementEventHandler;
    }

    @Override // com.alipay.android.app.template.EventHandler
    public boolean onAsyncEvent(EventHandler.EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cefa926", new Object[]{this, eventType, str, iTemplateClickCallback})).booleanValue();
        }
        return this.handler.onAsyncEvent(TElementEventHandler.EventType.valueOf(eventType.name()), str, iTemplateClickCallback);
    }

    @Override // com.alipay.android.app.template.EventHandler
    public boolean onEvent(EventHandler.EventType eventType, String str, Object obj, Object obj2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e9c8627", new Object[]{this, eventType, str, obj, obj2})).booleanValue();
        }
        try {
            jSONObject = JSON.parseObject(String.valueOf(obj));
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        return this.handler.onEvent(TElementEventHandler.EventType.valueOf(eventType.name()), str, jSONObject, obj2);
    }

    @Override // com.alipay.android.app.template.EventHandler
    public String onGetCustomAttr(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8229915a", new Object[]{this, obj, str});
        }
        return this.handler.onGetCustomAttr(obj, str);
    }
}
