package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tt3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = tt3.class.getSimpleName();
    public static final tt3 c = new tt3();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f28944a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final LinkedList<String> f28945a;
        public String b;
        public String c;
        public String d;

        static {
            t2o.a(815792206);
        }

        public b() {
            this.f28945a = new LinkedList<>();
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f28945a.clear();
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public String b() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6ac96f6f", new Object[]{this});
            }
            String str2 = "";
            if (this.f28945a.size() == 0) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.f28945a.iterator();
            String str3 = str2;
            while (it.hasNext()) {
                sb.append(str3);
                sb.append(it.next());
                str3 = ",";
            }
            try {
                str = URLEncoder.encode(this.b, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = this.b;
            }
            try {
                str2 = "q:" + str + ";page_n:" + this.c + ";nid:" + sb.toString() + ";time_stamp:" + this.d;
            } catch (Exception unused2) {
            }
            tt3.a();
            "behavior content:".concat(str2);
            return str2;
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cf90844", new Object[]{this, str, str2});
                return;
            }
            tt3.a();
            StringBuilder sb = new StringBuilder("record click behavior:");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            if (this.f28945a.size() > 10) {
                this.f28945a.poll();
            }
            this.f28945a.offer(str);
            this.d = str2;
        }

        public void d(String str, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53d8b44d", new Object[]{this, str, new Integer(i), new Boolean(z)});
                return;
            }
            tt3.a();
            StringBuilder sb = new StringBuilder("record search behavior:");
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            sb.append(" ");
            sb.append(z);
            if (str == null) {
                str = "";
            }
            this.b = str;
            this.c = String.valueOf(i);
        }
    }

    static {
        t2o.a(815792204);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return b;
    }

    public static tt3 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tt3) ipChange.ipc$dispatch("29926d08", new Object[0]);
        }
        return c;
    }

    public final b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ed3ab97f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        b bVar = new b();
        ((HashMap) this.f28944a).put(str, bVar);
        return bVar;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c0bcc6", new Object[]{this, str});
        }
        b e = e(str);
        if (e == null) {
            return "";
        }
        return e.b();
    }

    public final b e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c0a46b65", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        return (b) ((HashMap) this.f28944a).get(str);
    }

    public void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ce290e", new Object[]{this, str, str2, str3});
            return;
        }
        b e = e(str);
        if (e == null) {
            e = b(str);
        }
        e.c(str2, str3);
    }

    public void g(String str, String str2, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c04497", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
            return;
        }
        b e = e(str);
        if (e == null) {
            e = b(str);
        } else {
            e.a();
        }
        e.d(str2, i, z);
    }
}
