package com.etao.feimagesearch.circlesearch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.p1p;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CircleDrawingPanelView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RectF boundingRect;
    private final Paint dotPaint;
    private float latestPointX;
    private float latestPointY;
    private d1a<xhv> onGestureCancel;
    private g1a<? super RectF, xhv> onGestureRectFGot;
    private d1a<xhv> onGestureTrigger;
    private final Paint paint;
    private Path path;

    static {
        t2o.a(481296914);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleDrawingPanelView(Context context) {
        this(context, null, 2, null);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(CircleDrawingPanelView circleDrawingPanelView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/circlesearch/CircleDrawingPanelView");
    }

    public final d1a<xhv> getOnGestureCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("b3aa42c8", new Object[]{this});
        }
        return this.onGestureCancel;
    }

    public final g1a<RectF, xhv> getOnGestureRectFGot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("5ab4b217", new Object[]{this});
        }
        return this.onGestureRectFGot;
    }

    public final d1a<xhv> getOnGestureTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("c23aa2f2", new Object[]{this});
        }
        return this.onGestureTrigger;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.path;
        if (path != null) {
            canvas.drawPath(path, this.paint);
            canvas.drawCircle(this.latestPointX, this.latestPointY, p1p.b(16.0f), this.dotPaint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = new RectF();
                Path path = this.path;
                if (path != null) {
                    path.computeBounds(rectF, true);
                }
                this.boundingRect = rectF;
                this.path = null;
                invalidate();
                if (rectF.width() < 100.0f || rectF.height() < 100.0f) {
                    d1a<xhv> d1aVar = this.onGestureCancel;
                    if (d1aVar != null) {
                        d1aVar.invoke();
                    }
                } else {
                    g1a<? super RectF, xhv> g1aVar = this.onGestureRectFGot;
                    if (g1aVar != null) {
                        g1aVar.invoke(new RectF(rectF));
                    }
                }
            } else if (action == 2) {
                Path path2 = this.path;
                if (path2 != null) {
                    path2.lineTo(motionEvent.getX(), motionEvent.getY());
                }
                this.latestPointX = motionEvent.getX();
                this.latestPointY = motionEvent.getY();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        Path path3 = new Path();
        this.path = path3;
        path3.moveTo(motionEvent.getX(), motionEvent.getY());
        this.latestPointX = motionEvent.getX();
        this.latestPointY = motionEvent.getY();
        d1a<xhv> d1aVar2 = this.onGestureTrigger;
        if (d1aVar2 != null) {
            d1aVar2.invoke();
        }
        invalidate();
        return true;
    }

    public final void setOnGestureCancel(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05135b0", new Object[]{this, d1aVar});
        } else {
            this.onGestureCancel = d1aVar;
        }
    }

    public final void setOnGestureRectFGot(g1a<? super RectF, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd713df", new Object[]{this, g1aVar});
        } else {
            this.onGestureRectFGot = g1aVar;
        }
    }

    public final void setOnGestureTrigger(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a76ea5e", new Object[]{this, d1aVar});
        } else {
            this.onGestureTrigger = d1aVar;
        }
    }

    public /* synthetic */ CircleDrawingPanelView(Context context, AttributeSet attributeSet, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleDrawingPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#FFFFFF"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(p1p.b(4.0f));
        paint.setShadowLayer(p1p.b(4.0f), 0.0f, 0.0f, Color.parseColor("#66000000"));
        this.paint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        this.dotPaint = paint2;
    }
}
