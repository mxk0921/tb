package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16556a = "";
    public String b = "";

    static {
        t2o.a(589300059);
    }

    public static bqq a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bqq) ipChange.ipc$dispatch("69a943c6", new Object[]{str});
        }
        bqq bqqVar = new bqq();
        if (TextUtils.isEmpty(str)) {
            return bqqVar;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            bqqVar.f16556a = parseObject.getString(HttpHeaderConstant.X_RETCODE);
            bqqVar.b = parseObject.getString(HttpHeaderConstant.X_BIN_LENGTH);
        } catch (Throwable unused) {
        }
        return bqqVar;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6b45b93", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f243c01", new Object[]{this});
        }
        return this.f16556a;
    }
}
