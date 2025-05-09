package com.alibaba.android.umf.taobao.adapter.render.view.layout.creator.impl.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.b8v;
import tb.bxu;
import tb.f8v;
import tb.nsw;
import tb.t2o;
import tb.txu;
import tb.w3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UMFRaxJSBridgeApiPlugin extends RaxJSBridgeApiPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final txu mRuntimeContext;

    static {
        t2o.a(81789271);
    }

    public UMFRaxJSBridgeApiPlugin(w3e<String, AURARenderComponent> w3eVar, txu txuVar) {
        super(w3eVar);
        this.mRuntimeContext = txuVar;
    }

    public static /* synthetic */ Object ipc$super(UMFRaxJSBridgeApiPlugin uMFRaxJSBridgeApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/render/view/layout/creator/impl/rax/UMFRaxJSBridgeApiPlugin");
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba320ac5", new Object[]{this, uMFRuleIO, wVCallBackContext});
        } else {
            this.mRuntimeContext.d().a("umf.workflow.adjustRuleInput", uMFRuleIO, this.mRuntimeContext, null);
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97bb13d", new Object[]{this, list, aURARenderComponent, str, wVCallBackContext});
            return;
        }
        f8v f8vVar = (f8v) this.mRuntimeContext.c("eventHandler", f8v.class);
        if (f8vVar == null) {
            wVCallBackContext.error(new nsw("Native端事件中心为空，请找客户端同学排查"));
            return;
        }
        for (Event event : list) {
            b8v e = f8vVar.e();
            String type = event.getType();
            e.t(type);
            HashMap hashMap = new HashMap();
            bxu bxuVar = new bxu(type, this.mRuntimeContext, aURARenderComponent, new Object[]{str});
            bxuVar.j(event.getFields());
            bxuVar.l(event.getType());
            hashMap.put("umfEventModel", bxuVar);
            e.v(hashMap);
            f8vVar.k(e);
        }
    }
}
