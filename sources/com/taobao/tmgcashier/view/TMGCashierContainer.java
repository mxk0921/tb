package com.taobao.tmgcashier.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMGCashierContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(860880922);
    }

    public TMGCashierContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public static /* synthetic */ Object ipc$super(TMGCashierContainer tMGCashierContainer, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmgcashier/view/TMGCashierContainer");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float a2 = b8s.a(getContext()) * 24.0f;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int save = canvas.save();
        int width = getWidth();
        int height = getHeight();
        path.reset();
        path.addRoundRect(new RectF(0.0f, 0.0f, width, height), new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
