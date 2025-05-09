package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g3q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SKU_ADD_TO_CART = 2;
    public static final int SKU_BUY = 1;
    public static final int SKU_CLEAR_PARAMS = 8;
    public static final int SKU_CONFIRM = 3;
    public static final int SKU_DOWNGRADE_NATIVE = 9;
    public static final int SKU_GET_DETAIL_DATA = 10;
    public static final int SKU_GET_INPUT_DATA = 7;
    public static final int SKU_HYBRID_ADD_PARAM = 5;
    public static final int SKU_HYBRID_UPDATE_VIEW = 6;
    public static final int SKU_WINDOW_DISMISS = 4;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<sqd> f19713a;

    static {
        t2o.a(442499203);
    }

    public String a(int i, Map<String, String> map) {
        sqd sqdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("137f4830", new Object[]{this, new Integer(i), map});
        }
        WeakReference<sqd> weakReference = this.f19713a;
        if (weakReference == null || (sqdVar = weakReference.get()) == null) {
            return null;
        }
        if (i != 7 && i != 10) {
            sqdVar.onEvent(i, map);
            return null;
        } else if (sqdVar instanceof my) {
            return ((my) sqdVar).a(i, map);
        } else {
            return null;
        }
    }

    public void b(sqd sqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b81bcf", new Object[]{this, sqdVar});
        } else {
            this.f19713a = new WeakReference<>(sqdVar);
        }
    }
}
