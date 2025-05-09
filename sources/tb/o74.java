package tb;

import android.app.Activity;
import android.net.Uri;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import tb.o6d;
import tb.rg7;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o74 implements sob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25179a;
    public final olk<sob> b = new olk<>();
    public final Map<uq9, Map<String, String>> c = new WeakHashMap();
    public final Map<uq9, Map<String, String>> d = new WeakHashMap();
    public Map<String, String> e;
    public String f;
    public String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f25181a;

        public b(FluidContext fluidContext) {
            this.f25181a = fluidContext;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1512649357) {
                super.onResume();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/listener/CommonTrackManager$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            super.onResume();
            o74.d(o74.this, this.f25181a);
            o74.e(o74.this, this.f25181a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements rg7.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rg7.c
        public void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
                return;
            }
            ir9.b("CommonTrackManager", "onDetailRequest onResult ---");
            o74.f(o74.this);
        }

        @Override // tb.rg7.c
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(468713575);
        t2o.a(468713580);
        t2o.a(468713581);
    }

    public o74(FluidContext fluidContext) {
        this.f25179a = fluidContext;
    }

    public static /* synthetic */ Map b(o74 o74Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cecb555d", new Object[]{o74Var});
        }
        return o74Var.c;
    }

    public static /* synthetic */ Map c(o74 o74Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e8b88fc", new Object[]{o74Var});
        }
        return o74Var.d;
    }

    public static /* synthetic */ void d(o74 o74Var, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e8b18", new Object[]{o74Var, fluidContext});
        } else {
            o74Var.q(fluidContext);
        }
    }

    public static /* synthetic */ void e(o74 o74Var, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7de77", new Object[]{o74Var, fluidContext});
        } else {
            o74Var.p(fluidContext);
        }
    }

    public static /* synthetic */ void f(o74 o74Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10a00a4", new Object[]{o74Var});
        } else {
            o74Var.n();
        }
    }

    @Override // tb.sob
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af43359", new Object[]{this, map});
            return;
        }
        for (sob sobVar : this.b.b()) {
            try {
                sobVar.a(map);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f25179a, sobVar, "onCommonTrackInfoChanged", e);
            }
        }
    }

    public void g(sob sobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93e0363", new Object[]{this, sobVar});
        } else if (sobVar != null) {
            this.b.a(sobVar);
        }
    }

    public Map<String, String> h(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("50ed4337", new Object[]{this, uq9Var});
        }
        return (Map) ((WeakHashMap) this.c).get(uq9Var);
    }

    public Map<String, String> i(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cc0f3199", new Object[]{this, uq9Var});
        }
        return (Map) ((WeakHashMap) this.d).get(uq9Var);
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c157d6e", new Object[]{this});
        }
        return this.g;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35c56222", new Object[]{this});
        }
        return this.f;
    }

    public void l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792db249", new Object[]{this, fluidContext});
            return;
        }
        ((ICardService) fluidContext.getService(ICardService.class)).addCardLifecycleListener((wlb.a) new a(fluidContext));
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new b(fluidContext));
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService != null) {
            iDataService.addDetailRequestListener(new c());
        }
    }

    public void m(sob sobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d07946", new Object[]{this, sobVar});
        } else if (sobVar != null) {
            this.b.e(sobVar);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b204421e", new Object[]{this});
            return;
        }
        ir9.b("CommonTrackManager", "resetAppendCommonTrack -- ");
        Map<String, String> map = this.e;
        if (map != null) {
            ((HashMap) map).clear();
        }
    }

    public void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee91127", new Object[]{this, map});
            return;
        }
        ir9.b("CommonTrackManager", "updateCommonTrack -- " + map);
        if (map != null) {
            if (this.e == null) {
                this.e = new HashMap();
            }
            this.e.putAll(map);
            for (Map map2 : ((WeakHashMap) this.c).values()) {
                map2.putAll(this.e);
            }
            ICardService iCardService = (ICardService) this.f25179a.getService(ICardService.class);
            if (iCardService != null) {
                a(h(iCardService.getActiveCard()));
            }
            IMediaService iMediaService = (IMediaService) this.f25179a.getService(IMediaService.class);
            if (iMediaService != null) {
                iMediaService.update12003UtParams(map);
            }
        }
    }

    public final void p(FluidContext fluidContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409ce5b7", new Object[]{this, fluidContext});
        } else if (this.g != null) {
            ir9.b("TrackUtils", "fs utparam-pre 已经取过utparam-pre，无需重复取");
        } else {
            anl pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
            if (pageInterface != null) {
                obj = pageInterface.getUTObject();
            } else {
                obj = fluidContext.getContext();
            }
            if (obj instanceof Activity) {
                Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(fluidContext).getPageAllProperties((Activity) obj);
                ir9.b("TrackUtils", "fs utparam-pre 设置 utContext = " + obj);
                if (!sz3.b(pageAllProperties)) {
                    String str = pageAllProperties.get("utparam-pre");
                    ir9.b("TrackUtils", "fs utparam-pre 设置 = " + str);
                    this.g = Uri.encode(str);
                    return;
                }
                ir9.b("TrackUtils", "fs utparam-url 设置 pageAllProperties = null");
            }
        }
    }

    public final void q(FluidContext fluidContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f17b083", new Object[]{this, fluidContext});
        } else if (this.f != null) {
            ir9.b("TrackUtils", "fs utparam-url 已经取过utparam-url，无需重复取");
        } else {
            anl pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
            if (pageInterface != null) {
                obj = pageInterface.getUTObject();
            } else {
                obj = fluidContext.getContext();
            }
            if (obj instanceof Activity) {
                Map<String, String> pageAllProperties = FluidSDK.getUTAdapter().withFluidContext(fluidContext).getPageAllProperties((Activity) obj);
                ir9.b("TrackUtils", "fs utparam-url 设置 utContext = " + obj);
                if (!sz3.b(pageAllProperties)) {
                    String str = pageAllProperties.get(z9u.KEY_UTPARAM_URL);
                    ir9.b("TrackUtils", "fs utparam-url 设置 = " + str);
                    this.f = Uri.encode(str);
                    return;
                }
                ir9.b("TrackUtils", "fs utparam-url 设置 pageAllProperties = null");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f25180a;

        public a(FluidContext fluidContext) {
            this.f25180a = fluidContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -147728739) {
                super.onActive((uq9) objArr[0]);
                return null;
            } else if (hashCode == 2063982600) {
                super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/usertrack/listener/CommonTrackManager$1");
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            super.onActive(uq9Var);
            Map<String, String> map = (Map) o74.b(o74.this).get(uq9Var);
            if (map != null) {
                o74.this.a(map);
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
                return;
            }
            Map<String, String> map = (Map) o74.b(o74.this).get(uq9Var);
            if (map != null) {
                map.clear();
                xau.x(this.f25180a, uq9Var, map);
                xau.Y(this.f25180a, map, uq9Var.Y());
                xau.q(map, uq9Var.T().f(), ((IDataService) this.f25180a.getService(IDataService.class)).isTab3CacheEnable());
                if (uq9Var instanceof prp) {
                    z = ((prp) uq9Var).t1().c().o();
                }
                xau.r(this.f25180a, z);
                Map<String, String> map2 = o74.this.e;
                if (map2 != null) {
                    map.putAll(map2);
                }
                uq9 activeCard = ((ICardService) this.f25180a.getService(ICardService.class)).getActiveCard();
                if (activeCard == null || activeCard == uq9Var) {
                    o74.this.a(map);
                }
            }
            Map map3 = (Map) o74.c(o74.this).get(uq9Var);
            if (map3 != null) {
                c65.d(this.f25180a, map3, uq9Var.Y(), uq9Var.T().f());
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
                return;
            }
            super.onCreateView(uq9Var, recyclerViewHolder);
            if (!o74.b(o74.this).containsKey(uq9Var)) {
                HashMap hashMap = new HashMap();
                xau.x(this.f25180a, uq9Var, hashMap);
                o74.b(o74.this).put(uq9Var, hashMap);
                uq9 activeCard = ((ICardService) this.f25180a.getService(ICardService.class)).getActiveCard();
                if (activeCard == null || activeCard == uq9Var) {
                    o74.this.a(hashMap);
                }
            }
            if (!o74.c(o74.this).containsKey(uq9Var)) {
                o74.c(o74.this).put(uq9Var, new HashMap());
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
            } else {
                onBindData(uq9Var, aVar, i);
            }
        }
    }
}
