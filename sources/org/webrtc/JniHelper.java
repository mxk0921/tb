package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class JniHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313779);
    }

    public static Object getKey(Map.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("51653eeb", new Object[]{entry});
        }
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bd056648", new Object[]{str});
        }
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    public static Object getStringClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3171977a", new Object[0]);
        }
        return String.class;
    }

    public static Object getValue(Map.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("db9650fd", new Object[]{entry});
        }
        return entry.getValue();
    }
}
