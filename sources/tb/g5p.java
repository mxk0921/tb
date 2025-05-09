package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class g5p<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19741a = false;

    static {
        t2o.a(815792921);
    }

    public T a(byte[] bArr, v5p v5pVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c0b78720", new Object[]{this, bArr, v5pVar});
        }
        if (this.f19741a) {
            jSONObject = i4p.d(bArr, v5pVar);
        } else {
            jSONObject = i4p.c(bArr, v5pVar);
        }
        if (jSONObject == null) {
            return c();
        }
        return b(jSONObject, v5pVar);
    }

    public abstract T b(JSONObject jSONObject, v5p v5pVar);

    public abstract T c();
}
