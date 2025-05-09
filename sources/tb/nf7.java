package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nf7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912263159);
    }

    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (o3w.OPERATE_GET_DETAIL_DATA.equals(str)) {
                String b = b();
                if (TextUtils.isEmpty(b)) {
                    wVCallBackContext.error();
                } else {
                    wVCallBackContext.success(b);
                }
                return true;
            }
        } catch (Throwable th) {
            tgh.c("DetailExecutor", xpc.RECORD_EXECUTE, th);
        }
        return false;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44749b11", new Object[]{this});
        }
        return null;
    }
}
