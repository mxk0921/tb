package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y6u implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902777);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TpPadFullscreenNavProcessor";
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
        if (!x6u.d()) {
            return true;
        }
        if (!TBDeviceUtils.p(zmjVar.d()) && !TBDeviceUtils.P(zmjVar.d())) {
            TLog.loge("TpLog", "TpPadFullscreenNavProcessor normal phone return");
            return true;
        } else if (intent == null || intent.getData() == null) {
            TLog.loge("TpLog", "TpPadFullscreenNavProcessor data empty return");
            return true;
        } else {
            Uri data = intent.getData();
            if (!x6u.f(data.getQueryParameter(dov.KEY_BIZ_LINE))) {
                intent.setData(data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                TLog.loge("TpLog", "TpPadFullscreenNavProcessor set full");
            }
            return true;
        }
    }
}
