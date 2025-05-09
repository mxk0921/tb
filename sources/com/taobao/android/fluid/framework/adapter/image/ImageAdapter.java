package com.taobao.android.fluid.framework.adapter.image;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.cy0;
import tb.ir9;
import tb.la2;
import tb.nd2;
import tb.pr9;
import tb.r8e;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImageAdapter implements IImageAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMAGE_ORIGIN_MODE_BIZ = "fullPageShortVideo";
    public static final String IMAGE_QUALITY_Q90 = "q90";
    private static final String TAG = "ImageAdapter";
    private ImageLoader.b mImageConfigInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f7762a;

        public a(ImageAdapter imageAdapter, ImageView imageView) {
            this.f7762a = imageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null) {
                if (drawable instanceof cy0) {
                    ((cy0) drawable).B(Integer.MAX_VALUE);
                }
                ImageView imageView = this.f7762a;
                if (imageView != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ la2 f7763a;
        public final /* synthetic */ String b;

        public b(ImageAdapter imageAdapter, la2 la2Var, String str) {
            this.f7763a = la2Var;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.f7763a.a(this.b, null);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ la2 f7764a;
        public final /* synthetic */ String b;

        public c(ImageAdapter imageAdapter, la2 la2Var, String str) {
            this.f7764a = la2Var;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null) {
                this.f7764a.a(this.b, drawable);
            } else {
                this.f7764a.a(this.b, null);
            }
            return true;
        }
    }

    static {
        t2o.a(468713826);
        t2o.a(468713808);
    }

    public ImageAdapter() {
        initImageConfigInfo();
    }

    private ImageStrategyConfig.b builderImgWidthAndHeight(ImageStrategyConfig.b bVar, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig.b) ipChange.ipc$dispatch("4e7d0676", new Object[]{this, bVar, r8eVar});
        }
        if (r8eVar != null) {
            ir9.b(TAG, "封面图优化开启使用dp值");
            bVar.j(pr9.n(FluidSDK.getContext(), r8eVar.d));
            bVar.h(pr9.n(FluidSDK.getContext(), r8eVar.c));
        } else {
            ir9.b(TAG, "videoCommentSizeObject为null，使用默认值");
            bVar.j(1200);
            bVar.h(1200);
        }
        return bVar;
    }

    private void initImageConfigInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c8aa2", new Object[]{this});
            return;
        }
        ImageLoader.b c2 = ImageLoader.b.c(0, IMAGE_QUALITY_Q90, "", "", IMAGE_ORIGIN_MODE_BIZ, 9101);
        this.mImageConfigInfo = c2;
        ir9.b("原图实验", c2.toString());
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public String decideUrl(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df670908", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        ImageStrategyConfig imageStrategyConfig = getImageStrategyConfig();
        if (imageStrategyConfig != null) {
            return ImageStrategyDecider.decideUrl(str, 1200, 1200, imageStrategyConfig);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), null);
    }

    public String getImageFinalUrl(String str, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85efc170", new Object[]{this, str, r8eVar});
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(r8eVar.d), Integer.valueOf(r8eVar.c), getImageStrategyConfig(r8eVar));
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public ImageStrategyConfig getImageStrategyConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("3cbb9008", new Object[]{this}) : getImageStrategyConfig(null);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return IImageAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public void load(String str, ImageView imageView) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517e3f1", new Object[]{this, str, imageView});
            return;
        }
        String str3 = null;
        if (this.mImageConfigInfo != null) {
            str2 = this.mImageConfigInfo.f + "";
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "0")) {
            z = false;
        }
        PhenixCreator T = s0m.B().T(str);
        if (z) {
            str3 = str2;
        }
        T.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, str3).succListener(new a(this, imageView)).fetch();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public ImageStrategyConfig getImageStrategyConfig(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("3f52310b", new Object[]{this, r8eVar});
        }
        ImageStrategyConfig.b w = ImageStrategyConfig.w(IMAGE_ORIGIN_MODE_BIZ, IImageAdapter.IMAGE_ORIGIN_MODE_NORMAL_BIZID);
        ImageLoader.b bVar = this.mImageConfigInfo;
        if (bVar != null) {
            w = ImageStrategyConfig.w(bVar.e, String.valueOf(bVar.f));
            if (TextUtils.equals(this.mImageConfigInfo.b, IMAGE_QUALITY_Q90)) {
                w.i(TaobaoImageUrlStrategy.ImageQuality.q90);
            }
        }
        return w.a();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public void load(String str, la2<String, BitmapDrawable> la2Var) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67286102", new Object[]{this, str, la2Var});
            return;
        }
        String str3 = null;
        if (this.mImageConfigInfo != null) {
            str2 = this.mImageConfigInfo.f + "";
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "0")) {
            z = false;
        }
        PhenixCreator T = s0m.B().T(str);
        if (z) {
            str3 = str2;
        }
        T.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, str3).succListener(new c(this, la2Var, str)).failListener(new b(this, la2Var, str)).fetch();
    }
}
