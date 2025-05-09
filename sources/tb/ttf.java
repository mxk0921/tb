package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ttf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_WALLE = "Walle";
    public static final String TAG = "JarvisTriggerManager";

    /* renamed from: a  reason: collision with root package name */
    public static final ttf f28951a = new ttf();

    static {
        t2o.a(1034944721);
    }

    public ttf() {
        new ConcurrentHashMap();
    }

    public static ttf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ttf) ipChange.ipc$dispatch("e490e1aa", new Object[0]);
        }
        return f28951a;
    }

    public void a(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ad0f6d", new Object[]{this, h45Var});
        } else {
            zfu.e().c(CONFIG_GROUP_WALLE, h45Var);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23493c6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            zfu.e().k(CONFIG_GROUP_WALLE, str);
        }
    }
}
