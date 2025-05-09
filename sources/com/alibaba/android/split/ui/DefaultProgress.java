package com.alibaba.android.split.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;
import tb.u47;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DefaultProgress extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private u47 mProgressDrawable;
    private ImageView mProgressView;

    static {
        t2o.a(676331686);
    }

    public DefaultProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u47 u47Var = new u47(-1, 16.0f);
        this.mProgressDrawable = u47Var;
        u47Var.setCallback(this);
        View.inflate(context, R.layout.feature_install_progress, this);
        this.mProgressView = (ImageView) findViewById(R.id.at_circularProgress);
        this.mProgressDrawable.f(-6710887);
        this.mProgressDrawable.g(context.getResources().getDisplayMetrics().density * 2.0f);
        int i2 = (int) (context.getResources().getDisplayMetrics().density * 32.0f);
        this.mProgressView.getLayoutParams().width = i2;
        this.mProgressView.getLayoutParams().height = i2;
        this.mProgressView.setImageDrawable(this.mProgressDrawable);
        setBackgroundDrawable(context.getResources().getDrawable(R.drawable.waitview));
        setAlpha(1.0f);
    }

    public static /* synthetic */ Object ipc$super(DefaultProgress defaultProgress, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/ui/DefaultProgress");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        u47 u47Var = this.mProgressDrawable;
        if (u47Var != null) {
            u47Var.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        u47 u47Var = this.mProgressDrawable;
        if (u47Var != null) {
            u47Var.stop();
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
        this.mProgressDrawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        u47 u47Var = this.mProgressDrawable;
        if (u47Var == null) {
            return;
        }
        if (i == 8 || i == 4) {
            u47Var.stop();
        } else {
            u47Var.start();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable == this.mProgressDrawable || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public DefaultProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultProgress(Context context) {
        this(context, null);
    }
}
