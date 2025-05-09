package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxJSBridgeWriteBackParams;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxJSBridgeWriteBackParamsData;
import com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax.model.UMFRaxRenderEventParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.dxu;
import tb.gxu;
import tb.kpw;
import tb.nsw;
import tb.rxu;
import tb.t2o;
import tb.w3e;
import tb.wl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class RaxJSBridgeApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UMF_JS_BRIDGE_CLASS_NAME = "UMFJsBridge";
    private final String TAG = "RaxJSBridgeApiPlugin";
    private final w3e<String, AURARenderComponent> mRenderComponentGetter;

    static {
        t2o.a(81789022);
    }

    public RaxJSBridgeApiPlugin(w3e<String, AURARenderComponent> w3eVar) {
        this.mRenderComponentGetter = w3eVar;
    }

    private void getData(WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c15fe64", new Object[]{this, wVCallBackContext});
            return;
        }
        AURARenderComponent aURARenderComponent = (AURARenderComponent) ((wl.a) this.mRenderComponentGetter).b("");
        if (aURARenderComponent == null || (jSONObject = aURARenderComponent.protocol) == null) {
            wVCallBackContext.error(new nsw("组件协议信息不存在，请找客户端同学排查"));
        } else {
            wVCallBackContext.success(jSONObject.toJSONString());
        }
    }

    public static /* synthetic */ Object ipc$super(RaxJSBridgeApiPlugin raxJSBridgeApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/rax/RaxJSBridgeApiPlugin");
    }

    private void triggerEvent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4ad090", new Object[]{this, str, wVCallBackContext});
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error(new nsw("params参数为空，请确保传参了"));
        } else {
            try {
                UMFRaxRenderEventParams uMFRaxRenderEventParams = (UMFRaxRenderEventParams) JSON.parseObject(str, UMFRaxRenderEventParams.class);
                if (uMFRaxRenderEventParams == null) {
                    wVCallBackContext.error(new nsw("解析params报错，数据为空"));
                    return;
                }
                List<Event> list = uMFRaxRenderEventParams.eventPayload;
                if (list == null || list.isEmpty()) {
                    wVCallBackContext.error(new nsw("eventPayload为空"));
                    return;
                }
                String str2 = uMFRaxRenderEventParams.componentKey;
                if (TextUtils.isEmpty(str2)) {
                    wVCallBackContext.error(new nsw("componentKey为空"));
                    return;
                }
                doTriggerEvent(uMFRaxRenderEventParams.eventPayload, (AURARenderComponent) ((wl.a) this.mRenderComponentGetter).b(str2), uMFRaxRenderEventParams.event, wVCallBackContext);
                wVCallBackContext.success(nsw.RET_SUCCESS);
            } catch (Throwable th) {
                gxu.a("UMFFramework", UMF_JS_BRIDGE_CLASS_NAME, "rax", th.getMessage());
                wVCallBackContext.error(new nsw("解析params报错，error=" + th.getMessage()));
            }
        }
    }

    private void writeBack(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdabd34", new Object[]{this, str, wVCallBackContext});
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error(new nsw("params为空"));
        } else {
            try {
                UMFRaxJSBridgeWriteBackParams uMFRaxJSBridgeWriteBackParams = (UMFRaxJSBridgeWriteBackParams) JSON.parseObject(str, UMFRaxJSBridgeWriteBackParams.class);
                if (uMFRaxJSBridgeWriteBackParams == null) {
                    wVCallBackContext.error(new nsw("解析params为空"));
                    return;
                }
                Map<String, UMFRaxJSBridgeWriteBackParamsData> map = uMFRaxJSBridgeWriteBackParams.data;
                if (map == null || map.isEmpty()) {
                    wVCallBackContext.error(new nsw("params中data为空"));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, UMFRaxJSBridgeWriteBackParamsData> entry : map.entrySet()) {
                    rxu rxuVar = new rxu();
                    rxuVar.b = entry.getKey();
                    rxuVar.d.fields = entry.getValue().fields;
                    rxuVar.c.fields = rxuVar.d.fields;
                    rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
                    arrayList.add(rxuVar);
                }
                doWriteBack(new UMFRuleIO(arrayList), wVCallBackContext);
                wVCallBackContext.success(nsw.RET_SUCCESS);
            } catch (Throwable th) {
                String str2 = "解析数据出错,errorMsg=" + th.getMessage();
                wVCallBackContext.error(new nsw(str2));
                dxu.a().e("RaxJSBridgeApiPlugin", "execute#" + str2);
            }
        }
    }

    public abstract void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext);

    public abstract void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r8.equals(tb.wdm.CATEGORY_TRIGGER_EVENT) == false) goto L_0x0055;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "bcd41fd1"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            r8 = 3
            r5[r8] = r10
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            tb.w3e<java.lang.String, com.alibaba.android.aura.datamodel.render.AURARenderComponent> r3 = r7.mRenderComponentGetter
            if (r3 != 0) goto L_0x0031
            tb.nsw r8 = new tb.nsw
            java.lang.String r9 = "Native端RenderComponent为空，请找客户端同学排查"
            r8.<init>(r9)
            r10.error(r8)
            return r1
        L_0x0031:
            tb.rbb r3 = tb.ck.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "call action:"
            r4.<init>(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "RaxJSBridgeApiPlugin"
            java.lang.String r6 = "execute"
            r3.c(r5, r6, r4)
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1406875290: goto L_0x006c;
                case -75605984: goto L_0x0061;
                case 351862722: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r0 = -1
            goto L_0x0077
        L_0x0057:
            java.lang.String r4 = "triggerEvent"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0077
            goto L_0x0055
        L_0x0061:
            java.lang.String r0 = "getData"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x006a
            goto L_0x0055
        L_0x006a:
            r0 = 1
            goto L_0x0077
        L_0x006c:
            java.lang.String r0 = "writeBack"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0076
            goto L_0x0055
        L_0x0076:
            r0 = 0
        L_0x0077:
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0084;
                case 2: goto L_0x0080;
                default: goto L_0x007a;
            }
        L_0x007a:
            tb.nsw r8 = tb.nsw.RET_NO_METHOD
            r10.error(r8)
            return r2
        L_0x0080:
            r7.triggerEvent(r9, r10)
            return r1
        L_0x0084:
            r7.getData(r10)
            return r1
        L_0x0088:
            r7.writeBack(r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
