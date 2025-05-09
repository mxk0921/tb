package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class u7<PageInfo> extends wx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PageInfo b;
    public final jmi c;
    public final fll d;

    static {
        t2o.a(689963211);
    }

    public u7(jmi jmiVar, vv1 vv1Var, fll fllVar) {
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(fllVar, "pageBaseInfoManager");
        this.c = jmiVar;
        this.d = fllVar;
    }

    public static /* synthetic */ Object ipc$super(u7 u7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -706673279) {
            super.v();
            return null;
        } else if (hashCode == 1350033330) {
            super.w();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/pageadapter/AInteractPageAdapter");
        }
    }

    public abstract PageInfo F();

    public final jmi G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmi) ipChange.ipc$dispatch("736529cb", new Object[]{this});
        }
        return this.c;
    }

    public final fll H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fll) ipChange.ipc$dispatch("1559929a", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.wx1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
            return;
        }
        super.v();
        this.b = F();
    }

    @Override // tb.wx1
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
        } else {
            super.w();
        }
    }
}
