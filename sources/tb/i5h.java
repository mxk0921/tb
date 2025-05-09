package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i5h implements gmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093097);
        t2o.a(779093118);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5577c940", new Object[]{this, context, str});
            return;
        }
        lgi lgiVar = new lgi();
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("id");
        JSONObject d = fkx.d(parse.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL));
        if (d != null) {
            lgiVar.f23322a = mxg.a(d);
            gsm.a().e(queryParameter, lgiVar);
        }
    }
}
