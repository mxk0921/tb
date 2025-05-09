package com.alibaba.security.client.smart.core.core;

import android.content.Context;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.W;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.security.client.smart.core.model.EvalResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongNativeManager extends W {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "WuKongNativeManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final WukongNativeManager f2641a = new WukongNativeManager();

        public static /* synthetic */ WukongNativeManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WukongNativeManager) ipChange.ipc$dispatch("6537ebda", new Object[0]);
            }
            return f2641a;
        }
    }

    private void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{this, context, str, str2, str3});
        }
    }

    public static WukongNativeManager c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WukongNativeManager) ipChange.ipc$dispatch("47db0adc", new Object[0]) : a.f2641a;
    }

    public static /* synthetic */ Object ipc$super(WukongNativeManager wukongNativeManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/client/smart/core/core/WukongNativeManager");
    }

    private native String nativeEngineVersion();

    private native String nativeGetSyncPipeConfig(List<String> list);

    private native byte[] nativeNv21ToRgbOrBgr(byte[] bArr, int i, int i2, int i3);

    private native HashMap<String, Object> nativeRegisterPip(int i, ArrayList<String> arrayList);

    private native void nativeRegisterProcessor(String str, String str2, List<String> list);

    private native HashMap<String, Object> nativeUnregisterOrResetPipe(int i, int i2);

    private native void nativeUnregisterProcessor(List<String> list);

    private native HashMap<String, Object> nativeWritePip(int i, String str);

    private native String nativeWuKongGetStatistics();

    private native boolean nativeWuKongInit();

    private native EvalResult nativeWuKongProcess(List<String> list, String str);

    private native void nativeWuKongRelease(List<String> list);

    private native boolean nativeWuKongUpdateExp(List<String> list, String str, String str2);

    public void b(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (b()) {
            nativeWuKongRelease(list);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!b()) {
            return null;
        }
        return nativeEngineVersion();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (!b()) {
            return null;
        }
        return nativeWuKongGetStatistics();
    }

    public boolean a(Context context, List<String> list, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f9eb87d", new Object[]{this, context, list, str, str2, str3, str4})).booleanValue();
        }
        if (!b()) {
            return false;
        }
        return nativeWuKongUpdateExp(list, str, str2);
    }

    public void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (b()) {
            nativeUnregisterProcessor(list);
        }
    }

    public void a(final Ba.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cbdff0", new Object[]{this, aVar});
        } else if (b()) {
            nativeWuKongInit();
            aVar.a(true, "success");
        } else {
            b(new OnRemoteSoLoadListener() { // from class: tb.ntz
                @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
                public final void onResult(String str, boolean z, String str2) {
                    WukongNativeManager.this.a(aVar, str, z, str2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ba.a aVar, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f003a4", new Object[]{this, aVar, str, new Boolean(z), str2});
        } else if (!z) {
            aVar.a(false, str2);
        } else {
            nativeWuKongInit();
            aVar.a(true, "success");
        }
    }

    public EvalResult a(List<String> list, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EvalResult) ipChange.ipc$dispatch("a89fe92b", new Object[]{this, list, inferContext});
        }
        if (!b()) {
            return new EvalResult(false, false, "so load fail");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String jSONString = JsonUtils.toJSONString(inferContext);
        StringBuilder a2 = Kb.a("nativeWuKongProcess cost -->>> infer context seri to string cost time: ");
        a2.append(System.currentTimeMillis() - currentTimeMillis);
        Logging.d(e, a2.toString());
        return nativeWuKongProcess(list, jSONString);
    }

    public byte[] a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ba9ee49", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (!b()) {
            return null;
        }
        return nativeNv21ToRgbOrBgr(bArr, i, i2, i3);
    }

    public void a(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3a26d", new Object[]{this, str, str2, list});
        } else if (b()) {
            nativeRegisterProcessor(str, str2, list);
        }
    }

    public String a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        if (!b()) {
            return null;
        }
        return nativeGetSyncPipeConfig(list);
    }

    public HashMap<String, Object> a(int i, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("77e85c92", new Object[]{this, new Integer(i), arrayList});
        }
        if (!b()) {
            return null;
        }
        return nativeRegisterPip(i, arrayList);
    }

    public HashMap<String, Object> a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4bea62c8", new Object[]{this, new Integer(i), str});
        }
        if (!b()) {
            return null;
        }
        return nativeWritePip(i, str);
    }

    public HashMap<String, Object> a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("67d8662b", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (!b()) {
            return null;
        }
        return nativeUnregisterOrResetPipe(i, i2);
    }
}
