package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import tb.eb5;
import tb.h36;
import tb.lle;
import tb.qub;
import tb.t2o;
import tb.tz8;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7431a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements DXImageWidgetNode.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7432a;

        public a(String str) {
            this.f7432a = str;
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(DXImageWidgetNode.h hVar) {
            Drawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            if (f.t(f.this) && (f.this.getMeasuredHeight() == 0 || f.this.getMeasuredWidth() == 0)) {
                Drawable drawable2 = hVar.f7370a;
                if (drawable2 != null) {
                    int intrinsicWidth = drawable2.getIntrinsicWidth();
                    int intrinsicHeight = drawable2.getIntrinsicHeight();
                    if (intrinsicHeight > 0) {
                        DXImageWidgetNode.imageRatioCache.put(this.f7432a, Double.valueOf(intrinsicWidth / intrinsicHeight));
                    }
                }
                f.this.getDXRuntimeContext().D().requestLayout();
                f.this.getDXRuntimeContext().D().invalidate();
            } else if (!f.t(f.this) && (drawable = hVar.f7370a) != null) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                if (intrinsicHeight2 > 0) {
                    DXImageWidgetNode.imageRatioCache.put(this.f7432a, Double.valueOf(intrinsicWidth2 / intrinsicHeight2));
                }
            }
            DXWidgetNode W = f.this.getDXRuntimeContext().W();
            if (W != null && (W instanceof DXImageWidgetNode)) {
                ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DXImageWidgetNode.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(DXImageWidgetNode.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            DXWidgetNode W = f.this.getDXRuntimeContext().W();
            if (W instanceof DXImageWidgetNode) {
                ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements DXImageWidgetNode.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.f
        public boolean a(DXImageWidgetNode.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4cb7e72", new Object[]{this, hVar})).booleanValue();
            }
            DXWidgetNode W = f.this.getDXRuntimeContext().W();
            if (W instanceof DXImageWidgetNode) {
                ((DXImageWidgetNode) W).postImageLoadCompleteEvent();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597270);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new f();
        }
    }

    static {
        t2o.a(444597266);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 1568407179) {
            super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXButterImageWidgetNode");
    }

    public static /* synthetic */ boolean t(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0b1775", new Object[]{fVar})).booleanValue();
        }
        return fVar.f7431a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new f();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            getNativeView().layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureWithButter(i, i2);
        getNativeView().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        this.f7431a = true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z;
        int[] iArr;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        DXTraceUtil.b(" build option ");
        ImageView imageView = (ImageView) view;
        DXImageWidgetNode.g decidedUrlWithExpectedSize = (!needDecideWithExpectedSize() || this.decidedUrl != null) ? null : decidedUrlWithExpectedSize(false);
        if (decidedUrlWithExpectedSize == null) {
            decidedUrlWithExpectedSize = buildSimpleImageOption();
        }
        decidedUrlWithExpectedSize.z = this.decidedUrl != null;
        setImageScaleType(imageView, this.scaleType);
        String str = this.decidedUrl;
        if (str == null) {
            if (!needHandleDark(getDXRuntimeContext())) {
                str = this.imageUrl;
            } else if (!TextUtils.isEmpty(getDarkImageUrl())) {
                str = getDarkImageUrl();
            } else {
                str = this.imageUrl;
            }
        }
        try {
            tz8 tz8Var = FalcoGlobalTracer.get();
            if (!(tz8Var == null || getDXRuntimeContext().E() == null)) {
                decidedUrlWithExpectedSize.G(tz8Var.c(getDXRuntimeContext().E().a()));
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
        if (!TextUtils.isEmpty(str)) {
            decidedUrlWithExpectedSize.s = true;
            int layoutWidth = getLayoutWidth();
            int layoutHeight = getLayoutHeight();
            boolean z3 = layoutWidth == -2 && !hasAspectRatioAttribute();
            boolean z4 = layoutHeight == -2 && !hasAspectRatioAttribute();
            if (z3 || z4) {
                this.f7431a = false;
                decidedUrlWithExpectedSize.k = new a(str);
            } else if (!eb5.k() || getEventHandlersExprNode() == null || getEventHandlersExprNode().indexOfKey(DXImageWidgetNode.DXIMAGEVIEW_ONIMAGELOADCOMPLETE) < 0) {
                decidedUrlWithExpectedSize.k = new c();
            } else {
                decidedUrlWithExpectedSize.k = new b();
            }
        } else {
            Drawable drawable = this.localImageDrawable;
            if (drawable != null) {
                setLocalImage(imageView, drawable);
            } else if (!TextUtils.isEmpty(getImageName())) {
                setLocalRes(imageView, getImageName());
            } else {
                imageView.setImageDrawable(null);
                decidedUrlWithExpectedSize.s = true;
            }
        }
        if (decidedUrlWithExpectedSize.s) {
            int drawableId = DXImageWidgetNode.getDrawableId(context, getPlaceHolderName());
            decidedUrlWithExpectedSize.h = drawableId;
            if (drawableId == 0) {
                decidedUrlWithExpectedSize.i = getPlaceHolder();
            }
        }
        if (isNeedSetBackground()) {
            setBorderColor(tryFetchDarkModeColor("borderColor", 2, getBorderColor()));
            if (getBorderColor() != 0) {
                decidedUrlWithExpectedSize.b = getBorderColor();
                decidedUrlWithExpectedSize.o = true;
            }
            if (getBorderWidth() > 0) {
                decidedUrlWithExpectedSize.c = getBorderWidth();
                decidedUrlWithExpectedSize.p = true;
            }
            int cornerRadius = getCornerRadius();
            int cornerRadiusLeftTop = getCornerRadiusLeftTop();
            int cornerRadiusRightTop = getCornerRadiusRightTop();
            int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
            int cornerRadiusRightBottom = getCornerRadiusRightBottom();
            if (cornerRadius > 0) {
                iArr = new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius};
            } else {
                iArr = (cornerRadiusLeftTop > 0 || cornerRadiusRightTop > 0 || cornerRadiusLeftBottom > 0 || cornerRadiusRightBottom > 0 || decidedUrlWithExpectedSize.o || decidedUrlWithExpectedSize.p) ? new int[]{cornerRadiusLeftTop, cornerRadiusRightTop, cornerRadiusRightBottom, cornerRadiusLeftBottom} : null;
            }
            if (iArr != null) {
                decidedUrlWithExpectedSize.f7369a = iArr;
                decidedUrlWithExpectedSize.q = true;
            }
        }
        decidedUrlWithExpectedSize.n = this.animated;
        decidedUrlWithExpectedSize.H(this.progressiveLoading);
        if (getDXRuntimeContext().s() != null) {
            DXEngineConfig c2 = getDXRuntimeContext().s().c();
            if (c2 != null) {
                z = c2.B();
                decidedUrlWithExpectedSize.F(c2.j());
                decidedUrlWithExpectedSize.H(this.progressiveLoading && !c2.x());
            } else {
                z = true;
            }
            decidedUrlWithExpectedSize.d = isAutoRelease() && z;
        } else {
            decidedUrlWithExpectedSize.d = isAutoRelease();
            decidedUrlWithExpectedSize.F(null);
        }
        decidedUrlWithExpectedSize.m = this.forceOriginal;
        decidedUrlWithExpectedSize.v = getDarkModeOverlayOpacity();
        decidedUrlWithExpectedSize.u = isNeedDarkModeOverlay();
        decidedUrlWithExpectedSize.F = isLoadImgWhenNullClearImg_Android();
        if (eb5.k()) {
            decidedUrlWithExpectedSize.A = true;
        } else if (getEnableSizeInLayoutParams() >= 0) {
            if (getEnableSizeInLayoutParams() != 1) {
                z2 = false;
            }
            decidedUrlWithExpectedSize.A = z2;
        } else if (!(getDXRuntimeContext().s() == null || getDXRuntimeContext().s().c() == null)) {
            decidedUrlWithExpectedSize.A = getDXRuntimeContext().s().c().C();
        }
        DXTraceUtil.c();
        s h = g.h(getDXRuntimeContext());
        if (h != null) {
            if (!eb5.k()) {
                try {
                    setImagePerformanceOption(imageView, decidedUrlWithExpectedSize);
                } catch (Throwable th2) {
                    h36.d(DXImageWidgetNode.TAG, "setImagePerformanceOption", th2);
                    xv5.b(th2);
                }
            }
            DXTraceUtil.b("uikit setImage ");
            isLoadImgWhenNullClearImg_Android();
            decidedUrlWithExpectedSize.E = getFadeIn();
            decidedUrlWithExpectedSize.G = isFuzzyMatchCache();
            if (isZoomEnabled()) {
                decidedUrlWithExpectedSize.d = false;
            }
            h.b(imageView, str, decidedUrlWithExpectedSize);
            DXTraceUtil.c();
            DXTraceUtil.b("uikit setFilterToImageView ");
            lle.b(imageView, this.filterType);
            DXTraceUtil.c();
        }
    }
}
