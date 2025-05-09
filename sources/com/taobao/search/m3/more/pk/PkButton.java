package com.taobao.search.m3.more.pk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.a07;
import tb.ckf;
import tb.f4m;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.t2o;
import tb.tfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PkButton extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ADD_ICON = "https://gw.alicdn.com/imgextra/i4/O1CN01lTFU4L1q8betNAV1j_!!6000000005451-2-tps-40-40.png";
    private static final String DEF_SELECT_TEXT;
    private static final String DEF_TEXT;
    private static final int textDefColor = -1;
    private boolean currentState;
    private LinearGradient shader;
    private final TextPaint textPaint;
    private float textWidth;
    private static final a Companion = new a(null);
    private static final int padding = o1p.a(6.0f);
    private static final int btnHeight = o1p.a(19.0f);
    private static final float radius = o1p.a(9.5f);
    private static final int defStartColor = Color.parseColor("#ff9000");
    private static final int defEndColor = Color.parseColor("#ff5000");
    private static final int selectedBgColor = Color.parseColor("#fff1eb");
    private static final int selectedBorderWidth = o1p.a(0.5f);
    private static final int selectedBorderColor = Color.parseColor("#fa9f63");
    private static final float textSize = o1p.a(11.0f);
    private static final int iconSize = o1p.a(10.0f);
    private static final int iconMargin = o1p.a(2.5f);
    private static final int textSelectedColor = Color.parseColor("#ff5000");
    private String defText = DEF_TEXT;
    private String selectedText = DEF_SELECT_TEXT;
    private final Paint bgPaint = new Paint(1);
    private final tfe icon = new tfe(this, null, 2, null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792420);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792419);
        String q = Localization.q(R.string.taobao_app_1005_1_16695);
        ckf.f(q, "localizedString(...)");
        DEF_TEXT = q;
        String q2 = Localization.q(R.string.taobao_app_1005_1_16708);
        ckf.f(q2, "localizedString(...)");
        DEF_SELECT_TEXT = q2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkButton(Context context) {
        super(context);
        ckf.g(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        int i = padding;
        setPadding(i, 0, i, 0);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(textSize);
    }

    public static /* synthetic */ Object ipc$super(PkButton pkButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/more/pk/PkButton");
        }
    }

    private final void parseShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fbf4ff", new Object[]{this});
        } else {
            this.shader = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, defStartColor, defEndColor, Shader.TileMode.CLAMP);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.currentState) {
            tfe tfeVar = this.icon;
            int i = iconSize;
            tfeVar.d(ADD_ICON, i, i);
        }
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
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.currentState) {
            this.bgPaint.setShader(null);
            this.bgPaint.setColor(selectedBgColor);
            this.bgPaint.setStyle(Paint.Style.FILL);
            float f = radius;
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f, f, this.bgPaint);
            this.bgPaint.setStyle(Paint.Style.STROKE);
            float f2 = selectedBorderWidth / 2.0f;
            this.bgPaint.setColor(selectedBorderColor);
            canvas.drawRoundRect(f2, f2, getWidth() - f2, getHeight() - f2, f, f, this.bgPaint);
            kw1.a(canvas, this.textPaint, (getWidth() - this.textWidth) / 2.0f, this.selectedText, 0.0f, getHeight());
            return;
        }
        this.bgPaint.setShader(this.shader);
        this.bgPaint.setStyle(Paint.Style.FILL);
        float f3 = radius;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f3, f3, this.bgPaint);
        float f4 = padding;
        int height = getHeight();
        int i2 = iconSize;
        float f5 = (height - i2) / 2.0f;
        canvas.translate(f4, f5);
        this.icon.c(canvas);
        canvas.translate(-f4, -f5);
        kw1.a(canvas, this.textPaint, iconMargin + i + i2, this.defText, 0.0f, getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.currentState) {
            float a2 = ilt.Companion.a(this.selectedText, this.textPaint);
            this.textWidth = a2;
            setMeasuredDimension(((int) a2) + getPaddingLeft() + getPaddingRight(), btnHeight);
        } else {
            float a3 = ilt.Companion.a(this.defText, this.textPaint);
            this.textWidth = a3;
            setMeasuredDimension(((int) a3) + getPaddingLeft() + getPaddingRight() + iconSize + iconMargin, btnHeight);
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
        if (!this.currentState) {
            parseShader();
        }
    }

    public final void update(f4m f4mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cd0887", new Object[]{this, f4mVar});
            return;
        }
        ckf.g(f4mVar, "pkInfo");
        this.currentState = f4mVar.c();
        String a2 = f4mVar.a();
        if (a2 == null) {
            a2 = DEF_TEXT;
        }
        this.defText = a2;
        String d = f4mVar.d();
        if (d == null) {
            d = DEF_SELECT_TEXT;
        }
        this.selectedText = d;
        if (!this.currentState) {
            this.textPaint.setColor(-1);
            tfe tfeVar = this.icon;
            int i = iconSize;
            tfeVar.d(ADD_ICON, i, i);
            if (getWidth() > 0) {
                parseShader();
            }
        } else {
            this.textPaint.setColor(textSelectedColor);
            this.icon.e();
        }
        requestLayout();
    }
}
