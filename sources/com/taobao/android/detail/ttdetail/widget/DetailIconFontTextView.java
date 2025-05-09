package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sTaoIconfont;
    private static Typeface sTmallIconfont;
    private static int sTmallReference = 0;
    private static int sTaoReference = 0;

    static {
        t2o.a(912262895);
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(DetailIconFontTextView detailIconFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 197241946) {
            super.setText((CharSequence) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/DetailIconFontTextView");
        }
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        if (sTaoIconfont == null) {
            try {
                sTaoIconfont = Typeface.createFromAsset(tq4.d(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        return sTaoIconfont;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        int i = sTaoReference - 1;
        sTaoReference = i;
        if (i == 0) {
            sTaoIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            super.setText((CharSequence) str);
        }
    }

    public DetailIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetailIconFontTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sTaoIconfont == null) {
            try {
                sTaoIconfont = Typeface.createFromAsset(tq4.d(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception unused) {
            }
        }
        setTypeface(sTaoIconfont);
        sTaoReference++;
        setIncludeFontPadding(false);
    }
}
