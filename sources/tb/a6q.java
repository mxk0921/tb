package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.ImageDialogAction;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.popupcenter.strategy.PopStrategy;
import tb.uem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a6q implements ISmartLandingProxy.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ISmartLandingProxy.e f15571a;
    public ImageDialogAction b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(a6q a6qVar) {
        }

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
            } else {
                o3s.b("SmartLanding", "SmartLandingHomeAdapter PopLayerTrigger onDisplayed ");
            }
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else {
                o3s.b("SmartLanding", "SmartLandingHomeAdapter PopLayerTrigger onClosed ");
            }
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
            } else {
                o3s.b("SmartLanding", "SmartLandingHomeAdapter PopLayerTrigger onTriggerFailed ");
            }
        }
    }

    static {
        t2o.a(295699711);
        t2o.a(806355251);
    }

    public a6q(ISmartLandingProxy.e eVar) {
        this.f15571a = eVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ISmartLandingProxy.e eVar = this.f15571a;
        if (eVar != null) {
            eVar.destroy();
        }
        ImageDialogAction imageDialogAction = this.b;
        if (imageDialogAction != null) {
            imageDialogAction.c();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.e
    public boolean a(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96ed61f9", new Object[]{this, context, str, str2, str3, jSONObject})).booleanValue();
        }
        o3s.b("SmartLanding", "SmartLandingActionAdapter: " + str3 + " " + jSONObject.toString());
        if (TextUtils.equals(str3, PopStrategy.IDENTIFIER_POPLAYER)) {
            String string = jSONObject.getString("url");
            if (!TextUtils.isEmpty(string)) {
                uem.m(string, jSONObject.toJSONString()).j(new a(this)).l();
            }
            return true;
        } else if (TextUtils.equals(str3, "imagePop")) {
            ImageDialogAction imageDialogAction = new ImageDialogAction(context, jSONObject);
            this.b = imageDialogAction;
            imageDialogAction.f();
            return true;
        } else {
            ISmartLandingProxy.e eVar = this.f15571a;
            if (eVar != null) {
                return eVar.a(context, str, str2, str3, jSONObject);
            }
            return false;
        }
    }
}
