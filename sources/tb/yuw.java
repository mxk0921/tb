package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yuw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String LOG_TAG = "nativeApi";
    public static final String MSG_FAILED = "MUS_FAILED";
    public static final String MSG_SUCCESS = "MUS_SUCCESS";
    public static final String MUS = "com.taobao.android.intent.category.MUS";
    public static final String WEEX_POP_ID = "wx_popId";

    static {
        t2o.a(982516119);
    }

    public static boolean a(WeexInstance weexInstance, String str, f4x f4xVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7453132", new Object[]{weexInstance, str, f4xVar})).booleanValue();
        }
        String bundleUrl = weexInstance.getBundleUrl();
        if (!TextUtils.isEmpty(bundleUrl) && (parse = Uri.parse(bundleUrl)) != null && parse.isHierarchical() && parse.getQueryParameter("wx_popId") != null && r3x.n() != null) {
            r3x.n().a(weexInstance, str);
            if (f4xVar != null) {
                f4xVar.b("MUS_SUCCESS");
            }
            return true;
        } else if (r3x.j() == null || !r3x.j().b(weexInstance.getContext(), ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance(), str)) {
            if (weexInstance.getContext() instanceof Activity) {
                Activity activity = (Activity) weexInstance.getContext();
                if (f4xVar != null) {
                    f4xVar.b("MUS_SUCCESS");
                }
                activity.finish();
            }
            return true;
        } else {
            if (f4xVar != null) {
                f4xVar.b("MUS_SUCCESS");
            }
            return true;
        }
    }

    public static boolean b(WeexInstance weexInstance, String str, f4x f4xVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73c3c0d5", new Object[]{weexInstance, str, f4xVar})).booleanValue();
        }
        q6x q6xVar = (q6x) weexInstance.getExtend(q6x.class);
        if (q6xVar != null) {
            q6xVar.j(true);
        }
        String bundleUrl = weexInstance.getBundleUrl();
        if (TextUtils.isEmpty(bundleUrl) || (parse = Uri.parse(bundleUrl)) == null || !parse.isHierarchical() || parse.getQueryParameter("wx_popId") == null || r3x.n() == null) {
            if (!TextUtils.isEmpty(str)) {
                if (r3x.j() != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", (Object) str);
                    if (r3x.j().a(weexInstance.getContext(), ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance(), jSONObject.toJSONString())) {
                        if (weexInstance.getContext() instanceof Activity) {
                            ((Activity) weexInstance.getContext()).finish();
                        }
                        if (f4xVar != null) {
                            f4xVar.b("MUS_SUCCESS");
                        }
                        return true;
                    }
                }
                try {
                    String string = JSON.parseObject(str).getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        Uri parse2 = Uri.parse(string);
                        String scheme = parse2.getScheme();
                        Uri.Builder buildUpon = parse2.buildUpon();
                        if (TextUtils.isEmpty(scheme)) {
                            buildUpon.scheme("http");
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                        intent.addCategory("com.taobao.android.intent.category.MUS");
                        intent.putExtra("instanceId", weexInstance.getInstanceId());
                        weexInstance.getContext().startActivity(intent);
                        if (weexInstance.getContext() instanceof Activity) {
                            ((Activity) weexInstance.getContext()).finish();
                        }
                        if (f4xVar != null) {
                            f4xVar.b("MUS_SUCCESS");
                        }
                    }
                } catch (Exception e) {
                    dwh.h(LOG_TAG, e);
                    if (f4xVar != null) {
                        f4xVar.b("MUS_FAILED");
                    }
                }
            } else if (f4xVar != null) {
                f4xVar.b("MUS_FAILED");
            }
            return true;
        }
        r3x.n().b(weexInstance, str);
        if (f4xVar != null) {
            f4xVar.b("MUS_SUCCESS");
        }
        return true;
    }
}
