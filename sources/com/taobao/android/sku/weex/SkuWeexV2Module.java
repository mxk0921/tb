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
public class SkuWeexV2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "NewBuy_Detail";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d3q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f9468a;

        public a(SkuWeexV2Module skuWeexV2Module, pvh pvhVar) {
            this.f9468a = pvhVar;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9468a;
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
            pvh pvhVar = this.f9468a;
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
        public final /* synthetic */ pvh f9469a;

        public b(SkuWeexV2Module skuWeexV2Module, pvh pvhVar) {
            this.f9469a = pvhVar;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            pvh pvhVar = this.f9469a;
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
            pvh pvhVar = this.f9469a;
            if (pvhVar != null) {
                pvhVar.b(WeexModuleHelper.c(objArr));
            }
        }
    }

    static {
        t2o.a(442499293);
    }

    public SkuWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(SkuWeexV2Module skuWeexV2Module, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/weex/SkuWeexV2Module");
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            return MUSEngine.registerModule("NewBuy_Detail", SkuWeexV2Module.class);
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
            WeexModuleHelper.b(3, jSONObject, new a(this, pvhVar), new b(this, pvhVar2));
        }
    }
}
