package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.taobao.impl.TMS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zhl implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708675);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "PHANavProcessor";
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
        String scheme;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null) {
            return true;
        }
        Uri data = intent.getData();
        Context d = zmjVar.d();
        if (!(data == null || d == null)) {
            try {
                scheme = data.getScheme();
            } catch (Exception e) {
                TMSLogger.b("PHANavProcessor", "url scheme check failed: " + e.getMessage());
            }
            if (scheme == null) {
                return true;
            }
            if (!scheme.equals("https")) {
                if (!scheme.equals("http")) {
                    return true;
                }
            }
            TMSLogger.b("PHANavProcessor", "切流到 TMS WEB_SINGLE_PAGE");
            TMS.startApp(intent, zmjVar, TMSSolutionType.WEB_SINGLE_PAGE);
        }
        return true;
    }
}
