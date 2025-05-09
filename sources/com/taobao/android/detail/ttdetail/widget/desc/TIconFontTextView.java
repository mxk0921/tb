package com.taobao.android.detail.ttdetail.widget.desc;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.TTextView;
import tb.t2o;
import tb.tgh;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TIconFontTextView extends TTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Typeface sIconfont;
    private static int sReference = 0;

    static {
        t2o.a(912262961);
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(TIconFontTextView tIconFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/desc/TIconFontTextView");
        }
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this});
        }
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(tq4.d(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                tgh.c("TIconFontTextView", "getTypeface", e);
            }
        }
        return sIconfont;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        int i = sReference - 1;
        sReference = i;
        if (i == 0) {
            sIconfont = null;
        }
        super.onDetachedFromWindow();
    }

    public TIconFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TIconFontTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (sIconfont == null) {
            try {
                sIconfont = Typeface.createFromAsset(tq4.d(this).getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                tgh.c("TIconFontTextView", "onAttachedToWindow", e);
            }
        }
        setTypeface(sIconfont);
        setIncludeFontPadding(false);
        sReference++;
    }
}
