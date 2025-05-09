package com.alipay.android.msp.ui.widget.gifimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBBorderImg extends ImageView implements IBorderable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ProgressWheelHelper qh = null;
    private BorderHelper qg = new BorderHelper();

    public FBBorderImg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[]{this})).booleanValue();
        }
        ProgressWheelHelper progressWheelHelper = this.qh;
        if (progressWheelHelper == null || !progressWheelHelper.isRunning()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(FBBorderImg fBBorderImg, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/gifimage/FBBorderImg");
        }
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.qg.destory();
        this.qg = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        BorderHelper borderHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        if (!aA() && (borderHelper = this.qg) != null) {
            borderHelper.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (aA()) {
            this.qh.preDraw(canvas);
        } else {
            BorderHelper borderHelper = this.qg;
            if (borderHelper != null) {
                borderHelper.clipBorder(canvas);
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (aA()) {
            int[] measure = this.qh.measure(i, i2);
            setMeasuredDimension(measure[0], measure[1]);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        super.onRestoreInstanceState(parcelable);
        if (aA()) {
            this.qh.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        if (aA()) {
            return this.qh.onSaveInstanceState(super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (aA()) {
            this.qh.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (aA()) {
            this.qh.onVisibilityChanged(i);
        }
    }

    public boolean resetWheelHelper(String str) {
        float f;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e20a452f", new Object[]{this, str})).booleanValue();
        }
        try {
            f = getContext().getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            f = 3.0f;
        }
        int i2 = 5;
        int i3 = -1;
        if (str.contains("com.alipay.android.app/alipay_msp_loading_blue.gif") || str.contains("com.alipay.android.app/alipay_msp_loading.gif")) {
            if (this.qh == null) {
                int i4 = (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1));
                if (i4 > 0) {
                    i = 4;
                }
                if (str.contains("com.alipay.android.app/alipay_msp_loading_blue.gif")) {
                    i3 = Color.parseColor("#108ee9");
                    if (i4 > 0) {
                        i2 = 10;
                    }
                    i = i2;
                }
                ProgressWheelHelper progressWheelHelper = new ProgressWheelHelper(this, i, i, i3);
                this.qh = progressWheelHelper;
                progressWheelHelper.setupPaints();
                this.qh.setCircleRadius(getWidth());
                this.qh.setupBounds(getWidth(), getHeight());
            }
            this.qh.spin();
            this.qh.start();
            invalidate();
            return true;
        } else if (str.contains("com.alipay.android.app/alipay_msp_success.gif") || str.contains("com.alipay.android.app/alipay_msp_success_blue.gif")) {
            if (this.qh == null) {
                int i5 = (f > 2.0f ? 1 : (f == 2.0f ? 0 : -1));
                if (i5 > 0) {
                    i = 4;
                }
                if (str.contains("com.alipay.android.app/alipay_msp_success_blue.gif")) {
                    i3 = Color.parseColor("#108ee9");
                    if (i5 > 0) {
                        i2 = 10;
                    }
                    i = i2;
                }
                ProgressWheelHelper progressWheelHelper2 = new ProgressWheelHelper(this, i, i, i3);
                this.qh = progressWheelHelper2;
                progressWheelHelper2.setupPaints();
                this.qh.setCircleRadius(getWidth());
                this.qh.setupBounds(getWidth(), getHeight());
            }
            this.qh.stopSpinning();
            this.qh.beginDrawTick();
            if (!this.qh.isRunning()) {
                this.qh.start();
            }
            invalidate();
            return true;
        } else {
            if (aA()) {
                this.qh.pause();
                this.qh.stopSpinning();
                invalidate();
            }
            return false;
        }
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.qg.setBorder(i, i2);
        }
    }

    @Override // com.alipay.android.msp.ui.widget.gifimage.IBorderable
    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
        } else {
            this.qg.setBorderadius(i);
        }
    }

    public FBBorderImg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FBBorderImg(Context context) {
        super(context);
    }
}
