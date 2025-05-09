package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String USERDATA_KEY_ACTIVITY_RESULT = "userdata.activity.result";

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, a> f27328a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(int i, Intent intent);
    }

    static {
        t2o.a(81788950);
    }

    public void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2457c9", new Object[]{this, new Integer(i), aVar});
        } else {
            ((ConcurrentHashMap) this.f27328a).put(Integer.valueOf(i), aVar);
        }
    }

    public void b(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        a aVar = (a) ((ConcurrentHashMap) this.f27328a).get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.a(i2, intent);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2084267", new Object[]{this, new Integer(i)});
        } else {
            ((ConcurrentHashMap) this.f27328a).remove(Integer.valueOf(i));
        }
    }
}
