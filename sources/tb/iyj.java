package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class iyj implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321604);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "NewDetailShareNavProcessor";
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
        JSONObject jSONObject;
        Uri.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            if (!data.getBooleanQueryParameter("hybrid_nd", false)) {
                return true;
            }
            String queryParameter = data.getQueryParameter("shareNDParams");
            if (TextUtils.isEmpty(queryParameter)) {
                return true;
            }
            try {
                jSONObject = JSON.parseObject(Uri.decode(queryParameter));
            } catch (Exception e) {
                wg7.b("NewDetailShareNavProcessor", "parse shareNDParams error" + e);
                jSONObject = null;
            }
            if (jSONObject != null && !jSONObject.isEmpty()) {
                if (data.getBooleanQueryParameter("native_liteDetail", false)) {
                    builder = new Uri.Builder().scheme("https").authority("litedetail.taobao.com");
                } else {
                    builder = new Uri.Builder().scheme("https").authority("newdetail.taobao.com");
                }
                byj.d0();
                if (byj.o()) {
                    List<String> V = byj.V();
                    for (String str : data.getQueryParameterNames()) {
                        if (!V.contains(str) && !jSONObject.containsKey(str)) {
                            builder.appendQueryParameter(str, data.getQueryParameter(str));
                        }
                    }
                }
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    if (entry != null) {
                        builder.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                intent.setData(builder.build());
            }
        }
        return true;
    }
}
