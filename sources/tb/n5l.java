package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.trade.event.ThreadMode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n5l implements rl8<g5l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24530a;

    static {
        t2o.a(352321572);
        t2o.a(723517460);
    }

    public n5l(Context context) {
        this.f24530a = context;
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: a */
    public gl8 h(g5l g5lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("14d9e109", new Object[]{this, g5lVar});
        }
        if (g5lVar == null || this.f24530a == null) {
            return gl8.FAILURE;
        }
        String str = g5lVar.e;
        if (TextUtils.isEmpty(str)) {
            return gl8.FAILURE;
        }
        Nav.from(this.f24530a).toUri(str);
        return gl8.SUCCESS;
    }
}
