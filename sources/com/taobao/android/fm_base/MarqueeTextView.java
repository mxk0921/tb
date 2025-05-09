package com.taobao.android.fm_base;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MarqueeTextView extends AppCompatTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MarqueeTextView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(MarqueeTextView marqueeTextView, String str, Object... objArr) {
        if (str.hashCode() == 678958088) {
            super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fm_base/MarqueeTextView");
    }

    @Override // android.view.View
    public boolean isFocused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a918f8", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
        } else {
            super.onFocusChanged(z, i, rect);
        }
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
