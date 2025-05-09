package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.k9z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qpz implements k9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249445);
        t2o.a(839909559);
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            k9z.a.a(this, bbsVar);
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            k9z.a.b(this);
        }
    }

    @Override // tb.k9z
    public void handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08ec495", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        AlimamaAdvertising.instance().handleAdUrl(str);
        TMSLogger.a("IIFCExtension", ckf.p("handleAdUrl: ", str));
    }
}
