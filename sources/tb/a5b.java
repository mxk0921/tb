package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a5b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809384);
        t2o.a(729809365);
    }

    public final boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16983cb5", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null || wVCallBackContext.getWebview() == null || wVCallBackContext.getWebview().getContext() == null) {
            return false;
        }
        return true;
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return b(wVCallBackContext);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Collections.singletonList("wakeSelectArea");
    }

    public final boolean b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a500a7b5", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        vqa e = vqa.k().i("Bridge").j("wakeSelectArea").e("homepage.HomePageWVPlugin.wakeSelectArea");
        if (a(wVCallBackContext)) {
            e.g("checkCallback", "true");
            try {
                uza.a(wVCallBackContext.getWebview().getContext(), 1);
                e.e("success").a();
                return true;
            } catch (Throwable th) {
                e.g("exception", "showDialog error " + th.getMessage());
                ddv.h("HomePageWVPlugin", "2.0", "wakeSelectArea Exception", "showDialog error : " + th.getMessage(), null, null);
            }
        } else {
            e.g("checkCallback", "false");
            ddv.h("HomePageWVPlugin", "2.0", "wakeSelectArea Exception", "callback checkError", null, null);
        }
        e.e("fail").a();
        return false;
    }
}
