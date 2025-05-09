package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539426);
    }

    public CustomTextView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomTextView customTextView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/rolling/CustomTextView");
    }

    public int getHeightBeforeLastLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ef5eb40", new Object[]{this})).intValue();
        }
        String charSequence = getText().toString();
        TextPaint paint = getPaint();
        paint.setTypeface(getTypeface());
        StaticLayout staticLayout = new StaticLayout(charSequence, paint, (int) (getWidth() * getResources().getDisplayMetrics().density), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        if (lineCount > 1) {
            return staticLayout.getLineBottom(lineCount - 2);
        }
        return 0;
    }
}
