package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<meb> f19198a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fd0 f19199a = new fd0();

        static {
            t2o.a(1021313039);
        }

        public static /* synthetic */ fd0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fd0) ipChange.ipc$dispatch("aa7c08d1", new Object[0]);
            }
            return f19199a;
        }
    }

    static {
        t2o.a(1021313037);
    }

    public static fd0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fd0) ipChange.ipc$dispatch("c62890b5", new Object[0]);
        }
        return b.a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a07cb228", new Object[]{this, str});
        }
        Iterator it = ((ArrayList) this.f19198a).iterator();
        String str2 = str;
        while (it.hasNext()) {
            try {
                str2 = ((meb) it.next()).a(str2);
            } catch (Exception e) {
                UserTrackLogs.trackExceptionLog(e);
            }
        }
        i4g.a("handler_url", "original_uri=" + str, "new_url=" + str2);
        return str2;
    }

    public fd0() {
        ArrayList arrayList = new ArrayList();
        this.f19198a = arrayList;
        arrayList.add(new iat());
        arrayList.add(new fu3());
    }
}
