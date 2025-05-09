package com.taobao.umipublish.extension;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cfv;
import tb.eev;
import tb.g6e;
import tb.ifv;
import tb.shd;
import tb.t2o;
import tb.u5e;
import tb.wyc;
import tb.ywd;
import tb.zev;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiExtensionFactory implements u5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g6e mIUmiLifecycle = new zev();
    private shd mIRecordService = new cfv();
    private ywd mITnodeRegister = new ifv();
    private wyc mNavExtension = new eev();

    static {
        t2o.a(944767010);
        t2o.a(944767006);
    }

    @Override // tb.u5e
    public <T> T getExtension(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("57944325", new Object[]{this, cls});
        }
        if (cls == g6e.class) {
            return (T) this.mIUmiLifecycle;
        }
        if (cls == shd.class) {
            return (T) this.mIRecordService;
        }
        if (cls == ywd.class) {
            return (T) this.mITnodeRegister;
        }
        if (cls == wyc.class) {
            return (T) this.mNavExtension;
        }
        return null;
    }
}
