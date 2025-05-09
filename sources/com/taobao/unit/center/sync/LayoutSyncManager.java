package com.taobao.unit.center.sync;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;
import com.taobao.unit.center.mtop.UnitCenterLayoutSyncModel;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.LayoutRequest;
import com.taobao.unit.center.sync.model.LayoutResponse;
import com.taobao.unit.center.sync.syncable.ISyncable;
import com.taobao.unit.center.sync.syncable.LayoutSyncable;
import com.taobao.unit.center.sync.syncable.SyncHandler;
import com.taobao.unit.center.sync.tool.EnvTool;
import com.taobao.unit.center.templatesync.ILayoutSyncService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001cj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/taobao/unit/center/sync/LayoutSyncManager;", "Lcom/taobao/unit/center/templatesync/ILayoutSyncService;", "<init>", "()V", "Ltb/xhv;", "initDegrade", "Lcom/taobao/unit/center/sync/model/LayoutResponse;", "response", "remoteSyncSuccessFunc", "(Lcom/taobao/unit/center/sync/model/LayoutResponse;)V", "Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;", "model", "setUnitCenterLayoutInfoModel", "(Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;)V", "", DxContainerActivity.PARAMS_NAMESPACE, SyncConstant.KEY_LAYOUTID, "getLayoutInfoModel", "(Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;", "init", "config", "initMessageTab", "(Ljava/lang/String;)V", "checkSync", "clearCache", "Landroid/util/LruCache;", "modelCache", "Landroid/util/LruCache;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "degradeModelCache", "Ljava/util/HashMap;", "Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "syncable", "Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "", "isInit", "Z", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class LayoutSyncManager implements ILayoutSyncService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static LayoutSyncManager instance;
    private boolean isInit;
    public static final Companion Companion = new Companion(null);
    private static final String KEY_LAYOUTJSON = KEY_LAYOUTJSON;
    private static final String KEY_LAYOUTJSON = KEY_LAYOUTJSON;
    private static final String KEY_NAME = "name";
    private static final String KEY_VERSION = "version";
    private static final String KEY_URL = "url";
    private static final String KEY_WEEX_URL = KEY_WEEX_URL;
    private static final String KEY_WEEX_URL = KEY_WEEX_URL;
    private static final String ORANGE_NAME_ENABLE_DINAMICX = ORANGE_NAME_ENABLE_DINAMICX;
    private static final String ORANGE_NAME_ENABLE_DINAMICX = ORANGE_NAME_ENABLE_DINAMICX;
    private final LruCache<String, UnitCenterLayoutInfoModel> modelCache = new LruCache<>(50);
    private final HashMap<String, String> degradeModelCache = new HashMap<>(16);
    private final LayoutSyncable syncable = LayoutSyncable.Companion.getInstance();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/taobao/unit/center/sync/LayoutSyncManager$Companion;", "", "<init>", "()V", "Lcom/taobao/unit/center/sync/LayoutSyncManager;", "getInstance", "()Lcom/taobao/unit/center/sync/LayoutSyncManager;", "", "Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;", "layoutList", "Ltb/xhv;", "checkDownloadDinamicXTemplates", "(Ljava/util/List;)V", "", "ORANGE_NAME_ENABLE_DINAMICX", "Ljava/lang/String;", "getORANGE_NAME_ENABLE_DINAMICX", "()Ljava/lang/String;", "KEY_LAYOUTJSON", "KEY_NAME", "KEY_URL", "KEY_VERSION", "KEY_WEEX_URL", "instance", "Lcom/taobao/unit/center/sync/LayoutSyncManager;", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599794);
        }

        private Companion() {
        }

        public final LayoutSyncManager getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutSyncManager) ipChange.ipc$dispatch("f0dee06d", new Object[]{this});
            }
            if (LayoutSyncManager.access$getInstance$cp() == null) {
                synchronized (LayoutSyncManager.class) {
                    try {
                        if (LayoutSyncManager.access$getInstance$cp() == null) {
                            LayoutSyncManager.access$setInstance$cp(new LayoutSyncManager());
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LayoutSyncManager access$getInstance$cp = LayoutSyncManager.access$getInstance$cp();
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            ckf.s();
            throw null;
        }

        public final String getORANGE_NAME_ENABLE_DINAMICX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c14b48d", new Object[]{this});
            }
            return LayoutSyncManager.access$getORANGE_NAME_ENABLE_DINAMICX$cp();
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void checkDownloadDinamicXTemplates(java.util.List<? extends com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r8) {
            /*
                r7 = this;
                r0 = 1
                com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.unit.center.sync.LayoutSyncManager.Companion.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0015
                java.lang.String r2 = "7eaf4f8"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r7
                r3[r0] = r8
                r1.ipc$dispatch(r2, r3)
                return
            L_0x0015:
                java.lang.String r1 = "layoutList"
                tb.ckf.h(r8, r1)
                java.lang.String r1 = r7.getORANGE_NAME_ENABLE_DINAMICX()
                java.lang.String r2 = "1"
                java.lang.String r3 = "mpm_business_switch"
                java.lang.String r1 = com.taobao.message.kit.util.ConfigUtil.getValue(r3, r1, r2)
                java.lang.String r2 = "ConfigUtil.getValue(\"mpm…AME_ENABLE_DINAMICX, \"1\")"
                tb.ckf.c(r1, r2)
                java.lang.String r2 = "0"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x0036
                return
            L_0x0036:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x003f:
                boolean r2 = r8.hasNext()
                java.lang.String r3 = "cbq@sync"
                if (r2 == 0) goto L_0x00d2
                java.lang.Object r2 = r8.next()
                com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r2 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r2
                if (r2 != 0) goto L_0x0050
                goto L_0x003f
            L_0x0050:
                int r4 = r2.layoutType
                r5 = 3
                if (r4 == r5) goto L_0x0056
                goto L_0x003f
            L_0x0056:
                java.lang.String r4 = r2.layoutData
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L_0x005f
                goto L_0x003f
            L_0x005f:
                java.lang.String r4 = ""
                int r6 = r2.layoutType     // Catch: all -> 0x007f
                if (r6 == r5) goto L_0x0081
                if (r6 != 0) goto L_0x0068
                goto L_0x0081
            L_0x0068:
                if (r6 != r0) goto L_0x0096
                java.lang.String r2 = r2.layoutData     // Catch: all -> 0x007f
                com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: all -> 0x007f
                if (r2 == 0) goto L_0x0096
                java.lang.String r4 = "dynamicXData"
                java.lang.String r4 = r2.getString(r4)     // Catch: all -> 0x007f
                java.lang.String r2 = "jsonObject.getString(\"dynamicXData\")"
                tb.ckf.c(r4, r2)     // Catch: all -> 0x007f
                goto L_0x0096
            L_0x007f:
                r2 = move-exception
                goto L_0x00c9
            L_0x0081:
                java.lang.String r2 = r2.layoutData     // Catch: all -> 0x007f
                com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: all -> 0x007f
                if (r2 == 0) goto L_0x0096
                java.lang.String r4 = "layoutJson"
                java.lang.String r4 = r2.getString(r4)     // Catch: all -> 0x007f
                java.lang.String r2 = "jsonObject.getString(\"layoutJson\")"
                tb.ckf.c(r4, r2)     // Catch: all -> 0x007f
            L_0x0096:
                boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x007f
                if (r2 == 0) goto L_0x009d
                goto L_0x003f
            L_0x009d:
                com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r4)     // Catch: all -> 0x007f
                com.taobao.android.dinamicx.template.download.DXTemplateItem r4 = new com.taobao.android.dinamicx.template.download.DXTemplateItem     // Catch: all -> 0x007f
                r4.<init>()     // Catch: all -> 0x007f
                java.lang.String r5 = com.taobao.unit.center.sync.LayoutSyncManager.access$getKEY_NAME$cp()     // Catch: all -> 0x007f
                java.lang.String r5 = r2.getString(r5)     // Catch: all -> 0x007f
                r4.f7343a = r5     // Catch: all -> 0x007f
                java.lang.String r5 = com.taobao.unit.center.sync.LayoutSyncManager.access$getKEY_VERSION$cp()     // Catch: all -> 0x007f
                long r5 = r2.getLongValue(r5)     // Catch: all -> 0x007f
                r4.b = r5     // Catch: all -> 0x007f
                java.lang.String r5 = com.taobao.unit.center.sync.LayoutSyncManager.access$getKEY_URL$cp()     // Catch: all -> 0x007f
                java.lang.String r2 = r2.getString(r5)     // Catch: all -> 0x007f
                r4.c = r2     // Catch: all -> 0x007f
                r1.add(r4)     // Catch: all -> 0x007f
                goto L_0x003f
            L_0x00c9:
                java.lang.String r2 = android.util.Log.getStackTraceString(r2)
                com.taobao.tao.log.TLog.loge(r3, r2)
                goto L_0x003f
            L_0x00d2:
                boolean r8 = r1.isEmpty()
                if (r8 == 0) goto L_0x00d9
                return
            L_0x00d9:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "checkDownloadDinamicXTemplates size="
                r8.<init>(r0)
                int r0 = r1.size()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                com.taobao.tao.log.TLog.loge(r3, r8)
                com.taobao.android.dinamicx.DinamicXEngine r8 = com.taobao.unit.center.mdc.MsgDinamicxEngine.createNewEngine()
                r8.p(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.sync.LayoutSyncManager.Companion.checkDownloadDinamicXTemplates(java.util.List):void");
        }
    }

    public static final /* synthetic */ LayoutSyncManager access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutSyncManager) ipChange.ipc$dispatch("4affca88", new Object[0]);
        }
        return instance;
    }

    public static final /* synthetic */ String access$getKEY_NAME$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("808c0fa9", new Object[0]);
        }
        return KEY_NAME;
    }

    public static final /* synthetic */ String access$getKEY_URL$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b698381", new Object[0]);
        }
        return KEY_URL;
    }

    public static final /* synthetic */ String access$getKEY_VERSION$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15fd2ea", new Object[0]);
        }
        return KEY_VERSION;
    }

    public static final /* synthetic */ String access$getORANGE_NAME_ENABLE_DINAMICX$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c127d934", new Object[0]);
        }
        return ORANGE_NAME_ENABLE_DINAMICX;
    }

    public static final /* synthetic */ LayoutSyncable access$getSyncable$p(LayoutSyncManager layoutSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutSyncable) ipChange.ipc$dispatch("921021d7", new Object[]{layoutSyncManager});
        }
        return layoutSyncManager.syncable;
    }

    public static final /* synthetic */ void access$remoteSyncSuccessFunc(LayoutSyncManager layoutSyncManager, LayoutResponse layoutResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af06baca", new Object[]{layoutSyncManager, layoutResponse});
        } else {
            layoutSyncManager.remoteSyncSuccessFunc(layoutResponse);
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(LayoutSyncManager layoutSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323ae4aa", new Object[]{layoutSyncManager});
        } else {
            instance = layoutSyncManager;
        }
    }

    @JvmStatic
    public static final void checkDownloadDinamicXTemplates(List<? extends UnitCenterLayoutInfoModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eaf4f8", new Object[]{list});
        } else {
            Companion.checkDownloadDinamicXTemplates(list);
        }
    }

    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    public void checkSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc239aca", new Object[]{this});
            return;
        }
        TLog.loge(SyncConstant.TAG, "layout checkSync start ");
        EnvTool.INSTANCE.isSwitchEnv(EnvTool.KEY_LAST_ENV2, new LayoutSyncManager$checkSync$1(this));
        SyncHandler.INSTANCE.doCheckSync(new LayoutRequest(null, null, 3, null), this.syncable, new LayoutSyncManager$checkSync$2(this));
    }

    public final void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.modelCache.evictAll();
        this.degradeModelCache.clear();
        this.isInit = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        if (r8.updateTime <= r1.updateTime) goto L_0x007c;
     */
    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel getLayoutInfoModel(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.unit.center.sync.LayoutSyncManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "d0b82934"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r7 = 2
            r2[r7] = r8
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r7 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r7
            return r7
        L_0x001b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "_"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            android.util.LruCache<java.lang.String, com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r8 = r6.modelCache
            java.lang.Object r8 = r8.get(r7)
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r8 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r8
            if (r8 == 0) goto L_0x003a
            return r8
        L_0x003a:
            java.lang.String r0 = com.taobao.message.kit.util.SharedPreferencesUtil.getStringSharedPreference(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.Class<com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r2 = com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel.class
            java.lang.String r3 = "cbq@sync"
            if (r1 != 0) goto L_0x006a
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r0, r2)     // Catch: all -> 0x0050
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r1 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r1     // Catch: all -> 0x0050
            r8 = r1
            goto L_0x006a
        L_0x0050:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "parseModel fail, data is "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.taobao.tao.log.TLog.loge(r3, r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            com.taobao.tao.log.TLog.loge(r3, r0)
        L_0x006a:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.degradeModelCache
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = com.alibaba.fastjson.JSON.parseObject(r0, r2)     // Catch: all -> 0x0089
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r1 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r1     // Catch: all -> 0x0089
            if (r8 != 0) goto L_0x007e
        L_0x007c:
            r8 = r1
            goto L_0x009b
        L_0x007e:
            if (r1 == 0) goto L_0x009b
            long r4 = r8.updateTime     // Catch: all -> 0x0089
            long r2 = r1.updateTime     // Catch: all -> 0x0089
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            goto L_0x007c
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "parseModel fail, degrade is "
            java.lang.String r0 = r2.concat(r0)
            com.taobao.tao.log.TLog.loge(r3, r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            com.taobao.tao.log.TLog.loge(r3, r0)
        L_0x009b:
            if (r8 == 0) goto L_0x00a2
            android.util.LruCache<java.lang.String, com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r0 = r6.modelCache
            r0.put(r7, r8)
        L_0x00a2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.sync.LayoutSyncManager.getLayoutInfoModel(java.lang.String, java.lang.String):com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel");
    }

    public final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.isInit) {
            checkSync();
            initDegrade();
            this.isInit = true;
        }
    }

    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    public void setUnitCenterLayoutInfoModel(UnitCenterLayoutInfoModel unitCenterLayoutInfoModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48fb11", new Object[]{this, unitCenterLayoutInfoModel});
        } else if (unitCenterLayoutInfoModel != null) {
            String str = unitCenterLayoutInfoModel.nameSpace + "_" + unitCenterLayoutInfoModel.layoutId;
            this.modelCache.put(str, unitCenterLayoutInfoModel);
            SharedPreferencesUtil.addStringSharedPreference(str, JSON.toJSONString(unitCenterLayoutInfoModel));
        }
    }

    private final void initDegrade() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb956e4d", new Object[]{this});
            return;
        }
        String loadZipFromAsset = FileUtil.loadZipFromAsset(ApplicationUtil.getApplication(), "compress/mpm_layoutinfo.json.zip");
        if (!TextUtils.isEmpty(loadZipFromAsset)) {
            JSONArray parseArray = JSON.parseArray(loadZipFromAsset);
            ckf.c(parseArray, "jsonArray");
            Iterator<Object> it = parseArray.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
                if (i >= 0) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    HashMap<String, String> hashMap = this.degradeModelCache;
                    hashMap.put("tbmessage_" + jSONObject.getString(SyncConstant.KEY_LAYOUTID), jSONObject.toJSONString());
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
    }

    private final void remoteSyncSuccessFunc(LayoutResponse layoutResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6023b19", new Object[]{this, layoutResponse});
            return;
        }
        TLog.loge(SyncConstant.TAG, "layoutSync remoteSyncSuccessFunc");
        HashMap<String, Long> groups = layoutResponse.getGroups();
        if (groups != null) {
            UnitCenterLayoutSyncModel model = layoutResponse.getModel();
            if (model == null) {
                ckf.s();
                throw null;
            } else if (model.layouts != null) {
                HashMap hashMap = new HashMap();
                for (UnitCenterLayoutSyncModel.Layout layout : model.layouts) {
                    Long l = 0L;
                    if (groups.containsKey(layout.group)) {
                        l = groups.get(layout.group);
                    }
                    long j = layout.timestamp;
                    if (l != null) {
                        if (j > l.longValue()) {
                            String str = layout.group;
                            ckf.c(str, "layout.group");
                            groups.put(str, Long.valueOf(layout.timestamp));
                        }
                        List<UnitCenterLayoutInfoModel> list = layout.layoutList;
                        if (list != null) {
                            for (UnitCenterLayoutInfoModel unitCenterLayoutInfoModel : list) {
                                setUnitCenterLayoutInfoModel(unitCenterLayoutInfoModel);
                            }
                            Companion companion = Companion;
                            List<UnitCenterLayoutInfoModel> list2 = layout.layoutList;
                            ckf.c(list2, "layout.layoutList");
                            companion.checkDownloadDinamicXTemplates(list2);
                        }
                        if (layout.next) {
                            String str2 = layout.group;
                            ckf.c(str2, "layout.group");
                            hashMap.put(str2, groups.get(layout.group));
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                }
                this.syncable.isSyncing().set(false);
                if (hashMap.size() > 0) {
                    this.syncable.updateTimeStamp(groups);
                    ISyncable.DefaultImpls.doRemoteSync$default(this.syncable, new LayoutRequest(hashMap, null, 2, null), new LayoutSyncManager$remoteSyncSuccessFunc$1(this), null, 4, null);
                    return;
                }
                for (String str3 : groups.keySet()) {
                    ckf.c(str3, "item");
                    groups.put(str3, Long.valueOf(this.syncable.getRemoteIncTimeStamp()));
                }
                this.syncable.updateTimeStamp(groups);
                TLog.loge(SyncConstant.TAG, "layout sync, no more groups");
            }
        } else {
            ckf.s();
            throw null;
        }
    }

    public final void initMessageTab(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fbb4f", new Object[]{this, str});
            return;
        }
        ckf.h(str, "config");
        JSONArray parseArray = JSON.parseArray(str);
        ckf.c(parseArray, "jsonArray");
        Iterator<Object> it = parseArray.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i >= 0) {
                JSONObject jSONObject = parseArray.getJSONObject(i);
                HashMap<String, String> hashMap = this.degradeModelCache;
                hashMap.put("tbmessage_" + jSONObject.getString(SyncConstant.KEY_LAYOUTID), jSONObject.toJSONString());
            } else {
                yz3.p();
                throw null;
            }
        }
    }

    static {
        t2o.a(552599793);
        t2o.a(552599828);
    }
}
