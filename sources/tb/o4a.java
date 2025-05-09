package tb;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.JNIBridge;
import com.taobao.android.themis.graphics.a;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import java.net.URLDecoder;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class o4a extends bv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666564);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements JNIBridge.o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.themis.graphics.JNIBridge.o
        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c025ab9f", new Object[]{this, str});
            }
            try {
                return uas.a(URLDecoder.decode(str, "utf-8"));
            } catch (Throwable th) {
                TMSLogger.c("GameV8RuntimeExtension", "获取sourceMap失败", th);
                return null;
            }
        }
    }

    static {
        t2o.a(834666563);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4a(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(o4a o4aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1610321377:
                super.j0();
                return null;
            case 429004960:
                return super.a((String) objArr[0]);
            case 467681013:
                super.f0((String) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/extension/page/GameV8RuntimeExtension");
        }
    }

    public final void P() {
        com.taobao.android.themis.graphics.a g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17314eb3", new Object[]{this});
            return;
        }
        String c = ies.c(h().c(), "debugServerUrl");
        String str = null;
        if (c != null && c.length() > 0) {
            str = URLDecoder.decode(c);
        }
        if (str != null && str.length() != 0 && (g = g()) != null) {
            g.k(str);
        }
    }

    @Override // tb.bv1
    public a.f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.f) ipChange.ipc$dispatch("199218a0", new Object[]{this, str});
        }
        ckf.g(str, "canvasId");
        a.f a2 = super.a(str);
        a2.h(IRiverBackend.EngineType.V8).l(new b());
        return a2;
    }

    @Override // tb.s8c
    public void d0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8437d67b", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "script");
        ckf.g(str2, "name");
        com.taobao.android.themis.graphics.a g = g();
        if (g != null) {
            g.q(str, str2);
        }
    }

    @Override // tb.bv1, tb.s8c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        com.taobao.android.themis.graphics.a g = g();
        if (g != null) {
            g.l();
        }
    }

    @Override // tb.bv1, tb.s8c
    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be03ef5", new Object[]{this, str});
            return;
        }
        ckf.g(str, "canvasId");
        super.f0(str);
        P();
    }

    @Override // tb.bv1, tb.s8c
    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a004721f", new Object[]{this});
            return;
        }
        super.j0();
        com.taobao.android.themis.graphics.a g = g();
        if (g != null) {
            ekd ekdVar = (ekd) h().getInstance().getExtension(ekd.class);
            AppModel appModel = null;
            c7o Y = ekdVar == null ? null : ekdVar.Y("gm.js");
            if (Y == null) {
                TMSLogger.b("GameV8RuntimeExtension", "业务包获取失败");
                return;
            }
            if (q9s.c2()) {
                TMSMetaInfoWrapper U = h().getInstance().U();
                if (U != null) {
                    appModel = U.c();
                }
                String a2 = v51.a(appModel, "gm.js.map");
                ckf.f(a2, "convertSourceMapUrl(\n   …\"gm.js.map\"\n            )");
                g.h(Y.getString(), "https://hybrid.miniapp.taobao.com/gm.js", a2);
            } else {
                g.g(Y.getString(), "https://hybrid.miniapp.taobao.com/gm.js");
            }
            TMSLogger.f("GameV8RuntimeExtension", "游戏主包执行完成");
        }
    }

    @Override // tb.bv1
    public void l() {
        ekd ekdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4240bb", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.a g = g();
        if (!(g == null || (ekdVar = (ekd) h().getInstance().getExtension(ekd.class)) == null)) {
            TMSMetaInfoWrapper P = h().getInstance().P();
            List<PluginModel> g2 = P == null ? null : P.g();
            List<PluginModel> list = g2;
            if (list != null && !list.isEmpty()) {
                for (PluginModel pluginModel : g2) {
                    String appId = pluginModel.getAppId();
                    ckf.f(appId, "pluginModel.appId");
                    c7o n = ekdVar.n(appId, "api-extension.min.js");
                    if (n != null) {
                        String string = n.getString();
                        g.s(string, TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME + ((Object) pluginModel.getAppId()) + "-api-extension.min.js");
                    }
                }
            }
            TMSLogger.f("GameV8RuntimeExtension", "二方拓展API执行完成");
        }
    }

    @Override // tb.bv1
    public void n() {
        ekd ekdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58865ac", new Object[]{this});
            return;
        }
        com.taobao.android.themis.graphics.a g = g();
        if (g != null && (ekdVar = (ekd) h().getInstance().getExtension(ekd.class)) != null) {
            c7o o0 = ekdVar.o0("gm.fm.js");
            if (o0 == null) {
                TMSLogger.b("GameV8RuntimeExtension", "框架包获取失败");
                return;
            }
            g.s(o0.getString(), "https://hybrid.miniapp.taobao.com/gm.fm.js");
            TMSLogger.f("GameV8RuntimeExtension", "框架包执行完成");
        }
    }

    @Override // tb.s8c
    public void p0(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f6f602", new Object[]{this, bArr, str, str2});
            return;
        }
        ckf.g(bArr, "script");
        ckf.g(str, "name");
        if (str2 == null) {
            com.taobao.android.themis.graphics.a g = g();
            if (g != null) {
                g.q(new String(bArr, uj3.UTF_8), str);
                return;
            }
            return;
        }
        com.taobao.android.themis.graphics.a g2 = g();
        if (g2 != null) {
            g2.i(new String(bArr, uj3.UTF_8), str, str2);
        }
    }
}
