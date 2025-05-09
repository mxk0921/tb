package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d5b extends lr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782800);
    }

    public d5b(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public static /* synthetic */ Object ipc$super(d5b d5bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/HomepageCommonCollector");
    }

    @Override // tb.lr1
    public Object e(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d46b9933", new Object[]{this, str, strArr});
        }
        String e = qy8.b.e("homepage_common", str, "");
        if (TextUtils.isEmpty(e) || strArr == null || strArr.length <= 0) {
            return e;
        }
        try {
            return h(e, strArr);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.lr1
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
        } else {
            TLog.loge("HomepageCommonCollector", "Homepage BizParams bind error");
        }
    }

    public final JSONObject h(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ae00596", new Object[]{this, str, strArr});
        }
        JSONObject parseObject = JSON.parseObject(str);
        JSONObject jSONObject = new JSONObject(lr1.c(strArr.length));
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str2, (Object) parseObject.getString(str2));
            }
        }
        return jSONObject;
    }
}
