package com.taobao.themis.canvas.extension.page;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.taobao.themis.canvas.canvas.TMSCanvasRender;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.net.URLDecoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import tb.a07;
import tb.bv1;
import tb.c7o;
import tb.ckf;
import tb.d1a;
import tb.ecf;
import tb.ekd;
import tb.ies;
import tb.lcn;
import tb.mcn;
import tb.o33;
import tb.q9s;
import tb.t2o;
import tb.v51;
import tb.wsq;
import tb.xhv;
import tb.zbf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class GameQkingJSRuntimeExtension extends bv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public ecf e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666557);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(834666556);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameQkingJSRuntimeExtension(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static final /* synthetic */ ecf P(GameQkingJSRuntimeExtension gameQkingJSRuntimeExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ecf) ipChange.ipc$dispatch("3b858675", new Object[]{gameQkingJSRuntimeExtension});
        }
        return gameQkingJSRuntimeExtension.e;
    }

    public static final /* synthetic */ void S(GameQkingJSRuntimeExtension gameQkingJSRuntimeExtension, ecf ecfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d18c157", new Object[]{gameQkingJSRuntimeExtension, ecfVar});
        } else {
            gameQkingJSRuntimeExtension.e = ecfVar;
        }
    }

    public static /* synthetic */ Object ipc$super(GameQkingJSRuntimeExtension gameQkingJSRuntimeExtension, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == -1610321377) {
            super.j0();
            return null;
        } else if (hashCode == 467681013) {
            super.f0((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/canvas/extension/page/GameQkingJSRuntimeExtension");
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17314eb3", new Object[]{this});
            return;
        }
        final String e0 = h().getInstance().e0();
        ckf.f(e0, "page.getInstance().url");
        String c = ies.c(e0, "debugServerUrl");
        String str = null;
        if (c != null && c.length() > 0) {
            str = URLDecoder.decode(c);
        }
        final String f = f();
        if (f != null) {
            final String p = ckf.p(f, "_frame");
            final String p2 = ckf.p(p, "_loader");
            if (str != null && str.length() != 0) {
                try {
                    mcn.c(str, f, new RVLRemoteConnectCallback() { // from class: com.taobao.themis.canvas.extension.page.GameQkingJSRuntimeExtension$connectDebugServer$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* compiled from: Taobao */
                        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                        /* renamed from: com.taobao.themis.canvas.extension.page.GameQkingJSRuntimeExtension$connectDebugServer$1$1  reason: invalid class name */
                        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
                        public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
                            public static volatile transient /* synthetic */ IpChange $ipChange;
                            public final /* synthetic */ String $currentSessionId;
                            public final /* synthetic */ String $frameId;
                            public final /* synthetic */ String $loaderId;
                            public final /* synthetic */ String $sessionUrl;
                            public final /* synthetic */ GameQkingJSRuntimeExtension this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(String str, GameQkingJSRuntimeExtension gameQkingJSRuntimeExtension, String str2, String str3, String str4) {
                                super(0);
                                this.$sessionUrl = str;
                                this.this$0 = gameQkingJSRuntimeExtension;
                                this.$currentSessionId = str2;
                                this.$frameId = str3;
                                this.$loaderId = str4;
                            }

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/extension/page/GameQkingJSRuntimeExtension$connectDebugServer$1$1");
                            }

                            @Override // tb.d1a
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                                } else if (this.$sessionUrl.length() > 0 && GameQkingJSRuntimeExtension.P(this.this$0) == null) {
                                    GameQkingJSRuntimeExtension.S(this.this$0, new ecf(this.$currentSessionId, this.$sessionUrl, "GM"));
                                    ecf P = GameQkingJSRuntimeExtension.P(this.this$0);
                                    ckf.d(P);
                                    zbf.d(P, "Qking");
                                    this.this$0.h().x(new o33(this.$sessionUrl, this.$currentSessionId, this.$frameId, this.$loaderId));
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("frameId", this.$frameId);
                                    zbf.b("Page.frameStartedLoading", jSONObject, this.$currentSessionId);
                                }
                            }
                        }

                        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
                        public final void finish(boolean z, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str2});
                            } else {
                                CommonExtKt.q(new AnonymousClass1(e0, this, f, p, p2), 1000L);
                            }
                        }
                    });
                } catch (Throwable th) {
                    TMSLogger.c("GameQkingJSRuntimeExtension", "开启远程调试失败", th);
                }
            } else if (zbf.a() && e0.length() > 0 && this.e == null) {
                ecf ecfVar = new ecf(f, e0, "GM");
                zbf.d(ecfVar, "Qking");
                h().x(new o33(e0, f, p, p2));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("frameId", p);
                zbf.b("Page.frameStartedLoading", jSONObject, f);
                this.e = ecfVar;
            }
        }
    }

    public final Pair<String, c7o> V() {
        c7o c7oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4377e535", new Object[]{this});
        }
        ekd ekdVar = (ekd) h().getInstance().getExtension(ekd.class);
        String str = "gm.v20.wlm";
        if (ekdVar == null) {
            c7oVar = null;
        } else {
            c7oVar = ekdVar.Y(str);
        }
        if (c7oVar == null) {
            ekd ekdVar2 = (ekd) h().getInstance().getExtension(ekd.class);
            str = "gm.js";
            if (ekdVar2 == null) {
                c7oVar = null;
            } else {
                c7oVar = ekdVar2.Y(str);
            }
        }
        if (c7oVar != null) {
            return new Pair<>(str, c7oVar);
        }
        return null;
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
        ecf ecfVar = this.e;
        if (ecfVar != null) {
            ckf.d(ecfVar);
            ecfVar.a();
            this.e = null;
            lcn.b();
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
        O(str);
        T();
        super.f0(str);
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
            if (!(list == null || list.isEmpty())) {
                for (PluginModel pluginModel : g2) {
                    String appId = pluginModel.getAppId();
                    ckf.f(appId, "pluginModel.appId");
                    c7o n = ekdVar.n(appId, "api-extension.min.v20.wlm");
                    if (n != null) {
                        byte[] bytes = n.getBytes();
                        g.t(bytes, TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME + ((Object) pluginModel.getAppId()) + "-api-extension.min.v20.wlm");
                    }
                }
                TMSLogger.f("GameQkingJSRuntimeExtension", "二方拓展API执行完成");
            }
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
            c7o o0 = ekdVar.o0("gm.fm.v20.wlm");
            if (o0 == null) {
                TMSLogger.b("GameQkingJSRuntimeExtension", "框架包获取失败");
                return;
            }
            TMSLogger.f("GameQkingJSRuntimeExtension", "框架包执行完成");
            g.t(o0.getBytes(), "https://hybrid.miniapp.taobao.com/gm.fm.v20.wlm");
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
                g.u(bArr, str);
                return;
            }
            return;
        }
        com.taobao.android.themis.graphics.a g2 = g();
        if (g2 != null) {
            g2.f(bArr, str, str2);
        }
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
            Pair<String, c7o> V = V();
            if (V == null) {
                TMSLogger.b("GameQkingJSRuntimeExtension", "业务包获取失败");
                return;
            }
            c7o second = V.getSecond();
            String first = V.getFirst();
            AppModel appModel = null;
            if (!wsq.O(first, "wlm", false, 2, null)) {
                g.g(second.getString(), ckf.p(TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME, first));
            } else if (q9s.c2()) {
                TMSMetaInfoWrapper U = h().getInstance().U();
                if (U != null) {
                    appModel = U.c();
                }
                String a2 = v51.a(appModel, "gm.js.map");
                ckf.f(a2, "convertSourceMapUrl(\n   …js.map\"\n                )");
                g.e(second.getBytes(), ckf.p(TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME, first), a2);
            } else {
                g.w(second.getBytes(), ckf.p(TMSCanvasRender.ONLINE_HOST_ONLY_FILENAME, first));
            }
            TMSLogger.f("GameQkingJSRuntimeExtension", "游戏主包执行完成");
        }
    }
}
