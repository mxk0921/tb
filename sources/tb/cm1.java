package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cm1 extends pwq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_ID = "24707";
    public static final String CHI_TU_ALIAS = "SEARCHDOOR_BG_WORDS_ALIAS";
    public static final a Companion = new a(null);
    public static final String I18N_APP_ID = "46162";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793218);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final String a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f92686a8", new Object[]{this, map});
            }
            if (Localization.o()) {
                return cm1.I18N_APP_ID;
            }
            return cm1.APP_ID;
        }

        public a() {
        }
    }

    static {
        t2o.a(815793217);
    }

    public cm1(Map<String, String> map) {
        super(Companion.a(map), CHI_TU_ALIAS, MethodEnum.POST);
        if (map != null && !map.isEmpty()) {
            eca.c(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        String c = k1p.c();
        ckf.f(c, "getEditionCode(...)");
        if (!TextUtils.isEmpty(c)) {
            b(r4p.KEY_EDITION_CODE, c);
        }
        TBLocationDTO c2 = a4p.c();
        if (c2 != null) {
            b("longitude", c2.longitude);
            b("latitude", c2.latitude);
            b(r4p.KEY_CITY_CODE, c2.cityCode);
        }
        b("sversion", r4p.SERVER_VERSION_VALUE);
        b("area", "shouye_query_rec_hintq_rolling");
    }

    public static /* synthetic */ Object ipc$super(cm1 cm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/bgwords/BGWordsTppRequest");
    }
}
