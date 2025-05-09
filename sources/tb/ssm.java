package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.PageModel;
import com.taobao.android.turbo.model.PrefetchModel;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.android.turbo.monitor.Monitor;
import com.taobao.dojo.ability.preload.protocol.IPreloadService;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ssm implements qcd, bid, o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f28252a;
    public boolean b;
    public final HashMap<String, htd> c = new HashMap<>();
    public htd d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455601);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455600);
        t2o.a(916455455);
        t2o.a(916455457);
        t2o.a(919601295);
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3961deee", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            qpu qpuVar = this.f28252a;
            if (qpuVar != null) {
                ((kee) qpuVar.getService(kee.class)).Q0(UmiWvPlugin.PLUGIN_NAME, "getRemoteModuleSwitch", kotlin.collections.a.h(), null, null);
            } else {
                ckf.y("context");
                throw null;
            }
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f28252a = qpuVar;
        ((did) qpuVar.getService(did.class)).T0(this);
        ((q2c) qpuVar.getService(q2c.class)).r(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((did) qpuVar.getService(did.class)).U0(this);
        ((q2c) qpuVar.getService(q2c.class)).x(this);
        htd htdVar = this.d;
        if (htdVar != null) {
            htdVar.cancel();
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        if (engineState == EngineState.IDLE) {
            L();
        }
    }

    public final htd r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htd) ipChange.ipc$dispatch("23578205", new Object[]{this, str, str2});
        }
        htd htdVar = this.c.get(str);
        if (htdVar == null) {
            qpu qpuVar = this.f28252a;
            if (qpuVar != null) {
                s4d g = qpuVar.a().g();
                if (g != null) {
                    qpu qpuVar2 = this.f28252a;
                    if (qpuVar2 != null) {
                        htdVar = g.getSubPagePreload(str2, qpuVar2, str);
                    } else {
                        ckf.y("context");
                        throw null;
                    }
                } else {
                    htdVar = null;
                }
                if (htdVar != null) {
                    this.c.put(str, htdVar);
                    htdVar.onCreate();
                }
            } else {
                ckf.y("context");
                throw null;
            }
        }
        return htdVar;
    }

    public final void B(RedpointModel redpointModel, htd htdVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81a6e2e", new Object[]{this, redpointModel, htdVar});
            return;
        }
        HashMap hashMap = new HashMap();
        lrm lrmVar = null;
        JSONObject jSONObject = null;
        if ((redpointModel != null ? redpointModel.getIconStreams() : null) != null) {
            hashMap.put("iconStreams", redpointModel.getIconStreams());
        }
        if ((redpointModel != null ? redpointModel.getPassLongParam() : null) != null) {
            hashMap.put("passLongParam", redpointModel.getPassLongParam());
        }
        if ((redpointModel != null ? redpointModel.getPageUtParams() : null) != null) {
            hashMap.put(p3h.KEY_PAGE_UT_PARAMS, redpointModel.getPageUtParams());
        }
        if ((redpointModel != null ? redpointModel.getGlobalUtParams() : null) != null) {
            hashMap.put("globalUtParams", redpointModel.getGlobalUtParams());
        }
        if (redpointModel != null) {
            i = redpointModel.getLightDuration();
        }
        qpu qpuVar = this.f28252a;
        if (qpuVar != null) {
            PrefetchModel o0 = ((did) qpuVar.getService(did.class)).o0();
            if (o0 != null) {
                if (o0.getClientConfig() != null) {
                    Map<String, String> clientConfig = o0.getClientConfig();
                    if (clientConfig != null) {
                        jSONObject = new JSONObject(clientConfig);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                    }
                }
                lrmVar = new lrm(jSONObject, o0.getLimit(), o0.getDisablePreloading(), o0.getCtrRankScore());
            }
            htdVar.onPreload(hashMap, i, lrmVar);
            this.d = htdVar;
            return;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.bid
    public void x(RedpointModel redpointModel) {
        TabModel tabModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4c1a0c", new Object[]{this, redpointModel});
            return;
        }
        qpu qpuVar = this.f28252a;
        htd htdVar = null;
        if (qpuVar != null) {
            Object s = ((byb) qpuVar.getService(byb.class)).s();
            qpu qpuVar2 = this.f28252a;
            if (qpuVar2 != null) {
                b7d b7dVar = (b7d) qpuVar2.getService(b7d.class);
                if (s != null && b7dVar.getPageState() == -1) {
                    PageModel pageModel = (PageModel) s;
                    int selectedTabIndex = pageModel.getSelectedTabIndex();
                    String selectedTabId = pageModel.getSelectedTabId();
                    List<TabModel> tabs = pageModel.getTabs();
                    String type = (tabs == null || (tabModel = tabs.get(selectedTabIndex)) == null) ? null : tabModel.getType();
                    if (type != null) {
                        htdVar = r(selectedTabId, type);
                    }
                    htd htdVar2 = this.d;
                    if (htdVar2 != null && !ckf.b(htdVar2, htdVar)) {
                        htdVar2.cancel();
                    }
                    if (((Boolean) ud0.Companion.b().c("weitao_switch.enableTurboPreload", Boolean.TRUE)).booleanValue() && htdVar != null) {
                        try {
                            B(redpointModel, htdVar);
                        } catch (Exception e) {
                            gi8.INSTANCE.a("preloadSubPage failed", v3i.f(jpu.a(vaj.KEY_TAB_ID, selectedTabId)), Monitor.Type.PRELOAD, Monitor.Code.EXCEPTION, true, e);
                        }
                        tpu.a aVar = tpu.Companion;
                        tpu.a.b(aVar, IPreloadService.SERVICE_NAME, "onRedpointChanged doPreload, tabId: " + selectedTabId, null, 4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }
}
