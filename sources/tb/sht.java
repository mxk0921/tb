package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sht implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TLOG_MODULE = "tcc_nav_processor";

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TccNavProcessor";
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
        vht.h();
        Uri data = intent.getData();
        if (data != null) {
            if (data.isOpaque()) {
                TLog.logi(TLOG_MODULE, "sht", "uri opaque: " + data);
                return true;
            }
            String host = data.getHost();
            if ("pages-fast.m.taobao.com".equals(host) || wht.TCC_PAY_SUCCESS_HOST_PRE.equals(host)) {
                return wht.f(intent, zmjVar);
            }
        }
        return true;
    }
}
