package tb;

import android.content.Intent;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.openurl.native.params.addAddress")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class dn0 implements zbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f17954a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements a.AbstractC0062a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f17955a;
        public final /* synthetic */ AURAEventIO b;

        public a(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
            this.f17955a = aURARenderComponent;
            this.b = aURAEventIO;
        }

        @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a.AbstractC0062a
        public void a(String str, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb234172", new Object[]{this, str, intent});
            } else if (intent == null) {
                ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "getCustomParams", "openUrl 返回数据为null");
            } else if (this.f17955a == null || this.b == null) {
                ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "getCustomParams", "renderComponent 或者 eventIO 返回数据为null");
            } else if ("NATIVE".equals(str)) {
                ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "getCustomParams", "从native页面跳回");
                dn0.r(dn0.this, intent, this.f17955a, this.b);
            }
        }

        @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a.AbstractC0062a
        public void b(String str, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70969eb9", new Object[]{this, str, intent});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAEventIO f17956a;

        public b(AURAEventIO aURAEventIO) {
            this.f17956a = aURAEventIO;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/event/openUrl/AliBuyOpenUrlNativeParamsAddAddressExtension$2");
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
                dn0.x(dn0.this, msg.a(this.f17956a));
            }
        }
    }

    static {
        t2o.a(301989976);
        t2o.a(81789080);
    }

    public static /* synthetic */ void r(dn0 dn0Var, Intent intent, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27e17d", new Object[]{dn0Var, intent, aURARenderComponent, aURAEventIO});
        } else {
            dn0Var.B(intent, aURARenderComponent, aURAEventIO);
        }
    }

    public static /* synthetic */ void x(dn0 dn0Var, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad20d97f", new Object[]{dn0Var, uMFLinkageTrigger});
        } else {
            dn0Var.J0(uMFLinkageTrigger);
        }
    }

    public final void B(Intent intent, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad6187", new Object[]{this, intent, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject f = an0.f(intent);
        if (f == null) {
            ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "handleNativeResult", "从Native返回的数据为null");
        } else {
            L(f, aURARenderComponent, aURAEventIO);
        }
    }

    @Override // tb.zbb
    public List<String> C(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b4d4ed2", new Object[]{this, aURARenderComponent});
        }
        return Collections.singletonList("addAddress");
    }

    public final void J0(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0b18d6", new Object[]{this, uMFLinkageTrigger});
        } else {
            this.f17954a.c().c("aura.workflow.adjust", uMFLinkageTrigger, null);
        }
    }

    public final void L(JSONObject jSONObject, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9683c7a3", new Object[]{this, jSONObject, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "handleNativeResult", "从Native返回的eventFields数据为null");
            return;
        }
        JSONObject jSONObject2 = c.getJSONObject("params");
        if (jSONObject2 == null) {
            ck.g().a("AliBuyOpenUrlNativeParamsAddAddressExtension", "handleNativeResult", "从Native返回的params数据为null");
            return;
        }
        jSONObject2.putAll(jSONObject);
        m0(aURARenderComponent, aURAEventIO, jSONObject);
    }

    public final void m0(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175334ce", new Object[]{this, aURARenderComponent, aURAEventIO, jSONObject});
        } else {
            this.f17954a.c().c("aura.workflow.adjustRules", an0.c(aURARenderComponent, aURAEventIO, jSONObject), new b(aURAEventIO));
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f17954a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.zbb
    public com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a r0(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a) ipChange.ipc$dispatch("4f90978a", new Object[]{this, aURARenderComponent, aURAEventIO});
        }
        com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a aVar = new com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a();
        aVar.c(new a(aURARenderComponent, aURAEventIO));
        return aVar;
    }
}
