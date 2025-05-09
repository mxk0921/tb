package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xe2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f31328a = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        String a(int i);

        int b(String str);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1eb64d7", new Object[]{str})).intValue();
        }
        return f31328a.b(str);
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1f37d7", new Object[]{new Integer(i)});
        }
        return f31328a.a(i);
    }

    public static void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456e83d5", new Object[]{bVar});
        } else if (bVar == null) {
            TLog.loge("BizUtil", "setBizTypeIndexConverter", "converter is null");
        } else {
            f31328a = bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xe2.b
        public String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e1f37d7", new Object[]{this, new Integer(i)});
            }
            if (i == 0) {
                return "homePage";
            }
            if (i == 1) {
                return "tab2";
            }
            if (i == 2) {
                return "message";
            }
            if (i == 3) {
                return "cart";
            }
            if (i == 4) {
                return "mytaobao";
            }
            return null;
        }

        @Override // tb.xe2.b
        public int b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1eb64d7", new Object[]{this, str})).intValue();
            }
            if ("homePage".equals(str)) {
                return 0;
            }
            if ("message".equals(str)) {
                return 2;
            }
            if ("mytaobao".equals(str)) {
                return 4;
            }
            if ("cart".equals(str)) {
                return 3;
            }
            return "tab2".equals(str) ? 1 : -1;
        }
    }
}
