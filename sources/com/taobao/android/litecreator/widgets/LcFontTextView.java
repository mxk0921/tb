package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LcFontTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Typeface mIconFont;

    static {
        t2o.a(511705707);
    }

    public LcFontTextView(Context context) {
        super(context);
        installFont(context);
    }

    private void installFont(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8380d7", new Object[]{this, context});
            return;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), fontPath());
            this.mIconFont = createFromAsset;
            setTypeface(createFromAsset);
        } catch (Exception e) {
            odg.c("LcFontTextView", e.toString());
        }
    }

    public static /* synthetic */ Object ipc$super(LcFontTextView lcFontTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/widgets/LcFontTextView");
        }
    }

    public String fontPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f8dbe65", new Object[]{this});
        }
        return "font/lc_iconfont.ttf";
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Typeface typeface = this.mIconFont;
        if (typeface != null) {
            setTypeface(typeface);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        setTypeface(null);
        super.onDetachedFromWindow();
    }

    public LcFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        installFont(context);
    }

    public LcFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        installFont(context);
    }
}
