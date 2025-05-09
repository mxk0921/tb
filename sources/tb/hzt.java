package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                hzt.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends TypeReference<List<String>> {
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            b();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccd4b42", new Object[0]);
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tmghomeservice", "showTmgCategory", "true"));
        if (!parseBoolean || !((List) JSON.parseObject(OrangeConfig.getInstance().getConfig("tmghomeservice", "showTmgDiscoveryCountries", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), new b(), new Feature[0])).contains(o78.i(Globals.getApplication()).countryCode)) {
            z = parseBoolean;
        }
        qno.c("showTmgCategory", z);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6fd523", new Object[0]);
            return;
        }
        b();
        OrangeConfig.getInstance().registerListener(new String[]{"tmghomeservice"}, new a(), true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d48965fa", new Object[0])).booleanValue();
        }
        return qno.a("showTmgCategory", true);
    }
}
