package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import java.net.URLDecoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p86 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444598033);
    }

    public static void a(Context context, String str) {
        String str2;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "url--->" + str);
                if (!TextUtils.isEmpty(str)) {
                    str2 = URLDecoder.decode(str, "UTF-8");
                } else {
                    str2 = "";
                }
                Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "result--->" + str2);
                if (!TextUtils.isEmpty(str2) && str2.contains("DinamicXTemplateDebug=")) {
                    try {
                        Class<?> cls = Class.forName("com.taobao.android.dinamicx.dinamicx_debug_plugin.DXDebugController");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("DXUrl", (Object) str);
                        cls.getDeclaredMethod("show", Context.class, JSONObject.class).invoke(null, context, jSONObject);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                } else if (!TextUtils.isEmpty(str2) && str2.contains("templateMock=")) {
                    String queryParameter = Uri.parse(str2).getQueryParameter(czh.KEY_PREVIEW_PARAM);
                    String substring = queryParameter.substring(queryParameter.indexOf("=") + 1);
                    Log.e(DXTemplatePreviewActivity.PREVIEW_TAG, "info-->:" + substring);
                    Intent intent = new Intent(context, DXTemplatePreviewActivity.class);
                    intent.putExtra(DXTemplatePreviewActivity.PREVIEW_INFO, substring);
                    context.startActivity(intent);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
