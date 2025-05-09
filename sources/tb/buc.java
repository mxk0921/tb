package tb;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface buc {
    int Y();

    View getView();

    boolean onInterceptTouchEvent(MotionEvent motionEvent);

    boolean onTouchEvent(MotionEvent motionEvent);

    void stopScroll();

    int v1();
}
