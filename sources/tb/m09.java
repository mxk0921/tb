package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m09 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FANS_LEVEL_DIA = "2";
    public static final String FANS_LEVEL_IRON = "1";
    public static final String FANS_LEVEL_NEW = "0";
    public static final String FANS_LEVEL_RENDER = "fanLevel";
    public static final String ICON_RENDER = "icons";
    public static final String TASK_TYPE_LEVEL = "level";
    public static final String TASK_TYPE_NORMAL = "normal";
    public static m09 b = null;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f23686a = new HashMap<>();

    static {
        t2o.a(806355803);
    }

    public static m09 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m09) ipChange.ipc$dispatch("ec425f8b", new Object[0]);
        }
        if (b == null) {
            b = new m09();
        }
        return b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f23686a.clear();
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d6598", new Object[]{this});
        }
        HashMap<String, String> hashMap = this.f23686a;
        if (hashMap == null || hashMap.get(FANS_LEVEL_RENDER) == null) {
            return null;
        }
        return this.f23686a.get(FANS_LEVEL_RENDER);
    }

    public HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("82b22f5a", new Object[]{this});
        }
        return this.f23686a;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dc1de", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = this.f23686a;
        if (hashMap != null) {
            hashMap.put(FANS_LEVEL_RENDER, str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0743e9e", new Object[]{this, str});
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537c6a02", new Object[]{this, str});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda30533", new Object[]{this});
            return;
        }
        String uuid = UUID.randomUUID().toString();
        cpr.J = uuid;
        HashMap<String, String> hashMap = this.f23686a;
        if (hashMap != null) {
            hashMap.put("userToken", uuid);
        }
    }
}
