package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.pop.model.pop.PopData;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ncm extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DELETEHOSTCARD = -8809784351616054887L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782588);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public ncm build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ncm) ipChange.ipc$dispatch("1e5a5b2f", new Object[]{this, obj});
            }
            return new ncm();
        }
    }

    static {
        t2o.a(491782587);
    }

    public static /* synthetic */ Object ipc$super(ncm ncmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/dx/event/PopDeleteHostCardAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        bbd k;
        List<PopSectionModel> sections;
        PopSectionModel popSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return null;
        }
        e3b g = tcm.g(p);
        IPopData f = tcm.f(p);
        if (g == null || !(f instanceof PopData) || (k = g.k()) == null || (sections = ((PopData) f).getSections()) == null || sections.isEmpty() || (popSectionModel = sections.get(0)) == null) {
            return null;
        }
        String string = popSectionModel.getExt().getString("sectionBizCode");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        k.i(string);
        return new f8();
    }
}
