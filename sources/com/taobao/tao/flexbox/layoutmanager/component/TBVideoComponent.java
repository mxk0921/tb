package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.player.IPlayBack;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.ShortVideoQuickOpenManager;
import com.taobao.tao.flexbox.layoutmanager.view.CustomRoundRectFeature;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.RoundedCornerLayout;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.akt;
import tb.anl;
import tb.axk;
import tb.dgw;
import tb.djw;
import tb.g7m;
import tb.gpe;
import tb.hk8;
import tb.jfw;
import tb.nwv;
import tb.od0;
import tb.ogi;
import tb.ol4;
import tb.qtb;
import tb.qv4;
import tb.rbi;
import tb.rv4;
import tb.s6o;
import tb.sj4;
import tb.sz3;
import tb.t2o;
import tb.tep;
import tb.tfs;
import tb.uaa;
import tb.ut2;
import tb.w2w;
import tb.w9w;
import tb.y4w;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBVideoComponent extends Component<RoundedCornerLayout, u> implements com.taobao.tao.flexbox.layoutmanager.core.j, ScrollChangeListener, ol4, w2w, FlatViewGroup.f, FlatViewGroup.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_MUTE_CHANGE = "onMuteClick";
    public static final String MSG_VIDEOSTATE_CHANGE = "onvideostatechanged";
    public static boolean q = true;
    public static final s r = new s(null);
    public djw b;
    public View h;
    public ObjectAnimator i;
    public String j;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f12102a = null;
    public boolean c = true;
    public boolean d = false;
    public String e = null;
    public boolean f = false;
    public boolean g = false;
    public final Runnable k = new j();
    public final Runnable l = new k();
    public final Runnable m = new l();
    public final com.taobao.tao.flexbox.layoutmanager.core.b n = new a();
    public final com.taobao.tao.flexbox.layoutmanager.core.b o = new b();
    public final com.taobao.tao.flexbox.layoutmanager.core.b p = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class PlayerCoverView extends TNodeImageView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int height;
        private Drawable playIcon;
        private int width;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements gpe.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.gpe.b
            public void a(Object obj, Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
                    return;
                }
                PlayerCoverView.access$4102(PlayerCoverView.this, drawable);
                PlayerCoverView.this.invalidate();
            }

            @Override // tb.gpe.b
            public void b(Object obj, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
                    return;
                }
                PlayerCoverView.access$4102(PlayerCoverView.this, null);
                PlayerCoverView.this.invalidate();
            }
        }

        static {
            t2o.a(502268221);
        }

        public PlayerCoverView(Context context) {
            super(context);
        }

        public static /* synthetic */ Drawable access$4102(PlayerCoverView playerCoverView, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("7c692a3d", new Object[]{playerCoverView, drawable});
            }
            playerCoverView.playIcon = drawable;
            return drawable;
        }

        public static /* synthetic */ Object ipc$super(PlayerCoverView playerCoverView, String str, Object... objArr) {
            if (str.hashCode() == -1665133574) {
                super.draw((Canvas) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$PlayerCoverView");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView, com.taobao.uikit.feature.view.TImageView, android.view.View
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                return;
            }
            super.draw(canvas);
            Drawable drawable = this.playIcon;
            if (drawable != null) {
                int width = getWidth();
                int i = this.width;
                int i2 = ((width - i) / 2) + i;
                int height = getHeight();
                int i3 = this.height;
                drawable.setBounds((getWidth() - this.width) / 2, (getHeight() - this.height) / 2, i2, ((height - i3) / 2) + i3);
                this.playIcon.draw(canvas);
            }
        }

        public void setPlayIcon(com.taobao.tao.flexbox.layoutmanager.core.o oVar, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7dd7f056", new Object[]{this, oVar, obj, new Integer(i), new Integer(i2)});
            } else if (obj == null || i <= 0 || i2 <= 0) {
                this.playIcon = null;
                this.height = 0;
                this.width = 0;
            } else {
                this.width = i;
                this.height = i2;
                if (oVar != null) {
                    gpe.f(null, oVar, obj, i, i2, ImageLoader.b.a(), null, false, new a());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class VideoView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TBVideoComponent component;
        private com.taobao.avplayer.r dwInstance;
        private com.taobao.avplayer.c liveInstance;
        private com.taobao.avplayer.s liveInstanceNew;
        private boolean mUpdateLivePlayer;
        private u viewParams;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements qtb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.qtb
            public boolean hook() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e6b1302e", new Object[]{this})).booleanValue();
                }
                if (!(VideoView.access$4200(VideoView.this) == null || TBVideoComponent.N(VideoView.access$4200(VideoView.this)) == null)) {
                    TBVideoComponent.P(VideoView.access$4200(VideoView.this)).onClick(TBVideoComponent.O(VideoView.access$4200(VideoView.this)));
                }
                return true;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TBVideoComponent f12105a;
            public final /* synthetic */ TNodeImageView b;

            public b(TBVideoComponent tBVideoComponent, TNodeImageView tNodeImageView) {
                this.f12105a = tBVideoComponent;
                this.b = tNodeImageView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBVideoComponent.S(this.f12105a);
                VideoView.access$4900(VideoView.this, this.b);
                try {
                    if (!VideoView.access$5000(VideoView.this).L()) {
                        VideoView.access$5400(VideoView.this).V(TBVideoComponent.n(this.f12105a));
                    } else if (VideoView.access$5100(VideoView.this) && VideoView.access$5200(VideoView.this) != null) {
                        VideoView.access$5200(VideoView.this).t(TBVideoComponent.n(this.f12105a));
                    } else if (VideoView.access$5300(VideoView.this) != null) {
                        VideoView.access$5300(VideoView.this).s(TBVideoComponent.n(this.f12105a));
                    }
                } catch (Throwable th) {
                    tfs.d(th.getMessage());
                }
                com.taobao.tao.flexbox.layoutmanager.core.n node = this.f12105a.getNode();
                if (node.H(TBVideoComponent.MSG_MUTE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    if (TBVideoComponent.n(this.f12105a)) {
                        str = "mute";
                    } else {
                        str = "unmute";
                    }
                    hashMap.put("state", str);
                    this.f12105a.sendMessage(node, TBVideoComponent.MSG_MUTE_CHANGE, null, hashMap, null);
                }
            }
        }

        static {
            t2o.a(502268226);
        }

        public VideoView(Context context) {
            super(context);
            this.mUpdateLivePlayer = true;
            this.mUpdateLivePlayer = akt.p2("tnode_update_live_player", true);
        }

        public static /* synthetic */ TBVideoComponent access$4200(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBVideoComponent) ipChange.ipc$dispatch("e965d63b", new Object[]{videoView});
            }
            return videoView.component;
        }

        public static /* synthetic */ void access$4900(VideoView videoView, TNodeImageView tNodeImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("100b8a32", new Object[]{videoView, tNodeImageView});
            } else {
                videoView.setMuteImage(tNodeImageView);
            }
        }

        public static /* synthetic */ u access$5000(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u) ipChange.ipc$dispatch("43a1235c", new Object[]{videoView});
            }
            return videoView.viewParams;
        }

        public static /* synthetic */ boolean access$5100(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3b123fb", new Object[]{videoView})).booleanValue();
            }
            return videoView.mUpdateLivePlayer;
        }

        public static /* synthetic */ com.taobao.avplayer.s access$5200(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.s) ipChange.ipc$dispatch("80ccab85", new Object[]{videoView});
            }
            return videoView.liveInstanceNew;
        }

        public static /* synthetic */ com.taobao.avplayer.c access$5300(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.c) ipChange.ipc$dispatch("25308e8", new Object[]{videoView});
            }
            return videoView.liveInstance;
        }

        public static /* synthetic */ com.taobao.avplayer.r access$5400(VideoView videoView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.r) ipChange.ipc$dispatch("eb923223", new Object[]{videoView});
            }
            return videoView.dwInstance;
        }

        public static /* synthetic */ Object ipc$super(VideoView videoView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$VideoView");
        }

        private void setMuteImage(TNodeImageView tNodeImageView) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe382cb", new Object[]{this, tNodeImageView});
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.o P = TBVideoComponent.Q(this.component).P();
            if (TBVideoComponent.n(this.component)) {
                obj = this.viewParams.W0;
            } else {
                obj = this.viewParams.X0;
            }
            u uVar = this.viewParams;
            tNodeImageView.setImageSrc(P, obj, uVar.Q0, uVar.R0, ImageLoader.b.a(), null, false);
        }

        public void attachVideoView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5e7d990", new Object[]{this, view});
            } else {
                this.component.Z(view);
            }
        }

        public FrameLayout.LayoutParams createMuteIconLayoutParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("6a7f8f8e", new Object[]{this});
            }
            u uVar = this.viewParams;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uVar.Q0, uVar.R0);
            layoutParams.gravity = 0;
            u uVar2 = this.viewParams;
            int i = uVar2.S0;
            if (i >= 0) {
                layoutParams.leftMargin = i;
                layoutParams.gravity = 3;
            }
            int i2 = uVar2.T0;
            if (i2 >= 0) {
                layoutParams.topMargin = i2;
                layoutParams.gravity |= 48;
            }
            int i3 = uVar2.U0;
            if (i3 >= 0) {
                layoutParams.rightMargin = i3;
                layoutParams.gravity |= 5;
            }
            int i4 = uVar2.V0;
            if (i4 >= 0) {
                layoutParams.bottomMargin = i4;
                layoutParams.gravity |= 80;
            }
            return layoutParams;
        }

        public com.taobao.avplayer.r getDwInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.r) ipChange.ipc$dispatch("dcbf7994", new Object[]{this});
            }
            return this.dwInstance;
        }

        public com.taobao.avplayer.c getLiveDWInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.c) ipChange.ipc$dispatch("caabeaec", new Object[]{this});
            }
            return this.liveInstance;
        }

        public com.taobao.avplayer.s getLiveInstanceNew() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.avplayer.s) ipChange.ipc$dispatch("f08d1fcb", new Object[]{this});
            }
            return this.liveInstanceNew;
        }

        public u getVideoParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u) ipChange.ipc$dispatch("847b9536", new Object[]{this});
            }
            return this.viewParams;
        }

        public void hideCoverView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("964a6361", new Object[]{this});
            } else {
                TBVideoComponent.U(this.component);
            }
        }

        public boolean isMute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
            }
            TBVideoComponent tBVideoComponent = this.component;
            if (tBVideoComponent != null) {
                return TBVideoComponent.n(tBVideoComponent);
            }
            return TBVideoComponent.q;
        }

        public void setDwInstance(com.taobao.avplayer.r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33896a2e", new Object[]{this, rVar});
                return;
            }
            this.dwInstance = rVar;
            rVar.C0(new a());
            addView(rVar.K(), new FrameLayout.LayoutParams(-1, -1));
        }

        public void setLiveDwInstance(com.taobao.avplayer.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f554644", new Object[]{this, cVar});
                return;
            }
            this.liveInstance = cVar;
            addView(cVar.p(), new FrameLayout.LayoutParams(-1, -1));
        }

        public void setLiveInstanceNew(com.taobao.avplayer.s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a74cb049", new Object[]{this, sVar});
                return;
            }
            this.liveInstanceNew = sVar;
            addView(sVar.o(), new FrameLayout.LayoutParams(-1, -1));
        }

        public void setMuteInfo(TBVideoComponent tBVideoComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffec9546", new Object[]{this, tBVideoComponent});
                return;
            }
            this.component = tBVideoComponent;
            u uVar = (u) TBVideoComponent.R(tBVideoComponent);
            this.viewParams = uVar;
            if (uVar.W0 != null && uVar.X0 != null) {
                TNodeImageView f = ut2.f(getContext());
                f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                setMuteImage(f);
                f.setOnClickListener(new b(tBVideoComponent, f));
                addView(f, createMuteIconLayoutParams());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends b.b0<RoundedCornerLayout, u> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$10");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, RoundedCornerLayout roundedCornerLayout, u uVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("509415bd", new Object[]{this, eVar, roundedCornerLayout, uVar, fVar});
            } else if (TBVideoComponent.t(TBVideoComponent.this) != null && !nwv.i(uVar.y0, ((TNodeImageView) TBVideoComponent.t(TBVideoComponent.this)).getImageSrc())) {
                ((TNodeImageView) TBVideoComponent.t(TBVideoComponent.this)).loadImageIfInSlowScroll(TBVideoComponent.u(TBVideoComponent.this));
                ((TNodeImageView) TBVideoComponent.t(TBVideoComponent.this)).setImageSrc(TBVideoComponent.v(TBVideoComponent.this).P(), uVar.y0, TBVideoComponent.w(TBVideoComponent.this).f27261a, TBVideoComponent.x(TBVideoComponent.this).b, ImageLoader.b.f(ImageLoader.Scene.VIDEO_COVER, TBVideoComponent.y(TBVideoComponent.this), uVar.p1), null, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends b.b0<RoundedCornerLayout, u> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$11");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, RoundedCornerLayout roundedCornerLayout, u uVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("509415bd", new Object[]{this, eVar, roundedCornerLayout, uVar, fVar});
            } else if (uVar.t1) {
                TBVideoComponent.C(TBVideoComponent.this, true);
            } else {
                TBVideoComponent.W(TBVideoComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends b.b0<RoundedCornerLayout, u> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$12");
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.b
        public String[] g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("55f1bbd6", new Object[]{this});
            }
            return new String[]{"videoId", "videoUrl", "liveId", yj4.PARAM_MEDIA_INFO_LIVEURL};
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, RoundedCornerLayout roundedCornerLayout, u uVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("509415bd", new Object[]{this, eVar, roundedCornerLayout, uVar, fVar});
                return;
            }
            TBVideoComponent.C(TBVideoComponent.this, false);
            TBVideoComponent.W(TBVideoComponent.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((((u) TBVideoComponent.z(TBVideoComponent.this)).b0 <= 0 || currentTimeMillis - TBVideoComponent.A(TBVideoComponent.this) >= ((u) TBVideoComponent.B(TBVideoComponent.this)).b0) && uaa.e().c(TBVideoComponent.this.getNode())) {
                TBVideoComponent.D(TBVideoComponent.this, view);
                TBVideoComponent.E(TBVideoComponent.this, currentTimeMillis);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else if (TBVideoComponent.F(TBVideoComponent.this) != null) {
                TBVideoComponent tBVideoComponent = TBVideoComponent.this;
                tBVideoComponent.updateAPMToken(TBVideoComponent.G(tBVideoComponent), dgw.APM_VIEW_VALID);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements g7m.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public void a(g7m.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc968837", new Object[]{this, cVar});
                return;
            }
            TBVideoComponent tBVideoComponent = TBVideoComponent.this;
            tBVideoComponent.updateAPMToken(TBVideoComponent.H(tBVideoComponent), dgw.APM_VIEW_VALID);
            com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.c().h(cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12109a;

        public g(View view) {
            this.f12109a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f12109a.bringToFront();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Component f12110a;

        public h(Component component) {
            this.f12110a = component;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBVideoComponent.J().k(1, this.f12110a, ((u) TBVideoComponent.I(TBVideoComponent.this)).v1 ? 1 : 0, TBVideoComponent.this.u0() ? 1 : 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TBVideoComponent.W(TBVideoComponent.this);
                }
            }
        }

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBVideoComponent.K(TBVideoComponent.this).P().n1(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TBVideoComponent.h(TBVideoComponent.this) == null || !((u) TBVideoComponent.r(TBVideoComponent.this)).g1) {
                TBVideoComponent.this.M0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBVideoComponent.this.M0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBVideoComponent.C(TBVideoComponent.this, false);
            if (((u) TBVideoComponent.L(TBVideoComponent.this)).w1) {
                List<com.taobao.tao.flexbox.layoutmanager.core.n> i = g7m.o().i(TBVideoComponent.T(TBVideoComponent.this), TBVideoComponent.this.u0());
                for (int i2 = 0; i2 < i.size(); i2++) {
                    if (TBVideoComponent.this.q0().equals(((TBVideoComponent) i.get(i2).K()).q0())) {
                        if (i2 < i.size() - 1) {
                            ((TBVideoComponent) i.get(i2 + 1).K()).M0();
                        } else {
                            TBVideoComponent.V(TBVideoComponent.this, i);
                            ((TBVideoComponent) i.get(0).K()).M0();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBVideoComponent.W(TBVideoComponent.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            } else {
                TBVideoComponent.j(TBVideoComponent.this, false);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else {
                TBVideoComponent.j(TBVideoComponent.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageLoader.e f12118a;

        public o(TBVideoComponent tBVideoComponent, ImageLoader.e eVar) {
            this.f12118a = eVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            } else {
                this.f12118a.onImageLoadFailed();
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
            } else {
                this.f12118a.onImageLoaded(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rv4 f12119a;

        public p(rv4 rv4Var) {
            this.f12119a = rv4Var;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            } else {
                tfs.c("AVSDK_TBVideoComponentSharePlayer", "下载首帧失败");
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                return;
            }
            if (!akt.J()) {
                this.f12119a.x(bitmapDrawable);
            } else if (TextUtils.isEmpty(TBVideoComponent.k(TBVideoComponent.this))) {
                this.f12119a.z(TBVideoComponent.l(TBVideoComponent.this));
            } else {
                this.f12119a.z(TBVideoComponent.k(TBVideoComponent.this));
            }
            tfs.c("AVSDK_TBVideoComponentSharePlayer", "下载首帧");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class q implements g7m.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12120a;
        public final /* synthetic */ rv4 b;
        public final /* synthetic */ String c;

        public q(boolean z, rv4 rv4Var, String str) {
            this.f12120a = z;
            this.b = rv4Var;
            this.c = str;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53c68a7a", new Object[]{this, new Boolean(z)});
                return;
            }
            tfs.c("AVSDK_TBVideoComponentSharePlayer", "firstFrameRender 双列流首帧是否渲染完成：isRender：" + z);
            this.b.y(z);
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("551f224f", new Object[]{this, str});
            }
        }

        public void a(com.taobao.avplayer.r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19fb2f0", new Object[]{this, rVar});
            } else if (rVar != null && this.f12120a) {
                u uVar = (u) TBVideoComponent.m(TBVideoComponent.this);
                if (TBVideoComponent.this.A0(uVar)) {
                    this.b.C(TBVideoComponent.n(TBVideoComponent.this));
                } else {
                    this.b.C(uVar.L0);
                }
                this.b.I(TBVideoComponent.this.q0());
                this.b.F(true);
                this.b.B(rVar);
                this.b.I(TBVideoComponent.this.q0());
                this.b.D(true);
                if (VideoControllerManager.o((u) TBVideoComponent.o(TBVideoComponent.this))) {
                    TBVideoComponent.p(TBVideoComponent.this, this.b, true);
                }
                TBVideoComponent tBVideoComponent = TBVideoComponent.this;
                TBVideoComponent.s(tBVideoComponent, this.b, this.c, ((u) TBVideoComponent.q(tBVideoComponent)).Z0);
                tfs.c("AVSDK_TBVideoComponentSharePlayer", "视频创建好dw实例，未起播视频 给coverObject赋值");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class r implements ImageLoader.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rv4 f12121a;
        public final /* synthetic */ String b;

        public r(TBVideoComponent tBVideoComponent, rv4 rv4Var, String str) {
            this.f12121a = rv4Var;
            this.b = str;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoadFailed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3feabda6", new Object[]{this});
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.e
        public void onImageLoaded(BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                return;
            }
            this.f12121a.x(bitmapDrawable);
            tfs.c("AVSDK_TBVideoComponentSharePlayer", "coverImageForNoPlayVideo，coverImageUrl为null，resourceStr不为null，设置首帧,coverUrl:" + this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable f12124a;
        public final int b;
        public final String c;
        public final String d;

        static {
            t2o.a(502268225);
        }

        public t(Drawable drawable, int i, String str, String str2) {
            this.f12124a = drawable;
            this.b = i;
            this.c = str;
            this.d = str2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class u extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String A0;
        public int B0;
        public int C0;
        public String D0;
        public String F0;
        public HashMap<String, String> G0;
        public Object N0;
        public int O0;
        public int P0;
        public int Q0;
        public int R0;
        public Object W0;
        public Object X0;
        public String Y0;
        public String Z0;
        public String a1;
        public String b1;
        public String i1;
        public String j1;
        public String k1;
        public String o1;
        public boolean q1;
        public String w0;
        public String x0;
        public float x1;
        public Object y0;
        public float y1;
        public String z0;
        public long E0 = -1;
        public boolean H0 = false;
        public boolean I0 = false;
        public boolean J0 = false;
        public boolean K0 = false;
        public boolean L0 = true;
        public String M0 = "center_crop";
        public int S0 = -1;
        public int T0 = -1;
        public int U0 = -1;
        public int V0 = -1;
        public boolean c1 = false;
        public boolean d1 = false;
        public boolean e1 = false;
        public int f1 = 0;
        public boolean g1 = false;
        public boolean h1 = false;
        public long l1 = Long.MAX_VALUE;
        public boolean m1 = false;
        public int n1 = 0;
        public int p1 = 2;
        public boolean r1 = false;
        public boolean s1 = true;
        public boolean t1 = false;
        public boolean u1 = false;
        public boolean v1 = g7m.k;
        public boolean w1 = false;

        static {
            t2o.a(502268229);
        }

        public u() {
            float f = g7m.l;
            this.x1 = 1.0f - f;
            this.y1 = 1.0f - f;
        }

        public static /* synthetic */ float I(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b309b479", new Object[]{uVar})).floatValue();
            }
            return uVar.x1;
        }

        public static /* synthetic */ float J(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1564cb58", new Object[]{uVar})).floatValue();
            }
            return uVar.y1;
        }

        public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$VideoViewParams");
        }

        public final HashMap<String, String> K(Map map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("3c177d49", new Object[]{this, map});
            }
            if (map == null) {
                return null;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    str = value.toString();
                } else {
                    str = null;
                }
                if (str != null) {
                    hashMap.put(entry.getKey().toString(), str);
                }
            }
            return hashMap;
        }

        public boolean L() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("252586c1", new Object[]{this})).booleanValue();
            }
            return "live".equals(this.w0);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:166:0x0324, code lost:
            if (r10.equals("prefetchVideo") == false) goto L_0x0027;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r9, java.lang.String r10, java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 1704
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.u.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    static {
        t2o.a(502268200);
        t2o.a(503317092);
        t2o.a(503317321);
        t2o.a(503317030);
        t2o.a(503317523);
        t2o.a(503317460);
        t2o.a(503317459);
    }

    public static /* synthetic */ long A(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f3d23d", new Object[]{tBVideoComponent})).longValue();
        }
        return tBVideoComponent.clickTimeStamp;
    }

    public static /* synthetic */ jfw B(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("d782a8cb", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void C(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaf4818", new Object[]{tBVideoComponent, new Boolean(z)});
        } else {
            tBVideoComponent.b0(z);
        }
    }

    public static /* synthetic */ void D(TBVideoComponent tBVideoComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59be1140", new Object[]{tBVideoComponent, view});
        } else {
            tBVideoComponent.I0(view);
        }
    }

    public static /* synthetic */ long E(TBVideoComponent tBVideoComponent, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3fbfc29", new Object[]{tBVideoComponent, new Long(j2)})).longValue();
        }
        tBVideoComponent.clickTimeStamp = j2;
        return j2;
    }

    public static /* synthetic */ View F(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bfd3052", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.view;
    }

    public static /* synthetic */ View G(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("53ee0b71", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.view;
    }

    public static /* synthetic */ View H(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8bdee690", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.view;
    }

    public static /* synthetic */ jfw I(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("38e0d326", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ s J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("f5707893", new Object[0]);
        }
        return r;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n K(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("6b192e2b", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.node;
    }

    public static /* synthetic */ jfw L(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("818cf7f8", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ jfw M(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("cf875ac0", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ View.OnClickListener N(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("9ac6cf59", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.clickListener;
    }

    public static /* synthetic */ View O(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52096f51", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.view;
    }

    public static /* synthetic */ View.OnClickListener P(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("75a04997", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.clickListener;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n Q(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("db551e8f", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.node;
    }

    public static /* synthetic */ jfw R(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("5a8cce07", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void S(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980ba04b", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.P0();
        }
    }

    public static /* synthetic */ Component T(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("c5aa2af5", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.p0();
    }

    public static /* synthetic */ void U(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83768af", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.s0();
        }
    }

    public static /* synthetic */ void V(TBVideoComponent tBVideoComponent, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66738bca", new Object[]{tBVideoComponent, list});
        } else {
            tBVideoComponent.O0(list);
        }
    }

    public static /* synthetic */ void W(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77285b8", new Object[]{tBVideoComponent});
        } else {
            tBVideoComponent.V0();
        }
    }

    public static /* synthetic */ jfw h(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("21660fb5", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ boolean i(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8c2df89", new Object[]{tBVideoComponent, new Boolean(z)})).booleanValue();
        }
        return tBVideoComponent.c0(z);
    }

    public static boolean i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62cc0458", new Object[0])).booleanValue();
        }
        return akt.p2("fixVideoRecycle", true);
    }

    public static /* synthetic */ Object ipc$super(TBVideoComponent tBVideoComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -767938565:
                return super.getAttributeHandler((String) objArr[0]);
            case -703216504:
                super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1446611556:
                super.bindEvent();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent");
        }
    }

    public static /* synthetic */ boolean j(TBVideoComponent tBVideoComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36262d0c", new Object[]{tBVideoComponent, new Boolean(z)})).booleanValue();
        }
        tBVideoComponent.d = z;
        return z;
    }

    public static /* synthetic */ String k(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7a62953", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.j;
    }

    public static /* synthetic */ String l(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0adee54", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.n0();
    }

    public static /* synthetic */ jfw m(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("20676868", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ boolean n(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e52818e", new Object[]{tBVideoComponent})).booleanValue();
        }
        return tBVideoComponent.z0();
    }

    public static /* synthetic */ jfw o(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("b5d6adea", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void p(TBVideoComponent tBVideoComponent, rv4 rv4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cda5bca", new Object[]{tBVideoComponent, rv4Var, new Boolean(z)});
        } else {
            tBVideoComponent.S0(rv4Var, z);
        }
    }

    public static /* synthetic */ jfw q(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("4b45f36c", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ jfw r(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("ec1db276", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public static /* synthetic */ void s(TBVideoComponent tBVideoComponent, rv4 rv4Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee93a7", new Object[]{tBVideoComponent, rv4Var, str, str2});
        } else {
            tBVideoComponent.e0(rv4Var, str, str2);
        }
    }

    public static /* synthetic */ View t(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1de1cc72", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.h;
    }

    public static /* synthetic */ boolean u(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc339513", new Object[]{tBVideoComponent})).booleanValue();
        }
        return tBVideoComponent.v0();
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n v(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("9fee8bf0", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.node;
    }

    public static /* synthetic */ rbi w(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("37181aea", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.measureResult;
    }

    public static /* synthetic */ rbi x(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbi) ipChange.ipc$dispatch("25aaa6c9", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.measureResult;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.n y(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("be3e1c8d", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.node;
    }

    public static /* synthetic */ jfw z(TBVideoComponent tBVideoComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("42136349", new Object[]{tBVideoComponent});
        }
        return tBVideoComponent.viewParams;
    }

    public boolean A0(u uVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7142e58e", new Object[]{this, uVar})).booleanValue();
        }
        Object obj = uVar.X0;
        if (obj == null || uVar.W0 == null) {
            z = false;
            z2 = false;
        } else {
            if (obj instanceof String) {
                z2 = !TextUtils.isEmpty((String) obj);
            } else {
                z2 = true;
            }
            Object obj2 = uVar.W0;
            if (obj2 instanceof String) {
                z = !TextUtils.isEmpty((String) obj2);
            } else {
                z = true;
            }
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e96b", new Object[]{this})).booleanValue();
        }
        if (this.view == 0 || !u0() || isHalfHide()) {
            return false;
        }
        return true;
    }

    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("904410ae", new Object[]{this})).booleanValue();
        }
        if (this.view == 0 || isHalfHide()) {
            return false;
        }
        return true;
    }

    public final void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88d092a", new Object[]{this});
        } else if (!this.d) {
            this.d = true;
            E0(new n());
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aef5ce6", new Object[]{this});
        } else {
            L0();
        }
    }

    public final void G0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c32bb3ee", new Object[]{this, new Boolean(z)});
        } else {
            W0(z);
        }
    }

    public final boolean H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef7cf5", new Object[]{this})).booleanValue();
        }
        if (((RoundedCornerLayout) this.view).getWidth() > ((RoundedCornerLayout) this.view).getHeight()) {
            P p2 = this.viewParams;
            if (((u) p2).B0 > ((u) p2).C0) {
                return false;
            }
        }
        if (((RoundedCornerLayout) this.view).getWidth() < ((RoundedCornerLayout) this.view).getHeight()) {
            P p3 = this.viewParams;
            if (((u) p3).B0 < ((u) p3).C0) {
                return false;
            }
        }
        return true;
    }

    public final void J0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18ad723", new Object[]{this, new Integer(i2)});
            return;
        }
        if (this.view != 0 && (isHalfHide() || ((u) this.viewParams).v1)) {
            b0(false);
        }
        Component p0 = p0();
        if (i2 == 0 && p0 != null && p0.getView() != null) {
            P p2 = this.viewParams;
            if (p2 == 0 || !((u) p2).g1) {
                g7m.o().c(true);
            } else {
                tfs.e("TBVideoComponent", "manualControl场景不销毁播放器");
            }
            if (g7m.o().A() || c0(true)) {
                Q0();
            }
        }
    }

    public final void K0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef94f8", new Object[]{this, new Integer(i2)});
            return;
        }
        Component p0 = p0();
        if (p0 != null && (p0 instanceof ListViewComponent) && p0.getView() != null) {
            if (i2 == 0) {
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.c().i(this);
            } else {
                com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.c().j();
            }
        }
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        boolean x0 = x0();
        if (!this.f || !x0) {
            s sVar = r;
            sVar.h(this.k);
            if (g7m.o().D(q0())) {
                sVar.i(null);
                g7m.o().H(q0());
            } else if (g7m.o().E()) {
                this.g = false;
            }
        } else {
            this.g = false;
        }
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        g7m.o().P(new f());
        if (((u) this.viewParams).q1) {
            this.g = false;
        } else {
            this.g = true;
        }
        boolean x0 = x0();
        g7m o2 = g7m.o();
        Context N = this.node.N();
        rbi rbiVar = this.measureResult;
        if (o2.I(this, N, rbiVar.f27261a, rbiVar.b, q0(), true, ((u) this.viewParams).J0, x0, this.f) && ((u) this.viewParams).L()) {
            long j2 = ((u) this.viewParams).l1;
            if (j2 != Long.MAX_VALUE && j2 > 0) {
                s sVar = r;
                sVar.h(this.m);
                sVar.g(this.m, ((u) this.viewParams).l1);
            }
        }
    }

    public final boolean N0() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ee34082", new Object[]{this})).booleanValue();
        }
        s sVar = r;
        boolean d2 = sVar.d();
        if ((g7m.o().A() || g7m.o().z() || c0(true)) && u0() && this.view != 0 && !((u) this.viewParams).t1 && !isHalfHide()) {
            z = true;
        }
        if (!z) {
            return z;
        }
        if (!((u) this.viewParams).q1 || !akt.T()) {
            return z & (true ^ d2);
        }
        sVar.i(null);
        return z;
    }

    public final void O0(List<com.taobao.tao.flexbox.layoutmanager.core.n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0af58f", new Object[]{this, list});
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((TBVideoComponent) list.get(i2).K()).g = false;
        }
    }

    public final void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db10d722", new Object[]{this});
            return;
        }
        P p2 = this.viewParams;
        if (((u) p2).r1) {
            if (this.f12102a == null) {
                this.f12102a = Boolean.valueOf(((u) p2).s1);
            }
            this.f12102a = Boolean.valueOf(true ^ this.f12102a.booleanValue());
            return;
        }
        q = true ^ q;
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c82c5ff", new Object[]{this});
            return;
        }
        Component p0 = p0();
        r.j(1, p0);
        nwv.y0(new h(p0));
    }

    public final void R0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47de683", new Object[]{this, view});
            return;
        }
        if (view instanceof TNodeImageView) {
            ((TNodeImageView) view).loadImageIfInSlowScroll(v0());
        }
        if (isContainerInIdle()) {
            D0();
        }
    }

    public final void S0(rv4 rv4Var, boolean z) {
        g7m.c cVar;
        org.json.JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1341cbc0", new Object[]{this, rv4Var, new Boolean(z)});
        } else if ((g7m.o().C(q0()) || z) && (cVar = g7m.o().k().get(q0())) != null) {
            IPlayBack iPlayBack = cVar.f19774a;
            if ((iPlayBack instanceof w9w) && (jSONObject = ((w9w) iPlayBack).k) != null) {
                rv4Var.v(jSONObject.toString());
            }
        }
    }

    public final void T0(rv4 rv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32158923", new Object[]{this, rv4Var});
        } else if (!((u) this.viewParams).u1 || !H0()) {
            rv4Var.K(((RoundedCornerLayout) this.view).getWidth());
            rv4Var.A(((RoundedCornerLayout) this.view).getHeight());
            rv4Var.G(false);
            tfs.d("AVSDK_TBVideoComponentSharePlayer，无需旋转");
        } else {
            rv4Var.K(((u) this.viewParams).C0);
            rv4Var.A(((u) this.viewParams).B0);
            rv4Var.G(true);
            tfs.d("AVSDK_TBVideoComponentSharePlayer，手动旋转");
        }
    }

    public void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0acd86", new Object[]{this});
        } else if (akt.f2() && this.h != null) {
            ObjectAnimator objectAnimator = this.i;
            if (objectAnimator != null) {
                objectAnimator.end();
            }
            this.h.setAlpha(1.0f);
        }
    }

    public final void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b49bb68", new Object[]{this});
        } else if (N0()) {
            if (!g7m.o().F(this.node.N())) {
                s sVar = r;
                sVar.h(this.k);
                sVar.g(this.k, 0L);
            } else if (!g7m.o().M(q0())) {
                s sVar2 = r;
                sVar2.h(this.k);
                sVar2.g(this.k, 0L);
            }
            this.f = false;
        }
    }

    public final void W0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a38934", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean x0 = x0();
        if (!this.f || !x0) {
            s sVar = r;
            sVar.h(this.k);
            if (g7m.o().D(q0())) {
                sVar.i(null);
                g7m.o().g(z, q0());
            }
        }
    }

    /* renamed from: X */
    public void applyAttrForView(RoundedCornerLayout roundedCornerLayout, u uVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90632c63", new Object[]{this, roundedCornerLayout, uVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(roundedCornerLayout, uVar, map, z);
        if (((RoundedCornerLayout) this.view).getChildCount() == 0) {
            this.h = Y();
            b0(false);
        }
    }

    public void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2462271f", new Object[]{this});
            return;
        }
        tfs.e(sj4.VIDEO_ACTION_TYPE_SHAREPLAYER, "设置回调引用为null");
        g7m.o().O(null);
    }

    public final View Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9f283814", new Object[]{this});
        }
        View k0 = k0();
        if (isContainerInIdle()) {
            D0();
        }
        ((RoundedCornerLayout) this.view).addView(k0, new FrameLayout.LayoutParams(-1, -1));
        return k0;
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b532596e", new Object[]{this});
        } else if (akt.C0() && ((HashMap) ShortVideoQuickOpenManager.b).containsKey(((u) this.viewParams).Y0) && System.currentTimeMillis() - ShortVideoQuickOpenManager.f12351a > 5000) {
            try {
                ShortVideoQuickOpenManager.f12351a = System.currentTimeMillis();
                ShortVideoQuickOpenManager.a(new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.19
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        } else {
                            tfs.e("TBVideoComponent", "updateVideoQuickOpenConfig failed");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        try {
                            g7m.o().N(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject((String) ((HashMap) ShortVideoQuickOpenManager.b).get(((u) TBVideoComponent.M(TBVideoComponent.this)).Y0)));
                        } catch (Throwable th) {
                            tfs.e("TBVideoComponent", "updateVideoQuickOpenConfig failed" + th.getMessage());
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        } else {
                            tfs.e("TBVideoComponent", "updateVideoQuickOpenConfig failed");
                        }
                    }
                });
            } catch (Throwable th) {
                tfs.e("TBVideoComponent", "updateVideoQuickOpenConfig failed" + th.getMessage());
            }
        }
    }

    public void Z(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7d990", new Object[]{this, view});
        } else if (view != null && this.view != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            rbi rbiVar = this.measureResult;
            try {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rbiVar.f27261a, rbiVar.b);
                if (akt.f2()) {
                    if (((RoundedCornerLayout) this.view).getChildCount() >= 1) {
                        V v = this.view;
                        ((RoundedCornerLayout) v).addView(view, ((RoundedCornerLayout) v).getChildCount() - 1, layoutParams);
                    }
                } else if (!((u) this.viewParams).L() || !g7m.o().j()) {
                    ((RoundedCornerLayout) this.view).addView(view, layoutParams);
                } else {
                    ((RoundedCornerLayout) this.view).addView(view, 0, layoutParams);
                    nwv.A0(new g(view), 250L);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b20a8f", new Object[]{this});
        } else if (!((u) this.viewParams).g1) {
            L0();
        }
    }

    public final void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eee6197", new Object[]{this, new Boolean(z)});
            return;
        }
        P p2 = this.viewParams;
        if (p2 == 0 || !((u) p2).g1) {
            W0(z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
            return;
        }
        super.bindEvent();
        View.OnClickListener onClickListener = this.clickListener;
        d dVar = new d();
        setComponentClickListener(dVar);
        if (this.touchListener == null && onClickListener != null) {
            ((RoundedCornerLayout) this.view).setOnClickListener(dVar);
        }
    }

    @Override // tb.w2w
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7bea48f", new Object[]{this});
        }
    }

    public final boolean c0(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daed21c2", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Iterator<Map.Entry<String, g7m.c>> it = g7m.o().k().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Map.Entry<String, g7m.c> next = it.next();
            if (next.getValue() != null && next.getValue().b != null && next.getValue().b.getViewParams().q1) {
                z2 = true;
                break;
            }
        }
        P p2 = this.viewParams;
        if (((u) p2).q1 != z2) {
            if (((u) p2).q1) {
                return true;
            }
            return false;
        } else if (((u) p2).q1) {
            return false;
        } else {
            return !z;
        }
    }

    @Override // tb.w2w
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d695bb4", new Object[]{this});
        } else {
            R0(l0());
        }
    }

    public boolean d0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a87702f", new Object[]{this, obj})).booleanValue();
        }
        I0(this.view);
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        W0(false);
        djw djwVar = this.b;
        if (djwVar != null) {
            djwVar.b();
        }
        V v = this.view;
        if (v != 0) {
            ((RoundedCornerLayout) v).removeSizeChangedCallback(this);
            ((RoundedCornerLayout) this.view).removeVisibilityChangedCallback(this);
            for (int childCount = ((RoundedCornerLayout) this.view).getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = ((RoundedCornerLayout) this.view).getChildAt(childCount);
                if (childAt instanceof PlayerCoverView) {
                    PlayerCoverView playerCoverView = (PlayerCoverView) childAt;
                    playerCoverView.cancel();
                    y4w.c(playerCoverView);
                    ((TNodeImageView) childAt).removeFeature(CustomRoundRectFeature.class);
                } else if (childAt instanceof RoundedCornerLayout) {
                    ut2.x((RoundedCornerLayout) childAt);
                }
            }
            ut2.x((RoundedCornerLayout) this.view);
        }
        super.detach(z);
    }

    public final void e0(rv4 rv4Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8967e", new Object[]{this, rv4Var, str, str2});
        } else if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String string = new org.json.JSONObject(str2).getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
                if (!TextUtils.isEmpty(string)) {
                    od0.D().a().e(this.node.N(), string, -1, -1, new r(this, rv4Var, string));
                }
            } catch (Throwable unused) {
                tfs.e(sj4.VIDEO_ACTION_TYPE_SHAREPLAYER, "sharePlayerForFollow json 解析异常");
            }
        }
    }

    public void f0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30a4ade", new Object[]{this, view});
            return;
        }
        U0();
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    @Override // tb.w2w
    public void g(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a47724", new Object[]{this, new Integer(i2)});
        }
    }

    public final com.taobao.tao.flexbox.layoutmanager.core.n g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.n) ipChange.ipc$dispatch("f0f3e3de", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.n nVar = this.node;
        do {
            nVar = nVar.Y();
            if (nVar == null) {
                return null;
            }
        } while (nVar.H("onclick") == null);
        return nVar;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.b getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.b) ipChange.ipc$dispatch("d23a2ffb", new Object[]{this, str});
        }
        if ("cover".equals(str)) {
            return this.n;
        }
        if ("forceInvisible".equals(str)) {
            return this.o;
        }
        if ("videoId".equals(str) || "videoUrl".equals(str) || "liveId".equals(str) || yj4.PARAM_MEDIA_INFO_LIVEURL.equals(str)) {
            return this.p;
        }
        return super.getAttributeHandler(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public Component.k getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component.k) ipChange.ipc$dispatch("c0d56852", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        if (g7m.o().D(q0())) {
            g7m.o().H(q0());
        }
        t m0 = m0(true);
        if (m0 == null || !(m0.f12124a instanceof BitmapDrawable)) {
            return null;
        }
        Component.k kVar = new Component.k();
        kVar.f12192a = m0.d;
        kVar.b = nwv.x(this.view);
        kVar.c = ((BitmapDrawable) m0.f12124a).getBitmap();
        return kVar;
    }

    public final TextureView h0(ViewGroup viewGroup) {
        TextureView h0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextureView) ipChange.ipc$dispatch("4d19f8c2", new Object[]{this, viewGroup});
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (h0 = h0((ViewGroup) childAt)) != null) {
                return h0;
            }
        }
        return null;
    }

    public final boolean isContainerInIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22387b", new Object[]{this})).booleanValue();
        }
        djw djwVar = this.b;
        if (djwVar == null || djwVar.e() == 0) {
            return true;
        }
        return false;
    }

    public boolean isHalfHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19be246a", new Object[]{this})).booleanValue();
        }
        djw djwVar = this.b;
        if (djwVar != null) {
            return !djwVar.m(false);
        }
        return true;
    }

    /* renamed from: j0 */
    public u generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("1e763beb", new Object[]{this});
        }
        return new u();
    }

    public final View k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("80350cf", new Object[]{this});
        }
        PlayerCoverView a2 = y4w.a(this.node.N());
        a2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        a2.setShowAnimation(((u) this.viewParams).o1);
        a2.loadImageIfInSlowScroll(v0());
        com.taobao.tao.flexbox.layoutmanager.core.o P = this.node.P();
        u uVar = (u) this.viewParams;
        Object obj = uVar.y0;
        rbi rbiVar = this.measureResult;
        a2.setImageSrc(P, obj, rbiVar.f27261a, rbiVar.b, ImageLoader.b.f(ImageLoader.Scene.VIDEO_COVER, this.node, uVar.p1), null, false);
        a2.setImageLoadCallback(new e());
        com.taobao.tao.flexbox.layoutmanager.core.o P2 = this.node.P();
        u uVar2 = (u) this.viewParams;
        a2.setPlayIcon(P2, uVar2.N0, uVar2.O0, uVar2.P0);
        return a2;
    }

    public TNodeImageView l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeImageView) ipChange.ipc$dispatch("64a1df9b", new Object[]{this});
        }
        if (this.view == 0) {
            return null;
        }
        for (int i2 = 0; i2 < ((RoundedCornerLayout) this.view).getChildCount(); i2++) {
            View childAt = ((RoundedCornerLayout) this.view).getChildAt(i2);
            if (childAt instanceof TNodeImageView) {
                return (TNodeImageView) childAt;
            }
        }
        return null;
    }

    public t m0(boolean z) {
        TextureView h0;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("bf4687c", new Object[]{this, new Boolean(z)});
        }
        if (!((u) this.viewParams).L()) {
            int childCount = ((RoundedCornerLayout) this.view).getChildCount();
            if (childCount == 1) {
                Drawable drawable = ((TNodeImageView) this.h).getDrawable();
                P p2 = this.viewParams;
                String str = ((u) p2).z0;
                ((u) p2).getClass();
                return new t(drawable, 0, str, null);
            } else if (childCount == 2) {
                View childAt = ((RoundedCornerLayout) this.view).getChildAt(0);
                TNodeImageView tNodeImageView = (TNodeImageView) this.h;
                if (childAt instanceof ViewGroup) {
                    if (z && (h0 = h0((ViewGroup) childAt)) != null && (bitmap = h0.getBitmap()) != null) {
                        return new t(new BitmapDrawable(bitmap), g7m.o().l(q0()), ((u) this.viewParams).z0, null);
                    }
                    if (g7m.o().D(q0())) {
                        Drawable drawable2 = tNodeImageView.getDrawable();
                        int l2 = g7m.o().l(q0());
                        P p3 = this.viewParams;
                        String str2 = ((u) p3).z0;
                        ((u) p3).getClass();
                        return new t(drawable2, l2, str2, null);
                    }
                }
                Drawable drawable3 = tNodeImageView.getDrawable();
                P p4 = this.viewParams;
                String str3 = ((u) p4).z0;
                ((u) p4).getClass();
                return new t(drawable3, 0, str3, null);
            }
        }
        return null;
    }

    public final String n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bb29c9d", new Object[]{this});
        }
        return (String) this.node.H("firstFrameUrl");
    }

    public String o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a0b771c", new Object[]{this});
        }
        return this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0170, code lost:
        if (r10.equals("page") == false) goto L_0x0167;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r10) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.n nVar, com.taobao.tao.flexbox.layoutmanager.core.n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        R0(l0());
        K0(i2);
        J0(i2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.e
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (i4 <= 0 || i5 <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0 && i3 > 0) {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        if (z2) {
            b0(false);
        } else {
            nwv.y0(new m());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.f
    public void onVisibilityChanged(View view, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i2)});
        } else if (view == this.view) {
            boolean z2 = this.c;
            if (i2 != 0) {
                z = false;
            }
            if (z2 != z) {
                if (z) {
                    V0();
                } else {
                    b0(false);
                }
                this.c = z;
            }
        }
    }

    public final Component p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("f9c9f300", new Object[]{this});
        }
        djw djwVar = this.b;
        if (djwVar != null) {
            return djwVar.h();
        }
        return null;
    }

    public String q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("107cd80c", new Object[]{this});
        }
        return this.node.N().toString() + this.node.U();
    }

    public View r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fdace493", new Object[]{this});
        }
        V v = this.view;
        if (v == 0 || ((RoundedCornerLayout) v).getChildCount() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < ((RoundedCornerLayout) this.view).getChildCount(); i2++) {
            if (((RoundedCornerLayout) this.view).getChildAt(i2) instanceof VideoView) {
                return ((RoundedCornerLayout) this.view).getChildAt(i2);
            }
        }
        return null;
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964a6361", new Object[]{this});
        } else if (akt.f2() && this.h != null) {
            if (((u) this.viewParams).L() || g7m.o().C(q0())) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, "alpha", 1.0f, 0.0f);
                this.i = ofFloat;
                ofFloat.setDuration(250L);
                this.i.setInterpolator(new LinearInterpolator());
                this.i.start();
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f2, List<com.taobao.tao.flexbox.layoutmanager.core.n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f2), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f2, list);
        if (componentAlpha && this.view != 0) {
            if (!z) {
                f2 *= ((u) this.viewParams).T;
            }
            for (int i2 = 0; i2 < ((RoundedCornerLayout) this.view).getChildCount(); i2++) {
                ((RoundedCornerLayout) this.view).getChildAt(i2).setAlpha(f2);
            }
        }
        return componentAlpha;
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6c4886", new Object[]{this});
        } else if (VideoControllerManager.o((u) this.viewParams)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = VideoControllerManager.d;
            if (currentTimeMillis - j2 > 5000 || j2 == 0) {
                VideoControllerManager.s(null);
                VideoControllerManager.d = System.currentTimeMillis();
            }
        }
    }

    public boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        u uVar = (u) this.viewParams;
        boolean z = uVar.H0;
        if (!uVar.I0) {
            return z & g7m.o().B(getNode().N());
        }
        return z;
    }

    public final boolean v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f0aed5", new Object[]{this})).booleanValue();
        }
        Component p0 = p0();
        if (p0 instanceof ListViewComponent) {
            return ((ListViewComponent) p0).T1();
        }
        return true;
    }

    public final boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7f02506", new Object[]{this})).booleanValue();
        }
        Component p0 = p0();
        if (p0 != null) {
            return nwv.a0(p0.getView());
        }
        return nwv.a0(this.node.g0().w0());
    }

    public final boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1d2a7e3", new Object[]{this})).booleanValue();
        }
        if (((u) this.viewParams).c1 || !akt.R1() || s6o.E(3)) {
            return false;
        }
        return true;
    }

    public boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aab1aaa8", new Object[]{this})).booleanValue();
        }
        Object W = this.node.P().W();
        if (W instanceof anl) {
            return ((anl) W).isFinishing();
        }
        if (W instanceof o.r) {
            return ((o.r) W).isDestroy();
        }
        return false;
    }

    public final boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        P p2 = this.viewParams;
        if (!((u) p2).r1) {
            return q;
        }
        if (this.f12102a == null) {
            this.f12102a = Boolean.valueOf(((u) p2).s1);
        }
        return this.f12102a.booleanValue();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Handler f12122a;
        public int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(502268224);
            }

            public a(Looper looper) {
                super(looper);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == 72182663) {
                    super.dispatchMessage((Message) objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/TBVideoComponent$VideoHandler$MyHandler");
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                    return;
                }
                super.dispatchMessage(message);
                s.b(s.this);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                boolean z;
                boolean z2 = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                if (message.what == 1) {
                    try {
                        if (message.arg1 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (message.arg2 <= 0) {
                            z2 = false;
                        }
                        Component component = (Component) message.obj;
                        if (!(component == null || component.getNode() == null)) {
                            component.getNode().w1(R.id.layout_manager_list_first_check_visible, Boolean.FALSE);
                        }
                        List<com.taobao.tao.flexbox.layoutmanager.core.n> i = g7m.o().i(component, z2);
                        if (sz3.d(i)) {
                            if (z2) {
                                if (z) {
                                    s.c(s.this, i);
                                } else {
                                    s.a(s.this, i);
                                }
                            }
                            com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.c().n(component, i, z2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        static {
            t2o.a(502268223);
        }

        public s() {
            this.f12122a = new a(Looper.getMainLooper());
        }

        public static /* synthetic */ void a(s sVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5613bbe", new Object[]{sVar, list});
            } else {
                sVar.f(list);
            }
        }

        public static /* synthetic */ int b(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae92fc38", new Object[]{sVar})).intValue();
            }
            int i = sVar.b;
            sVar.b = i - 1;
            return i;
        }

        public static /* synthetic */ void c(s sVar, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a50ea58", new Object[]{sVar, list});
            } else {
                sVar.e(list);
            }
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f924cf91", new Object[]{this})).booleanValue();
            }
            if (this.b > g7m.j - 1) {
                return true;
            }
            return false;
        }

        public final void e(List<com.taobao.tao.flexbox.layoutmanager.core.n> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("598fcc4e", new Object[]{this, list});
                return;
            }
            int size = list.size();
            int i = g7m.j;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                com.taobao.tao.flexbox.layoutmanager.core.n nVar = list.get(i3);
                if (nVar != null) {
                    TBVideoComponent tBVideoComponent = (TBVideoComponent) nVar.K();
                    if (!g7m.o().D(tBVideoComponent.q0())) {
                        if (g7m.o().A() && !tBVideoComponent.g && TBVideoComponent.i(tBVideoComponent, false)) {
                            tBVideoComponent.M0();
                            if (tBVideoComponent.q0().equals(((TBVideoComponent) list.get(size - 1).K()).q0())) {
                                for (int i4 = 0; i4 < size; i4++) {
                                    com.taobao.tao.flexbox.layoutmanager.core.n nVar2 = list.get(i4);
                                    if (nVar2 != null) {
                                        ((TBVideoComponent) nVar2.K()).g = false;
                                    }
                                }
                            }
                            i2++;
                        } else if (i2 == i && i3 >= i2 && tBVideoComponent.g) {
                            tBVideoComponent.g = false;
                        }
                    }
                }
            }
        }

        public final void f(List<com.taobao.tao.flexbox.layoutmanager.core.n> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("565e5955", new Object[]{this, list});
                return;
            }
            int min = Math.min(list.size(), g7m.j);
            for (int i = 0; i < min; i++) {
                com.taobao.tao.flexbox.layoutmanager.core.n nVar = list.get(i);
                if (nVar != null) {
                    TBVideoComponent tBVideoComponent = (TBVideoComponent) nVar.K();
                    if (g7m.o().A() || (TBVideoComponent.i(tBVideoComponent, false) && !g7m.o().D(tBVideoComponent.q0()))) {
                        ((TBVideoComponent) nVar.K()).M0();
                    }
                }
            }
        }

        public void g(Runnable runnable, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f55df7d", new Object[]{this, runnable, new Long(j)});
                return;
            }
            this.b++;
            this.f12122a.postDelayed(runnable, j);
        }

        public void h(Runnable runnable) {
            boolean hasCallbacks;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270f6c2f", new Object[]{this, runnable});
                return;
            }
            hasCallbacks = this.f12122a.hasCallbacks(runnable);
            if (hasCallbacks) {
                this.f12122a.removeCallbacks(runnable);
                this.b--;
            }
        }

        public void i(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82cd0d1c", new Object[]{this, obj});
                return;
            }
            this.f12122a.removeCallbacksAndMessages(obj);
            if (obj == null) {
                this.b = 0;
            } else {
                this.b--;
            }
        }

        public void j(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e70848", new Object[]{this, new Integer(i), obj});
            } else if (this.f12122a.hasMessages(i, obj)) {
                this.f12122a.removeMessages(i, obj);
                this.b--;
            }
        }

        public void k(int i, Object obj, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51cb336", new Object[]{this, new Integer(i), obj, new Integer(i2), new Integer(i3)});
                return;
            }
            Message obtain = Message.obtain(this.f12122a, i, obj);
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            this.f12122a.sendMessage(obtain);
            this.b++;
        }

        public /* synthetic */ s(j jVar) {
            this();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public RoundedCornerLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundedCornerLayout) ipChange.ipc$dispatch("c3f9f687", new Object[]{this, context});
        }
        this.b = new djw(this.node, u.I((u) this.viewParams), u.J((u) this.viewParams), this, this);
        this.c = ((u) this.viewParams).U;
        RoundedCornerLayout d2 = ut2.d(context);
        d2.addSizeChangedCallback(this);
        d2.addVisibilityChangedCallback(this);
        if (((u) this.viewParams).q1) {
            axk.a(d2, new i());
        }
        updateAPMToken(d2, dgw.APM_VIEW_INVALID);
        return d2;
    }

    public final void I0(View view) {
        P p2;
        String str;
        VideoView videoView;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea72c08", new Object[]{this, view});
        } else if (this.view != 0 && (p2 = this.viewParams) != 0) {
            u uVar = (u) p2;
            if (!uVar.h1) {
                if (!uVar.L()) {
                    com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.a.c().k();
                    rv4 rv4Var = new rv4();
                    E0(new p(rv4Var));
                    boolean C = g7m.o().C(q0());
                    tfs.c("AVSDK_TBVideoComponentSharePlayer", "preChangeAspectRatio:" + ((u) this.viewParams).u1);
                    if ((VideoControllerManager.n((u) this.viewParams) || !C) && x0()) {
                        tfs.c("AVSDK_TBVideoComponentSharePlayer", "视频未播起来");
                        g7m.o().O(new q(x0(), rv4Var, n0()));
                        s sVar = r;
                        sVar.h(this.k);
                        sVar.g(this.k, 0L);
                    }
                    t m0 = m0(false);
                    if (m0 == null || m0.f12124a == null) {
                        tfs.c("AVSDK_TBVideoComponentSharePlayer", "videoSnapshot == null && videoSnapshot.drawable == null coverObject为null");
                        str = null;
                    } else {
                        tfs.c("AVSDK_TBVideoComponentSharePlayer", "videoSnapshot != null && videoSnapshot.drawable != null coverObject有值");
                        boolean x0 = x0();
                        rv4Var.u(m0.f12124a);
                        rv4Var.w(m0.b);
                        rv4Var.J(m0.c);
                        T0(rv4Var);
                        if ((this.node.N() instanceof Activity) && (findViewById = ((Activity) this.node.N()).getWindow().getDecorView().findViewById(16908290)) != null) {
                            rv4Var.t(findViewById.getHeight());
                        }
                        if ((r0() instanceof VideoView) && !VideoControllerManager.n((u) this.viewParams) && (videoView = (VideoView) r0()) != null) {
                            tfs.c("AVSDK_TBVideoComponentSharePlayer", "VideoView dwInstance");
                            rv4Var.B(videoView.getDwInstance());
                        }
                        ((RoundedCornerLayout) this.view).getLocationOnScreen(rv4Var.h);
                        str = "snapshot" + m0.hashCode();
                        this.e = str;
                        qv4.c().d(str, rv4Var);
                        if (x0) {
                            u uVar2 = (u) this.viewParams;
                            if (A0(uVar2)) {
                                rv4Var.C(z0());
                            } else {
                                rv4Var.C(uVar2.L0);
                            }
                            rv4Var.I(q0());
                            rv4Var.F(true);
                            if (VideoControllerManager.o((u) this.viewParams)) {
                                rv4Var.E(((u) this.viewParams).a1);
                                S0(rv4Var, false);
                            } else {
                                rv4Var.E(((u) this.viewParams).Z0);
                            }
                            ogi.e().o(str, rv4Var);
                            this.f = true;
                        }
                        tfs.c("AVSDK_TBVideoComponentSharePlayer", "双列流点击设置，view宽：" + ((RoundedCornerLayout) this.view).getWidth() + ",view高:" + ((RoundedCornerLayout) this.view).getHeight() + ",视频宽 :" + ((u) this.viewParams).B0 + ",视频高：" + ((u) this.viewParams).C0);
                    }
                    if (akt.C0() && ((HashMap) ShortVideoQuickOpenManager.b).containsKey(((u) this.viewParams).Y0)) {
                        if (g7m.o().n() != null) {
                            rv4Var.s((JSONObject) getTNode().t0());
                            rv4Var.H(g7m.o().n());
                        }
                        rv4Var.r(true);
                    }
                } else {
                    str = null;
                }
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put(FullPage.PRE_PLAYER_MAP_KEY, str);
                }
                String I = nwv.I(this.node.H("onclick"), null);
                if (I != null) {
                    if (this.node.H("trackinfo") != null) {
                        sendMessage(getNode(), "click", null, null, null);
                    }
                    sendMessage(this.node, "onclick", I, hashMap, uaa.e().f());
                    return;
                }
                com.taobao.tao.flexbox.layoutmanager.core.n g0 = g0();
                if (g0 != null) {
                    if (g0.H("trackinfo") != null) {
                        sendMessage(g0, "click", null, null, null);
                    }
                    String I2 = nwv.I(g0.H("onclick"), null);
                    if (I2 != null) {
                        sendMessage(g0, "onclick", I2, hashMap, uaa.e().f());
                    }
                }
            }
        }
    }

    public final void E0(ImageLoader.e eVar) {
        ImageLoader.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f80de", new Object[]{this, eVar});
            return;
        }
        String n0 = n0();
        if (!TextUtils.isEmpty(n0)) {
            if (akt.N0()) {
                ImageLoader.b d2 = ImageLoader.b.d(0, ImageAdapter.IMAGE_QUALITY_Q90, "", "", g7m.image_test_biz_name, 9103, ImageLoader.Scene.FIRST_FRAME);
                this.j = od0.D().a().b(n0, 1200, 1200, d2);
                cVar = new ImageLoader.c(null, this.node.N(), n0, this.j, 1200, 1200, d2, false);
            } else {
                cVar = new ImageLoader.c(null, this.node.N(), n0, n0, -1, -1, ImageLoader.b.e(ImageLoader.Scene.FIRST_FRAME, this.node), false);
            }
            od0.D().a().d(cVar, false, new o(this, eVar));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r10.equals("playerStop") == false) goto L_0x0038;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.tao.flexbox.layoutmanager.ac.d.k r12) {
        /*
            r8 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0025
            java.lang.String r6 = "9f789b95"
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r8
            r7[r3] = r9
            r7[r2] = r10
            r7[r1] = r11
            r7[r0] = r12
            java.lang.Object r9 = r5.ipc$dispatch(r6, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0025:
            P extends tb.jfw r5 = r8.viewParams
            com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$u r5 = (com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.u) r5
            boolean r5 = r5.g1
            if (r5 == 0) goto L_0x00a6
            r10.hashCode()
            r5 = -1
            int r6 = r10.hashCode()
            switch(r6) {
                case -200636813: goto L_0x0068;
                case 542719893: goto L_0x005c;
                case 2095646874: goto L_0x0050;
                case 2095727029: goto L_0x0044;
                case 2095824515: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            r0 = -1
            goto L_0x0073
        L_0x003a:
            java.lang.String r1 = "playerStop"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0073
            goto L_0x0038
        L_0x0044:
            java.lang.String r0 = "playerPlay"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0038
        L_0x004e:
            r0 = 3
            goto L_0x0073
        L_0x0050:
            java.lang.String r0 = "playerMute"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0038
        L_0x005a:
            r0 = 2
            goto L_0x0073
        L_0x005c:
            java.lang.String r0 = "playerPause"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x0038
        L_0x0066:
            r0 = 1
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "playerUnmute"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x0038
        L_0x0072:
            r0 = 0
        L_0x0073:
            switch(r0) {
                case 0: goto L_0x009a;
                case 1: goto L_0x0096;
                case 2: goto L_0x008a;
                case 3: goto L_0x007b;
                case 4: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x00a6
        L_0x0077:
            r8.G0(r4)
            goto L_0x00a7
        L_0x007b:
            com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent$s r0 = com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.r
            java.lang.Runnable r1 = r8.l
            r0.h(r1)
            java.lang.Runnable r1 = r8.l
            r4 = 0
            r0.g(r1, r4)
            goto L_0x00a7
        L_0x008a:
            tb.g7m r0 = tb.g7m.o()
            java.lang.String r1 = r8.q0()
            r0.Q(r3, r1)
            goto L_0x00a7
        L_0x0096:
            r8.F0()
            goto L_0x00a7
        L_0x009a:
            tb.g7m r0 = tb.g7m.o()
            java.lang.String r1 = r8.q0()
            r0.Q(r4, r1)
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            if (r3 != 0) goto L_0x00ad
            boolean r3 = super.invoke(r9, r10, r11, r12)
        L_0x00ad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }
}
