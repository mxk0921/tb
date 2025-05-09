package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class IconFontView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface iconfont = null;

    static {
        t2o.a(724566035);
    }

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            if (iconfont == null) {
                iconfont = Typeface.createFromAsset(context.getAssets(), "fonts/trade_iconfont.ttf");
            }
            setTypeface(iconfont);
        } catch (Exception unused) {
            iconfont = null;
        }
        setIncludeFontPadding(false);
    }

    public static /* synthetic */ Object ipc$super(IconFontView iconFontView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/IconFontView");
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public IconFontView(Context context) {
        super(context);
        init(context);
    }
}
