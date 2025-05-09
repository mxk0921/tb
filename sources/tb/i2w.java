package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321717);
    }

    public static float b(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d175e2a2", new Object[]{obj, new Float(f)})).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.parseFloat((String) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f;
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40eb4e63", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Float.parseFloat((String) obj) > 0.0f;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).floatValue() > 0.0f;
        } else {
            if (obj instanceof List) {
                return ((List) obj).size() > 0;
            }
            if (obj instanceof Map) {
                return ((Map) obj).size() > 0;
            }
        }
        return z;
    }
}
