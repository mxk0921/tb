package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f16603a;

    static {
        try {
            IpChange ipChange = AdapterForTLog.$ipChange;
            f16603a = true;
        } catch (ClassNotFoundException e) {
            f16603a = false;
            e.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{str, str2, str3});
        } else if (c()) {
            AdapterForTLog.loge("Preload_Core", str + "|" + str2 + "|" + str3);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1849364e", new Object[]{str, str2, str3});
        } else if (c()) {
            AdapterForTLog.loge("Preload_Core", str + "|" + str2 + "|" + str3);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7a91ed", new Object[0])).booleanValue();
        }
        return f16603a;
    }
}
