package com.taobao.themis.uniapp.solution.tab;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.uniapp.solution.TMSBaseUniAppSolution;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.fes;
import tb.t2o;
import tb.twd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/themis/uniapp/solution/tab/TMSUniAppTabSolution;", "Lcom/taobao/themis/uniapp/solution/TMSBaseUniAppSolution;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "Ltb/twd;", "createRenderFactory", "()Ltb/twd;", "themis_uniapp_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSUniAppTabSolution extends TMSBaseUniAppSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(848298040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSUniAppTabSolution(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(TMSUniAppTabSolution tMSUniAppTabSolution, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/tab/TMSUniAppTabSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new fes(this.mInstance);
    }
}
