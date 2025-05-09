package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, JumpAbility> f28337a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final sxf f28338a = new sxf();

        static {
            t2o.a(578814082);
        }

        public static /* synthetic */ sxf a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sxf) ipChange.ipc$dispatch("f0b8ed7d", new Object[0]);
            }
            return f28338a;
        }
    }

    static {
        t2o.a(578814080);
    }

    public static sxf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxf) ipChange.ipc$dispatch("db32ffe3", new Object[0]);
        }
        return b.a();
    }

    public JumpAbility a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JumpAbility) ipChange.ipc$dispatch("e23cc19c", new Object[]{this, str});
        }
        return (JumpAbility) ((HashMap) this.f28337a).get(str);
    }

    public void c(JumpAbility jumpAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c36d9", new Object[]{this, jumpAbility});
        } else if (jumpAbility != null) {
            ((HashMap) this.f28337a).put(jumpAbility.b(), jumpAbility);
        }
    }

    public sxf() {
        this.f28337a = new HashMap();
    }
}
