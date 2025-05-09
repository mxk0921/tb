package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Float> f23397a = new ConcurrentHashMap();

    public static void a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c637147", new Object[]{str, new Float(f)});
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("pageName must not null");
        } else if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("percent must in [0,1]");
        }
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2553a59", new Object[]{str})).floatValue();
        }
        return c(str, null);
    }

    public static float c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ee1fbe3", new Object[]{str, str2})).floatValue();
        }
        if (str2 != null) {
            str = str + "_" + str2;
        }
        Float f = (Float) ((ConcurrentHashMap) f23397a).get(str);
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    public static void d(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab676aeb", new Object[]{str, new Float(f)});
        } else {
            e(str, null, f);
        }
    }

    public static void e(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04b25a1", new Object[]{str, str2, new Float(f)});
            return;
        }
        a(str, f);
        if (str2 != null) {
            str = str + "_" + str2;
        }
        ((ConcurrentHashMap) f23397a).put(str, Float.valueOf(f));
    }
}
