package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.WeakHashMap;
import tb.rgm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vdm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_FINISH = 2;
    public static final int ON_START = 1;
    public static final int ON_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<String, b> f29945a = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements rgm.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rgm.a f29946a;
        public int b;

        static {
            t2o.a(729808984);
            t2o.a(790626530);
        }

        public b(rgm.a aVar) {
            this.b = 0;
            this.f29946a = aVar;
        }

        @Override // tb.rgm.a
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d551eed", new Object[]{this, str, jSONObject});
                return;
            }
            bqa.d("poplayer_lifecycle", "sourceName:", str, " onFinish");
            this.b = 2;
            rgm.a aVar = this.f29946a;
            if (aVar != null) {
                aVar.a(str, jSONObject);
            }
        }

        @Override // tb.rgm.a
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a38bd5c", new Object[]{this, str, jSONObject});
                return;
            }
            bqa.d("poplayer_lifecycle", "sourceName:", str, " onStart");
            this.b = 1;
            rgm.a aVar = this.f29946a;
            if (aVar != null) {
                aVar.b(str, jSONObject);
            }
        }
    }

    static {
        t2o.a(729808982);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd0f2e2c", new Object[]{str})).intValue();
        }
        b bVar = f29945a.get(str);
        if (bVar == null) {
            return 0;
        }
        return bVar.b;
    }

    public static void b(String str, rgm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dcc3ca5", new Object[]{str, aVar});
        } else if (!TextUtils.isEmpty(str)) {
            WeakHashMap<String, b> weakHashMap = f29945a;
            b bVar = weakHashMap.get(str);
            if (bVar == null) {
                bVar = new b(aVar);
                weakHashMap.put(str, bVar);
            }
            rgm.h().q(str, bVar);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d956d746", new Object[]{str});
            return;
        }
        f29945a.remove(str);
        rgm.h().u(str);
    }
}
