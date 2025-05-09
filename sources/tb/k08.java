package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k08 implements pg3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements og3 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793478);
            t2o.a(993001759);
        }

        @Override // tb.og3
        public void n1(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, o02 o02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("783354d9", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, o02Var});
            }
        }

        @Override // tb.og3
        public void u0(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, o02 o02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52748deb", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, o02Var});
            }
        }
    }

    static {
        t2o.a(815793477);
        t2o.a(993001652);
    }

    @Override // tb.pg3
    public og3 a(o02<?, ?> o02Var, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (og3) ipChange.ipc$dispatch("76b45b9e", new Object[]{this, o02Var, acxVar});
        }
        return new a();
    }
}
