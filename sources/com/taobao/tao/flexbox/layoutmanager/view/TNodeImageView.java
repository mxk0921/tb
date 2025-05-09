package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.uikit.feature.view.TImageView;
import tb.dy0;
import tb.ey8;
import tb.gpe;
import tb.h3k;
import tb.i5c;
import tb.nwv;
import tb.od0;
import tb.s6o;
import tb.t2o;
import tb.ut2;
import tb.xv9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeImageView extends TImageView implements ImageLoader.d, i5c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ERROR_BASE64 = -1;
    private String animation;
    private ImageLoader.e callback;
    private float cornerRadius;
    private String currentUrl;
    private boolean enableImageMeasure;
    private o engine;
    private ey8 fadingEdge;
    private ImageLoader.b imageConfigInfo;
    private ImageLoader imageLoader;
    private Object imageSrc;
    private boolean inCachePool;
    private ImageLoader.f loadTask;
    private boolean needResume;
    private Rect ninePatchRect;
    private String originUrl;
    private Drawable postponedDrawable;
    private boolean postponedSetImageDrawable;
    private boolean releaseDrawableOnDetach;
    private boolean imageSrcLoadMode = false;
    private int width = -1;
    private int height = -1;
    private final xv9 mImpl = new xv9(this);
    private int animationLoopCount = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gpe.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f12390a;

        public a(long j) {
            this.f12390a = j;
        }

        @Override // tb.gpe.b
        public void a(Object obj, Drawable drawable) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49f720e8", new Object[]{this, obj, drawable});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f12390a;
            if (!TNodeImageView.access$000(TNodeImageView.this) && nwv.i(obj, TNodeImageView.access$100(TNodeImageView.this))) {
                TNodeImageView tNodeImageView = TNodeImageView.this;
                if (uptimeMillis >= 100) {
                    z = false;
                }
                TNodeImageView.access$200(tNodeImageView, drawable, z);
                TNodeImageView.access$300(TNodeImageView.this, null, drawable, 0);
            }
        }

        @Override // tb.gpe.b
        public void b(Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7545a341", new Object[]{this, obj, new Integer(i)});
            } else if (!TNodeImageView.access$000(TNodeImageView.this) && nwv.i(obj, TNodeImageView.access$100(TNodeImageView.this))) {
                TNodeImageView.this.setImageDrawable(null);
                TNodeImageView.access$300(TNodeImageView.this, null, null, i);
            }
        }
    }

    static {
        t2o.a(503317496);
        t2o.a(503316617);
        t2o.a(503316910);
    }

    public TNodeImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd19593f", new Object[]{tNodeImageView})).booleanValue();
        }
        return tNodeImageView.inCachePool;
    }

    public static /* synthetic */ Object access$100(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("626b6576", new Object[]{tNodeImageView});
        }
        return tNodeImageView.imageSrc;
    }

    public static /* synthetic */ void access$200(TNodeImageView tNodeImageView, Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77769d13", new Object[]{tNodeImageView, drawable, new Boolean(z)});
        } else {
            tNodeImageView.setImageDrawableInternal(drawable, z);
        }
    }

    public static /* synthetic */ void access$300(TNodeImageView tNodeImageView, String str, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc0f1d7", new Object[]{tNodeImageView, str, drawable, new Integer(i)});
        } else {
            tNodeImageView.notifyImageLoadCallback(str, drawable, i);
        }
    }

    public static /* synthetic */ Object ipc$super(TNodeImageView tNodeImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -609232689:
                return new Integer(super.getForegroundGravity());
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -221820127:
                super.jumpDrawablesToCurrentState();
                return null;
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/TNodeImageView");
        }
    }

    private void notifyImageLoadCallback(String str, Drawable drawable, int i) {
        BitmapDrawable bitmapDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1405ba51", new Object[]{this, str, drawable, new Integer(i)});
            return;
        }
        ImageLoader.e eVar = this.callback;
        if (eVar == null) {
            return;
        }
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (eVar instanceof ImageLoader.d) {
                ((ImageLoader.d) eVar).onImageLoaded(str, bitmapDrawable);
            } else {
                eVar.onImageLoaded(bitmapDrawable);
            }
        } else if (eVar instanceof ImageLoader.d) {
            ((ImageLoader.d) eVar).onImageLoadFailed(i);
        } else {
            eVar.onImageLoadFailed();
        }
    }

    private void reloadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe362c9", new Object[]{this});
        } else if (this.imageSrcLoadMode) {
            ImageLoader imageLoader = this.imageLoader;
            if (imageLoader != null) {
                imageLoader.g();
            }
        } else {
            String str = this.currentUrl;
            if (str != null) {
                setImageUrl(str);
            }
        }
    }

    private void setImageDrawableInternal(Drawable drawable, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cea78d5", new Object[]{this, drawable, new Boolean(z)});
        } else if (this.postponedSetImageDrawable) {
            this.postponedDrawable = drawable;
        } else {
            setImageDrawable(drawable);
            String str = this.animation;
            if (str == null || "none".equals(str)) {
                z2 = false;
            } else if ("auto".equals(this.animation)) {
                z2 = true ^ z;
            }
            if (z2) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alpha", 0, 255);
                ofInt.setInterpolator(new AccelerateInterpolator());
                ofInt.setDuration(150L);
                ofInt.start();
            }
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ImageLoader.f fVar = this.loadTask;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            ey8 ey8Var = this.fadingEdge;
            if (ey8Var == null || !ey8Var.c()) {
                super.draw(canvas);
                xv9 xv9Var = this.mImpl;
                if (xv9Var != null) {
                    xv9Var.a(canvas);
                    return;
                }
                return;
            }
            int e = this.fadingEdge.e(canvas);
            super.draw(canvas);
            xv9 xv9Var2 = this.mImpl;
            if (xv9Var2 != null) {
                xv9Var2.a(canvas);
            }
            this.fadingEdge.f(canvas);
            this.fadingEdge.d(canvas, e);
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.b();
        }
    }

    public float getCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b4", new Object[]{this})).floatValue();
        }
        return this.cornerRadius;
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        return this.currentUrl;
    }

    @Override // android.view.View
    public Drawable getForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("612f407a", new Object[]{this});
        }
        return this.mImpl.c();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbafd8cf", new Object[]{this})).intValue();
        }
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            return xv9Var.d();
        }
        return super.getForegroundGravity();
    }

    public Object getImageSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d053feec", new Object[]{this});
        }
        return this.imageSrc;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c74b21", new Object[]{this});
            return;
        }
        super.jumpDrawablesToCurrentState();
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.e();
        }
    }

    public void loadImageIfInSlowScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c889e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.imageLoader == null) {
            this.imageLoader = od0.D().a();
        }
        this.imageLoader.h(!z);
        if (z && this.imageLoader.a() == 1) {
            reloadImage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.releaseDrawableOnDetach && this.imageLoader != null && this.needResume) {
            reloadImage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.releaseDrawableOnDetach && this.imageLoader != null && getDrawable() != null && !this.inCachePool) {
            if (this.imageSrcLoadMode || this.currentUrl != null) {
                setImageDrawable(null);
                this.needResume = true;
            }
        }
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
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.f(z);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.g();
        }
        CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) findFeature(CustomRoundRectFeature.class);
        if (customRoundRectFeature != null) {
            customRoundRectFeature.onSizeChanged(i, i2, i3, i4);
        }
    }

    public void postponedSetImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d937a8c", new Object[]{this});
        } else {
            this.postponedSetImageDrawable = true;
        }
    }

    public void setAnimationLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f8e353", new Object[]{this, new Integer(i)});
        } else {
            this.animationLoopCount = i;
        }
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (f != getCornerRadius()) {
            this.cornerRadius = f;
            CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) findFeature(CustomRoundRectFeature.class);
            if (customRoundRectFeature == null) {
                customRoundRectFeature = new CustomRoundRectFeature();
                addFeature(customRoundRectFeature);
            }
            customRoundRectFeature.setAnimationRadiusX(f);
            customRoundRectFeature.setAnimationRadiusY(f);
            invalidate();
        }
    }

    @Override // tb.i5c
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ey8(this);
        }
        this.fadingEdge.a(true);
        this.fadingEdge.g(iArr);
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd13670", new Object[]{this, drawable});
            return;
        }
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.h(drawable);
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8f51b3", new Object[]{this, new Integer(i)});
            return;
        }
        xv9 xv9Var = this.mImpl;
        if (xv9Var != null) {
            xv9Var.i(i);
        }
    }

    public void setImageLoadCallback(ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56ebe52", new Object[]{this, eVar});
        } else {
            this.callback = eVar;
        }
    }

    public void setImageSrc(o oVar, Object obj, int i, int i2, ImageLoader.b bVar, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c91cd9", new Object[]{this, oVar, obj, new Integer(i), new Integer(i2), bVar, rect, new Boolean(z)});
        } else {
            setImageSrc(oVar, obj, null, i, i2, bVar, rect, z);
        }
    }

    @Deprecated
    public void setImageUrl(o oVar, String str, String str2, int i, int i2, ImageLoader.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dbc8e3", new Object[]{this, oVar, str, str2, new Integer(i), new Integer(i2), bVar, new Boolean(z)});
            return;
        }
        this.originUrl = str;
        this.currentUrl = str2;
        this.engine = oVar;
        this.width = i;
        this.height = i2;
        this.imageConfigInfo = bVar;
        this.enableImageMeasure = z;
        setImageUrl(str2);
    }

    public void setInCachePool(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf70c36", new Object[]{this, new Boolean(z)});
            return;
        }
        this.inCachePool = z;
        if (z) {
            this.imageSrc = null;
            this.originUrl = null;
            this.currentUrl = null;
            this.height = -1;
            this.width = -1;
            this.imageConfigInfo = ImageLoader.b.a();
            this.enableImageMeasure = false;
            this.imageLoader = null;
            this.loadTask = null;
            this.animation = null;
            this.ninePatchRect = null;
            this.needResume = false;
            this.engine = null;
            this.callback = null;
            this.imageSrcLoadMode = false;
            this.postponedSetImageDrawable = false;
            this.postponedDrawable = null;
            ey8 ey8Var = this.fadingEdge;
            if (ey8Var != null) {
                ey8Var.g(null);
                this.fadingEdge = null;
            }
        }
    }

    public void setNinePatchRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70b9eba", new Object[]{this, rect});
        } else {
            this.ninePatchRect = rect;
        }
    }

    public void setReleaseDrawableOnDetach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39799fd8", new Object[]{this, new Boolean(z)});
        } else {
            this.releaseDrawableOnDetach = z;
        }
    }

    public void setScrollState(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.imageLoader == null) {
            this.imageLoader = od0.D().a();
        }
        ImageLoader imageLoader = this.imageLoader;
        if (i == 2) {
            z = true;
        }
        imageLoader.h(z);
        if ((i == 0 || i == 1) && this.imageLoader.a() == 1) {
            reloadImage();
        }
    }

    public void setShowAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9087896", new Object[]{this, str});
        } else {
            this.animation = str;
        }
    }

    public void startPostponedSetImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cc594a", new Object[]{this});
        } else if (this.postponedSetImageDrawable) {
            this.postponedSetImageDrawable = false;
            Drawable drawable = this.postponedDrawable;
            if (drawable != null) {
                setImageDrawableInternal(drawable, false);
                this.postponedDrawable = null;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        xv9 xv9Var = this.mImpl;
        if (xv9Var == null || !xv9Var.j(drawable)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
        } else {
            notifyImageLoadCallback(null, null, i);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
        } else if (!this.inCachePool && TextUtils.equals(str, this.currentUrl)) {
            NinePatchDrawable ninePatchDrawable = bitmapDrawable;
            if (!str.startsWith(gpe.BASE64_TAG)) {
                if (bitmapDrawable instanceof dy0) {
                    dy0 dy0Var = (dy0) bitmapDrawable;
                    BitmapDrawable a2 = dy0Var.a();
                    int i = this.animationLoopCount;
                    if (i >= 0) {
                        dy0Var.b(i);
                    }
                    dy0Var.start();
                    bitmapDrawable2 = a2;
                } else {
                    bitmapDrawable2 = new BitmapDrawable(getResources(), bitmapDrawable.getBitmap());
                    if (this.ninePatchRect != null) {
                        ninePatchDrawable = h3k.a(getResources(), bitmapDrawable.getBitmap(), this.ninePatchRect, this.width, this.height);
                    }
                }
                ninePatchDrawable = bitmapDrawable2;
            }
            setImageDrawableInternal(ninePatchDrawable, false);
            notifyImageLoadCallback(str, ninePatchDrawable, 0);
        }
    }

    public void setImageSrc(o oVar, Object obj, String str, int i, int i2, ImageLoader.b bVar, Rect rect, boolean z) {
        ImageLoader imageLoader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a19884f", new Object[]{this, oVar, obj, str, new Integer(i), new Integer(i2), bVar, rect, new Boolean(z)});
            return;
        }
        this.imageSrc = obj;
        this.engine = oVar;
        this.width = i;
        this.height = i2;
        this.imageConfigInfo = bVar;
        this.enableImageMeasure = true;
        this.imageSrcLoadMode = true;
        setNinePatchRect(rect);
        ImageLoader.f g = gpe.g(this.imageLoader, oVar, obj, str, i, i2, bVar, rect, z, false, new a(SystemClock.uptimeMillis()));
        this.loadTask = g;
        if (g != null && (imageLoader = g.b) != null) {
            this.imageLoader = imageLoader;
        }
    }

    @Deprecated
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        this.imageSrcLoadMode = false;
        this.currentUrl = str;
        if (str != null && str.startsWith(gpe.BASE64_TAG)) {
            Bitmap g = ut2.g(str);
            if (g == null && (g = s6o.a(str)) != null) {
                ut2.o(str, g);
            }
            if (g != null) {
                onImageLoaded(str, new BitmapDrawable(g));
            } else {
                onImageLoadFailed(-1);
            }
        } else if (!TextUtils.isEmpty(str)) {
            if (this.imageLoader == null) {
                this.imageLoader = od0.D().a();
            }
            this.imageLoader.d(new ImageLoader.c(this.engine, getContext(), this.originUrl, str, this.width, this.height, this.imageConfigInfo, this.enableImageMeasure), false, this);
        } else {
            setImageDrawable(null);
        }
    }
}
