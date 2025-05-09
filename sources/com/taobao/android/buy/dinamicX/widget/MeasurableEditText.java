package com.taobao.android.buy.dinamicX.widget;

import android.content.Context;
import androidx.appcompat.widget.AppCompatEditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MeasurableEditText extends AppCompatEditText {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long mInitThreadId = Thread.currentThread().getId();

    static {
        t2o.a(301989924);
    }

    public MeasurableEditText(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MeasurableEditText measurableEditText, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/widget/MeasurableEditText");
    }

    public long getInitThreadId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("539b5f66", new Object[]{this})).longValue();
        }
        return this.mInitThreadId;
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
