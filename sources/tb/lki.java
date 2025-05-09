package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lki implements xnj {
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
            Globals.getApplication().getSharedPreferences("tmall_membershop_orange_preference", 0).edit().putBoolean("downgrade", Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tmall_membershop", "downgrade", "true"))).apply();
            OrangeConfig.getInstance().unregisterListener(new String[]{"android_tmall_membershop"});
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a6c976", new Object[0])).booleanValue();
        }
        OrangeConfig.getInstance().getConfig("android_tmall_membershop", "downgrade", "false");
        OrangeConfig.getInstance().registerListener(new String[]{"android_tmall_membershop"}, new a(), false);
        return Globals.getApplication().getSharedPreferences("tmall_membershop_orange_preference", 0).getBoolean("downgrade", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7499a95a", new Object[0])).booleanValue();
        }
        return !a();
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "MemberShopNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return true ^ b();
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            if (("http".equals(scheme) || "https".equals(scheme)) && ((kyt.TMCS_PAY_SUCCESS_HOST.equals(host) || "tmclub.tmall.com".equals(host)) && ("/wow/tmclub/act/home".equals(path) || "/wow/z/tmclub/channel/home".equals(path)))) {
                intent.setDataAndType(Uri.parse("taobao://page.tm/membershop").buildUpon().encodedQuery(data.getEncodedQuery()).build(), intent.getType());
            }
        }
        return true;
    }
}
