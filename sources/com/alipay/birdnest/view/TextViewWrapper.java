package com.alipay.birdnest.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.krg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TextViewWrapper extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3837a;
    public int b;
    public int c = krg.LOG_LEVEL_DEBUG;
    public OnTextViewTextChangeListener d;
    public BirdNestEngine.EmojiProvider e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnTextViewTextChangeListener {
        void onTextViewTextChange(TextView textView, String str);
    }

    public TextViewWrapper(Context context) {
        super(context);
    }

    private int getEmojiSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99c76ab", new Object[]{this})).intValue();
        }
        return ((int) getTextSize()) + 8;
    }

    public static /* synthetic */ Object ipc$super(TextViewWrapper textViewWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 358241672) {
            super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/birdnest/view/TextViewWrapper");
        }
    }

    public OnTextViewTextChangeListener getOnTextChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnTextViewTextChangeListener) ipChange.ipc$dispatch("98debe96", new Object[]{this});
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3837a && this.b > 0 && getEllipsize() != null && a() == 1) {
            int leftPaddingOffset = ((i3 - i) - getLeftPaddingOffset()) - getRightPaddingOffset();
            int i5 = this.c;
            if (i5 != 9999) {
                leftPaddingOffset = Math.max(leftPaddingOffset, i5);
            }
            CharSequence text = getText();
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), leftPaddingOffset, getEllipsize());
            if (!TextUtils.equals(ellipsize, text)) {
                if (text.length() > ellipsize.length()) {
                    int i6 = this.c;
                    if (i6 == 9999) {
                        this.c = leftPaddingOffset;
                    } else {
                        this.c = Math.max(leftPaddingOffset, i6);
                    }
                }
                setText(ellipsize);
            }
        }
    }

    public void setEmojiProvider(BirdNestEngine.EmojiProvider emojiProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163671a9", new Object[]{this, emojiProvider});
        } else {
            this.e = emojiProvider;
        }
    }

    public void setOnTextChangeListener(OnTextViewTextChangeListener onTextViewTextChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad659e0", new Object[]{this, onTextViewTextChangeListener});
        } else {
            this.d = onTextViewTextChangeListener;
        }
    }

    public void setSupportEmoji(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94053394", new Object[]{this, new Boolean(z)});
        } else {
            this.f3837a = z;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
        } else if (!this.f3837a || charSequence == null) {
            super.setText(charSequence, bufferType);
            OnTextViewTextChangeListener onTextViewTextChangeListener = this.d;
            if (onTextViewTextChangeListener != null && charSequence != null) {
                onTextViewTextChangeListener.onTextViewTextChange(this, charSequence.toString());
            }
        } else {
            getEmojiSize();
            IpChange ipChange2 = Platform.$ipChange;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            int renderEmojiReturncount = this.e.renderEmojiReturncount(getContext(), spannableStringBuilder, getEmojiSize());
            this.b = renderEmojiReturncount;
            if (renderEmojiReturncount <= 0 || getEllipsize() == null) {
                super.setText(spannableStringBuilder, bufferType);
            } else if (a() == 1) {
                super.setText(TextUtils.ellipsize(spannableStringBuilder, getPaint(), this.c, getEllipsize()), bufferType);
            } else {
                super.setText(spannableStringBuilder, bufferType);
            }
            OnTextViewTextChangeListener onTextViewTextChangeListener2 = this.d;
            if (onTextViewTextChangeListener2 != null) {
                onTextViewTextChangeListener2.onTextViewTextChange(this, spannableStringBuilder.toString());
            }
        }
    }

    public final int a() {
        try {
            Field declaredField = TextView.class.getDeclaredField("mSingleLine");
            declaredField.setAccessible(true);
            return declaredField.getBoolean(this) ? 1 : 0;
        } catch (Throwable th) {
            FBLogger.e("TextViewWrapper", th);
            return getMaxLines() == 1 ? 1 : -1;
        }
    }
}
