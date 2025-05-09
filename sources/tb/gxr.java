package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gxr implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(326107140);
        t2o.a(578814049);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5577c5e", new Object[]{context})).booleanValue();
        }
        boolean P = TBDeviceUtils.P(context);
        if (TBDeviceUtils.p(context) || P) {
            return false;
        }
        return true;
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TBSubscribeNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null || a(zmjVar.d()) || (data = intent.getData()) == null || !TextUtils.isEmpty(data.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY)))) {
            Uri.Builder buildUpon = Uri.parse(data.toString()).buildUpon();
            buildUpon.appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
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
