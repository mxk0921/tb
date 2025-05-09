package tb;

import com.alipay.security.mobile.module.http.UploadFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pyx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final pyx b = new pyx();

    /* renamed from: a  reason: collision with root package name */
    public int f26406a = 0;

    public static pyx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pyx) ipChange.ipc$dispatch("554b5788", new Object[0]);
        }
        return b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String zhiZhiGateway = UploadFactory.getZhiZhiGateway();
        if (vux.f(zhiZhiGateway)) {
            return zhiZhiGateway;
        }
        int i = this.f26406a;
        if (i == 1) {
            return "http://mobilegw.stable.alipay.net/mgw.htm";
        }
        if (i == 2) {
            return "https://mobilegwpre.alipay.com/mgw.htm";
        }
        if (i == 3) {
            return "http://mobilegw-1-64.test.alipay.net/mgw.htm";
        }
        if (i != 4) {
            return "https://mobilegw.alipay.com/mgw.htm";
        }
        return "http://mobilegw.aaa.alipay.net/mgw.htm";
    }
}
