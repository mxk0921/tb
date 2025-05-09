package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST$ERROR;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889303);
    }

    public static void a(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b240de1", new Object[]{intent, context});
            return;
        }
        Uri data = intent.getData();
        if (uc1.b("isGetContextByApmManager", true)) {
            context = c21.i();
        }
        if (data != null && context != null) {
            TLog.loge("ASK", "AskPublishNavProcessor:" + data.toString());
            if (!zc1.b(data.getQueryParameter("isUrlProcessed"), false)) {
                Uri build = data.buildUpon().appendQueryParameter("isUrlProcessed", "true").build();
                intent.setData(build);
                Map<String, String> b = vyv.b(build);
                String str = b.get("sessionId");
                String str2 = b.get("type");
                if ("answer".equals(str2)) {
                    new d01().h(context, build, b);
                } else if ("question".equals(str2)) {
                    new r8n().b(context, build, b);
                } else {
                    ASK_CONST$ERROR ask_const$error = ASK_CONST$ERROR.INVALID_PARAMS;
                    aix.callback(str, false, false, ask_const$error.toJSONObject());
                    zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error.toJSONObject());
                }
            }
        }
    }
}
