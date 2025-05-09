package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WeakReference<JSONObject>> f22848a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kq6 f22849a = new kq6();

        static {
            t2o.a(817889292);
        }

        public static /* synthetic */ kq6 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kq6) ipChange.ipc$dispatch("7aea54ea", new Object[0]);
            }
            return f22849a;
        }
    }

    static {
        t2o.a(817889290);
    }

    public static kq6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kq6) ipChange.ipc$dispatch("fd06cec4", new Object[0]);
        }
        return b.a();
    }

    public synchronized JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a3ba61d1", new Object[]{this, str});
        }
        WeakReference weakReference = (WeakReference) ((HashMap) this.f22848a).remove(str);
        if (weakReference == null) {
            return null;
        }
        return (JSONObject) weakReference.get();
    }

    public synchronized String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("340a8710", new Object[]{this, jSONObject});
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        ((HashMap) this.f22848a).put(valueOf, new WeakReference(jSONObject));
        return valueOf;
    }

    public kq6() {
        this.f22848a = new HashMap();
    }
}
