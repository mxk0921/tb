package com.taobao.search.m3.price;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import tb.a07;
import tb.ckf;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PriceBottomView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String suffix = "...";
    private String bottomText;
    private String breakText;
    private final TextPaint paint;
    public static final a Companion = new a(null);
    private static final float textSize = o1p.a(12.0f);
    private static final int viewHeight = o1p.a(12.0f);
    private static final int defColor = Color.parseColor("#999999");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792430);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792429);
    }

    public PriceBottomView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        textPaint.setTextSize(textSize);
    }

    public static /* synthetic */ Object ipc$super(PriceBottomView priceBottomView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/price/PriceBottomView");
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return viewHeight;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        String str = this.breakText;
        if (str != null) {
            kw1.a(canvas, this.paint, 0.0f, str, 0.0f, viewHeight);
        }
    }

    public final boolean update(String str, Integer num) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503209a1", new Object[]{this, str, num})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.bottomText = str;
        TextPaint textPaint = this.paint;
        if (num != null) {
            i = num.intValue();
        } else {
            i = defColor;
        }
        textPaint.setColor(i);
        return true;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        String str = this.bottomText;
        if (str != null) {
            ilt.a aVar = ilt.Companion;
            if (aVar.a(str, this.paint) <= getMeasuredWidth()) {
                this.breakText = str;
                return;
            }
            int breakText = this.paint.breakText(str, true, getMeasuredWidth() - aVar.a(suffix, this.paint), null);
            if (breakText > 0) {
                String substring = str.substring(0, breakText);
                ckf.f(substring, "substring(...)");
                this.breakText = substring.concat(suffix);
            }
        }
    }
}
