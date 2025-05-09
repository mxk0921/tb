package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ctn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810068);
    }

    public static float a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(recyclerView);
            Field declaredField2 = obj.getClass().getDeclaredField("mScroller");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mScrollerY");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            Field declaredField4 = obj3.getClass().getDeclaredField("mCurrVelocity");
            declaredField4.setAccessible(true);
            Object obj4 = declaredField4.get(obj3);
            if (obj4 instanceof Float) {
                return pb6.C(recyclerView.getContext(), ((Float) obj4).intValue());
            }
            return 0.0f;
        } catch (Exception e) {
            fve.c("RecyclerViewScrollVelocityUtils", "getCurrentScrollerYVelocity error", e);
            e.printStackTrace();
            return 0.0f;
        }
    }
}
