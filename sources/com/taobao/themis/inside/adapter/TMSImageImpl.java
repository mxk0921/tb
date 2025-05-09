package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import tb.a07;
import tb.b1m;
import tb.ckf;
import tb.fg2;
import tb.na3;
import tb.p1m;
import tb.p8s;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.yf2;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSImageImpl;", "Lcom/taobao/themis/kernel/adapter/IImageAdapter;", "<init>", "()V", "Landroid/widget/ImageView;", "imgView", "", "url", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$b;", "imageStrategy", "Ltb/xhv;", "setImageUrl", "(Landroid/widget/ImageView;Ljava/lang/String;Lcom/taobao/themis/kernel/adapter/IImageAdapter$b;)V", "strategy", "Lcom/taobao/themis/kernel/adapter/IImageAdapter$a;", DataReceiveMonitor.CB_LISTENER, na3.sStageLoadImage, "(Ljava/lang/String;Lcom/taobao/themis/kernel/adapter/IImageAdapter$b;Lcom/taobao/themis/kernel/adapter/IImageAdapter$a;)V", "a", TplMsg.VALUE_T_NATIVE_RETURN, "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSImageImpl implements IImageAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ImageView> f13539a;

        static {
            t2o.a(837812290);
            t2o.a(620757101);
        }

        public a(IImageAdapter.b bVar, ImageView imageView, String str) {
            ckf.g(imageView, "imageView");
            ckf.g(str, "url");
            this.f13539a = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f13539a.get();
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final IImageAdapter.b f13540a;
        public final WeakReference<ImageView> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a {
            static {
                t2o.a(837812292);
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.inside.adapter.TMSImageImpl$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class C0770b implements fg2.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageView f13541a;
            public final /* synthetic */ Drawable b;

            public C0770b(ImageView imageView, Drawable drawable) {
                this.f13541a = imageView;
                this.b = drawable;
            }

            @Override // tb.fg2.b
            public void a(Bitmap bitmap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("da836da8", new Object[]{this, bitmap});
                    return;
                }
                ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
                try {
                    this.f13541a.setImageDrawable(new BitmapDrawable(this.f13541a.getContext().getResources(), bitmap));
                } catch (Exception e) {
                    try {
                        TMSLogger.c(e.getMessage(), "", e);
                        this.f13541a.setImageDrawable(this.b);
                    } catch (Exception e2) {
                        TMSLogger.c(e2.getMessage(), "", e);
                    }
                }
            }
        }

        static {
            t2o.a(837812291);
            t2o.a(620757101);
        }

        public b(IImageAdapter.b bVar, ImageView imageView, String str) {
            ckf.g(imageView, "imageView");
            ckf.g(str, "url");
            this.f13540a = bVar;
            this.b = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            ckf.g(succPhenixEvent, "succPhenixEvent");
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            ImageView imageView = this.b.get();
            if (!(imageView == null || drawable == null)) {
                IImageAdapter.b bVar = this.f13540a;
                if (bVar == null || bVar.a() <= 0) {
                    imageView.setImageDrawable(drawable);
                } else if (drawable.getBitmap() != null) {
                    fg2 fg2Var = fg2.INSTANCE;
                    Bitmap bitmap = drawable.getBitmap();
                    ckf.f(bitmap, "drawable.bitmap");
                    fg2Var.b(bitmap, this.f13540a.a(), new C0770b(imageView, drawable));
                } else {
                    try {
                        imageView.setImageDrawable(drawable);
                    } catch (Exception e) {
                        TMSLogger.c(e.getMessage(), "", e);
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c<T extends b1m> implements s8d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IImageAdapter.a f13542a;

        public c(IImageAdapter.a aVar) {
            this.f13542a = aVar;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IImageAdapter.a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (!(drawable == null || (aVar = this.f13542a) == null)) {
                aVar.onImageFinish(drawable);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IImageAdapter.a f13543a;

        public d(IImageAdapter.a aVar) {
            this.f13543a = aVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TMSLogger.b("TMSImageImpl", ckf.p("loadImage fail: ", failPhenixEvent == null ? null : failPhenixEvent.getHttpMessage()));
            IImageAdapter.a aVar = this.f13543a;
            if (aVar != null) {
                aVar.onImageFinish(null);
            }
            return true;
        }
    }

    static {
        t2o.a(837812289);
        t2o.a(839909470);
    }

    public final String a(ImageView imageView, String str, IImageAdapter.b bVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cab2b02a", new Object[]{this, imageView, str, bVar});
        }
        ImageStrategyConfig b2 = b(bVar);
        if (b2 == null) {
            return str;
        }
        if (imageView.getLayoutParams() != null) {
            i2 = imageView.getLayoutParams().height;
            i = imageView.getLayoutParams().width;
        } else {
            i2 = imageView.getHeight();
            i = imageView.getWidth();
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), b2);
    }

    public final ImageStrategyConfig b(IImageAdapter.b bVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("95dc0026", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.d()) {
            str = ImageStrategyConfig.WEAPPSHARPEN;
        } else {
            str = ImageStrategyConfig.WEAPP;
        }
        ImageStrategyConfig.b v = ImageStrategyConfig.v(str, 70);
        ckf.f(v, "newBuilderWithName(\n    …         70\n            )");
        if (!TextUtils.isEmpty(bVar.c())) {
            String c2 = bVar.c();
            ckf.d(c2);
            v.l(ImageStrategyConfig.SizeLimitType.valueOf(c2));
        }
        return v.a();
    }

    public final String c(ImageView imageView, String str, IImageAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dafad8e5", new Object[]{this, imageView, str, bVar});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return a(imageView, str, bVar);
    }

    @Override // com.taobao.themis.kernel.adapter.IImageAdapter
    public void loadImage(String str, IImageAdapter.b bVar, IImageAdapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ea158d", new Object[]{this, str, bVar, aVar});
            return;
        }
        PhenixCreator T = s0m.B().T(str);
        if (bVar != null && bVar.a() > 0) {
            T.bitmapProcessors(new yf2(((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext(), bVar.a()));
        } else if (bVar != null && bVar.b() > 0) {
            T.bitmapProcessors(new RoundedCornersBitmapProcessor(bVar.b(), 0));
        }
        T.succListener(new c(aVar)).failListener(new d(aVar)).fetch();
    }

    @Override // com.taobao.themis.kernel.adapter.IImageAdapter
    public void setImageUrl(ImageView imageView, String str, IImageAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274c8ca5", new Object[]{this, imageView, str, bVar});
            return;
        }
        ckf.g(imageView, "imgView");
        ckf.g(str, "url");
        if (imageView.getTag() instanceof p1m) {
            Object tag = imageView.getTag();
            if (tag != null) {
                ((p1m) tag).a();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.phenix.intf.PhenixTicket");
            }
        }
        Application application = null;
        if (TextUtils.isEmpty(str)) {
            imageView.setImageDrawable(null);
            return;
        }
        String c2 = c(imageView, str, bVar);
        if (c2 != null) {
            PhenixCreator releasableDrawable = s0m.B().T(c2).limitSize(imageView).releasableDrawable(true);
            if (bVar != null && bVar.a() > 0) {
                IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
                if (iEnvironmentService != null) {
                    application = iEnvironmentService.getApplicationContext();
                }
                releasableDrawable.bitmapProcessors(new yf2(application, bVar.a()));
            } else if (bVar != null && bVar.b() > 0) {
                releasableDrawable.bitmapProcessors(new RoundedCornersBitmapProcessor(bVar.b(), 0));
            }
            releasableDrawable.succListener(new b(bVar, imageView, c2));
            releasableDrawable.failListener(new a(bVar, imageView, c2));
            imageView.setTag(releasableDrawable.fetch());
        }
    }
}
