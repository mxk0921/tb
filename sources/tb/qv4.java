package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qv4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qv4 b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, rv4> f26947a = new HashMap<>();

    static {
        t2o.a(502268184);
    }

    public static qv4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qv4) ipChange.ipc$dispatch("68078ff0", new Object[0]);
        }
        if (b == null) {
            synchronized (qv4.class) {
                try {
                    if (b == null) {
                        b = new qv4();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa18b4f", new Object[]{this, str});
        } else if (this.f26947a != null && !TextUtils.isEmpty(str)) {
            tfs.c("SharePlayer", "清空convertObject，key:" + str);
            this.f26947a.remove(str);
        }
    }

    public rv4 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv4) ipChange.ipc$dispatch("49b3a8c7", new Object[]{this, str});
        }
        HashMap<String, rv4> hashMap = this.f26947a;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        return this.f26947a.get(str);
    }

    public void d(String str, rv4 rv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cf12c8", new Object[]{this, str, rv4Var});
            return;
        }
        HashMap<String, rv4> hashMap = this.f26947a;
        if (hashMap != null) {
            hashMap.put(str, rv4Var);
        }
    }
}
