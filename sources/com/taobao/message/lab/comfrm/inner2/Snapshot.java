package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.message.kit.cache.KVDataStorage;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.lab.comfrm.util.TimeBuffer;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.tao.log.TLog;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Snapshot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Snapshot";
    private final String mBizConfigCode;
    private KVDataStorage mDataStorage;
    private ISnapshotCustom mSnapshotCustom;
    private volatile SnapshotData mSnapshotData;
    private boolean tabImageOpt = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabImagePreOpt");
    private boolean tabHeadOpt = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabHeadPreRenderOpt");
    private TimeBuffer<SnapshotInput> mBuffer = new TimeBuffer<>(true, 5000, new TimeBuffer.LastItemMergeFunction(), new Observer<List<SnapshotInput>>() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
            }
        }

        public void onData(final List<SnapshotInput> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62cedf21", new Object[]{this, list});
            } else if (!list.isEmpty()) {
                Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        List list2 = list;
                        Snapshot.this.saveSnapshotImpl((SnapshotInput) list2.get(list2.size() - 1));
                    }
                });
            }
        }
    });
    private boolean isEnableEventHandlerCopy = TextUtils.equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "isEnableNoTreeSnapshotSupport", "true"), "true");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SnapshotData {
        public String appVersion;
        public Map<String, Object> preBindData;
        public String version;
        public ViewObject viewObject;

        static {
            t2o.a(537919643);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SnapshotInput {
        public SharedState state;
        public String version;
        public ViewObject viewObject;

        static {
            t2o.a(537919644);
        }
    }

    static {
        t2o.a(537919639);
    }

    public Snapshot(String str) {
        this.mBizConfigCode = str;
    }

    public static /* synthetic */ void access$000(Snapshot snapshot, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127dbbba", new Object[]{snapshot, viewObject});
        } else {
            snapshot.processViewObject(viewObject);
        }
    }

    public static /* synthetic */ SnapshotData access$102(Snapshot snapshot, SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SnapshotData) ipChange.ipc$dispatch("d004d5d4", new Object[]{snapshot, snapshotData});
        }
        snapshot.mSnapshotData = snapshotData;
        return snapshotData;
    }

    private void buildEventBindCache(String str, ViewObject viewObject, Object obj, Map<String, Object> map) {
        LayoutInfo layoutInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f02f8f4", new Object[]{this, str, viewObject, obj, map});
            return;
        }
        if (this.isEnableEventHandlerCopy && (layoutInfo = viewObject.info) != null && layoutInfo.eventHandler != null && (TextUtils.equals(str, "noTree") || TextUtils.equals(str, "noTreeTab"))) {
            HashMap hashMap = new HashMap();
            for (String str2 : viewObject.info.eventHandler.keySet()) {
                ArrayList arrayList = new ArrayList();
                for (EventHandlerItem eventHandlerItem : viewObject.info.eventHandler.get(str2)) {
                    arrayList.add(eventHandlerItem.copy());
                }
                hashMap.put(str2, arrayList);
            }
            viewObject.info = viewObject.info.copy(hashMap);
        }
        map.putAll(LayoutProtocol.buildWithExpressionMap(viewObject, obj));
        Map<String, Object> map2 = viewObject.children;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof List) {
                    for (Object obj2 : (List) value) {
                        if (obj2 instanceof ViewObject) {
                            buildEventBindCache(str, (ViewObject) obj2, obj, map);
                        }
                    }
                } else if (value instanceof ViewObject) {
                    buildEventBindCache(str, (ViewObject) value, obj, map);
                }
            }
        }
    }

    private void processViewObject(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d05665", new Object[]{this, viewObject});
            return;
        }
        Map<String, Object> map = viewObject.children;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof JSONObject) {
                    ViewObject viewObject2 = (ViewObject) ((JSONObject) entry.getValue()).toJavaObject(ViewObject.class);
                    processViewObject(viewObject2);
                    viewObject.children.put(entry.getKey(), viewObject2);
                } else if (entry.getValue() instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        ViewObject viewObject3 = (ViewObject) jSONArray.getObject(i, ViewObject.class);
                        processViewObject(viewObject3);
                        arrayList.add(viewObject3);
                    }
                    viewObject.children.put(entry.getKey(), arrayList);
                }
            }
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mSnapshotData = null;
        }
    }

    public SnapshotData getSnapshotData() {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SnapshotData) ipChange.ipc$dispatch("20fb67ed", new Object[]{this});
        }
        TraceUtil.beginSection("getSnapshotData");
        try {
            i = Integer.parseInt(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "waitSnapshotTime", "1000"));
        } catch (Throwable th) {
            th.printStackTrace();
            i = 1000;
        }
        this.mDataStorage.tryWaitInit(i);
        TraceUtil.endTrace();
        if (!ApplicationUtil.isDebug() || this.mSnapshotData == null || this.mSnapshotData.viewObject == null || this.mSnapshotData.viewObject.isSnapshot) {
            if (this.mSnapshotData == null) {
                str = " empty ";
            } else {
                str = "ok";
            }
            Log.e(TAG, "get cache snapshot is  ".concat(str));
            return this.mSnapshotData;
        }
        throw new IllegalStateException("获取的快照数据不应该没有快照标记");
    }

    public void initSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa5797b", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationUtil.getApplication().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("message");
        sb.append(str);
        sb.append(this.mBizConfigCode);
        sb.append(".cache");
        String sb2 = sb.toString();
        final long currentTimeMillis = System.currentTimeMillis();
        KVDataStorage kVDataStorage = new KVDataStorage(sb2);
        this.mDataStorage = kVDataStorage;
        kVDataStorage.addInitListener(new KVDataStorage.InitListener() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
            @Override // com.taobao.message.kit.cache.KVDataStorage.InitListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void init(java.util.Map<java.lang.String, java.lang.String> r8) {
                /*
                    r7 = this;
                    r0 = 1
                    java.lang.String r1 = "Snapshot"
                    com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.lab.comfrm.inner2.Snapshot.AnonymousClass2.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x0017
                    java.lang.String r1 = "f1cfb90e"
                    r3 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r3]
                    r4 = 0
                    r3[r4] = r7
                    r3[r0] = r8
                    r2.ipc$dispatch(r1, r3)
                    return
                L_0x0017:
                    java.lang.String r2 = "snapshot"
                    java.lang.Object r8 = r8.get(r2)
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r2 = android.text.TextUtils.isEmpty(r8)
                    if (r2 != 0) goto L_0x00ac
                    r2 = 0
                    com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r8)     // Catch: Exception -> 0x005e
                    java.lang.String r3 = "viewObject"
                    java.lang.Class<com.taobao.message.lab.comfrm.core.ViewObject> r4 = com.taobao.message.lab.comfrm.core.ViewObject.class
                    java.lang.Object r3 = r8.getObject(r3, r4)     // Catch: Exception -> 0x005e
                    com.taobao.message.lab.comfrm.core.ViewObject r3 = (com.taobao.message.lab.comfrm.core.ViewObject) r3     // Catch: Exception -> 0x005e
                    r3.isSnapshot = r0     // Catch: Exception -> 0x005a
                    com.taobao.message.lab.comfrm.inner2.Snapshot r0 = com.taobao.message.lab.comfrm.inner2.Snapshot.this     // Catch: Exception -> 0x005a
                    com.taobao.message.lab.comfrm.inner2.Snapshot.access$000(r0, r3)     // Catch: Exception -> 0x005a
                    java.lang.String r0 = "bindData"
                    java.lang.Class<java.util.Map> r4 = java.util.Map.class
                    java.lang.Object r0 = r8.getObject(r0, r4)     // Catch: Exception -> 0x005a
                    java.util.Map r0 = (java.util.Map) r0     // Catch: Exception -> 0x005a
                    java.lang.String r4 = "version"
                    java.lang.String r4 = r8.getString(r4)     // Catch: Exception -> 0x0057
                    java.lang.String r5 = "appVersion"
                    java.lang.String r2 = r8.getString(r5)     // Catch: Exception -> 0x0055
                    goto L_0x0078
                L_0x0055:
                    r8 = move-exception
                    goto L_0x0062
                L_0x0057:
                    r8 = move-exception
                    r4 = r2
                    goto L_0x0062
                L_0x005a:
                    r8 = move-exception
                    r0 = r2
                    r4 = r0
                    goto L_0x0062
                L_0x005e:
                    r8 = move-exception
                    r0 = r2
                    r3 = r0
                    r4 = r3
                L_0x0062:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r6 = "parse cache error = "
                    r5.<init>(r6)
                    java.lang.String r8 = r8.toString()
                    r5.append(r8)
                    java.lang.String r8 = r5.toString()
                    com.taobao.tao.log.TLog.loge(r1, r8)
                L_0x0078:
                    if (r3 == 0) goto L_0x00a6
                    com.taobao.message.lab.comfrm.inner2.Snapshot$SnapshotData r8 = new com.taobao.message.lab.comfrm.inner2.Snapshot$SnapshotData
                    r8.<init>()
                    r8.viewObject = r3
                    r8.preBindData = r0
                    r8.version = r4
                    r8.appVersion = r2
                    com.taobao.message.lab.comfrm.inner2.Snapshot r0 = com.taobao.message.lab.comfrm.inner2.Snapshot.this
                    com.taobao.message.lab.comfrm.inner2.Snapshot.access$102(r0, r8)
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r0 = "read cache snapshot finish time = "
                    r8.<init>(r0)
                    long r2 = java.lang.System.currentTimeMillis()
                    long r4 = r2
                    long r2 = r2 - r4
                    r8.append(r2)
                    java.lang.String r8 = r8.toString()
                    com.taobao.tao.log.TLog.loge(r1, r8)
                    goto L_0x00ac
                L_0x00a6:
                    java.lang.String r8 = "read cache snapshot is null "
                    com.taobao.tao.log.TLog.loge(r1, r8)
                L_0x00ac:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.Snapshot.AnonymousClass2.init(java.util.Map):void");
            }
        });
        this.mDataStorage.init();
    }

    public void saveSnapshot(String str, ViewObject viewObject, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e459abf1", new Object[]{this, str, viewObject, sharedState});
            return;
        }
        SnapshotInput snapshotInput = new SnapshotInput();
        snapshotInput.state = sharedState;
        snapshotInput.viewObject = viewObject;
        snapshotInput.version = str;
        this.mBuffer.produce(snapshotInput);
    }

    public void saveSnapshotToDiskForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2355179", new Object[]{this});
        } else {
            this.mBuffer.checkForce();
        }
    }

    public void setSnapshotCustom(ISnapshotCustom iSnapshotCustom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215d790", new Object[]{this, iSnapshotCustom});
        } else {
            this.mSnapshotCustom = iSnapshotCustom;
        }
    }

    private void saveHeadData(ViewObject viewObject) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244d0db1", new Object[]{this, viewObject});
        } else if (viewObject != null && this.tabHeadOpt) {
            try {
                Logger.e(TAG, " saveHeadData");
                JSONObject jSONObject2 = (JSONObject) ((ViewObject) ((List) ((ViewObject) ((ViewObject) viewObject.children.get("content")).children.get("header")).children.get(Constants.Slot.DEF_SLOT)).get(0)).data;
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("operationArea")) != null) {
                    SharedPreferencesUtil.addStringSharedPreference("msgTabHeadOperationArea" + this.mBizConfigCode, jSONObject.toJSONString());
                }
            } catch (Throwable th) {
                TLog.loge(TAG, "saveHeadData " + th.getMessage());
            }
        }
    }

    private void saveContentUrl(ViewObject viewObject) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa211ce5", new Object[]{this, viewObject});
        } else if (viewObject != null && this.tabImageOpt) {
            try {
                Logger.e(TAG, " saveContentUrl");
                ViewObject viewObject2 = (ViewObject) viewObject.children.get("content");
                if (viewObject2.children.containsKey("section")) {
                    list = (List) ((ViewObject) ((List) viewObject2.children.get("section")).get(0)).children.get("content");
                } else {
                    if (viewObject2.children.containsKey(WXBasicComponentType.SCROLLER)) {
                        List list2 = (List) ((ViewObject) viewObject2.children.get(WXBasicComponentType.SCROLLER)).children.get("list");
                        if (list2 != null && !list2.isEmpty()) {
                            ViewObject viewObject3 = (ViewObject) list2.get(0);
                            if (viewObject3.children.containsKey("section")) {
                                List list3 = (List) viewObject3.children.get("section");
                                if (list3 == null || list3.isEmpty() || (list = (List) ((ViewObject) list3.get(0)).children.get("content")) == null || list.isEmpty()) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    list = null;
                }
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < list.size() && i <= 7; i2++) {
                    i++;
                    String string = ((JSONObject) ((ViewObject) ((ViewObject) list.get(i2)).children.get("content")).data).getString("headIcon");
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.size() > 0) {
                    String jSONString = JSON.toJSONString(arrayList);
                    Logger.e(TAG, "saveContentUrl_" + this.mBizConfigCode + jSONString);
                    StringBuilder sb = new StringBuilder();
                    sb.append("msgTabContentUrl_");
                    sb.append(this.mBizConfigCode);
                    SharedPreferencesUtil.addStringSharedPreference(sb.toString(), jSONString);
                }
            } catch (Throwable th) {
                TLog.loge(TAG, "saveContentUrl " + th.getMessage());
            }
        }
    }

    private void saveHeadUrl(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91568ae6", new Object[]{this, viewObject});
        } else if (viewObject != null && this.tabImageOpt) {
            try {
                Logger.e(TAG, " saveHeadUrl");
                JSONObject jSONObject = (JSONObject) ((ViewObject) ((List) ((ViewObject) ((ViewObject) viewObject.children.get("content")).children.get("header")).children.get(Constants.Slot.DEF_SLOT)).get(0)).data;
                if (jSONObject != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("operationArea");
                    if (jSONObject2 != null) {
                        SharedPreferencesUtil.addStringSharedPreference("msgTabHeadOperationArea", jSONObject2.toJSONString());
                    }
                    JSONArray jSONArray = ((JSONObject) ((JSONObject) jSONObject2.getJSONArray("subContainerList").get(0)).getJSONArray(BaseWVApiPlugin.RESOURCE_LIST_KEY).get(0)).getJSONObject("resData").getJSONArray("list");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        String string = jSONObject3.getString("defaultExtendDescPic");
                        String string2 = jSONObject3.getString("shortIcon");
                        arrayList.add(string);
                        arrayList2.add(string2);
                    }
                    if (arrayList.size() > 0) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("pic", JSON.toJSON(arrayList));
                        jSONObject4.put("short", JSON.toJSON(arrayList2));
                        String jSONString = jSONObject4.toJSONString();
                        SharedPreferencesUtil.addStringSharedPreference("msgTabHeadUrl_" + this.mBizConfigCode, jSONString);
                        Logger.e(TAG, "saveHeadUrl " + jSONString);
                    }
                }
            } catch (Throwable th) {
                TLog.loge(TAG, "saveHeadUrl " + th.getMessage());
            }
        }
    }

    public void saveSnapshotImpl(SnapshotInput snapshotInput) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e402d4b2", new Object[]{this, snapshotInput});
            return;
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1012).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mBizConfigCode).build());
        ViewObject viewObject = snapshotInput.viewObject;
        ISnapshotCustom iSnapshotCustom = this.mSnapshotCustom;
        if (iSnapshotCustom != null) {
            viewObject = iSnapshotCustom.snapshot(viewObject);
        }
        if (!viewObject.isSnapshot) {
            ViewObject viewObject2 = new ViewObject(viewObject);
            viewObject2.isSnapshot = true;
            viewObject2.isStateLoadSourceReady = viewObject.isStateLoadSourceReady;
            viewObject2.sharedState = viewObject.sharedState;
            viewObject2.diff = viewObject.diff;
            viewObject = viewObject2;
        }
        HashMap hashMap = new HashMap();
        buildEventBindCache(snapshotInput.version, viewObject, snapshotInput.state, hashMap);
        SnapshotData snapshotData = new SnapshotData();
        snapshotData.viewObject = viewObject;
        snapshotData.preBindData = hashMap;
        snapshotData.version = snapshotInput.version;
        snapshotData.appVersion = ApplicationBuildInfo.getAppVersionName();
        this.mSnapshotData = snapshotData;
        this.mDataStorage.tryWaitInit(1000L);
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("viewObject", (Object) viewObject);
        jSONObject.put("bindData", (Object) hashMap);
        jSONObject.put("version", (Object) snapshotInput.version);
        jSONObject.put("appVersion", (Object) snapshotData.appVersion);
        this.mDataStorage.put("snapshot", jSONObject);
        if (TextUtils.equals(this.mBizConfigCode, "conversationTab")) {
            saveHeadData(viewObject);
            saveHeadUrl(viewObject);
            saveContentUrl(viewObject);
        }
        Logger.d(TAG, "snapshot save " + this.mBizConfigCode);
    }
}
