package com.taobao.leftsdk.triver;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.b02;
import tb.vcq;
import tb.xcq;
import tb.xdp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBStepCountBridgeExtension implements BridgeExtension, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBStepCountExtension";
    private StepCountBridgeApi stepCountBridgeApiInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10891a;
        public final /* synthetic */ BridgeCallback b;

        public a(App app, BridgeCallback bridgeCallback) {
            this.f10891a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbSupportStepCount(this.f10891a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10892a;
        public final /* synthetic */ BridgeCallback b;

        public b(App app, BridgeCallback bridgeCallback) {
            this.f10892a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbGetStepsStatus(this.f10892a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10893a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ BridgeCallback c;

        public c(App app, boolean z, BridgeCallback bridgeCallback) {
            this.f10893a = app;
            this.b = z;
            this.c = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbSetStepCountStatus(this.f10893a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10894a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ BridgeCallback d;

        public d(App app, String str, String str2, BridgeCallback bridgeCallback) {
            this.f10894a = app;
            this.b = str;
            this.c = str2;
            this.d = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbGetStepsHistory(this.f10894a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10895a;
        public final /* synthetic */ BridgeCallback b;

        public e(App app, BridgeCallback bridgeCallback) {
            this.f10895a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbRequestManufacturerPermission(this.f10895a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10896a;
        public final /* synthetic */ BridgeCallback b;

        public f(App app, BridgeCallback bridgeCallback) {
            this.f10896a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbRequestSensorPermission(this.f10896a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10897a;
        public final /* synthetic */ BridgeCallback b;

        public g(App app, BridgeCallback bridgeCallback) {
            this.f10897a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbCheckManufacturerPermission(this.f10897a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10898a;
        public final /* synthetic */ BridgeCallback b;

        public h(App app, BridgeCallback bridgeCallback) {
            this.f10898a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbCheckSensorPermission(this.f10898a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ App f10899a;
        public final /* synthetic */ BridgeCallback b;

        public i(App app, BridgeCallback bridgeCallback) {
            this.f10899a = app;
            this.b = bridgeCallback;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            }
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
            } else if (obj != null && (obj instanceof StepCountBridgeApi)) {
                StepCountBridgeApi stepCountBridgeApi = (StepCountBridgeApi) obj;
                TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi);
                stepCountBridgeApi.tbGetDailySteps(this.f10899a, this.b);
            }
        }
    }

    public static /* synthetic */ StepCountBridgeApi access$002(TBStepCountBridgeExtension tBStepCountBridgeExtension, StepCountBridgeApi stepCountBridgeApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StepCountBridgeApi) ipChange.ipc$dispatch("ece38137", new Object[]{tBStepCountBridgeExtension, stepCountBridgeApi});
        }
        tBStepCountBridgeExtension.stepCountBridgeApiInstance = stepCountBridgeApi;
        return stepCountBridgeApi;
    }

    private void errorCallBack(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f5094", new Object[]{this, app, bridgeCallback});
        } else if (app.getAppContext() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "appContext is Null");
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbCheckManufacturerPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5382ba7", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbCheckManufacturerPermission(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new g(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbCheckSensorPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1189eede", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbCheckSensorPermission(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new h(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetDailySteps(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283e79cb", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetDailySteps(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new i(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetStepsHistory(@BindingNode(App.class) App app, @BindingParam(name = {"startTime"}) String str, @BindingParam(name = {"endTime"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684a54f8", new Object[]{this, app, str, str2, bridgeCallback});
            return;
        }
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetStepsHistory(app, str, str2, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new d(app, str, str2, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetStepsStatus(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab88dd0", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetStepsStatus(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new b(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbRequestManufacturerPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a5c80", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbRequestManufacturerPermission(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new e(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbRequestSensorPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e3f677", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbRequestSensorPermission(app, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new f(app, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbSetStepCountStatus(@BindingNode(App.class) App app, @BindingParam(name = {"status"}) boolean z, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0b14c4", new Object[]{this, app, new Boolean(z), bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbSetStepCountStatus(app, z, bridgeCallback);
        } else {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new c(app, z, bridgeCallback)).a()).n());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbSupportStepCount(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e261df", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi == null) {
            vcq.a(app.getAppContext().getContext()).c(xcq.c().m(xdp.l(app.getAppContext().getContext(), StepCountBridgeApi.class).f(new a(app, bridgeCallback)).a()).n());
        } else {
            stepCountBridgeApi.tbSupportStepCount(app, bridgeCallback);
        }
    }
}
