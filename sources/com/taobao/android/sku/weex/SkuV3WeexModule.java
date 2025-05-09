package com.taobao.android.sku.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.d3q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuV3WeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Sku_V3_Detail";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements d3q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f9462a;

        public a(SkuV3WeexModule skuV3WeexModule, JSCallback jSCallback) {
            this.f9462a = jSCallback;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            JSCallback jSCallback = this.f9462a;
            if (jSCallback != null) {
                if (objArr == null || objArr.length <= 0) {
                    obj = null;
                } else {
                    obj = objArr[0];
                }
                jSCallback.invokeAndKeepAlive(obj);
            }
        }

        @Override // tb.d3q
        public void b(Object... objArr) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
                return;
            }
            JSCallback jSCallback = this.f9462a;
            if (jSCallback != null) {
                if (objArr == null || objArr.length <= 0) {
                    obj = null;
                } else {
                    obj = objArr[0];
                }
                jSCallback.invoke(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements d3q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f9463a;

        public b(SkuV3WeexModule skuV3WeexModule, JSCallback jSCallback) {
            this.f9463a = jSCallback;
        }

        @Override // tb.d3q
        public void a(Object... objArr) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9cf6c61", new Object[]{this, objArr});
                return;
            }
            JSCallback jSCallback = this.f9463a;
            if (jSCallback != null) {
                if (objArr == null || objArr.length <= 0) {
                    obj = null;
                } else {
                    obj = objArr[0];
                }
                jSCallback.invokeAndKeepAlive(obj);
            }
        }

        @Override // tb.d3q
        public void b(Object... objArr) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a9647d2", new Object[]{this, objArr});
                return;
            }
            JSCallback jSCallback = this.f9463a;
            if (jSCallback != null) {
                if (objArr == null || objArr.length <= 0) {
                    obj = null;
                } else {
                    obj = objArr[0];
                }
                jSCallback.invoke(obj);
            }
        }
    }

    static {
        t2o.a(442499284);
    }

    public static /* synthetic */ Object ipc$super(SkuV3WeexModule skuV3WeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/weex/SkuV3WeexModule");
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            return WXSDKEngine.registerModule("Sku_V3_Detail", SkuV3WeexModule.class);
        } catch (Throwable unused) {
            return false;
        }
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4edb11", new Object[]{this, map, jSCallback, jSCallback2});
        } else {
            WeexModuleHelper.b(4, map, new a(this, jSCallback), new b(this, jSCallback2));
        }
    }
}
