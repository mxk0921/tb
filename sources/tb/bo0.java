package tb;

import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bo0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16502a;
    public final AURAPluginContainerNodeModel b;
    public final IAURAPluginCenter[] c;
    public final Map<String, String> d;
    public final Map<String, String> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16503a;
        public IAURAPluginCenter[] b;
        public AURAPluginContainerNodeModel c;

        static {
            t2o.a(301990093);
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("62bff58a", new Object[]{aVar});
            }
            return aVar.f16503a;
        }

        public static /* synthetic */ IAURAPluginCenter[] e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAURAPluginCenter[]) ipChange.ipc$dispatch("6373522", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ AURAPluginContainerNodeModel f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("8078e11a", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ AURANextRPCEndpoint g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURANextRPCEndpoint) ipChange.ipc$dispatch("3edc8200", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ AURANextRPCEndpoint h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURANextRPCEndpoint) ipChange.ipc$dispatch("d2fb921f", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ AURANextRPCEndpoint i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURANextRPCEndpoint) ipChange.ipc$dispatch("671aa23e", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ Map j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("38bbcd91", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ Map k(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("19352392", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("86a81d54", new Object[]{this, str});
            }
            this.f16503a = str;
            return this;
        }

        public a b(IAURAPluginCenter[] iAURAPluginCenterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9cca472c", new Object[]{this, iAURAPluginCenterArr});
            }
            this.b = iAURAPluginCenterArr;
            return this;
        }

        public a c(AURAPluginContainerNodeModel aURAPluginContainerNodeModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("90b100c6", new Object[]{this, aURAPluginContainerNodeModel});
            }
            this.c = aURAPluginContainerNodeModel;
            return this;
        }

        public bo0 l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bo0) ipChange.ipc$dispatch("8df3ba17", new Object[]{this});
            }
            if (this.c != null || this.f16503a != null) {
                return new bo0(this);
            }
            throw new IllegalArgumentException("AURAConfigName and AURAPluginContainerNodeModel can not both NULL");
        }
    }

    static {
        t2o.a(301990092);
    }

    public bo0(a aVar) {
        this.f16502a = a.d(aVar);
        this.c = a.e(aVar);
        this.b = a.f(aVar);
        a.g(aVar);
        a.h(aVar);
        a.i(aVar);
        this.d = a.j(aVar);
        this.e = a.k(aVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be9b2b33", new Object[]{this});
        }
        return this.f16502a;
    }

    public IAURAPluginCenter[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("61aa0fd3", new Object[]{this});
        }
        return this.c;
    }

    public AURAPluginContainerNodeModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("ece2717b", new Object[]{this});
        }
        return this.b;
    }
}
