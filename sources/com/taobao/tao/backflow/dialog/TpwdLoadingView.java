package com.taobao.tao.backflow.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.lr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TpwdLoadingView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int round = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class LoadingView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Matrix mGradientMatrix;
        private LinearGradient mLinearGradient;
        private Paint mPaint;
        private int mViewWidth = 0;
        private int mTranslate = 0;
        private boolean mAnimating = true;

        static {
            t2o.a(666894364);
        }

        public LoadingView(Context context) {
            super(context);
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setColor(-1);
            this.mPaint.setDither(true);
            this.mPaint.setAntiAlias(true);
        }

        public static /* synthetic */ Object ipc$super(LoadingView loadingView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == 1389530587) {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/backflow/dialog/TpwdLoadingView$LoadingView");
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            Matrix matrix;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.mPaint);
            if (this.mAnimating && (matrix = this.mGradientMatrix) != null) {
                int i = this.mTranslate;
                int i2 = this.mViewWidth;
                int i3 = i + (i2 / 10);
                this.mTranslate = i3;
                if (i3 > i2 * 2) {
                    this.mTranslate = -i2;
                }
                matrix.setTranslate(this.mTranslate, 0.0f);
                this.mLinearGradient.setLocalMatrix(this.mGradientMatrix);
                postInvalidateDelayed(30L);
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
            if (this.mViewWidth == 0) {
                int measuredWidth = getMeasuredWidth();
                this.mViewWidth = measuredWidth;
                if (measuredWidth > 0) {
                    this.mLinearGradient = new LinearGradient(-this.mViewWidth, 0.0f, 0.0f, 0.0f, new int[]{872415231, -1, 872415231}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                    this.mGradientMatrix = new Matrix();
                    this.mPaint.setShader(this.mLinearGradient);
                }
            }
        }
    }

    static {
        t2o.a(666894363);
    }

    public TpwdLoadingView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        addView(LayoutInflater.from(context).inflate(R.layout.clip_taopassword_ui_loading, (ViewGroup) null));
        addView(new LoadingView(context));
        this.round = lr7.b(context, 6.0f);
    }

    public static /* synthetic */ Object ipc$super(TpwdLoadingView tpwdLoadingView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/backflow/dialog/TpwdLoadingView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            Path path = new Path();
            int i = this.round;
            path.addRoundRect(rectF, i, i, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setInnerViewsVisibility(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfd1c41", new Object[]{this, new Boolean(z)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            childAt.setVisibility(i);
        }
    }

    public TpwdLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TpwdLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
