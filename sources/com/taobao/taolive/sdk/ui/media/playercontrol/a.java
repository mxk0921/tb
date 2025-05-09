package com.taobao.taolive.sdk.ui.media.playercontrol;

import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.iw0;
import tb.o3s;
import tb.pvs;
import tb.qr4;
import tb.s4w;
import tb.t2o;
import tb.z14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f13316a;
    public float b;
    public float c;
    public long d;
    public long e;
    public final View j;
    public final View k;
    public final SeekBar l;
    public final IPlayPublicService m;
    public AbstractC0761a n;
    public final View o;
    public View p;
    public final boolean q;
    public float f = 1.0f;
    public boolean h = false;
    public boolean i = false;
    public final float g = (float) pvs.r2();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.sdk.ui.media.playercontrol.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface AbstractC0761a {
    }

    static {
        t2o.a(779093505);
    }

    public a(qr4 qr4Var, IPlayPublicService iPlayPublicService, boolean z) {
        this.m = iPlayPublicService;
        this.q = z;
        if (qr4Var != null) {
            View view = qr4Var.m;
            this.j = view;
            this.l = qr4Var.f;
            if (view != null) {
                this.k = view.findViewById(R.id.taolive_video_gesture_seekbar);
            }
            View view2 = qr4Var.f26892a;
            if (view2 != null && (view2.getParent() instanceof ViewGroup) && (qr4Var.f26892a.getParent().getParent() instanceof ViewGroup)) {
                this.o = (View) qr4Var.f26892a.getParent().getParent();
            }
        }
    }

    public final int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9a87a0b", new Object[]{this, view})).intValue();
        }
        if (view == null) {
            return iw0.f();
        }
        int width = (view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd();
        Log.e("ControlViewManager", "getSeekBarAvailableWidth: availableWidth = " + width);
        return width;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4abecce3", new Object[]{this})).longValue();
        }
        try {
            return this.m.getCurrentPosition();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        try {
            return this.m.getDuration();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public final float d(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304c4756", new Object[]{this, view, motionEvent})).floatValue();
        }
        if (this.l == null) {
            return 0.0f;
        }
        int round = Math.round(motionEvent.getX());
        int width = view.getWidth();
        int a2 = a(view);
        if (round < view.getPaddingStart()) {
            return 0.0f;
        }
        if (round > width - view.getPaddingEnd()) {
            return 1.0f;
        }
        return (round - view.getPaddingStart()) / a2;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View view = this.k;
        if (view != null) {
            ViewProxy.setOnTouchListener(view, this);
        }
    }

    public final boolean g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("121d7bc2", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        if (this.q || !pvs.g1()) {
            return false;
        }
        float f3 = f - this.b;
        float f4 = f2 - this.c;
        if (Math.abs(Math.abs(f4)) - Math.abs(Math.abs(f3)) <= 50 || f4 >= 0.0f) {
            return false;
        }
        return true;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b23ace", new Object[]{this});
            return;
        }
        this.h = false;
        this.i = false;
        this.c = 0.0f;
        this.b = 0.0f;
        this.e = 0L;
        this.f = 1.0f;
        m(false);
        AbstractC0761a aVar = this.n;
        if (aVar != null) {
            ((PlayerController2.i) aVar).c(this.f13316a, this.d);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf38837", new Object[]{this});
            return;
        }
        SeekBar seekBar = this.l;
        if (seekBar != null) {
            seekBar.getProgressDrawable().setColorFilter(z14.a("#50CEFF"), PorterDuff.Mode.SRC_IN);
            Log.e("ControlViewManager", "进入精准模式:");
            this.f = this.l.getMax() / this.g;
        }
    }

    public final boolean k(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc2edf12", new Object[]{this, view, motionEvent})).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = x;
            this.c = y;
            n(view, motionEvent);
        } else if (action == 1) {
            o(view);
            view.invalidate();
        } else if (action == 2) {
            p(view, motionEvent, x, y);
        }
        return true;
    }

    public void l(AbstractC0761a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3941351", new Object[]{this, aVar});
        } else {
            this.n = aVar;
        }
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfa3a69", new Object[]{this, new Boolean(z)});
            return;
        }
        SeekBar seekBar = this.l;
        if (seekBar != null) {
            if (!(seekBar.getContext() == null || this.l.getContext().getResources() == null)) {
                if (z) {
                    SeekBar seekBar2 = this.l;
                    seekBar2.setThumb(seekBar2.getContext().getResources().getDrawable(R.drawable.taolive_video_seekbar_thumb_pressed));
                } else {
                    SeekBar seekBar3 = this.l;
                    seekBar3.setThumb(seekBar3.getContext().getResources().getDrawable(R.drawable.taolive_video_seekbar_thumb));
                    this.l.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
            }
            this.l.setPressed(z);
        }
    }

    public final void n(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e2d14a", new Object[]{this, view, motionEvent});
            return;
        }
        if (view != null) {
            view.setPressed(true);
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).requestDisallowInterceptTouchEvent(true);
            }
        }
        h();
    }

    public final void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978ee7d5", new Object[]{this, view});
            return;
        }
        if (view != null) {
            view.setPressed(false);
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).requestDisallowInterceptTouchEvent(false);
            }
        }
        i();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0e4fcc", new Object[]{this});
        } else if (!this.h) {
            m(true);
            this.h = true;
            this.f13316a = b();
            Log.e("ControlViewManager", "touchSurfaceMoveFullLogic:mDownPosition:" + this.f13316a);
            AbstractC0761a aVar = this.n;
            if (aVar != null) {
                ((PlayerController2.i) aVar).b(this.f13316a);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        try {
            if (view.getId() == R.id.taolive_video_gesture_seekbar) {
                if (f(motionEvent) && (view2 = this.p) != null) {
                    return view2.dispatchTouchEvent(motionEvent);
                }
                k(view, motionEvent);
            }
        } catch (Throwable th) {
            o3s.c("ControlViewManager", "onTouch error", th);
        }
        return false;
    }

    public final void p(View view, MotionEvent motionEvent, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8410d381", new Object[]{this, view, motionEvent, new Float(f), new Float(f2)});
        } else if (this.h) {
            long c = c();
            float d = d(view, motionEvent);
            float f3 = ((float) c) * d * 1.0f;
            this.d = (int) (((float) this.e) + (f3 / this.f));
            Log.e("ControlViewManager", "seekBarOnTouch: ACTION_MOVE_scale:" + d + ",mSeekTimePosition = " + this.d + ",mDownPosition = " + this.f13316a + ",totalTimeDuration = " + c);
            if (this.d < 0) {
                this.d = 0L;
            }
            if (this.d > c) {
                this.d = c;
            }
            String stringForTime = PlayerController2.stringForTime(this.d);
            String stringForTime2 = PlayerController2.stringForTime(c);
            AbstractC0761a aVar = this.n;
            if (aVar != null) {
                ((PlayerController2.i) aVar).d(stringForTime, this.d, stringForTime2, c);
            }
            if (!this.i) {
                boolean g = g(f, f2);
                this.i = g;
                if (g) {
                    s4w.a(view.getContext());
                    this.e = (int) (f3 / this.f);
                    j();
                    AbstractC0761a aVar2 = this.n;
                    if (aVar2 != null) {
                        ((PlayerController2.i) aVar2).a(true, this.e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.sdk.ui.media.playercontrol.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "574a2dae"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r2[r0] = r11
            java.lang.Object r11 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001c:
            android.view.View r3 = r10.o
            if (r3 == 0) goto L_0x00db
            android.view.View r4 = r10.k
            if (r4 != 0) goto L_0x0026
            goto L_0x00db
        L_0x0026:
            android.view.View r4 = r10.p
            if (r4 != 0) goto L_0x0032
            int r4 = com.taobao.taobao.R.id.fl_show_case_card
            android.view.View r3 = r3.findViewById(r4)
            r10.p = r3
        L_0x0032:
            android.view.View r3 = r10.p
            java.lang.String r4 = "ControlViewManager"
            if (r3 == 0) goto L_0x00d5
            boolean r3 = r3.isShown()
            if (r3 != 0) goto L_0x0040
            goto L_0x00d5
        L_0x0040:
            float r3 = r11.getX()
            float r11 = r11.getY()
            int[] r5 = new int[r2]
            android.view.View r6 = r10.p
            r6.getLocationOnScreen(r5)
            r6 = r5[r1]
            r5 = r5[r0]
            int[] r2 = new int[r2]
            android.view.View r7 = r10.k
            r7.getLocationOnScreen(r2)
            r2 = r2[r0]
            android.view.View r7 = r10.p
            int r7 = r7.getWidth()
            android.view.View r8 = r10.p
            int r8 = r8.getHeight()
            float r9 = (float) r6
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0084
            int r9 = r6 + r7
            float r9 = (float) r9
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0084
            float r2 = (float) r2
            float r2 = r2 + r11
            float r9 = (float) r5
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0084
            int r9 = r5 + r8
            float r9 = (float) r9
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            if (r2 == 0) goto L_0x008d
            android.view.View r0 = r10.k
            r0.setClickable(r1)
            goto L_0x0092
        L_0x008d:
            android.view.View r1 = r10.k
            r1.setClickable(r0)
        L_0x0092:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "点击在商品卡内，x:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ",y:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = ",viewX:"
            r0.append(r11)
            r0.append(r6)
            java.lang.String r11 = ",viewY:"
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = ",viewWidth:"
            r0.append(r11)
            r0.append(r7)
            java.lang.String r11 = ",viewHeight:"
            r0.append(r11)
            r0.append(r8)
            java.lang.String r11 = ",isDownInShowCaseCard:"
            r0.append(r11)
            r0.append(r2)
            java.lang.String r11 = r0.toString()
            tb.o3s.b(r4, r11)
            return r2
        L_0x00d5:
            java.lang.String r11 = "商品卡片为null，或者不可见，return"
            tb.o3s.b(r4, r11)
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.ui.media.playercontrol.a.f(android.view.MotionEvent):boolean");
    }
}
