package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.themis.taobao.utils.TMSQuickPerfChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<z80> f29858a = new ArrayList();

    public static void a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0869f3d", new Object[]{context, uri});
            return;
        }
        Iterator it = ((ArrayList) f29858a).iterator();
        while (it.hasNext()) {
            z80 z80Var = (z80) it.next();
            if (z80Var.process(context, uri)) {
                BootstrapMode.i(524288);
                BootstrapMode.f(BootstrapMode.EXTRA_KEY_FAST_ENTER_BIZ, z80Var.getName());
                return;
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb164a2", new Object[0]);
            return;
        }
        ((ArrayList) f29858a).add(new TMSQuickPerfChecker());
    }
}
