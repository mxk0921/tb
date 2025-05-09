package com.taobao.android.weex_framework.module;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.a;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import tb.t2o;
import tb.u8x;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAdapterInstance;
    private final MUSDKInstance mInstance;
    private Set<String> mModuleMethods = new HashSet();
    private final String mModuleName;

    static {
        t2o.a(982516094);
    }

    public MUSModule(String str, MUSDKInstance mUSDKInstance) {
        this.mModuleName = str;
        this.mInstance = mUSDKInstance;
        onModuleCreate(this);
    }

    public final void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            onDestroy();
        }
    }

    public Object dispatchMethod(String str, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("51e43020", new Object[]{this, str, mUSValueArr, obj});
        }
        return onDispatchMethod(this, str, mUSValueArr, obj);
    }

    public Object dispatchMethodToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f116c87e", new Object[]{this, runnable});
        }
        if (getInstance() != null && !getInstance().isDestroyed()) {
            u8x.c("Inst#callModule/post", u8x.k());
            ((MUSDKInstance) getInstance()).postTaskToMain(runnable);
        }
        return null;
    }

    public MUSValue getArgument(MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("4793a668", new Object[]{this, mUSValueArr, new Integer(i)});
        }
        if (i >= mUSValueArr.length) {
            return null;
        }
        return mUSValueArr[i];
    }

    public a getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e88d359f", new Object[]{this});
        }
        a aVar = this.mAdapterInstance;
        if (aVar != null) {
            return aVar;
        }
        return this.mInstance;
    }

    public Set<String> getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d31d88b2", new Object[]{this});
        }
        return this.mModuleMethods;
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.mModuleName;
    }

    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            onModuleDestroy(this);
        }
    }

    public Object onDispatchMethod(MUSModule mUSModule, String str, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8866c9be", new Object[]{this, mUSModule, str, mUSValueArr, obj});
        }
        return null;
    }

    public void onModuleCreate(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe82ab6d", new Object[]{this, mUSModule});
        }
    }

    public void onModuleDestroy(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
        }
    }

    public void setAdapterInstance(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf3b074", new Object[]{this, aVar});
        } else {
            this.mAdapterInstance = aVar;
        }
    }
}
