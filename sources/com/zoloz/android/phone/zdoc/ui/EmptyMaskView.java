package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class EmptyMaskView extends BaseMaskView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366971);
    }

    public EmptyMaskView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(EmptyMaskView emptyMaskView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/EmptyMaskView");
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public RectF calcCaptureRect(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("b9d05dcb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return new RectF(0, DisplayUtil.dip2px(getContext(), 48.0f), i, i2 - getInvisibleHeight());
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getCoverDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a2644d2e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return null;
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public List<BaseMaskView.a> getFrameDrawer(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7b6715b8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return null;
    }

    @Override // com.zoloz.android.phone.zdoc.ui.BaseMaskView
    public int getTipsBottomMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b656381", new Object[]{this})).intValue();
        }
        return (int) (getHeight() * 0.85f);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
