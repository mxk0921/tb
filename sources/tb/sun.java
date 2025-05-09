package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sun extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFRESHLISTBYORDERIDS = "5489520136482826103";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031762);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public sun build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sun) ipChange.ipc$dispatch("1b17c640", new Object[]{this, obj});
            }
            return new sun();
        }
    }

    static {
        t2o.a(713031761);
    }

    public static /* synthetic */ Object ipc$super(sun sunVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/RefreshListByOrderIdsAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject h = n8Var.h();
        if (!(h == null || h.getString("orderIdList") == null)) {
            arrayList.addAll(Arrays.asList(h.getString("orderIdList").split(",")));
        }
        gb0.a(k8Var.d(), arrayList);
        return new f8();
    }
}
