package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oy6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f25743a;
    public final Map<String, ?> b;

    public oy6(int i, Map<String, ?> map) {
        this.f25743a = i;
        this.b = map;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.containsKey(str);
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54aec8af", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        Object obj = this.b.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public <T> T c(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2bfa5bb7", new Object[]{this, str, t});
        }
        if (TextUtils.isEmpty(str)) {
            return t;
        }
        return (T) this.b.get(str);
    }

    public Map<String, ?> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("22d2f9aa", new Object[]{this});
        }
        return new HashMap(this.b);
    }

    public float e(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a650495d", new Object[]{this, str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        Object obj = this.b.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return f;
    }

    public int f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83ac6c30", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        Object obj = this.b.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i;
    }

    public long g(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("486155bd", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        Object obj = this.b.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return j;
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d21695f0", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23373fb8", new Object[]{this})).intValue();
        }
        return this.f25743a;
    }
}
