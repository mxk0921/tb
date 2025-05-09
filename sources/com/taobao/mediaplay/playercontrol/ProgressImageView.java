package com.taobao.mediaplay.playercontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import tb.ks3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ProgressImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ks3 mAnimatedDrawable;
    private int mCircularWidth = 32;

    static {
        t2o.a(774897827);
    }

    public ProgressImageView(Context context) {
        super(context);
    }

    private void drawIndeterminateProgress(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808d01a", new Object[]{this, canvas});
            return;
        }
        int dip2px = DWViewUtil.dip2px(getContext(), this.mCircularWidth);
        int dip2px2 = DWViewUtil.dip2px(getContext(), this.mCircularWidth);
        int measuredWidth = (int) ((getMeasuredWidth() - dip2px) / 2.0f);
        int measuredHeight = (int) ((getMeasuredHeight() - dip2px2) / 2.0f);
        ks3 ks3Var = this.mAnimatedDrawable;
        if (ks3Var == null) {
            ks3 ks3Var2 = new ks3(Color.parseColor("#FF8C00"), DWViewUtil.dip2px(getContext(), 6.0f));
            this.mAnimatedDrawable = ks3Var2;
            int i = dip2px + measuredWidth;
            int i2 = dip2px2 + measuredHeight;
            ks3Var2.setBounds(measuredWidth, measuredHeight, i, i2);
            this.mAnimatedDrawable.setCallback(this);
            this.mAnimatedDrawable.start();
            invalidate(measuredWidth, measuredHeight, i, i2);
            return;
        }
        ks3Var.draw(canvas);
        invalidate(measuredWidth, measuredHeight, dip2px + measuredWidth, dip2px2 + measuredHeight);
    }

    public static /* synthetic */ Object ipc$super(ProgressImageView progressImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 448480424) {
            super.drawableStateChanged();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mediaplay/playercontrol/ProgressImageView");
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
        invalidateDrawable(this.mAnimatedDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        drawIndeterminateProgress(canvas);
    }

    public void setCircularWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b4957", new Object[]{this, new Integer(i)});
            return;
        }
        this.mCircularWidth = i;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        ks3 ks3Var = this.mAnimatedDrawable;
        if (ks3Var == null) {
            return;
        }
        if (i == 0) {
            ks3Var.start();
        } else {
            ks3Var.stop();
        }
    }

    public ProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProgressImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
