package com.taobao.android.live.plugin.proxy.usertask;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.proxy.UserTaskProxyX;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import tb.k2n;
import tb.t2o;
import tb.u7e;
import tb.vae;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserTaskProxy extends k2n<IUserTaskProxy> implements IUserTaskProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UserTaskProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final UserTaskProxy f8774a = new UserTaskProxy();

        static {
            t2o.a(806355303);
        }

        public static /* synthetic */ UserTaskProxy a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UserTaskProxy) ipChange.ipc$dispatch("12c9f8dd", new Object[0]);
            }
            return f8774a;
        }
    }

    static {
        t2o.a(806355301);
        t2o.a(806355298);
    }

    public static UserTaskProxy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTaskProxy) ipChange.ipc$dispatch("151b7c37", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(UserTaskProxy userTaskProxy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/proxy/usertask/UserTaskProxy");
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public u7e createUserController(String str, String str2) {
        u7e u7eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7e) ipChange.ipc$dispatch("de6429ee", new Object[]{this, str, str2});
        }
        IUserTaskProxy real = getReal();
        if (real != null) {
            u7eVar = real.createUserController(str, str2);
        } else {
            u7eVar = null;
        }
        FlexaLiveX.w("[UserTaskProxy#createUserController]  value: " + u7eVar);
        return u7eVar;
    }

    @Override // com.taobao.android.live.plugin.proxy.usertask.IUserTaskProxy
    public vae createWVPluginClass() {
        vae vaeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vae) ipChange.ipc$dispatch("26dcdb3d", new Object[]{this});
        }
        IUserTaskProxy real = getReal();
        if (real != null) {
            vaeVar = real.createWVPluginClass();
        } else {
            vaeVar = null;
        }
        FlexaLiveX.w("[UserTaskProxy#createWVPluginClass ]  value: " + vaeVar);
        return vaeVar;
    }

    @Override // tb.k2n
    public String getIProxyKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6fa8b95", new Object[]{this});
        }
        return IUserTaskProxy.KEY;
    }

    @Override // tb.k2n
    public String getLocalClassName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48c0fdcb", new Object[]{this});
        }
        return "com.taobao.android.live.plugin.atype.flexalocal.proxy.UserTaskProxyX";
    }

    @Override // tb.k2n
    public String getOrangeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d3bd33e", new Object[]{this});
        }
        return "installUserTaskPlugin";
    }

    @Override // tb.k2n
    public String getTrackName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c86a5339", new Object[]{this});
        }
        return "平台任务";
    }

    private UserTaskProxy() {
        try {
            initAType();
        } catch (Throwable th) {
            FlexaLiveX.w("[UserTaskProxy<init>] error: " + th.getMessage());
        }
    }

    @Override // tb.k2n
    public <ProxyType extends IUserTaskProxy> ProxyType createLocalFromTpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyType) ((IUserTaskProxy) ipChange.ipc$dispatch("5c689400", new Object[]{this})) : new UserTaskProxyX();
    }
}
