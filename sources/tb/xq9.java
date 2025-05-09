package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;
import tb.o6d;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uq9 f31542a;
    public final FluidContext b;
    public t19 c;
    public VideoTracker d;
    public boolean e;
    public long f;
    public long g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/fluidcard/FluidCardTrackManager$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            xq9 xq9Var = xq9.this;
            xq9.b(xq9Var, xq9.a(xq9Var).Y(), xq9.a(xq9.this).T().f());
            xq9.c(xq9.this, uq9Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/usertrack/track/ut/card/fluidcard/FluidCardTrackManager$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            s19.c(xq9.a(xq9.this), "destroy");
            s19.g(xq9.a(xq9.this), xq9.a(xq9.this).P());
        }
    }

    static {
        t2o.a(468713597);
    }

    public xq9(FluidContext fluidContext, uq9 uq9Var) {
        this.b = fluidContext;
        this.f31542a = uq9Var;
        l();
        k();
    }

    public static /* synthetic */ uq9 a(xq9 xq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("e31afd0b", new Object[]{xq9Var});
        }
        return xq9Var.f31542a;
    }

    public static /* synthetic */ void b(xq9 xq9Var, a.d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44c317e", new Object[]{xq9Var, dVar, new Integer(i)});
        } else {
            xq9Var.o(dVar, i);
        }
    }

    public static /* synthetic */ void c(xq9 xq9Var, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88a66eb", new Object[]{xq9Var, uq9Var});
        } else {
            xq9Var.s(uq9Var);
        }
    }

    public static HashMap<String, String> i(FluidContext fluidContext, int i, uq9 uq9Var, a.d dVar, String str, String str2, boolean z, boolean z2) {
        Map<String, String> tintAllTrackInfoWithCard;
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a8b31795", new Object[]{fluidContext, new Integer(i), uq9Var, dVar, str, str2, new Boolean(z), new Boolean(z2)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(fluidContext == null || dVar == null)) {
            pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            Map<String, String> thisCardCommonTrack = ((ITrackService) fluidContext.getService(ITrackService.class)).getThisCardCommonTrack(uq9Var);
            ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
            if (thisCardCommonTrack != null) {
                if (z) {
                    xau.Y(fluidContext, thisCardCommonTrack, dVar);
                }
                hashMap.putAll(thisCardCommonTrack);
            }
            HashMap hashMap2 = new HashMap();
            c65.b(fluidContext, hashMap2, dVar);
            c65.c(hashMap2, i);
            c65.a(hashMap, hashMap2);
            hashMap.put("spm", sj4.f28084a);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(xau.PROPERTY_VIDEO_ID, str);
            }
            hashMap.put("taoke_accountId", dVar.d());
            if (j != null && !TextUtils.isEmpty(j.g)) {
                hashMap.put(gat.BIZ_TYPE, j.g);
            }
            String str3 = sessionParams.c;
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(xau.PROPERTY_VIDEO_ID, (Object) str);
            }
            jSONObject.put("feed_id", (Object) str2);
            jSONObject.put("page", (Object) str3);
            hashMap.put(xau.PROPERTY_UCM, jSONObject.toJSONString());
            hashMap.put("page", str3);
            hashMap.put("content_id", str2);
            hashMap.put("platform", "phone");
            if (z2 && (a2 = sessionParams.a()) != null) {
                hashMap.putAll(a2);
            }
            if (!oau.k() && (tintAllTrackInfoWithCard = ((ITrackService) fluidContext.getService(ITrackService.class)).getTintAllTrackInfoWithCard(uq9Var)) != null) {
                hashMap.putAll(tintAllTrackInfoWithCard);
            }
        }
        return hashMap;
    }

    public t19 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19) ipChange.ipc$dispatch("cc711f25", new Object[]{this});
        }
        return this.c;
    }

    public VideoTracker e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoTracker) ipChange.ipc$dispatch("e4d91d12", new Object[]{this});
        }
        return this.d;
    }

    public int f() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e009601", new Object[]{this})).intValue();
        }
        if (pto.d(this.f31542a.U())) {
            ListRenderManager.h offsetPosition = ((IDataService) this.b.getService(IDataService.class)).getOffsetPosition();
            if (offsetPosition != null) {
                i = offsetPosition.a(this.f31542a.Z());
            }
            return this.f31542a.f0().getAdapterPosition() - i;
        }
        ListRenderManager.h offsetPosition2 = ((IDataService) this.b.getService(IDataService.class)).getOffsetPosition();
        if (offsetPosition2 != null) {
            return offsetPosition2.a(this.f31542a.Z());
        }
        return this.f31542a.f0().getAdapterPosition();
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4011c6fa", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbe32815", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a01a8fe", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30a2005", new Object[]{this});
            return;
        }
        ir9.b("FluidCardTrackManager", "FluidCardTrackManager -- addCardLifecycleListener");
        this.f31542a.N().addCardLifecycleListener((wlb.a) new a());
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11a9ee6", new Object[]{this});
        } else {
            ((ILifecycleService) this.b.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new b());
        }
    }

    public void m(t19 t19Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b193939d", new Object[]{this, t19Var});
        } else {
            this.c = t19Var;
        }
    }

    public void n(VideoTracker videoTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821229c", new Object[]{this, videoTracker});
        } else {
            this.d = videoTracker;
        }
    }

    public final void o(a.d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138f7b99", new Object[]{this, dVar, new Integer(i)});
        } else if (dVar != null) {
            int k = com.taobao.android.fluid.framework.data.datamodel.a.k(dVar.g());
            if (k == 1 || k == 3) {
                ryr.b(this.f31542a.W().getContext(), pto.b(this.f31542a.U()), "gg_videoMutiTab_picPlay");
                d5w.s(this.f31542a.U(), 2, i);
                ryr.d(this.f31542a.W().getContext(), pto.b(this.f31542a.U()), "gg_videoMutiTab_picPlay", null);
            } else if (k == 4) {
                ryr.b(this.f31542a.W().getContext(), pto.b(this.f31542a.U()), "gg_videoMutiTab_extendPlay");
                d5w.s(this.f31542a.U(), 4, i);
                ryr.d(this.f31542a.W().getContext(), pto.b(this.f31542a.U()), "gg_videoMutiTab_extendPlay", null);
            }
            com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().w(pto.b(this.f31542a.U()), com.taobao.tao.flexbox.layoutmanager.usertracker.a.FIRST_FRAME_RENDER_FINISH);
        }
    }

    public void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246a8ef2", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public void q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad581cf", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68206852", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void s(uq9 uq9Var) {
        a.d Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77c83ba", new Object[]{this, uq9Var});
        } else if (uq9Var != null && !oau.k() && (Y = uq9Var.Y()) != null) {
            Object e = vt6.e(Y.d, "grayParamsCard");
            if (e instanceof JSONObject) {
                g2e trackTint = ((ITrackService) this.b.getService(ITrackService.class)).getTrackTint();
                for (Map.Entry entry : ((Map) e).entrySet()) {
                    trackTint.c((String) entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
    }
}
