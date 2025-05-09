package com.taobao.mytaobao.newSettingV2.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.base.Versions;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newSettingV2.MtbSettingsCache;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.e6a;
import tb.m0d;
import tb.mba;
import tb.n81;
import tb.osh;
import tb.r0k;
import tb.sf9;
import tb.sgj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewGeneralSettingDataManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final JSONObject GENERAL_SETTING_DEFAULT_STATUS_DATA = JSON.parseObject("{\"wifiAutoDownload\":{\"type\":\"switch\",\"value\":true}}");
    public static final String K_GENERAL_SETTING_DEFAULT_STATUS = "value";

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<NewGeneralSettingDataModel> f11226a;
    public m0d b;
    public final e6a c = new e6a();
    public final n81 d = new n81(Global.getApplication());

    public static /* synthetic */ void a(NewGeneralSettingDataManager newGeneralSettingDataManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325b5e09", new Object[]{newGeneralSettingDataManager, jSONObject});
        } else {
            newGeneralSettingDataManager.c(jSONObject);
        }
    }

    public static /* synthetic */ m0d b(NewGeneralSettingDataManager newGeneralSettingDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0d) ipChange.ipc$dispatch("4488a62f", new Object[]{newGeneralSettingDataManager});
        }
        return newGeneralSettingDataManager.b;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e2f0c6", new Object[]{this, jSONObject});
            return;
        }
        JSONObject m = m(jSONObject, "structure");
        ArrayList<NewGeneralSettingDataModel> arrayList = new ArrayList<>();
        JSONObject jSONObject2 = null;
        for (Map.Entry<String, Object> entry : m.entrySet()) {
            String key = entry.getKey();
            String n = n(entry.getValue());
            if (jSONObject2 == null) {
                jSONObject2 = m(jSONObject, "content");
            }
            j(jSONObject2, arrayList, key, n);
        }
        this.f11226a = arrayList;
    }

    public ArrayList<NewGeneralSettingDataModel> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3bd50c4e", new Object[]{this});
        }
        return this.f11226a;
    }

    public final <T> T e(String str, T t) {
        JSONObject jSONObject;
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3abc3440", new Object[]{this, str, t});
        }
        JSONObject jSONObject2 = osh.c;
        return (jSONObject2 == null || !jSONObject2.containsKey(str) || (jSONObject = jSONObject2.getJSONObject(str)) == null || !jSONObject.containsKey("value") || (t2 = (T) jSONObject.get("value")) == null) ? t : t2;
    }

    public void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4982255e", new Object[]{this, str, new Boolean(z)});
        } else {
            this.c.d(str, z);
        }
    }

    public final boolean h(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8a3615", new Object[]{this, newGeneralSettingDataModel})).booleanValue();
        }
        if (TextUtils.isEmpty(newGeneralSettingDataModel.nativeKey)) {
            return true;
        }
        Boolean c = this.c.c(newGeneralSettingDataModel.nativeKey);
        if (c != null) {
            return c.booleanValue();
        }
        JSONArray jSONArray = newGeneralSettingDataModel.showRule;
        if (jSONArray == null) {
            return true;
        }
        return l(jSONArray);
    }

    public final void j(JSONObject jSONObject, ArrayList<NewGeneralSettingDataModel> arrayList, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87a2271", new Object[]{this, jSONObject, arrayList, str, str2});
        } else if (jSONObject != null && arrayList != null && !TextUtils.isEmpty(str)) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        NewGeneralSettingDataModel newGeneralSettingDataModel = (NewGeneralSettingDataModel) JSON.toJavaObject(jSONObject2, NewGeneralSettingDataModel.class);
                        if (!TextUtils.isEmpty(newGeneralSettingDataModel.key)) {
                            newGeneralSettingDataModel.nativeKey = this.c.a(newGeneralSettingDataModel.key);
                            if (h(newGeneralSettingDataModel)) {
                                if (z) {
                                    q(newGeneralSettingDataModel, jSONObject2, str2);
                                    z = false;
                                }
                                g(newGeneralSettingDataModel);
                                arrayList.add(newGeneralSettingDataModel);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean l(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcfdc", new Object[]{this, jSONArray})).booleanValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (!z || !k((JSONObject) next)) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    public final JSONObject m(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ae82c8e9", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public final String n(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4096b925", new Object[]{this, obj});
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) obj).getString("title");
    }

    public void o(m0d m0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635d85f8", new Object[]{this, m0dVar});
        } else {
            this.b = m0dVar;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e6e0", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.general.setting.get");
        mtopRequest.setVersion("1.0");
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("settingExpType", (Object) "voice");
        hashMap.put(PushConstants.PARAMS, jSONObject.toJSONString());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(hashMap);
        mtopRequest.setData(jSONObject2.toJSONString());
        mtopRequest.dataParams = hashMap;
        MtopBusiness addListener = MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f11227a;

                public a(String str) {
                    this.f11227a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MtbSettingsCache.INSTANCE.c("mtbGeneralSettingsPage", this.f11227a);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String str = new String(mtopResponse.getBytedata());
                Coordinator.execute(new a(str));
                NewGeneralSettingDataManager.a(NewGeneralSettingDataManager.this, (JSONObject) JSON.parse(str, Feature.OrderedField));
                if (NewGeneralSettingDataManager.b(NewGeneralSettingDataManager.this) != null) {
                    NewGeneralSettingDataManager.b(NewGeneralSettingDataManager.this).b();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }
        });
        addListener.setUnitStrategy("UNIT_TRADE");
        addListener.startRequest();
    }

    public final void q(NewGeneralSettingDataModel newGeneralSettingDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c934dbb", new Object[]{this, newGeneralSettingDataModel, jSONObject, str});
        } else if (newGeneralSettingDataModel != null && jSONObject != null) {
            if (TextUtils.isEmpty(str)) {
                newGeneralSettingDataModel.isShowDividerWithoutTitle = true;
            } else {
                newGeneralSettingDataModel.showDividerWithTitle = str;
            }
        }
    }

    public final void g(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d87d16c", new Object[]{this, newGeneralSettingDataModel});
        } else if (newGeneralSettingDataModel != null) {
            String str = newGeneralSettingDataModel.style;
            String str2 = newGeneralSettingDataModel.nativeKey;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if ("normal".equals(str)) {
                    String b = this.c.b(str2, newGeneralSettingDataModel);
                    if (TextUtils.isEmpty(b)) {
                        b = (String) r0k.L(str2, e(str2, ""));
                    }
                    newGeneralSettingDataModel.rightTip = b;
                } else if ("switch".equals(str) || NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(str)) {
                    boolean booleanValue = ((Boolean) e(str2, Boolean.valueOf("true".equals(newGeneralSettingDataModel.defaultSwitchStat)))).booleanValue();
                    try {
                        obj = this.d.j("mytaobao", str2);
                    } catch (Throwable th) {
                        TLog.loge(mba.BIZ_NAME, "我淘设置页， key= " + str2 + " err=" + th.getMessage());
                        obj = null;
                    }
                    if (obj instanceof Boolean) {
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (r0k.KEY_INLINE_VOLUME.equals(str2)) {
                            booleanValue = !booleanValue;
                        }
                    } else if (obj != null) {
                        TLog.loge(mba.BIZ_NAME, "开关value不是boolean， key=" + str2);
                        if (Versions.isDebug()) {
                            new RuntimeException("开关value不是boolean， key=" + str2);
                        }
                    }
                    newGeneralSettingDataModel.switchState = booleanValue;
                }
            }
        }
    }

    public void i() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff742ee", new Object[]{this});
            return;
        }
        String b = MtbSettingsCache.INSTANCE.b("mtbGeneralSettingsPage");
        if (!TextUtils.isEmpty(b)) {
            try {
                parseObject = JSON.parseObject(b, Feature.OrderedField);
            } catch (Throwable unused) {
                return;
            }
        } else {
            String b2 = sf9.b(Globals.getApplication(), "mtbsettings/mtb_generalsettings_default.json");
            if (!TextUtils.isEmpty(b2)) {
                try {
                    parseObject = JSON.parseObject(b2, Feature.OrderedField);
                } catch (Throwable unused2) {
                    return;
                }
            } else {
                return;
            }
        }
        if (parseObject != null) {
            c(parseObject);
        }
    }

    public final boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49cbff28", new Object[]{this, jSONObject})).booleanValue();
        }
        while (true) {
            boolean z = false;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String obj = entry.getValue().toString();
                String key = entry.getKey();
                if ("voiceAssistant".equals(key)) {
                    if (!z && !String.valueOf(sgj.c(Global.getApplication())).equals(obj)) {
                        break;
                    }
                    z = true;
                } else if (!"elderly".equals(key)) {
                    continue;
                } else {
                    if (!z && !String.valueOf(TextUtils.equals("1", TBRevisionSwitchManager.c().e("elderHome"))).equals(obj)) {
                        break;
                    }
                    z = true;
                }
            }
            return z;
        }
    }

    static {
        t2o.a(745537759);
    }
}
