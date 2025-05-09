package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.TBShopPageType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qwr implements ovd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rwr f26976a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBShopPageType f26977a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Bundle c;

        public a(TBShopPageType tBShopPageType, String str, Bundle bundle) {
            this.f26977a = tBShopPageType;
            this.b = str;
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qwr.this.getClass();
            rwr.a(null).a(this.f26977a, this.b, this.c);
        }
    }

    public qwr(rwr rwrVar) {
    }

    @Override // tb.ovd
    public void a(TBShopPageType tBShopPageType, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d325cf8", new Object[]{this, tBShopPageType, str, bundle});
        } else {
            rwr.b(null).post(new a(tBShopPageType, str, bundle));
        }
    }
}
