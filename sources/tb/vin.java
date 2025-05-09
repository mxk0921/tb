package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vin extends j4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ay4<gu1, ? extends vin> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<gu1, vin> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public vin a(gu1 gu1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vin) ipChange.ipc$dispatch("83a3905c", new Object[]{this, gu1Var});
            }
            return new vin(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
        }
    }

    static {
        t2o.a(815792663);
    }

    public vin(Activity activity, ude udeVar, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, TemplateBean templateBean, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, templateBean, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(vin vinVar, String str, Object... objArr) {
        if (str.hashCode() == 1268056981) {
            super.bindWithData((MuiseBean) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/RcmdMuiseModWidget");
    }

    @Override // tb.j4p
    public void k3(Map<String, Object> map, MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee8a0d", new Object[]{this, map, muiseBean});
        }
    }

    @Override // tb.j4p, tb.m8j
    /* renamed from: v2 */
    public void bindWithData(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b950395", new Object[]{this, muiseBean});
        } else {
            super.bindWithData(muiseBean);
        }
    }
}
