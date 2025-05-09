package com.taobao.search.m3.discount;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import tb.a07;
import tb.ckf;
import tb.iai;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.rp7;
import tb.t2o;
import tb.tfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DiscountView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String suffix = "...";
    private CharSequence breakText;
    private rp7 discountInfo;
    private boolean hasIcon;
    private final tfe icon = new tfe(this, null, 2, null);
    private int iconWidth;
    private final TextPaint paint;
    public static final a Companion = new a(null);
    private static final int viewHeight = o1p.a(12.0f);
    private static final float textSize = o1p.a(12.0f);
    private static final int iconMargin = o1p.a(2.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792346);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792345);
    }

    public DiscountView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        textPaint.setTextSize(textSize);
    }

    public static /* synthetic */ Object ipc$super(DiscountView discountView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/discount/DiscountView");
        }
    }

    private final void loadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        this.hasIcon = false;
        rp7 rp7Var = this.discountInfo;
        if (rp7Var != null) {
            ckf.d(rp7Var);
            if (rp7Var.j() != 0) {
                rp7 rp7Var2 = this.discountInfo;
                ckf.d(rp7Var2);
                if (rp7Var2.a() != 0) {
                    rp7 rp7Var3 = this.discountInfo;
                    ckf.d(rp7Var3);
                    this.hasIcon = !TextUtils.isEmpty(rp7Var3.b());
                    tfe tfeVar = this.icon;
                    rp7 rp7Var4 = this.discountInfo;
                    ckf.d(rp7Var4);
                    String b = rp7Var4.b();
                    rp7 rp7Var5 = this.discountInfo;
                    ckf.d(rp7Var5);
                    rp7 rp7Var6 = this.discountInfo;
                    ckf.d(rp7Var6);
                    float j = rp7Var5.j() / rp7Var6.a();
                    int i = viewHeight;
                    tfeVar.d(b, (int) (j * i), i);
                }
            }
        }
    }

    private final void updatePaint() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b8d71c", new Object[]{this});
            return;
        }
        rp7 rp7Var = this.discountInfo;
        if (rp7Var != null) {
            TextPaint textPaint = this.paint;
            Integer i2 = rp7Var.i();
            if (i2 != null) {
                i = i2.intValue();
            } else {
                i = -16777216;
            }
            textPaint.setColor(i);
        }
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
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        loadIcon();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.icon.e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        this.icon.c(canvas);
        CharSequence charSequence = this.breakText;
        if (charSequence != null) {
            kw1.a(canvas, this.paint, iconMargin + this.iconWidth, charSequence.toString(), 0.0f, getHeight());
        }
    }

    public final void update(rp7 rp7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e021237", new Object[]{this, rp7Var});
            return;
        }
        ckf.g(rp7Var, "info");
        if (this.discountInfo != rp7Var || rp7Var.f()) {
            reset();
            rp7Var.k(false);
            this.discountInfo = rp7Var;
            this.icon.e();
            loadIcon();
            updatePaint();
            invalidate();
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        String str;
        rp7 rp7Var;
        rp7 rp7Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        this.breakText = null;
        rp7 rp7Var3 = this.discountInfo;
        if (rp7Var3 != null) {
            String g = rp7Var3.g();
            if (TextUtils.isEmpty(g)) {
                g = rp7Var3.h();
                if (TextUtils.isEmpty(g)) {
                    return;
                }
            }
            ilt.a aVar = ilt.Companion;
            float a2 = aVar.a(g, this.paint);
            if (this.hasIcon) {
                ckf.d(this.discountInfo);
                ckf.d(this.discountInfo);
                i = (int) ((rp7Var.j() / rp7Var2.a()) * viewHeight);
            } else {
                i = 0;
            }
            this.iconWidth = i;
            int measuredWidth = getMeasuredWidth();
            int i2 = this.iconWidth;
            int i3 = measuredWidth - i2;
            if (i2 > 0) {
                i3 -= iconMargin;
            }
            if (a2 <= i3) {
                this.breakText = g;
            } else if (a2 < aVar.a(suffix, this.paint)) {
                this.breakText = "";
            } else {
                ckf.d(g);
                int length = g.length() / 2;
                int i4 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int i5 = i4 + length;
                    int i6 = i5 / 2;
                    String substring = g.substring(0, i6);
                    ckf.f(substring, "substring(...)");
                    String concat = substring.concat(suffix);
                    if (z) {
                        str = g.substring(g.length() - iai.d(i5 / 2.0f));
                        ckf.f(str, "substring(...)");
                    } else {
                        str = g.substring(g.length() - i6);
                        ckf.f(str, "substring(...)");
                    }
                    String str2 = concat + str;
                    int a3 = (int) ilt.Companion.a(str2, this.paint);
                    if (a3 == i3) {
                        this.breakText = str2;
                        return;
                    }
                    if (a3 > i3) {
                        if (z2) {
                            StringBuilder sb = new StringBuilder();
                            int i7 = (i4 + (length - 1)) / 2;
                            String substring2 = g.substring(0, i7);
                            ckf.f(substring2, "substring(...)");
                            sb.append(substring2);
                            sb.append(suffix);
                            String substring3 = g.substring(g.length() - i7);
                            ckf.f(substring3, "substring(...)");
                            sb.append(substring3);
                            this.breakText = sb.toString();
                            return;
                        }
                        length = i6;
                    } else if (z) {
                        this.breakText = str2;
                        return;
                    } else if (z2) {
                        z = true;
                    } else {
                        i4 = i6;
                    }
                    if (i4 >= length) {
                        this.breakText = str2;
                        return;
                    } else if (i4 == length - 1) {
                        z2 = true;
                    }
                }
            }
        }
    }
}
