package com.taobao.search.m3.singlerow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.BaseItemView;
import tb.a07;
import tb.ckf;
import tb.hfn;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.qzp;
import tb.t2o;
import tb.tfe;
import tb.wuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SingleRowView extends BaseItemView implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String suffix = "...";
    private int borderRadius;
    private String brokeText;
    private int calculateWidth;
    private qzp currentInfo;
    private boolean hasIcon;
    private boolean hasRightIcon;
    private boolean isBreak;
    private wuk listener;
    private final TextPaint textPaint;
    private float textWidth;
    private boolean useCapsule;
    private boolean waterfall;
    public static final a Companion = new a(null);
    private static final int bgColor = Color.parseColor("#f7f7f7");
    private static final int capsuleHeight = o1p.a(21.0f);
    private static final int noCapsuleHeight = o1p.a(12.0f);
    private static final int defTextColor = Color.parseColor("#333333");
    private static final int capsulePadding = o1p.a(6.0f);
    private static final float textSize = o1p.a(12.0f);
    private static final int iconSize = o1p.a(12.0f);
    private static final int iconMargin = o1p.a(2.0f);
    private final tfe leftIcon = new tfe(this, null, 2, null);
    private final tfe rightIcon = new tfe(this, null, 2, null);
    private final Paint bgPaint = new Paint(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792458);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792457);
    }

    public SingleRowView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(textSize);
    }

    public static /* synthetic */ Object ipc$super(SingleRowView singleRowView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/singlerow/SingleRowView");
        }
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        qzp qzpVar = this.currentInfo;
        if (qzpVar != null) {
            if (this.hasIcon) {
                tfe tfeVar = this.leftIcon;
                String c = qzpVar.c();
                int i = iconSize;
                tfeVar.d(c, i, i);
            }
            if (this.hasRightIcon) {
                tfe tfeVar2 = this.rightIcon;
                String e = qzpVar.e();
                int i2 = iconSize;
                tfeVar2.d(e, i2, i2);
            }
        }
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.leftIcon.e();
        this.rightIcon.e();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        Integer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        qzp qzpVar = this.currentInfo;
        if (qzpVar == null) {
            return 0;
        }
        if (this.useCapsule || (qzpVar.a() != null && ((a2 = qzpVar.a()) == null || a2.intValue() != 0))) {
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

    public final boolean isBreak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d50a8800", new Object[]{this})).booleanValue();
        }
        return this.isBreak;
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
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        load();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        wuk wukVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        qzp qzpVar = this.currentInfo;
        if (qzpVar != null && (wukVar = this.listener) != null) {
            wukVar.b(qzpVar);
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
        release();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        Integer a2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        qzp qzpVar = this.currentInfo;
        if (qzpVar != null) {
            if (this.useCapsule || (qzpVar.a() != null && ((a2 = qzpVar.a()) == null || a2.intValue() != 0))) {
                int i = this.borderRadius;
                if (i < 0 || this.useCapsule) {
                    i = getHeight() / 2;
                }
                if (i > 0) {
                    float f2 = i;
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f2, f2, this.bgPaint);
                } else {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
                }
            } else {
                z = false;
            }
            if (z) {
                int i2 = capsulePadding;
                f = i2 + 0.0f;
                canvas.translate(i2, 0.0f);
            } else {
                f = 0.0f;
            }
            int height = getHeight();
            int i3 = iconSize;
            float f3 = (height - i3) / 2.0f;
            if (this.hasIcon) {
                canvas.translate(0.0f, f3);
                this.leftIcon.c(canvas);
                canvas.translate(0.0f, -f3);
                int i4 = iconMargin;
                f = f + i3 + i4;
                canvas.translate(i3 + i4, 0.0f);
            }
            String str = this.brokeText;
            if (str != null) {
                kw1.a(canvas, this.textPaint, 0.0f, str, 0.0f, getHeight());
                float f4 = this.textWidth;
                f += f4;
                canvas.translate(f4 + iconMargin, 0.0f);
            }
            if (this.hasRightIcon) {
                canvas.translate(0.0f, f3);
                this.rightIcon.c(canvas);
                canvas.translate(0.0f, -f3);
            }
            if (f > 0.0f) {
                canvas.translate(-f, 0.0f);
            }
        }
    }

    public final void update(qzp qzpVar, boolean z, wuk wukVar, boolean z2) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f82ca4", new Object[]{this, qzpVar, new Boolean(z), wukVar, new Boolean(z2)});
            return;
        }
        ckf.g(qzpVar, "info");
        ckf.g(wukVar, DataReceiveMonitor.CB_LISTENER);
        this.listener = wukVar;
        this.waterfall = z2;
        if (this.currentInfo != qzpVar) {
            this.hasIcon = !TextUtils.isEmpty(qzpVar.c());
            this.hasRightIcon = !TextUtils.isEmpty(qzpVar.e());
            reset();
            this.useCapsule = z;
            this.currentInfo = qzpVar;
            TextPaint textPaint = this.textPaint;
            Integer g = qzpVar.g();
            if (g != null) {
                i = g.intValue();
            } else {
                i = defTextColor;
            }
            textPaint.setColor(i);
            Paint paint = this.bgPaint;
            Integer a2 = qzpVar.a();
            if (a2 != null) {
                i2 = a2.intValue();
                if (i2 == 0) {
                    i2 = bgColor;
                }
            } else {
                i2 = bgColor;
            }
            paint.setColor(i2);
            if (qzpVar.b() >= 0) {
                i3 = o1p.b(qzpVar.b());
            } else {
                i3 = -1;
            }
            this.borderRadius = i3;
            load();
            if (TextUtils.isEmpty(qzpVar.h())) {
                setOnClickListener(null);
                setClickable(false);
                return;
            }
            setOnClickListener(this);
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        String str;
        Integer a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        this.calculateWidth = 0;
        this.textWidth = 0.0f;
        this.brokeText = null;
        this.isBreak = false;
        qzp qzpVar = this.currentInfo;
        if (qzpVar != null) {
            int measuredWidth = getMeasuredWidth();
            if (this.useCapsule || (qzpVar.a() != null && ((a2 = qzpVar.a()) == null || a2.intValue() != 0))) {
                i = capsulePadding * 2;
                measuredWidth -= i;
            } else {
                i = 0;
            }
            if (this.hasIcon) {
                int i2 = iconSize;
                int i3 = iconMargin;
                measuredWidth = (measuredWidth - i2) - i3;
                i += i2 + i3;
            }
            if (this.hasRightIcon) {
                int i4 = iconSize;
                measuredWidth -= i4;
                i += i4;
            }
            if (!this.waterfall) {
                StringBuilder sb = new StringBuilder();
                String d = qzpVar.d();
                if (d == null) {
                    d = "";
                }
                sb.append(d);
                sb.append(qzpVar.f());
                str = sb.toString();
            } else {
                str = qzpVar.f();
            }
            ilt.a aVar = ilt.Companion;
            float a3 = aVar.a(str, this.textPaint);
            this.textWidth = a3;
            float f = measuredWidth;
            if (a3 <= f) {
                this.brokeText = str;
                this.isBreak = false;
                this.calculateWidth = (int) (i + a3);
                return;
            }
            this.isBreak = true;
            float a4 = aVar.a(suffix, this.textPaint);
            float[] fArr = new float[1];
            int breakText = this.textPaint.breakText(str, true, f - a4, fArr);
            if (breakText > 0) {
                this.textWidth = fArr[0] + a4;
                String substring = str.substring(0, breakText);
                ckf.f(substring, "substring(...)");
                this.brokeText = substring.concat(suffix);
                this.calculateWidth = hfn.f((int) (i + this.textWidth), getMeasuredWidth());
                return;
            }
            this.calculateWidth = 0;
        }
    }
}
