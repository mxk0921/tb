package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.event.addAddress")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yl0 extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989972);
    }

    public static /* synthetic */ Object ipc$super(yl0 yl0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/event/AliBuyAddAddressEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else {
            O0(aURAEventIO);
        }
    }

    public final void O0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab6b938", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        eventModel.s(WXAddressModule2.PLUGIN_NAME);
        pi.b(J0().c(), "openUrl", eventModel);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "addAddress";
    }
}
