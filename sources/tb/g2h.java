package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.o6d;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l6t f19701a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f19702a;

        public a(FluidContext fluidContext) {
            this.f19702a = fluidContext;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 188604040) {
                super.onStop();
                return null;
            } else if (hashCode == 2133689546) {
                super.onStart();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/usertrack/manager/LivePMManager$1");
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            super.onStart();
            uq9 activeCard = ((ICardService) this.f19702a.getService(ICardService.class)).getActiveCard();
            if (g2h.a(g2h.this, activeCard)) {
                g2h.b(g2h.this, activeCard);
            }
        }

        @Override // tb.o6d.a, tb.o6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            if (g2h.a(g2h.this, ((ICardService) this.f19702a.getService(ICardService.class)).getActiveCard())) {
                g2h.c(g2h.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1249298707) {
                super.onDisActive((uq9) objArr[0]);
                return null;
            } else if (hashCode == -147728739) {
                super.onActive((uq9) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/usertrack/manager/LivePMManager$2");
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
            if (g2h.a(g2h.this, uq9Var)) {
                g2h.b(g2h.this, uq9Var);
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
                return;
            }
            super.onDisActive(uq9Var);
            if (g2h.a(g2h.this, uq9Var) && g2h.d(g2h.this) != null) {
                g2h.c(g2h.this);
            }
        }
    }

    static {
        t2o.a(468713582);
    }

    public g2h(FluidContext fluidContext) {
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new a(fluidContext));
        ((ICardService) fluidContext.getService(ICardService.class)).addCardLifecycleListener((wlb.a) new b());
    }

    public static /* synthetic */ boolean a(g2h g2hVar, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0f57283", new Object[]{g2hVar, uq9Var})).booleanValue();
        }
        return g2hVar.f(uq9Var);
    }

    public static /* synthetic */ void b(g2h g2hVar, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d69af5e", new Object[]{g2hVar, uq9Var});
        } else {
            g2hVar.g(uq9Var);
        }
    }

    public static /* synthetic */ void c(g2h g2hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9199d6c", new Object[]{g2hVar});
        } else {
            g2hVar.e();
        }
    }

    public static /* synthetic */ l6t d(g2h g2hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6t) ipChange.ipc$dispatch("313745be", new Object[]{g2hVar});
        }
        return g2hVar.f19701a;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f38477", new Object[]{this});
        } else if (this.f19701a != null) {
            ir9.b("LivePMManager", "[pm埋点] card onDisActive, 取消订阅...");
            this.f19701a.B();
            this.f19701a = null;
        }
    }

    public final boolean f(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c85d3a6f", new Object[]{this, uq9Var})).booleanValue();
        }
        if (uq9Var != null && uq9Var.J() == 2) {
            return true;
        }
        if (!b93.e() || uq9Var == null || uq9Var.Y() == null || uq9Var.Y().g() == null || !sj4.CARD_TYPE_GGLIVESEGMENT.equals(uq9Var.Y().g().cardType)) {
            return false;
        }
        return true;
    }

    public final void g(uq9 uq9Var) {
        MediaContentDetailData g;
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c4e8e2", new Object[]{this, uq9Var});
            return;
        }
        HashMap hashMap = new HashMap();
        a.d Y = uq9Var.Y();
        if (Y != null && (g = Y.g()) != null && (map = g.utPairs) != null) {
            if (uq9Var.J() == 2) {
                str = g.id;
            } else {
                str = g.utPairs.get("live_id");
            }
            hashMap.put("isAD", map.get("is_ad"));
            hashMap.put("livesource", map.get("livesource"));
            hashMap.put("entryLiveSource", map.get("entrylivesource"));
            hashMap.put("trackInfo", map.get("trackInfo"));
            m6t m6tVar = new m6t("tab2LiveCard", true, map.get("liveTopic"), g.id, (Map<String, String>) hashMap);
            m6tVar.g = b93.r();
            ir9.b("LivePMManager", "[pm埋点] card onActive, 开始订阅... liveId=" + str + ",channel=tab2LiveCard,isLiving=true,heartParams=" + hashMap);
            l6t l6tVar = new l6t();
            this.f19701a = l6tVar;
            l6tVar.y(m6tVar);
        }
    }
}
