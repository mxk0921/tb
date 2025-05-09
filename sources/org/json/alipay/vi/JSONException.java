package org.json.alipay.vi;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class JSONException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(JSONException jSONException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/json/alipay/vi/JSONException");
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("fa19c19f", new Object[]{this});
        }
        return this.cause;
    }

    public JSONException(Throwable th) {
        super(th.getMessage());
        this.cause = th;
    }
}
