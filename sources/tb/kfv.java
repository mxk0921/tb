package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kfv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIZ_SCENE = "biz_scene";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f22639a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static final kfv sInstance = new kfv();

        static {
            t2o.a(944766983);
        }
    }

    static {
        t2o.a(944766982);
    }

    public static kfv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfv) ipChange.ipc$dispatch("acd5e8a0", new Object[0]);
        }
        return a.sInstance;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c4e39c", new Object[]{this});
        }
        return (String) ((HashMap) this.f22639a).get("umi_pub_session");
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bc339db", new Object[]{this, str});
        }
        return (String) ((HashMap) this.f22639a).get(str);
    }

    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e64ee491", new Object[]{this, str, str2});
        }
        String str3 = (String) ((HashMap) this.f22639a).get(str);
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("908941db", new Object[]{this});
        }
        return this.f22639a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11602a40", new Object[]{this})).booleanValue();
        }
        return "1".equals(((HashMap) this.f22639a).get("async_merge_video"));
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae89b27", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.f22639a).put(str, dik.a(str2, ""));
        }
    }

    public void i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1b6f92", new Object[]{this, map});
        } else {
            ((HashMap) this.f22639a).putAll(map);
        }
    }
}
