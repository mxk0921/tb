package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.card.cards.video.layer.cover.VideoCoverImageView;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.avplayer.r;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a6w extends gr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String h = "VideoCoverLayer";
    private static final String i = "VideoCoverLayer";
    private final prp e;
    private ImageView f;
    private boolean g = eps.f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            ((IMessageService) a6w.P(a6w.this).U().getService(IMessageService.class)).sendMessage(new vrp("VSMSG_longPress", a6w.P(a6w.this).b0(), null));
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            ((IMessageService) a6w.P(a6w.this).U().getService(IMessageService.class)).sendMessage(new vrp("VSMSG_longPress", a6w.P(a6w.this).b0(), null));
            return false;
        }
    }

    static {
        t2o.a(468714006);
    }

    public a6w(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.e = prpVar;
    }

    public static /* synthetic */ prp P(a6w a6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prp) ipChange.ipc$dispatch("13dd52df", new Object[]{a6wVar});
        }
        return a6wVar.e;
    }

    private void V(ImageView imageView, String str, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ca86cb", new Object[]{this, imageView, str, r8eVar});
        } else if (imageView != null) {
            imageView.setScaleType(r8eVar.f);
            ImageStrategyConfig imageStrategyConfig = FluidSDK.getImageAdapter().getImageStrategyConfig(r8eVar);
            if (imageView instanceof TUrlImageView) {
                TUrlImageView tUrlImageView = (TUrlImageView) imageView;
                tUrlImageView.setStrategyConfig(imageStrategyConfig);
                tUrlImageView.setImageUrl(str);
            } else if (imageView instanceof VideoCoverImageView) {
                ((VideoCoverImageView) imageView).setCoverImageUrl(str);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(a6w a6wVar, String str, Object... objArr) {
        if (str.hashCode() == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/cover/VideoCoverLayer");
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "VideoCoverLayer";
    }

    public ImageView Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("307a7faa", new Object[]{this});
        }
        return this.f;
    }

    public void T(int i2, int i3, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51aced8", new Object[]{this, new Integer(i2), new Integer(i3), drawable, str});
            return;
        }
        ir9.b(prp.TAG, "onShowFirstCover 封面");
        if (this.f.getParent() == null && this.e.D1() != null) {
            boolean v = ((ICardService) this.b.getService(ICardService.class)).getConfig().v();
            ir9.a("VideoCoverLayer", "onShowFirstCover orangeSharePlayerView :" + v);
            if (!v || this.e.n1().getDWInstance() == null) {
                r8e c = this.e.G1().c();
                if (drawable != null || str == null) {
                    this.f.setImageDrawable(drawable);
                    ir9.a("VideoCoverLayer", "onShowFirstCover drawable不为null mCardRenderManager.mCoverImageView.setImageDrawable");
                } else {
                    TUrlImageView loadingImage = ((IQuickOpenService) this.e.U().getService(IQuickOpenService.class)).getLoadingImage();
                    if (loadingImage == null || loadingImage.getDrawable() == null) {
                        V(this.f, str, c);
                        ir9.a("VideoCoverLayer", "onShowFirstCover drawable为null mCardRenderManager.mCoverImageView.setImageUrl");
                    } else {
                        this.f.setImageDrawable(loadingImage.getDrawable());
                        ir9.a("VideoCoverLayer", "onShowFirstCover drawable为null mCardRenderManager.mCoverImageView.setImageDrawable");
                    }
                }
                this.f.setScaleType(c.f);
                this.f.setOnLongClickListener(new b());
                if (R()) {
                    ir9.a("VideoCoverLayer", "onShowFirstCover 不显示封面图，return掉");
                    return;
                }
                ir9.a("VideoCoverLayer", "onShowFirstCover 显示firstCover图,top:" + this.e.G1().b().topMargin);
                this.e.F1().T(this.f, this.e.G1().b());
                ((IContainerService) this.b.getService(IContainerService.class)).hideLoading();
                return;
            }
            ir9.a("VideoCoverLayer", "onShowFirstCover orangeSharePlayerView 为true并且dw实例不为null，return掉");
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a80772", new Object[]{this});
        } else if (this.f.getParent() != null) {
            ViewParent parent = this.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f);
            }
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
        if (this.g) {
            this.f = new VideoCoverImageView(recyclerViewHolder.itemView.getContext());
        } else {
            this.f = new TUrlImageView(recyclerViewHolder.itemView.getContext());
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c35aa2", new Object[]{this});
            return;
        }
        ir9.b(prp.TAG, "onShowCover 封面");
        if (this.e.D1() != null && this.f.getParent() == null) {
            boolean v = ((ICardService) this.b.getService(ICardService.class)).getConfig().v();
            if (this.e.n1().getDWInstance() == null || !v) {
                V(this.f, xv4.b(this.e.U(), this.e.Z()), this.e.D1().i(this.b, this.e, false));
                this.f.setOnLongClickListener(new a());
                ir9.a("VideoCoverLayer", "onShowCover halfscreen " + this.e.G1().c().d + " " + this.e.G1().c().c + " ; " + this.e.D1().x() + " " + this.e.D1().n() + " ; " + this.e.G1().b().height);
                if (R()) {
                    ir9.a("VideoCoverLayer", "onShowCover 不显示封面图，return掉");
                    return;
                }
                ir9.b(prp.TAG, "onShowCover 显示firstCover图，detail.decidedFirstFrame()：" + this.e.D1().g() + ",id:" + this.e.P());
                this.e.F1().T(this.f, this.e.G1().b());
                return;
            }
            ir9.a("VideoCoverLayer", "onShowCover orangeSharePlayerView 为true并且dw实例不为null，return掉");
        }
    }

    private boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac5ba04", new Object[]{this})).booleanValue();
        }
        boolean v = ((ICardService) this.b.getService(ICardService.class)).getConfig().v();
        boolean m = l9f.f().m();
        if (v) {
            String preCoverKey = this.b.getInstanceConfig().getPreCoverKey();
            boolean b2 = ogi.e().b(preCoverKey);
            r i2 = ogi.e().i(preCoverKey);
            boolean m2 = ogi.e().m(preCoverKey);
            if (i2 == null || m2 || !b2) {
                return false;
            }
        } else if (!m) {
            if (this.e.N1()) {
                ir9.b("VideoCoverLayer", "在容器外预创建的播放器会以前播，不用添加封面图");
            } else if (!((ICollectionService) this.b.getService(ICollectionService.class)).checkDialogPopup() || !((ICollectionService) this.b.getService(ICollectionService.class)).checkPopupFisrtTime() || !((ICollectionService) this.b.getService(ICollectionService.class)).checkResizeVideo()) {
                return false;
            }
        }
        return true;
    }
}
