package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "albbcashier.impl.aspect.lifecycle.event.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ogl extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(860880926);
    }

    public static /* synthetic */ Object ipc$super(ogl oglVar, String str, Object... objArr) {
        if (str.hashCode() == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in extention/OverSeaFrontCashierEventMonitor");
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        try {
            if (ri.CODE.equals(cgVar.b())) {
                Serializable data = aURAInputData.getData();
                if (data instanceof AURAEventIO) {
                    AURAEventIO aURAEventIO = (AURAEventIO) data;
                    if ("openUrl".equals(aURAEventIO.getEventType()) && "overseaPayType".equals(aURAEventIO.getEventModel().i())) {
                        System.currentTimeMillis();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            rbb g = ck.g();
            g.c("FrontCashierPreRender", "EventMonitor", "error:" + e.getMessage());
        }
    }
}
