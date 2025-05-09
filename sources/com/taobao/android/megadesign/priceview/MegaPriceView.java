package com.taobao.android.megadesign.priceview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.h7z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MegaPriceView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CURRENCY_PREFIX = 1;
    public static final int CURRENCY_SUFFIX = 2;
    public static final int NONE = 0;
    public static final int STYLE_DEFAULT = 0;
    public static final int STYLE_STRIKETHROUGH = 1;
    private final String DEFAULT_FONT = "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf";
    private String font;
    private a priceDesc;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface CurrencyPosition {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface Style {
    }

    public MegaPriceView(Context context) {
        super(context);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        TypedArray typedArray = null;
        try {
            if (attributeSet != null) {
                try {
                    typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.MegaPriceView);
                    a aVar = new a();
                    this.priceDesc = aVar;
                    aVar.f8927a = typedArray.getString(R.styleable.MegaPriceView_formattedPrice);
                    this.priceDesc.b = typedArray.getString(R.styleable.MegaPriceView_decimalSymbol);
                    this.priceDesc.d = typedArray.getString(R.styleable.MegaPriceView_currencySymbol);
                    this.priceDesc.c = typedArray.getDimensionPixelSize(R.styleable.MegaPriceView_decimalSize, 0);
                    this.priceDesc.e = typedArray.getDimensionPixelSize(R.styleable.MegaPriceView_currencySize, 0);
                    this.priceDesc.h = typedArray.getDimensionPixelSize(R.styleable.MegaPriceView_textSize, 0);
                    this.priceDesc.f = typedArray.getInt(R.styleable.MegaPriceView_currencyPosition, 0);
                    this.priceDesc.g = typedArray.getInt(R.styleable.MegaPriceView_priceStyle, 0);
                    setTextSize(0, this.priceDesc.h);
                    setText(parsePrice(this.priceDesc));
                    initTypeFace("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
                } catch (Exception e) {
                    Log.e("MegaPriceView", "init error: " + e);
                    if (typedArray == null) {
                        return;
                    }
                }
            }
            if (typedArray == null) {
                return;
            }
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private void initTypeFace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9a2938", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            Typeface a2 = h7z.a(str, getContext());
            if (a2 == null) {
                a2 = h7z.a("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf", getContext());
            }
            setTypeface(a2);
        }
    }

    public static /* synthetic */ Object ipc$super(MegaPriceView megaPriceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/priceview/MegaPriceView");
    }

    public static CharSequence parsePrice(a aVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a1295623", new Object[]{aVar});
        }
        if (aVar == null || TextUtils.isEmpty(aVar.f8927a)) {
            return null;
        }
        String str = aVar.f8927a;
        boolean isEmpty = TextUtils.isEmpty(aVar.d);
        if (TextUtils.isEmpty(aVar.b) || aVar.c <= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (!isEmpty && charAt == aVar.d.charAt(0)) {
                int i6 = 1;
                while (i6 < aVar.d.length()) {
                    int i7 = i5 + i6;
                    if (i7 >= str.length() || str.charAt(i7) == aVar.d.charAt(i6)) {
                        i6++;
                    }
                }
                int i8 = i6 + i5;
                i4 = i8;
                i5 = i8 - 1;
                i = i5;
                i5++;
            }
            if (z && charAt == aVar.b.charAt(0) && 1 != aVar.g) {
                int i9 = i5;
                while (true) {
                    i3 = i9 + 1;
                    if (i3 >= str.length() || !Character.isDigit(str.charAt(i3))) {
                        break;
                    }
                    i9 = i3;
                }
                i5 = i9;
                i2 = i5;
            }
            i5++;
        }
        if (i < 0 && !isEmpty) {
            int i10 = aVar.f;
            if (1 == i10) {
                i4 = aVar.d.length();
                aVar.f8927a = aVar.d + aVar.f8927a;
                i2 += aVar.d.length();
                i3 += aVar.d.length();
                i = 0;
            } else if (2 == i10) {
                i = aVar.f8927a.length();
                String str2 = aVar.f8927a + aVar.d;
                aVar.f8927a = str2;
                i4 = str2.length();
            }
        }
        SpannableString spannableString = new SpannableString(aVar.f8927a);
        if (1 == aVar.g) {
            spannableString.setSpan(new StrikethroughSpan(), 0, aVar.f8927a.length(), 33);
        } else {
            if (i >= 0 && i4 >= 0 && i4 <= spannableString.length() && i < i4 && aVar.e > 0.0f && aVar.h > 0.0f) {
                spannableString.setSpan(new RelativeSizeSpan(aVar.e / aVar.h), i, i4, 33);
            }
            if (i2 >= 0 && i3 >= 0 && i3 <= spannableString.length() && i2 < i3 && aVar.c > 0.0f && aVar.h > 0.0f) {
                spannableString.setSpan(new RelativeSizeSpan(aVar.c / aVar.h), i2, i3, 33);
            }
        }
        return spannableString;
    }

    public void setFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7553a2", new Object[]{this, str});
            return;
        }
        this.font = str;
        initTypeFace(str);
    }

    public void setPrice(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125a6ce6", new Object[]{this, aVar});
            return;
        }
        this.priceDesc = aVar;
        if (TextUtils.isEmpty(this.font)) {
            initTypeFace("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        }
        setTextSize(0, this.priceDesc.h);
        setText(parsePrice(this.priceDesc));
    }

    public MegaPriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MegaPriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
