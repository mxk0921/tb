package tb;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.view.DXNativeFastText;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cx5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final long DXFASTTEXTVIEW_ENABLEELLIPSIZEENDFIX_ANDROID = -7798689015804333677L;
    public static final long DXFASTTEXTVIEW_FIXBREAKMODE = 1123090172363955901L;
    public static final long DXFASTTEXTVIEW_TEXTGRADIENT = -7737820265254236161L;
    public Layout.Alignment alignment;
    public int beforeEllipsizeLineCount;
    public TextUtils.TruncateAt ellipsize;
    private boolean enableEllipsizeEndFix_Android;
    public int fontWeight;
    private boolean isItalic;
    public int lineBreakMode;
    public int maxLine;
    public int maxWidth;
    private boolean needSetTextGradient;
    public int realPaddingBottom;
    public int realPaddingTop;
    public StaticLayout staticLayout;
    public int textFlags;
    private DXWidgetNode.d textGradient;
    public int textGravity;
    public TextPaint textPaint;
    public float textSize;
    public int textStyle;
    public float translateY;
    public static int DEFAULT_TEXT_SIZE = 0;
    public static int DEFAULT_MAX_LINE = 1;
    public static int DEFAULT_FONT_WEIGHT = -1;
    public static final CharSequence ELLIPSIS_TEXT = "…";
    public CharSequence showText = "";
    private boolean enableTextSizeStrategy = true;
    public int lineHeight = -1;
    public int lineSpacing = -1;
    public boolean fixBreakMode = false;
    public CharSequence text = "";
    public int textColor = -16777216;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597291);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new cx5();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation = iArr;
            try {
                iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.TL_BR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BR_TL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BL_TR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.TR_BL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public cx5() {
        if (DEFAULT_TEXT_SIZE == 0 && DinamicXEngine.x() != null) {
            DEFAULT_TEXT_SIZE = pb6.f(DinamicXEngine.x(), 12.0f);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = DEFAULT_MAX_LINE;
        this.maxWidth = Integer.MAX_VALUE;
        this.fontWeight = DEFAULT_FONT_WEIGHT;
        this.isItalic = false;
    }

    private void calculateEllipsizeText() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7621b", new Object[]{this});
            return;
        }
        int lineEnd = this.staticLayout.getLineEnd(this.maxLine - 1);
        try {
            if (lineEnd <= 0) {
                this.showText = "";
                return;
            }
            if (!(this.ellipsize == null || this.text.length() == 1)) {
                TextPaint textPaint = this.textPaint;
                CharSequence charSequence = ELLIPSIS_TEXT;
                float width = this.staticLayout.getWidth() - textPaint.measureText(charSequence, 0, charSequence.length());
                int lineStart = this.staticLayout.getLineStart(this.maxLine - 1);
                TextUtils.TruncateAt truncateAt = this.ellipsize;
                if (truncateAt == TextUtils.TruncateAt.END) {
                    int i2 = lineEnd - 1;
                    if (isEnableEllipsizeEndFix()) {
                        i2 = lineEnd;
                    }
                    while (true) {
                        if (i2 < lineStart) {
                            i2 = 0;
                            break;
                        }
                        CharSequence subSequence = this.text.subSequence(lineStart, i2);
                        if (this.textPaint.measureText(subSequence, 0, subSequence.length()) < width) {
                            break;
                        }
                        i2--;
                    }
                    this.showText = this.text.subSequence(0, i2).toString() + ((Object) ELLIPSIS_TEXT);
                    return;
                } else if (truncateAt == TextUtils.TruncateAt.START && this.maxLine == 1) {
                    int length = this.text.length();
                    int i3 = length - 1;
                    while (true) {
                        if (i3 < 0) {
                            i = 0;
                            break;
                        } else if (this.textPaint.measureText(this.text, i3, length) > width) {
                            i = i3 + 1;
                            break;
                        } else {
                            i3--;
                        }
                    }
                    this.showText = ((Object) ELLIPSIS_TEXT) + this.text.subSequence(i, length).toString();
                    return;
                } else if (truncateAt == TextUtils.TruncateAt.MIDDLE && this.maxLine == 1) {
                    int length2 = this.text.length();
                    float f = 0.0f;
                    int i4 = length2;
                    float f2 = 0.0f;
                    boolean z = true;
                    int i5 = 0;
                    for (int i6 = 0; i6 < length2; i6++) {
                        if (z) {
                            int i7 = i5 + 1;
                            float measureText = this.textPaint.measureText(this.text, 0, i7);
                            if (measureText + f2 > width) {
                                break;
                            }
                            i5 = i7;
                            f = measureText;
                            z = false;
                        } else {
                            int i8 = i4 - 1;
                            float measureText2 = this.textPaint.measureText(this.text, i8, length2);
                            if (f + measureText2 > width) {
                                break;
                            }
                            i4 = i8;
                            f2 = measureText2;
                            z = true;
                        }
                    }
                    this.showText = this.text.subSequence(0, i5).toString() + ((Object) ELLIPSIS_TEXT) + ((Object) this.text.subSequence(i4, length2));
                    return;
                } else {
                    return;
                }
            }
            this.showText = this.text.subSequence(0, lineEnd);
        } catch (Exception e) {
            this.showText = this.text.subSequence(0, lineEnd);
            if (getDXRuntimeContext() == null || TextUtils.isEmpty(getDXRuntimeContext().c())) {
                f fVar = new f("dinamicx");
                fVar.c.add(new f.a("Pipeline_Detail", "Pipeline_Detail_PerformMeasure", 80005));
                ic5.p(fVar);
            } else {
                f m = getDXRuntimeContext().m();
                m.d = this.isEnableButter;
                m.b = getDXRuntimeContext().p();
                m.c.add(new f.a("Pipeline_Detail", "Pipeline_Detail_PerformMeasure", 80005));
            }
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
        }
    }

    private int getFontWeightValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("653523fb", new Object[]{this, new Integer(i)})).intValue();
        }
        switch (i) {
            case 0:
            default:
                return 400;
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 300;
            case 4:
                return 500;
            case 5:
                return 600;
            case 6:
                return 700;
            case 7:
                return 800;
            case 8:
                return 900;
        }
    }

    private void handleGradient(DXWidgetNode.d dVar, StaticLayout staticLayout, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66da733e", new Object[]{this, dVar, staticLayout, paint});
            return;
        }
        int width = staticLayout.getWidth();
        int height = staticLayout.getHeight();
        GradientDrawable.Orientation c = dVar.c();
        int[] b2 = dVar.b();
        if (b2.length != 2) {
            paint.setShader(null);
            return;
        }
        float[] g = dVar.g();
        switch (b.$SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[c.ordinal()]) {
            case 1:
                paint.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
            case 2:
                paint.setShader(new LinearGradient(width, 0.0f, 0.0f, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
            case 3:
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, b2, g, Shader.TileMode.CLAMP));
                return;
            case 4:
                paint.setShader(new LinearGradient(0.0f, height, 0.0f, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
            case 5:
                paint.setShader(new LinearGradient(0.0f, 0.0f, width, height, b2, g, Shader.TileMode.CLAMP));
                return;
            case 6:
                paint.setShader(new LinearGradient(width, height, 0.0f, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
            case 7:
                paint.setShader(new LinearGradient(0.0f, height, width, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
            case 8:
                paint.setShader(new LinearGradient(width, 0.0f, 0.0f, height, b2, g, Shader.TileMode.CLAMP));
                return;
            default:
                paint.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, b2, g, Shader.TileMode.CLAMP));
                return;
        }
    }

    public static /* synthetic */ Object ipc$super(cx5 cx5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXFastTextWidgetNode");
        }
    }

    private StaticLayout makeNewLayout(int i, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        StaticLayout.Builder maxLines;
        StaticLayout.Builder ellipsize;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("de237c7b", new Object[]{this, new Integer(i), charSequence});
        }
        if (this.lineSpacing >= 0) {
            z = true;
        } else {
            z = false;
        }
        float textSize = getTextSize();
        float descent = this.textPaint.descent() - this.textPaint.ascent();
        if (this.lineHeight >= descent) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.realPaddingTop = getPaddingTop();
        this.realPaddingBottom = getPaddingBottom();
        float f2 = 0.0f;
        if (z && !z2) {
            f2 = Math.max(this.lineSpacing - (descent - textSize), 0.0f);
            z4 = false;
        }
        if (z2) {
            float f3 = descent - textSize;
            float f4 = this.lineHeight - descent;
            int i2 = (int) ((f4 + f3) / 2.0f);
            int max = Math.max((int) ((f4 - f3) / 2.0f), 0);
            int max2 = Math.max(i2, 0);
            this.realPaddingTop = getPaddingTop() + max;
            this.realPaddingBottom = getPaddingBottom() + max2;
            if (z) {
                max += max2;
                max2 = this.lineSpacing;
            }
            f = max + max2;
            z3 = false;
        } else {
            z3 = z4;
            f = f2;
        }
        if (Build.VERSION.SDK_INT < 23 || !this.fixBreakMode) {
            staticLayout = new StaticLayout(charSequence, this.textPaint, i, this.alignment, 1.0f, f, z3);
        } else {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.textPaint, i);
            alignment = obtain.setAlignment(this.alignment);
            lineSpacing = alignment.setLineSpacing(f, 1.0f);
            includePad = lineSpacing.setIncludePad(z3);
            maxLines = includePad.setMaxLines(this.maxLine);
            ellipsize = maxLines.setEllipsize(this.ellipsize);
            staticLayout = ellipsize.build();
        }
        if (this.needSetTextGradient) {
            DXWidgetNode.d dVar = this.textGradient;
            if (dVar != null) {
                handleGradient(dVar, staticLayout, this.textPaint);
            } else {
                TextPaint textPaint = this.textPaint;
                if (textPaint != null) {
                    textPaint.setShader(null);
                }
            }
        }
        return staticLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
            return;
        }
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            view.setContentDescription(accessibilityText);
        }
        if (i != 3) {
            if (i == 1 || i == -1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new cx5();
    }

    public float calculateTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4256c91b", new Object[]{this, new Integer(i)})).floatValue();
        }
        int height = this.staticLayout.getHeight();
        int measuredHeight = (getMeasuredHeight() - this.realPaddingTop) - this.realPaddingBottom;
        if (height >= measuredHeight || i != 1073741824) {
            return 0.0f;
        }
        return (measuredHeight - height) >> 1;
    }

    public Layout.Alignment getAlignment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("bd335135", new Object[]{this, new Integer(i)});
        }
        if (getDirection() == 1) {
            if (i == 0) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i != 2) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i != 2) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public int getBeforeEllipsizeLineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("145c33bd", new Object[]{this})).intValue();
        }
        return this.beforeEllipsizeLineCount;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return DEFAULT_TEXT_SIZE;
        }
        if (j == 4685059187929305417L) {
            return DEFAULT_MAX_LINE;
        }
        if (j == -2369181291898902408L || j == eb6.DXRICHTEXT_LINEHEIGHT) {
            return -1;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == -1589356413427545047L) {
            return DEFAULT_FONT_WEIGHT;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 38178040921L) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    public TextUtils.TruncateAt getEllipsize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextUtils.TruncateAt) ipChange.ipc$dispatch("692e091b", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 2) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i != 3) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public int getFontWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9ea997", new Object[]{this})).intValue();
        }
        return this.fontWeight;
    }

    public int getLineBreakMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8de1672", new Object[]{this})).intValue();
        }
        return this.lineBreakMode;
    }

    public int getMaxLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a208196b", new Object[]{this})).intValue();
        }
        return this.maxLine;
    }

    public int getMaxWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue();
        }
        return this.maxWidth;
    }

    public StaticLayout getStaticLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("5b0b5d8c", new Object[]{this});
        }
        return this.staticLayout;
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this});
        }
        return this.text;
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return this.textColor;
    }

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue();
        }
        return this.textGravity;
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return this.textSize;
    }

    public int getTextStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394a7b48", new Object[]{this})).intValue();
        }
        return this.textStyle;
    }

    public Typeface getTypeface(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("80560ca5", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return Typeface.defaultFromStyle(0);
        }
        if (i == 1) {
            return Typeface.defaultFromStyle(1);
        }
        if (i == 2) {
            return Typeface.defaultFromStyle(2);
        }
        if (i != 3) {
            return Typeface.defaultFromStyle(0);
        }
        return Typeface.defaultFromStyle(3);
    }

    public boolean isEnableEllipsizeEndFix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce1ec6a5", new Object[]{this})).booleanValue();
        }
        return this.enableEllipsizeEndFix_Android;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof cx5) {
            cx5 cx5Var = (cx5) dXWidgetNode;
            this.textStyle = cx5Var.textStyle;
            this.fontWeight = cx5Var.fontWeight;
            this.isItalic = cx5Var.isItalic;
            this.textGravity = cx5Var.textGravity;
            this.maxLine = cx5Var.maxLine;
            this.lineBreakMode = cx5Var.lineBreakMode;
            this.maxWidth = cx5Var.maxWidth;
            this.text = cx5Var.text;
            this.textColor = cx5Var.textColor;
            this.textSize = cx5Var.textSize;
            this.textFlags = cx5Var.textFlags;
            this.showText = cx5Var.showText;
            this.textPaint = cx5Var.textPaint;
            this.staticLayout = cx5Var.staticLayout;
            this.ellipsize = cx5Var.ellipsize;
            this.translateY = cx5Var.translateY;
            this.alignment = cx5Var.alignment;
            this.lineHeight = cx5Var.lineHeight;
            this.lineSpacing = cx5Var.lineSpacing;
            this.realPaddingTop = cx5Var.realPaddingTop;
            this.realPaddingBottom = cx5Var.realPaddingBottom;
            this.beforeEllipsizeLineCount = cx5Var.beforeEllipsizeLineCount;
            this.enableTextSizeStrategy = cx5Var.enableTextSizeStrategy;
            this.enableEllipsizeEndFix_Android = cx5Var.enableEllipsizeEndFix_Android;
            this.fixBreakMode = cx5Var.fixBreakMode;
            this.needSetTextGradient = cx5Var.needSetTextGradient;
            this.textGradient = cx5Var.textGradient;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeFastText dXNativeFastText = new DXNativeFastText(context);
        ic5.i(dXNativeFastText);
        return dXNativeFastText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        DXRuntimeContext dXRuntimeContext;
        DXEngineConfig c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else if (this.enableTextSizeStrategy && (dXRuntimeContext = this.dXRuntimeContext) != null && (c = dXRuntimeContext.s().c()) != null && c.E()) {
            this.textSize = vu5.b(this.dXRuntimeContext, this.textSize);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.showText = this.text;
        initText();
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
            this.staticLayout = makeNewLayout((i3 - getPaddingLeft()) - getPaddingRight(), this.showText);
        } else {
            i3 = Math.min(Math.min(((int) this.textPaint.measureText(this.text.toString())) + getPaddingLeft() + getPaddingRight(), View.MeasureSpec.getSize(i)), this.maxWidth);
            this.staticLayout = makeNewLayout((i3 - getPaddingLeft()) - getPaddingRight(), this.text);
        }
        int i5 = this.maxLine;
        if (i5 <= 0 || i5 >= this.staticLayout.getLineCount()) {
            this.showText = this.text;
        } else {
            this.beforeEllipsizeLineCount = this.staticLayout.getLineCount();
            calculateEllipsizeText();
            this.staticLayout = makeNewLayout((i3 - getPaddingLeft()) - getPaddingRight(), this.showText);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i4 = size;
        } else if (!TextUtils.isEmpty(this.text) || this.layoutHeight != -2) {
            int height = this.staticLayout.getHeight() + this.realPaddingBottom + this.realPaddingTop;
            int i6 = this.maxLine;
            if (i6 > 0 && i6 < this.staticLayout.getLineCount()) {
                height = this.staticLayout.getLineTop(this.maxLine);
            }
            i4 = Math.min(height, size);
        }
        setMeasuredDimension(i3, i4);
        this.translateY = calculateTranslateY(mode);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null && (view instanceof DXNativeFastText)) {
            DXNativeFastText dXNativeFastText = (DXNativeFastText) view;
            StaticLayout staticLayout = this.staticLayout;
            if (staticLayout != null) {
                dXNativeFastText.setStaticLayout(staticLayout);
            }
            dXNativeFastText.setTranslateY(this.translateY + this.realPaddingTop);
            dXNativeFastText.setTranslateX(getPaddingLeft());
            ic5.k(dXNativeFastText);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            this.textColor = i;
        } else if (-1564827143683948874L == j) {
            this.textGravity = i;
        } else if (4685059187929305417L == j) {
            if (i > 0) {
                this.maxLine = i;
            } else {
                this.maxLine = Integer.MAX_VALUE;
            }
        } else if (eb6.DXRICHTEXT_MAXWIDTH == j) {
            if (i > 0) {
                this.maxWidth = i;
            } else {
                this.maxWidth = Integer.MAX_VALUE;
            }
        } else if (1650157837879951391L == j) {
            this.lineBreakMode = i;
        } else if (6751005219504497256L == j) {
            if (i > 0) {
                this.textSize = i;
            } else {
                this.textSize = DEFAULT_TEXT_SIZE;
            }
        } else if (9423384817756195L == j) {
            int i6 = this.textStyle;
            if (i > 0) {
                i5 = i6 | 1;
            } else {
                i5 = i6 & (-2);
            }
            this.textStyle = i5;
        } else if (3527554185889034042L == j) {
            int i7 = this.textStyle;
            if (i > 0) {
                i4 = i7 | 2;
            } else {
                i4 = i7 & (-3);
            }
            this.textStyle = i4;
            this.isItalic = true;
        } else if (-1740854880214056386L == j) {
            int i8 = this.textFlags;
            if (i > 0) {
                i3 = i8 | 17;
            } else {
                i3 = i8 & (-18);
            }
            this.textFlags = i3;
        } else if (-8089424158689439347L == j) {
            int i9 = this.textFlags;
            if (i > 0) {
                i2 = i9 | 9;
            } else {
                i2 = i9 & (-10);
            }
            this.textFlags = i2;
        } else if (-1589356413427545047L == j) {
            if (i >= 0) {
                this.fontWeight = i;
            } else {
                this.fontWeight = DEFAULT_FONT_WEIGHT;
            }
        } else if (eb6.DXRICHTEXT_LINEHEIGHT == j) {
            this.lineHeight = i;
        } else if (-2369181291898902408L == j) {
            this.lineSpacing = i;
        } else if (4822617398935994384L == j) {
            if (i == 0) {
                z = false;
            }
            this.enableTextSizeStrategy = z;
        } else if (j == -7798689015804333677L) {
            if (i == 0) {
                z = false;
            }
            this.enableEllipsizeEndFix_Android = z;
        } else if (j == DXFASTTEXTVIEW_FIXBREAKMODE) {
            if (i == 0) {
                z = false;
            }
            this.fixBreakMode = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == DXFASTTEXTVIEW_TEXTGRADIENT) {
            DXWidgetNode.d dVar = (DXWidgetNode.d) obj;
            DXWidgetNode.d dVar2 = this.textGradient;
            if (dVar2 == null) {
                this.needSetTextGradient = true;
                this.textGradient = dVar;
            } else if (dVar2.c() != dVar.c()) {
                this.needSetTextGradient = true;
                this.textGradient = dVar;
            } else {
                int[] b2 = dVar.b();
                if (b2 == null || b2.length != 2) {
                    this.needSetTextGradient = true;
                    this.textGradient = dVar;
                    return;
                }
                int[] b3 = this.textGradient.b();
                if (b3 == null || b3.length != 2) {
                    this.needSetTextGradient = true;
                    this.textGradient = dVar;
                } else if (b3[0] == b2[0] && b3[1] == b2[1]) {
                    this.needSetTextGradient = false;
                    this.textGradient = dVar;
                } else {
                    this.needSetTextGradient = true;
                    this.textGradient = dVar;
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.text = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    public void setFontWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0d9753", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.fontWeight = i;
        } else {
            this.fontWeight = DEFAULT_FONT_WEIGHT;
        }
    }

    public void setLineBreakMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10ae70", new Object[]{this, new Integer(i)});
        } else {
            this.lineBreakMode = i;
        }
    }

    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxLine = i;
        } else {
            this.maxLine = Integer.MAX_VALUE;
        }
    }

    public void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxWidth = i;
        } else {
            this.maxWidth = Integer.MAX_VALUE;
        }
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else {
            this.text = charSequence;
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public void setTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.textGravity = i;
        }
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else if (f > 0.0f) {
            this.textSize = f;
        } else {
            this.textSize = DEFAULT_TEXT_SIZE;
        }
    }

    public void setTextStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fbca5a", new Object[]{this, new Integer(i)});
        } else {
            this.textStyle = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == cx5.class) {
            return true;
        }
        return false;
    }

    public void initText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b392464", new Object[]{this});
            return;
        }
        if (this.textPaint == null) {
            this.textPaint = new TextPaint();
        }
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextSize(this.textSize);
        this.textPaint.setColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
        if (this.fontWeight == DEFAULT_FONT_WEIGHT || Build.VERSION.SDK_INT < 28) {
            this.textPaint.setTypeface(getTypeface(this.textStyle));
        } else {
            this.textPaint.setTypeface(fv9.c().d(getFontWeightValue(this.fontWeight), this.isItalic));
        }
        int i = this.textFlags;
        if (i > 0) {
            this.textPaint.setFlags(i);
        }
        this.ellipsize = getEllipsize(this.lineBreakMode);
        this.alignment = getAlignment(this.textGravity);
        if (!this.isEnableButter && getAccessibilityText() == null) {
            setAccessibilityText(this.text.toString());
        }
    }

    static {
        t2o.a(444597289);
    }
}
