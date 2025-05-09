package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.akt;
import tb.t2o;
import tb.ugw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MaskLayerView extends FlatViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float checkAlpha;
    private boolean disableDispatchTouch;
    private boolean openCheckAlphaSwitch;
    private boolean hitChild = false;
    private boolean satisfyCheckAlpha = true;

    static {
        t2o.a(503317463);
    }

    public MaskLayerView(Context context) {
        super(context);
        try {
            this.disableDispatchTouch = akt.b(context);
            this.openCheckAlphaSwitch = akt.g1();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(MaskLayerView maskLayerView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/MaskLayerView");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.hitChild = false;
            this.satisfyCheckAlpha = true;
            if (this.openCheckAlphaSwitch && ugw.a(this, (int) motionEvent.getX(), (int) motionEvent.getY()) < ((int) (this.checkAlpha * 255.0f))) {
                this.satisfyCheckAlpha = false;
            }
            if (this.satisfyCheckAlpha) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                int i = 0;
                while (true) {
                    if (i >= getChildCount()) {
                        break;
                    }
                    View childAt = getChildAt(i);
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    int i2 = iArr[0];
                    if (i2 <= rawX && rawX <= i2 + childAt.getWidth()) {
                        int i3 = iArr[1];
                        if (i3 <= rawY && rawY <= i3 + childAt.getHeight()) {
                            this.hitChild = true;
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        if (this.disableDispatchTouch) {
            if (this.satisfyCheckAlpha) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        } else if (this.hitChild) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            return false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public void setCheckAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d96fe1", new Object[]{this, new Float(f)});
        } else {
            this.checkAlpha = f;
        }
    }
}
