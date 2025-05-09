package com.taobao.mytaobao.newsetting.dx;

import android.app.Application;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.task.Coordinator;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.newSettingV2.MtbSettingsCache;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.o78;
import tb.sf9;
import tb.t2o;
import tb.uj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DxSettingCommonSource implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActionDispatcher f11252a;
    public String b;
    public boolean c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public a(Map map) {
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                DxSettingCommonSource dxSettingCommonSource = DxSettingCommonSource.this;
                Map map = this.b;
                Object obj = null;
                Object obj2 = map != null ? map.get("mtopParams") : null;
                if (obj2 instanceof Map) {
                    obj = obj2;
                }
                DxSettingCommonSource.d(dxSettingCommonSource, (Map) obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(745537842);
        t2o.a(537919645);
    }

    public static final /* synthetic */ String a(DxSettingCommonSource dxSettingCommonSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f588e74f", new Object[]{dxSettingCommonSource});
        }
        return dxSettingCommonSource.e();
    }

    public static final /* synthetic */ void b(DxSettingCommonSource dxSettingCommonSource, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815dace", new Object[]{dxSettingCommonSource, str});
        } else {
            dxSettingCommonSource.g(str);
        }
    }

    public static final /* synthetic */ void c(DxSettingCommonSource dxSettingCommonSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82272ad", new Object[]{dxSettingCommonSource, new Boolean(z)});
        } else {
            dxSettingCommonSource.h(z);
        }
    }

    public static final /* synthetic */ void d(DxSettingCommonSource dxSettingCommonSource, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d842", new Object[]{dxSettingCommonSource, map});
        } else {
            dxSettingCommonSource.i(map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f11252a = null;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d043b54", new Object[]{this});
        }
        String str = this.b;
        if (str == null || str.length() == 0) {
            return null;
        }
        return str + "_" + Localization.j() + "_" + Localization.h();
    }

    public final void g(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff44063", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) "isRequestingWhenInvalidSetting", (String) Boolean.FALSE);
        ActionDispatcher actionDispatcher = this.f11252a;
        if (actionDispatcher != null) {
            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
        }
    }

    public final void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4085189e", new Object[]{this, new Boolean(z)});
        } else if (z || this.c) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "isRequestingWhenInvalidSetting", (String) Boolean.valueOf(z));
            ActionDispatcher actionDispatcher = this.f11252a;
            if (actionDispatcher != null) {
                actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
            }
        }
    }

    public final void i(Map<?, ?> map) {
        Object obj;
        String obj2;
        Object obj3;
        String obj4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e3b12b", new Object[]{this, map});
        } else if (map != null && (obj = map.get("api")) != null && (obj2 = obj.toString()) != null && (obj3 = map.get("version")) != null && (obj4 = obj3.toString()) != null) {
            Object obj5 = map.get("params");
            if (!(obj5 instanceof JSONObject)) {
                obj5 = null;
            }
            JSONObject jSONObject = (JSONObject) obj5;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "mtbVersion", MtbGlobalEnv.m());
            jSONObject2.put((JSONObject) "mtbLayout", MtbGlobalEnv.n());
            jSONObject.put((JSONObject) PushConstants.PARAMS, JSON.toJSONString(jSONObject2));
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(obj2);
            mtopRequest.setVersion(obj4);
            mtopRequest.setData(JSON.toJSONString(jSONObject));
            RemoteBusiness addListener = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.dx.DxSettingCommonSource$updateData$remoteBusiness$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
                public static final class a implements Runnable {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ String f11254a;
                    public final /* synthetic */ String b;

                    public a(String str, String str2) {
                        this.f11254a = str;
                        this.b = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtbSettingsCache.INSTANCE.c(this.f11254a, this.b);
                        }
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj6});
                    } else {
                        DxSettingCommonSource.c(DxSettingCommonSource.this, false);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj6) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj6});
                        return;
                    }
                    if (mtopResponse != null) {
                        bArr = mtopResponse.getBytedata();
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        String str = new String(bArr, uj3.UTF_8);
                        String a2 = DxSettingCommonSource.a(DxSettingCommonSource.this);
                        if (!(a2 == null || a2.length() == 0)) {
                            Coordinator.execute(new a(a2, str));
                        }
                        DxSettingCommonSource.b(DxSettingCommonSource.this, str);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj6});
                    } else {
                        DxSettingCommonSource.c(DxSettingCommonSource.this, false);
                    }
                }
            });
            addListener.setUnitStrategy("UNIT_TRADE");
            addListener.startRequest();
        }
    }

    /* renamed from: j */
    public JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f961e72e", new Object[]{this, action, jSONObject});
        }
        ckf.h(action, "updateAction");
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        ckf.h(actionDispatcher, "actionDispatcher");
        this.f11252a = actionDispatcher;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, ? extends Object> map, ActionDispatcher actionDispatcher) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        ckf.h(map, "props");
        ckf.h(actionDispatcher, "actionDispatcher");
        Object obj3 = map.get("settingItemsSource");
        String str = null;
        if (!(obj3 instanceof Map)) {
            obj3 = null;
        }
        Map map2 = (Map) obj3;
        String name = command.getName();
        if (name != null && name.hashCode() == 254455115 && name.equals(StdActions.COMMAND_INIT_SOURCE)) {
            Object obj4 = map2 != null ? map2.get("snapshot") : null;
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            Map map3 = (Map) obj4;
            this.b = (map3 == null || (obj2 = map3.get("filePath")) == null) ? null : obj2.toString();
            if (!(map3 == null || (obj = map3.get("bundleName")) == null)) {
                str = obj.toString();
            }
            f(str);
            VExecutors.defaultSharedThreadPool().submit(new a(map2));
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bdd1bc", new Object[]{this, str});
            return;
        }
        String e = e();
        String b = (e == null || e.length() == 0) ? null : MtbSettingsCache.INSTANCE.b(e);
        if ((b == null || b.length() == 0) && str != null && str.length() != 0 && Localization.h() == Language.SIMPLIFIED_CHINESE && ckf.b(Localization.j(), o78.CHINA_MAINLAND)) {
            Application application = Globals.getApplication();
            b = sf9.b(application, "mtbsettings/" + str);
        }
        if (b == null || b.length() == 0) {
            this.c = true;
            h(true);
            return;
        }
        this.c = false;
        g(b);
    }
}
