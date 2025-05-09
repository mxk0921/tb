package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.album.PictureAlbumCard;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v5m extends gr9 implements f9e, fjc, IMediaService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String m = "PlayButtonLayer";
    private static final String n = "PlayButtonLayer";
    private static final int o = 160;
    private static final int p = 160;
    private static final int q = 268;
    private final ici e;
    private final int f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private View k;
    private boolean l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements j0q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.j0q
        public void onSizeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            v5m v5mVar = v5m.this;
            v5m.P(v5mVar, (i - v5m.Q(v5mVar)) / 2);
            v5m v5mVar2 = v5m.this;
            v5m.R(v5mVar2, (i2 - v5m.S(v5mVar2)) / 2);
            v5m v5mVar3 = v5m.this;
            v5m.U(v5mVar3, v5m.T(v5mVar3));
        }
    }

    static {
        t2o.a(468713999);
        t2o.a(468714535);
        t2o.a(468714064);
        t2o.a(468714501);
    }

    public v5m(FluidContext fluidContext, ici iciVar) {
        super(fluidContext, iciVar);
        this.e = iciVar;
        int q2 = pr9.q(160);
        this.f = q2;
        int q3 = pr9.q(160);
        this.g = q3;
        int q4 = pr9.q(268);
        this.h = q4;
        this.i = (pr9.f() - q2) / 2;
        this.j = (p91.b(fluidContext.getContext(), pto.g(fluidContext), fluidContext) - q4) / 2;
        IMediaService iMediaService = (IMediaService) fluidContext.getService(IMediaService.class);
        if (iMediaService != null) {
            iMediaService.setOnStateChangeFromSmallWindowToNormal(this);
            iMediaService.addVideoPlayerListener(this);
        }
        ir9.b("PlayButtonLayer", "PlayButtonLayer 暂停按钮位置。w h x y =( " + q2 + "," + q3 + "," + this.i + "," + this.j + f7l.BRACKET_END_STR);
        IContainerService iContainerService = (IContainerService) fluidContext.getService(IContainerService.class);
        if (iContainerService != null) {
            iContainerService.addSizedChangeListener(new a());
        }
    }

    public static /* synthetic */ int P(v5m v5mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb835290", new Object[]{v5mVar, new Integer(i)})).intValue();
        }
        v5mVar.i = i;
        return i;
    }

    public static /* synthetic */ int Q(v5m v5mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b72f6798", new Object[]{v5mVar})).intValue();
        }
        return v5mVar.f;
    }

    public static /* synthetic */ int R(v5m v5mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b6508ce", new Object[]{v5mVar, new Integer(i)})).intValue();
        }
        v5mVar.j = i;
        return i;
    }

    public static /* synthetic */ int S(v5m v5mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("893ef19a", new Object[]{v5mVar})).intValue();
        }
        return v5mVar.h;
    }

    public static /* synthetic */ View T(v5m v5mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e93f4ea", new Object[]{v5mVar});
        }
        return v5mVar.k;
    }

    public static /* synthetic */ void U(v5m v5mVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab86e289", new Object[]{v5mVar, view});
        } else {
            v5mVar.c0(view);
        }
    }

    public static Map<String, Integer> Y(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da934db3", new Object[]{fluidContext});
        }
        int q2 = pr9.q(160);
        int q3 = pr9.q(160);
        int q4 = pr9.q(268);
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(pr9.o((pr9.f() - q2) / 2)));
        hashMap.put("y", Integer.valueOf(pr9.o((p91.b(fluidContext.getContext(), pto.g(fluidContext), fluidContext) - q4) / 2)));
        hashMap.put("width", Integer.valueOf(pr9.o(q2)));
        hashMap.put("height", Integer.valueOf(pr9.o(q3)));
        return hashMap;
    }

    private void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cac07a", new Object[]{this});
        } else if (this.e.H0() >= 0) {
            if (this.e.H0() == 1) {
                this.e.N0();
                b5w.F(this.e, "clickPause");
                ir9.b("PlayButtonLayer", "Cell ShortVideoCard.onPlayPauseButtonClick clickPause adFlag=" + o83.a(this.e) + ",title=" + o83.b(this.e));
                yre.c(this.e.U(), "3", null, String.valueOf(this.e.M()), null, null);
                xau.i(this.e.U(), a.d.j(this.e.Y()));
            } else if (kgv.INSTANCE.f(this.b)) {
                ir9.b("PlayButtonLayer", "VideoProcess VideoComponentsController.onPlayPauseButtonClick(), UnderageModeHelper 青少年模式时间限制，禁止播放");
            } else {
                this.e.V0(true);
                b5w.F(this.e, "clickPlay");
                ir9.b(prp.TAG, "Cell ShortVideoCard.onPlayPauseButtonClick clickPlay adFlag=" + o83.a(this.e) + ",title=" + o83.b(this.e));
                yre.c(this.b, "4", null, String.valueOf(this.e.M()), null, null);
                xau.j(this.e.U());
            }
        }
    }

    private void c0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f95af3", new Object[]{this, view});
        } else if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = this.f;
            layoutParams.height = this.g;
            layoutParams.leftMargin = this.i;
            layoutParams.topMargin = this.j;
        }
    }

    public static /* synthetic */ Object ipc$super(v5m v5mVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1249298707) {
            super.onDisActive((uq9) objArr[0]);
            return null;
        } else if (hashCode == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/card/cards/video/layer/button/PlayButtonLayer");
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "PlayButtonLayer";
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfaf680f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", OrangeConfig.getInstance().getConfig("ShortVideo", "enableFixPause", "true"));
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a58f956f", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals("true", FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableResumePlay", "true"));
    }

    public View X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("48637f1b", new Object[]{this});
        }
        return this.k;
    }

    public Map<String, Integer> Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e203430", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(pr9.o(this.i)));
        hashMap.put("y", Integer.valueOf(pr9.o(this.j)));
        hashMap.put("width", Integer.valueOf(pr9.o(this.f)));
        hashMap.put("height", Integer.valueOf(pr9.o(this.g)));
        return hashMap;
    }

    public void a0(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21ccdd7", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.e.H0() == 1) {
            this.l = true;
            b0();
            d0(true);
            ici iciVar = this.e;
            if (iciVar instanceof prp) {
                ((prp) iciVar).y1().A0(true);
            }
        } else {
            b0();
            d0(false);
            ici iciVar2 = this.e;
            if (iciVar2 instanceof prp) {
                ((prp) iciVar2).y1().A0(false);
            }
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b207f2", new Object[]{this});
        } else if (this.e.H0() == 1) {
            d0(false);
            ici iciVar = this.e;
            if (iciVar instanceof prp) {
                ((prp) iciVar).y1().A0(false);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService.a
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3036fc9", new Object[]{this});
        } else {
            e0();
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        View findViewById = this.e.W().findViewById(R.id.imv_play_public_pause);
        this.k = findViewById;
        c0(findViewById);
        ir9.b("PlayButtonLayer", "onCreateView, playButtonX = " + this.i + ";playButtonY=" + this.j + " ; mPublicPlayPauseView=" + this.k);
        ici iciVar = this.e;
        if (iciVar instanceof prp) {
            ((prp) iciVar).t1().c().a(this);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        super.onDisActive(uq9Var);
        if (this.k != null) {
            d0(false);
        }
    }

    @Override // tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
        } else {
            e0();
        }
    }

    @Override // tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
            return;
        }
        this.l = false;
        e0();
    }

    @Override // tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
        }
    }

    @Override // tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
        }
    }

    @Override // tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
        }
    }

    @Override // tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
            return;
        }
        this.l = false;
        e0();
    }

    @Override // tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
        }
    }

    @Override // tb.fjc
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2907857", new Object[]{this});
        }
    }

    @Override // tb.fjc
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41b2f79", new Object[]{this});
        } else if (this.e.H0() == 2 && this.k != null) {
            d0(true);
        }
    }

    private void d0(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdb00b3", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("PlayButtonLayer", "setPlayButtonVisibility, visibility = " + z + " ; mPublicPlayPauseView=" + this.k);
        if (z) {
            ici iciVar = this.e;
            if ((iciVar instanceof PictureAlbumCard) && this.k == null) {
                ImageView b = qrp.b(iciVar.R());
                this.k = b;
                c0(b);
                if (this.e.W() instanceof ViewGroup) {
                    ((ViewGroup) this.e.W()).addView(this.k);
                }
            }
        }
        View view = this.k;
        if (view != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onResume() {
        ici iciVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (W() && this.l && (iciVar = this.e) != null && iciVar.H0() > 0 && this.e.H0() != 1 && this.e.h0()) {
            ir9.b("PlayButtonLayer", "onResume -- 前台，主动起播");
            b0();
        }
    }
}
