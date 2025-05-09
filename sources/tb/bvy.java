package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.revisitedu.RevisitEduDialog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bvy extends s7<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final RevisitEduDialog S;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963221);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963220);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvy(jmi jmiVar, vv1 vv1Var, fll fllVar, RevisitEduDialog revisitEduDialog) {
        super(jmiVar, vv1Var, fllVar);
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(fllVar, "pageBaseInfoManager");
        ckf.g(revisitEduDialog, "revisitEduDialog");
        this.S = revisitEduDialog;
    }

    public static /* synthetic */ Object ipc$super(bvy bvyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/pageadapter/guangguang/turbo/component/revisitedu/RevisitEduDialogGGPageAdapter");
    }

    @Override // tb.u7
    public Object F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9136b232", new Object[]{this});
        }
        return null;
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0e4b084", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "RevisitEduDialogGGPageAdapter", "处理返回，tabId=".concat(str));
        return this.S.f(str);
    }
}
