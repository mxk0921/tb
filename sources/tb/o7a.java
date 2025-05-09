package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import java.util.Map;
import tb.n8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class o7a extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements n8v.c<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25186a;

        public a(String str) {
            this.f25186a = str;
        }

        /* renamed from: a */
        public void onSuccess(byte[] bArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2663c9b2", new Object[]{this, bArr});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (bArr != null) {
                str = new String(bArr, uj3.UTF_8);
            } else {
                str = "";
            }
            jSONObject.put((JSONObject) "value", str);
            g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.f25186a);
            if (f != null) {
                f.invoke(jSONObject);
            }
        }

        @Override // tb.n8v.c
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            ckf.g(str, "p0");
            g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(this.f25186a);
            if (f != null) {
                f.invoke(new JSONObject());
            }
        }
    }

    static {
        t2o.a(478150947);
    }

    public static /* synthetic */ Object ipc$super(o7a o7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/GetFirstCacheNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        gd4.INSTANCE.b(new a(str3));
        return true;
    }
}
