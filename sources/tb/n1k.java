package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n1k implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946344);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "NewSettingProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
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
            if ((("https".equals(scheme) || "http".equals(scheme) || "taobao".equals(scheme)) && "m.taobao.com".equals(host) && "/go/mytaobao/settings".equals(path)) || (("https".equals(scheme) || "http".equals(scheme)) && "tb.cn".equals(host) && "/x/sz/".equals(path))) {
                if ("/x/sz/".equals(path)) {
                    intent.setData(data.buildUpon().path("/x/nsz/").build());
                } else {
                    intent.setData(data.buildUpon().path("/go/mytaobao/newsettings").build());
                }
                return true;
            } else if (("https".equals(scheme) || "http".equals(scheme) || "taobao".equals(scheme)) && "m.taobao.com".equals(host) && "/go/mytaobaocommonsettings".equals(path)) {
                intent.setData(data.buildUpon().path("/go/newmytaobaocommonsettings").build());
            }
        }
        return true;
    }
}
