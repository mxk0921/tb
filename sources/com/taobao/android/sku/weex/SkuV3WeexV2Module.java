package com.taobao.android.sku.weex;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.d3q;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuV3WeexV2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Sku_V3_Detail";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d3q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f9464a;

        public a(SkuV3WeexV2Module skuV3WeexV2Module, pvh pvhVar) {
            this.f9464a = pvhVar;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9464a;
            if (pvhVar != null) {
                pvhVar.a(WeexModuleHelper.c(objArr));
            }
        }

        @Override // tb.d3q
        public void b(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9464a;
            if (pvhVar != null) {
                pvhVar.b(WeexModuleHelper.c(objArr));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements d3q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f9465a;

        public b(SkuV3WeexV2Module skuV3WeexV2Module, pvh pvhVar) {
            this.f9465a = pvhVar;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9465a;
            if (pvhVar != null) {
                pvhVar.a(WeexModuleHelper.c(objArr));
            }
        }

        @Override // tb.d3q
        public void b(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9465a;
            if (pvhVar != null) {
                pvhVar.b(WeexModuleHelper.c(objArr));
            }
        }
    }

    static {
        t2o.a(442499287);
    }

    public SkuV3WeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(SkuV3WeexV2Module skuV3WeexV2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/weex/SkuV3WeexV2Module");
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            return MUSEngine.registerModule("Sku_V3_Detail", SkuV3WeexV2Module.class);
        } catch (Throwable unused) {
            return false;
        }
    }

    @MUSMethod(uiThread = true)
    public void dispatchMessage(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398fb94e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            WeexModuleHelper.b(4, jSONObject, new a(this, pvhVar), new b(this, pvhVar2));
        }
    }
}
