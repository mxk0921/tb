package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
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
import tb.ckf;
import tb.t2o;
import tb.wnl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSObservablePageStorageModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class a implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Activity f11556a;
        public final String b;
        public final String c;
        public final Object d;

        static {
            t2o.a(815792619);
        }

        public a(MUSObservablePageStorageModule mUSObservablePageStorageModule, Activity activity, String str, String str2, Object obj) {
            ckf.g(activity, "activity");
            ckf.g(str, "namespace");
            ckf.g(str2, "key");
            ckf.g(obj, "value");
            this.f11556a = activity;
            this.b = str;
            this.c = str2;
            this.d = obj;
        }

        /* renamed from: a */
        public Boolean call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a99c6222", new Object[]{this});
            }
            return Boolean.valueOf(wnl.INSTANCE.b(this.f11556a, this.b, this.c, this.d));
        }
    }

    static {
        t2o.a(815792618);
    }

    public MUSObservablePageStorageModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSObservablePageStorageModule mUSObservablePageStorageModule, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSObservablePageStorageModule");
    }

    @MUSMethod
    public final void configNamespace(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd386b0", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        Context uIContext = getInstance().getUIContext();
        Activity activity = uIContext instanceof Activity ? (Activity) uIContext : null;
        if (activity != null) {
            String string = jSONObject.getString("namespace");
            if (!TextUtils.isEmpty(string)) {
                int intValue = jSONObject.getIntValue("maxSize");
                wnl wnlVar = wnl.INSTANCE;
                ckf.d(string);
                wnlVar.d(activity, string, intValue);
            }
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
        Context uIContext = getInstance().getUIContext();
        Activity activity = uIContext instanceof Activity ? (Activity) uIContext : null;
        if (activity != null) {
            wnl wnlVar = wnl.INSTANCE;
            String string = jSONObject.getString("namespace");
            ckf.f(string, "getString(...)");
            String string2 = jSONObject.getString("key");
            ckf.f(string2, "getString(...)");
            wnlVar.c(activity, string, string2);
        }
    }

    @MUSMethod
    public final void subscribeMapValue(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb590630", new Object[]{this, str});
            return;
        }
        ckf.g(str, "namespace");
        bnx b = bnx.b(getInstance(), true);
        if (b != null) {
            Context uIContext = getInstance().getUIContext();
            if (uIContext instanceof Activity) {
                activity = (Activity) uIContext;
            } else {
                activity = null;
            }
            if (activity != null) {
                wnl.INSTANCE.e(activity, str, b);
            }
        }
    }

    @MUSMethod
    public final void unsubscribeMapValue(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6a2d77", new Object[]{this, str});
            return;
        }
        ckf.g(str, "namespace");
        bnx b = bnx.b(getInstance(), true);
        if (b != null) {
            Context uIContext = getInstance().getUIContext();
            if (uIContext instanceof Activity) {
                activity = (Activity) uIContext;
            } else {
                activity = null;
            }
            if (activity != null) {
                wnl.INSTANCE.f(activity, str, b);
            }
        }
    }

    @MUSMethod(uiThread = false)
    public final boolean put(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3612fd9e", new Object[]{this, jSONObject})).booleanValue();
        }
        ckf.g(jSONObject, "params");
        Context uIContext = getInstance().getUIContext();
        Activity activity = uIContext instanceof Activity ? (Activity) uIContext : null;
        if (activity == null || (obj = jSONObject.get("value")) == null) {
            return false;
        }
        String string = jSONObject.getString("namespace");
        ckf.f(string, "getString(...)");
        String string2 = jSONObject.getString("key");
        ckf.f(string2, "getString(...)");
        FutureTask futureTask = new FutureTask(new a(this, activity, string, string2, obj));
        new Handler(Looper.getMainLooper()).post(futureTask);
        Object obj2 = futureTask.get();
        ckf.f(obj2, "get(...)");
        return ((Boolean) obj2).booleanValue();
    }
}
