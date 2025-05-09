package com.taobao.infoflow.taobao.subservice.biz.facedetectorservice.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AutoSelectView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mRect;
    private Paint paint;

    static {
        t2o.a(491782334);
    }

    public AutoSelectView(Context context, Rect rect) {
        super(context);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-65536);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setStyle(Paint.Style.STROKE);
        this.mRect = rect;
    }

    public static /* synthetic */ Object ipc$super(AutoSelectView autoSelectView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/facedetectorservice/impl/AutoSelectView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawRect(this.mRect, this.paint);
    }

    public void setRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdb4d0c", new Object[]{this, rect});
            return;
        }
        this.mRect = rect;
        invalidate();
    }
}
