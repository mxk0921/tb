package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.a;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class krm extends j8j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String A;

    static {
        t2o.a(815792833);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krm(String str, Activity activity, yko ykoVar, acx<?> acxVar, npc npcVar, cnx cnxVar) {
        super(activity, ykoVar, acxVar, npcVar, cnxVar);
        ckf.g(str, q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        this.A = str;
    }

    public static /* synthetic */ Object ipc$super(krm krmVar, String str, Object... objArr) {
        if (str.hashCode() == 523240207) {
            super.A((a) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/performance/perf/PreloadCellRender");
    }

    @Override // tb.j8j, tb.fw
    public void A(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f30030f", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "instance");
        super.A(aVar);
        aVar.addInstanceEnv("tb2021", "true");
    }

    @Override // tb.j8j, tb.fw
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29a249", new Object[]{this});
        }
    }

    @Override // tb.j8j, tb.fw
    public rpc.c H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("5d093b77", new Object[]{this, str});
        }
        e93 f = jjt.INSTANCE.f(this.A);
        if (f != null) {
            return f.a();
        }
        return null;
    }

    @Override // tb.j8j, tb.fw
    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.j8j, tb.fw
    public TemplateBean y(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("9229b6ae", new Object[]{this, muiseBean});
        }
        e93 f = jjt.INSTANCE.f(this.A);
        if (f != null) {
            return f.c();
        }
        return null;
    }
}
