package com.taobao.android.order.core.dinamicX.parser;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import tb.gsl;
import tb.kor;
import tb.ldv;
import tb.nb5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TDApplyRichCssParser extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 3445701180796083611L;
    public static final String PARSER_TAG = "tdApplyRichCss";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class CSS implements Serializable {
        public String bgColor;
        public boolean bold;
        public String color;
        public String fontColor;
        public int fontSize;
        public int iconHeight;
        public boolean strikeThrough;

        static {
            t2o.a(614465687);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class RichText implements Serializable {
        public CSS css;
        public String richStr;

        static {
            t2o.a(614465688);
        }
    }

    static {
        t2o.a(614465686);
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 7 || sb2.length() == 9) {
            return Color.parseColor(sb2);
        }
        return i;
    }

    public static /* synthetic */ Object ipc$super(TDApplyRichCssParser tDApplyRichCssParser, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/TDApplyRichCssParser");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        kor.a("TDApplyRichCssParser", "evalWithArgs", "----");
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            ldv.g(dXRuntimeContext.h(), "TDApplyRichCssParser", PARSER_TAG, "解析异常", null);
            return null;
        }
    }

    public final Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3364cdfb", new Object[]{this, objArr, dXRuntimeContext});
        }
        List<RichText> list = null;
        String a2 = gsl.a(objArr, 2, new Class[]{String.class, null});
        if (TextUtils.isEmpty(a2)) {
            String str = (String) objArr[0];
            Object obj = objArr[1];
            String str2 = "";
            if (str == null) {
                return str2;
            }
            if (obj != null) {
                str2 = obj.toString();
            }
            try {
                list = JSON.parseArray(str2, RichText.class);
            } catch (Throwable th) {
                ldv.g(dXRuntimeContext.h(), "TDApplyRichCssParser", PARSER_TAG, th.toString(), null);
            }
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return str;
            }
            SpannableString spannableString = new SpannableString(str);
            for (RichText richText : list) {
                if (richText != null && !TextUtils.isEmpty(richText.richStr) && (indexOf = str.indexOf(richText.richStr)) >= 0) {
                    int length = richText.richStr.length() + indexOf;
                    CSS css = richText.css;
                    if (css != null && css.strikeThrough) {
                        spannableString.setSpan(new StrikethroughSpan(), indexOf, length, 33);
                    }
                    CSS css2 = richText.css;
                    if (css2 != null && css2.bold) {
                        spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
                    }
                    CSS css3 = richText.css;
                    if (css3 != null && !TextUtils.isEmpty(css3.color)) {
                        try {
                            spannableString.setSpan(new ForegroundColorSpan(b(richText.css.color, -16777216)), indexOf, length, 33);
                        } catch (Exception unused) {
                        }
                    }
                    CSS css4 = richText.css;
                    if (css4 != null && css4.fontSize > 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(richText.css.fontSize, true), indexOf, length, 33);
                    }
                }
            }
            return spannableString;
        }
        throw new RuntimeException(a2);
    }
}
