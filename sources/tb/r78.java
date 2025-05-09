package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r78 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EDITION_CODE_CHANGED = "editionCodeChanged";
    public static final String LOCATION_CHANGED = "locationChanged";
    public static final String LOCATION_REQUEST_ERROR = "locationRequestError";
    public static final String LOCATION_REQUEST_SUCCESS = "locationRequestSuccess";
    public static final String TRIGGER_REQUEST = "triggerRequest";

    /* renamed from: a  reason: collision with root package name */
    public final List<q1c> f27162a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final r78 f27163a = new r78();

        static {
            t2o.a(456130659);
        }

        public static /* synthetic */ r78 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r78) ipChange.ipc$dispatch("140d74e1", new Object[0]);
            }
            return f27163a;
        }
    }

    static {
        t2o.a(456130658);
    }

    public static r78 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r78) ipChange.ipc$dispatch("f22073fc", new Object[0]);
        }
        return a.a();
    }

    public void a(s78 s78Var, t7l t7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdebfcac", new Object[]{this, s78Var, t7lVar});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f27162a).iterator();
        while (it.hasNext()) {
            q1c q1cVar = (q1c) it.next();
            if (q1cVar != null) {
                q1cVar.a(s78Var, t7lVar);
            }
        }
    }

    public void c(q1c q1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47f8638", new Object[]{this, q1cVar});
        } else if (q1cVar != null) {
            ((CopyOnWriteArrayList) this.f27162a).add(q1cVar);
        }
    }
}
