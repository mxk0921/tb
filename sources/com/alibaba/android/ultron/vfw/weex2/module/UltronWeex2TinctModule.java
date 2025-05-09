package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.nbq;
import tb.qbv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2TinctModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeTinct";
    private static final String TINCT_BIZ_NAME = "trade_weex2";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2385a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f2385a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nbq.c(UltronWeex2TinctModule.TINCT_BIZ_NAME, this.f2385a, this.b, "default");
            }
        }
    }

    static {
        t2o.a(157286960);
    }

    public UltronWeex2TinctModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2TinctModule ultronWeex2TinctModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2TinctModule");
    }

    @MUSMethod(uiThread = false)
    public void tinct(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2b3ae5", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.e("UltronWeex2TinctModule.tinct", "changeType or configType invalid");
        } else {
            nbq.c(TINCT_BIZ_NAME, str, str2, "default");
        }
    }

    @MUSMethod(uiThread = false)
    public void tinctAsync(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb0bded", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.e("UltronWeex2TinctModule.tinctAsync", "changeType or configType invalid");
        } else {
            qbv.j().r().b(new a(str, str2));
        }
    }
}
