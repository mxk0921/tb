package tb;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCCoreProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bce;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hif implements bce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVUCCoreProvider f20665a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WVUCCoreProvider.WVUCCoreProviderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bce.a f20666a;

        public a(hif hifVar, bce.a aVar) {
            this.f20666a = aVar;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCCoreProvider.WVUCCoreProviderCallback
        public void onUCCoreFailed(au4 au4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30d3f72e", new Object[]{this, au4Var});
            } else {
                this.f20666a.a();
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCCoreProvider.WVUCCoreProviderCallback
        public void onUCCorePrepared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e1aa650", new Object[]{this});
            } else {
                this.f20666a.onUCCorePrepared();
            }
        }
    }

    static {
        t2o.a(779092970);
        t2o.a(806356575);
    }

    public hif(ux9 ux9Var) {
    }

    @Override // tb.bce
    public void a(Context context, bce.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa81bcb4", new Object[]{this, context, aVar});
            return;
        }
        WVUCCoreProvider wVUCCoreProvider = new WVUCCoreProvider();
        this.f20665a = wVUCCoreProvider;
        wVUCCoreProvider.request(context, new a(this, aVar));
    }

    @Override // tb.bce
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        WVUCCoreProvider wVUCCoreProvider = this.f20665a;
        if (wVUCCoreProvider != null) {
            wVUCCoreProvider.release();
            this.f20665a = null;
        }
    }
}
