package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.a;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j8j extends fw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final acx<?> z;

    static {
        t2o.a(993002143);
    }

    public j8j(Activity activity, yko ykoVar, acx<?> acxVar, npc npcVar, cnx cnxVar) {
        super(activity, ykoVar, npcVar, cnxVar);
        this.z = acxVar;
    }

    public static /* synthetic */ Object ipc$super(j8j j8jVar, String str, Object... objArr) {
        if (str.hashCode() == -1900528980) {
            return new Boolean(super.t());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/MuiseDatasourceRenderer");
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
        a0(this.z.e().getTrackingPageName());
        String c = this.z.d().c();
        if (!(c != null || (intent = v().getIntent()) == null || intent.getData() == null)) {
            c = intent.getData().toString();
        }
        U(c);
    }

    @Override // tb.fw
    public rpc.c H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        return this.z.e().getTemplateFile(str);
    }

    @Override // tb.fw
    public TemplateBean y(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("9229b6ae", new Object[]{this, muiseBean});
        }
        return this.z.e().getTemplate(muiseBean.type);
    }

    @Override // tb.fw
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        if (!super.t()) {
            return false;
        }
        if (this.z != null) {
            return true;
        }
        s().l().d("NxMuiseDatasourceRenderer", "model is null");
        return false;
    }
}
