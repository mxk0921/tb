package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i5k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_ENTER_NODE = "last_enter_node";
    public static final String TAG = "NodeStoreHelper";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ly1> f21105a = new HashMap();

    static {
        t2o.a(404750542);
    }

    public static ly1 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("596ec412", new Object[]{str});
        }
        return (ly1) ((HashMap) f21105a).get(str);
    }

    public static boolean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb1c948", new Object[]{obj})).booleanValue();
        }
        if (!(obj instanceof Activity) || !((Activity) obj).isFinishing()) {
            return false;
        }
        return true;
    }

    public static void c(String str, ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a9a4bb", new Object[]{str, ly1Var});
        } else {
            ((HashMap) f21105a).put(str, ly1Var);
        }
    }
}
