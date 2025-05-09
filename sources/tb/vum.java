package tb;

import android.taobao.windvane.prerender.SnapShotPrerenderFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class vum {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vum INSTANCE = new vum();

    /* renamed from: a  reason: collision with root package name */
    public static final SnapShotPrerenderFactory f30268a = new SnapShotPrerenderFactory();
    public static final ru3 b = new ru3();

    static {
        t2o.a(989856369);
        t2o.a(989856368);
    }

    public void a(xum xumVar, g1a<? super wum, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64360b07", new Object[]{this, xumVar, g1aVar});
            return;
        }
        ckf.g(xumVar, "params");
        ckf.g(g1aVar, "callback");
        if (xumVar.b() == 0) {
            g1aVar.invoke(null);
        } else if (xumVar.b() == 1) {
            b.a(xumVar, g1aVar);
        } else if (xumVar.b() == 2) {
            f30268a.a(xumVar, g1aVar);
        }
    }
}
