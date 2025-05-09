package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSAssertUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class fes extends e9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(848298039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fes(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(fes fesVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/solution/tab/TMSUniAppRenderFactory");
    }

    @Override // tb.twd
    public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        if (iTMSPage.c().length() == 0 || iTMSPage.getPageParams().e().o()) {
            return new nqs(iTMSPage, ocsVar);
        }
        String j = iTMSPage.getPageParams().e().j();
        if (ckf.b(j, "web")) {
            return new qes(iTMSPage, ocsVar);
        }
        if (!ckf.b(j, "weex")) {
            return new qes(iTMSPage, ocsVar);
        }
        IWeexAdapter iWeexAdapter = (IWeexAdapter) p8s.b(IWeexAdapter.class);
        qcs weexRender = iWeexAdapter == null ? null : iWeexAdapter.getWeexRender(iTMSPage, ocsVar);
        IpChange ipChange2 = TMSAssertUtils.$ipChange;
        return weexRender == null ? new qes(iTMSPage, ocsVar) : weexRender;
    }
}
