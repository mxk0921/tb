package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s3w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RRichTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable drawable;
    private int lineSpacingExtra;
    private float mFirstLineWidth;
    private boolean isLayoutWrapLine = false;
    private float lastCharWidth = -1.0f;
    private float textRealWidth = -1.0f;

    static {
        t2o.a(486539425);
    }

    public RRichTextView(Context context) {
        super(context);
        init(context, null);
    }

    private String autoWrapLine(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cd342d1", new Object[]{this, str, new Integer(i), new Boolean(z)});
        }
        float measuredWidth = getMeasuredWidth();
        if (measuredWidth == 0.0f) {
            return str;
        }
        float f = measuredWidth - i;
        if (z) {
            f -= getPaint().measureText(" ");
        }
        this.mFirstLineWidth = f;
        return f <= 0.0f ? str : autoWrapLine(str, f, measuredWidth, z);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.lineSpacingExtra = 3;
        setLineSpacing(3, 1.0f);
    }

    public static SpannableStringBuilder insertDrawableToSsb(Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("ffe5853b", new Object[]{drawable, spannableStringBuilder});
        }
        if (!(drawable == null || spannableStringBuilder == null)) {
            s3w s3wVar = new s3w(drawable, 2);
            spannableStringBuilder.insert(0, "  ");
            spannableStringBuilder.setSpan(s3wVar, 0, 1, 33);
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ Object ipc$super(RRichTextView rRichTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 362446068) {
            super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/RRichTextView");
        }
    }

    private void joinIconAndText(Drawable drawable, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd786756", new Object[]{this, drawable, str});
            return;
        }
        String replace = str.replace("\n", "");
        int resizeDrawableByHeight = resizeDrawableByHeight(drawable, getTextSize());
        if (drawable == null) {
            z = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(autoWrapLine(replace, resizeDrawableByHeight, z));
        insertDrawableToSsb(drawable, spannableStringBuilder);
        setWidth((int) this.textRealWidth);
        invalidate();
        setText(spannableStringBuilder);
    }

    private void joinIconAndTextInner(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2625e6a", new Object[]{this, drawable, str});
        } else {
            joinIconAndText(drawable, str);
        }
    }

    public static String parseString(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f8f80f2", new Object[]{str, new Integer(i)});
        }
        if (str == null || str.trim().isEmpty() || i <= 0) {
            return "";
        }
        String[] split = str.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < Math.min(i, split.length); i2++) {
            if (!split[i2].trim().isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(split[i2].trim());
            }
        }
        return sb.toString();
    }

    private static int resizeDrawableByHeight(Drawable drawable, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a97d5ef8", new Object[]{drawable, new Float(f)})).intValue();
        }
        if (drawable == null || f <= 0.0f) {
            return 0;
        }
        int intrinsicWidth = (int) (f * (drawable.getIntrinsicWidth() / Math.max(drawable.getIntrinsicHeight(), 1)));
        drawable.setBounds(0, 0, intrinsicWidth, (int) f);
        return intrinsicWidth;
    }

    public String getDisplayText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1487d8c0", new Object[]{this});
        }
        return parseString(getTextValue(), getMaxLines());
    }

    public float getFirstLineTextWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36706322", new Object[]{this})).floatValue();
        }
        return this.mFirstLineWidth;
    }

    public int getIconWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d5f711", new Object[]{this})).intValue();
        }
        Drawable drawable = this.drawable;
        if (drawable != null) {
            return drawable.getBounds().width();
        }
        return 0;
    }

    public int getMaxLinesByAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83d1d181", new Object[]{this})).intValue();
        }
        return getMaxLines();
    }

    public String getOriginalText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89f15e65", new Object[]{this});
        }
        return getTextValue().replace("\n", "");
    }

    public String getTextValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eee5522b", new Object[]{this});
        }
        CharSequence text = getText();
        if (text == null) {
            return "";
        }
        return text.toString().trim();
    }

    public int getTitleDisplayLineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6761295", new Object[]{this})).intValue();
        }
        return Math.min(getMaxLinesByAdapter(), getTextValue().split("\\r?\\n").length);
    }

    public int getTitleLineCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("903fd6f3", new Object[]{this})).intValue();
        }
        return getTextValue().split("\\r?\\n").length;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.isLayoutWrapLine) {
            joinIconAndTextInner(this.drawable, getTextValue());
            this.isLayoutWrapLine = true;
        }
    }

    public void resetAutoLayoutFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b0d27b", new Object[]{this});
        } else {
            this.isLayoutWrapLine = false;
        }
    }

    public void setIconToText(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b75534e", new Object[]{this, drawable});
        } else if (this.drawable != drawable) {
            this.drawable = drawable;
            joinIconAndTextInner(drawable, getText().toString());
        }
    }

    public void setLineSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727ca22c", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.lineSpacingExtra = i;
            super.setLineSpacing(i, 1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String autoWrapLine(String str, float f, float f2, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("314ede4a", new Object[]{this, str, new Float(f), new Float(f2), new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        float f3 = 0.0f;
        while (i != str.length()) {
            char charAt = str.charAt(i);
            f3 += getPaint().measureText(String.valueOf(charAt));
            if (f3 <= (i2 == 0 ? f : f2)) {
                sb.append(charAt);
                this.lastCharWidth = f3;
            } else {
                if (i2 == 0 && z) {
                    this.textRealWidth += getPaint().measureText(" ");
                }
                float f4 = this.lastCharWidth;
                if (f4 != -1.0f) {
                    this.textRealWidth = Math.max(this.textRealWidth, f4);
                }
                this.lastCharWidth = -1.0f;
                sb.append("\n");
                i2++;
                i--;
                f3 = 0.0f;
            }
            i++;
        }
        return sb.toString();
    }

    public RRichTextView(Context context, AttributeSet attributeSet) {
        super(context);
        init(context, attributeSet);
    }

    public RRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context);
        init(context, attributeSet);
    }
}
