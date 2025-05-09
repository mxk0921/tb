package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class l9 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long REFRESH_COMPONENT_KEY = 2387479490361711282L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(336592944);
            t2o.a(336592930);
        }

        @Override // tb.w8
        public m8 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8) ipChange.ipc$dispatch("e57df123", new Object[]{this, obj});
            }
            return new l9();
        }
    }

    static {
        t2o.a(336592943);
    }

    public static /* synthetic */ Object ipc$super(l9 l9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/AKRefreshComponentAbility");
    }

    public final b8 i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("52a08036", new Object[]{this, str, new Boolean(z)});
        }
        Log.e(l9.class.getSimpleName(), str);
        return new b8(new a8(30000, str), z);
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null) {
            return i("params is null", true);
        }
        if (k8Var == null) {
            return i("abilityRuntimeContext is null", true);
        }
        x8 c = k8Var.c();
        if (c == null) {
            return i("abilityRuntimeContext.getContainer() is null", true);
        }
        Object a2 = n8Var.a("data");
        if (!(a2 instanceof JSONObject)) {
            return i("params.data is not JSONObject", true);
        }
        try {
            if (c.b(k8Var, (JSONObject) a2)) {
                return new f8();
            }
            return i("iContainer.refresh result=false", true);
        } catch (Throwable th) {
            return i("iContainer.refresh error=" + th.getMessage(), true);
        }
    }
}
