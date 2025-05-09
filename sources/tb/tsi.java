package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f28933a = null;

    static {
        t2o.a(993001863);
    }

    public static int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bc1ad90", new Object[]{view})).intValue();
        }
        return (int) view.getTranslationY();
    }

    public static void c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8526312", new Object[]{view, new Integer(i)});
        } else {
            view.setTranslationY(i);
        }
    }

    public static void b(RecyclerView recyclerView, int i) {
        try {
            if (f28933a == null) {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("setScrollState", Integer.TYPE);
                f28933a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f28933a.invoke(recyclerView, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
