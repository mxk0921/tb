package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.model.JsActionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class avf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(490733590);
    }

    public static JsActionModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsActionModel) ipChange.ipc$dispatch("a84d7bc3", new Object[]{str, str2});
        }
        if (!TextUtils.equals(xpc.RECORD_EXECUTE, str)) {
            fve.e("JsActionModelCreator", "error action : " + str);
            return null;
        } else if (TextUtils.isEmpty(str2)) {
            fve.e("JsActionModelCreator", "params is empty");
            return null;
        } else {
            try {
                return (JsActionModel) JSON.parseObject(str2, JsActionModel.class);
            } catch (Throwable th) {
                fve.c("JsActionModelCreator", "create JsActionModel error :" + th.getMessage(), th);
                return null;
            }
        }
    }
}
