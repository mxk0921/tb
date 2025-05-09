package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cuq implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946345);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "SubFragmentProcessor";
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
        Context d = zmjVar.d();
        if (d != null && intent != null && nx9.q(d) && nx9.n(d, "miniDetail")) {
            Bundle bundle = new Bundle();
            bundle.putString(qxq.KEY_FRAGMENT_JUMP, "true");
            bundle.putString(qxq.KEY_FRAGMENT_NAME, "com.taobao.weex.minidetail.MiniDetailWeexFragment");
            bundle.putString(qxq.SUB_KEY_FRAGMENT_JUMP, "miniDetail");
            intent.putExtra(qxq.KEY_FRAGMENT_BUNDLE, bundle);
        }
        return true;
    }
}
