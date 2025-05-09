package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xwl implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).edit().putBoolean("offMinNSwitcher", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", "offMinNSwitcher", "false"))).putString("configList", OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", "configList", "[{\"biz\":\"detail\",\"offSwitcher\":\"true\",\"type\":\"dinamic\",\"blackList\":\"a.m.taobao.com/sku\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3ddetail%26\",\"host\":\"a.m.taobao.com,detail.tmall.com,item.taobao.com,item.tmall.com,a.m.tmall.com,detail.m.tmall.com,chaoshi.detail.tmall.com,h5.m.taobao.com,h5.m.tmall.com,miao.item.tmall.com,miao.item.taobao.com,detail.tmall.hk,detail.m.tmall.hk,detail.wapa.tmall.com,auction1.wap.taobao.com,h5.m.wapa.taobao.com,a.wapa.tmall.com,a.wapa.taotao.com,a.waptest.tmall.com,a.waptest.taobao.com\",\"matchRegStr\":\"locType=(O2OOneHour|O2OPF)\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=\",\"host\":\"s.m.tmall.com/m/searchbar.htm\",\"matchRegStr\":\"\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=pageFrom%3DresultList\",\"host\":\"s.m.tmall.com/m/search.htm,list.tmall.com/search_product.htm,s.m.tmall.com/search.htm,s.m.tmall.com/m/supermarket.htm,s.m.tmall.com/m/chaoshi.htm,s.m.tmall.com/chaoshi.htm\",\"matchRegStr\":\"\"}]")).apply();
            OrangeConfig.getInstance().unregisterListener(new String[]{"android_tcg_urlMiddleware"});
        }
    }

    public static boolean a(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c859d1e6", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\,");
        if (!TextUtils.isEmpty(str3)) {
            str4 = str2 + str3;
        } else {
            str4 = str2;
        }
        for (int i = 0; i < split.length; i++) {
            if (str2.equals(split[i]) || str4.equals(split[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("842959ec", new Object[]{str, str2})).booleanValue();
        }
        for (String str3 : str.split("\\,")) {
            if (str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7499a95a", new Object[0])).booleanValue();
        }
        return d();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4fa0476", new Object[0])).booleanValue();
        }
        OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", "offMinNSwitcher", "false");
        OrangeConfig.getInstance().registerListener(new String[]{"android_tcg_urlMiddleware"}, new a(), false);
        return Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).getBoolean("offMinNSwitcher", false);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "PerfectDeliveryNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return c();
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String string = Globals.getApplication().getSharedPreferences("tcg_urlNMiddleware_orange_preference", 0).getString("configList", "[{\"biz\":\"detail\",\"offSwitcher\":\"true\",\"type\":\"dinamic\",\"blackList\":\"a.m.taobao.com/sku\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3ddetail%26\",\"host\":\"a.m.taobao.com,detail.tmall.com,item.taobao.com,item.tmall.com,a.m.tmall.com,detail.m.tmall.com,chaoshi.detail.tmall.com,h5.m.taobao.com,h5.m.tmall.com,miao.item.tmall.com,miao.item.taobao.com,detail.tmall.hk,detail.m.tmall.hk,detail.wapa.tmall.com,auction1.wap.taobao.com,h5.m.wapa.taobao.com,a.wapa.tmall.com,a.wapa.taotao.com,a.waptest.tmall.com,a.waptest.taobao.com\",\"matchRegStr\":\"locType=(O2OOneHour|O2OPF)\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=\",\"host\":\"s.m.tmall.com/m/searchbar.htm\",\"matchRegStr\":\"\"},{\"biz\":\"search\",\"offSwitcher\":\"true\",\"type\":\"min\",\"dinamic\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&query=routePage%3dsearch%26\",\"private\":\"https://m.duanqu.com?_ariver_appid=3000000028284614&page=plugin-private%3A%2F%2F3000000026754413%2Fpages%2Findex%2Findex%3F\",\"min\":\"https://m.duanqu.com?_ariver_appid=3000000039406433&query=pageFrom%3DresultList\",\"host\":\"s.m.tmall.com/m/search.htm,list.tmall.com/search_product.htm,s.m.tmall.com/search.htm,s.m.tmall.com/m/supermarket.htm,s.m.tmall.com/m/chaoshi.htm,s.m.tmall.com/chaoshi.htm\",\"matchRegStr\":\"\"}]");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray parseArray = JSON.parseArray(string);
                    for (int i = 0; i < parseArray.size(); i++) {
                        if (parseArray.getJSONObject(i).getBoolean("offSwitcher").booleanValue()) {
                            String string2 = parseArray.getJSONObject(i).getString("type");
                            String string3 = parseArray.getJSONObject(i).getString("host");
                            String string4 = parseArray.getJSONObject(i).getString(KeepModel.STRATEGY_BLACK_LIST);
                            String string5 = parseArray.getJSONObject(i).getString("matchRegStr");
                            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && (TextUtils.isEmpty(string4) || !b(string4, data.toString()))) {
                                String string6 = parseArray.getJSONObject(i).getString(string2);
                                if (!TextUtils.isEmpty(string6)) {
                                    if ((!TextUtils.isEmpty(string5) ? Pattern.compile(string5).matcher(intent.getDataString()).find() : true) && a(string3, data.getHost(), data.getPath())) {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append(string6);
                                        if (!TextUtils.isEmpty(data.getEncodedQuery())) {
                                            stringBuffer.append(Uri.encode(data.getEncodedQuery()));
                                        }
                                        Nav.from(Globals.getApplication()).toUri(stringBuffer.toString());
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }
}
