package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class odg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "LiteCreator";

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25315a = tv6.a();

    static {
        t2o.a(511705620);
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (f25315a) {
            a(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else {
            TLog.loge(MODULE_NAME, str, a(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else if (f25315a) {
            a(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else if (f25315a) {
            a(str, objArr);
        }
    }

    public static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddb2a819", new Object[]{str, objArr});
        }
        if (objArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str + ": ");
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    sb.append("{");
                    sb.append(entry.getKey());
                    sb.append(":");
                    sb.append(entry.getValue());
                    sb.append("}");
                }
            } else {
                sb.append(obj);
            }
            if (i < length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
