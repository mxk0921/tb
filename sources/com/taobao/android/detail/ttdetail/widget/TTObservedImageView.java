package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.u3a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTObservedImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mDrawableDrawListener;
    private boolean mHasDrawableDrew;
    private float mWidthRatio = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TTObservedImageView.this.requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(912262940);
    }

    public TTObservedImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TTObservedImageView tTObservedImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/TTObservedImageView");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        b bVar;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            z = false;
        }
        this.mHasDrawableDrew = z;
        if (z && (bVar = this.mDrawableDrawListener) != null) {
            ((u3a.a) bVar).a(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (Float.compare(this.mWidthRatio, 0.0f) > 0) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((View.getDefaultSize(0, i) - getPaddingTop()) - getPaddingBottom()) * this.mWidthRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public void setObserveListener(b bVar) {
        Drawable drawable;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da1464b", new Object[]{this, bVar});
            return;
        }
        this.mDrawableDrawListener = bVar;
        if (this.mHasDrawableDrew && (drawable = getDrawable()) != null && (bVar2 = this.mDrawableDrawListener) != null) {
            ((u3a.a) bVar2).a(drawable);
        }
    }

    public void setWidthRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab4e892", new Object[]{this, new Float(f)});
        } else if (this.mWidthRatio != f) {
            this.mWidthRatio = f;
            if (isInLayout()) {
                post(new a());
            } else {
                requestLayout();
            }
        }
    }

    public TTObservedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TTObservedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
