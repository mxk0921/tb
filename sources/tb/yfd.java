package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.ir.IRProxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yfd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IRProxyX";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IRProxy> f32042a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yfd f32043a = new yfd();

        static {
            t2o.a(806355166);
        }

        public static /* synthetic */ yfd a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yfd) ipChange.ipc$dispatch("4f55f1c2", new Object[0]);
            }
            return f32043a;
        }
    }

    static {
        t2o.a(806355165);
    }

    public static yfd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yfd) ipChange.ipc$dispatch("84cb5587", new Object[0]);
        }
        return a.a();
    }

    public void a(String str, IRProxy iRProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c983d6a0", new Object[]{this, str, iRProxy});
        } else if (!TextUtils.isEmpty(str) && iRProxy != null && !((HashMap) this.f32042a).containsKey(str)) {
            FlexaLiveX.w("<IRProxyX> [addIRProxy] key:" + str + "; irProxy:" + iRProxy + " add success");
            ((HashMap) this.f32042a).put(str, iRProxy);
        }
    }

    public IRProxy b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRProxy) ipChange.ipc$dispatch("9127e805", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            FlexaLiveX.w("<IRProxyX> [getIRProxy] empty key");
            return null;
        } else if (((HashMap) this.f32042a).get(str) == null) {
            FlexaLiveX.w("<IRProxyX> [getIRProxy] key:" + str + "; irProxy is null");
            return null;
        } else {
            FlexaLiveX.w("<IRProxyX> [getIRProxy] key:" + str + "; irProxy:" + ((HashMap) this.f32042a).get(str) + " get success");
            return (IRProxy) ((HashMap) this.f32042a).get(str);
        }
    }
}
