package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class xvj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589300065);
    }

    public static boolean a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95ab544", new Object[]{map})).booleanValue();
        }
        if ("gzip".equalsIgnoreCase(HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpConstant.CONTENT_ENCODING))) {
            return true;
        }
        return false;
    }

    public static void b(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d37bb", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ee1a98", new Object[]{str})).booleanValue();
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return true;
        }
        return false;
    }
}
