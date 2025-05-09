package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_HOME_PAGE = "PageTaoHome";

    /* renamed from: a  reason: collision with root package name */
    public final String f33039a;
    public final JSONObject b = new JSONObject();

    static {
        t2o.a(488636507);
    }

    public zve(String str) {
        this.f33039a = str;
    }

    public static zve b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zve) ipChange.ipc$dispatch("df1e097c", new Object[]{str});
        }
        return new zve(str);
    }

    public zve a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zve) ipChange.ipc$dispatch("1f123cd1", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return this;
        }
        this.b.put(str, (Object) str2);
        return this;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.b;
    }
}
