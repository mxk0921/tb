package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.launcher.step.TMSBasePageStep;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.Iterator;
import java.util.List;
import tb.dyd;
import tb.ges;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hes extends TMSBasePageStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(848297989);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hes(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(hes hesVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/launch/TMSUniPageStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSUniPageStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBasePageStep
    public ITMSPage m() {
        String e;
        ITMSPage iTMSPage;
        cqc cqcVar;
        TabBar e2;
        List<TabBarItem> items;
        TabBar e3;
        cqc cqcVar2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("2b198197", new Object[]{this});
        }
        ges gesVar = ges.INSTANCE;
        String e0 = this.b.e0();
        ckf.f(e0, "mInstance.url");
        ges.a o = gesVar.o(e0);
        if (o == null || (e = o.e()) == null) {
            return null;
        }
        String encodedQuery = ies.g(this.b.e0()).getEncodedQuery();
        bbs bbsVar = this.b;
        ckf.f(bbsVar, "mInstance");
        unl k = TMSInstanceExtKt.k(bbsVar, e);
        if (k == null) {
            return null;
        }
        String c = ges.c(k.k(), encodedQuery, null, null, 12, null);
        bbs bbsVar2 = this.b;
        ckf.f(bbsVar2, "mInstance");
        TabBarItem m = TMSInstanceExtKt.m(bbsVar2, e);
        pzh pzhVar = (pzh) b().g(pzh.class);
        if (m != null) {
            rwd V = this.b.V();
            ckf.f(V, "mInstance.pageFactory");
            JSONObject jSONObject = new JSONObject();
            Boolean bool = Boolean.TRUE;
            jSONObject.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) bool);
            jSONObject.put((JSONObject) ccs.KEY_IS_VIRTUAL_TAB_PAGE, (String) bool);
            xhv xhvVar = xhv.INSTANCE;
            iTMSPage = rwd.a.a(V, "", null, jSONObject, null, 8, null);
            dyd dydVar = (dyd) iTMSPage.getExtension(dyd.class);
            if (dydVar == null) {
                return null;
            }
            if (pzhVar != null) {
                if (!q9s.r0() && (cqcVar2 = (cqc) iTMSPage.getExtension(cqc.class)) != null) {
                    iTMSPage.t(cqcVar2);
                }
                iTMSPage.x(pzhVar);
            }
            mm4 N = iTMSPage.getInstance().N();
            if (!(N == null || (e3 = N.e()) == null)) {
                dydVar.v0(e3);
            }
            mm4 N2 = iTMSPage.getInstance().N();
            if (N2 != null && (e2 = N2.e()) != null && (items = e2.getItems()) != null) {
                Iterator<TabBarItem> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (ckf.b(it.next().getPageId(), e)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            dyd.a.a(dydVar, i, null, 2, null);
        } else {
            rwd V2 = this.b.V();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) ccs.KEY_IS_HOME_PAGE, (String) Boolean.TRUE);
            xhv xhvVar2 = xhv.INSTANCE;
            iTMSPage = V2.b(e, null, c, jSONObject2);
            if (iTMSPage == null) {
                return null;
            }
        }
        if (pzhVar != null) {
            if (!q9s.r0() && (cqcVar = (cqc) iTMSPage.getExtension(cqc.class)) != null) {
                iTMSPage.t(cqcVar);
            }
            iTMSPage.x(pzhVar);
        }
        this.b.W().a(iTMSPage);
        return iTMSPage;
    }
}
