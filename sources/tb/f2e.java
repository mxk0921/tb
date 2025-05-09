package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface f2e extends sod {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455464);
        }

        public static /* synthetic */ void a(f2e f2eVar, String str, String str2, Map map, String str3, String str4, boolean z, int i, Object obj) {
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c33a723", new Object[]{f2eVar, str, str2, map, str3, str4, new Boolean(z), new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 32) != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                f2eVar.v0(str, str2, map, str3, str4, z2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: click");
            }
        }

        public static /* synthetic */ void b(f2e f2eVar, String str, String str2, String str3, String str4, Map map, int i, boolean z, int i2, Object obj) {
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("642087d5", new Object[]{f2eVar, str, str2, str3, str4, map, new Integer(i), new Boolean(z), new Integer(i2), obj});
            } else if (obj == null) {
                if ((i2 & 64) != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                f2eVar.z1(str, str2, str3, str4, map, i, z2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: custom");
            }
        }

        public static /* synthetic */ void c(f2e f2eVar, String str, String str2, Map map, String str3, String str4, boolean z, int i, Object obj) {
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e22fd22", new Object[]{f2eVar, str, str2, map, str3, str4, new Boolean(z), new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 32) != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                f2eVar.Y0(str, str2, map, str3, str4, z2);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposure");
            }
        }
    }

    Map<String, String> C(String str);

    boolean D(String str, String str2);

    void D0(String str, Map<String, ? extends Object> map, String str2);

    boolean J(String str, Map<String, String> map);

    Map<String, Object> M0();

    boolean P(String str, String str2, boolean z);

    boolean S(String str);

    void Y0(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, boolean z);

    void a1(Map<String, ? extends Object> map);

    void f1(Map<String, ? extends Object> map, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void p(String str);

    void q(String str, Map<String, ? extends Object> map, String str2);

    void q0();

    void q1(String str);

    void v0(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, boolean z);

    Map<String, String> w(String str);

    void z1(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, int i, boolean z);
}
