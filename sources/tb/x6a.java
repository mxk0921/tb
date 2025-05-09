package tb;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x6a implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final GestureDetector f31176a;

    static {
        t2o.a(815792211);
    }

    public x6a(GestureDetector gestureDetector) {
        this.f31176a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        GestureDetector gestureDetector = this.f31176a;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }
}
