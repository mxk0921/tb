package com.ap.zoloz.hummer.common;

import android.os.Bundle;
import android.util.Base64;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMFacadeBuilder;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import com.zoloz.zhub.common.factor.model.FactorNextResponseInner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bld;
import tb.dfb;
import tb.f9b;
import tb.jho;
import tb.jqn;
import tb.qzd;
import tb.sho;
import tb.t2o;
import tb.upx;
import tb.vk0;
import tb.vqx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NativeTask extends TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeTask";
    private boolean isZimDestroyed;
    private ZIMFacade mZimFacade;
    private int nextIndexFromValidate;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements dfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TaskConfig f4607a;

        public a(TaskConfig taskConfig) {
            this.f4607a = taskConfig;
        }

        @Override // tb.dfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ee5ec4b", new Object[]{this});
            } else {
                NativeTask.access$000(NativeTask.this, this.f4607a);
            }
        }

        @Override // tb.dfb
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97c8cf5e", new Object[]{this, new Boolean(z)});
            } else if (z) {
                NativeTask.access$100(NativeTask.this);
            } else {
                f9b f9bVar = NativeTask.this.mHummerContext;
                if (f9bVar != null) {
                    f9bVar.u(this.f4607a.name, "Z7001");
                    NativeTask nativeTask = NativeTask.this;
                    nativeTask.mITaskTrackerCallback.a(nativeTask.mHummerContext, -1);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ZimMessageChannel {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements bld {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ZimMessageChannelCallback f4609a;

            public a(ZimMessageChannelCallback zimMessageChannelCallback) {
                this.f4609a = zimMessageChannelCallback;
            }

            @Override // tb.bld
            public void a(sho shoVar) {
                List<FactorNextResponseInner> list;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
                } else if (NativeTask.this.mHummerContext != null && shoVar != null) {
                    Bundle bundle = new Bundle();
                    FactorNextResponse factorNextResponse = shoVar.f28058a;
                    if (factorNextResponse == null || "network_exception".equals(shoVar.b)) {
                        bundle.putString("responseData", null);
                        bundle.putInt(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, 3000);
                        this.f4609a.onResult(bundle);
                    } else if ("exception".equals(shoVar.b) || (list = factorNextResponse.response) == null || list.size() <= 0) {
                        NativeTask nativeTask = NativeTask.this;
                        nativeTask.mHummerContext.u(nativeTask.mTaskConfig.name, "Z7022");
                        NativeTask nativeTask2 = NativeTask.this;
                        nativeTask2.mHummerContext.p(nativeTask2.mTaskConfig.name, "Z7022");
                        if (NativeTask.access$200(NativeTask.this) != null) {
                            NativeTask.access$200(NativeTask.this).command(4099);
                            NativeTask.access$200(NativeTask.this).destroy();
                            NativeTask.access$202(NativeTask.this, null);
                        }
                        NativeTask nativeTask3 = NativeTask.this;
                        nativeTask3.isLive = false;
                        TaskConfig taskConfig = nativeTask3.mTaskConfig;
                        if (taskConfig != null) {
                            NativeTask.access$000(nativeTask3, taskConfig);
                        }
                    } else if ("SYSTEM_ERROR".equals(factorNextResponse.response.get(0).retCode) || factorNextResponse.response.get(0).outParams == null || !factorNextResponse.response.get(0).outParams.containsKey("validateResponse")) {
                        NativeTask nativeTask4 = NativeTask.this;
                        nativeTask4.mHummerContext.u(nativeTask4.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                        NativeTask nativeTask5 = NativeTask.this;
                        nativeTask5.mHummerContext.p(nativeTask5.mTaskConfig.name, factorNextResponse.response.get(0).retCodeSub);
                        if (NativeTask.access$200(NativeTask.this) != null) {
                            NativeTask.access$200(NativeTask.this).command(4099);
                            NativeTask.access$200(NativeTask.this).destroy();
                            NativeTask.access$202(NativeTask.this, null);
                        }
                        NativeTask.this.isLive = false;
                        if (factorNextResponse.nextIndex.intValue() != 0) {
                            NativeTask.access$302(NativeTask.this, factorNextResponse.nextIndex.intValue());
                        }
                        NativeTask nativeTask6 = NativeTask.this;
                        TaskConfig taskConfig2 = nativeTask6.mTaskConfig;
                        if (taskConfig2 != null) {
                            NativeTask.access$000(nativeTask6, taskConfig2);
                        }
                    } else {
                        String str = factorNextResponse.versionToken;
                        if (!StringUtil.isNullorEmpty(str)) {
                            NativeTask.this.mHummerContext.a("versionToken", "context", str);
                        }
                        NativeTask.access$302(NativeTask.this, factorNextResponse.nextIndex.intValue());
                        NativeTask.this.mHummerContext.m(shoVar.f28058a.zStack);
                        for (int i = 0; i < factorNextResponse.response.size(); i++) {
                            if (factorNextResponse.response.get(i).outParams != null) {
                                for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i).outParams.entrySet()) {
                                    NativeTask.this.mHummerContext.a(entry.getKey(), "serverResponse", entry.getValue());
                                }
                            }
                        }
                        String str2 = new String(Base64.decode((String) factorNextResponse.response.get(0).outParams.get("validateResponse"), 8));
                        if ("SYSTEM_SUCCESS".equals(factorNextResponse.response.get(0).retCode)) {
                            bundle.putInt(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, 1000);
                        } else if ("VERIFY_RETRY".equals(factorNextResponse.response.get(0).retCode) || "VERIFY_NEXT".equals(factorNextResponse.response.get(0).retCode)) {
                            bundle.putInt(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, 3000);
                        } else if ("VERIFY_FAILURE".equals(factorNextResponse.response.get(0).retCode)) {
                            bundle.putInt(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, 2006);
                        }
                        bundle.putString("responseData", str2);
                        this.f4609a.onResult(bundle);
                    }
                }
            }
        }

        public void onAction(Bundle bundle, ZimMessageChannelCallback zimMessageChannelCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b399c2d", new Object[]{this, bundle, zimMessageChannelCallback});
                return;
            }
            String string = bundle.getString(MtopAbility.API_REQUEST_DATA);
            NativeTask nativeTask = NativeTask.this;
            nativeTask.mHummerContext.u(nativeTask.mTaskConfig.name, "Z7035");
            f9b f9bVar = NativeTask.this.mHummerContext;
            if (f9bVar != null) {
                f9bVar.a("validateRequest", "argument", string);
                NativeTask.this.mHummerContext.t();
                jho d = jho.d();
                a aVar = new a(zimMessageChannelCallback);
                jho d2 = jho.d();
                f9b f9bVar2 = NativeTask.this.mHummerContext;
                d.h(aVar, d2.c(f9bVar2, f9bVar2.h("validate"), false));
            }
        }
    }

    static {
        t2o.a(245366843);
    }

    public static /* synthetic */ void access$000(NativeTask nativeTask, TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c534888c", new Object[]{nativeTask, taskConfig});
        } else {
            nativeTask.handleSystemError(taskConfig);
        }
    }

    public static /* synthetic */ void access$100(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadfadbf", new Object[]{nativeTask});
        } else {
            nativeTask.next();
        }
    }

    public static /* synthetic */ ZIMFacade access$200(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZIMFacade) ipChange.ipc$dispatch("706e8f6e", new Object[]{nativeTask});
        }
        return nativeTask.mZimFacade;
    }

    public static /* synthetic */ ZIMFacade access$202(NativeTask nativeTask, ZIMFacade zIMFacade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZIMFacade) ipChange.ipc$dispatch("6ada037a", new Object[]{nativeTask, zIMFacade});
        }
        nativeTask.mZimFacade = zIMFacade;
        return zIMFacade;
    }

    public static /* synthetic */ int access$300(NativeTask nativeTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dcec8f0", new Object[]{nativeTask})).intValue();
        }
        return nativeTask.nextIndexFromValidate;
    }

    public static /* synthetic */ int access$302(NativeTask nativeTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b14c4e9b", new Object[]{nativeTask, new Integer(i)})).intValue();
        }
        nativeTask.nextIndexFromValidate = i;
        return i;
    }

    public static /* synthetic */ void access$400(NativeTask nativeTask, f9b f9bVar, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6da519", new Object[]{nativeTask, f9bVar, jSONObject, map});
        } else {
            nativeTask.addOutputParam(f9bVar, jSONObject, map);
        }
    }

    public static /* synthetic */ boolean access$502(NativeTask nativeTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c40daff", new Object[]{nativeTask, new Boolean(z)})).booleanValue();
        }
        nativeTask.isZimDestroyed = z;
        return z;
    }

    private void addOutputParam(f9b f9bVar, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f733beaf", new Object[]{this, f9bVar, jSONObject, map});
        } else if (jSONObject != null) {
            Iterator<Object> it = jSONObject.values().iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                String str = (String) jSONObject2.get("pipeType");
                String str2 = (String) jSONObject2.get("value");
                if (map.get(str2) != null) {
                    f9bVar.a(str2, str, map.get(str2));
                }
            }
        }
    }

    private void doZimTask(String str, HashMap<String, String> hashMap, ZimMessageChannel zimMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c16280", new Object[]{this, str, hashMap, zimMessageChannel});
            return;
        }
        BioLog.i("NativeTask call mZimFacade.verify");
        this.mZimFacade.verify(str, hashMap, zimMessageChannel, new c(str));
    }

    private void handleSystemError(TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551aafd4", new Object[]{this, taskConfig});
            return;
        }
        int i = this.nextIndexFromValidate;
        if (i != 0) {
            this.mITaskTrackerCallback.a(this.mHummerContext, i);
        } else {
            this.mITaskTrackerCallback.a(this.mHummerContext, taskConfig.navigateConfig.containsKey("error") ? ((Integer) ((Map) taskConfig.navigateConfig.get("error")).get("index")).intValue() : -1);
        }
    }

    public static /* synthetic */ Object ipc$super(NativeTask nativeTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/hummer/common/NativeTask");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements ZIMCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4610a;

        public c(String str) {
            this.f4610a = str;
        }

        public boolean response(ZIMResponse zIMResponse) {
            int i;
            NativeTask nativeTask;
            qzd qzdVar;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
            }
            if (NativeTask.this.mHummerContext == null) {
                return true;
            }
            BioLog.i(NativeTask.TAG + zIMResponse.toString());
            TaskConfig taskConfig = NativeTask.this.mTaskConfig;
            if (taskConfig != null) {
                boolean z2 = taskConfig.inputParams.get("validateDelegate") != null && ((Boolean) ((Map) NativeTask.this.mTaskConfig.inputParams.get("validateDelegate")).get("value")).booleanValue();
                HashMap hashMap = new HashMap();
                hashMap.put("prodRetCode", String.valueOf(zIMResponse.code));
                hashMap.put("prodSubRetCode", zIMResponse.subCode);
                hashMap.put("prodName", NativeTask.this.mTaskConfig.name);
                hashMap.put("zimId", this.f4610a);
                jqn.a().c("zprodResult", hashMap);
                int i2 = zIMResponse.code;
                String str = null;
                if (i2 == 1000) {
                    if (!z2) {
                        NativeTask nativeTask2 = NativeTask.this;
                        nativeTask2.mHummerContext.u(nativeTask2.mTaskConfig.name, zIMResponse.subCode);
                        str = "next";
                    }
                    Map<String, Object> map = NativeTask.this.mTaskConfig.navigateConfig;
                    if (map != null && map.containsKey("next")) {
                        NativeTask nativeTask3 = NativeTask.this;
                        NativeTask.access$400(nativeTask3, nativeTask3.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get("next")).get("outputParams"), zIMResponse.extInfo);
                    }
                } else if (i2 == 1001) {
                    if (!StringUtil.isNullorEmpty(zIMResponse.subCode)) {
                        NativeTask nativeTask4 = NativeTask.this;
                        nativeTask4.mHummerContext.u(nativeTask4.mTaskConfig.name, zIMResponse.subCode);
                        NativeTask nativeTask5 = NativeTask.this;
                        nativeTask5.mHummerContext.p(nativeTask5.mTaskConfig.name, zIMResponse.subCode);
                    }
                    vk0.e().c(NativeTask.this.mIAlertManagerCallback);
                    z = true;
                } else if (i2 != 2006) {
                    NativeTask nativeTask6 = NativeTask.this;
                    nativeTask6.mHummerContext.u(nativeTask6.mTaskConfig.name, zIMResponse.subCode);
                    Map<String, Object> map2 = NativeTask.this.mTaskConfig.navigateConfig;
                    str = "back";
                    if (map2 != null && map2.containsKey(str)) {
                        NativeTask nativeTask7 = NativeTask.this;
                        NativeTask.access$400(nativeTask7, nativeTask7.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get(str)).get("outputParams"), zIMResponse.extInfo);
                    }
                } else {
                    if (!z2) {
                        NativeTask nativeTask8 = NativeTask.this;
                        nativeTask8.mHummerContext.u(nativeTask8.mTaskConfig.name, zIMResponse.subCode);
                        str = "fail";
                    }
                    Map<String, Object> map3 = NativeTask.this.mTaskConfig.navigateConfig;
                    if (map3 != null && map3.containsKey("fail")) {
                        NativeTask nativeTask9 = NativeTask.this;
                        NativeTask.access$400(nativeTask9, nativeTask9.mHummerContext, (JSONObject) ((Map) NativeTask.this.mTaskConfig.navigateConfig.get("fail")).get("outputParams"), zIMResponse.extInfo);
                    }
                }
                if (NativeTask.this.mTaskConfig.inputParams.get("useDefaultExit") != null && ((Boolean) ((Map) NativeTask.this.mTaskConfig.inputParams.get("useDefaultExit")).get("value")).booleanValue()) {
                    NativeTask.this.mHummerContext.a("zimResponse", "context", Integer.valueOf(zIMResponse.code));
                    i = -1;
                } else if (!StringUtil.isNullorEmpty(str)) {
                    i = NativeTask.this.mHummerContext.h(str);
                } else {
                    i = NativeTask.access$300(NativeTask.this);
                }
                if (!StringUtil.isNullorEmpty(str) && NativeTask.this.mHummerContext.l(str)) {
                    NativeTask.this.mHummerContext.a(vqx.ZIM_IDENTIFY_NEXTINDEX, "context", Integer.valueOf(i));
                    NativeTask.access$100(NativeTask.this);
                } else if (!z && (qzdVar = (nativeTask = NativeTask.this).mITaskTrackerCallback) != null) {
                    qzdVar.a(nativeTask.mHummerContext, i);
                }
            }
            NativeTask.access$502(NativeTask.this, true);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements bld {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.bld
        public void a(sho shoVar) {
            List<FactorNextResponseInner> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
            } else if (NativeTask.this.mHummerContext != null && shoVar != null) {
                FactorNextResponse factorNextResponse = shoVar.f28058a;
                if (factorNextResponse == null || "network_exception".equals(shoVar.b)) {
                    vk0.e().b(NativeTask.this.mIAlertManagerCallback);
                } else if ("exception".equals(shoVar.b) || (list = factorNextResponse.response) == null || list.size() <= 0) {
                    NativeTask nativeTask = NativeTask.this;
                    nativeTask.mHummerContext.u(nativeTask.mTaskConfig.name, "Z7022");
                    NativeTask nativeTask2 = NativeTask.this;
                    nativeTask2.mHummerContext.p(nativeTask2.mTaskConfig.name, "Z7022");
                    vk0.e().c(NativeTask.this.mIAlertManagerCallback);
                } else {
                    String str = factorNextResponse.versionToken;
                    if (!StringUtil.isNullorEmpty(str)) {
                        NativeTask.this.mHummerContext.a("versionToken", "context", str);
                    }
                    NativeTask.this.mHummerContext.m(shoVar.f28058a.zStack);
                    FactorNextResponseInner factorNextResponseInner = factorNextResponse.response.get(0);
                    if (!"SYSTEM_SUCCESS".equals(factorNextResponseInner.retCode)) {
                        NativeTask nativeTask3 = NativeTask.this;
                        nativeTask3.mHummerContext.u(nativeTask3.mTaskConfig.name, factorNextResponseInner.retCodeSub);
                        NativeTask.this.mHummerContext.p("serverTask", factorNextResponseInner.retCodeSub);
                        vk0.e().c(NativeTask.this.mIAlertManagerCallback);
                        return;
                    }
                    for (int i = 0; i < factorNextResponse.response.size(); i++) {
                        if (factorNextResponse.response.get(i).outParams != null) {
                            for (Map.Entry<String, Object> entry : factorNextResponse.response.get(i).outParams.entrySet()) {
                                NativeTask.this.mHummerContext.a(entry.getKey(), "serverResponse", entry.getValue());
                            }
                        }
                    }
                    NativeTask nativeTask4 = NativeTask.this;
                    nativeTask4.mITaskTrackerCallback.a(nativeTask4.mHummerContext, factorNextResponse.nextIndex.intValue());
                }
            }
        }
    }

    private void next() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d45dfa", new Object[]{this});
            return;
        }
        f9b f9bVar = this.mHummerContext;
        if (f9bVar != null && f9bVar.b != null) {
            f9bVar.t();
            jho d2 = jho.d();
            d dVar = new d();
            jho d3 = jho.d();
            f9b f9bVar2 = this.mHummerContext;
            d2.h(dVar, d3.c(f9bVar2, ((Integer) f9bVar2.o(vqx.ZIM_IDENTIFY_NEXTINDEX)).intValue(), true));
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void forceQuit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
        } else if (this.mZimFacade != null && !this.isZimDestroyed && this.isLive) {
            if (this.mTaskConfig != null) {
                BioLog.i("NativeTask " + this.mTaskConfig.name + " forceQuit");
                HashMap hashMap = new HashMap();
                hashMap.put("extInfo", "force quit zim " + this.mTaskConfig.name);
                jqn.a().c(upx.TECH_SEED, hashMap);
            }
            this.mZimFacade.command(4099);
            this.mZimFacade.destroy();
            this.mZimFacade = null;
            this.isLive = false;
        }
    }

    @Override // com.ap.zoloz.hummer.common.TaskTracker
    public void run(f9b f9bVar, TaskConfig taskConfig, qzd qzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad997b2", new Object[]{this, f9bVar, taskConfig, qzdVar});
            return;
        }
        BioLog.i("NativeTask run called");
        this.isLive = true;
        this.mITaskTrackerCallback = qzdVar;
        this.mTaskConfig = taskConfig;
        if (taskConfig != null && f9bVar != null) {
            this.mHummerContext = f9bVar;
            f9bVar.a("currentTaskName", "context", taskConfig.name);
            this.mIAlertManagerCallback = new a(taskConfig);
            if (!taskConfig.inputParams.containsKey("zimId")) {
                this.mHummerContext.u(taskConfig.name, "Z7025");
                this.mHummerContext.p(taskConfig.name, "Z7025");
                vk0.e().c(this.mIAlertManagerCallback);
                return;
            }
            String str = (String) this.mHummerContext.o(String.valueOf(((Map) taskConfig.inputParams.get("zimId")).get("value")));
            if (StringUtil.isNullorEmpty(str)) {
                this.mHummerContext.u(taskConfig.name, "Z7018");
                this.mHummerContext.p(taskConfig.name, "Z7018");
                vk0.e().c(this.mIAlertManagerCallback);
            } else if (!taskConfig.inputParams.containsKey("zimInitResp")) {
                this.mHummerContext.u(taskConfig.name, "Z7032");
                this.mHummerContext.p(taskConfig.name, "Z7032");
                vk0.e().c(this.mIAlertManagerCallback);
            } else {
                String valueOf = String.valueOf(this.mHummerContext.o(String.valueOf(((Map) taskConfig.inputParams.get("zimInitResp")).get("value"))));
                HashMap hashMap = new HashMap();
                hashMap.put("prodName", this.mTaskConfig.name);
                hashMap.put("zimId", str);
                jqn.a().c("zprodInit", hashMap);
                this.mZimFacade = ZIMFacadeBuilder.create(this.mHummerContext.b);
                this.isZimDestroyed = false;
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put("zimInitResp", valueOf);
                if (taskConfig.inputParams.get("validateDelegate") == null || !((Boolean) ((Map) taskConfig.inputParams.get("validateDelegate")).get("value")).booleanValue()) {
                    doZimTask(str, hashMap2, null);
                } else {
                    doZimTask(str, hashMap2, new b());
                }
            }
        }
    }
}
