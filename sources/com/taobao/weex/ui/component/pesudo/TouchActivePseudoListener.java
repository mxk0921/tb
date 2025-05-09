package com.taobao.weex.ui.component.pesudo;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TouchActivePseudoListener implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsConsumeOnTouch;
    private OnActivePseudoListner mOnActivePseudoListner;

    static {
        t2o.a(985661720);
    }

    public TouchActivePseudoListener(OnActivePseudoListner onActivePseudoListner, boolean z) {
        this.mOnActivePseudoListner = onActivePseudoListner;
        this.mIsConsumeOnTouch = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        OnActivePseudoListner onActivePseudoListner = this.mOnActivePseudoListner;
        if (onActivePseudoListner != null) {
            if (action == 0 || action == 5) {
                onActivePseudoListner.updateActivePseudo(true);
            } else if (action == 3 || action == 1 || action == 6) {
                onActivePseudoListner.updateActivePseudo(false);
            }
        }
        return this.mIsConsumeOnTouch;
    }
}
