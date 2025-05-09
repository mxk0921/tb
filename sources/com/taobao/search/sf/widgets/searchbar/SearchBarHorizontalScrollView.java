package com.taobao.search.sf.widgets.searchbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.o1p;
import tb.t2o;
import tb.why;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchBarHorizontalScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mFadingEdgePaint;

    static {
        t2o.a(815793774);
    }

    public SearchBarHorizontalScrollView(Context context) {
        this(context, null);
    }

    private void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        this.mFadingEdgePaint.setAntiAlias(true);
        this.mFadingEdgePaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, o1p.b(29), new int[]{Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR), Color.parseColor("#dddddd"), Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR)}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public static /* synthetic */ Object ipc$super(SearchBarHorizontalScrollView searchBarHorizontalScrollView, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/searchbar/SearchBarHorizontalScrollView");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        if (canScrollHorizontally(1)) {
            int width = getWidth() + getScrollX();
            canvas.drawRect(width - o1p.b(1), 0.0f, width, getHeight(), this.mFadingEdgePaint);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79b159cb", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public SearchBarHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFadingEdgePaint = new Paint();
        initPaint();
    }
}
