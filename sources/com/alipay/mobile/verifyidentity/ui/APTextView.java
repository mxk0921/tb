package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.ui.emotion.OnParseEmotionListener;
import com.alipay.mobile.verifyidentity.ui.font.TextSizeGearGetter;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.krg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APTextView extends TextView implements APViewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static OnParseEmotionListener i;
    private static TextSizeGearGetter j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4460a;
    private boolean b;
    private int c;
    private boolean d;
    private float e;
    private int f;
    private boolean g;
    private int h;
    private OnTextViewTextChangeListener k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnTextViewTextChangeListener {
        void onTextViewTextChange(TextView textView, String str);
    }

    public APTextView(Context context) {
        super(context);
        this.c = 0;
        this.d = false;
        this.h = krg.LOG_LEVEL_DEBUG;
        this.e = getTextSize();
        b();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = getTextSize();
        b();
    }

    private void b() {
        TextSizeGearGetter textSizeGearGetter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d && (textSizeGearGetter = j) != null) {
            float textSize = DensityUtil.getTextSize(DensityUtil.px2sp(getContext(), this.e), textSizeGearGetter.getCurrentGear());
            if (!DensityUtil.isValueEqule(DensityUtil.px2sp(getContext(), getTextSize()), textSize)) {
                super.setTextSize(2, textSize);
            }
        }
    }

    private int c() {
        Field field;
        try {
            try {
                field = TextView.class.getDeclaredField("mSingleLine");
            } catch (NoSuchFieldException unused) {
                field = null;
            }
            if (field == null) {
                return -1;
            }
            field.setAccessible(true);
            return field.getBoolean(this) ? 1 : 0;
        } catch (IllegalAccessException | IllegalArgumentException | Exception unused2) {
            return -1;
        }
    }

    public static OnParseEmotionListener getParseEmotionListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnParseEmotionListener) ipChange.ipc$dispatch("f8b9a5c4", new Object[0]);
        }
        return i;
    }

    public static TextSizeGearGetter getTextSizeGearGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextSizeGearGetter) ipChange.ipc$dispatch("15320d67", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(APTextView aPTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2079798281:
                super.setOnClickListener((View.OnClickListener) objArr[0]);
                return null;
            case -260017868:
                super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 358241672:
                super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/APTextView");
        }
    }

    public static void setParseEmotionListener(OnParseEmotionListener onParseEmotionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0fbd98c", new Object[]{onParseEmotionListener});
        } else {
            i = onParseEmotionListener;
        }
    }

    public static void setTextSizeGearGetter(TextSizeGearGetter textSizeGearGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd911881", new Object[]{textSizeGearGetter});
        } else {
            j = textSizeGearGetter;
        }
    }

    public int getEmojiSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99c76ab", new Object[]{this})).intValue();
        }
        int i2 = this.c;
        if (i2 <= 0) {
            return ((int) getTextSize()) + DensityUtil.dip2px(getContext(), 2.0f);
        }
        return i2;
    }

    public OnTextViewTextChangeListener getOnTextChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnTextViewTextChangeListener) ipChange.ipc$dispatch("39b79032", new Object[]{this});
        }
        return this.k;
    }

    public boolean isDynamicTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332fbcae", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        b();
        if (((this.f4460a && this.f > 0) || (this.b && this.g)) && getEllipsize() != null && c() == 1) {
            int leftPaddingOffset = ((i4 - i2) - getLeftPaddingOffset()) - getRightPaddingOffset();
            int i6 = this.h;
            if (i6 != 9999) {
                leftPaddingOffset = Math.max(leftPaddingOffset, i6);
            }
            CharSequence text = getText();
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), leftPaddingOffset, getEllipsize());
            if (!TextUtils.equals(ellipsize, text)) {
                if (text.length() > ellipsize.length()) {
                    int i7 = this.h;
                    if (i7 == 9999) {
                        this.h = leftPaddingOffset;
                    } else {
                        this.h = Math.max(leftPaddingOffset, i7);
                    }
                }
                setText(ellipsize);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (!this.b || c() != 1) {
            super.onMeasure(i2, i3);
        } else {
            TextSizeGearGetter textSizeGearGetter = j;
            if (textSizeGearGetter != null) {
                i4 = textSizeGearGetter.getCurrentGear();
            }
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (getTextSize() + DensityUtil.getTextSize(DensityUtil.dip2px(getContext(), 6.0f), i4)), 1073741824));
        }
    }

    public void setDynamicTextSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79926ea2", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void setEmojiSize(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e93b57", new Object[]{this, new Integer(i2)});
        } else {
            this.c = i2;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            super.setOnClickListener(APViewEventHelper.wrapClickListener(onClickListener));
        }
    }

    public void setOnTextChangeListener(OnTextViewTextChangeListener onTextViewTextChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b5e2bc", new Object[]{this, onTextViewTextChangeListener});
        } else {
            this.k = onTextViewTextChangeListener;
        }
    }

    public void setSupportEmoji(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94053394", new Object[]{this, new Boolean(z)});
        } else {
            this.f4460a = z;
        }
    }

    public void setSupportEmotion(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55aed15f", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        OnParseEmotionListener onParseEmotionListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
        } else if ((this.f4460a || this.b) && charSequence != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (this.b && (onParseEmotionListener = i) != null) {
                this.g = onParseEmotionListener.parser(getContext(), spannableStringBuilder, charSequence, getEmojiSize());
            }
            if ((this.f <= 0 && !this.g) || getEllipsize() == null) {
                super.setText(spannableStringBuilder, bufferType);
            } else if (c() == 1) {
                super.setText(TextUtils.ellipsize(spannableStringBuilder, getPaint(), this.h, getEllipsize()), bufferType);
            } else {
                super.setText(spannableStringBuilder, bufferType);
            }
            OnTextViewTextChangeListener onTextViewTextChangeListener = this.k;
            if (onTextViewTextChangeListener != null) {
                onTextViewTextChangeListener.onTextViewTextChange(this, spannableStringBuilder.toString());
            }
        } else {
            super.setText(charSequence, bufferType);
            OnTextViewTextChangeListener onTextViewTextChangeListener2 = this.k;
            if (onTextViewTextChangeListener2 != null && charSequence != null) {
                onTextViewTextChangeListener2.onTextViewTextChange(this, charSequence.toString());
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i2), new Float(f)});
            return;
        }
        super.setTextSize(i2, f);
        this.e = getTextSize();
        b();
    }

    public APTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = false;
        this.h = krg.LOG_LEVEL_DEBUG;
        a();
    }

    public APTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = 0;
        this.d = false;
        this.h = krg.LOG_LEVEL_DEBUG;
        a();
    }
}
