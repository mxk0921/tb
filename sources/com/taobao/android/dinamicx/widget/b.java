package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.dinamicx.DXAliUrlImageView;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.megadesign.colortreatment.b;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.aq0;
import tb.cy0;
import tb.eb5;
import tb.fy0;
import tb.la6;
import tb.xp0;
import tb.yf2;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static TaobaoImageUrlStrategy.ImageQuality d(DXImageWidgetNode.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("8d0b579a", new Object[]{gVar});
        }
        DXEngineConfig.ImageQuality m = gVar.m();
        if (m == null) {
            return null;
        }
        if (m == DXEngineConfig.ImageQuality.q90) {
            return TaobaoImageUrlStrategy.ImageQuality.q90;
        }
        if (m == DXEngineConfig.ImageQuality.q75) {
            return TaobaoImageUrlStrategy.ImageQuality.q75;
        }
        if (m == DXEngineConfig.ImageQuality.q60) {
            return TaobaoImageUrlStrategy.ImageQuality.q60;
        }
        if (m == DXEngineConfig.ImageQuality.q50) {
            return TaobaoImageUrlStrategy.ImageQuality.q50;
        }
        if (m == DXEngineConfig.ImageQuality.q30) {
            return TaobaoImageUrlStrategy.ImageQuality.q30;
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public ImageView a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("ca135d8a", new Object[]{this, context, new Boolean(z)});
        }
        if (!z || !zg5.e5()) {
            return c(context);
        }
        DXAliUrlImageView dXAliUrlImageView = new DXAliUrlImageView(context);
        dXAliUrlImageView.setReusableImageShape(true);
        dXAliUrlImageView.setAutoRelease(false);
        return dXAliUrlImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public void b(ImageView imageView, String str, DXImageWidgetNode.g gVar) {
        boolean z;
        ImageStrategyConfig.b bVar;
        int i;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890f7f52", new Object[]{this, imageView, str, gVar});
        } else if (imageView instanceof AliUrlImageView) {
            AliUrlImageView aliUrlImageView = (AliUrlImageView) imageView;
            if (zg5.F4()) {
                if (gVar.q() || gVar.t() || gVar.k() == 1 || gVar.z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aliUrlImageView.setSkipAutoSize(z3);
            }
            if (!zg5.F4()) {
                if (gVar.q() || gVar.t() || gVar.k() == 1 || gVar.z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aliUrlImageView.setSkipAutoSize(z2);
            }
            aliUrlImageView.setAutoRelease(gVar.r());
            aliUrlImageView.setPlaceHoldForeground(gVar.i);
            aliUrlImageView.setPlaceHoldImageResId(gVar.h);
            aliUrlImageView.setDarkModeOverlay(gVar.y(), (int) (gVar.j() * 255.0d));
            if (gVar.B() || gVar.C()) {
                z = true;
            } else {
                z = false;
            }
            aliUrlImageView.setFadeIn(z);
            aliUrlImageView.setWhenNullClearImg(gVar.F);
            boolean f4 = zg5.f4();
            if (gVar.x()) {
                if (!gVar.q() || !f4) {
                    int[] iArr = gVar.f7369a;
                    aliUrlImageView.setCornerRadius(iArr[0], iArr[1], iArr[3], iArr[2]);
                    aliUrlImageView.setShape(1);
                } else {
                    AbsFeature<? super ImageView> findFeature = aliUrlImageView.findFeature(RoundRectShapeFeature.class);
                    if (!(findFeature instanceof RoundRectShapeFeature)) {
                        findFeature = new RoundRectShapeFeature();
                        aliUrlImageView.addFeature(findFeature);
                    }
                    int[] iArr2 = gVar.f7369a;
                    ((RoundRectShapeFeature) findFeature).setCornerRadius(Math.max(iArr2[0], 0), Math.max(iArr2[1], 0), Math.max(iArr2[3], 0), Math.max(iArr2[2], 0));
                }
            }
            if (f4 && (!gVar.x() || !gVar.q())) {
                AbsFeature<? super ImageView> findFeature2 = aliUrlImageView.findFeature(RoundRectShapeFeature.class);
                if (findFeature2 instanceof RoundRectShapeFeature) {
                    ((RoundRectShapeFeature) findFeature2).reset();
                    aliUrlImageView.removeFeature(RoundRectShapeFeature.class);
                }
            }
            if (gVar.w()) {
                aliUrlImageView.setStrokeWidth(gVar.c);
            }
            if (gVar.v()) {
                aliUrlImageView.setStrokeColor(gVar.b);
            }
            if (TextUtils.isEmpty(gVar.e) || (i = gVar.f) <= -1) {
                bVar = ImageStrategyConfig.u(gVar.e);
            } else {
                bVar = ImageStrategyConfig.v(gVar.e, i);
                if (gVar.L) {
                    bVar.o(true);
                }
            }
            if (gVar.k() == 2) {
                bVar.g(true);
            }
            if (gVar.z() && "heightLimit".equals(gVar.j)) {
                bVar.l(ImageStrategyConfig.SizeLimitType.HEIGHT_LIMIT);
            }
            bVar.i(d(gVar));
            aliUrlImageView.setStrategyConfig(bVar.a());
            aliUrlImageView.setPriorityModuleName(gVar.p());
            if (gVar.g() == 0 && gVar.k == null && (!gVar.n || (gVar.f() == null && gVar.t < 0))) {
                aliUrlImageView.succListener((xp0<aq0>) null);
            } else {
                aliUrlImageView.succListener(new a(new WeakReference(imageView), gVar).e(str));
            }
            e(str, aliUrlImageView, gVar);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.s
    public ImageView c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("92868382", new Object[]{this, context});
        }
        AliUrlImageView aliUrlImageView = new AliUrlImageView(context);
        aliUrlImageView.setReusableImageShape(true);
        return aliUrlImageView;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements xp0<aq0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DXImageWidgetNode.g f7419a;
        public final WeakReference<View> b;
        public String c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.dinamicx.widget.b$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0401a implements fy0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0401a() {
            }

            @Override // tb.fy0
            public boolean onLoopCompleted(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                }
                DXImageWidgetNode.d f = a.this.f7419a.f();
                if (f != null) {
                    f.a(i);
                }
                return true;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.dinamicx.widget.b$a$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0402b implements b.AbstractC0465b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f7421a;
            public final /* synthetic */ String b;

            public C0402b(View view, String str) {
                this.f7421a = view;
                this.b = str;
            }

            @Override // com.taobao.android.megadesign.colortreatment.b.AbstractC0465b
            public void a(com.taobao.android.megadesign.colortreatment.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9ca8bd79", new Object[]{this, bVar});
                } else if (bVar != null) {
                    int c = bVar.c(0);
                    this.f7421a.setBackgroundColor(c);
                    View view = this.f7421a;
                    int i = R.id.dx_image_extractionBg_key;
                    view.setTag(i, a.this.c + this.b + c);
                }
            }
        }

        public a(WeakReference<View> weakReference, DXImageWidgetNode.g gVar) {
            this.f7419a = gVar;
            this.b = weakReference;
        }

        public final Rect c(int i, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("e0cbc030", new Object[]{this, new Integer(i), bitmap});
            }
            if (i == 1) {
                return new Rect(0, 0, bitmap.getWidth(), (int) (bitmap.getHeight() * 0.1d));
            }
            if (i == 3) {
                return new Rect(0, (int) (bitmap.getHeight() * 0.9d), bitmap.getWidth(), bitmap.getHeight());
            }
            if (i == 2) {
                return new Rect(0, 0, (int) (bitmap.getWidth() * 0.1d), bitmap.getHeight());
            }
            if (i == 4) {
                return new Rect((int) (bitmap.getWidth() * 0.9d), 0, bitmap.getWidth(), bitmap.getHeight());
            }
            return null;
        }

        /* renamed from: d */
        public boolean a(aq0 aq0Var) {
            WeakReference<View> weakReference;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58f2cb53", new Object[]{this, aq0Var})).booleanValue();
            }
            DXImageWidgetNode.h hVar = new DXImageWidgetNode.h();
            BitmapDrawable drawable = aq0Var.getDrawable();
            hVar.f7370a = drawable;
            if (!(this.f7419a.g() == 0 || (weakReference = this.b) == null)) {
                View view = weakReference.get();
                if (!(drawable instanceof BitmapDrawable) || drawable.getBitmap() == null) {
                    z = false;
                }
                if (view != null && z) {
                    b(view, drawable.getBitmap());
                }
            }
            DXImageWidgetNode.f fVar = this.f7419a.k;
            if (fVar != null) {
                fVar.a(hVar);
            }
            DXImageWidgetNode.g gVar = this.f7419a;
            if (gVar.n && (drawable instanceof cy0)) {
                cy0 cy0Var = (cy0) drawable;
                cy0Var.B(Math.max(gVar.t, 0));
                if (this.f7419a.f() != null) {
                    cy0Var.A(new C0401a());
                } else {
                    cy0Var.A(null);
                }
            }
            return false;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9747d046", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public final void b(View view, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec659e0", new Object[]{this, view, bitmap});
            } else if (this.f7419a != null) {
                String str = "&backgroundColorExtraction" + ((int) this.f7419a.g()) + "=";
                Object tag = view.getTag(R.id.dx_image_extractionBg_key);
                if (tag != null && !TextUtils.isEmpty(tag.toString())) {
                    String[] split = tag.toString().split(str);
                    if (split.length == 2) {
                        try {
                            String str2 = split[0];
                            String str3 = split[1];
                            if (str2 != null && str2.equals(this.c)) {
                                view.setBackgroundColor(Integer.parseInt(str3));
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                try {
                    Rect c = c(this.f7419a.g(), bitmap);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        b.a b = com.taobao.android.megadesign.colortreatment.b.b(bitmap);
                        if (c != null) {
                            b.e(c.left, c.top, c.right, c.bottom);
                        }
                        b.a(new C0402b(view, str));
                    }
                } catch (Exception e) {
                    la6.b("palette generate " + e.getLocalizedMessage());
                }
            }
        }
    }

    public final void e(String str, AliUrlImageView aliUrlImageView, DXImageWidgetNode.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8e228", new Object[]{this, str, aliUrlImageView, gVar});
        } else if (gVar != null && gVar.A()) {
            PhenixOptions phenixOptions = new PhenixOptions();
            if (gVar.l() != null) {
                for (Map.Entry<String, String> entry : gVar.l().entrySet()) {
                    phenixOptions.addLoaderExtra(entry.getKey(), entry.getValue());
                }
            }
            if (gVar.o() != null) {
                phenixOptions.setOpenTraceContext(gVar.o());
            }
            try {
                if (gVar.h() > 0) {
                    phenixOptions.bitmapProcessors(new yf2(aliUrlImageView.getContext(), gVar.h(), gVar.i()));
                }
            } catch (Throwable th) {
                la6.b("blur bitmapProcessors " + th.getLocalizedMessage());
            }
            phenixOptions.fuzzyMatchCache(gVar.u());
            phenixOptions.setStrictMatchCache(gVar.H);
            aliUrlImageView.enableSizeInLayoutParams(gVar.s());
            if (gVar.n() > 0) {
                if (gVar.n() == 1) {
                    DXTraceUtil.b("postSetImageUrl");
                    aliUrlImageView.asyncSetImageUrl(str, phenixOptions);
                    DXTraceUtil.c();
                } else if (gVar.n() == 2) {
                    DXTraceUtil.b("asyncSetImageUrl");
                    aliUrlImageView.async(true);
                    aliUrlImageView.setImageUrl(str, phenixOptions);
                    DXTraceUtil.c();
                } else {
                    DXTraceUtil.b("setImageUrl");
                    aliUrlImageView.setImageUrl(str, phenixOptions);
                    DXTraceUtil.c();
                }
            } else if (eb5.l()) {
                DXTraceUtil.b("asyncSetImageUrl");
                aliUrlImageView.async(true);
                aliUrlImageView.setImageUrl(str, phenixOptions);
                DXTraceUtil.c();
            } else if (eb5.m()) {
                DXTraceUtil.b("postSetImageUrl");
                aliUrlImageView.asyncSetImageUrl(str, phenixOptions);
                DXTraceUtil.c();
            } else {
                DXTraceUtil.b("setImageUrl");
                aliUrlImageView.setImageUrl(str, phenixOptions);
                DXTraceUtil.c();
            }
        }
    }
}
