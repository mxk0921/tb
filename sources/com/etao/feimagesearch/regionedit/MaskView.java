package com.etao.feimagesearch.regionedit;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.ckf;
import tb.fid;
import tb.s5i;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean attached;
    private View imageView;
    private boolean isMainMaskFullOfParent;
    private final s5i maskDrawable = new s5i();
    private final List<fid> objectDrawList = new ArrayList(1);

    static {
        t2o.a(481297379);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context) {
        super(context);
        ckf.g(context, "context");
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    public static /* synthetic */ Object ipc$super(MaskView maskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/regionedit/MaskView");
        }
    }

    private final void onAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f51baa", new Object[]{this});
            return;
        }
        this.maskDrawable.c(this);
        for (fid fidVar : this.objectDrawList) {
            fidVar.c(this);
        }
    }

    public final int getRealHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276d3f55", new Object[]{this})).intValue();
        }
        View view = this.imageView;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    public final int getRealWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eabfd38c", new Object[]{this})).intValue();
        }
        View view = this.imageView;
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    public final View getTargetImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d87cb622", new Object[]{this});
        }
        return this.imageView;
    }

    public final boolean isMainMaskFullOfParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48df34a", new Object[]{this})).booleanValue();
        }
        return this.isMainMaskFullOfParent;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.attached = true;
        onAttached();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.attached = false;
        this.maskDrawable.a(this);
        for (fid fidVar : this.objectDrawList) {
            fidVar.a(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        this.maskDrawable.d(this, canvas);
        View view = this.imageView;
        ckf.d(view);
        View view2 = this.imageView;
        ckf.d(view2);
        float left = view.getLeft() + view2.getTranslationX();
        View view3 = this.imageView;
        ckf.d(view3);
        View view4 = this.imageView;
        ckf.d(view4);
        canvas.translate(left, view3.getTop() + view4.getTranslationY());
        for (fid fidVar : this.objectDrawList) {
            fidVar.d(this, canvas);
        }
        View view5 = this.imageView;
        ckf.d(view5);
        View view6 = this.imageView;
        ckf.d(view6);
        float translationX = (-view5.getLeft()) - view6.getTranslationX();
        View view7 = this.imageView;
        ckf.d(view7);
        View view8 = this.imageView;
        ckf.d(view8);
        canvas.translate(translationX, (-view7.getTop()) - view8.getTranslationY());
    }

    public final void setImageView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2252cd", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        this.imageView = view;
    }

    public final void setMainMaskFullOfParent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ac8816", new Object[]{this, new Boolean(z)});
        } else {
            this.isMainMaskFullOfParent = z;
        }
    }

    public final void setParts(List<fid> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15800416", new Object[]{this, list});
            return;
        }
        ckf.g(list, "parts");
        this.objectDrawList.clear();
        this.objectDrawList.addAll(list);
        this.maskDrawable.g(list);
        if (this.attached) {
            onAttached();
        }
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        this.maskDrawable.setScale(f);
        for (fid fidVar : this.objectDrawList) {
            fidVar.setScale(f);
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64be870", new Object[]{this, new Float(f)});
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f800c10f", new Object[]{this, new Float(f)});
        } else {
            invalidate();
        }
    }

    public final void triggerMainMaskViewFullOfParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3f2019", new Object[]{this});
        } else {
            this.isMainMaskFullOfParent = true;
        }
    }
}
