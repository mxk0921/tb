package com.alibaba.triver.cannal_engine.scene;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements TRWidgetInfoGetter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f2954a;
        public final /* synthetic */ JSCallback b;

        public a(TRWidgetWXModule tRWidgetWXModule, JSCallback jSCallback, JSCallback jSCallback2) {
            this.f2954a = jSCallback;
            this.b = jSCallback2;
        }

        @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            } else if (this.b != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                jSONObject.put("response", (Object) str3);
                this.b.invoke(jSONObject);
            }
        }

        @Override // com.alibaba.triver.cannal_engine.widgetInfo.TRWidgetInfoGetter.a
        public void onSuccess(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3000d3", new Object[]{this, jSONArray});
            } else if (this.f2954a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", (Object) jSONArray);
                this.f2954a.invoke(jSONObject);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TRWidgetWXModule tRWidgetWXModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetWXModule");
    }

    @JSMethod
    public void requestWidgetInfos(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14134b7", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else {
            ((TRWidgetInfoGetter) RVProxy.get(TRWidgetInfoGetter.class)).request(jSONObject, Boolean.TRUE, new a(this, jSCallback, jSCallback2));
        }
    }
}
