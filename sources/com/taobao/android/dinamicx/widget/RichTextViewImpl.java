package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RichTextViewImpl extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RichTextViewImpl(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(RichTextViewImpl richTextViewImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/RichTextViewImpl");
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        }
    }

    public RichTextViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
        }
    }

    public RichTextViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
