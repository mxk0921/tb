package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vm0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.nextrpc.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vn0 extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989987);
    }

    public static /* synthetic */ Object ipc$super(vn0 vn0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/monitor/AliBuyRequestMonitorExtension");
    }

    public final String J0(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("916a9f32", new Object[]{this, kkVar});
        }
        if (kkVar == null) {
            return "0";
        }
        try {
            String string = kkVar.b().getJSONObject("data").getJSONObject("global").getString("taoBuy3Style1");
            return string == null ? "0" : string;
        } catch (Throwable unused) {
            return "0";
        }
    }

    @Override // tb.et
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
            return;
        }
        String a2 = kkVar.a();
        if (B() != null && ("mtop.trade.order.build".equals(a2) || "mtop.trade.order.adjust".equals(a2))) {
            B().update("taoBuy3Style1", J0(kkVar));
        }
        vm0.f(vm0.b.o(kkVar.a(), true).n(ik.a(kkVar)).message(kkVar.h()).sampling(0.001f));
    }
}
