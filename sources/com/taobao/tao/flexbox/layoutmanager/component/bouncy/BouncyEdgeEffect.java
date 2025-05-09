package com.taobao.tao.flexbox.layoutmanager.component.bouncy;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import tb.akt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BouncyEdgeEffect extends EdgeEffect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean changeSizeToBlendMode;
    private int direction;
    private float flingSize;
    private float overscrollSize;
    private SpringAnimation spring;
    private View view;

    static {
        t2o.a(503316892);
    }

    public BouncyEdgeEffect(Context context, SpringAnimation springAnimation, View view, int i, float f, float f2) {
        super(context);
        boolean z;
        BlendMode blendMode;
        this.spring = springAnimation;
        this.view = view;
        this.direction = i;
        this.flingSize = f;
        this.overscrollSize = f2;
        if (Build.VERSION.SDK_INT < 31 || !akt.M()) {
            z = false;
        } else {
            z = true;
        }
        this.changeSizeToBlendMode = z;
        if (z) {
            blendMode = BlendMode.DST;
            setBlendMode(blendMode);
        }
    }

    public static /* synthetic */ Object ipc$super(BouncyEdgeEffect bouncyEdgeEffect, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133570:
                return new Boolean(super.draw((Canvas) objArr[0]));
            case -545719157:
                super.onPull(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -384781584:
                super.onAbsorb(((Number) objArr[0]).intValue());
                return null;
            case 691263919:
                super.onRelease();
                return null;
            case 1644963285:
                super.onPull(((Number) objArr[0]).floatValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/bouncy/BouncyEdgeEffect");
        }
    }

    private void onPullAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e538f9", new Object[]{this, new Float(f)});
            return;
        }
        this.spring.cancel();
        int i = this.direction;
        if (i == 3) {
            float width = this.view.getWidth() * (-1) * f * this.overscrollSize;
            View view = this.view;
            view.setTranslationY(view.getTranslationY() + width);
        } else if (i == 1) {
            float abs = Math.abs(this.view.getWidth() * f * this.overscrollSize);
            View view2 = this.view;
            view2.setTranslationY(view2.getTranslationY() + abs);
        }
        int i2 = this.direction;
        if (i2 == 0) {
            float abs2 = Math.abs(this.view.getHeight() * f * this.overscrollSize);
            View view3 = this.view;
            view3.setTranslationX(view3.getTranslationX() + abs2);
        } else if (i2 == 2) {
            float height = this.view.getHeight() * (-1) * f * this.overscrollSize;
            View view4 = this.view;
            view4.setTranslationX(view4.getTranslationX() + height);
        }
    }

    @Override // android.widget.EdgeEffect
    public boolean draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cc013fe", new Object[]{this, canvas})).booleanValue();
        }
        if (!this.changeSizeToBlendMode) {
            setSize(0, 0);
        }
        return super.draw(canvas);
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i) {
        float f;
        float f2;
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e910b2f0", new Object[]{this, new Integer(i)});
            return;
        }
        super.onAbsorb(i);
        View view = this.view;
        if (!(view instanceof AbsTNodeScrollView) || (findTargetRecyclerView = ((AbsTNodeScrollView) view).findTargetRecyclerView(view)) == null || !findTargetRecyclerView.canScrollVertically(-1)) {
            int i2 = this.direction;
            if (i2 == 3 || i2 == 2) {
                f = i * (-1);
                f2 = this.flingSize;
            } else {
                f = i;
                f2 = this.flingSize;
            }
            this.spring.setStartVelocity(f * f2).start();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
            return;
        }
        super.onPull(f);
        onPullAnimation(f);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2933d9af", new Object[]{this});
            return;
        }
        super.onRelease();
        this.spring.start();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df78fc8b", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        super.onPull(f, f2);
        onPullAnimation(f);
    }
}
