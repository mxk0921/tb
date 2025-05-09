package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e81 implements chb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e81 b = new e81();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f18348a = new ConcurrentHashMap();

    public static e81 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e81) ipChange.ipc$dispatch("7f9bf799", new Object[0]);
        }
        return b;
    }

    public final <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b1ed0ca6", new Object[]{this, str});
        }
        return (T) ((ConcurrentHashMap) this.f18348a).get(str);
    }

    public void c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{this, str, new Boolean(z)});
        } else {
            h(str, Boolean.valueOf(z));
        }
    }

    @Override // tb.chb
    public boolean containsKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
        }
        return ((ConcurrentHashMap) this.f18348a).containsKey(str);
    }

    public void d(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1a2022", new Object[]{this, str, new Float(f)});
        } else {
            h(str, Float.valueOf(f));
        }
    }

    public void e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{this, str, new Integer(i)});
        } else {
            h(str, Integer.valueOf(i));
        }
    }

    public void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ffffc8", new Object[]{this, str, new Long(j)});
        } else {
            h(str, Long.valueOf(j));
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
        } else {
            h(str, str2);
        }
    }

    @Override // tb.chb
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = (Boolean) a(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @Override // tb.chb
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        Float f2 = (Float) a(str);
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // tb.chb
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Integer num = (Integer) a(str);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    @Override // tb.chb
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        Long l = (Long) a(str);
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    @Override // tb.chb
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        String str3 = (String) a(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final void h(String str, Object obj) {
        Object put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84ebdcf", new Object[]{this, str, obj});
        } else if (str != null && obj != null && (put = ((ConcurrentHashMap) this.f18348a).put(str, obj)) != null && put.getClass() != obj.getClass()) {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = put.getClass();
            throw new IllegalArgumentException("new value type:" + cls + " != old value type:" + cls2);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (str != null) {
            ((ConcurrentHashMap) this.f18348a).remove(str);
        }
    }
}
