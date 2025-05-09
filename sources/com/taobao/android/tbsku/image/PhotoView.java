package com.taobao.android.tbsku.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.auk;
import tb.bwk;
import tb.esk;
import tb.gwk;
import tb.j2m;
import tb.rsk;
import tb.t2o;
import tb.tuk;
import tb.zsk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PhotoView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private j2m attacher;
    private ImageView.ScaleType pendingScaleType;

    static {
        t2o.a(785383528);
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.attacher = new j2m(this);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/image/PhotoView");
        }
    }

    public j2m getAttacher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2m) ipChange.ipc$dispatch("efabc94", new Object[]{this});
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

    public boolean isZoomable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d17002", new Object[]{this})).booleanValue();
        }
        return this.attacher.S();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74342f80", new Object[]{this, new Boolean(z)});
        } else {
            this.attacher.U(z);
        }
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6043578", new Object[]{this, matrix})).booleanValue();
        }
        return this.attacher.V(matrix);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b20f6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.attacher.t0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        j2m j2mVar = this.attacher;
        if (j2mVar != null) {
            j2mVar.t0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        super.setImageResource(i);
        j2m j2mVar = this.attacher;
        if (j2mVar != null) {
            j2mVar.t0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f407ced", new Object[]{this, uri});
            return;
        }
        super.setImageURI(uri);
        j2m j2mVar = this.attacher;
        if (j2mVar != null) {
            j2mVar.t0();
        }
    }

    public void setMaximumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203da70d", new Object[]{this, new Float(f)});
        } else {
            this.attacher.X(f);
        }
    }

    public void setMediumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92102e6", new Object[]{this, new Float(f)});
        } else {
            this.attacher.Y(f);
        }
    }

    public void setMinimumScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3a6f7b", new Object[]{this, new Float(f)});
        } else {
            this.attacher.Z(f);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.attacher.a0(onClickListener);
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ba033", new Object[]{this, onDoubleTapListener});
        } else {
            this.attacher.b0(onDoubleTapListener);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.attacher.c0(onLongClickListener);
        }
    }

    public void setOnMatrixChangeListener(esk eskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1a607b", new Object[]{this, eskVar});
        } else {
            this.attacher.d0(eskVar);
        }
    }

    public void setOnOutsidePhotoTapListener(rsk rskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d29a81b", new Object[]{this, rskVar});
        } else {
            this.attacher.e0(rskVar);
        }
    }

    public void setOnPhotoTapListener(zsk zskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ff9a29", new Object[]{this, zskVar});
        } else {
            this.attacher.f0(zskVar);
        }
    }

    public void setOnScaleChangeListener(auk aukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efbde49", new Object[]{this, aukVar});
        } else {
            this.attacher.g0(aukVar);
        }
    }

    public void setOnSingleFlingListener(tuk tukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a337db", new Object[]{this, tukVar});
        } else {
            this.attacher.h0(tukVar);
        }
    }

    public void setOnViewDragListener(bwk bwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9230a159", new Object[]{this, bwkVar});
        } else {
            this.attacher.i0(bwkVar);
        }
    }

    public void setOnViewTapListener(gwk gwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2281d1b", new Object[]{this, gwkVar});
        } else {
            this.attacher.j0(gwkVar);
        }
    }

    public void setRotationBy(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1665b002", new Object[]{this, new Float(f)});
        } else {
            this.attacher.k0(f);
        }
    }

    public void setRotationTo(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd85645e", new Object[]{this, new Float(f)});
        } else {
            this.attacher.l0(f);
        }
    }

    public void setScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f)});
        } else {
            this.attacher.m0(f);
        }
    }

    public void setScaleLevels(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8219bc62", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.attacher.p0(f, f2, f3);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        j2m j2mVar = this.attacher;
        if (j2mVar == null) {
            this.pendingScaleType = scaleType;
        } else {
            j2mVar.q0(scaleType);
        }
    }

    public boolean setSuppMatrix(Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e7b0194", new Object[]{this, matrix})).booleanValue();
        }
        return this.attacher.V(matrix);
    }

    public void setZoomTransitionDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253df7de", new Object[]{this, new Integer(i)});
        } else {
            this.attacher.r0(i);
        }
    }

    public void setZoomable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5540e5e", new Object[]{this, new Boolean(z)});
        } else {
            this.attacher.s0(z);
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
            this.attacher.o0(f, z);
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
            this.attacher.n0(f, f2, f3, z);
        }
    }
}
