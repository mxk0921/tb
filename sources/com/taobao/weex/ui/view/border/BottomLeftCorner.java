package com.taobao.weex.ui.view.border;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BottomLeftCorner extends BorderCorner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661745);
    }

    public static /* synthetic */ Object ipc$super(BottomLeftCorner bottomLeftCorner, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/border/BottomLeftCorner");
    }

    @Override // com.taobao.weex.ui.view.border.BorderCorner
    public void prepareOval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab1c200", new Object[]{this});
        } else if (hasInnerCorner()) {
            setOvalLeft(getPostBorderWidth() / 2.0f);
            setOvalTop(getBorderBox().height() - ((getOuterCornerRadius() * 2.0f) - (getPreBorderWidth() / 2.0f)));
            setOvalRight((getOuterCornerRadius() * 2.0f) - (getPostBorderWidth() / 2.0f));
            setOvalBottom(getBorderBox().height() - (getPreBorderWidth() / 2.0f));
        } else {
            setOvalLeft(getOuterCornerRadius() / 2.0f);
            setOvalTop(getBorderBox().height() - (getOuterCornerRadius() * 1.5f));
            setOvalRight(getOuterCornerRadius() * 1.5f);
            setOvalBottom(getBorderBox().height() - (getOuterCornerRadius() / 2.0f));
        }
    }

    @Override // com.taobao.weex.ui.view.border.BorderCorner
    public void prepareRoundCorner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53485483", new Object[]{this});
        } else if (hasOuterCorner()) {
            setRoundCornerStartX(getOuterCornerRadius());
            setRoundCornerStartY(getBorderBox().height() - (getPreBorderWidth() / 2.0f));
            setRoundCornerEndX(getPostBorderWidth() / 2.0f);
            setRoundCornerEndY(getBorderBox().height() - getOuterCornerRadius());
        } else {
            float postBorderWidth = getPostBorderWidth() / 2.0f;
            float height = getBorderBox().height() - (getPreBorderWidth() / 2.0f);
            setRoundCornerStartX(postBorderWidth);
            setRoundCornerStartY(height);
            setRoundCornerEndX(postBorderWidth);
            setRoundCornerEndY(height);
        }
    }

    public void set(float f, float f2, float f3, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a5a548", new Object[]{this, new Float(f), new Float(f2), new Float(f3), rectF});
        } else {
            set(f, f2, f3, rectF, 135.0f);
        }
    }
}
