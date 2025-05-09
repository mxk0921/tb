package com.taobao.search.m3.interactive;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.ckf;
import tb.dhf;
import tb.dif;
import tb.eif;
import tb.hhf;
import tb.o1p;
import tb.t2o;
import tb.t5u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class InteractiveView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private hhf currentInfo;
    private t5u currentTarget;
    private eif tagListener;
    public static final a Companion = new a(null);
    private static final int viewHeight = o1p.a(21.0f);
    private static final int viewHeight2024 = o1p.a(20.0f);
    private static final int itemMargin = o1p.a(4.0f);
    private final ArrayList<dhf> drawList = new ArrayList<>();
    private final ArrayList<t5u> touchList = new ArrayList<>();
    private int currentHeight = viewHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792411);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792410);
    }

    public InteractiveView(Context context) {
        super(context);
    }

    public static final /* synthetic */ int access$getItemMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91632c54", new Object[0])).intValue();
        }
        return itemMargin;
    }

    public static final /* synthetic */ int access$getViewHeight$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0989469", new Object[0])).intValue();
        }
        return viewHeight;
    }

    public static final /* synthetic */ int access$getViewHeight2024$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9225e069", new Object[0])).intValue();
        }
        return viewHeight2024;
    }

    private final t5u findTag(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t5u) ipChange.ipc$dispatch("2215907a", new Object[]{this, motionEvent});
        }
        float x = motionEvent.getX();
        Iterator<t5u> it = this.touchList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            t5u next = it.next();
            ckf.f(next, "next(...)");
            t5u t5uVar = next;
            if (x >= t5uVar.a() && x <= t5uVar.b()) {
                return t5uVar;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(InteractiveView interactiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/interactive/InteractiveView");
        }
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<dhf> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            dhf next = it.next();
            ckf.f(next, "next(...)");
            dhf dhfVar = next;
            if (dhfVar.e()) {
                dhfVar.f();
            }
        }
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Iterator<dhf> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            dhf next = it.next();
            ckf.f(next, "next(...)");
            next.release();
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return this.currentHeight;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (getMeasuredWidth() > 0) {
            load();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        Iterator<dhf> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        float f = 0.0f;
        while (it.hasNext()) {
            dhf next = it.next();
            ckf.f(next, "next(...)");
            dhf dhfVar = next;
            if (dhfVar.e()) {
                dhfVar.draw(canvas);
                float width = dhfVar.getWidth() + itemMargin;
                canvas.translate(width, 0.0f);
                f += width;
            }
        }
        if (f > 0.0f) {
            canvas.translate(-f, 0.0f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        eif eifVar;
        t5u t5uVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t5u findTag = findTag(motionEvent);
            this.currentTarget = findTag;
            if (findTag == null) {
                return false;
            }
        } else if (actionMasked == 1) {
            t5u t5uVar2 = this.currentTarget;
            if (!(t5uVar2 == null || (eifVar = this.tagListener) == null)) {
                dif c = t5uVar2.c();
                hhf hhfVar = this.currentInfo;
                ckf.d(hhfVar);
                eifVar.Q(c, hhfVar);
            }
        } else if (actionMasked == 2 && (t5uVar = this.currentTarget) != null && (motionEvent.getX() < t5uVar.a() || motionEvent.getX() > t5uVar.b())) {
            this.currentTarget = null;
            return false;
        }
        return true;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.touchList.clear();
        Iterator<dhf> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            dhf next = it.next();
            ckf.f(next, "next(...)");
            dhf dhfVar = next;
            if (dhfVar.getWidth() <= measuredWidth) {
                dhfVar.f();
                dhfVar.g(true);
                this.touchList.add(new t5u(dhfVar.d(), i, dhfVar.getWidth() + i));
                int width = measuredWidth - dhfVar.getWidth();
                int i2 = itemMargin;
                measuredWidth = width - i2;
                i += dhfVar.getWidth() + i2;
            } else {
                dhfVar.release();
                dhfVar.g(false);
            }
        }
    }

    public final void update(hhf hhfVar, eif eifVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1ad1b2", new Object[]{this, hhfVar, eifVar, new Boolean(z)});
            return;
        }
        ckf.g(hhfVar, "info");
        this.tagListener = eifVar;
        if (this.currentInfo != hhfVar) {
            if (z) {
                i = viewHeight2024;
            } else {
                i = viewHeight;
            }
            this.currentHeight = i;
            reset();
            this.currentInfo = hhfVar;
            release();
            this.drawList.clear();
            for (dif difVar : hhfVar.c()) {
                this.drawList.add(new dhf(difVar, this, z, hhfVar.a()));
            }
            if (!hhfVar.b()) {
                hhfVar.d(true);
                if (eifVar != null) {
                    eifVar.G(hhfVar);
                }
            }
            requestLayout();
        }
    }
}
