package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class atj extends mr implements gz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_BACK = "cb";
    public static final String CALL_BACK_DISPATCH = "cbDispatch";
    public static final String REQUEST_PROCESS = "reqProcess";
    public static final String REQUEST_SEND = "reqSend";
    public static final String REQUEST_START = "reqStart";
    public static final String RESPONSE_PROCESS = "resProcess";
    public static final String RESPONSE_RECEIVE = "resReceive";
    public static final String SERVER_RT = "serverRT";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final a DEFAULT = new a();

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f15991a;
        public final List<String> b;

        public a() {
            ArrayList arrayList = new ArrayList(4);
            this.f15991a = arrayList;
            ArrayList arrayList2 = new ArrayList(2);
            this.b = arrayList2;
            arrayList.add("falcoId");
            arrayList.add("envFalcoId");
            arrayList.add("loadFalcoId");
            arrayList.add("apiName");
            arrayList2.add("originalUrl");
            arrayList2.add("url");
        }
    }

    public atj(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list, "MobileService");
        gz8.LAUNCH_TYPE.a(this, Integer.valueOf(SceneIdentifier.getStartType()));
    }

    public static /* synthetic */ Object ipc$super(atj atjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/NetworkAbilitySpanImpl");
    }

    @Override // tb.gz8
    public void W(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aa5f", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(RESPONSE_RECEIVE).c(l);
    }

    @Override // tb.gz8
    public void Y(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e29dd25", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(CALL_BACK_DISPATCH).b(l);
    }

    @Override // tb.gz8
    public void b0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78344e6", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(RESPONSE_RECEIVE).b(l);
    }

    @Override // tb.pz8
    public List<String> f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ef41017", new Object[]{this});
        }
        return a.DEFAULT.f15991a;
    }

    @Override // tb.gz8
    public void i0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea23563", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(CALL_BACK).b(l);
    }

    @Override // tb.gz8
    public void k0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37186eda", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(RESPONSE_PROCESS).b(l);
    }

    @Override // tb.gz8
    public void l(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51aa59", new Object[]{this, l});
        } else {
            s1(REQUEST_START).b(l);
        }
    }

    @Override // tb.gz8
    public void m0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c681961c", new Object[]{this, l});
        } else {
            s1(CALL_BACK).c(l);
        }
    }

    @Override // tb.gz8
    public void o0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd739528", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(REQUEST_PROCESS).b(l);
    }

    @Override // tb.gz8
    public void s(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9b4178", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            long H0 = cck.H0();
            rz8 s1 = s1("serverRT");
            s1.b(Long.valueOf(H0 - j));
            s1.c(Long.valueOf(H0));
        }
    }

    @Override // tb.pz8
    public List<String> w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f1f8722d", new Object[]{this});
        }
        return a.DEFAULT.b;
    }

    @Override // tb.gz8
    public void x(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6421c331", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(REQUEST_SEND).b(l);
    }
}
