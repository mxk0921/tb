package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wav {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, b> f30573a = new HashMap();
    public static final String sDefaultBizCode = "ultron";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(794820651);
        }

        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return z;
        }

        public float b(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
            }
            return f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(794820652);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/utils/UltronSwitch$DefaultSwitch");
        }

        @Override // tb.wav.b
        public boolean a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68ca2184", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            return rh4.b(str, z);
        }

        @Override // tb.wav.b
        public float b(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
            }
            return rh4.a(str, f);
        }
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e45dfa", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return b(str, str2, z, false);
    }

    public static boolean b(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a813a2", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        boolean a2 = c(str).a(str2, z);
        if (z2) {
            iav.h("奥创开关#" + str, str2, "=" + a2);
        }
        return a2;
    }

    public static b c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("671d0629", new Object[]{str});
        }
        b bVar = !TextUtils.isEmpty(str) ? (b) ((HashMap) f30573a).get(str) : null;
        return bVar == null ? (b) ((HashMap) f30573a).get("ultron") : bVar;
    }

    public static float d(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2baedf9a", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        return c(str).b(str2, f);
    }

    public static void e(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e190826f", new Object[]{str, bVar});
            return;
        }
        Map<String, b> map = f30573a;
        if (!map.containsKey(str)) {
            map.put(str, bVar);
        }
    }

    static {
        t2o.a(794820649);
        e("ultron", new c());
    }
}
