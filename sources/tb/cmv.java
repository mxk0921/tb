package tb;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cmv implements n6j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17159a;
    public final String b;
    public final String c;

    public cmv(String str, String str2, String str3, String str4) {
        this.f17159a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // tb.n6j
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f17159a)) {
            hashMap.put("apiName", this.f17159a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("apiVersion", this.b);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put(MspGlobalDefine.EXTENDINFO, null);
        }
        if (!TextUtils.isEmpty(this.c)) {
            hashMap.put("stacktrace", this.c);
        }
        return hashMap;
    }
}
