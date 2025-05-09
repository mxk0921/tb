package com.alipay.android.app.template;

import com.alipay.android.app.template.EventHandler;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBDocumentAssistor;
import tb.gwt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DtmElementClickListener implements OnTemplateClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DtmElementClickListener";

    /* renamed from: a  reason: collision with root package name */
    public EventHandler f3509a;
    public String b;
    public BirdNestEngine.LogTracer c;
    public FBDocument d;

    public DtmElementClickListener(EventHandler eventHandler, String str, BirdNestEngine.LogTracer logTracer) {
        this.f3509a = eventHandler;
        this.b = str;
        this.c = logTracer;
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public boolean onAsyncEvent(Object obj, String str, ITemplateClickCallback iTemplateClickCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48618963", new Object[]{this, obj, str, iTemplateClickCallback})).booleanValue();
        }
        if (this.f3509a != null) {
            gwt a2 = FBDocumentAssistor.a(this.d);
            try {
                return this.f3509a.onAsyncEvent(EventHandler.EventType.ASYNC_EVENT, str, iTemplateClickCallback);
            } catch (Throwable th) {
                try {
                    FBLogger.e(TAG, th);
                } finally {
                    FBDocument fBDocument = this.d;
                    FBDocumentAssistor.a(fBDocument, a2, 21, "Dtm:aEv_" + str);
                }
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public String onGetCustomAttr(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8229915a", new Object[]{this, obj, str});
        }
        if (this.f3509a == null) {
            return "";
        }
        gwt a2 = FBDocumentAssistor.a(this.d);
        String onGetCustomAttr = this.f3509a.onGetCustomAttr(obj, str);
        FBDocument fBDocument = this.d;
        FBDocumentAssistor.a(fBDocument, a2, 21, "Dtm:attr_" + str);
        return onGetCustomAttr;
    }

    public void setDocument(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2b1ecb", new Object[]{this, fBDocument});
        } else {
            this.d = fBDocument;
        }
    }

    @Override // com.alipay.android.app.template.OnTemplateClickListener
    public final boolean onEvent(Object obj, String str, boolean z) {
        EventHandler.EventType eventType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163cef30", new Object[]{this, obj, str, new Boolean(z)})).booleanValue();
        }
        if (this.f3509a != null) {
            gwt a2 = FBDocumentAssistor.a(this.d);
            try {
                String str2 = "{\"param\":" + str + "}";
                if (z) {
                    eventType = EventHandler.EventType.CLICK;
                } else {
                    eventType = EventHandler.EventType.GENERIC;
                }
                this.f3509a.onEvent(eventType, this.b, str2, obj);
            } catch (Throwable th) {
                try {
                    FBLogger.e(TAG, th);
                } finally {
                    FBDocumentAssistor.a(this.d, a2, 21, "Dtm:sEv_" + str);
                }
            }
        }
        return false;
    }

    public DtmElementClickListener(BirdNestEngine.Params params, BirdNestEngine.LogTracer logTracer) {
        this.f3509a = null;
        this.b = "";
        this.f3509a = params.dtmEventListener;
        this.b = params.businessId;
        this.c = logTracer;
    }
}
