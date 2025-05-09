package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iue implements ifc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809286);
        t2o.a(486539310);
    }

    @Override // tb.ifc
    public boolean getBooleanValue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return f4b.b(str, z);
    }

    @Override // tb.ifc
    public float getFloatValue(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(getString(str, f + ""));
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // tb.ifc
    public int getIntValue(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return f4b.i(str, i);
    }

    @Override // tb.ifc
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return f4b.h(str, str2);
    }
}
