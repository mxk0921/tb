package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class meq extends MetaChildPageWidget {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meq(Activity activity, ude udeVar, acx<? extends a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
    }

    public static /* synthetic */ Object ipc$super(meq meqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -110087884) {
            return super.R2((String) objArr[0]);
        }
        if (hashCode == 1490502286) {
            return super.T2((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/meta/srp/ui/childpage/SrpChildPageWidget");
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public ay4<gu1, ? extends pwc> R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("f9703134", new Object[]{this, str});
        }
        ckf.g(str, "type");
        if (!ckf.b("sceneHeader", str)) {
            return super.R2(str);
        }
        bsi w2 = w2();
        ckf.e(w2, "null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
        return ((neq) w2).i1();
    }

    @Override // com.taobao.android.meta.structure.childpage.MetaChildPageWidget
    public ay4<gu1, ? extends tce> T2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("58d7428e", new Object[]{this, str});
        }
        ckf.g(str, "type");
        if (!ckf.b("sceneHeader", str)) {
            return super.T2(str);
        }
        bsi w2 = w2();
        ckf.e(w2, "null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
        return ((neq) w2).j1();
    }
}
