package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f24580a;
    public JSONArray b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final n93 f24581a = new n93();

        static {
            t2o.a(815793390);
        }

        public static /* synthetic */ n93 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n93) ipChange.ipc$dispatch("a9a44972", new Object[0]);
            }
            return f24581a;
        }
    }

    static {
        t2o.a(815793388);
    }

    public static n93 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n93) ipChange.ipc$dispatch("ca62b8d8", new Object[0]);
        }
        return b.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f24580a = null;
        this.b = null;
    }

    public JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9fa727f7", new Object[]{this, str});
        }
        if (TextUtils.equals(str, this.f24580a)) {
            return this.b;
        }
        return null;
    }

    public void d(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b10188", new Object[]{this, str, jSONArray});
            return;
        }
        this.f24580a = str;
        this.b = jSONArray;
    }

    public n93() {
    }
}
