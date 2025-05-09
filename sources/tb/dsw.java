package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class dsw implements n8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f18051a;

    static {
        t2o.a(989856233);
        t2o.a(989856205);
    }

    public dsw(WVCallBackContext wVCallBackContext, String str, String str2) {
        this.f18051a = wVCallBackContext;
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbc2f41", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
            nsw nswVar = new nsw();
            if (!TextUtils.isEmpty("unauthorized")) {
                nswVar.b("state", "unauthorized");
            }
            nswVar.b("msg", WVResultWrapper.USER_DENIED);
            this.f18051a.error(nswVar);
        } else {
            nsw nswVar2 = new nsw();
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                jSONArray.put(str);
            }
            if (!TextUtils.isEmpty("unauthorized")) {
                nswVar2.b("state", "unauthorized");
            }
            nswVar2.b("msg", WVResultWrapper.USER_DENIED);
            nswVar2.c("deniedPermissions", jSONArray);
            this.f18051a.error(nswVar2);
        }
    }
}
