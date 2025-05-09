package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i7r implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBAutoSizeNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Activity y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!TBDeviceUtils.p(zmjVar.d()) && !TBDeviceUtils.P(zmjVar.d())) {
            return true;
        }
        if (TBAutoSizeConfig.x().S() && (y = TBAutoSizeConfig.x().y()) != null) {
            d7r.k(y, false);
        }
        ComponentName component = intent.getComponent();
        if (!zmjVar.l() || !(zmjVar.d() instanceof Activity) || component == null || !component.equals(((Activity) zmjVar.d()).getComponentName())) {
            return !jc0.g(zmjVar.d(), zmjVar.e(), intent, zmjVar.i(), false);
        }
        TLog.loge("TBAutoSize.NavProcessor", "Pad mode pae open fail. disallowLoopback=true.");
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
