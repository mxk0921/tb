package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class an0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAEventIO f15862a;
        public final /* synthetic */ lo b;

        public a(AURAEventIO aURAEventIO, lo loVar) {
            this.f15862a = aURAEventIO;
            this.b = loVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/utils/AliBuyLinkageUtil$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else {
                an0.a(this.b, msg.a(this.f15862a));
            }
        }
    }

    static {
        t2o.a(301990108);
    }

    public static /* synthetic */ void a(lo loVar, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17abd6c3", new Object[]{loVar, uMFLinkageTrigger});
        } else {
            d(loVar, uMFLinkageTrigger);
        }
    }

    public static UMFRuleIO b(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("52037294", new Object[]{aURARenderComponent, aURAEventIO});
        }
        return c(aURARenderComponent, aURAEventIO, null);
    }

    public static UMFRuleIO c(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("7e6a6bff", new Object[]{aURARenderComponent, aURAEventIO, map});
        }
        qi eventModel = aURAEventIO.getEventModel();
        Event event = new Event();
        event.fields = eventModel.c();
        event.id = eventModel.e();
        event.tag = eventModel.d();
        event.type = aURAEventIO.getEventType();
        rxu rxuVar = new rxu();
        rxuVar.b = aURARenderComponent.key;
        rxuVar.f27667a = RuleType.PROPS_WRITE_BACK;
        ym ymVar = rxuVar.d;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        ymVar.fields = aURARenderComponentData.fields;
        ymVar.events = aURARenderComponentData.events;
        HashMap hashMap = new HashMap();
        hashMap.put(aURAEventIO.getEventModel().d(), Collections.singletonList(event));
        ym ymVar2 = rxuVar.c;
        ymVar2.events = hashMap;
        if (map != null) {
            ymVar2.fields = map;
        }
        return new UMFRuleIO(Collections.singletonList(rxuVar));
    }

    public static void d(lo loVar, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace0a2ef", new Object[]{loVar, uMFLinkageTrigger});
        } else {
            loVar.c().c("aura.workflow.adjust", uMFLinkageTrigger, null);
        }
    }

    public static void e(lo loVar, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33133a", new Object[]{loVar, aURARenderComponent, aURAEventIO, map});
        } else {
            loVar.c().c("aura.workflow.adjustRules", c(aURARenderComponent, aURAEventIO, map), new a(aURAEventIO, loVar));
        }
    }

    public static JSONObject f(Intent intent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f817db7b", new Object[]{intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Set<String> keySet = extras.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            if (!TextUtils.isEmpty(str) && (obj = extras.get(str)) != null) {
                jSONObject.put(str, (Object) String.valueOf(obj));
            }
        }
        return jSONObject;
    }
}
