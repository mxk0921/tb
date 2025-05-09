package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o2k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f25099a = {"netLevel", "scrollingSpeed", "predictStayDur", "predictRequestCost", "predictAlgoStayDur"};

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1edffe3b", new Object[0]);
        }
        try {
            return BUFS.getIntentions("home.recmd.loading", "PageHome");
        } catch (Throwable th) {
            fve.c("NextPageBxIntention", "getNextPageBxIntention error", th);
            return null;
        }
    }

    public static JSONObject b(String str) {
        JSONObject jSONObject;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5433da8b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Throwable th) {
            fve.c("NextPageBxIntention", "getNextPageBxIntention error", th);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : f25099a) {
            if (jSONObject.containsKey(str2)) {
                jSONObject2.put(str2, (Object) jSONObject.getString(str2));
            }
        }
        return jSONObject2;
    }

    static {
        t2o.a(491782691);
    }
}
