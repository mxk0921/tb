package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qht extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLVSYNCTASK = -5714497328744620300L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355391);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public qht build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qht) ipChange.ipc$dispatch("c09e9f87", new Object[]{this, obj});
            }
            return new qht();
        }
    }

    static {
        t2o.a(806355390);
    }

    public static /* synthetic */ Object ipc$super(qht qhtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TblvSyncTaskAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (u8Var != null) {
            u8Var.callback("onComplete", new f8());
        }
        return new d8();
    }
}
