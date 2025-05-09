package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class oq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f25567a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final oq6 f25568a = new oq6();

        static {
            t2o.a(962593204);
        }

        public static /* synthetic */ oq6 access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oq6) ipChange.ipc$dispatch("bfaa8b32", new Object[0]);
            }
            return f25568a;
        }
    }

    static {
        t2o.a(962593202);
    }

    public static oq6 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oq6) ipChange.ipc$dispatch("848b0c", new Object[0]);
        }
        return b.access$100();
    }

    public String getDataKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bed79f30", new Object[]{this, str});
        }
        String str2 = this.f25567a.get(str);
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str2;
    }

    public oq6() {
        HashMap hashMap = new HashMap();
        hashMap.put("eid", oeh.EVENTID);
        hashMap.put("pg", "PAGE");
        hashMap.put("arg1", oeh.ARG1);
        hashMap.put("arg2", oeh.ARG2);
        hashMap.put("arg3", oeh.ARG3);
        this.f25567a = Collections.unmodifiableMap(hashMap);
    }
}
