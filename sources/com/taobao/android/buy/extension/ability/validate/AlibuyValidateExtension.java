package com.taobao.android.buy.extension.ability.validate;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.ck;
import tb.eo;
import tb.nbb;
import tb.qi;
import tb.rxu;
import tb.t2o;
import tb.ws;
import tb.xr0;
import tb.ym;
import tb.yr0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.validateData")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AlibuyValidateExtension extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989953);
    }

    public static void Q0(nbb nbbVar, AURARenderComponent aURARenderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac5a2d6", new Object[]{nbbVar, aURARenderComponent, map});
            return;
        }
        rxu rxuVar = new rxu();
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        rxuVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            ck.g().d("validateData事件refreshComponentData函数AURARenderComponentData为null");
            return;
        }
        rxuVar.d = new ym(aURARenderComponentData.fields, aURARenderComponentData.events, aURARenderComponentData.localFields);
        rxuVar.c = new ym(new HashMap<String, Object>(aURARenderComponentData.fields, map) { // from class: com.taobao.android.buy.extension.ability.validate.AlibuyValidateExtension.1
            public final /* synthetic */ Map val$params;

            {
                this.val$params = map;
                putAll(map);
            }
        }, null, null);
        nbbVar.c("aura.workflow.adjustRules", new UMFRuleIO(Collections.singletonList(rxuVar)), null);
    }

    public static /* synthetic */ Object ipc$super(AlibuyValidateExtension alibuyValidateExtension, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/ability/validate/AlibuyValidateExtension");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            ck.g().d("validateData事件eventFields为null");
            return;
        }
        String string = c.getString("actionParams");
        String string2 = c.getString("passValue");
        String string3 = c.getString("noPassValue");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            ck.g().d("validateData事件缺少actionParams|passValue|passValue 参数");
            return;
        }
        AURARenderComponent j = eventModel.j();
        if (j == null) {
            ck.g().d("validateData事件AURARenderComponent为null");
            return;
        }
        AURARenderComponentData aURARenderComponentData = j.data;
        if (aURARenderComponentData == null) {
            ck.g().d("validateData事件AURARenderComponentData为null");
            return;
        }
        String P0 = P0(eventModel);
        if (P0 != null) {
            Map map = aURARenderComponentData.fields;
            if (map == null) {
                map = new HashMap();
                aURARenderComponentData.fields = map;
            }
            map.put("text", P0);
        }
        yr0 d = xr0.d(aURARenderComponentData.fields, xr0.b(aURARenderComponentData.features));
        if (!d.c()) {
            O0(J0().f(), d.b());
        }
        HashMap hashMap = new HashMap();
        if (d.c()) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("validateState", str);
        if (!d.c()) {
            string2 = string3;
        }
        hashMap.put(string, string2);
        Q0(J0().c(), j, hashMap);
    }

    public final void O0(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6d54cf", new Object[]{this, context, str});
        } else if (!TextUtils.isEmpty(str) && (context instanceof Activity)) {
            eo.b((Activity) context, str);
        }
    }

    public final String P0(qi qiVar) {
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c51f253", new Object[]{this, qiVar});
        }
        DXEvent b = qiVar.b();
        if (!(b instanceof DXTextInputEvent) || (text = ((DXTextInputEvent) b).getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "validateData";
    }
}
