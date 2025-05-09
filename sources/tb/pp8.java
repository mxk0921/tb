package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f26223a = new ConcurrentHashMap();

    static {
        t2o.a(81789010);
    }

    public void a(String str) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afe2858", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (((ConcurrentHashMap) this.f26223a).containsKey(str)) {
                i = 1 + ((Integer) ((ConcurrentHashMap) this.f26223a).get(str)).intValue();
            }
            ((ConcurrentHashMap) this.f26223a).put(str, Integer.valueOf(i));
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95c4dc26", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.f26223a).containsKey(str) || ((Integer) ((ConcurrentHashMap) this.f26223a).get(str)).intValue() <= 0) {
            return false;
        }
        return true;
    }
}
