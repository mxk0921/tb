package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class frw implements erw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856329);
        t2o.a(989856328);
    }

    @Override // tb.erw
    public void commitParamParseError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1775567a", new Object[]{this, str, str2, str3, str4});
        } else {
            y71.commitParamParseError(str, str2, str3, str4);
        }
    }

    @Override // tb.erw
    public void didCallAtURL(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c0524", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.erw
    public void didCallBackAtURL(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf57247", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // tb.erw
    public void didOccurError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22f0c8a", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // tb.erw
    public void onJsBridgeReturn(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5ad7ba", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            y71.commitJsBridgeReturn(str, str3, str4, str5);
        }
    }
}
