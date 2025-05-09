package com.taobao.search.musie;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import tb.bnx;
import tb.cca;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSObservableValueModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class a implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f11557a;
        public final String b;
        public final Object c;

        static {
            t2o.a(815792621);
        }

        public a(MUSObservableValueModule mUSObservableValueModule, String str, String str2, Object obj) {
            ckf.g(str, "namespace");
            ckf.g(str2, "key");
            ckf.g(obj, "value");
            this.f11557a = str;
            this.b = str2;
            this.c = obj;
        }

        /* renamed from: a */
        public Boolean call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a99c6222", new Object[]{this});
            }
            return Boolean.valueOf(cca.INSTANCE.a(this.f11557a, this.b, this.c));
        }
    }

    static {
        t2o.a(815792620);
    }

    public MUSObservableValueModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSObservableValueModule mUSObservableValueModule, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSObservableValueModule");
    }

    @MUSMethod
    public final void configNamespace(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd386b0", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        String string = jSONObject.getString("namespace");
        if (!TextUtils.isEmpty(string)) {
            int intValue = jSONObject.getIntValue("maxSize");
            cca ccaVar = cca.INSTANCE;
            ckf.d(string);
            ccaVar.c(string, intValue);
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        bnx b = bnx.b(getInstance(), false);
        if (b != null) {
            b.a();
        }
    }

    @MUSMethod
    public final void remove(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6626d45", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        cca ccaVar = cca.INSTANCE;
        String string = jSONObject.getString("namespace");
        ckf.f(string, "getString(...)");
        String string2 = jSONObject.getString("key");
        ckf.f(string2, "getString(...)");
        ccaVar.b(string, string2);
    }

    @MUSMethod
    public final void subscribeMapValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb590630", new Object[]{this, str});
            return;
        }
        ckf.g(str, "namespace");
        bnx b = bnx.b(getInstance(), true);
        if (b != null) {
            cca.INSTANCE.d(str, b);
        }
    }

    @MUSMethod
    public final void unsubscribeMapValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6a2d77", new Object[]{this, str});
            return;
        }
        ckf.g(str, "namespace");
        bnx b = bnx.b(getInstance(), true);
        if (b != null) {
            cca.INSTANCE.e(str, b);
        }
    }

    @MUSMethod(uiThread = false)
    public final boolean put(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3612fd9e", new Object[]{this, jSONObject})).booleanValue();
        }
        ckf.g(jSONObject, "params");
        Object obj = jSONObject.get("value");
        if (obj == null) {
            return false;
        }
        String string = jSONObject.getString("namespace");
        ckf.f(string, "getString(...)");
        String string2 = jSONObject.getString("key");
        ckf.f(string2, "getString(...)");
        FutureTask futureTask = new FutureTask(new a(this, string, string2, obj));
        new Handler(Looper.getMainLooper()).post(futureTask);
        Object obj2 = futureTask.get();
        ckf.f(obj2, "get(...)");
        return ((Boolean) obj2).booleanValue();
    }
}
