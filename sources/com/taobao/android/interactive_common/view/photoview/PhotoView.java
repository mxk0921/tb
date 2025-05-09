package com.taobao.android.interactive_common.view.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.awk;
import tb.dsk;
import tb.ewk;
import tb.fwk;
import tb.i2m;
import tb.qsk;
import tb.suk;
import tb.ysk;
import tb.ztk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PhotoView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private i2m attacher;
    private ImageView.ScaleType pendingScaleType;

    public PhotoView(Context context) {
        this(context, null);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.attacher = new i2m(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.pendingScaleType;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.pendingScaleType = null;
        }
    }

    public static /* synthetic */ Object ipc$super(PhotoView photoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -974402955:
                super.setImageResource(((Number) objArr[0]).intValue());
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 563814646:
                return new Boolean(super.setFrame(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue()));
            case 792755437:
                super.setImageURI((Uri) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/photoview/PhotoView");
        }
    }

    public i2m getAttacher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2m) ipChange.ipc$dispatch("3e0694bb", new Object[]{this});
        }
        return this.attacher;
    }

    public void getDisplayMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667b1768", new Object[]{this, matrix});
        } else {
            this.attacher.E(matrix);
        }
    }

    public RectF getDisplayRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("c7965670", new Object[]{this});
        }
        return this.attacher.F();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Matrix) ipChange.ipc$dispatch("83fe98d9", new Object[]{this});
        }
        return this.attacher.I();
    }

    public float getMaximumScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0aa8df7", new Object[]{this})).floatValue();
        }
        return this.attacher.L();
    }

    public float getMediumScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad95ce96", new Object[]{this})).floatValue();
        }
        return this.attacher.M();
    }

    public float getMinimumScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccdbffc9", new Object[]{this})).floatValue();
        }
        return this.attacher.N();
    }

    public float getScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f6c4a0b", new Object[]{this})).floatValue();
        }
        return this.attacher.O();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this});
        }
        return this.attacher.P();
    }

    public void getSuppMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc841c", new Object[]{this, matrix});
        } else {
            this.attacher.Q(matrix);
        }
    }

    @Deprecated
    public boolean isZoomEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b058eaef", new Object[]{this})).booleanValue();
        }
        return this.attacher.S();
    }

    public boolean isZoomable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d17002", new Object[]{this})).booleanValue();
        }
        return this.attacher.T();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74342f80", new Object[]{this, new Boolean(z)});
        } else {
            this.attacher.V(z);
        }
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6043578", new Object[]{this, matrix})).booleanValue();
        }
        return this.attacher.W(matrix);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b20f6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.attacher.u0();
        }
        return frame;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        i2m i2mVar = this.attacher;
        if (i2mVar != null) {
            i2mVar.u0();
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        super.setImageResource(i);
        i2m i2mVar = this.attacher;
        if (i2mVar != null) {
            i2mVar.u0();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f407ced", new Object[]{this, uri});
            return;
        }
        super.setImageURI(uri);
        i2m i2mVar = this.attacher;
        if (i2mVar != null) {
            i2mVar.u0();
        }
    }

    public void setMaximumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203da70d", new Object[]{this, new Float(f)});
        } else {
            this.attacher.Y(f);
        }
    }

    public void setMediumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92102e6", new Object[]{this, new Float(f)});
        } else {
            this.attacher.Z(f);
        }
    }

    public void setMinimumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3a6f7b", new Object[]{this, new Float(f)});
        } else {
            this.attacher.a0(f);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.attacher.b0(onClickListener);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba033", new Object[]{this, onDoubleTapListener});
        } else {
            this.attacher.c0(onDoubleTapListener);
        }
    }

    public void setOnLongClickListener(ewk ewkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea423c7", new Object[]{this, ewkVar});
        } else {
            this.attacher.d0(ewkVar);
        }
    }

    public void setOnMatrixChangeListener(dsk dskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5478e2", new Object[]{this, dskVar});
        } else {
            this.attacher.e0(dskVar);
        }
    }

    public void setOnOutsidePhotoTapListener(qsk qskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d60f682", new Object[]{this, qskVar});
        } else {
            this.attacher.f0(qskVar);
        }
    }

    public void setOnPhotoTapListener(ysk yskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3f6d62", new Object[]{this, yskVar});
        } else {
            this.attacher.g0(yskVar);
        }
    }

    public void setOnScaleChangeListener(ztk ztkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d3ac42", new Object[]{this, ztkVar});
        } else {
            this.attacher.h0(ztkVar);
        }
    }

    public void setOnSingleFlingListener(suk sukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee60742", new Object[]{this, sukVar});
        } else {
            this.attacher.i0(sukVar);
        }
    }

    public void setOnViewDragListener(awk awkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cdb292", new Object[]{this, awkVar});
        } else {
            this.attacher.j0(awkVar);
        }
    }

    public void setOnViewTapListener(fwk fwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1902482", new Object[]{this, fwkVar});
        } else {
            this.attacher.k0(fwkVar);
        }
    }

    public void setRotationBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1665b002", new Object[]{this, new Float(f)});
        } else {
            this.attacher.l0(f);
        }
    }

    public void setRotationTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd85645e", new Object[]{this, new Float(f)});
        } else {
            this.attacher.m0(f);
        }
    }

    public void setScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f)});
        } else {
            this.attacher.n0(f);
        }
    }

    public void setScaleLevels(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bc62", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.attacher.q0(f, f2, f3);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        i2m i2mVar = this.attacher;
        if (i2mVar == null) {
            this.pendingScaleType = scaleType;
        } else {
            i2mVar.r0(scaleType);
        }
    }

    public boolean setSuppMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7b0194", new Object[]{this, matrix})).booleanValue();
        }
        return this.attacher.W(matrix);
    }

    public void setZoomTransitionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253df7de", new Object[]{this, new Integer(i)});
        } else {
            this.attacher.s0(i);
        }
    }

    public void setZoomable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
        } else {
            this.attacher.t0(z);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf4e5e3", new Object[]{this, new Float(f), new Boolean(z)});
        } else {
            this.attacher.p0(f, z);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1466623", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Boolean(z)});
        } else {
            this.attacher.o0(f, f2, f3, z);
        }
    }
}
