package com.taobao.android.icart.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartRoundRelativeLayout extends RoundRelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151070);
    }

    public CartRoundRelativeLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CartRoundRelativeLayout cartRoundRelativeLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/CartRoundRelativeLayout");
    }

    @Override // com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout
    public boolean isSupportClipOutline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return true;
        }
        return false;
    }

    public CartRoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CartRoundRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
