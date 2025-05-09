package com.alibaba.android.aura.taobao.adapter.extension.common.render.rax;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.nbb;
import tb.pi;
import tb.qi;
import tb.t2o;
import tb.w3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURARaxJSBridgeApiPlugin extends RaxJSBridgeApiPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final nbb mAuraInstance;

    static {
        t2o.a(81789016);
    }

    public AURARaxJSBridgeApiPlugin(w3e<String, AURARenderComponent> w3eVar) throws IllegalAccessException {
        super(w3eVar);
        throw new IllegalAccessException("调用两个参数的构造方案");
    }

    private void appendConfirmFlagWhenAdjust(Event event, String str, qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5174a84c", new Object[]{this, event, str, qiVar});
        } else if ("adjust".equals(str)) {
            JSONObject fields = event.getFields();
            if (fields == null) {
                fields = new JSONObject();
                event.setFields(fields);
            }
            String string = fields.getString("option");
            if ("confirm".equals(string) || TextUtils.isEmpty(string)) {
                fields.put("isConfirm", (Object) Boolean.TRUE);
            }
            qiVar.n(fields);
        }
    }

    public static /* synthetic */ Object ipc$super(AURARaxJSBridgeApiPlugin aURARaxJSBridgeApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/render/rax/AURARaxJSBridgeApiPlugin");
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doTriggerEvent(List<Event> list, AURARenderComponent aURARenderComponent, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97bb13d", new Object[]{this, list, aURARenderComponent, str, wVCallBackContext});
            return;
        }
        for (Event event : list) {
            String type = event.getType();
            qi qiVar = new qi();
            qiVar.p(event.getId());
            qiVar.n(event.getFields());
            qiVar.t(aURARenderComponent);
            appendConfirmFlagWhenAdjust(event, type, qiVar);
            pi.b(this.mAuraInstance, type, qiVar);
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.common.render.rax.RaxJSBridgeApiPlugin
    public void doWriteBack(UMFRuleIO uMFRuleIO, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba320ac5", new Object[]{this, uMFRuleIO, wVCallBackContext});
        } else {
            this.mAuraInstance.c("aura.workflow.syncState", uMFRuleIO, null);
        }
    }

    public AURARaxJSBridgeApiPlugin(nbb nbbVar, w3e<String, AURARenderComponent> w3eVar) {
        super(w3eVar);
        this.mAuraInstance = nbbVar;
    }
}
