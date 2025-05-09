package com.taobao.global.setting;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.gyb;
import tb.j9t;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SettingStateWVApiPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHANGE_SETTING_STATE = "changeSettingState";
    private static final String ACTION_CONSUME_FATIGUE = "consumeFatigueForType";
    private static final String ACTION_GET_LIFECYCLE_SETTING_STATE = "getLifeCicleSettingState";
    private static final String ACTION_GET_SETTING_STATE = "getSettingState";
    private static final String ACTION_IS_HIT_AB = "isHitABTestForSetting";
    private static final String ACTION_NEED_SHOW_GUIDE = "needShowGuideForType";
    private static final String ACTION_SETTINGS_URL = "generalSettingNavUrl";
    private static final String ACTION_SET_LIFECYCLE_SETTING_STATE = "setLifeCicleSettingState";
    private static final String KEY_AUTO_CONSUME_FATIGUE = "autoConsumeFatigue";
    private static final String KEY_BIZ_NAME = "bizName";
    private static final String KEY_FATIGUE_TYPE = "type";
    private static final String KEY_SETTING_DEFAULT_STATE = "defaultValue";
    private static final String KEY_SETTING_ID = "key";
    private static final String KEY_SETTING_STATE = "value";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements gyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10582a;

        public a(SettingStateWVApiPlugin settingStateWVApiPlugin, WVCallBackContext wVCallBackContext) {
            this.f10582a = wVCallBackContext;
        }

        @Override // tb.gyb
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f10582a.error(str);
            }
        }

        @Override // tb.gyb
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                this.f10582a.success();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements gyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10583a;

        public b(SettingStateWVApiPlugin settingStateWVApiPlugin, WVCallBackContext wVCallBackContext) {
            this.f10583a = wVCallBackContext;
        }

        @Override // tb.gyb
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f10583a.error(str);
            }
        }

        @Override // tb.gyb
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                this.f10583a.success();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements gyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10584a;

        public c(SettingStateWVApiPlugin settingStateWVApiPlugin, WVCallBackContext wVCallBackContext) {
            this.f10584a = wVCallBackContext;
        }

        @Override // tb.gyb
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f10584a.error(str);
            }
        }

        @Override // tb.gyb
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else if (obj == null) {
                this.f10584a.error("result is null!");
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("result", obj);
                    nsw nswVar = new nsw();
                    nswVar.h(jSONObject);
                    this.f10584a.success(nswVar);
                } catch (JSONException e) {
                    this.f10584a.error("error when try to put result to JSON!");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements gyb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f10585a;

        public d(SettingStateWVApiPlugin settingStateWVApiPlugin, WVCallBackContext wVCallBackContext) {
            this.f10585a = wVCallBackContext;
        }

        @Override // tb.gyb
        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            } else {
                this.f10585a.error(str);
            }
        }

        @Override // tb.gyb
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else if (obj == null) {
                this.f10585a.error("result is null!");
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("result", obj);
                    nsw nswVar = new nsw();
                    nswVar.h(jSONObject);
                    this.f10585a.success(nswVar);
                } catch (JSONException e) {
                    this.f10585a.error("error when try to put result to JSON!");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private <T> T getParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("db715b80", new Object[]{this, str, str2});
        }
        try {
            T t = (T) parseParamsToJSON(str2).get(str);
            if ((t instanceof String) || (t instanceof Integer) || (t instanceof Boolean)) {
                return t;
            }
            return null;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private <T> void handleChangeCycleStateEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8727d45", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        j9t.e(getContext(), str2).c().a(str2, (String) getParam("key", str), getParam("value", str), new b(this, wVCallBackContext));
    }

    private <T> void handleChangeStateEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a0f06f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        j9t.e(getContext(), str2).c().c(str2, (String) getParam("key", str), getParam("value", str), new a(this, wVCallBackContext));
    }

    private <T> void handleGetCycleStateEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919569ef", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        j9t.e(getContext(), str2).b().b(str2, (String) getParam("key", str), getParam("defaultValue", str), new d(this, wVCallBackContext));
    }

    private void handleGetSettingUrlEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0e9bb", new Object[]{this, wVCallBackContext, str});
            return;
        }
        j9t e = j9t.e(getContext(), (String) getParam("bizName", str));
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", e.b().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private <T> void handleGetStateEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d34185", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        j9t.e(getContext(), str2).b().d(str2, (String) getParam("key", str), getParam("defaultValue", str), new c(this, wVCallBackContext));
    }

    private void handleHitABEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3c1ddc", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("key", str);
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("key is null");
            return;
        }
        j9t e = j9t.e(getContext(), str2);
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", e.b().h(str3));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    private void handleNeedGuideEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c968a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("type", str);
        Boolean bool = (Boolean) getParam(KEY_AUTO_CONSUME_FATIGUE, str);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("type is null");
            return;
        }
        j9t e = j9t.e(getContext(), str2);
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", e.b().c(str3, bool.booleanValue()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(SettingStateWVApiPlugin settingStateWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/SettingStateWVApiPlugin");
    }

    private com.alibaba.fastjson.JSONObject parseParamsToJSON(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("5b8ea60d", new Object[]{this, str});
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                return parseObject;
            }
            throw new JSONException("params parse result is null!");
        } catch (Exception unused) {
            throw new JSONException("params parse error!");
        }
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            fsw.h("TBMyTaobaoSettingStateWVApiPlugin", SettingStateWVApiPlugin.class);
        }
    }

    private void handleConsumeFatigue(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc2fac1", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("type", str);
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("type is null");
            return;
        }
        j9t e = j9t.e(getContext(), str2);
        nsw nswVar = new nsw();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", e.b().c(str3, true));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        nswVar.h(jSONObject);
        wVCallBackContext.success(nswVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r8.equals("changeSettingState") == false) goto L_0x003d;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r7 = this;
            r0 = 3
            r1 = 2
            r2 = 4
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.global.setting.SettingStateWVApiPlugin.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = "bcd41fd1"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r7
            r2[r3] = r8
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r8 = r5.ipc$dispatch(r6, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x00bb
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x00bb
            if (r10 != 0) goto L_0x0032
            goto L_0x00bb
        L_0x0032:
            r8.hashCode()
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1720808615: goto L_0x008c;
                case -1351300774: goto L_0x0080;
                case -916727579: goto L_0x0075;
                case -2648079: goto L_0x006c;
                case 38355459: goto L_0x0060;
                case 893963188: goto L_0x0055;
                case 1265482232: goto L_0x004a;
                case 2132265623: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r0 = -1
            goto L_0x0097
        L_0x003f:
            java.lang.String r0 = "getSettingState"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0048
            goto L_0x003d
        L_0x0048:
            r0 = 7
            goto L_0x0097
        L_0x004a:
            java.lang.String r0 = "consumeFatigueForType"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0053
            goto L_0x003d
        L_0x0053:
            r0 = 6
            goto L_0x0097
        L_0x0055:
            java.lang.String r0 = "generalSettingNavUrl"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005e
            goto L_0x003d
        L_0x005e:
            r0 = 5
            goto L_0x0097
        L_0x0060:
            java.lang.String r0 = "isHitABTestForSetting"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x006a
            goto L_0x003d
        L_0x006a:
            r0 = 4
            goto L_0x0097
        L_0x006c:
            java.lang.String r1 = "changeSettingState"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0097
            goto L_0x003d
        L_0x0075:
            java.lang.String r0 = "getLifeCicleSettingState"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x007e
            goto L_0x003d
        L_0x007e:
            r0 = 2
            goto L_0x0097
        L_0x0080:
            java.lang.String r0 = "needShowGuideForType"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x008a
            goto L_0x003d
        L_0x008a:
            r0 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r0 = "setLifeCicleSettingState"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0096
            goto L_0x003d
        L_0x0096:
            r0 = 0
        L_0x0097:
            switch(r0) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00af;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00a7;
                case 5: goto L_0x00a3;
                case 6: goto L_0x009f;
                case 7: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            return r4
        L_0x009b:
            r7.handleGetStateEvent(r10, r9)
            return r3
        L_0x009f:
            r7.handleConsumeFatigue(r10, r9)
            return r3
        L_0x00a3:
            r7.handleGetSettingUrlEvent(r10, r9)
            return r3
        L_0x00a7:
            r7.handleHitABEvent(r10, r9)
            return r3
        L_0x00ab:
            r7.handleChangeStateEvent(r10, r9)
            return r3
        L_0x00af:
            r7.handleGetCycleStateEvent(r10, r9)
            return r3
        L_0x00b3:
            r7.handleNeedGuideEvent(r10, r9)
            return r3
        L_0x00b7:
            r7.handleChangeCycleStateEvent(r10, r9)
            return r3
        L_0x00bb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.SettingStateWVApiPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }
}
