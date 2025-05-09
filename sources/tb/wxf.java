package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wxf extends xu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ da3 f30987a;
        public final /* synthetic */ String b;

        public a(da3 da3Var, String str) {
            this.f30987a = da3Var;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f30987a.c(this.b);
            }
        }
    }

    static {
        t2o.a(479199291);
    }

    public wxf(zxb zxbVar) {
        super(zxbVar);
    }

    public static /* synthetic */ Object ipc$super(wxf wxfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/chain/impl/JumpComponentDataProcessor");
    }

    @Override // tb.xu
    public void e(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc977bbd", new Object[]{this, fsbVar, requestConfig});
        } else if (this.f31607a.c() != null && !this.f31607a.c().d()) {
            String j = sca.j(this.f31607a);
            if (!TextUtils.isEmpty(j)) {
                this.f31607a.x().e().o().post(new a(new da3(this.f31607a.x()), j));
            }
        }
    }

    @Override // tb.xu
    public void f(fsb fsbVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca381e", new Object[]{this, fsbVar, requestConfig});
        }
    }
}
