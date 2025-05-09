package tb;

import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceResponse;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c4x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516266);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eef4b06", new Object[0]);
        }
        return "application/vnd.weex.v21,application/vnd.weex.v20";
    }

    public static HashMap<String, String> b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cd611eec", new Object[]{bArr});
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i = wrap.getInt(16);
            if (i > 0) {
                wrap.position(i + 29);
                HashMap<String, String> hashMap = new HashMap<>(3);
                short s = wrap.getShort();
                while (true) {
                    short s2 = (short) (s - 1);
                    if (s <= 0) {
                        return hashMap;
                    }
                    short s3 = wrap.getShort();
                    String str = new String(bArr, wrap.position(), (int) s3);
                    wrap.position(wrap.position() + s3);
                    short s4 = wrap.getShort();
                    String str2 = new String(bArr, wrap.position(), (int) s4);
                    wrap.position(wrap.position() + s4);
                    hashMap.put(str, str2);
                    s = s2;
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return new HashMap<>();
    }

    public static String c(String str) {
        byte[] data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b44535", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(HttpRequest.HEADER_ACCEPT, a());
            ResourceResponse h = yox.h(new y8o(str, hashMap));
            if (h == null || (data = h.getData()) == null) {
                return "";
            }
            return b(data).get(pg1.ATOM_stack);
        } catch (Throwable th) {
            if (dwh.r()) {
                dwh.f("WeexBinaryUtil", "get getResourceForUrl:" + th.getMessage());
            }
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7683f287", new Object[0]);
        }
        return "weex21,weex20";
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137898b7", new Object[]{str})).booleanValue();
        }
        if ("application/vnd.weex.v21".equals(str) || "application/vnd.weex.v20".equals(str)) {
            return true;
        }
        return false;
    }
}
