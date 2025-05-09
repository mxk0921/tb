package com.taobao.tab2interact.core.redpackage.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.iwa;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HighLightLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private iwa background;
    private Context mContext;
    private RectF rect;
    private float rx;
    private float ry;

    static {
        t2o.a(689963198);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighLightLayout(Context context) {
        super(context);
        ckf.g(context, "context");
        initView(context, null, 0);
    }

    private final void initView(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca88821", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        iwa iwaVar = new iwa(new ColorDrawable(Color.argb(127, 0, 0, 0)));
        this.background = iwaVar;
        setBackground(iwaVar);
    }

    public static /* synthetic */ Object ipc$super(HighLightLayout highLightLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/redpackage/view/HighLightLayout");
    }

    public final void setHighLightArea(RectF rectF, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cb8257", new Object[]{this, rectF, new Float(f), new Float(f2)});
            return;
        }
        ckf.g(rectF, "rectF");
        this.rect = rectF;
        this.rx = f;
        this.ry = f2;
        Path path = new Path();
        RectF rectF2 = this.rect;
        ckf.d(rectF2);
        float f3 = rectF2.left;
        RectF rectF3 = this.rect;
        ckf.d(rectF3);
        float f4 = rectF3.top;
        RectF rectF4 = this.rect;
        ckf.d(rectF4);
        float f5 = rectF4.right;
        RectF rectF5 = this.rect;
        ckf.d(rectF5);
        path.addRoundRect(f3, f4, f5, rectF5.bottom, f, f2, Path.Direction.CW);
        iwa iwaVar = this.background;
        if (iwaVar != null) {
            iwaVar.a(path);
            invalidate();
            return;
        }
        ckf.y("background");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighLightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.mContext = context;
        initView(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighLightLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        initView(context, attributeSet, i);
    }
}
