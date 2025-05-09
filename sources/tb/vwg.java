package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.mzb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vwg implements wlb, trc, vlc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String o = "CardRenderManager";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f30295a;
    private final k5h b;
    private ViewGroup c;
    private VideoRoundCornerLayout d;
    private ImageView e;
    private VideoRoundCornerLayout f;
    private TUrlImageView g;
    private View h;
    private AlphaAnimation i;
    private long j;
    private FrameLayout.LayoutParams k;
    private ImageView l;
    private boolean m;
    private boolean n = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                vwg.this.U();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends mzb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/live/manager/render/LiveCardRenderManager$2");
        }

        @Override // tb.mzb.a, tb.mzb
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd31c367", new Object[]{this});
            } else if (vwg.l(vwg.this).k1().getDWInstance() != null) {
                ir9.b(vwg.o, "[画幅]直播 addDeviceRotateListener mLayoutParams " + vwg.m(vwg.this).width + "x" + vwg.m(vwg.this).height);
                vwg.l(vwg.this).k1().getDWInstance().f(vwg.m(vwg.this).width, vwg.m(vwg.this).height);
                vwg.l(vwg.this).k1().getDWInstance().getView().setLayoutParams(vwg.m(vwg.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            ((IMessageService) vwg.o(vwg.this).getService(IMessageService.class)).sendMessage(new vrp("VSMSG_longPress", vwg.l(vwg.this).Y().c, null));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements la2<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: b */
        public void a(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7626bc8", new Object[]{this, str, bitmapDrawable});
                return;
            }
            ir9.b(vwg.o, "onDataUpdate mIsBlurEnabled: " + vwg.v(vwg.this) + " ; url:" + str);
            if (vt6.g(str, vwg.l(vwg.this).i1()) && bitmapDrawable != null) {
                if (vwg.v(vwg.this)) {
                    RenderScript renderScript = ((IMediaService) vwg.o(vwg.this).getService(IMediaService.class)).getRenderScript();
                    if (renderScript == null) {
                        renderScript = RenderScript.create(vwg.x(vwg.this).getContext());
                        ((IMediaService) vwg.o(vwg.this).getService(IMediaService.class)).setRenderScript(renderScript);
                    }
                    if (renderScript != null) {
                        Bitmap a2 = hg2.a(20, renderScript, bitmapDrawable.getBitmap());
                        vwg.x(vwg.this).setImageBitmap(a2);
                        if (vwg.F(vwg.this) != null) {
                            vwg.F(vwg.this).setImageBitmap(a2);
                            return;
                        }
                        return;
                    }
                    vwg.x(vwg.this).setImageDrawable(bitmapDrawable);
                    return;
                }
                vwg.x(vwg.this).setImageDrawable(bitmapDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f30300a;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public e(View view, ViewGroup.LayoutParams layoutParams) {
            this.f30300a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (vwg.l(vwg.this).k1().getDWInstance() != null) {
                ir9.b(vwg.o, "addVideoView: " + this.f30300a + " ,layoutParams width:" + this.b.width + " height:" + this.b.height);
                vwg.G(vwg.this).addView(this.f30300a, 0, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f30301a;

        public f(ViewGroup viewGroup) {
            this.f30301a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f30301a.getWidth() == 0 || this.f30301a.getHeight() == 0) {
                HashMap<String, String> c = xau.c(false, vwg.l(vwg.this).P(), vwg.I(vwg.this), this.f30301a);
                ir9.b(vwg.o, "requestLayout in onVideoStart for size is 0, property: " + JSON.toJSONString(c));
                vwg.this.Z(this.f30301a);
                xau.Q(c);
            }
        }
    }

    static {
        t2o.a(468713983);
        t2o.a(468713934);
        t2o.a(468714525);
        t2o.a(468714532);
    }

    public vwg(k5h k5hVar) {
        this.b = k5hVar;
        this.f30295a = k5hVar.U();
        W();
    }

    public static /* synthetic */ ImageView F(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("746bbd30", new Object[]{vwgVar});
        }
        return vwgVar.l;
    }

    public static /* synthetic */ VideoRoundCornerLayout G(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoRoundCornerLayout) ipChange.ipc$dispatch("2a9480c0", new Object[]{vwgVar});
        }
        return vwgVar.d;
    }

    public static /* synthetic */ ViewGroup I(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a83cda37", new Object[]{vwgVar});
        }
        return vwgVar.c;
    }

    private boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa05297", new Object[]{this})).booleanValue();
        }
        if (!pr9.j() || !akt.p2("ShortVideo.enableLargeScreenLiveCardBlurView", true)) {
            return false;
        }
        return true;
    }

    private void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f81a48", new Object[]{this});
            return;
        }
        VideoRoundCornerLayout videoRoundCornerLayout = this.f;
        if (videoRoundCornerLayout != null && this.g != null) {
            videoRoundCornerLayout.setVisibility(8);
            this.f.removeView(this.g);
        }
    }

    private void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9344b335", new Object[]{this});
            return;
        }
        this.b.N().addCardLifecycleListener(this);
        this.b.E0().addMediaLifecycleListener(this);
        this.b.F0().addLivePlayerListener(this);
    }

    public static /* synthetic */ k5h l(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5h) ipChange.ipc$dispatch("35e07902", new Object[]{vwgVar});
        }
        return vwgVar.b;
    }

    public static /* synthetic */ FrameLayout.LayoutParams m(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("19a09e2d", new Object[]{vwgVar});
        }
        return vwgVar.k;
    }

    public static /* synthetic */ FluidContext o(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("d95ea3a5", new Object[]{vwgVar});
        }
        return vwgVar.f30295a;
    }

    public static /* synthetic */ boolean v(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93da1ea6", new Object[]{vwgVar})).booleanValue();
        }
        return vwgVar.m;
    }

    public static /* synthetic */ ImageView x(vwg vwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("e5e03c2f", new Object[]{vwgVar});
        }
        return vwgVar.e;
    }

    public void O(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f4cce", new Object[]{this, viewGroup});
        } else if (viewGroup == null) {
        } else {
            if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
                nwv.A0(new f(viewGroup), akt.w2("ShortVideo.ensureLayoutDelayTime", 100));
            }
        }
    }

    public AlphaAnimation P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("43e87f4b", new Object[]{this});
        }
        return this.i;
    }

    public VideoRoundCornerLayout Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoRoundCornerLayout) ipChange.ipc$dispatch("f3dbb890", new Object[]{this});
        }
        return this.d;
    }

    public FrameLayout.LayoutParams R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b1ecf96", new Object[]{this});
        }
        return this.k;
    }

    public long T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582d5c49", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a70dbde", new Object[]{this});
            return;
        }
        ir9.b(o, "直播封面图 隐藏，hideBlurBackground");
        this.e.setVisibility(8);
        this.h.setVisibility(8);
    }

    public void Y(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b79c6c", new Object[]{this, view, layoutParams});
        } else if (view != null) {
            ((IFeedsListService) this.f30295a.getService(IFeedsListService.class)).runOnLayoutSafe(this.c, new e(view, layoutParams), "onLiveVideoViewUpdated");
        }
    }

    public void a0(AlphaAnimation alphaAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da53ffdd", new Object[]{this, alphaAnimation});
        } else {
            this.i = alphaAnimation;
        }
    }

    public void b0(VideoRoundCornerLayout videoRoundCornerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89adb36e", new Object[]{this, videoRoundCornerLayout});
        } else {
            this.d = videoRoundCornerLayout;
        }
    }

    public void c0(FrameLayout.LayoutParams layoutParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b960bfa0", new Object[]{this, layoutParams});
            return;
        }
        if (("[画幅]直播 setLayoutParams mLayoutParams " + layoutParams) != null) {
            str = this.k.width + "x" + this.k.height;
        } else {
            str = "null";
        }
        ir9.b(o, str);
        this.k = layoutParams;
    }

    public void d0(Boolean bool, Boolean bool2) {
        View b0;
        View b02;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f5f41", new Object[]{this, bool, bool2});
        } else if (this.b.f0() != null) {
            if (!(bool == null || (b02 = this.b.f0().b0(R.id.v_graymask_top)) == null)) {
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 4;
                }
                b02.setVisibility(i);
            }
            if (bool2 != null && (b0 = this.b.f0().b0(R.id.v_graymask_bottom)) != null) {
                if (!bool2.booleanValue()) {
                    i2 = 4;
                }
                b0.setVisibility(i2);
            }
        }
    }

    @Override // tb.wlb
    public void onActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24609e2a", new Object[]{this, uq9Var, aVar, new Integer(i)});
        }
    }

    @Override // tb.vlc
    public void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77df115", new Object[]{this, uq9Var, iMediaPlayer});
        }
    }

    @Override // tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            return;
        }
        String b2 = this.b.l1().b();
        if (this.m) {
            i = 512;
        } else {
            i = 1024;
        }
        String i2 = gpe.i(null, this.f30295a.getContext(), b2, i, i, ImageLoader.b.a(), false);
        this.b.z1(i2);
        FluidSDK.getImageAdapter().load(i2, new d());
    }

    @Override // tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onDisAppear(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.vlc
    public void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78defb6", new Object[]{this, uq9Var, iMediaPlayer});
        }
    }

    @Override // tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        this.e.setImageBitmap(null);
        this.e.setImageDrawable(null);
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            this.l.setImageDrawable(null);
        }
    }

    @Override // tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            return;
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        V();
    }

    @Override // tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f263d10f", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.wlb
    public void onWillDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9290cf3b", new Object[]{this, uq9Var});
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cffcb0", new Object[]{this});
            return;
        }
        ir9.b(o, "onPageStateChangedShowCover");
        if (this.n) {
            this.n = false;
        } else {
            onShowCover(this.b);
        }
    }

    public void Z(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5e40e9", new Object[]{this, viewGroup});
            return;
        }
        atb dWInstance = this.b.k1().getDWInstance();
        if (dWInstance != null && dWInstance.getView() == viewGroup && viewGroup.getParent() == this.d) {
            this.c.forceLayout();
            viewGroup.forceLayout();
            this.d.forceLayout();
            ViewGroup viewGroup2 = (ViewGroup) this.d.getParent();
            if (viewGroup2 != null) {
                int indexOfChild = viewGroup2.indexOfChild(this.d);
                viewGroup2.removeView(this.d);
                viewGroup2.addView(this.d, indexOfChild);
            }
            this.d.removeView(viewGroup);
            ir9.b(o, "[画幅]直播 rebuildContentView mLayoutParams " + this.k.width + "x" + this.k.height);
            this.d.addView(viewGroup, 0, this.k);
            this.c.requestLayout();
        }
    }

    @Override // tb.wlb
    public void onBindData(uq9 uq9Var, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2231971b", new Object[]{this, uq9Var, aVar, new Integer(i), list});
        }
    }

    @Override // tb.vlc
    public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ir9.b(o, "直播封面图 显示，onError");
        this.b.h1().e.setVisibility(0);
        this.b.h1().h.setVisibility(0);
        return false;
    }

    @Override // tb.vlc
    public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (3 == j) {
            if (!uwg.a()) {
                ir9.b(o, "直播封面图 动画隐藏");
                this.e.startAnimation(this.i);
            }
        } else if (12100 == j || (c5g.c("live") && c5g.d("live") && 12101 == j)) {
            if (uwg.a()) {
                U();
            }
            ir9.b(o, "IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START_IN_RENDER_THREAD||MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE waht=" + j);
        }
        return false;
    }

    public static MediaLiveInfo S(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("294a057a", new Object[]{cVar});
        }
        MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
        mediaLiveInfo.h265 = false;
        mediaLiveInfo.liveId = cVar.g();
        JSONArray i = cVar.i();
        ir9.b(o, "getLiveInfo liveUrlsArray= " + i);
        if (i == null || i.size() <= 0) {
            ir9.b(o, "getLiveInfo 老版单路码流");
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            QualityLiveItem qualityLiveItem = new QualityLiveItem();
            qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
            Map<String, String> h = cVar.h();
            for (String str : h.keySet()) {
                if (MediaConstant.RTCLIVE_URL_NAME.equalsIgnoreCase(str)) {
                    qualityLiveItem.rtcLiveUrl = h.get(str);
                } else if ("flv".equalsIgnoreCase(str)) {
                    qualityLiveItem.flvUrl = h.get(str);
                } else if ("hls".equalsIgnoreCase(str)) {
                    qualityLiveItem.hlsUrl = h.get(str);
                }
            }
            mediaLiveInfo.liveUrlList.add(qualityLiveItem);
            try {
                mediaLiveInfo.liveUrlListJson = JSON.parseArray(JSON.toJSONString(mediaLiveInfo.liveUrlList));
            } catch (Throwable th) {
                th.printStackTrace();
                ir9.b(o, "getLiveInfo Error: " + th.getMessage());
            }
        } else {
            ir9.b(o, "getLiveInfo 新版多路码流");
            mediaLiveInfo.liveUrlListJson = i;
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i2 = 0; i2 < i.size(); i2++) {
                try {
                    mediaLiveInfo.liveUrlList.add((QualityLiveItem) JSON.parseObject(i.getJSONObject(i2).toJSONString(), QualityLiveItem.class));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    ir9.b(o, "getLiveInfo Error: " + th2.getMessage());
                }
            }
        }
        return mediaLiveInfo;
    }

    public void M(Bitmap bitmap) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fb7146", new Object[]{this, bitmap});
            return;
        }
        this.n = true;
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            this.g = new TUrlImageView(this.f30295a.getContext());
            if (this.b.l1() == null || !this.b.l1().e()) {
                z = false;
            }
            DWAspectRatio f2 = bbw.f(z, this.b.o1().e());
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            if (TextUtils.equals(f2.name(), DWAspectRatio.DW_FIT_CENTER.name())) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            this.g.setImageDrawable(bitmapDrawable);
            this.g.setScaleType(scaleType);
            ir9.b(o, "[画幅]直播 addTransitionView mLayoutParams " + this.k.width + "x" + this.k.height);
            this.f.addView(this.g, 0, this.k);
            this.f.setVisibility(0);
        }
    }

    @Override // tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.b.W();
        this.c = frameLayout;
        this.j = hol.b(this.b.U());
        this.d = (VideoRoundCornerLayout) frameLayout.findViewById(R.id.live_host);
        this.e = (ImageView) frameLayout.findViewById(R.id.imv_cover);
        this.f = (VideoRoundCornerLayout) frameLayout.findViewById(R.id.live_transition);
        if (N()) {
            this.l = (ImageView) frameLayout.findViewById(R.id.imv_cover_large_screen);
        }
        this.h = frameLayout.findViewById(R.id.v_gray_mask);
        this.k = new FrameLayout.LayoutParams(-1, -1);
        ir9.b(o, "[画幅]直播 mLayoutParams " + this.k.width + "x" + this.k.height);
        if (!vt6.i(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("isLiveBlurCoverEnabled", "false"), false) || p91.l()) {
            z = false;
        }
        this.m = z;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.i = alphaAnimation;
        alphaAnimation.setAnimationListener(new a());
        this.i.setDuration(250L);
        ((IDeviceService) this.b.U().getService(IDeviceService.class)).addDeviceRotateListener((mzb.a) new b());
        ViewProxy.setOnLongClickListener(this.b.W(), new c());
    }
}
