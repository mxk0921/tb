package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gt8 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814095);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ExtraReferrerProcessor";
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
        if (d instanceof Activity) {
            Intent intent2 = ((Activity) d).getIntent();
            if (intent2 != null) {
                Uri data = intent2.getData();
                if (data != null) {
                    intent.putExtra("referrer", data.toString());
                } else {
                    ComponentName component = intent2.getComponent();
                    if (component != null) {
                        intent.putExtra("referrer", new Intent().setComponent(component).toUri(0));
                    } else {
                        intent.putExtra("referrer", intent2.toUri(0));
                    }
                }
            }
        } else {
            intent.putExtra("referrer", d.getPackageName());
        }
        return true;
    }
}
