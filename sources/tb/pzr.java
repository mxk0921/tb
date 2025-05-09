package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pzr implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614605);
        t2o.a(578814049);
    }

    public final void a(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f9fad7", new Object[]{this, intent, zmjVar});
        } else if (a8r.b(zmjVar.d()) && (data = intent.getData()) != null && data.buildUpon() != null) {
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBWaitPayNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent != null) {
            a(intent, zmjVar);
        }
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
