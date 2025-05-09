package com.taobao.android.detail.ttdetail.transfer.widget.xrich;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.mr7;
import tb.q3w;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class XRichTextViewV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable drawable;
    private int lineSpacingExtra;
    private String mSpanColor;
    private SpannableStringBuilder mSpannableStringBuilder;
    private TextPaint textPaint;
    private int imageTextSpace = mr7.a(5.0f);
    private boolean mHasJoinedIconAndText = false;
    private final int textMarginLeft = 0;

    static {
        t2o.a(912262737);
    }

    public XRichTextViewV3(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.lineSpacingExtra = 3;
        textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        setLineSpacing(this.lineSpacingExtra, 1.0f);
    }

    public static /* synthetic */ Object ipc$super(XRichTextViewV3 xRichTextViewV3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -260017868:
                super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -58656792:
                super.setTextColor(((Number) objArr[0]).intValue());
                return null;
            case 362446068:
                super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 835841791:
                super.setMaxLines(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/xrich/XRichTextViewV3");
        }
    }

    private void joinIconAndTextInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26d077c", new Object[]{this});
            return;
        }
        if (this.mSpannableStringBuilder == null) {
            if (!TextUtils.isEmpty(getText())) {
                this.mSpannableStringBuilder = new SpannableStringBuilder(getText());
            } else {
                this.mSpannableStringBuilder = new SpannableStringBuilder();
            }
        }
        if (this.drawable != null) {
            resizeDrawableByHeight((int) this.textPaint.getTextSize(), this.drawable);
            q3w q3wVar = new q3w(this.drawable, 2);
            SpannableStringBuilder insert = this.mSpannableStringBuilder.insert(0, (CharSequence) "  ");
            insert.setSpan(q3wVar, 0, 1, 33);
            this.mSpannableStringBuilder = insert;
            this.mHasJoinedIconAndText = true;
        }
        setText(this.mSpannableStringBuilder);
    }

    private void resizeDrawableByHeight(int i, Drawable drawable) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af14690", new Object[]{this, new Integer(i), drawable});
        } else if (drawable != null && i > 0) {
            double intrinsicWidth = drawable.getIntrinsicWidth();
            double intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight != vu3.b.GEO_NOT_SUPPORT) {
                i2 = (int) Math.ceil(i * (intrinsicWidth / intrinsicHeight));
            } else {
                i2 = 0;
            }
            drawable.setBounds(0, 0, i2, i);
        }
    }

    public String getSpanColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e91d5756", new Object[]{this});
        }
        return this.mSpanColor;
    }

    public int getSpanColorInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631d83e6", new Object[]{this})).intValue();
        }
        if (!TextUtils.isEmpty(this.mSpanColor)) {
            return Color.parseColor(this.mSpanColor);
        }
        return getCurrentTextColor();
    }

    public SpannableStringBuilder getSpannableStringBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("bfbde54c", new Object[]{this});
        }
        return this.mSpannableStringBuilder;
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable != drawable) {
            this.drawable = drawable;
            if (drawable != null && !this.mHasJoinedIconAndText) {
                joinIconAndTextInner();
            }
        }
    }

    public void setImageTextSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5480a59c", new Object[]{this, new Integer(i)});
            return;
        }
        this.imageTextSpace = mr7.a(i);
        invalidate();
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

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        super.setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setSpanColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccb4f48", new Object[]{this, str});
        } else {
            this.mSpanColor = str;
        }
    }

    public void setSpannableStringBuilder(SpannableStringBuilder spannableStringBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9571e", new Object[]{this, spannableStringBuilder});
            return;
        }
        this.mSpannableStringBuilder = spannableStringBuilder;
        joinIconAndTextInner();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setTextColor(i);
        this.textPaint.setColor(i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        this.textPaint.setTextSize(f);
        requestLayout();
        invalidate();
    }

    public XRichTextViewV3(Context context, AttributeSet attributeSet) {
        super(context);
        init(context, attributeSet);
    }

    public XRichTextViewV3(Context context, AttributeSet attributeSet, int i) {
        super(context);
        init(context, attributeSet);
    }
}
