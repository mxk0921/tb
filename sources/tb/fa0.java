package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.a;
import com.taobao.search.searchdoor.SearchDoorActivity;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fa0 extends fw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final vnd z;

    static {
        t2o.a(815793211);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(Activity activity, yko ykoVar, npc npcVar, cnx cnxVar, vnd vndVar) {
        super(activity, ykoVar, npcVar, cnxVar);
        ckf.g(vndVar, "searchDoorHelper");
        this.z = vndVar;
    }

    public static /* synthetic */ Object ipc$super(fa0 fa0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/event/ActivateMuiseRender");
    }

    @Override // tb.fw
    public void A(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
        }
    }

    @Override // tb.fw
    public void B(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b75bfe", new Object[]{this, aVar});
        }
    }

    @Override // tb.fw
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29a249", new Object[]{this});
            return;
        }
        Intent intent = v().getIntent();
        if (!(intent == null || intent.getData() == null)) {
            U(intent.getData().toString());
        }
        a0(SearchDoorActivity.PAGE_NAME);
    }

    @Override // tb.fw
    public rpc.c H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        return this.z.t1(str);
    }

    @Override // tb.fw
    public TemplateBean y(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("9229b6ae", new Object[]{this, muiseBean});
        }
        vnd vndVar = this.z;
        ckf.d(muiseBean);
        return vndVar.o1(muiseBean.type);
    }
}
