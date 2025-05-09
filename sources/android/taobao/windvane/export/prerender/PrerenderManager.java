package android.taobao.windvane.export.prerender;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ckf;
import tb.g1a;
import tb.lcn;
import tb.t2o;
import tb.uum;
import tb.wum;
import tb.xhv;
import tb.xum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PrerenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PrerenderManager INSTANCE = new PrerenderManager();

    /* renamed from: a  reason: collision with root package name */
    public static final List<wum> f1771a = new ArrayList();

    static {
        t2o.a(989855898);
        t2o.a(989855895);
    }

    public static final /* synthetic */ List a(PrerenderManager prerenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aa72f3f8", new Object[]{prerenderManager});
        }
        return f1771a;
    }

    public WVUCWebView b(uum uumVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("26c12223", new Object[]{this, uumVar});
        }
        ckf.g(uumVar, "params");
        Iterator it = ((ArrayList) f1771a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            wum wumVar = (wum) obj;
            xum a2 = wumVar.a();
            if (wumVar.c() && uumVar.b() == a2.b() && a2.c().a(a2.e(), uumVar.c())) {
                break;
            }
        }
        wum wumVar2 = (wum) obj;
        if (wumVar2 == null) {
            return null;
        }
        lcn.f(RVLLevel.Info, "Themis/Performance/Prerender", "hit prerender webview");
        ((ArrayList) f1771a).remove(wumVar2);
        wumVar2.b().setOuterContext(uumVar.a());
        if (wumVar2.a().a() > 0) {
            CommonExtKt.p(PrerenderManager$acquirePrerenderWebView$1.INSTANCE, wumVar2.a().a());
        }
        return wumVar2.b();
    }

    public void c(xum xumVar, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400d5b9e", new Object[]{this, xumVar, g1aVar});
            return;
        }
        ckf.g(xumVar, "params");
        ckf.g(g1aVar, "callback");
        CommonExtKt.o(new PrerenderManager$preRender$1(g1aVar, xumVar));
    }
}
