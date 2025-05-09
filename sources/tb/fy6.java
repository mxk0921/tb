package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import mtopsdk.common.util.TBSdkLog;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fy6 implements zu2.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f19622a;

    static {
        t2o.a(590348297);
        t2o.a(589300019);
    }

    public fy6(Context context, ExecutorService executorService) {
        this.f19622a = executorService;
        try {
            jt4.c(context);
        } catch (Exception e) {
            TBSdkLog.e("qmtopsdk.DefaultCallFactory", "call CookieManager.setup error.", e);
        }
    }

    @Override // tb.zu2.a
    public zu2 a(h3o h3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu2) ipChange.ipc$dispatch("86b8e3d7", new Object[]{this, h3oVar});
        }
        return new gy6(h3oVar, this.f19622a);
    }
}
