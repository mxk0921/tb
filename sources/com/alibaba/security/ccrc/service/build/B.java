package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.B;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.dai.adapter.MRTTaobaoAdapter;
import tb.gqh;
import tb.zqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class B {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2542a = "MNNRTManager";
    public static B b;
    public Context c;
    public String d;

    public static synchronized B a() {
        synchronized (B.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (B) ipChange.ipc$dispatch("30a07c02", new Object[0]);
            }
            if (b == null) {
                b = new B();
            }
            return b;
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return "high";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        MNNCV.init(this.c);
        MRTTaobaoAdapter.startMNNRuntime(this.c, this.d, null);
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (vb.c().k()) {
            if (this.c == null) {
                Logging.e(f2542a, "context is null");
            } else if (TextUtils.isEmpty(this.d)) {
                Logging.e(f2542a, "ttid is null");
            } else {
                zqh.d().g(new gqh() { // from class: tb.dfo
                    @Override // tb.gqh
                    public final String getDeviceLevel() {
                        return B.b();
                    }
                });
                C1184p.b(new Runnable() { // from class: tb.hso
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.this.d();
                    }
                });
            }
        }
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        this.c = context;
        this.d = str;
    }
}
