package com.alibaba.android.ultron.vfw.weex2.module;

import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.ArrayList;
import java.util.List;
import tb.hav;
import tb.qbv;
import tb.s0m;
import tb.t2o;
import tb.v9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2ImagePreloadModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeImgListDownLoad";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f2384a;

        public a(Object obj) {
            this.f2384a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) this.f2384a) {
                    if (obj instanceof String) {
                        arrayList.add((String) obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    hav.d("UltronWeex2ImagePreloadModule.downloadImageList", "preloadList is empty");
                    return;
                }
                s0m B = s0m.B();
                if (B == null) {
                    hav.d("UltronWeex2ImagePreloadModule.downloadImageList", "phenixInstance is null");
                    return;
                }
                hav.d("UltronWeex2ImagePreloadModule.downloadImageList", CredentialRpcData.ACTION_FETCH);
                B.e0("common", arrayList).b();
            } catch (Exception e) {
                hav.d("UltronWeex2ImagePreloadModule.downloadImageList", e.toString());
            }
        }
    }

    static {
        t2o.a(157286957);
    }

    public UltronWeex2ImagePreloadModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2ImagePreloadModule ultronWeex2ImagePreloadModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2ImagePreloadModule");
    }

    @MUSMethod(uiThread = false)
    public void downloadImageList(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4a5ed4", new Object[]{this, obj});
        } else if (!(obj instanceof List)) {
            hav.d("UltronWeex2ImagePreloadModule.downloadImageList", "invalid input");
        } else if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableImgPreloadByWeex", true)) {
            hav.d("UltronWeex2ImagePreloadModule.downloadImageList", "switcher is off");
        } else {
            qbv.j().r().b(new a(obj));
        }
    }
}
