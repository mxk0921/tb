package com.taobao.homepage.dinamic3.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f4b;
import tb.mve;
import tb.r3w;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RRichTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable drawable;
    private int lineSpacingExtra;
    private boolean isLayoutWrapLine = false;
    private boolean isAutoWrapLine = true;
    public boolean enableRichTextWidthBugfix = false;
    private float lastCharWidth = -1.0f;
    private float textRealWidth = -1.0f;

    static {
        t2o.a(729809067);
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
        boolean enableFixRichTextWidth = enableFixRichTextWidth();
        this.enableRichTextWidthBugfix = enableFixRichTextWidth;
        if (z || !enableFixRichTextWidth) {
            f -= getPaint().measureText(" ");
        }
        return f <= 0.0f ? str : autoWrapLine(str, f, measuredWidth, z);
    }

    private boolean enableFixRichTextWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("136903b6", new Object[]{this})).booleanValue();
        }
        return mve.a("enableFixRichTextWidth", true);
    }

    private String getTextValue() {
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

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.isAutoWrapLine = f4b.b("enableRRichTextViewWrapLine", true);
        this.lineSpacingExtra = 3;
        setLineSpacing(3, 1.0f);
    }

    public static SpannableStringBuilder insertDrawableToSsb(Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("ffe5853b", new Object[]{drawable, spannableStringBuilder});
        }
        if (!(drawable == null || spannableStringBuilder == null)) {
            r3w r3wVar = new r3w(drawable, 2);
            spannableStringBuilder.insert(0, "  ");
            spannableStringBuilder.setSpan(r3wVar, 0, 1, 33);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/dinamic3/view/RRichTextView");
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
        if (this.enableRichTextWidthBugfix) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = (int) this.textRealWidth;
            setLayoutParams(layoutParams);
            setWidth((int) this.textRealWidth);
            invalidate();
        }
        setText(spannableStringBuilder);
    }

    private void joinIconAndTextInner(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2625e6a", new Object[]{this, drawable, str});
        } else if (this.isAutoWrapLine) {
            joinIconAndText(drawable, str);
        } else {
            joinIconAndTextInnerOld(drawable, str);
        }
    }

    private void joinIconAndTextInnerOld(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f62f327", new Object[]{this, drawable, str});
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (drawable != null) {
            resizeDrawableByHeight(drawable, getTextSize());
            insertDrawableToSsb(drawable, spannableStringBuilder);
        }
        setText(spannableStringBuilder);
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

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.isAutoWrapLine && !this.isLayoutWrapLine) {
            joinIconAndTextInner(this.drawable, getTextValue());
            this.isLayoutWrapLine = true;
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
