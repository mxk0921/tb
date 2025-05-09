package tb;

import com.alibaba.ability.utils.AbilityOrangeConfig;
import com.alibaba.ability.utils.MegaTrace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yq INSTANCE = new yq();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f32273a = new AtomicBoolean(false);

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (f32273a.compareAndSet(false, true)) {
            cjf cjfVar = cjf.INSTANCE;
            cjfVar.n(lar.INSTANCE);
            MegaTrace megaTrace = MegaTrace.INSTANCE;
            megaTrace.b("Mega#init");
            megaTrace.b("Mega#IoC");
            cjfVar.t(nxr.INSTANCE);
            cjfVar.p(mor.INSTANCE);
            cjfVar.r(aqr.INSTANCE);
            cjfVar.o(hbr.INSTANCE);
            cjfVar.m(gar.INSTANCE);
            cjfVar.k(j6r.INSTANCE);
            cjfVar.q(oor.INSTANCE);
            cjfVar.l(l6r.INSTANCE);
            cjfVar.s(dsr.INSTANCE);
            megaTrace.e();
            AbilityOrangeConfig.INSTANCE.k();
            if (ABGlobal.isFeatureOpened(c21.i(), "mega_hub_optimization_enable")) {
                er.c(new eey(new cwy()));
                iih.INSTANCE.b("AbilityEntrance", "注册表按需创建");
            } else {
                ar arVar = new ar();
                arVar.a(nr.class);
                iih.INSTANCE.b("AbilityEntrance", "注册表集中式创建");
                er.c(arVar);
            }
            er.d(new ffo());
            aui.b(new gr());
            megaTrace.e();
        }
    }
}
