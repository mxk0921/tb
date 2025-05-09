package com.taobao.android.detail2.core.biz.detailcard.viewholder;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.detail2.core.framework.base.weex.ContainerError;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.mainpic.GestureRoundRectCardRoot;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.amo;
import tb.bxj;
import tb.byj;
import tb.cbw;
import tb.cxj;
import tb.dgw;
import tb.dh7;
import tb.ec7;
import tb.g9e;
import tb.gxq;
import tb.hsm;
import tb.j83;
import tb.k97;
import tb.muv;
import tb.nd2;
import tb.nyj;
import tb.o2r;
import tb.oj7;
import tb.p0i;
import tb.pce;
import tb.pnm;
import tb.q0i;
import tb.q0j;
import tb.qrc;
import tb.r19;
import tb.s0m;
import tb.s8d;
import tb.se7;
import tb.sqj;
import tb.t2o;
import tb.txj;
import tb.u0i;
import tb.udi;
import tb.ue7;
import tb.v22;
import tb.vv6;
import tb.wmc;
import tb.wxj;
import tb.x3w;
import tb.x4m;
import tb.xmo;
import tb.y9e;
import tb.yf2;
import tb.ywj;
import tb.z4x;
import tb.zgj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ItemCardViewHolder extends VerticalAbsViewHolder<ue7, se7> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final y9e G = new d();
    public static final String KEY_CONTAINER_DIMENSION = "containerDimension";
    public static final String KEY_FEATURE_ENABLE_INSIDE_DETAIL = "enableInsideDetail";
    public static final String KEY_FULL_SCREEN_STYLE = "fullScreenStyle";
    public static final String KEY_NEXT_CARD_DIMENSION = "nextCardContainerDimension";
    public static final String VIEWHOLDER_KEY = "item";
    public com.taobao.android.detail2.core.mainpic.a A;
    public final j B = new j(this, null);
    public final Runnable C = new a();
    public final udi.a D = new b();
    public final pce E = new c();
    public final k97 F = new f();
    public FrameLayout o;
    public udi p;
    public DetailWeexContainer q;
    public AliUrlImageView r;
    public boolean s;
    public FrameLayout t;
    public ImageView u;
    public RoundRectCardRoot v;
    public ImageView w;
    public ImageView x;
    public FrameLayout y;
    public boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class animation.Animation$AnimationListenerC0388a implements Animation.AnimationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public animation.Animation$AnimationListenerC0388a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else if (!ItemCardViewHolder.this.P3() && ItemCardViewHolder.N2(ItemCardViewHolder.this) != null) {
                    ItemCardViewHolder.N2(ItemCardViewHolder.this).setVisibility(8);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object obj = "";
            if (!ItemCardViewHolder.R1(ItemCardViewHolder.this) || ItemCardViewHolder.d2(ItemCardViewHolder.this) == null || ItemCardViewHolder.p2(ItemCardViewHolder.this).l() == null || !ItemCardViewHolder.C2(ItemCardViewHolder.this).l().f()) {
                if (ItemCardViewHolder.N2(ItemCardViewHolder.this) != null) {
                    ItemCardViewHolder.N2(ItemCardViewHolder.this).setVisibility(8);
                }
                if (ItemCardViewHolder.u3(ItemCardViewHolder.this) != null) {
                    ItemCardViewHolder.u3(ItemCardViewHolder.this).setVisibility(8);
                }
                StringBuilder sb = new StringBuilder();
                if (ItemCardViewHolder.y3(ItemCardViewHolder.this) != null) {
                    obj = Integer.valueOf(((ue7) ItemCardViewHolder.S1(ItemCardViewHolder.this)).f31127a);
                }
                sb.append(obj);
                sb.append("mHidePlaceHolderImageViewRunnable 执行");
                txj.e(txj.TAG_RENDER, sb.toString());
            } else if (!ItemCardViewHolder.this.P3()) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setDuration(byj.Q0());
                alphaAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0388a());
                if (ItemCardViewHolder.N2(ItemCardViewHolder.this) != null) {
                    ItemCardViewHolder.N2(ItemCardViewHolder.this).startAnimation(alphaAnimation);
                }
                StringBuilder sb2 = new StringBuilder();
                if (ItemCardViewHolder.X2(ItemCardViewHolder.this) != null) {
                    obj = Integer.valueOf(((ue7) ItemCardViewHolder.j3(ItemCardViewHolder.this)).f31127a);
                }
                sb2.append(obj);
                sb2.append("mHidePlaceHolderImageViewRunnable 执行");
                txj.e(txj.TAG_RENDER, sb2.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements udi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.udi.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31223baf", new Object[]{this, str, jSONObject});
            } else {
                ItemCardViewHolder.T1(ItemCardViewHolder.this, str, jSONObject);
            }
        }

        @Override // tb.udi.a
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddbf7730", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.udi.a
        public HashMap<String, String> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("9cc44676", new Object[]{this});
            }
            HashMap<String, String> hashMap = (HashMap) ItemCardViewHolder.this.J0();
            if (ItemCardViewHolder.o2(ItemCardViewHolder.this) != null) {
                hashMap = (HashMap) v22.e(ItemCardViewHolder.q2(ItemCardViewHolder.this).h(), ItemCardViewHolder.s2(ItemCardViewHolder.this).j(), hashMap, ItemCardViewHolder.t2(ItemCardViewHolder.this));
            }
            if (ItemCardViewHolder.u2(ItemCardViewHolder.this) != null) {
                hashMap.put("cardUTArgs", ((ue7) ItemCardViewHolder.v2(ItemCardViewHolder.this)).w().toJSONString());
            }
            return hashMap;
        }

        @Override // tb.udi.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b5947a0", new Object[]{this});
            } else if (ItemCardViewHolder.U1(ItemCardViewHolder.this) != null) {
                o2r.a("onVideoFirstFrame");
                if (((ue7) ItemCardViewHolder.V1(ItemCardViewHolder.this)).f31127a == 0 && !((ue7) ItemCardViewHolder.W1(ItemCardViewHolder.this)).A) {
                    if (((ue7) ItemCardViewHolder.X1(ItemCardViewHolder.this)).C) {
                        txj.e(txj.TAG_TIP, "NdVideoSettingHelper: VH-视频未自动播放场景，不上报 FcpVideoReady 。");
                    } else {
                        bxj h = ItemCardViewHolder.Z1(ItemCardViewHolder.this).h();
                        q0j.x(h, q0j.SECTION_FIRST_VIDEO_READY, "nid=" + ((ue7) ItemCardViewHolder.a2(ItemCardViewHolder.this)).h);
                        if (((ue7) ItemCardViewHolder.b2(ItemCardViewHolder.this)).s0) {
                            ((ue7) ItemCardViewHolder.c2(ItemCardViewHolder.this)).s0 = false;
                            bxj h2 = ItemCardViewHolder.e2(ItemCardViewHolder.this).h();
                            q0j.x(h2, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_VIDEO_READY, "nid=" + ((ue7) ItemCardViewHolder.f2(ItemCardViewHolder.this)).h);
                        }
                        wxj.b(ItemCardViewHolder.g2(ItemCardViewHolder.this));
                        nyj.z().F(ItemCardViewHolder.h2(ItemCardViewHolder.this).G(), nyj.TYPE_VIDEO_FRAME_READY);
                    }
                    if (ItemCardViewHolder.i2(ItemCardViewHolder.this) != null && ItemCardViewHolder.j2(ItemCardViewHolder.this).l() != null && ItemCardViewHolder.k2(ItemCardViewHolder.this).l().f() && ItemCardViewHolder.R1(ItemCardViewHolder.this) && ItemCardViewHolder.l2(ItemCardViewHolder.this).l().c() && !NavBarViewManager.H(ItemCardViewHolder.h2(ItemCardViewHolder.this).o())) {
                        ItemCardViewHolder.n2(ItemCardViewHolder.this).l().j();
                    }
                }
                o2r.b();
            }
        }

        @Override // tb.udi.a
        public void c(SuccPhenixEvent succPhenixEvent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c232e1d", new Object[]{this, succPhenixEvent, new Boolean(z)});
            } else if (!z && ItemCardViewHolder.w2(ItemCardViewHolder.this) != null && !((ue7) ItemCardViewHolder.x2(ItemCardViewHolder.this)).A) {
                if (((ue7) ItemCardViewHolder.y2(ItemCardViewHolder.this)).f31127a == 0) {
                    bxj h = ItemCardViewHolder.A2(ItemCardViewHolder.this).h();
                    q0j.x(h, q0j.SECTION_FIRST_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                    if (ItemCardViewHolder.h2(ItemCardViewHolder.this).D0()) {
                        bxj h2 = ItemCardViewHolder.B2(ItemCardViewHolder.this).h();
                        q0j.x(h2, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                    }
                    String G = ItemCardViewHolder.h2(ItemCardViewHolder.this).G();
                    nyj.z().u(G, ItemCardViewHolder.D2(ItemCardViewHolder.this).q(), "loadVideoCover", true);
                    nyj.z().F(G, nyj.TYPE_VIDEO_COVER_PIC);
                } else if (((ue7) ItemCardViewHolder.E2(ItemCardViewHolder.this)).f31127a == 1 && ItemCardViewHolder.h2(ItemCardViewHolder.this).B0() && ItemCardViewHolder.this.f.s()) {
                    bxj h3 = ItemCardViewHolder.F2(ItemCardViewHolder.this).h();
                    q0j.x(h3, q0j.SECTION_SECOND_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                }
                txj.f(txj.TAG_MEDIA_CONTROLLER, "封面图加载成功 index=" + ((ue7) ItemCardViewHolder.G2(ItemCardViewHolder.this)).f31127a + "，是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl(), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else if (map == null || map.size() == 0) {
                txj.e(txj.TAG_RENDER, "weex onGestureEvent gestureinfo为空");
            } else {
                boolean booleanValue = ((Boolean) map.get("state")).booleanValue();
                txj.e(txj.TAG_RENDER, "acceptGestureType: " + ((String) map.get("acceptGestureType")));
                ItemCardViewHolder.H2(ItemCardViewHolder.this, booleanValue);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements y9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public VerticalAbsViewHolder a(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerticalAbsViewHolder) ipChange.ipc$dispatch("7d87e1ae", new Object[]{this, viewGroup, dh7Var, cxjVar});
            }
            return new ItemCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_card_layout, (ViewGroup) ((RoundRectCardRoot) LayoutInflater.from(cxjVar.i()).inflate(R.layout.detail_half_screen_layout, viewGroup, false).findViewById(R.id.half_screen_round_root)), true), viewGroup, dh7Var, cxjVar, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ItemCardViewHolder.S2(ItemCardViewHolder.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$base$weex$ContainerError;

        static {
            int[] iArr = new int[ContainerError.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$base$weex$ContainerError = iArr;
            try {
                iArr[ContainerError.WEEX_URL_INCONSISTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$base$weex$ContainerError[ContainerError.WEEX_URL_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cxj f7080a;
        public final x3w b;
        public final boolean c;
        public final boolean d;

        static {
            t2o.a(352321565);
            t2o.a(620757101);
        }

        public h(cxj cxjVar, x3w x3wVar, boolean z, boolean z2) {
            this.f7080a = cxjVar;
            this.b = x3wVar;
            this.c = z;
            this.d = z2;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            cxj cxjVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent == null) {
                return false;
            }
            if (this.c) {
                x3w x3wVar = this.b;
                q0j.e(x3wVar, q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_GAUSSIAN_PIC_LOAD_FAIL, "瞬开高斯模糊图片加载失败，url：" + failPhenixEvent.getUrl(), false);
            } else {
                x3w x3wVar2 = this.b;
                q0j.e(x3wVar2, q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_PIC_LOAD_FAIL, "瞬开图片加载失败，url：" + failPhenixEvent.getUrl(), false);
                x3w x3wVar3 = this.b;
                if (!(x3wVar3 == null || x3wVar3.f31127a != 0 || (cxjVar = this.f7080a) == null)) {
                    if (this.d) {
                        q0j.a(cxjVar.h(), "deliverPicFail", "phenix");
                    } else {
                        q0j.a(cxjVar.h(), "NPicFail", "phenix");
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cxj f7081a;
        public final ImageView b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        static {
            t2o.a(352321566);
            t2o.a(620757101);
        }

        public i(cxj cxjVar, ImageView imageView, int i, boolean z, boolean z2, boolean z3) {
            this.f7081a = cxjVar;
            this.b = imageView;
            this.c = i;
            this.d = z;
            this.e = z2;
            this.f = z3;
            if (!z && cxjVar.p() == null) {
                cxjVar.C(nyj.z().e(cxjVar.j().G(), "loadMainPic"));
            }
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent == null) {
                return false;
            }
            this.b.setImageDrawable(succPhenixEvent.getDrawable());
            if (this.d) {
                b();
                c(succPhenixEvent);
            } else {
                d(succPhenixEvent);
            }
            return false;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("541fb709", new Object[]{this});
            } else if (ItemCardViewHolder.I2(ItemCardViewHolder.this) == null || ((ue7) ItemCardViewHolder.J2(ItemCardViewHolder.this)).x0 == null || !((ue7) ItemCardViewHolder.K2(ItemCardViewHolder.this)).x0.d) {
                ItemCardViewHolder.L2(ItemCardViewHolder.this).setVisibility(8);
            } else {
                ItemCardViewHolder.L2(ItemCardViewHolder.this).setVisibility(0);
                ItemCardViewHolder.L2(ItemCardViewHolder.this).setBackgroundColor(((ue7) ItemCardViewHolder.M2(ItemCardViewHolder.this)).x0.e);
                if (((ue7) ItemCardViewHolder.O2(ItemCardViewHolder.this)).x0.f >= 0.0f) {
                    ItemCardViewHolder.L2(ItemCardViewHolder.this).setAlpha(((ue7) ItemCardViewHolder.P2(ItemCardViewHolder.this)).x0.f);
                }
            }
        }

        public final void c(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7834412", new Object[]{this, succPhenixEvent});
                return;
            }
            bxj h = this.f7081a.h();
            q0j.x(h, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_GAUSSIAN_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
            HashMap hashMap = new HashMap();
            hashMap.put("isImmediate", String.valueOf(succPhenixEvent.isImmediate()));
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_PLACEHOLDER_GAUSSIAN_IMAGE_CALLBACK_SUCCESS + this.c, hashMap);
            bxj h2 = this.f7081a.h();
            q0j.a(h2, "NativeGaussianPicCacheHit" + this.c, String.valueOf(succPhenixEvent.isImmediate()));
        }

        public final void d(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69e534dd", new Object[]{this, succPhenixEvent});
                return;
            }
            int i = this.c;
            if (i == 0 || i == 1) {
                if (this.f7081a == null) {
                    txj.e(txj.TAG_TIP, "NdApmToken: NativeMainPic mNewDetailContext 为空。");
                }
                this.b.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
                txj.e(txj.TAG_TIP, "NdApmToken: NativeMainPic , ndTagSuccess ");
                if (this.c == 0) {
                    o2r.a("placeHolderSuccess" + succPhenixEvent.isImmediate());
                    o2r.b();
                    if (this.e) {
                        bxj h = this.f7081a.h();
                        q0j.x(h, q0j.SECTION_FIRST_OPEN_IMMEDIATELY_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                    }
                    if (this.f) {
                        q0j.a(this.f7081a.h(), "navShowDeliverPic", "true");
                        o2r.a("bindNoOpenImmedPlaceHolderLoadSuccess");
                        o2r.b();
                    }
                    bxj h2 = this.f7081a.h();
                    q0j.x(h2, q0j.SECTION_FIRST_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                    if (this.f7081a != null) {
                        String G = ItemCardViewHolder.h2(ItemCardViewHolder.this).G();
                        nyj.z().u(G, this.f7081a.p(), "loadMainPic", true);
                        this.f7081a.b();
                        nyj.z().F(G, nyj.TYPE_NATIVE_MAIN_PIC);
                    }
                } else if (this.f7081a.j().B0() && ItemCardViewHolder.this.f.s()) {
                    bxj h3 = this.f7081a.h();
                    q0j.x(h3, q0j.SECTION_SECOND_NATIVE_PIC_VISIBLE, "是否内存返回: " + succPhenixEvent.isImmediate() + ", url: " + succPhenixEvent.getUrl());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("isImmediate", String.valueOf(succPhenixEvent.isImmediate()));
                q0j.g("eventProcess", q0j.UMBRELLA_TAG_PLACEHOLDER_IMAGE_CALLBACK_SUCCESS + this.c, hashMap);
                bxj h4 = this.f7081a.h();
                q0j.a(h4, "NativePicCacheHit" + this.c, String.valueOf(succPhenixEvent.isImmediate()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements dh7.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321567);
            t2o.a(352321930);
        }

        public j() {
        }

        @Override // tb.dh7.l
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5b043d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else if (z) {
                ItemCardViewHolder.R2(ItemCardViewHolder.this, true);
            }
        }

        public /* synthetic */ j(ItemCardViewHolder itemCardViewHolder, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements dh7.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321568);
            t2o.a(352321927);
        }

        public k() {
        }

        @Override // tb.dh7.i
        public void onTouch(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8aab07c", new Object[]{this, motionEvent});
            } else if (ItemCardViewHolder.Q2(ItemCardViewHolder.this) != null) {
                ItemCardViewHolder.Q2(ItemCardViewHolder.this).l(motionEvent);
            }
        }

        public /* synthetic */ k(ItemCardViewHolder itemCardViewHolder, a aVar) {
            this();
        }
    }

    static {
        t2o.a(352321556);
    }

    public ItemCardViewHolder(View view, ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar, pnm.d dVar) {
        super(viewGroup, dh7Var, cxjVar);
        o2r.a("ItemCardViewHolder_initView");
        O3(view, dVar);
        o2r.b();
    }

    public static /* synthetic */ cxj A2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("6d562e1b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj B2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("776b1bfa", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj C2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("66bb72ec", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj D2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("55378d24", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w E2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("943e3a1f", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj F2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("696168e2", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w G2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("2ac63ba1", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ void H2(ItemCardViewHolder itemCardViewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1ea30d", new Object[]{itemCardViewHolder, new Boolean(z)});
        } else {
            itemCardViewHolder.b4(z);
        }
    }

    public static /* synthetic */ x3w I2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("c14e3d23", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w J2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("8c923de4", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w K2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("57d63ea5", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ ImageView L2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("3fa5eb45", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.x;
    }

    public static /* synthetic */ x3w M2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ee5e4027", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ RoundRectCardRoot N2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RoundRectCardRoot) ipChange.ipc$dispatch("cfa69976", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.v;
    }

    public static /* synthetic */ x3w O2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("663650bd", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w P2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("317a517e", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.mainpic.a Q2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.mainpic.a) ipChange.ipc$dispatch("987e0d44", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.A;
    }

    public static /* synthetic */ boolean R1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af01dd5c", new Object[]{itemCardViewHolder})).booleanValue();
        }
        return itemCardViewHolder.Q3();
    }

    public static /* synthetic */ boolean R2(ItemCardViewHolder itemCardViewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1da5b452", new Object[]{itemCardViewHolder, new Boolean(z)})).booleanValue();
        }
        return itemCardViewHolder.D3(z);
    }

    public static /* synthetic */ x3w S1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("f145f341", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ void S2(ItemCardViewHolder itemCardViewHolder, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f5db09", new Object[]{itemCardViewHolder, jSONObject});
        } else {
            itemCardViewHolder.x1(jSONObject);
        }
    }

    public static /* synthetic */ void T1(ItemCardViewHolder itemCardViewHolder, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8227aebf", new Object[]{itemCardViewHolder, str, jSONObject});
        } else {
            itemCardViewHolder.c4(str, jSONObject);
        }
    }

    public static /* synthetic */ cxj T2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("ca3dee5f", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w U1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("87cdf4c3", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w U2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("f5125604", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w V1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("5311f584", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj V2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("de67ca1d", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w W1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("1e55f645", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w W2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("8b9a5786", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w X1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("e999f706", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w X2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("39d66818", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w Y2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("372681c", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj Z1(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("e81ab65b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj Z2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("d05e1705", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w a2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("8021f888", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w b2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("4b65f949", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w b3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("99fa699e", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w c2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("16a9fa0a", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj c3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("e487f2c3", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj d2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("5291972e", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w d3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("30826b20", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj e2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("e425f122", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w e3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("fbc66be1", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w f2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("59c60b61", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w f3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("c70a6ca2", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj g2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("f84fcce0", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj g3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("cdbaa3f", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.global.a h2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("72288990", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.I3();
    }

    public static /* synthetic */ x3w h3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("5d926e24", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj i2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("c79a89e", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w i3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("28d66ee5", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ Object ipc$super(ItemCardViewHolder itemCardViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/biz/detailcard/viewholder/ItemCardViewHolder");
    }

    public static /* synthetic */ cxj j2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("168e967d", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w j3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("51a68d9", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj k2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("20a3845c", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w k3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("a0ae7f7b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj l2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("2ab8723b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w l3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("6bf2803c", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj m3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("12fbd2e5", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj n2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("34cd601a", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w n3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("27a81be", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ dh7 o2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh7) ipChange.ipc$dispatch("e55752bd", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.e;
    }

    public static /* synthetic */ cxj o3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("2725aea3", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ cxj p2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("5ca6850d", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w p3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("99028340", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj q2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("1caebf23", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w q3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("64468401", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w r3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("2f8a84c2", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj s2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("26c3ad02", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w s3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("face8583", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w t2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("c2462381", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w t3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("c6128644", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w u2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("8d8a2442", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ ImageView u3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a59d6c91", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.w;
    }

    public static /* synthetic */ x3w v2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("58ce2503", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w v3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("3dea96da", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w w2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("241225c4", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w w3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("92e979b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w x2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ef562685", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ cxj x3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("4b84a0e6", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.d;
    }

    public static /* synthetic */ x3w y2(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("ba9a2746", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public static /* synthetic */ x3w y3(ItemCardViewHolder itemCardViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x3w) ipChange.ipc$dispatch("9ba26a5b", new Object[]{itemCardViewHolder});
        }
        return itemCardViewHolder.c;
    }

    public final boolean A3() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6439a53", new Object[]{this})).booleanValue();
        }
        T t = this.c;
        if (t == 0 || ((ue7) t).o0 == null) {
            return false;
        }
        if (u0() == 0) {
            if (!((ue7) this.c).N()) {
                bxj h2 = this.d.h();
                q0j.x(h2, q0j.SECTION_FIRST_OTHER_BIND_PRE, "itemId=" + ((ue7) this.c).h);
            } else {
                bxj h3 = this.d.h();
                q0j.x(h3, q0j.SECTION_FIRST_OTHER_BIND, "itemId=" + ((ue7) this.c).h);
            }
        }
        DetailWeexContainer.g gVar = new DetailWeexContainer.g();
        ue7 ue7Var = (ue7) this.c;
        gVar.f7100a = ue7Var.h;
        gVar.b = ue7Var.f31127a;
        gVar.c = ue7Var.o0.containerName;
        boolean z2 = ue7Var.A;
        this.q.Z(gVar);
        ue7 ue7Var2 = (ue7) this.c;
        z3(ue7Var2.o0.dataContext, ue7Var2.f31127a);
        if (this.d.i() != null) {
            com.taobao.android.detail2.core.framework.base.weex.b U = this.e.U();
            DetailWeexContainer detailWeexContainer = this.q;
            cxj cxjVar = this.d;
            CardInnerCommonNode cardInnerCommonNode = ((ue7) this.c).o0;
            z4x z4xVar = cardInnerCommonNode.containerInfo;
            JSONObject jSONObject = cardInnerCommonNode.dataContext;
            boolean H3 = H3();
            if (((ue7) this.c).f31127a != 0) {
                z = true;
            } else {
                z = false;
            }
            U.a(detailWeexContainer, cxjVar, z4xVar, jSONObject, H3, z);
        }
        T t2 = this.c;
        if (((ue7) t2).o0.containerInfo != null) {
            try {
                ((ue7) t2).u().put("nd_weexUrl", (Object) URLEncoder.encode(((ue7) this.c).o0.containerInfo.c(), "UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            ((ue7) this.c).u().put("nd_jsVersion", (Object) ((ue7) this.c).o0.containerInfo.b());
        }
        if (((ue7) this.c).p != null) {
            return true;
        }
        return false;
    }

    public final boolean B3() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb88625", new Object[]{this})).booleanValue();
        }
        udi udiVar = this.p;
        if (udiVar == null || (t = this.c) == 0) {
            return false;
        }
        return udiVar.j((ue7) t, ((ue7) t).p0);
    }

    public final void C3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da80fba", new Object[]{this});
            return;
        }
        o2r.a("bindNoOpenImmedPlaceHolderStart");
        o2r.b();
        if (this.c == 0 || this.d.i() == null) {
            txj.e(txj.TAG_RENDER, "mCurrentNode或mNewDetailContext.getContext为空，bindNoOpenImmedPlaceHolder return");
            return;
        }
        ue7 ue7Var = (ue7) this.c;
        if (ue7Var.v) {
            txj.e(txj.TAG_RENDER, this.c + "mCurrentNode.mHasHandleNoOPenImmedPlaceHolder == true return");
            return;
        }
        ue7.b bVar = ue7Var.x0;
        if (bVar == null) {
            if (vv6.a() && ((ue7) this.c).f31127a == 0) {
                Toast.makeText(this.d.i(), "mNoOpenImmedPlaceHolderComponent为空，bindNoOpenImmedPlaceHolder return", 0).show();
            }
            txj.e(txj.TAG_RENDER, ((ue7) this.c).f31127a + "mNoOpenImmedPlaceHolderComponent为空，bindNoOpenImmedPlaceHolder return");
            if (((ue7) this.c).f31127a == 0) {
                q0j.a(this.d.h(), "deliverPicFail", "componentNull");
            }
        } else if (TextUtils.isEmpty(bVar.f29320a)) {
            if (vv6.a() && ((ue7) this.c).f31127a == 0) {
                Toast.makeText(this.d.i(), "mNoOpenImmedPlaceHolderComponent.url为空，bindNoOpenImmedPlaceHolder return", 0).show();
            }
            txj.e(txj.TAG_RENDER, ((ue7) this.c).f31127a + "mNoOpenImmedPlaceHolderComponent.url为空，bindNoOpenImmedPlaceHolder return");
            if (((ue7) this.c).f31127a == 0) {
                q0j.a(this.d.h(), "deliverPicFail", "componentUrlNull");
            }
        } else if (TextUtils.isEmpty(((ue7) this.c).x0.b)) {
            if (vv6.a() && ((ue7) this.c).f31127a == 0) {
                Toast.makeText(this.d.i(), "mNoOpenImmedPlaceHolderComponent.dimension为空，bindNoOpenImmedPlaceHolder return", 0).show();
            }
            txj.e(txj.TAG_RENDER, ((ue7) this.c).f31127a + "mNoOpenImmedPlaceHolderComponent.dimension为空，bindNoOpenImmedPlaceHolder return");
            if (((ue7) this.c).f31127a == 0) {
                q0j.a(this.d.h(), "deliverPicFail", "componentDimensionNull");
            }
        } else {
            s0m B = s0m.B();
            Activity i2 = this.d.i();
            ue7 ue7Var2 = (ue7) this.c;
            B.T(hsm.d(i2, ue7Var2.x0.f29320a, ue7Var2.Q0())).heightScale(((ue7) this.c).Q0()).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.u, ((ue7) this.c).f31127a, false, false, true)).failListener(new h(this.d, this.c, false, true)).fetch();
            cxj cxjVar = this.d;
            ue7 ue7Var3 = (ue7) this.c;
            qrc b2 = q0i.b(cxjVar, ue7Var3, ue7Var3.x0.b, this.f.r(), this.f.t());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.v.getLayoutParams();
            layoutParams.topMargin = b2.f;
            layoutParams.width = b2.b;
            layoutParams.height = b2.f26895a;
            this.u.setScaleType(b2.h);
            this.v.setLayoutParams(layoutParams);
            this.v.setCornerRadius(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            if (((ue7) this.c).x0.c) {
                s0m.B().T(hsm.j(this.d.i(), ((ue7) this.c).x0.f29320a)).bitmapProcessors(true, new yf2(this.w.getContext(), J3().x(), 2)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.w, ((ue7) this.c).f31127a, true, false, true)).failListener(new h(this.d, this.c, true, true)).fetch();
            }
            txj.e(txj.TAG_RENDER, ((ue7) this.c).f31127a + "bindNoOpenImmedPlaceHolder成功：" + ((ue7) this.c).x0.f29320a);
            ((ue7) this.c).U();
            o2r.a("bindNoOpenImmedPlaceHolderEnd");
            o2r.b();
        }
    }

    public final void E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb1d8ea", new Object[]{this});
            return;
        }
        DetailWeexContainer detailWeexContainer = this.q;
        if (detailWeexContainer == null || detailWeexContainer.F() == null) {
            txj.e(txj.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid mFixWeexContainer/view 为空。");
            return;
        }
        if (this.d == null) {
            txj.e(txj.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid mNewDetailContext 为空。");
        }
        this.q.F().setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        txj.e(txj.TAG_TIP, "NdApmToken: checkAndSetWeexViewValid , ndTagSuccess ");
    }

    public final TaobaoImageUrlStrategy.ImageBlur F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("42898e70", new Object[]{this});
        }
        if (u0() != 0) {
            return null;
        }
        String string = ((ue7) this.c).B().getString("openImmediatelyBlur");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (TaobaoImageUrlStrategy.ImageBlur) Enum.valueOf(TaobaoImageUrlStrategy.ImageBlur.class, string);
        } catch (Exception unused) {
            q0j.p(q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR, "解析高斯模糊参数出错", I3().T());
            return null;
        }
    }

    public boolean G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f971b0b7", new Object[]{this})).booleanValue();
        }
        cxj cxjVar = this.d;
        if (cxjVar != null && cxjVar.j().N().n()) {
            T t = this.c;
            if (t != 0) {
                boolean a2 = ywj.a(((ue7) t).B(), KEY_FEATURE_ENABLE_INSIDE_DETAIL);
                txj.a(txj.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: enableInsideDetail = " + a2);
                if (!a2) {
                    return a2;
                }
                boolean e2 = this.d.e();
                txj.a(txj.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: currentIsInsideDetailForTagOrLife = " + e2);
                return e2;
            }
            txj.a(txj.TAG_INSIDE_DETAIL, "enableInsideDetailPageForNode: mCurrentNode is Null , enableInsideDetail = false");
        }
        return false;
    }

    public final boolean H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c332fa5", new Object[]{this})).booleanValue();
        }
        if (((ue7) this.c).f31127a != 0) {
            return false;
        }
        return true;
    }

    public final com.taobao.android.detail2.core.framework.data.global.a I3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.d.j();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public Map<String, String> J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6b0f396", new Object[]{this});
        }
        o2r.a("handleExposuresStatusBizArgs");
        Map<String, String> b2 = this.e.a0().b("item", null, this.c);
        o2r.b();
        return b2;
    }

    public final byj J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return this.d.j().N();
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public JSONObject K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2c20ff6e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("weexStart", (Object) Long.valueOf(((ue7) this.c).G0()));
        return jSONObject;
    }

    public void K3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2408ec8", new Object[]{this});
            return;
        }
        AliUrlImageView aliUrlImageView = this.r;
        if (aliUrlImageView != null) {
            aliUrlImageView.setVisibility(4);
        }
    }

    public void L3() {
        cxj cxjVar;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71574387", new Object[]{this});
        } else if (Q3() && (cxjVar = this.d) != null && cxjVar.l() != null && this.d.l().f() && (imageView = this.u) != null) {
            imageView.postDelayed(this.C, 1000L);
        } else if (this.q.H()) {
            this.u.postDelayed(this.C, 2000L);
        } else {
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        }
    }

    public final void M3(View view, pnm.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("367d4054", new Object[]{this, view, dVar});
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.media_layout);
        if (viewStub != null) {
            if (dVar == null || dVar.c() == null) {
                viewStub.setLayoutResource(R.layout.newdetail_media_container_layout);
                this.o = (FrameLayout) viewStub.inflate();
            } else {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewAt(indexOfChild);
                viewGroup.addView(dVar.c(), indexOfChild, viewStub.getLayoutParams());
                this.o = dVar.c();
            }
            udi udiVar = new udi(this.d, (ViewGroup) this.itemView, this.e, this.f);
            this.p = udiVar;
            udiVar.w(this.D);
        }
    }

    public final void N3(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407e5be1", new Object[]{this, view});
        } else {
            this.A = new com.taobao.android.detail2.core.mainpic.a(view, this.d, this.q, this.f, this.e, this);
        }
    }

    public void O3(View view, pnm.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58019678", new Object[]{this, view, dVar});
            return;
        }
        this.y = (FrameLayout) view.findViewById(R.id.main_render_fl);
        this.u = (ImageView) view.findViewById(R.id.main_pic_open_immediately);
        this.v = (RoundRectCardRoot) view.findViewById(R.id.main_pic_open_immediately_rr);
        this.w = (ImageView) view.findViewById(R.id.main_pic_open_immediately_gaussian_blur);
        this.x = (ImageView) view.findViewById(R.id.main_pic_open_immediately_gaussian_blur_mask);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.default_layout);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.center_default_img);
        this.r = aliUrlImageView;
        int i2 = dgw.APM_VIEW_TOKEN;
        aliUrlImageView.setTag(i2, dgw.APM_VIEW_IGNORE);
        M3(view, dVar);
        o2r.a("init_DetailWeexContainer");
        DetailWeexContainer detailWeexContainer = new DetailWeexContainer(this.d, this.i, "item", "detailDataRefresh");
        this.q = detailWeexContainer;
        detailWeexContainer.J((ViewStub) view.findViewById(R.id.weex_layout));
        this.q.F().setTag(i2, dgw.APM_VIEW_IGNORE);
        txj.e(txj.TAG_TIP, "NdApmToken: initView for weex , ndTagIgnoreView ");
        this.q.X(this.E);
        o2r.b();
        o2r.a("init_initNativeMainPic");
        N3(view);
        o2r.b();
        b0(this.q);
        this.q.q(this.F);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.nav_bg);
        this.t = frameLayout;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = this.e.Y();
        this.t.setLayoutParams(layoutParams);
        this.e.t(this.B);
        this.e.r(new k(this, null));
    }

    public boolean P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public final boolean Q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31e13f53", new Object[]{this})).booleanValue();
        }
        T t = this.c;
        if (t == 0 || ((ue7) t).f31127a != 0) {
            return false;
        }
        return true;
    }

    public void W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606e60ec", new Object[]{this});
            return;
        }
        Activity i2 = this.d.i();
        if (i2 != null) {
            this.r.setImageDrawable(i2.getResources().getDrawable(R.drawable.preload_bottom_item));
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void Y0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd8ef62", new Object[]{this, new Integer(i2)});
            return;
        }
        this.y.setTranslationY(i2);
        txj.e(txj.TAG_HALF_SCREEN, "设置卡片" + ((ue7) this.c).f31127a + "的topmargin: " + i2);
    }

    public final void Y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f3c46d", new Object[]{this});
        } else if (!this.z) {
            this.r.setVisibility(0);
            W3();
            this.z = true;
        }
    }

    public final void Z3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae68639a", new Object[]{this, jSONObject});
            return;
        }
        udi udiVar = this.p;
        if (udiVar != null) {
            udiVar.t(jSONObject);
        }
        com.taobao.android.detail2.core.mainpic.a aVar = this.A;
        if (aVar != null) {
            aVar.n(jSONObject);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void a1(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169a8114", new Object[]{this, new Double(d2)});
        } else {
            this.y.setTranslationY(-((int) (g0() * d2)));
        }
    }

    public final void a4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a9a1ea", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            xmo.u(this.d.i(), jSONObject.getString("type"), jSONObject.getJSONObject("sceneMap"));
        }
    }

    public final void b4(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2be6b4", new Object[]{this, new Boolean(z)});
            return;
        }
        txj.e(txj.TAG_RENDER, "processWeexGesture: " + z);
        if (z) {
            View findViewById = ((ViewGroup) this.itemView).findViewById(R.id.half_screen_round_root);
            if (findViewById instanceof GestureRoundRectCardRoot) {
                GestureRoundRectCardRoot gestureRoundRectCardRoot = (GestureRoundRectCardRoot) findViewById;
                gestureRoundRectCardRoot.setEnableWeexDisallowIntercept(this.d.m().j0());
                gestureRoundRectCardRoot.setWeexConsume(GestureRoundRectCardRoot.WEEX_STATE_CONSUME);
                gestureRoundRectCardRoot.clearPendingEvent();
                return;
            }
            return;
        }
        View findViewById2 = ((ViewGroup) this.itemView).findViewById(R.id.half_screen_round_root);
        if (findViewById2 instanceof GestureRoundRectCardRoot) {
            GestureRoundRectCardRoot gestureRoundRectCardRoot2 = (GestureRoundRectCardRoot) findViewById2;
            gestureRoundRectCardRoot2.setEnableWeexDisallowIntercept(this.d.m().j0());
            gestureRoundRectCardRoot2.setWeexConsume(GestureRoundRectCardRoot.WEEX_STATE_NOT_CONSUME);
            gestureRoundRectCardRoot2.doPendingEvent();
        }
    }

    public final void c4(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e36a5f9", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("info", (Object) jSONObject);
        if (byj.Q(this.d).c("nd_not_check_activity_destroy") || !r19.m(this.d.i())) {
            this.q.W("mediaChannelToWeex", jSONObject2);
        } else {
            txj.e(txj.TAG_TIP, "ND 页面已经销毁，但还在发送 mediaChannelToWeex 。此处主动放弃消息发送。");
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void d1(String str) {
        p0i p0iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976827e5", new Object[]{this, str});
        } else if (this.q != null) {
            o2r.a("onAppear_" + str);
            if (!this.d.r() || !J3().g0() || !this.e.r0()) {
                udi udiVar = this.p;
                if (udiVar != null) {
                    udiVar.i(str);
                }
                T t = this.c;
                if (t == 0 || (p0iVar = ((ue7) t).w0) == null || !p0iVar.d) {
                    ADaemon.resumeFrameLock(4);
                } else {
                    ADaemon.pauseFrameLock(4);
                }
                com.taobao.android.detail2.core.mainpic.a aVar = this.A;
                if (aVar != null) {
                    aVar.j(str);
                }
                this.q.r(str);
            }
            if (this.c != 0) {
                txj.e(txj.TAG_RENDER, getAdapterPosition() + "appear: " + this.q.B() + ", nid: " + ((ue7) this.c).h);
            }
            j83 j83Var = this.f;
            if (j83Var != null) {
                j83Var.o();
            }
            o2r.b();
        }
    }

    public final void d4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92be45c2", new Object[]{this, str});
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        if (!"contain".equals(str) && "cover".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        this.u.setScaleType(scaleType);
    }

    public final void e4(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19748aac", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            str2 = jSONObject.getString("imageFromCache");
            str = jSONObject.getString("blurImageFromCache");
            hashMap.put("imageFromCache", str2);
            hashMap.put("blurImageFromCache", str);
        } else {
            str2 = "";
            str = str2;
        }
        q0j.g("eventProcess", q0j.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_RENDER_SUCCESS, hashMap);
        q0j.a(this.d.h(), "weexImageFromCache", str2);
        q0j.a(this.d.h(), "weexBlurImageFromCache", str);
        HashMap<String, String> z = this.q.D().z();
        if (z != null) {
            q0j.a(this.d.h(), "downloadBinaryTime", z.get(amo.c.POINT_NAME));
            q0j.a(this.d.h(), "binaryCacheType", z.get("cacheType"));
            q0j.a(this.d.h(), "font_init_time", z.get("font_init_time"));
        }
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a33b267", new Object[]{this});
        } else if (this.c != 0 && u0() == 0) {
            if (((ue7) this.c).F) {
                bxj h2 = this.d.h();
                q0j.x(h2, q0j.SECTION_FIRST_RECYCLERVIEW_PRE, "itemId=" + ((ue7) this.c).h);
                bxj h3 = this.d.h();
                q0j.z(h3, q0j.SECTION_FIRST_OTHER_BIND_PRE, "itemId=" + ((ue7) this.c).h);
                return;
            }
            bxj h4 = this.d.h();
            q0j.x(h4, q0j.SECTION_FIRST_RECYCLERVIEW, "itemId=" + ((ue7) this.c).h);
            bxj h5 = this.d.h();
            q0j.z(h5, q0j.SECTION_FIRST_OTHER_BIND, "itemId=" + ((ue7) this.c).h);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public int g0() {
        j83 j83Var;
        u0i u0iVar;
        j83 j83Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70de628d", new Object[]{this})).intValue();
        }
        Activity i2 = this.d.i();
        if (i2 == null || this.c == 0) {
            return 0;
        }
        if (gxq.EXP_ITEM_ARTICLE.equals(I3().R().m)) {
            ue7 ue7Var = (ue7) this.c;
            p0i p0iVar = ue7Var.w0;
            if (p0iVar == null) {
                g9e g9eVar = ue7Var.p0;
                if (!(g9eVar == null || (j83Var = this.f) == null)) {
                    qrc a2 = cbw.a(this.d, ue7Var, g9eVar, j83Var.r(), this.f.t());
                    if (a2.e >= 0) {
                        int a3 = ec7.a(this.d.i(), 100.0f);
                        int i3 = a2.e;
                        if (i3 < a3) {
                            return ec7.a(this.d.i(), 100.0f);
                        }
                        return i3;
                    }
                }
            } else if (!(((ArrayList) p0iVar.b).size() <= 0 || (u0iVar = (u0i) ((ArrayList) ((ue7) this.c).w0.b).get(0)) == null || (j83Var2 = this.f) == null)) {
                qrc b2 = q0i.b(this.d, (ue7) this.c, u0iVar.f29057a, j83Var2.r(), this.f.t());
                int a4 = ec7.a(this.d.i(), 100.0f);
                int i4 = b2.e;
                if (i4 < a4) {
                    return ec7.a(this.d.i(), 100.0f);
                }
                return i4;
            }
        }
        ue7 ue7Var2 = (ue7) this.c;
        int i5 = -1;
        if (ue7Var2.c0 == null) {
            i5 = oj7.b(i2, ((ue7) this.c).F0(), ue7Var2.E0(), -1);
        } else {
            x4m a5 = I3().I().a(ue7Var2.x());
            if (a5.a()) {
                i5 = a5.f31144a;
            }
        }
        if (i5 < 0) {
            return ec7.a(i2, i2.getResources().getDimension(R.dimen.new_detail_half_screen_item_offset));
        }
        int a6 = ec7.a(this.d.i(), 100.0f);
        if (i5 < a6) {
            return a6;
        }
        return i5;
    }

    public final void g4(String str, String str2, String str3, String str4) {
        dh7 dh7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8182d0c", new Object[]{this, str, str2, str3, str4});
            return;
        }
        Animation S3 = S3(str2, str3, str4);
        if (S3 != null) {
            str.hashCode();
            if (str.equals("navBar") && (dh7Var = this.e) != null) {
                dh7Var.T0(S3);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void j1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506c035", new Object[]{this, str});
        } else if (this.q != null) {
            if (G3()) {
                txj.a(txj.TAG_INSIDE_DETAIL, "ItemCardViewHolder onDisAppear. enableInsideDetailPageForNode True");
            } else if (!this.d.r() || !J3().g0() || !this.e.r0()) {
                udi udiVar = this.p;
                if (udiVar != null) {
                    udiVar.m(str);
                }
                com.taobao.android.detail2.core.mainpic.a aVar = this.A;
                if (aVar != null) {
                    aVar.k(str);
                }
            }
            this.q.x(str);
            if (this.c != 0) {
                txj.e(txj.TAG_RENDER, getAdapterPosition() + "disappear: " + this.q.B() + ", nid: " + ((ue7) this.c).f31127a);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9588ec1", new Object[]{this});
        } else if (G3()) {
            udi udiVar = this.p;
            if (udiVar != null) {
                udiVar.r();
            }
            com.taobao.android.detail2.core.mainpic.a aVar = this.A;
            if (aVar != null) {
                aVar.q();
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void m1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37641c0f", new Object[]{this, str});
        } else if (G3()) {
            udi udiVar = this.p;
            if (udiVar != null) {
                udiVar.m(str);
            }
            com.taobao.android.detail2.core.mainpic.a aVar = this.A;
            if (aVar != null) {
                aVar.k(str);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa32fdb4", new Object[]{this});
            return;
        }
        udi udiVar = this.p;
        if (udiVar != null) {
            udiVar.p();
        }
        com.taobao.android.detail2.core.mainpic.a aVar = this.A;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab1c2fc", new Object[]{this});
            return;
        }
        udi udiVar = this.p;
        if (udiVar != null) {
            udiVar.z((ue7) this.c);
        }
        com.taobao.android.detail2.core.mainpic.a aVar = this.A;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.s = true;
        DetailWeexContainer detailWeexContainer = this.q;
        if (detailWeexContainer != null) {
            detailWeexContainer.w();
        }
        udi udiVar = this.p;
        if (udiVar != null) {
            udiVar.l();
        }
        com.taobao.android.detail2.core.mainpic.a aVar = this.A;
        if (aVar != null) {
            aVar.i();
        }
        this.u.removeCallbacks(this.C);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        DetailWeexContainer detailWeexContainer = this.q;
        if (detailWeexContainer != null) {
            detailWeexContainer.b0();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        DetailWeexContainer detailWeexContainer = this.q;
        if (detailWeexContainer != null) {
            detailWeexContainer.c0();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        } else if (!this.d.r() || !this.d.j().N().g0() || !this.e.r0()) {
            udi udiVar = this.p;
            if (udiVar != null) {
                udiVar.r();
            }
            com.taobao.android.detail2.core.mainpic.a aVar = this.A;
            if (aVar != null) {
                aVar.q();
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public void p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7817f9", new Object[]{this});
        } else if ((!this.d.r() || !this.d.j().N().g0() || !this.e.r0()) && !G3()) {
            udi udiVar = this.p;
            if (udiVar != null) {
                udiVar.s();
            }
            com.taobao.android.detail2.core.mainpic.a aVar = this.A;
            if (aVar != null) {
                aVar.r();
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public TBErrorView r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("f5501a78", new Object[]{this});
        }
        TBErrorView tBErrorView = new TBErrorView(this.d.i());
        tBErrorView.setBackgroundColor(-1);
        tBErrorView.setVisibility(8);
        tBErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, wmc.REFRESH, new e());
        return tBErrorView;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public HashMap<String, String> u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e68fed76", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.c != 0) {
            hashMap.put("spm", muv.a(this.c, "a2141.22412911") + ".newdetail");
        }
        return hashMap;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder
    public HashMap<String, String> v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c31bb07e", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("spm-cnt", "a2141.22412911");
        return hashMap;
    }

    public final void z3(JSONObject jSONObject, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4991e207", new Object[]{this, jSONObject, new Integer(i2)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cardnum", (Object) String.valueOf(i2));
        if (jSONObject != null) {
            jSONObject.put(VerticalAbsViewHolder.KEY_CARD_EXTRA_DATA, (Object) jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f extends k97 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/biz/detailcard/viewholder/ItemCardViewHolder$6");
        }

        @Override // tb.k97, tb.qtk
        public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ab357c9", new Object[]{this, aVar, str, str2});
                return;
            }
            x3w f3 = ItemCardViewHolder.f3(ItemCardViewHolder.this);
            q0j.d(f3, q0j.ERROR_CODE_WEEX_RENDER_EXCEPTION, "[fixWeexContainer]weex渲染异常, errorCode: " + str + "errorMsg: " + str2, true);
        }

        @Override // tb.k97, tb.qtk
        public void c(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc9eb57", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            } else if (ItemCardViewHolder.this.u0() == 0) {
                bxj h = ItemCardViewHolder.Z2(ItemCardViewHolder.this).h();
                q0j.x(h, q0j.SECTION_FIRST_MAIN_WEEXV2_RENDER, "itemId=" + ((ue7) ItemCardViewHolder.b3(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
                bxj h2 = ItemCardViewHolder.c3(ItemCardViewHolder.this).h();
                q0j.z(h2, q0j.SECTION_FIRST_MAIN_WEEX_GET_DETAIL_RENDER, "itemId=" + ((ue7) ItemCardViewHolder.d3(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
            } else {
                txj.e(txj.TAG_RENDER, "weex渲染成功：, index: " + ItemCardViewHolder.this.u0() + "itemId=" + ((ue7) ItemCardViewHolder.e3(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
            }
        }

        @Override // tb.k97, tb.qtk
        public void d(com.taobao.android.detail2.core.framework.base.weex.a aVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6430871", new Object[]{this, aVar, view});
            } else if (ItemCardViewHolder.this.u0() == 0) {
                bxj h = ItemCardViewHolder.T2(ItemCardViewHolder.this).h();
                q0j.x(h, q0j.SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE, "itemId=" + ((ue7) ItemCardViewHolder.U2(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
                bxj h2 = ItemCardViewHolder.V2(ItemCardViewHolder.this).h();
                q0j.z(h2, q0j.SECTION_FIRST_MAIN_WEEXV2_RENDER, "itemId=" + ((ue7) ItemCardViewHolder.W2(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
            } else {
                txj.e(txj.TAG_RENDER, "weexInstance创建完成：, index: " + ItemCardViewHolder.this.u0() + ", itemId=" + ((ue7) ItemCardViewHolder.Y2(ItemCardViewHolder.this)).h + ", url=" + aVar.w());
            }
        }

        @Override // tb.k97
        public void g(com.taobao.android.detail2.core.framework.base.weex.a aVar, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f8b7f51", new Object[]{this, aVar, jSONObject});
            } else if (ItemCardViewHolder.this.u0() == 0) {
                if (!((ue7) ItemCardViewHolder.i3(ItemCardViewHolder.this)).A) {
                    ((ue7) ItemCardViewHolder.k3(ItemCardViewHolder.this)).o0(System.currentTimeMillis(), false);
                }
                if (((ue7) ItemCardViewHolder.l3(ItemCardViewHolder.this)).F) {
                    bxj h = ItemCardViewHolder.m3(ItemCardViewHolder.this).h();
                    q0j.z(h, q0j.SECTION_FIRST_MAIN_WEEX_REFRESH_PRE, "itemId=" + ((ue7) ItemCardViewHolder.n3(ItemCardViewHolder.this)).h);
                    return;
                }
                bxj h2 = ItemCardViewHolder.o3(ItemCardViewHolder.this).h();
                q0j.z(h2, q0j.SECTION_FIRST_MAIN_WEEX_REFRESH, "itemId=" + ((ue7) ItemCardViewHolder.p3(ItemCardViewHolder.this)).h);
            }
        }

        @Override // tb.k97
        public void h(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f50e29b", new Object[]{this, aVar, str, jSONObject});
            } else if (ItemCardViewHolder.this.u0() == 0) {
                bxj h = ItemCardViewHolder.g3(ItemCardViewHolder.this).h();
                q0j.z(h, q0j.SECTION_FIRST_MAIN_WEEXV2_INSTANCE_CREATE, "itemId=" + ((ue7) ItemCardViewHolder.h3(ItemCardViewHolder.this)).h);
            }
        }

        @Override // tb.k97
        public void i(com.taobao.android.detail2.core.framework.base.weex.a aVar, ContainerError containerError, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3e94c61", new Object[]{this, aVar, containerError, str});
                return;
            }
            int i = g.$SwitchMap$com$taobao$android$detail2$core$framework$base$weex$ContainerError[containerError.ordinal()];
            if (i == 1) {
                x3w q3 = ItemCardViewHolder.q3(ItemCardViewHolder.this);
                q0j.d(q3, q0j.ERROR_CODE_WEEX_URL_CHANGE, "[fixWeexContainer]" + str, true);
                if (ItemCardViewHolder.this.u0() == 0 && !((ue7) ItemCardViewHolder.r3(ItemCardViewHolder.this)).A) {
                    ((ue7) ItemCardViewHolder.s3(ItemCardViewHolder.this)).o0(System.currentTimeMillis(), true);
                }
            } else if (i == 2) {
                x3w t3 = ItemCardViewHolder.t3(ItemCardViewHolder.this);
                q0j.d(t3, q0j.ERROR_CODE_WEEX_URL_EMPTY, "[fixWeexContainer]" + str, true);
            }
        }

        @Override // tb.k97
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d083db97", new Object[]{this});
            } else if (ItemCardViewHolder.this.u0() == 0) {
                if (!((ue7) ItemCardViewHolder.v3(ItemCardViewHolder.this)).A) {
                    ((ue7) ItemCardViewHolder.w3(ItemCardViewHolder.this)).o0(System.currentTimeMillis(), false);
                }
                if (zgj.f32756a == 1 && com.taobao.weex.b.f14135a != -1 && System.currentTimeMillis() - com.taobao.weex.b.f14135a >= 0) {
                    q0j.a(ItemCardViewHolder.x3(ItemCardViewHolder.this).h(), "fontPrefetchHit", "true");
                }
            }
        }
    }

    public final AlphaAnimation R3(String str, String str2) {
        AlphaAnimation alphaAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("47d8bacc", new Object[]{this, str, str2});
        }
        int X3 = X3(str2);
        if ("in".equals(str)) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = "out".equals(str) ? new AlphaAnimation(1.0f, 0.0f) : null;
        }
        if (alphaAnimation != null) {
            alphaAnimation.setDuration(X3);
            alphaAnimation.setFillAfter(true);
        }
        return alphaAnimation;
    }

    public final TranslateAnimation T3(String str, String str2) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TranslateAnimation) ipChange.ipc$dispatch("262c3b87", new Object[]{this, str, str2});
        }
        int X3 = X3(str2);
        if ("in".equals(str)) {
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, -this.e.O(), 0.0f);
        } else {
            translateAnimation = "out".equals(str) ? new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.e.O()) : null;
        }
        if (translateAnimation != null) {
            translateAnimation.setDuration(X3);
            translateAnimation.setFillAfter(true);
        }
        return translateAnimation;
    }

    public final int X3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd2f7882", new Object[]{this, str})).intValue();
        }
        try {
            return ((int) Double.parseDouble(str)) * 1000;
        } catch (Exception unused) {
            txj.e("NavBar动画创建", "时间解析失败，duration=" + str);
            return 0;
        }
    }

    /* renamed from: U3 */
    public boolean e1(ue7 ue7Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24e195b9", new Object[]{this, ue7Var})).booleanValue();
        }
        if (ue7Var == null) {
            return false;
        }
        f4();
        C3();
        if (D3(false)) {
            z = true;
        } else {
            Y3();
            z = false;
        }
        if (B3()) {
            L3();
            this.r.setVisibility(8);
            this.o.setVisibility(0);
            z = true;
        } else {
            this.o.setVisibility(8);
        }
        o2r.a("bindMainPicContainer");
        com.taobao.android.detail2.core.mainpic.a aVar = this.A;
        if (aVar != null) {
            if (aVar.h(ue7Var)) {
                this.A.o(0);
                this.r.setVisibility(8);
            } else {
                this.A.o(8);
            }
            p0i p0iVar = ue7Var.w0;
            if (p0iVar == null) {
                sqj.b(this.itemView, "");
            } else if (p0iVar.d) {
                sqj.b(this.itemView, sqj.CARD_PIC_BUTTON);
            } else {
                sqj.b(this.itemView, sqj.CARD_VIDEO_BUTTON);
            }
        }
        o2r.b();
        o2r.a("bindFixWeexContainer");
        if (A3()) {
            z = true;
        }
        o2r.b();
        T t = this.c;
        if (t != 0) {
            ue7 ue7Var2 = (ue7) t;
            if (ue7Var2.F && ue7Var2.N() && !((ue7) this.c).A && I3().D0()) {
                ue7 ue7Var3 = (ue7) this.c;
                ue7Var3.s0 = true;
                ue7Var3.t0 = true;
                ue7Var3.u0 = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r8.equals(tb.reu.TRANSITION_TYPE_FADE) != false) goto L_0x0052;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.animation.Animation S3(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "dbff282"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            android.view.animation.Animation r7 = (android.view.animation.Animation) r7
            return r7
        L_0x001e:
            int r3 = r8.hashCode()
            r4 = 3135100(0x2fd67c, float:4.393211E-39)
            if (r3 == r4) goto L_0x0048
            r0 = 747804969(0x2c929929, float:4.1665738E-12)
            if (r3 == r0) goto L_0x003d
            r0 = 1373376394(0x51dc0f8a, float:1.18144188E11)
            if (r3 == r0) goto L_0x0032
            goto L_0x0051
        L_0x0032:
            java.lang.String r0 = "positionAndFade"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x003d:
            java.lang.String r0 = "position"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0051
            r0 = 0
            goto L_0x0052
        L_0x0048:
            java.lang.String r2 = "fade"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = -1
        L_0x0052:
            if (r0 == 0) goto L_0x007a
            if (r0 == r1) goto L_0x005b
            android.view.animation.AlphaAnimation r7 = r6.R3(r7, r9)
            return r7
        L_0x005b:
            android.view.animation.AnimationSet r8 = new android.view.animation.AnimationSet
            r8.<init>(r1)
            android.view.animation.TranslateAnimation r0 = r6.T3(r7, r9)
            r8.addAnimation(r0)
            android.view.animation.AlphaAnimation r7 = r6.R3(r7, r9)
            r8.addAnimation(r7)
            int r7 = r6.X3(r9)
            long r2 = (long) r7
            r8.setDuration(r2)
            r8.setFillAfter(r1)
            return r8
        L_0x007a:
            android.view.animation.TranslateAnimation r7 = r6.T3(r7, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder.S3(java.lang.String, java.lang.String, java.lang.String):android.view.animation.Animation");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r3.equals(tb.se7.OPERATE_MEDIA_CHANNEL_TO_NATIVE) == false) goto L_0x004a;
     */
    /* renamed from: V3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.gl8 k1(tb.se7 r10) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.biz.detailcard.viewholder.ItemCardViewHolder.k1(tb.se7):tb.gl8");
    }

    public final boolean D3(boolean z) {
        x4m x4mVar;
        String str;
        String str2;
        String str3;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8252430a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.d.i() == null) {
            return false;
        }
        T t = this.c;
        if (t == 0) {
            txj.e(txj.TAG_RENDER, "bindPlaceHolderComponent失败，currentnode为空");
            return false;
        }
        ue7 ue7Var = (ue7) t;
        if (ue7Var.c0 == null) {
            txj.e(txj.TAG_RENDER, "bindPlaceHolderComponent失败，mPlaceHolderComponent为空");
            if (((ue7) this.c).f31127a == 0) {
                q0j.a(this.d.h(), "NPicFail", "componentNull");
            }
            return false;
        } else if (!ue7Var.R() || (((ue7) this.c).Q() && !z)) {
            txj.e(txj.TAG_RENDER, "bindPlaceHolderComponent失败，已经绑定过placeholder，无需处理");
            return false;
        } else {
            String x = ((ue7) this.c).x();
            String j2 = hsm.j(this.d.i(), ((ue7) this.c).c0.b());
            if (TextUtils.isEmpty(x) || TextUtils.isEmpty(j2)) {
                q0j.f(this.c, q0j.SCENE_OPEN_IMMEDIATELY, q0j.ERROR_CODE_OPEN_IMMEDIATELY_DATA_PART_ABSENT, "瞬开部分数据缺失，url：" + j2 + "scene: " + x, false);
                if (((ue7) this.c).f31127a != 0) {
                    return false;
                }
                if (TextUtils.isEmpty(x)) {
                    q0j.a(this.d.h(), "NPicFailDetail1", "sceneEmpty");
                }
                if (TextUtils.isEmpty(j2)) {
                    q0j.a(this.d.h(), "NPicFailDetail2", "urlEmpty");
                }
                q0j.a(this.d.h(), "NPicFail", "partAbsent");
                return false;
            }
            x4m a2 = I3().I().a(x);
            if (!a2.a()) {
                txj.e(txj.TAG_RENDER, "bindPlaceHolderComponent失败, scene:" + x + ", model.mMarginTop: " + a2.f31144a + ", model.mResizeMode: " + a2.b + ", model.mHeight: " + a2.c + ", model.mHalfHeight: " + a2.d);
                if (((ue7) this.c).f31127a == 0) {
                    q0j.a(this.d.h(), "NPicFail", "cacheModelInvalid");
                    if (a2.f31144a < 0) {
                        q0j.a(this.d.h(), "NPicFailDetail1", "marginTopInvalid");
                    }
                    if (a2.c < 0) {
                        q0j.a(this.d.h(), "NPicFailDetail2", "heightInvalid");
                    }
                    if (TextUtils.isEmpty(a2.b)) {
                        q0j.a(this.d.h(), "NPicFailDetail3", "resizeModeInvalid");
                    }
                }
                return false;
            }
            this.r.setVisibility(4);
            TaobaoImageUrlStrategy.ImageBlur F3 = F3();
            if (!Q3() || (!r19.X0() && (this.d.l() == null || !this.d.l().c()))) {
                x4mVar = a2;
                str2 = txj.TAG_RENDER;
                str3 = x;
                str = ", model.mHalfHeight: ";
                s0m.B().T(j2).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.u, ((ue7) this.c).f31127a, false, I3().D0(), false)).failListener(new h(this.d, this.c, false, false)).fetch();
                if (F3 != null) {
                    s0m.B().T(hsm.b(this.d.i(), ((ue7) this.c).c0.b(), F3)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.w, ((ue7) this.c).f31127a, true, I3().D0(), false)).failListener(new h(this.d, this.c, true, false)).fetch();
                } else {
                    this.w.setVisibility(8);
                }
            } else {
                PhenixCreator addLoaderExtra = s0m.B().T(j2).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE);
                cxj cxjVar = this.d;
                ImageView imageView = this.u;
                int i3 = ((ue7) this.c).f31127a;
                boolean D0 = I3().D0();
                x4mVar = a2;
                str2 = txj.TAG_RENDER;
                str3 = x;
                addLoaderExtra.succListener(new i(cxjVar, imageView, i3, false, D0, false)).failListener(new h(this.d, this.c, false, false)).fetch();
                if (r19.C()) {
                    s0m.B().T(r19.X()).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.w, ((ue7) this.c).f31127a, true, I3().D0(), false)).failListener(new h(this.d, this.c, true, false)).fetch();
                } else if (this.d.j().N().y0()) {
                    String c2 = hsm.c(this.d.i(), ((ue7) this.c).c0.b(), F3, true);
                    if (!TextUtils.isEmpty(c2)) {
                        s0m.B().T(c2).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.w, ((ue7) this.c).f31127a, true, I3().D0(), false)).failListener(new h(this.d, this.c, true, false)).fetch();
                    }
                } else {
                    s0m.B().T(j2).bitmapProcessors(true, new yf2(this.w.getContext(), J3().x(), 2)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, hsm.PHENIX_PLAVEHOLDER_PIC_BIZ_CODE).succListener(new i(this.d, this.w, ((ue7) this.c).f31127a, true, I3().D0(), false)).failListener(new h(this.d, this.c, true, false)).fetch();
                }
                str = ", model.mHalfHeight: ";
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.v.getLayoutParams();
            layoutParams.topMargin = x4mVar.f31144a;
            com.taobao.android.detail2.core.framework.data.global.a I3 = I3();
            ue7 ue7Var2 = (ue7) this.c;
            boolean J0 = I3.J0(ue7Var2.f31127a, ue7Var2.b);
            if (J0) {
                i2 = x4mVar.d;
            } else {
                i2 = x4mVar.c;
            }
            layoutParams.height = i2;
            int i4 = x4mVar.f;
            if (i4 >= 0 && i4 != x4m.g && J0) {
                layoutParams.width = i4;
            }
            int i5 = x4mVar.e;
            if (i5 >= 0 && i5 != x4m.g && !J0) {
                layoutParams.width = i5;
            }
            d4(x4mVar.b);
            this.v.setLayoutParams(layoutParams);
            if (!I3().k0() || ((ue7) this.c).f31127a != 0) {
                this.v.setCornerRadius(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                cbw.p(this.d.i());
                float j3 = this.d.j().K().j(I3().o().layoutInfo.borderRadius);
                this.v.setCornerRadius(new float[]{j3, j3, j3, j3, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            ((ue7) this.c).V();
            q0j.g("eventProcess", q0j.UMBRELLA_TAG_PLACEHOLDER_RENDER_SUCCESS, null);
            txj.e(str2, "bindPlaceHolderComponent成功, scene:" + str3 + ", model.mMarginTop: " + x4mVar.f31144a + ", model.mResizeMode: " + x4mVar.b + ", model.mHeight: " + x4mVar.c + str + x4mVar.d);
            return true;
        }
    }
}
