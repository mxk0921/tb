package com.taobao.infoflow.ad.impl.dx.view.flip;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.s8d;
import tb.v1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CropImageView extends TUrlImageView implements s8d<SuccPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CropImageView";
    private CropType cropType = CropType.TOP;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum CropType {
        TOP,
        BOTTOM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CropType cropType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/CropImageView$CropType");
        }

        public static CropType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CropType) ipChange.ipc$dispatch("d0a89dbc", new Object[]{str});
            }
            return (CropType) Enum.valueOf(CropType.class, str);
        }
    }

    public CropImageView(Context context) {
        super(context);
        setup();
    }

    public static /* synthetic */ Object ipc$super(CropImageView cropImageView, String str, Object... objArr) {
        if (str.hashCode() == 563814646) {
            return new Boolean(super.setFrame(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/view/flip/CropImageView");
    }

    private void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        succListener(this);
    }

    public void setCropType(CropType cropType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85fb0080", new Object[]{this, cropType});
        } else {
            this.cropType = cropType;
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b20f6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (getDrawable() == null) {
            v1.b(TAG, "getDrawable() == null");
            return super.setFrame(i, i2, i3, i4);
        }
        Matrix imageMatrix = getImageMatrix();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
            f = measuredHeight;
            f2 = intrinsicHeight;
        } else {
            f = measuredWidth;
            f2 = intrinsicWidth;
        }
        float f3 = f / f2;
        if (CropType.BOTTOM == this.cropType) {
            float f4 = intrinsicHeight;
            rectF = new RectF(0.0f, f4 - (measuredHeight / f3), intrinsicWidth, f4);
        } else {
            rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight - (measuredHeight / f3));
        }
        imageMatrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, measuredWidth, measuredHeight), Matrix.ScaleToFit.FILL);
        setImageMatrix(imageMatrix);
        return super.setFrame(i, i2, i3, i4);
    }

    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
        }
        if (!(succPhenixEvent == null || succPhenixEvent.getDrawable() == null)) {
            v1.b(TAG, "onHappen requestLayout()");
            requestLayout();
        }
        return false;
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup();
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup();
    }
}
