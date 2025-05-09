package com.taobao.search.m3.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.ckf;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.p34;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class CommentView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float bgRadius;
    private static final int capsuleHeight;
    private static final int noCapsuleHeight;
    private static final String suffix = "...";
    private static final float textSize;
    private static final int topPadding;
    private final Paint bgPaint;
    private String brokeText;
    private final ArrayList<String> brokeTextLines = new ArrayList<>();
    private int calculateHeight;
    private int calculateWidth;
    private final TextPaint commentPaint;
    private p34 currentInfo;
    private float numCommentWidth;
    private final TextPaint numPaint;
    private final boolean twoLineMode;
    private boolean useCapsule;
    public static final a Companion = new a(null);
    private static final int defColor = Color.parseColor("#333333");
    private static final int bgColor = Color.parseColor("#f7f7f7");
    private static final int textMargin = o1p.a(7.0f);
    private static final int padding = o1p.a(6.0f);
    private static final int lineExtraSpacing = o1p.a(4.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792337);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792336);
        int a2 = o1p.a(21.0f);
        capsuleHeight = a2;
        int a3 = o1p.a(12.0f);
        noCapsuleHeight = a3;
        textSize = a3;
        bgRadius = a2 / 2.0f;
        topPadding = (a2 - a3) / 2;
    }

    public CommentView(Context context, boolean z) {
        super(context);
        this.twoLineMode = z;
        TextPaint textPaint = new TextPaint(1);
        this.numPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.commentPaint = textPaint2;
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        float f = textSize;
        textPaint.setTextSize(f);
        textPaint2.setTextSize(f);
        paint.setColor(bgColor);
    }

    public static /* synthetic */ Object ipc$super(CommentView commentView, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.reset();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/comment/CommentView");
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        int i = this.calculateHeight;
        if (i > 0) {
            return i;
        }
        if (this.useCapsule) {
            return capsuleHeight;
        }
        return noCapsuleHeight;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue();
        }
        return this.calculateWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        p34 p34Var = this.currentInfo;
        if (p34Var != null) {
            boolean z = this.useCapsule;
            if (z) {
                f = padding;
            } else {
                f = 0.0f;
            }
            if (z) {
                float f4 = bgRadius;
                canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f4, f4, this.bgPaint);
            }
            if (this.twoLineMode) {
                if (this.useCapsule) {
                    f2 = topPadding;
                } else {
                    f2 = 0.0f;
                }
                if (this.numCommentWidth > 0.0f) {
                    TextPaint textPaint = this.numPaint;
                    String b = p34Var.b();
                    ckf.d(b);
                    kw1.a(canvas, textPaint, f, b, f2, f2 + textSize);
                    f3 = this.numCommentWidth + f + textMargin;
                } else {
                    f3 = f;
                }
                Iterator<String> it = this.brokeTextLines.iterator();
                ckf.f(it, "iterator(...)");
                float f5 = f3;
                while (it.hasNext()) {
                    String next = it.next();
                    ckf.f(next, "next(...)");
                    String str = next;
                    TextPaint textPaint2 = this.commentPaint;
                    float f6 = textSize;
                    kw1.a(canvas, textPaint2, f5, str, f2, f2 + f6);
                    f2 = f2 + f6 + lineExtraSpacing;
                    f5 = f;
                }
                return;
            }
            if (this.numCommentWidth > 0.0f) {
                TextPaint textPaint3 = this.numPaint;
                String b2 = p34Var.b();
                ckf.d(b2);
                kw1.a(canvas, textPaint3, f, b2, 0.0f, getHeight());
                f = f + this.numCommentWidth + textMargin;
            }
            String str2 = this.brokeText;
            if (str2 != null) {
                TextPaint textPaint4 = this.commentPaint;
                ckf.d(str2);
                kw1.a(canvas, textPaint4, f, str2, 0.0f, getHeight());
            }
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        this.brokeText = null;
        this.numCommentWidth = 0.0f;
        this.calculateHeight = 0;
    }

    public final void update(p34 p34Var, boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202f489d", new Object[]{this, p34Var, new Boolean(z)});
            return;
        }
        ckf.g(p34Var, "info");
        if (this.currentInfo != p34Var) {
            reset();
            this.useCapsule = z;
            this.currentInfo = p34Var;
            TextPaint textPaint = this.numPaint;
            Integer a2 = p34Var.a();
            if (a2 != null) {
                i = a2.intValue();
            } else {
                i = defColor;
            }
            textPaint.setColor(i);
            TextPaint textPaint2 = this.commentPaint;
            Integer d = p34Var.d();
            if (d != null) {
                i2 = d.intValue();
            } else {
                i2 = defColor;
            }
            textPaint2.setColor(i2);
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        int i2;
        float a2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        p34 p34Var = this.currentInfo;
        if (p34Var != null) {
            this.calculateWidth = 0;
            float f = this.useCapsule ? padding * 2 : 0;
            float f2 = 0.0f + f;
            float measuredWidth = getMeasuredWidth() - f;
            if (this.twoLineMode) {
                this.calculateHeight = 0;
                this.brokeTextLines.clear();
                if (!TextUtils.isEmpty(p34Var.b())) {
                    float a3 = ilt.Companion.a(p34Var.b(), this.numPaint);
                    this.numCommentWidth = a3;
                    int i4 = textMargin;
                    measuredWidth = (measuredWidth - a3) - i4;
                    f2 = f2 + a3 + i4;
                }
                ilt.a aVar = ilt.Companion;
                if (aVar.a(p34Var.c(), this.commentPaint) <= measuredWidth) {
                    this.brokeTextLines.add(p34Var.c());
                    this.calculateWidth = (int) (f2 + ((int) a2));
                    return;
                }
                this.calculateWidth = getMeasuredWidth();
                int breakText = this.commentPaint.breakText(p34Var.c(), true, measuredWidth, null);
                if (breakText > 0) {
                    ArrayList<String> arrayList = this.brokeTextLines;
                    String substring = p34Var.c().substring(0, breakText);
                    ckf.f(substring, "substring(...)");
                    arrayList.add(substring);
                } else {
                    this.brokeTextLines.add("");
                    breakText = 0;
                }
                String substring2 = p34Var.c().substring(breakText);
                ckf.f(substring2, "substring(...)");
                float measuredWidth2 = getMeasuredWidth() - f;
                if (aVar.a(substring2, this.commentPaint) <= measuredWidth2) {
                    this.brokeTextLines.add(substring2);
                } else {
                    int breakText2 = this.commentPaint.breakText(substring2, true, measuredWidth2 - aVar.a(suffix, this.commentPaint), null);
                    if (breakText2 > 0) {
                        ArrayList<String> arrayList2 = this.brokeTextLines;
                        String substring3 = substring2.substring(0, breakText2);
                        ckf.f(substring3, "substring(...)");
                        arrayList2.add(substring3.concat(suffix));
                    }
                }
                if (this.useCapsule) {
                    i3 = topPadding * 2;
                }
                this.calculateHeight = (int) (i3 + (this.brokeTextLines.size() * textSize) + lineExtraSpacing);
                setMeasuredDimension(getMeasuredWidth(), this.calculateHeight);
                return;
            }
            if (!TextUtils.isEmpty(p34Var.b())) {
                float a4 = ilt.Companion.a(p34Var.b(), this.numPaint);
                this.numCommentWidth = a4;
                measuredWidth = (measuredWidth - a4) - textMargin;
                f2 += (int) (a4 + i2);
            }
            ilt.a aVar2 = ilt.Companion;
            float a5 = aVar2.a(p34Var.c(), this.commentPaint);
            this.brokeText = null;
            if (a5 <= measuredWidth) {
                this.brokeText = p34Var.c();
                i = (int) a5;
            } else {
                float a6 = aVar2.a(suffix, this.commentPaint);
                float[] fArr = new float[1];
                int breakText3 = this.commentPaint.breakText(p34Var.c(), true, measuredWidth - a6, fArr);
                if (breakText3 > 0) {
                    String substring4 = p34Var.c().substring(0, breakText3);
                    ckf.f(substring4, "substring(...)");
                    this.brokeText = substring4.concat(suffix);
                    i = (int) (fArr[0] + a6);
                }
                this.calculateWidth = (int) f2;
            }
            f2 += i;
            this.calculateWidth = (int) f2;
        }
    }
}
