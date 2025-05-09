package tb;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jbl INSTANCE = new jbl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends TypeReference<Map<String, ? extends String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b extends TypeReference<List<? extends JSONObject>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c extends TypeReference<Map<String, ? extends String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d extends TypeReference<Map<String, ? extends String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e extends TypeReference<Map<String, ? extends String>> {
    }

    static {
        t2o.a(1031798819);
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90b2ce94", new Object[]{this})).booleanValue();
        }
        return ckf.b("false", OrangeConfig.getInstance().getConfig("hudong_common_config", "enable_idle_prefetch", "false"));
    }

    public final Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("545408de", new Object[]{this});
        }
        return (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig("hudong_common_config", "host_path_rule_map", null), new c(), new Feature[0]);
    }

    public final Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("500ea4dd", new Object[]{this});
        }
        return (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig("hudong_common_config", "duanqu_url_map", null), new d(), new Feature[0]);
    }

    public final String b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0e99277", new Object[]{this, uri});
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Map map = (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig("hudong_common_config", "biz_type", null), new a(), new Feature[0]);
        if (map == null) {
            return null;
        }
        return (String) map.get(ckf.p(uri.getHost(), uri.getPath()));
    }

    public final List<JSONObject> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ecb7c022", new Object[]{this});
        }
        List<JSONObject> list = (List) JSON.parseObject(OrangeConfig.getInstance().getConfig("hudong_common_config", "prefetch_abtest_config", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264), new b(), new Feature[0]);
        return list == null ? yz3.i() : list;
    }

    public final Map<String, String> f(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("add724c8", new Object[]{this, uri});
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig("hudong_common_config", uri.getHost() + ((Object) uri.getPath()) + "_manifest", null), new e(), new Feature[0]);
    }
}
