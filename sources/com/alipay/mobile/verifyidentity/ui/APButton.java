package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.alipay.mobile.verifyidentity.ui.font.TextSizeGearGetter;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APButton extends Button implements APViewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TextSizeGearGetter c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4457a;
    private float b;

    public APButton(Context context) {
        super(context);
        this.f4457a = false;
        this.b = getTextSize();
        a();
    }

    private void a() {
        TextSizeGearGetter textSizeGearGetter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f4457a && (textSizeGearGetter = c) != null) {
            float textSize = DensityUtil.getTextSize(DensityUtil.px2sp(getContext(), this.b), textSizeGearGetter.getCurrentGear());
            if (!DensityUtil.isValueEqule(DensityUtil.px2sp(getContext(), getTextSize()), textSize)) {
                super.setTextSize(2, textSize);
            }
        }
    }

    public static TextSizeGearGetter getTextSizeGearGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextSizeGearGetter) ipChange.ipc$dispatch("15320d67", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ Object ipc$super(APButton aPButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2079798281) {
            super.setOnClickListener((View.OnClickListener) objArr[0]);
            return null;
        } else if (hashCode == -260017868) {
            super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
            return null;
        } else if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/ui/APButton");
        }
    }

    public static void setTextSizeGearGetter(TextSizeGearGetter textSizeGearGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd911881", new Object[]{textSizeGearGetter});
        } else {
            c = textSizeGearGetter;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            super.setOnClickListener(APViewEventHelper.wrapClickListener(onClickListener));
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        this.b = getTextSize();
        a();
    }

    public APButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4457a = false;
        Resources.Theme theme = context.getTheme();
        this.b = getTextSize();
        a();
        Objects.toString(attributeSet);
        Objects.toString(theme);
    }

    public APButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4457a = false;
    }
}
