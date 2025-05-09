package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bbm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, String>> f16298a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final bbm f16299a = new bbm();

        static {
            t2o.a(790626511);
        }

        public static /* synthetic */ bbm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbm) ipChange.ipc$dispatch("a63cee3b", new Object[0]);
            }
            return f16299a;
        }
    }

    static {
        t2o.a(790626510);
    }

    public static bbm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbm) ipChange.ipc$dispatch("3c4df4a0", new Object[0]);
        }
        return a.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a2161e8", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.f16298a).remove(str);
        }
    }

    public String b(String str, String str2, String str3) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9cc3c77", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = (Map) ((ConcurrentHashMap) this.f16298a).get(str)) == null) {
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            return (String) map.get(str2);
        }
        return (String) map.get(str3);
    }

    public boolean d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("698b0946", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Map map = (Map) ((ConcurrentHashMap) this.f16298a).get(str);
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        map.put(str2, str3);
        ((ConcurrentHashMap) this.f16298a).put(str, map);
        return true;
    }
}
