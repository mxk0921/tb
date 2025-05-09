package tb;

import android.content.Context;
import com.alipay.biometrics.common.proguard.INotProguard;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.verifyidentity.rpc.IRpcService;
import com.alipay.vi.android.phone.mrpc.core.Config;
import com.alipay.vi.android.phone.mrpc.core.HttpManager;
import com.alipay.vi.android.phone.mrpc.core.RpcFactory;
import com.alipay.vi.android.phone.mrpc.core.RpcParams;
import com.alipay.vi.android.phone.mrpc.core.Transport;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cld implements IRpcService, INotProguard {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RpcFactory f17133a;
    public Context b;
    public String c = "";
    public String d = "";
    public String e = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Config {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RpcParams f17134a;

        public a(RpcParams rpcParams) {
            this.f17134a = rpcParams;
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            return "";
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public Context getApplicationContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
            }
            return cld.a(cld.this).getApplicationContext();
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public RpcParams getRpcParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RpcParams) ipChange.ipc$dispatch("cc287401", new Object[]{this});
            }
            return this.f17134a;
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public Transport getTransport() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Transport) ipChange.ipc$dispatch("36cb0cc1", new Object[]{this});
            }
            return HttpManager.getInstance(getApplicationContext());
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public String getUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f17134a.getGwUrl();
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public boolean isGzip() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue();
            }
            return this.f17134a.isGzip();
        }

        @Override // com.alipay.vi.android.phone.mrpc.core.Config
        public String sign(Context context, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2ca88008", new Object[]{this, context, str, str2});
            }
            return "";
        }
    }

    static {
        t2o.a(245366865);
    }

    public static /* synthetic */ Context a(cld cldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9850dd0f", new Object[]{cldVar});
        }
        return cldVar.b;
    }

    public final Config b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("80da21e5", new Object[]{this});
        }
        RpcParams rpcParams = new RpcParams();
        rpcParams.setGwUrl(this.c);
        rpcParams.setHeaders(c());
        return new a(rpcParams);
    }

    public final List<Header> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19344190", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, this.d));
        arrayList.add(new BasicHeader("appId", this.e));
        arrayList.add(new BasicHeader(HeaderConstant.HEADER_KEY_OPERATION_TYPE, "com.zoloz.zhub.factor.next"));
        return arrayList;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1634eadf", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public <T> T getRpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("eba1321b", new Object[]{this, cls});
        }
        RpcFactory rpcFactory = new RpcFactory(b());
        this.f17133a = rpcFactory;
        rpcFactory.setContext(this.b);
        return (T) this.f17133a.getRpcProxy(cls);
    }

    @Override // com.alipay.mobile.verifyidentity.rpc.IRpcService
    public void setGW(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523025e3", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
