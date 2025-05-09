package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ifp extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AB_DATA_GET = "key_ab_data_get";
    public static final String KEY_AB_INFO = "rateListAbInfo";
    public static final String KEY_NEW_RATE_LIST = "key_new_rate_list_v2";
    public static final String KEY_SHOW_IMPR_NEW_ITEM = "key_show_impr_new_item";
    public static final String KEY_TAB_MERGE_IMPR = "key_tab_merge_impr";
    public static final long SETRATELISTABINFO = -9105960424189658700L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public ifp build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ifp) ipChange.ipc$dispatch("1a8dc80d", new Object[]{this, obj});
            }
            return new ifp();
        }
    }

    public static /* synthetic */ Object ipc$super(ifp ifpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/SetRateListAbInfoAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new f8();
        }
        String i = n8Var.i("showImprNewItem");
        String i2 = n8Var.i("tabMergeImpr");
        String i3 = n8Var.i("newRateListV2");
        JSONObject g = n8Var.g(KEY_AB_INFO);
        fno.l(KEY_AB_DATA_GET, true);
        fno.l(KEY_SHOW_IMPR_NEW_ITEM, krq.b(i, false));
        fno.l(KEY_TAB_MERGE_IMPR, krq.b(i2, false));
        fno.l(KEY_NEW_RATE_LIST, krq.b(i3, false));
        if (g != null && g.size() > 0) {
            fno.p(KEY_AB_INFO, g.toJSONString());
        }
        return new f8();
    }
}
