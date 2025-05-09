package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class utx implements f6y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29615a;
    public final Map<String, String> b;
    public final Object[] c;

    public utx(int i, Map<String, String> map, Object... objArr) {
        this.f29615a = i;
        this.b = map;
        this.c = objArr;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return this.f29615a;
    }

    public String b(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (map = this.b) == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        return this.b;
    }

    public utx(int i, Map<String, String> map) {
        this.f29615a = i;
        this.b = map;
        this.c = null;
    }
}
