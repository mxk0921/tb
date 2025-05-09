package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tnj implements Nav.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ut7<Intent> downgradeProcess = new ut7<>();
    public ut7<Intent> listDowngradeProcess = new ut7<>();

    static {
        t2o.a(713032023);
        t2o.a(578814041);
    }

    public tnj() {
        this.downgradeProcess.a(new pax(), new hzv(), new vt7(), new baq(), new pda());
        this.listDowngradeProcess.a(new qax(), new vug(), new wt7(), new qda());
    }

    public boolean beforeNavTo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
        }
        if (dbl.r()) {
            this.downgradeProcess.b(intent);
        }
        if (dbl.q()) {
            this.listDowngradeProcess.b(intent);
        }
        return true;
    }
}
