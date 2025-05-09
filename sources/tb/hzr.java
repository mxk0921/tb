package tb;

import com.alibaba.android.aura.AURAAdamAndroidPluginCenter;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.AURATaobaoWaitPayDetailPluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hzr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xjd f20991a;

    static {
        t2o.a(725614599);
    }

    public hzr(xjd xjdVar) {
        this.f20991a = xjdVar;
    }

    public IAURAPluginCenter[] d() {
        try {
            AURAAliBuyCorePluginCenter aURAAliBuyCorePluginCenter = new AURAAliBuyCorePluginCenter();
            AURATaobaoWaitPayDetailPluginCenter aURATaobaoWaitPayDetailPluginCenter = new AURATaobaoWaitPayDetailPluginCenter();
            AURATaobaoPurchasePluginCenter aURATaobaoPurchasePluginCenter = new AURATaobaoPurchasePluginCenter();
            IpChange ipChange = AURAAdamAndroidPluginCenter.$ipChange;
            return new IAURAPluginCenter[]{aURAAliBuyCorePluginCenter, aURATaobaoWaitPayDetailPluginCenter, aURATaobaoPurchasePluginCenter, (IAURAPluginCenter) AURAAdamAndroidPluginCenter.class.newInstance()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("caa1a758", new Object[]{this});
        }
        return new AURANextRPCEndpoint.a().z("mtop.taobao.order.waitpaydetail.adjust").V("1.0").F(true).G(true).J(true).I(((xzr) this.f20991a).e()).T("UNIT_TRADE").B();
    }

    public AURANextRPCEndpoint b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("9ee75f45", new Object[]{this});
        }
        return new AURANextRPCEndpoint.a().z("mtop.taobao.order.waitpaydetail.build").V("1.0").F(true).G(true).J(true).I(((xzr) this.f20991a).f()).T("UNIT_TRADE").B();
    }

    public AURANextRPCEndpoint c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("c2b9654d", new Object[]{this});
        }
        return new AURANextRPCEndpoint.a().z("mtop.taobao.order.waitpaydetail.modify").V("1.0").F(true).G(true).J(true).I(((xzr) this.f20991a).g()).T("UNIT_TRADE").B();
    }
}
