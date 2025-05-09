package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Integer f16998a;
        public String b;
        public String c;
        public String d;

        static {
            t2o.a(437256352);
        }

        public static /* synthetic */ Integer a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("bffeba48", new Object[]{aVar});
            }
            return aVar.f16998a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e905c760", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c97f1d61", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a9f87362", new Object[]{aVar});
            }
            return aVar.d;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("440f303a", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9996d55", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4d368c70", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a h(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("60b35b97", new Object[]{this, num});
            }
            this.f16998a = num;
            return this;
        }
    }

    static {
        t2o.a(437256351);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808af4f4", new Object[]{str});
        } else {
            b(str, "", "", null);
        }
    }

    public static void b(String str, String str2, String str3, a aVar) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a025b1f0", new Object[]{str, str2, str3, aVar});
            return;
        }
        if (aVar != null) {
            try {
                hashMap = new HashMap(4);
                hashMap.put("widgetId", String.valueOf(a.a(aVar)));
                hashMap.put("typeId", a.b(aVar));
                hashMap.put("channel", a.c(aVar));
                hashMap.put("receiverName", a.d(aVar));
            } catch (Exception e) {
                hgh.d("sendTrack error：" + e.getMessage());
                return;
            }
        } else {
            hashMap = null;
        }
        qvv.a(str, str2, str3, hashMap);
    }
}
