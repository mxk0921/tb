package mtopsdk.mtop.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MockResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String api;
    public byte[] byteData;
    public Map<String, List<String>> headers;
    public int statusCode;

    static {
        t2o.a(589299909);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MockResponse{api='" + this.api + "', statusCode=" + this.statusCode + ", headers=" + this.headers + ", byteData=" + new String(this.byteData) + '}';
    }
}
