package com.taobao.android.dinamicx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.megadesign.ZoomableGesture.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXAliUrlImageView extends AliUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a megaImageZoomableScaleGestureDetector;

    public DXAliUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ Object ipc$super(DXAliUrlImageView dXAliUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXAliUrlImageView");
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.megaImageZoomableScaleGestureDetector = new a(getContext(), this);
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() >= 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.megaImageZoomableScaleGestureDetector.l(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public DXAliUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public DXAliUrlImageView(Context context) {
        super(context);
        init();
    }
}
