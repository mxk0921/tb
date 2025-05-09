package com.taobao.android.megadesign.ZoomableGesture;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.MotionEventCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.ZoomableGesture.MegaImageZoomableImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MegaImageZoomableGestureHandler implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DOUBLE_DRAG = 2;
    public static final int NONE = 0;
    public static final int SINGLE_DRAG = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f8905a = 2;
    public PointF b = new PointF();
    public int c = -1;
    public PointF d = new PointF();
    public PointF e = new PointF();
    public a f;
    public b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    public MegaImageZoomableGestureHandler() {
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf67b2c", new Object[]{this});
            return;
        }
        this.f8905a = 2;
        this.b = new PointF();
        this.d = new PointF();
        this.e = new PointF();
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2597cd2c", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public void c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4ee67d", new Object[]{this, motionEvent});
        } else {
            this.c = MotionEventCompat.getPointerId(motionEvent, 0);
        }
    }

    public void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e44690c", new Object[]{this, bVar});
        } else {
            this.g = bVar;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int pointerCount = motionEvent.getPointerCount();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                int i2 = this.f8905a;
                if (i2 == 1 && pointerCount == 1) {
                    int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.c);
                    if (findPointerIndex < 0) {
                        return true;
                    }
                    float x = MotionEventCompat.getX(motionEvent, findPointerIndex);
                    float y = MotionEventCompat.getY(motionEvent, findPointerIndex);
                    PointF pointF = this.b;
                    ((MegaImageZoomableImageView.b) this.g).a(x - pointF.x, y - pointF.y);
                    this.b.set(x, y);
                } else if (i2 == 2 && pointerCount == 2) {
                    float x2 = motionEvent.getX(0);
                    float y2 = motionEvent.getY(0);
                    float x3 = motionEvent.getX(1);
                    float y3 = motionEvent.getY(1);
                    PointF pointF2 = this.d;
                    float f = x2 - pointF2.x;
                    float f2 = y2 - pointF2.y;
                    PointF pointF3 = this.e;
                    float f3 = x3 - pointF3.x;
                    float f4 = y3 - pointF3.y;
                    double d = f2;
                    double d2 = f;
                    double d3 = f4;
                    double d4 = f3;
                    double abs = Math.abs(Math.toDegrees(Math.atan2(d, d2)) - Math.toDegrees(Math.atan2(d3, d4)));
                    double min = Math.min(abs, 360.0d - abs);
                    double abs2 = Math.abs(Math.hypot(d2, d) - Math.hypot(d4, d3));
                    if (min <= 20.0d && abs2 <= 100.0d) {
                        ((MegaImageZoomableImageView.a) this.f).a((f + f3) / 2.0f, (f2 + f4) / 2.0f);
                    }
                    this.d.set(x2, y2);
                    this.e.set(x3, y3);
                }
            } else if (actionMasked != 5) {
                if (actionMasked == 6 && pointerCount == 2) {
                    this.f8905a = 1;
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.c) {
                        if (actionIndex == 0) {
                            i = 1;
                        }
                        float x4 = MotionEventCompat.getX(motionEvent, i);
                        float y4 = MotionEventCompat.getY(motionEvent, i);
                        this.c = MotionEventCompat.getPointerId(motionEvent, i);
                        this.b.set(x4, y4);
                    } else {
                        if (motionEvent.getActionIndex() == 0) {
                            i = 1;
                        }
                        this.b.set(motionEvent.getX(i), motionEvent.getY(i));
                    }
                }
            } else if (pointerCount == 2) {
                this.f8905a = 2;
                this.d.set(motionEvent.getX(0), motionEvent.getY(0));
                this.e.set(motionEvent.getX(1), motionEvent.getY(1));
            }
            return true;
        }
        this.f8905a = 1;
        return true;
    }

    public MegaImageZoomableGestureHandler(Context context, AttributeSet attributeSet) {
    }
}
