package tb;

import android.util.Pair;
import android.view.MotionEvent;
import com.taobao.tao.flexbox.layoutmanager.core.n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface bod extends w4e {
    ye<?> findSecPageWrapper();

    void onPageSelected(int i);

    void slideSecondPage(Object obj, String str);

    Pair<Boolean, Pair<Boolean, n>> supportSecondPage(MotionEvent motionEvent);
}
