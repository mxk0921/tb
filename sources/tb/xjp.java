package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xjp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, b> f31430a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        boolean a(ma4 ma4Var);

        void cancel(boolean z);

        String getType();

        void onEvent(ma4 ma4Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xjp f31431a = new xjp();

        static {
            t2o.a(667942960);
        }

        public static /* synthetic */ xjp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xjp) ipChange.ipc$dispatch("313eadfe", new Object[0]);
            }
            return f31431a;
        }
    }

    static {
        t2o.a(667942957);
    }

    public static xjp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjp) ipChange.ipc$dispatch("93a5b6d8", new Object[0]);
        }
        return c.a();
    }

    public void a(mi3 mi3Var) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716129b5", new Object[]{this, mi3Var});
        } else if (mi3Var != null && !this.f31430a.isEmpty() && (bVar = this.f31430a.get(c(mi3Var))) != null) {
            bVar.cancel(true);
        }
    }

    public final String c(ma4 ma4Var) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a457b8", new Object[]{this, ma4Var});
        }
        if ((ma4Var instanceof mi3) && kip.k().indexOf(ma4Var.b()) >= 0) {
            return ma4Var.b();
        }
        String h = kip.h(ma4Var.b());
        TBShareContent a2 = ma4Var.a().a();
        String str = "";
        if (TextUtils.isEmpty(h)) {
            StringBuilder sb = new StringBuilder();
            if (a2 != null) {
                str = a2.businessId;
            }
            sb.append(str);
            sb.append("_");
            sb.append(ma4Var.b());
            return sb.toString();
        } else if (!TextUtils.equals("saveVideo", ma4Var.b())) {
            return h;
        } else {
            if (a2 != null && (map = a2.extraParams) != null && TextUtils.equals("true", map.get("isMarvelScheme"))) {
                return h;
            }
            StringBuilder sb2 = new StringBuilder();
            if (a2 != null) {
                str = a2.businessId;
            }
            sb2.append(str);
            sb2.append("_");
            sb2.append(ma4Var.b());
            return sb2.toString();
        }
    }

    public boolean d(ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d988f0", new Object[]{this, ma4Var})).booleanValue();
        }
        b bVar = this.f31430a.get(c(ma4Var));
        if (bVar != null) {
            return bVar.a(ma4Var);
        }
        return true;
    }

    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f3623", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.f31430a.put(bVar.getType(), bVar);
        }
    }

    public void onEvent(ma4 ma4Var) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611b4fe0", new Object[]{this, ma4Var});
        } else if (ma4Var != null && !this.f31430a.isEmpty() && (bVar = this.f31430a.get(c(ma4Var))) != null) {
            bVar.onEvent(ma4Var);
        }
    }

    public xjp() {
        this.f31430a = new ConcurrentHashMap<>();
    }
}
