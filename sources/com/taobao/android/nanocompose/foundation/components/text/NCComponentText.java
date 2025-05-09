package com.taobao.android.nanocompose.foundation.components.text;

import android.content.Context;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCComponentText extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598736964);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCComponentText(Context context) {
        super(context);
        ckf.g(context, "context");
        setMaxLines(1);
    }

    public static /* synthetic */ Object ipc$super(NCComponentText nCComponentText, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/components/text/NCComponentText");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }
}
