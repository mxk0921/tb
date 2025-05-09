package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class v7<TabInfo> extends w7<TabInfo> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(689963248);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(jmi jmiVar, vv1 vv1Var, yps ypsVar) {
        super(jmiVar, vv1Var, ypsVar);
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(ypsVar, "tabBaseInfoManager");
    }

    public static /* synthetic */ Object ipc$super(v7 v7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/AInteractShortVideoTabAdapter");
    }

    @Override // tb.w7
    public boolean L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d61332", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return ckf.b(G().h(str), "video");
    }
}
