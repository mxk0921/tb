package com.taobao.android.opencart.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ce0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FrameLayoutWrapper extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mDetachListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    public FrameLayoutWrapper(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FrameLayoutWrapper frameLayoutWrapper, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/view/FrameLayoutWrapper");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.mDetachListener;
        if (aVar != null) {
            ((ce0.a) aVar).a(this);
        }
    }

    public void setDetachListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a609c9", new Object[]{this, aVar});
        } else {
            this.mDetachListener = aVar;
        }
    }

    public FrameLayoutWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FrameLayoutWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
