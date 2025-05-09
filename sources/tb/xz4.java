package tb;

import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xz4 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CUSTOMAPM = -7380526567711240510L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public xz4 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xz4) ipChange.ipc$dispatch("21d0fb4b", new Object[]{this, obj});
            }
            return new xz4();
        }
    }

    public static /* synthetic */ Object ipc$super(xz4 xz4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/CustomApmAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        try {
            boolean z = k8Var.d() instanceof FragmentActivity;
            return new f8();
        } catch (Exception e) {
            y7t.a("CustomApmAbility", Log.getStackTraceString(e));
            return new b8(new a8(-2000, "CustomApmAbility : error info = " + e.getMessage()));
        }
    }
}
