package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.ask.ASK_CONST$ERROR;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889304);
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef6f01b", new Object[]{context, map});
            return;
        }
        zc1.a(map, "tnodeTime", String.valueOf(System.nanoTime()));
        String str = map.get(RateInfoV2.KEY_OPEN_MODE);
        if (!"present".equals(str) && !"push".equals(str)) {
            map.put(RateInfoV2.KEY_OPEN_MODE, "push");
            str = "push";
        }
        zl2.a("TBAskEveryonePublisherWillOpen", null);
        String g = jd8.g();
        if (TextUtils.equals(str, "present")) {
            map.put(nbf.STDPOP_NAV_MODE, nbf.STDPOP_MODE_VALUE);
            map.put("stdpop_type", "maximum");
            map.put(nbf.STDPOP_MODE, "modal");
            map.put(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
        }
        Uri.Builder buildUpon = Uri.parse(g).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Nav.from(context).toUri(buildUpon.build());
        TLog.loge("ASK", "open new answer publish using activity");
    }

    public final void b(Context context, Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57258b57", new Object[]{this, context, uri, map});
            return;
        }
        String str = map.get("sessionId");
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            map.put("sessionId", str);
        }
        String str2 = map.get("scene");
        boolean b = zc1.b(map.get("callFromWindvane"), false);
        if (TextUtils.isEmpty(map.get("itemId"))) {
            ASK_CONST$ERROR ask_const$error = ASK_CONST$ERROR.INVALID_PARAMS;
            aix.callback(str, false, false, ask_const$error.toJSONObject());
            zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error.toJSONObject());
            TLog.loge("ASK", "answer publish open failed , item id is null");
        } else if (jd8.a("question", str2)) {
            a(context, map);
        } else {
            TLog.loge("ASK", "open failed , question publish is not enale");
            if (b) {
                ASK_CONST$ERROR ask_const$error2 = ASK_CONST$ERROR.PUBLISHER_DEGRADED;
                aix.callback(str, false, false, ask_const$error2.toJSONObject());
                zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error2.toJSONObject());
            }
        }
    }
}
