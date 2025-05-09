package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.a;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o8j extends fw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final acx<? extends o02<? extends BaseSearchResult, ?>> A;
    public final TemplateBean z;

    static {
        t2o.a(993002151);
    }

    public o8j(Activity activity, yko ykoVar, npc npcVar, cnx cnxVar, TemplateBean templateBean, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        super(activity, ykoVar, npcVar, cnxVar);
        this.z = templateBean;
        this.A = acxVar;
    }

    public static /* synthetic */ Object ipc$super(o8j o8jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseSingleTemplateRender");
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
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29a249", new Object[]{this});
            return;
        }
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = this.A;
        if (acxVar != null) {
            a0(acxVar.e().getTrackingPageName());
            String c = this.A.d().c();
            if (!(c != null || (intent = v().getIntent()) == null || intent.getData() == null)) {
                c = intent.getData().toString();
            }
            U(c);
        }
    }

    @Override // tb.fw
    public rpc.c H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = this.A;
        if (acxVar == null) {
            return null;
        }
        return acxVar.e().getTemplateFile(str);
    }

    @Override // tb.fw
    public TemplateBean y(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("9229b6ae", new Object[]{this, muiseBean});
        }
        return this.z;
    }
}
