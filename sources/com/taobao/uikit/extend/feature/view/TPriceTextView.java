package com.taobao.uikit.extend.feature.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TTextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TPriceTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DECIMAL_TEXT_FONT_RATIO = 0.75f;
    private static final int TEXT_COLOR = -45056;
    private float mDollarRatio = 0.75f;
    private float mDecimalNumRatio = 0.75f;
    private float mPrice = 0.0f;

    static {
        t2o.a(932184183);
    }

    public TPriceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }

    private void fixSpan(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bceac650", new Object[]{this, str});
            return;
        }
        if (str == null && getText() != null) {
            str = getText().toString();
        }
        if (str != null && -1 != (indexOf = str.indexOf("."))) {
            int indexOf2 = str.indexOf(Localization.q(R.string.taobao_app_1012_1_13391));
            if (-1 == indexOf2) {
                indexOf2 = str.indexOf(Localization.q(R.string.taobao_app_1012_1_13386));
            }
            if (-1 == indexOf2) {
                indexOf2 = str.length();
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new RelativeSizeSpan(this.mDecimalNumRatio), indexOf, indexOf2, 33);
            setText(spannableString);
        }
    }

    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a9cdcc", new Object[]{this, attributeSet, new Integer(i)});
        } else if (attributeSet != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.TPriceTextView)) != null) {
            this.mPrice = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_price, this.mPrice);
            this.mDollarRatio = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_dollar_ratio, this.mDollarRatio);
            this.mDecimalNumRatio = obtainStyledAttributes.getFloat(R.styleable.TPriceTextView_uik_decimal_ratio, this.mDecimalNumRatio);
            setTextColor(obtainStyledAttributes.getColor(R.styleable.TPriceTextView_android_textColor, -45056));
            setDollarRatio(this.mDollarRatio);
            setDecimalNumRatio(this.mDecimalNumRatio);
            setPrice(this.mPrice);
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Object ipc$super(TPriceTextView tPriceTextView, String str, Object... objArr) {
        if (str.hashCode() == -260017868) {
            super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/feature/view/TPriceTextView");
    }

    public void setDecimalNumRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e27ec5", new Object[]{this, new Float(f)});
            return;
        }
        this.mDecimalNumRatio = f;
        float f2 = this.mPrice;
        if (f2 >= 0.0f) {
            setPrice(f2);
        }
    }

    public void setDollarRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e2194c", new Object[]{this, new Float(f)});
            return;
        }
        this.mDollarRatio = f;
        float f2 = this.mPrice;
        if (f2 >= 0.0f) {
            setPrice(f2);
        }
    }

    public void setPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc05d58", new Object[]{this, str});
            return;
        }
        Pattern compile = Pattern.compile("^[0-9]+[.]*[0-9]*");
        Pattern compile2 = Pattern.compile("(^([0-9]|[/?])+[.]*([0-9]|[/?])*)");
        Matcher matcher = compile.matcher(str);
        Matcher matcher2 = compile2.matcher(str);
        if (matcher.matches()) {
            setPrice(Float.valueOf(str).floatValue());
        } else if (matcher2.matches()) {
            setFestivalPrice(str);
        } else {
            setText(str);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        fixSpan(null);
    }

    private void setFestivalPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480442c0", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int indexOf = str.indexOf(".");
        if (indexOf >= 9) {
            int i = indexOf - 8;
            sb2.insert(0, str.substring(0, i));
            sb2.append(".");
            sb2.append(str.substring(i, indexOf - 7));
            sb.insert(0, Localization.q(R.string.taobao_app_1012_1_13386));
        } else if (indexOf >= 5) {
            int i2 = indexOf - 4;
            sb2.insert(0, str.substring(0, i2));
            sb2.append(".");
            sb2.append(str.substring(i2, indexOf - 3));
            sb.insert(0, Localization.q(R.string.taobao_app_1012_1_13391));
        } else if (indexOf == -1) {
            sb2.insert(0, str);
        } else if (str.length() - indexOf >= 3) {
            sb2.insert(0, str.substring(0, indexOf + 3));
        } else {
            sb2.insert(0, str.length());
        }
        String sb3 = sb2.toString();
        if (sb3.endsWith(".00")) {
            sb3 = sb3.substring(0, sb2.length() - 3);
        } else if (sb3.endsWith(".0")) {
            sb3 = sb3.substring(0, sb3.length() - 2);
        }
        sb.insert(0, sb3);
        sb.insert(0, "¥ ");
        setText(sb.toString());
        if (1.0f != this.mDollarRatio) {
            SpannableString spannableString = new SpannableString(getText());
            if (spannableString.length() > 2) {
                spannableString.setSpan(new RelativeSizeSpan(this.mDollarRatio), 0, 2, 33);
            }
            setText(spannableString);
        }
    }

    public TPriceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPrice(float r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.uikit.extend.feature.view.TPriceTextView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r8)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r1] = r7
            r8[r0] = r4
            java.lang.String r0 = "c2592e72"
            r3.ipc$dispatch(r0, r8)
            return
        L_0x001a:
            r7.mPrice = r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#0.0"
            r5 = 1287568416(0x4cbebc20, float:1.0E8)
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            float r8 = r8 / r5
            int r5 = com.taobao.taobao.R.string.taobao_app_1012_1_13386
            java.lang.String r5 = com.alibaba.ability.localization.Localization.q(r5)
            r3.insert(r1, r5)
            goto L_0x0049
        L_0x0035:
            r5 = 1176256512(0x461c4000, float:10000.0)
            int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x0047
            float r8 = r8 / r5
            int r5 = com.taobao.taobao.R.string.taobao_app_1012_1_13391
            java.lang.String r5 = com.alibaba.ability.localization.Localization.q(r5)
            r3.insert(r1, r5)
            goto L_0x0049
        L_0x0047:
            java.lang.String r4 = "#0.00"
        L_0x0049:
            java.text.DecimalFormatSymbols r5 = new java.text.DecimalFormatSymbols
            r5.<init>()
            r6 = 46
            r5.setDecimalSeparator(r6)
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            r6.<init>(r4, r5)
            double r4 = (double) r8
            java.lang.String r8 = r6.format(r4)
            java.lang.String r4 = ".00"
            boolean r4 = r8.endsWith(r4)
            if (r4 == 0) goto L_0x0071
            int r0 = r8.length()
            int r0 = r0 + (-3)
            java.lang.String r8 = r8.substring(r1, r0)
        L_0x006f:
            r0 = 0
            goto L_0x0083
        L_0x0071:
            java.lang.String r4 = ".0"
            boolean r4 = r8.endsWith(r4)
            if (r4 == 0) goto L_0x0083
            int r0 = r8.length()
            int r0 = r0 - r2
            java.lang.String r8 = r8.substring(r1, r0)
            goto L_0x006f
        L_0x0083:
            r3.insert(r1, r8)
            java.lang.String r8 = "¥ "
            r3.insert(r1, r8)
            if (r0 == 0) goto L_0x0096
            java.lang.String r8 = r3.toString()
            r7.fixSpan(r8)
            goto L_0x009d
        L_0x0096:
            java.lang.String r8 = r3.toString()
            r7.setText(r8)
        L_0x009d:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r0 = r7.mDollarRatio
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00c3
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.CharSequence r0 = r7.getText()
            r8.<init>(r0)
            int r0 = r8.length()
            if (r0 <= r2) goto L_0x00c0
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r3 = r7.mDollarRatio
            r0.<init>(r3)
            r3 = 33
            r8.setSpan(r0, r1, r2, r3)
        L_0x00c0:
            r7.setText(r8)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.feature.view.TPriceTextView.setPrice(float):void");
    }

    public TPriceTextView(Context context) {
        super(context);
        init(null, 0);
    }
}
