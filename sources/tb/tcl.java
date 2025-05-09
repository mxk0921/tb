package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tcl implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ut7<Intent> downgradeProcess = new ut7<>();

    static {
        t2o.a(713032024);
        t2o.a(578814049);
    }

    public tcl() {
        this.downgradeProcess.a(new nax(), new hzv(), new vt7(), new baq(), new pda());
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "OrderDetailNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        lor.c(CoreConstants.NAV_TAG, "OrderDetailNavProcessor", new String[0]);
        ddl.c();
        if (otn.c(intent, zmjVar) || otn.a(intent, zmjVar)) {
            return false;
        }
        if (dbl.r()) {
            this.downgradeProcess.b(intent);
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
