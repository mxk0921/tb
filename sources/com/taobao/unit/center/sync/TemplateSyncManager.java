package com.taobao.unit.center.sync;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.TemplateRequest;
import com.taobao.unit.center.sync.packer.TemplatePacker;
import com.taobao.unit.center.sync.syncable.ISyncable;
import com.taobao.unit.center.sync.syncable.SyncHandler;
import com.taobao.unit.center.sync.syncable.TemplateSyncable;
import com.taobao.unit.center.sync.tool.EnvTool;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020!048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103¨\u0006<"}, d2 = {"Lcom/taobao/unit/center/sync/TemplateSyncManager;", "Lcom/taobao/unit/center/templatesync/ITemplateSyncService;", "<init>", "()V", "Ltb/xhv;", "initDegrade", "", "inputId", "Lcom/alibaba/fastjson/JSONObject;", "getSharedPreference", "(I)Lcom/alibaba/fastjson/JSONObject;", "templateId", "Lorg/json/JSONObject;", "jsonObject", "remoteSingleSyncFunc", "(ILorg/json/JSONObject;)V", "notifyChange", "remoteSyncSuccessFunc", "(Lorg/json/JSONObject;)V", DMComponent.RESET, "intMessageTab", "init", "checkSync", "reInit", "", "getTemplateData", "(I)Ljava/lang/String;", "getLayoutId", "checkDoSingleMakeup", "(I)V", "layout", "getLayoutStyle", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/taobao/unit/center/templatesync/ITemplateSyncService$ISyncListener;", DataReceiveMonitor.CB_LISTENER, "addSyncListener", "(Lcom/taobao/unit/center/templatesync/ITemplateSyncService$ISyncListener;)V", "removeSyncListener", "KEY_SYNC", "Ljava/lang/String;", "KEY_LAYOUT_MAP", "KEY_LAYOUTID", "Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "syncable", "Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "Ljava/util/concurrent/ConcurrentHashMap;", "templateId2DataMap", "Ljava/util/concurrent/ConcurrentHashMap;", "templateId2LayoutIdMap", "", "isReset", "Z", "Ljava/util/ArrayList;", "syncListenerList", "Ljava/util/ArrayList;", "maxResetCount", TLogTracker.LEVEL_INFO, "curResetCount", "isInit", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TemplateSyncManager implements ITemplateSyncService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);
    private static TemplateSyncManager instance;
    private int curResetCount;
    private volatile boolean isInit;
    private boolean isReset;
    private final String KEY_SYNC = "KEY_SYNC";
    private final String KEY_LAYOUT_MAP = "KEY_LAYOUT_MAP";
    private final String KEY_LAYOUTID = SyncConstant.KEY_LAYOUTID;
    private final TemplateSyncable syncable = TemplateSyncable.Companion.getInstance();
    private final ConcurrentHashMap<Integer, String> templateId2DataMap = new ConcurrentHashMap<>(16);
    private final ConcurrentHashMap<Integer, String> templateId2LayoutIdMap = new ConcurrentHashMap<>();
    private final ArrayList<ITemplateSyncService.ISyncListener> syncListenerList = new ArrayList<>();
    private final int maxResetCount = 3;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/TemplateSyncManager$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/TemplateSyncManager;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599799);
        }

        private Companion() {
        }

        public final TemplateSyncManager getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateSyncManager) ipChange.ipc$dispatch("edbe933d", new Object[]{this});
            }
            if (TemplateSyncManager.access$getInstance$cp() == null) {
                synchronized (TemplateSyncManager.class) {
                    try {
                        if (TemplateSyncManager.access$getInstance$cp() == null) {
                            TemplateSyncManager.access$setInstance$cp(new TemplateSyncManager());
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            TemplateSyncManager access$getInstance$cp = TemplateSyncManager.access$getInstance$cp();
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            ckf.s();
            throw null;
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(552599798);
        t2o.a(552599829);
    }

    public static final /* synthetic */ TemplateSyncManager access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSyncManager) ipChange.ipc$dispatch("434d6298", new Object[0]);
        }
        return instance;
    }

    public static final /* synthetic */ TemplateSyncable access$getSyncable$p(TemplateSyncManager templateSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateSyncable) ipChange.ipc$dispatch("2e3c09d7", new Object[]{templateSyncManager});
        }
        return templateSyncManager.syncable;
    }

    public static final /* synthetic */ void access$remoteSingleSyncFunc(TemplateSyncManager templateSyncManager, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddf82", new Object[]{templateSyncManager, new Integer(i), jSONObject});
        } else {
            templateSyncManager.remoteSingleSyncFunc(i, jSONObject);
        }
    }

    public static final /* synthetic */ void access$remoteSyncSuccessFunc(TemplateSyncManager templateSyncManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7f3690", new Object[]{templateSyncManager, jSONObject});
        } else {
            templateSyncManager.remoteSyncSuccessFunc(jSONObject);
        }
    }

    public static final /* synthetic */ void access$reset(TemplateSyncManager templateSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec0ce5", new Object[]{templateSyncManager});
        } else {
            templateSyncManager.reset();
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(TemplateSyncManager templateSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8577a", new Object[]{templateSyncManager});
        } else {
            instance = templateSyncManager;
        }
    }

    private final void notifyChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779aec60", new Object[]{this});
            return;
        }
        synchronized (this.syncListenerList) {
            try {
                for (ITemplateSyncService.ISyncListener iSyncListener : this.syncListenerList) {
                    TLog.loge(SyncConstant.TAG, " syncLisenter onSync:" + iSyncListener);
                    iSyncListener.onSync();
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void addSyncListener(ITemplateSyncService.ISyncListener iSyncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee39983", new Object[]{this, iSyncListener});
            return;
        }
        ckf.h(iSyncListener, DataReceiveMonitor.CB_LISTENER);
        synchronized (this.syncListenerList) {
            this.syncListenerList.add(iSyncListener);
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void checkDoSingleMakeup(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449b8318", new Object[]{this, new Integer(i)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "checkDoSingleMakeup called " + i);
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.TemplateSyncManager$checkDoSingleMakeup$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(TemplateSyncManager$checkDoSingleMakeup$1 templateSyncManager$checkDoSingleMakeup$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/TemplateSyncManager$checkDoSingleMakeup$1");
            }

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                } else {
                    SyncHandler.INSTANCE.doRemoteSyncSingle(new TemplateRequest(100L, Integer.valueOf(i)), TemplateSyncManager.access$getSyncable$p(TemplateSyncManager.this), new TemplateSyncManager$checkDoSingleMakeup$1$execute$1(TemplateSyncManager.this));
                }
            }
        });
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void checkSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc239aca", new Object[]{this});
            return;
        }
        EnvTool.INSTANCE.isSwitchEnv(EnvTool.KEY_LAST_ENV1, new TemplateSyncManager$checkSync$1(this));
        SyncHandler.INSTANCE.doCheckSync(new TemplateRequest(100L, null, 2, null), this.syncable, new TemplateSyncManager$checkSync$2(this));
        TLog.loge(SyncConstant.TAG, "template checkSync end");
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("676cf1df", new Object[]{this, new Integer(i)});
        }
        return this.templateId2LayoutIdMap.get(Integer.valueOf(i));
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getLayoutStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77f51d9e", new Object[]{this, str});
        }
        ckf.h(str, "layout");
        return TemplatePacker.INSTANCE.getLayoutStyle(str);
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getTemplateData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("378c26fe", new Object[]{this, new Integer(i)});
        }
        String str = this.templateId2DataMap.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        com.alibaba.fastjson.JSONObject sharedPreference = getSharedPreference(i);
        if (sharedPreference != null) {
            return sharedPreference.toJSONString();
        }
        if (i <= 0 || !this.isInit) {
            return "";
        }
        TLog.loge(SyncConstant.TAG, "getTemplateData 需要单个补偿 templateId:" + i);
        checkDoSingleMakeup(i);
        return "";
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.isInit) {
            checkSync();
            initDegrade();
            LayoutSyncManager.Companion.getInstance().init();
            notifyChange();
            this.isInit = true;
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void reInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c70ea", new Object[]{this});
            return;
        }
        this.templateId2DataMap.clear();
        this.templateId2LayoutIdMap.clear();
        this.isInit = false;
        LayoutSyncManager.Companion.getInstance().clearCache();
        init();
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void removeSyncListener(ITemplateSyncService.ISyncListener iSyncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cbc866", new Object[]{this, iSyncListener});
            return;
        }
        ckf.h(iSyncListener, DataReceiveMonitor.CB_LISTENER);
        synchronized (this.syncListenerList) {
            this.syncListenerList.remove(iSyncListener);
        }
    }

    private final com.alibaba.fastjson.JSONObject getSharedPreference(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("73e58da6", new Object[]{this, new Integer(i)});
        }
        String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference("templateSyncInfo" + i);
        try {
            if (TextUtils.isEmpty(stringSharedPreference) || this.isReset) {
                return null;
            }
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(stringSharedPreference);
            ConcurrentHashMap<Integer, String> concurrentHashMap = this.templateId2DataMap;
            Integer valueOf = Integer.valueOf(i);
            ckf.c(stringSharedPreference, "data");
            concurrentHashMap.put(valueOf, stringSharedPreference);
            parseObject.containsKey(this.KEY_LAYOUTID);
            ConcurrentHashMap<Integer, String> concurrentHashMap2 = this.templateId2LayoutIdMap;
            Integer valueOf2 = Integer.valueOf(i);
            String string = parseObject.getString(this.KEY_LAYOUTID);
            ckf.c(string, "templateData.getString(KEY_LAYOUTID)");
            concurrentHashMap2.put(valueOf2, string);
            return parseObject;
        } catch (Exception e) {
            TLog.logw(e.getMessage(), new String[0]);
            return null;
        }
    }

    private final void remoteSingleSyncFunc(int i, JSONObject jSONObject) {
        JSONObject optJSONObject;
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af448bef", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        TLog.loge(SyncConstant.TAG, "templateSingleSync remoteSingleSyncSuccessFunc " + i);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("model");
        JSONObject jSONObject2 = null;
        JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("templateInfos") : null;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            this.templateId2DataMap.put(Integer.valueOf(i), "");
            return;
        }
        com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(optJSONArray.getString(0));
        TLog.loge(SyncConstant.TAG, "templateSingleSync templateData is " + parseObject2);
        HashMap hashMap = new HashMap();
        int intValue = parseObject2.getIntValue("templateId");
        String string = parseObject2.getString(this.KEY_LAYOUTID);
        if ("1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "need_check_template_cache_update_time", "0"))) {
            Long l = parseObject2.getLong(StWindow.UPDATE_TIME);
            String str = this.templateId2DataMap.get(Integer.valueOf(intValue));
            if (!(str == null || (parseObject = JSON.parseObject(str)) == null)) {
                long longValue = parseObject.getLongValue(StWindow.UPDATE_TIME);
                ckf.c(l, StWindow.UPDATE_TIME);
                if (longValue > l.longValue()) {
                    TLog.loge(SyncConstant.TAG, " remoteSingleSyncFunc cacheUpdateTime > updateTime " + longValue + " | " + l + ' ');
                    return;
                }
            }
        }
        Integer valueOf = Integer.valueOf(intValue);
        String json = parseObject2.toString();
        ckf.c(json, "templateData.toString()");
        hashMap.put(valueOf, json);
        synchronized (this.templateId2DataMap) {
            this.templateId2DataMap.putAll(hashMap);
            xhv xhvVar = xhv.INSTANCE;
        }
        SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + intValue, (String) hashMap.get(Integer.valueOf(intValue)));
        if (string != null) {
            this.templateId2LayoutIdMap.put(Integer.valueOf(intValue), string);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("model");
        if (!(optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("layoutIdMapLayoutInfos")) == null)) {
            jSONObject2 = optJSONObject.optJSONObject(string);
        }
        if (jSONObject2 != null) {
            try {
                UnitCenterLayoutInfoModel unitCenterLayoutInfoModel = (UnitCenterLayoutInfoModel) JSON.parseObject(jSONObject2.toString(), UnitCenterLayoutInfoModel.class);
                LayoutSyncManager.Companion.getInstance().setUnitCenterLayoutInfoModel(unitCenterLayoutInfoModel);
                TLog.loge(SyncConstant.TAG, "layoutInfo已补偿" + unitCenterLayoutInfoModel);
            } catch (Throwable th) {
                TLog.loge(SyncConstant.TAG, "templateSingleSync parse layoutModel error :" + Log.getStackTraceString(th));
            }
        }
        notifyChange();
    }

    private final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        int i = this.curResetCount + 1;
        this.curResetCount = i;
        if (i <= this.maxResetCount) {
            this.isReset = true;
            Iterator<Map.Entry<Integer, String>> it = this.templateId2DataMap.entrySet().iterator();
            while (it.hasNext()) {
                SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + it.next().getKey().intValue(), "");
            }
            this.syncable.updateLocalIncTimeStamp(0L);
        }
    }

    public final void intMessageTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54759964", new Object[]{this});
            return;
        }
        LayoutConfig layoutConfig = new LayoutConfig();
        com.alibaba.fastjson.JSONArray parseArray = JSON.parseArray(layoutConfig.msgTabTemplateConfig);
        if (parseArray != null) {
            int size = parseArray.size();
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                if (jSONObject != null) {
                    int intValue = jSONObject.getIntValue("templateId");
                    ConcurrentHashMap<Integer, String> concurrentHashMap = this.templateId2DataMap;
                    Integer valueOf = Integer.valueOf(intValue);
                    String json = jSONObject.toString();
                    ckf.c(json, "templateData.toString()");
                    concurrentHashMap.put(valueOf, json);
                }
            }
        }
        LayoutSyncManager instance2 = LayoutSyncManager.Companion.getInstance();
        String str = layoutConfig.msgTabLayoutConfig;
        ckf.c(str, "layoutConfig.msgTabLayoutConfig");
        instance2.initMessageTab(str);
    }

    private final void initDegrade() {
        int intValue;
        int intValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb956e4d", new Object[]{this});
            return;
        }
        try {
            TLog.loge(SyncConstant.TAG, "initDegrade start : ");
            if (!ApplicationUtil.isDebug() || !this.isReset) {
                com.alibaba.fastjson.JSONArray parseArray = JSON.parseArray(FileUtil.loadZipFromAsset(ApplicationUtil.getApplication(), "compress/mpm_templateinfo.json.zip"));
                if (parseArray != null) {
                    int size = parseArray.size();
                    for (int i = 0; i < size; i++) {
                        com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                        if (!(jSONObject == null || (intValue2 = jSONObject.getIntValue("templateId")) == 0)) {
                            com.alibaba.fastjson.JSONObject sharedPreference = getSharedPreference(intValue2);
                            if (intValue2 == 503) {
                                TLog.loge(SyncConstant.TAG, "sp " + sharedPreference);
                                TLog.loge(SyncConstant.TAG, "config " + jSONObject);
                            }
                            if (sharedPreference == null || jSONObject.getLongValue(StWindow.UPDATE_TIME) > sharedPreference.getLongValue(StWindow.UPDATE_TIME)) {
                                ConcurrentHashMap<Integer, String> concurrentHashMap = this.templateId2DataMap;
                                Integer valueOf = Integer.valueOf(intValue2);
                                String json = jSONObject.toString();
                                ckf.c(json, "templateData.toString()");
                                concurrentHashMap.put(valueOf, json);
                                jSONObject.containsKey(this.KEY_LAYOUTID);
                                ConcurrentHashMap<Integer, String> concurrentHashMap2 = this.templateId2LayoutIdMap;
                                Integer valueOf2 = Integer.valueOf(intValue2);
                                String string = jSONObject.getString(this.KEY_LAYOUTID);
                                ckf.c(string, "templateData.getString(KEY_LAYOUTID)");
                                concurrentHashMap2.put(valueOf2, string);
                            } else {
                                TLog.loge(SyncConstant.TAG, "use degree " + intValue2);
                            }
                        }
                    }
                } else {
                    TLog.loge(SyncConstant.TAG, "templateId2DataMap error   ");
                }
                TLog.loge(SyncConstant.TAG, "templateId2DataMap end : ");
                TLog.loge(SyncConstant.TAG, "templateId2DataMap 503 : " + this.templateId2DataMap.get(503));
                if (ckf.b("1", ConfigUtil.getValue("mpm_data_switch", "useSpTemplate", "0"))) {
                    String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference(this.KEY_SYNC);
                    TLog.loge(SyncConstant.TAG, "layoutJSON: " + stringSharedPreference);
                    if (!TextUtils.isEmpty(stringSharedPreference)) {
                        com.alibaba.fastjson.JSONArray jSONArray = JSON.parseObject(stringSharedPreference).getJSONArray(this.KEY_LAYOUT_MAP);
                        int size2 = jSONArray.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            if (!(jSONObject2 == null || (intValue = jSONObject2.getIntValue("templateId")) == 503)) {
                                ConcurrentHashMap<Integer, String> concurrentHashMap3 = this.templateId2DataMap;
                                Integer valueOf3 = Integer.valueOf(intValue);
                                String json2 = jSONObject2.toString();
                                ckf.c(json2, "templateData.toString()");
                                concurrentHashMap3.put(valueOf3, json2);
                                jSONObject2.containsKey(this.KEY_LAYOUTID);
                                ConcurrentHashMap<Integer, String> concurrentHashMap4 = this.templateId2LayoutIdMap;
                                Integer valueOf4 = Integer.valueOf(intValue);
                                String string2 = jSONObject2.getString(this.KEY_LAYOUTID);
                                ckf.c(string2, "templateData.getString(KEY_LAYOUTID)");
                                concurrentHashMap4.put(valueOf4, string2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (ApplicationUtil.isDebug()) {
                throw e;
            }
        }
    }

    private final void remoteSyncSuccessFunc(JSONObject jSONObject) {
        boolean z;
        int i;
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2f47b1", new Object[]{this, jSONObject});
            return;
        }
        TLog.loge(SyncConstant.TAG, "templateSync remoteSyncSuccessFunc");
        JSONObject optJSONObject = jSONObject.optJSONObject("model");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("next");
            long optLong = optJSONObject.optLong("timestamp");
            JSONArray optJSONArray = optJSONObject.optJSONArray("templates");
            if (optJSONArray != null) {
                HashMap hashMap = new HashMap();
                int length = optJSONArray.length();
                int i2 = 0;
                z = false;
                while (i2 < length) {
                    com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(optJSONArray.optString(i2));
                    if (parseObject2 == null) {
                        TLog.loge(BaseRunnable.TAG, "layout is empty");
                        i = 1;
                        z = true;
                    } else {
                        int intValue = parseObject2.getIntValue("templateId");
                        Object obj = parseObject2.get(StWindow.UPDATE_TIME);
                        int intValue2 = obj instanceof Integer ? ((Number) obj).intValue() : 0;
                        String str = this.templateId2DataMap.get(Integer.valueOf(intValue));
                        if (!(str == null || (parseObject = JSON.parseObject(str)) == null)) {
                            long longValue = parseObject.getLongValue(StWindow.UPDATE_TIME);
                            if (longValue > intValue2) {
                                TLog.loge(SyncConstant.TAG, " remoteSyncSuccessFunc cacheUpdateTime > updateTime " + longValue + " | " + intValue2 + ' ');
                                i = 1;
                            }
                        }
                        Integer valueOf = Integer.valueOf(intValue);
                        String json = parseObject2.toString();
                        ckf.c(json, "templateData.toString()");
                        hashMap.put(valueOf, json);
                        SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + intValue, (String) hashMap.get(Integer.valueOf(intValue)));
                        parseObject2.containsKey(this.KEY_LAYOUTID);
                        ConcurrentHashMap<Integer, String> concurrentHashMap = this.templateId2LayoutIdMap;
                        Integer valueOf2 = Integer.valueOf(intValue);
                        String string = parseObject2.getString(this.KEY_LAYOUTID);
                        ckf.c(string, "templateData.getString(KEY_LAYOUTID)");
                        concurrentHashMap.put(valueOf2, string);
                        i = 1;
                    }
                    i2 += i;
                }
                synchronized (this.templateId2DataMap) {
                    this.templateId2DataMap.putAll(hashMap);
                    xhv xhvVar = xhv.INSTANCE;
                }
            } else {
                z = false;
            }
            this.syncable.updateLocalIncTimeStamp(optLong);
            if (z) {
                TLog.loge(SyncConstant.TAG, "reset for exception");
                reset();
            } else {
                notifyChange();
            }
            this.syncable.isSyncing().set(false);
            if (z || !optBoolean) {
                TLog.loge(SyncConstant.TAG, "记录init时间");
            } else {
                ISyncable.DefaultImpls.doRemoteSync$default(this.syncable, new TemplateRequest(100L, null, 2, null), new TemplateSyncManager$remoteSyncSuccessFunc$4(this), null, 4, null);
            }
        }
    }
}
