package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w6t implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(776994817);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "TaoLiveSearchProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent.getData() != null) {
            String uri2 = intent.getData().toString();
            if (!TextUtils.isEmpty(uri2) && uri2.contains("h5.m.taobao.com/taolive/search.html") && zmjVar.d() != null) {
                Uri data = intent.getData();
                String queryParameter = data.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY);
                if (TextUtils.isEmpty(queryParameter)) {
                    uri = data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
                } else {
                    String uri3 = data.toString();
                    uri = Uri.parse(uri3.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
                }
                intent.setData(uri);
            }
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
