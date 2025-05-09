package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class a83 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_BABA_FARM = "ms_tb-webb-widget-cloud_farm-feeds-search-result";
    public static final String CARD_FARM_DATA_KEY = "farmData";
    public static final String CARD_HB_DATA_KEY = "hbData";
    public static final String CARD_HONG_BAO = "ms_tb-webb-widget_hbqd-search-card";
    public static final String CARD_I18_LOCAL_M1 = "ms_tmall-ovs-rax_tmg_search_item_local_m1";
    public static final String CARD_I18_M1 = "ms_tmall-ovs-rax_tmg_search_item_all_m1";
    public static final String CARD_LOCAL_M1_DATA_KEY = "localM1Data";
    public static final String CARD_M3 = "ms_tb-webb-widget_tbs_widget_m3";
    public static final String CARD_M3_DATA_KEY = "m3Data";
    public static final String CARD_NEW_M3 = "ms_tb-muise-component-cloud_new_m3_tbs_widget_m3";
    public static final String CARD_TAO_FACTORY = "ms_tgcmod_search-good-card";
    public static final String CARD_TGC_DATA_KEY = "tgcData";
    public static final String CARD_TJB = "ms_tb-webb-widget-cloud_tbs_widget_m3_tjb";
    public static final String CARD_TJB_DATA_KEY = "tjbData";
    public static final String CARD_TMGJ = "ms_tm-global_tbs_widget_m1_tmall_global";
    public static final String CARD_TM_DATA_KEY = "tmgjData";
    public static final String ELDER_M3 = "ms_tb-webb-widget_elder_tbs_item_widget";
    public static final String KEY_MAIN_SEARCH_CARD_TYPE = "mainSearchCardType";
    public static final String NEW_CARD_M3_DATA_KEY = "newM3Data";
    public static final String TOP_BAR_CHANNEL = "ms_tb-webb-widget_search_weexv2_topbar_sort";
    public static final String TOP_BAR_CHANNEL_DATA_KEY = "topBarChannelData";
    public static final String TOP_BAR_DATA_KEY = "topBarData";
    public static final String TOP_BAR_DEFAULT = "ms_tb-webb-widget-cloud_search_new_weexv2_topbar_sort";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f15589a;
    public static final HashSet<String> c;
    public static final a83 INSTANCE = new a83();
    public static final HashMap<String, String> b = new HashMap<>();

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e65dbe4f", new Object[]{this, str});
        }
        ckf.g(str, "channelSrp");
        boolean n = Localization.n();
        boolean p = Localization.p();
        if (n) {
            String str2 = f15589a.get(str);
            if (!TextUtils.isEmpty(str2)) {
                ckf.d(str2);
                return str2;
            } else if (cvr.INSTANCE.f()) {
                return ELDER_M3;
            } else {
                String d = eno.d(Globals.getApplication(), KEY_MAIN_SEARCH_CARD_TYPE, CARD_M3);
                ckf.f(d, "getString(...)");
                return d;
            }
        } else if (p) {
            return CARD_I18_M1;
        } else {
            return CARD_I18_LOCAL_M1;
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b4f410", new Object[]{this})).intValue();
        }
        return 6;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c02b0fa1", new Object[]{this, str});
        }
        ckf.g(str, "channelSrp");
        if (!Localization.n()) {
            return "ms_tmall-ovs-rax_search_weexv2_topbar_sort";
        }
        String str2 = b.get(str);
        if (!TextUtils.isEmpty(str2)) {
            ckf.d(str2);
            return str2;
        } else if (TextUtils.isEmpty(str)) {
            return TOP_BAR_DEFAULT;
        } else {
            return TOP_BAR_CHANNEL;
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8447e1f5", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "channelSrp");
        return !c.contains(str);
    }

    static {
        t2o.a(815792819);
        HashMap<String, String> hashMap = new HashMap<>();
        f15589a = hashMap;
        HashSet<String> hashSet = new HashSet<>();
        c = hashSet;
        hashMap.put("hongbaosrp", CARD_HONG_BAO);
        hashMap.put("taojinbi", CARD_TJB);
        hashMap.put("taojinbi_md", CARD_TJB);
        hashMap.put("babanongchang_shouye", CARD_BABA_FARM);
        hashMap.put("babanongchang_chm", CARD_BABA_FARM);
        hashMap.put("babanongchang_zghc", CARD_BABA_FARM);
        hashMap.put("temaizhiying", CARD_TAO_FACTORY);
        hashMap.put("tgc_mj", CARD_TAO_FACTORY);
        hashMap.put("tmgj_wangzhan", CARD_TMGJ);
        hashMap.put("haiwaizhigou", CARD_TMGJ);
        hashMap.put("haiwaizg", CARD_TMGJ);
        hashMap.put("tmgj_xiaojiuguan", CARD_TMGJ);
        hashMap.put("tmgj_meijia", CARD_TMGJ);
        hashMap.put("meiguozg", CARD_TMGJ);
        hashMap.put("tmgj_shishangdian", CARD_TMGJ);
        hashMap.put("tmgj_jinkouchaoshi", CARD_TMGJ);
        hashSet.add("tmgj_wangzhan");
        hashSet.add("haiwaizhigou");
    }
}
