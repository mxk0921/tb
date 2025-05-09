package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o8w implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_WH_WEEX = "wh_weex";
    public static final String PATH_INDEX = "/app/tb-source-app/video-fullpage/pages/index";
    public static final String PATH_INDEX2 = "/app/tb-source-app/video-fullpage/pages/index2";

    static {
        t2o.a(731906051);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "VideoListBeforeNavProcessor";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return tyr.a();
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null) {
            return true;
        }
        try {
            data = intent.getData();
        } catch (Throwable th) {
            TLog.loge("VideoListBeforeNavProcessor", "beforeNavTo error", th);
        }
        if (data == null || (path = data.getPath()) == null) {
            return true;
        }
        String queryParameter = data.getQueryParameter("wh_weex");
        if (path.equals("/app/tb-source-app/video-fullpage/pages/index2") && TextUtils.isEmpty(queryParameter)) {
            return true;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        Uri.Builder buildUpon = data.buildUpon();
        if (PATH_INDEX.equals(path)) {
            buildUpon.path("/app/tb-source-app/video-fullpage/pages/index2");
        }
        buildUpon.clearQuery();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String queryParameter2 = data.getQueryParameter(str);
                if (!"wh_weex".equals(str)) {
                    buildUpon.appendQueryParameter(str, queryParameter2);
                }
            }
        }
        intent.setData(buildUpon.build());
        return true;
    }
}
