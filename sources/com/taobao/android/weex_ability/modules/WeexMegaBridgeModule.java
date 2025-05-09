package com.taobao.android.weex_ability.modules;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import anet.channel.util.HttpConstant;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.mega.MegaModule;
import com.taobao.android.weex.module.WeexInnerModule;
import java.util.HashMap;
import java.util.Map;
import tb.d7x;
import tb.f4x;
import tb.pl4;
import tb.q6x;
import tb.s2d;
import tb.t2o;
import tb.u8x;
import tb.x8x;
import tb.xq;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexMegaBridgeModule extends WeexInnerModule implements MegaModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "megabilityBridge";
    private zq mAbilityEnv;
    private AbilityHubAdapter mAbilityHubAdapter;
    public xq mInvokeContext;
    public static final String[] METHODS = {"asyncCall", "syncCall"};
    private static final s2d sEmtpyCallback = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9935a;

        public b(WeexMegaBridgeModule weexMegaBridgeModule, f4x f4xVar) {
            this.f9935a = f4xVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            f4x f4xVar = this.f9935a;
            if (f4xVar != null) {
                f4xVar.a(executeResult.toFormattedData());
            }
        }
    }

    private Map<String, Object> buildCommonUserContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a5a85167", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instance", getWeexInstance());
        return hashMap;
    }

    private Map<String, Object> buildCommonUserData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f5ba0e2a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (getWeexInstance() instanceof WeexInstance) {
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
            hashMap.put("url", weexInstanceImpl.getBundleUrl());
            hashMap.put(pl4.KEY_PAGE_ID, String.valueOf(weexInstanceImpl.getInstanceId()));
            hashMap.put("ut_page_object", weexInstanceImpl.getTag("ut_page_object"));
        }
        return hashMap;
    }

    private String getOriginURLString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("239e120b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        if (parse.isHierarchical()) {
            sb.append(parse.getScheme());
            sb.append(HttpConstant.SCHEME_SPLIT);
            sb.append(parse.getAuthority());
        }
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(WeexMegaBridgeModule weexMegaBridgeModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -887693520) {
            super.onInit((String) objArr[0], (d7x) objArr[1]);
            return null;
        } else if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_ability/modules/WeexMegaBridgeModule");
        }
    }

    @Override // com.taobao.android.weex.mega.MegaModule
    public void asyncCall(String str, String str2, JSONObject jSONObject, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8ae7a9", new Object[]{this, str, str2, jSONObject, f4xVar});
            return;
        }
        u8x.a("MegaAdapterAsyncCall");
        this.mAbilityEnv.a(getWeexInstance().getContext());
        this.mAbilityHubAdapter.k(str, str2, this.mInvokeContext, jSONObject, new b(this, f4xVar), false);
        u8x.b("MegaAdapterAsyncCall");
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        super.onInit(str, d7xVar);
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
        this.mAbilityEnv = new zq(getWeexInstance().getBusinessId(), "Weex");
        this.mAbilityHubAdapter = new AbilityHubAdapter(this.mAbilityEnv);
        this.mAbilityEnv.a(getWeexInstance().getContext());
        this.mInvokeContext = new xq(this.mAbilityEnv);
        this.mInvokeContext.c(buildCommonUserContext());
        this.mInvokeContext.e(buildCommonUserData());
        View rootView = weexInstanceImpl.getRootView();
        if (weexInstanceImpl.getExtend(q6x.class) instanceof x8x) {
            x8x x8xVar = (x8x) weexInstanceImpl.getExtend(q6x.class);
            if (x8xVar.H() != null) {
                rootView = x8xVar.H().getRootView();
            }
        }
        this.mInvokeContext.p(rootView);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        this.mAbilityHubAdapter.n();
    }

    @Override // com.taobao.android.weex.mega.MegaModule
    public WeexValue syncCall(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("967fec38", new Object[]{this, str, str2, jSONObject});
        }
        u8x.a("MegaAdapterSyncCall");
        this.mAbilityEnv.a(getWeexInstance().getContext());
        ExecuteResult z = this.mAbilityHubAdapter.z(str, str2, this.mInvokeContext, jSONObject, sEmtpyCallback);
        u8x.b("MegaAdapterSyncCall");
        u8x.a("MegaToFormattedData");
        JSONObject jSONObject2 = new JSONObject(z.toFormattedData());
        u8x.b("MegaToFormattedData");
        return WeexValueImpl.ofJSONObject(jSONObject2);
    }

    static {
        t2o.a(980418627);
        t2o.a(982515924);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        if ("asyncCall".equals(str2)) {
            argCount(weexValueArr, 4);
            asyncCall(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toJSONObjectOrNull(), getCallback(weexValueArr, 3));
            return null;
        } else if (!"syncCall".equals(str2)) {
            return null;
        } else {
            argCount(weexValueArr, 3);
            return syncCall(getArg(weexValueArr, 0).toStringValueOrNull(), getArg(weexValueArr, 1).toStringValueOrNull(), getArg(weexValueArr, 2).toJSONObjectOrNull());
        }
    }
}
