package tb;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.alipay.auth.mobile.AlipayAuthAPIFactory;
import com.alipay.auth.mobile.api.IAlipayAuthAPI;
import com.alipay.auth.mobile.api.IAlipayAuthMonitor;
import com.alipay.auth.mobile.exception.AlipayAuthIllegalArgumentException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vs0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static vs0 b;

    /* renamed from: a  reason: collision with root package name */
    public IAlipayAuthAPI f30215a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements IAlipayAuthMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(vs0 vs0Var) {
        }

        @Override // com.alipay.auth.mobile.api.IAlipayAuthMonitor
        public void monitorAliayAuth(String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ce41b1", new Object[]{this, str, properties});
            } else if (!TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT(str, properties);
            }
        }
    }

    public vs0() {
        c();
    }

    public static vs0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vs0) ipChange.ipc$dispatch("859b0ae", new Object[0]);
        }
        if (b == null) {
            b = new vs0();
        }
        return b;
    }

    public IAlipayAuthAPI a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayAuthAPI) ipChange.ipc$dispatch("e4bae7ef", new Object[]{this});
        }
        if (this.f30215a == null) {
            c();
        }
        return this.f30215a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c9ccc7", new Object[]{this});
            return;
        }
        try {
            this.f30215a = AlipayAuthAPIFactory.createAlipayAuthApi(DataProviderFactory.getApplicationContext(), new a(this));
        } catch (AlipayAuthIllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
