package android.taobao.windvane.export.prerender;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.orange.OrangeConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.g1a;
import tb.lcn;
import tb.t2o;
import tb.xhv;
import tb.xum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TMSPrerenderService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSPrerenderService INSTANCE = new TMSPrerenderService();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f1773a = new AtomicBoolean(false);
    public static String b;
    public static TMSPrerenderModel c;

    static {
        t2o.a(989855910);
    }

    public static final /* synthetic */ String a(TMSPrerenderService tMSPrerenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31ece9bb", new Object[]{tMSPrerenderService});
        }
        return b;
    }

    public static final /* synthetic */ TMSPrerenderModel b(TMSPrerenderService tMSPrerenderService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSPrerenderModel) ipChange.ipc$dispatch("6c529fbb", new Object[]{tMSPrerenderService});
        }
        return c;
    }

    public static final /* synthetic */ void c(TMSPrerenderService tMSPrerenderService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b273a91b", new Object[]{tMSPrerenderService, str});
        } else {
            b = str;
        }
    }

    public static final /* synthetic */ void d(TMSPrerenderService tMSPrerenderService, TMSPrerenderModel tMSPrerenderModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5135fd13", new Object[]{tMSPrerenderService, tMSPrerenderModel});
        } else {
            c = tMSPrerenderModel;
        }
    }

    public final void f(g1a<? super Boolean, xhv> g1aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0731af", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "callback");
        if (!f1773a.get()) {
            g1aVar.invoke(Boolean.FALSE);
            return;
        }
        TMSPrerenderModel tMSPrerenderModel = c;
        if (tMSPrerenderModel != null) {
            if (!tMSPrerenderModel.getEnable()) {
                lcn.a(RVLLevel.Error, "Themis/Performance/Prerender").j("start").a("msg", "config.enable is false").f();
                g1aVar.invoke(Boolean.FALSE);
                return;
            }
            Iterator<T> it = tMSPrerenderModel.getTasks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (tMSPrerenderModel.isMatchCondition((TMSPrerenderTaskModel) obj)) {
                    break;
                }
            }
            TMSPrerenderTaskModel tMSPrerenderTaskModel = (TMSPrerenderTaskModel) obj;
            if (tMSPrerenderTaskModel != null) {
                lcn.a(RVLLevel.Error, "Themis/Performance/Prerender").j("start").a("config", JSON.toJSONString(tMSPrerenderTaskModel)).f();
                try {
                    xum.a aVar = new xum.a();
                    String url = tMSPrerenderTaskModel.getUrl();
                    ckf.d(url);
                    xum.a e = aVar.f(url).c(1).e(tMSPrerenderTaskModel.getSpmBVerifyValue());
                    Long delayNextTime = tMSPrerenderTaskModel.getDelayNextTime();
                    PrerenderManager.INSTANCE.c(e.b(delayNextTime != null ? delayNextTime.longValue() : -1L).a(), g1aVar);
                    Result.m1108constructorimpl(xhv.INSTANCE);
                    return;
                } catch (Throwable th) {
                    Result.m1108constructorimpl(b.a(th));
                    return;
                }
            }
        }
        g1aVar.invoke(Boolean.FALSE);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else if (f1773a.compareAndSet(false, true)) {
            lcn.a(RVLLevel.Info, "Themis/Performance/Prerender").j("setup").f();
            OrangeConfig.getInstance().registerListener(new String[]{"themis_prerender_config"}, TMSPrerenderService$setup$1.INSTANCE, true);
        }
    }
}
