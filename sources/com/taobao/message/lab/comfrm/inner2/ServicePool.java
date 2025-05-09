package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ServicePool implements ServiceProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ConcurrentHashMap<Class, Object> mObjectByInterface = new ConcurrentHashMap<>();

    static {
        t2o.a(537919636);
        t2o.a(537919637);
    }

    public <T> void register(Class<T> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41f7ef", new Object[]{this, cls, obj});
        } else {
            this.mObjectByInterface.put(cls, obj);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
    public <T> T service(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a9acf86c", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ServiceProvider
    public <T> T service(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6b653b51", new Object[]{this, cls}) : (T) this.mObjectByInterface.get(cls);
    }
}
