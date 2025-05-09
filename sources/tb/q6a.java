package tb;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.GestureDetectorCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q6a implements k90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final GestureDetectorCompat f26542a;
    public final t6a b;

    public q6a(Context context, t6a t6aVar) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, t6aVar);
        this.f26542a = gestureDetectorCompat;
        gestureDetectorCompat.setIsLongpressEnabled(false);
        this.b = t6aVar;
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = this.f26542a.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            ((s6a) this.b).a(motionEvent);
        }
        return onTouchEvent;
    }
}
