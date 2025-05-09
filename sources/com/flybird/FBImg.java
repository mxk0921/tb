package com.flybird;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.ImageLoader;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.f7l;
import tb.gwt;
import tb.jst;
import tb.vu3;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBImg extends FBView implements ImageLoader.ILayoutListener, ImageLoader.IViewAttachedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView A;
    public String B;
    public double C;
    public double D;
    public String E;
    public String F;
    public Context K;
    public boolean L;
    public boolean G = false;
    public boolean H = false;
    public int I = -1;
    public boolean J = false;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;

    public FBImg(Context context, FBDocument fBDocument) {
        super(context, new FBBorderImg(context), fBDocument);
        this.K = null;
        ImageView imageView = (ImageView) getInnerView();
        this.A = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.A;
        if (imageView2 instanceof FBBorderImg) {
            ((FBBorderImg) imageView2).setAttachedListener(this);
            ((FBBorderImg) this.A).a(this.mDoc.getEngine().getEngineLogTracer(), this.mDoc.getTid());
        }
        this.K = context;
        this.C = -1.0d;
        this.D = -1.0d;
    }

    public static /* synthetic */ boolean a(FBImg fBImg, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85614215", new Object[]{fBImg, new Boolean(z)})).booleanValue();
        }
        fBImg.N = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(FBImg fBImg, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1305055009:
                super.onLoadFinish();
                return null;
            case -1022301035:
                super.updateCSS((String) objArr[0], (String) objArr[1]);
                return null;
            case -740778899:
                super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue());
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBImg");
        }
    }

    public final void d() {
        gwt gwtVar;
        FBImg fBImg;
        boolean z;
        Throwable th;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        gwt a2 = FBDocumentAssistor.a(this.mDoc);
        try {
        } catch (Throwable th2) {
            th = th2;
            gwtVar = a2;
        }
        if (!this.H) {
            if (this.J) {
                try {
                    Object resource = this.mDoc.getEngine().getConfig().getResourceProvider().getResource(this.mDoc.k, "alipay_msp_indicatior_loading", this.mDoc.param.bundleName, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
                    if ((resource instanceof Drawable) && (imageView = this.A) != null) {
                        imageView.setImageDrawable((Drawable) resource);
                    }
                    gwtVar = a2;
                    fBImg = this;
                } catch (Throwable th3) {
                    th = th3;
                    gwtVar = a2;
                    fBImg = this;
                    z = false;
                    fBImg.N = z;
                    FBLogger.e(FBView.TAG, th);
                    FBDocumentAssistor.a(fBImg.mDoc, gwtVar, 21, "Img:loadImg");
                }
            } else {
                int i = this.mWidth;
                int i2 = this.mHeight;
                double d = this.D;
                int i3 = (d > vu3.b.GEO_NOT_SUPPORT ? 1 : (d == vu3.b.GEO_NOT_SUPPORT ? 0 : -1));
                if (i3 > 0) {
                    i = (int) d;
                } else {
                    double d2 = this.C;
                    if (d2 > vu3.b.GEO_NOT_SUPPORT) {
                        i = (int) d2;
                    }
                }
                double d3 = this.C;
                if (d3 > vu3.b.GEO_NOT_SUPPORT) {
                    i2 = (int) d3;
                } else if (i3 > 0) {
                    i = (int) d;
                }
                int[] iArr = {i, i2};
                this.N = true;
                gwtVar = a2;
                try {
                    this.mDoc.getEngine().getImageLoader().loadImage(this.mDoc.getEngine(), this.A, this.B, this.mDoc.param.bundleName, iArr, false, this.E, this.F, this.I, this.G, this, this.mDoc.param.resourceClient, new BirdNestEngine.ResourceProvider.Callback() { // from class: com.flybird.FBImg.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                        public void onLoadFailure(int i4, int i5, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i4), new Integer(i5), obj});
                                return;
                            }
                            FBImg.a(FBImg.this, false);
                            FBImg.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(false,\"" + FBImg.this.B + "\");");
                        }

                        @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                        public void onLoadSuccess(int i4, int i5, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i4), new Integer(i5), obj});
                                return;
                            }
                            FBImg.a(FBImg.this, false);
                            FBImg.this.mDoc.executeJs("document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(true,\"" + FBImg.this.B + "\");");
                        }
                    }, getExtraParams());
                    fBImg = this;
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                    fBImg = this;
                    fBImg.N = z;
                    FBLogger.e(FBView.TAG, th);
                    FBDocumentAssistor.a(fBImg.mDoc, gwtVar, 21, "Img:loadImg");
                }
            }
            FBDocumentAssistor.a(fBImg.mDoc, gwtVar, 21, "Img:loadImg");
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        super.doDestroy();
        this.mDoc = null;
        this.A = null;
    }

    public final double e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb124", new Object[]{this, str})).doubleValue();
        }
        if (str.contains("PX")) {
            return Double.parseDouble(str.replace("PX", "").trim());
        }
        return FBDocumentAssistor.getDp() * Double.parseDouble(str.replace("px", "").trim());
    }

    @Override // com.flybird.FBView
    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (!isDestroyed()) {
            super.onLoadFinish();
            View view = this.mView;
            if (view != null && view.getVisibility() == 0) {
                e();
            }
        }
    }

    @Override // com.flybird.FBView
    public void onVisibilityChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb329b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            e();
        }
    }

    @Override // com.alipay.birdnest.api.ImageLoader.IViewAttachedListener
    public void recycleDetachedView() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c672f1", new Object[]{this});
        } else if (this.M && (bitmapDrawable = (BitmapDrawable) this.A.getDrawable()) != null && (bitmap = bitmapDrawable.getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            this.A.setImageDrawable(null);
        }
    }

    @Override // com.alipay.birdnest.api.ImageLoader.ILayoutListener
    public void requestLayout(int i, int i2) {
        int i3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d3b00", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        boolean z2 = this.mHasWidth;
        if (!z2) {
            this.mWidth = i;
            if (!this.mHasHeight || i2 == 0) {
                i3 = i;
            } else {
                i3 = (this.mHeight * i) / i2;
            }
            this.mWidth = i3;
            z = true;
        }
        if (!this.mHasHeight) {
            if (z2 && i != 0) {
                i2 = (i2 * this.mWidth) / i;
            }
            this.mHeight = i2;
            z = true;
        }
        if (this.mDoc != null && z && !this.O) {
            this.mDoc.layout(this);
            this.O = true;
        }
    }

    @Override // com.flybird.FBView
    public void setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d89c6d", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        super.setRect(f, f2, f3, f4);
        if (this.L) {
            e();
            this.L = false;
        }
    }

    @Override // com.alipay.birdnest.api.ImageLoader.IViewAttachedListener
    public void viewAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28225b5b", new Object[]{this});
        } else if (this.M && !this.N) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) this.A.getDrawable();
            if (bitmapDrawable == null || bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                d();
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str != null && !isDestroyed()) {
            if (TextUtils.equals(str, "-webkit-filter") || TextUtils.equals(str, "webkitFilter")) {
                putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                int indexOf = str2.indexOf(f7l.BRACKET_START_STR);
                String replace = (indexOf > 0 ? str2.substring(indexOf + 1) : str2).replace(f7l.BRACKET_END_STR, "");
                if (str2.startsWith(Constants.Event.BLUR)) {
                    this.I = (int) e(replace);
                } else if (str2.startsWith("grayscale")) {
                    this.G = TextUtils.equals(replace, "1");
                }
                if (this.mDoc.isOnloadFinish()) {
                    e();
                    return;
                }
                return;
            }
            super.updateCSS(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r8.equals("defaultvalue") == false) goto L_0x002c;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAttr(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBImg.updateAttr(java.lang.String, java.lang.String):void");
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!isDestroyed()) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.mDoc.b0.post(new Runnable() { // from class: com.flybird.FBImg.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FBImg.this.d();
                        }
                    }
                });
                return;
            }
            gwt a2 = FBDocumentAssistor.a(this.mDoc);
            if (!BirdNestEngine.useDelayedImgLoading) {
                d();
                FBDocumentAssistor.a(this.mDoc, a2, 21, "Img:load");
            } else if (!this.mHasWidth || !this.mHasHeight) {
                d();
                FBDocumentAssistor.a(this.mDoc, a2, 21, "Img:load_delay_imm");
            } else {
                jst.c.post(new Runnable() { // from class: com.flybird.FBImg.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FBImg.this.d();
                        }
                    }
                });
                FBDocumentAssistor.a(this.mDoc, a2, 21, "Img:load_delay_post");
            }
        }
    }
}
