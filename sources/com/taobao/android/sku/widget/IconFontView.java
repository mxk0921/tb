package com.taobao.android.sku.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class IconFontView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Typeface mTypeface;

    static {
        t2o.a(442499373);
    }

    public IconFontView(Context context) {
        super(context);
        initTypeface(this);
    }

    private static synchronized void initTypeface(TextView textView) {
        synchronized (IconFontView.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8d54f36", new Object[]{textView});
                return;
            }
            if (mTypeface == null) {
                mTypeface = Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/sku_icon_font.ttf");
            }
        }
    }

    public static /* synthetic */ Object ipc$super(IconFontView iconFontView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794512291) {
            super.setTypeface((Typeface) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1050490214) {
            super.setTypeface((Typeface) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/sku/widget/IconFontView");
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else {
            super.setTypeface(mTypeface);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
        } else {
            super.setTypeface(mTypeface, i);
        }
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initTypeface(this);
    }

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initTypeface(this);
    }
}
