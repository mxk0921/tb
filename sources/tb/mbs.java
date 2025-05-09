package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mbs extends b9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(850395188);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbs(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(mbs mbsVar, String str, Object... objArr) {
        if (str.hashCode() == -20063730) {
            super.g((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/solution/TMSLegacyWebPageFactory");
    }

    @Override // tb.b9s
    public void g(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecdda0e", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.g(iTMSPage);
        iTMSPage.x(new mzw(iTMSPage));
    }
}
