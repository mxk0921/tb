package tb;

import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface cae {
    boolean callSuperCanScroll(View view, boolean z, int i, int i2, int i3);

    boolean callSuperDispatchTouchEvent(MotionEvent motionEvent);

    boolean callSuperOnInterceptTouchEvent(MotionEvent motionEvent);

    ViewPager getViewPager();
}
