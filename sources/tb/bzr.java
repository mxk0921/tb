package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import io.unicorn.adapter.UnicornAdapterJNI;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bzr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_V2_CONFIG = "weex_v2_config";

    /* renamed from: a  reason: collision with root package name */
    public static final bzr f16743a = new bzr();

    public static bzr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzr) ipChange.ipc$dispatch("751310ff", new Object[0]);
        }
        return f16743a;
    }

    public String a(String str) {
        String str2;
        String str3;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b921d638", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !UnicornAdapterJNI.instance().libraryLoaded()) {
            return null;
        }
        String config = OrangeConfig.getInstance().getConfig("weex_v2_config", "url_map", "{\"market.m.taobao.com/app/newdetail/newdetail/pages/Home\":\"meta.m.taobao.com/app/detail-project/newdetail2/home201111\",\"market.m.taobao.com/app/newdetail/newdetail/pages/SuperItem\":\"meta.m.taobao.com/app/newdetail/super/home\"}");
        if (!TextUtils.isEmpty(config)) {
            try {
                Uri parse = Uri.parse(str);
                String uri = parse.buildUpon().clearQuery().build().toString();
                JSONObject parseObject = JSON.parseObject(config);
                Set<String> keySet = parseObject.keySet();
                if (keySet != null) {
                    for (String str4 : keySet) {
                        if (uri.contains(str4)) {
                            String string = parseObject.getString(str4);
                            if (!string.endsWith(".wlm")) {
                                str2 = str.replaceFirst(str4, parseObject.getString(str4));
                            } else if (!parse.isHierarchical() || !parse.getQueryParameterNames().contains("_mus_tpl")) {
                                str2 = str + "&_mus_tpl=" + string;
                            } else {
                                str2 = str.replaceFirst("_mus_tpl=" + parse.getQueryParameter("_mus_tpl"), "_mus_tpl=" + string);
                            }
                            if (!parse.isHierarchical() || !parse.getQueryParameterNames().contains("renderType")) {
                                str3 = str2 + "&renderType=2";
                            } else {
                                str3 = str2.replaceFirst("renderType=" + parse.getQueryParameter("renderType"), "renderType=2");
                            }
                            String[] split2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "dom_white_list", "").split(",");
                            if (split2 != null) {
                                for (String str5 : split2) {
                                    if (uri.contains(str5)) {
                                        if (!parse.isHierarchical() || !parse.getQueryParameterNames().contains(h8x.KEY_WEEX_MODE)) {
                                            str3 = str3 + "&weex_mode=dom";
                                        } else {
                                            str3 = str3.replaceFirst("weex_mode=" + parse.getQueryParameter(h8x.KEY_WEEX_MODE), "weex_mode=dom");
                                        }
                                    }
                                }
                            }
                            String config2 = OrangeConfig.getInstance().getConfig("weex_v2_config", "transparent_url_list", "");
                            if (!TextUtils.isEmpty(config2) && (split = config2.split(",")) != null) {
                                for (String str6 : split) {
                                    if (uri.contains(str6)) {
                                        if (!parse.isHierarchical() || !parse.getQueryParameterNames().contains("wx_opaque")) {
                                            return str3 + "&wx_opaque=0";
                                        } else {
                                            return str3.replaceFirst("wx_opaque=" + parse.getQueryParameter("wx_opaque"), "wx_opaque=0");
                                        }
                                    }
                                }
                            }
                            return str3;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
