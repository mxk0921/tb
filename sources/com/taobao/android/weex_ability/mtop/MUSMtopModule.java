package com.taobao.android.weex_ability.mtop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.mtop.a;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.amo;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSMtopModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "mtop";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum MTOP_VERSION {
        V1,
        V2;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MTOP_VERSION mtop_version, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/mtop/MUSMtopModule$MTOP_VERSION");
        }

        public static MTOP_VERSION valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MTOP_VERSION) ipChange.ipc$dispatch("9e01fa4d", new Object[]{str});
            }
            return (MTOP_VERSION) Enum.valueOf(MTOP_VERSION.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f9936a;

        public a(MUSMtopModule mUSMtopModule, pvh pvhVar) {
            this.f9936a = pvhVar;
        }

        @Override // com.taobao.android.weex_ability.mtop.a.c
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
            } else {
                this.f9936a.b(jSONObject);
            }
        }
    }

    static {
        t2o.a(980418631);
    }

    public MUSMtopModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSMtopModule mUSMtopModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/mtop/MUSMtopModule");
    }

    @MUSMethod(uiThread = false)
    public void request(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        JSONObject jSONObject2;
        a.b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f22d2c", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (getInstance() != null && !getInstance().isDestroyed()) {
            if (getInstance() instanceof MUSDKInstance) {
                String instanceEnv = ((MUSDKInstance) getInstance()).getInstanceEnv("bundleUrl");
                if (!(TextUtils.isEmpty(instanceEnv) || jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || !amo.MODULE_NAME.equals(jSONObject2.getString("__prefetch")) || (b = com.taobao.android.weex_ability.mtop.a.a().b(instanceEnv, jSONObject)) == null)) {
                    JSONObject jSONObject3 = b.f9944a;
                    if (jSONObject3 != null) {
                        pvhVar.b(jSONObject3);
                        return;
                    } else {
                        b.b(new a(this, pvhVar));
                        return;
                    }
                }
            }
            new MUSMtopRequest(MTOP_VERSION.V2).o(getInstance(), jSONObject, pvhVar, pvhVar2);
        }
    }

    @MUSMethod(uiThread = false)
    public void send(String str, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09b12c2", new Object[]{this, str, pvhVar});
        } else if (getInstance() != null && !getInstance().isDestroyed()) {
            new MUSMtopRequest(MTOP_VERSION.V1).p(getInstance(), str, pvhVar, null);
        }
    }
}
