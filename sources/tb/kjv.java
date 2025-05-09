package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.datasource.local.UpdateInfo;
import com.taobao.update.types.PatchType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.s7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kjv implements ijv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Application sContext;
    public static bjv sUpdateAdapter;

    /* renamed from: a  reason: collision with root package name */
    public kkv f22713a;
    public cf0 d;
    public final Handler e;
    public static boolean inited = false;
    public static String sGroup = null;
    public static long lastPopTime = 0;
    public static Map<String, yjv> listenerMap = new HashMap();
    public static final kjv g = new kjv();
    public final Map<String, uif> b = new HashMap();
    public final Map<String, n6e> c = new HashMap();
    public final gdh f = fih.getLog(kjv.class, (gdh) null);
    public volatile boolean isUpdating = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/datasource/UpdateDataSource$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                kjv kjvVar = kjv.this;
                kjv.access$100(kjvVar, (UpdateInfo) message.obj, true, kjv.access$000(kjvVar), gjv.ACCS_SOURCE);
                try {
                    vet.instance().run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (i == 1) {
                kjv.access$100(kjv.this, (UpdateInfo) message.obj, message.getData().getBoolean("background"), kjv.access$000(kjv.this), gjv.MTOP_SOURCE);
                try {
                    vet.instance().run();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            } else if (i == 2) {
                Object obj = message.obj;
                if (obj != null) {
                    kjv kjvVar2 = kjv.this;
                    kjv.access$100(kjvVar2, (UpdateInfo) obj, false, kjv.access$000(kjvVar2), gjv.SCAN);
                }
                try {
                    vet.instance().run();
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            } else if (i == 4) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    kjv kjvVar3 = kjv.this;
                    kjv.access$100(kjvVar3, (UpdateInfo) obj2, true, kjv.access$000(kjvVar3), gjv.SAFE_MODE);
                }
                try {
                    vet.instance().run();
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
            } else if (i == 5) {
                kjv.access$100(kjv.this, (UpdateInfo) message.obj, message.getData().getBoolean("background"), kjv.access$000(kjv.this), "NOTICE");
                try {
                    vet.instance().run();
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends wtl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$background;
        public final /* synthetic */ PatchType val$key;
        public final /* synthetic */ UpdateInfo.UpdateData val$updateData;
        public final /* synthetic */ yjv val$updateListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yjv yjvVar, yjv yjvVar2, PatchType patchType, boolean z, UpdateInfo.UpdateData updateData) {
            super(yjvVar);
            this.val$updateListener = yjvVar2;
            this.val$key = patchType;
            this.val$background = z;
            this.val$updateData = updateData;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/datasource/UpdateDataSource$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            yjv yjvVar = this.val$updateListener;
            if (yjvVar != null) {
                try {
                    if (!gjv.HOTPATCH.equals(this.val$key.getKey())) {
                        z = this.val$background;
                    }
                    UpdateInfo.UpdateData updateData = this.val$updateData;
                    yjvVar.onUpdate(z, updateData.value, updateData.from);
                } catch (Throwable th) {
                    th.printStackTrace();
                    kjv.access$200(kjv.this, this.val$updateData, this.val$key);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements s7j.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$forceRequest;

        public c(boolean z) {
            this.val$forceRequest = z;
        }

        @Override // tb.s7j.b
        public void hasUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7413e254", new Object[]{this, str});
            }
        }

        @Override // tb.s7j.b
        public void noUpdate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("429a9d71", new Object[]{this});
                return;
            }
            kjv.access$300(kjv.this).e("invoke mtop no update!");
            if (this.val$forceRequest) {
                kjv.getInstance().toast(nkv.getAppNameString(R.string.notice_noupdate));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements s7j.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.s7j.a
        public void onDegrade() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c327e1e", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$background;

        public e(boolean z) {
            this.val$background = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kjv.this.getRecentData(true ^ this.val$background);
            kjv.this.isUpdating = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$url;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a extends wtl {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ yjv val$updateListener;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(yjv yjvVar, yjv yjvVar2) {
                super(yjvVar);
                this.val$updateListener = yjvVar2;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/datasource/UpdateDataSource$6$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) f.this.val$url);
                this.val$updateListener.onUpdate(false, jSONObject, gjv.SCAN);
            }
        }

        public f(String str) {
            this.val$url = str;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/datasource/UpdateDataSource$6");
        }

        public Void doInBackground(Void... voidArr) {
            String response;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            if (this.val$url.contains("get_bundle_install_data")) {
                yjv yjvVar = kjv.listenerMap.get(gjv.TEST_URL);
                if (yjvVar != null) {
                    vet.instance().add(new gxm(PatchType.TESTURL, new a(yjvVar, yjvVar), gjv.SCAN, false));
                }
                if (kjv.access$400(kjv.this)) {
                    kjv.this.toast("已经有更新正在运行中");
                } else {
                    kjv.access$500(kjv.this).obtainMessage(2).sendToTarget();
                }
                return null;
            }
            if (this.val$url.startsWith(uyv.HTTPS_SCHEMA) || this.val$url.startsWith("http:")) {
                response = new d8b().getResponse(this.val$url);
            } else {
                response = this.val$url;
            }
            if (!TextUtils.isEmpty(response)) {
                kjv.this.onUpdate(gjv.SCAN, null, false, response, new String[0]);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$msg;

        public g(String str) {
            this.val$msg = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(kjv.sContext, this.val$msg, 1).show();
            }
        }
    }

    static {
        t2o.a(950009874);
        t2o.a(950009888);
    }

    public kjv() {
        HandlerThread handlerThread = new HandlerThread(kjv.class.getName());
        handlerThread.start();
        this.e = new a(handlerThread.getLooper());
    }

    public static /* synthetic */ cf0 access$000(kjv kjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cf0) ipChange.ipc$dispatch("d4a17008", new Object[]{kjvVar});
        }
        return kjvVar.d;
    }

    public static /* synthetic */ void access$100(kjv kjvVar, UpdateInfo updateInfo, boolean z, cf0 cf0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774a1f8a", new Object[]{kjvVar, updateInfo, new Boolean(z), cf0Var, str});
        } else {
            kjvVar.b(updateInfo, z, cf0Var, str);
        }
    }

    public static /* synthetic */ void access$200(kjv kjvVar, UpdateInfo.UpdateData updateData, PatchType patchType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61ea6bb", new Object[]{kjvVar, updateData, patchType});
        } else {
            kjvVar.f(updateData, patchType);
        }
    }

    public static /* synthetic */ gdh access$300(kjv kjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdh) ipChange.ipc$dispatch("a53bc417", new Object[]{kjvVar});
        }
        return kjvVar.f;
    }

    public static /* synthetic */ boolean access$400(kjv kjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f9b4825", new Object[]{kjvVar})).booleanValue();
        }
        return kjvVar.d();
    }

    public static /* synthetic */ Handler access$500(kjv kjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("688bf006", new Object[]{kjvVar});
        }
        return kjvVar.e;
    }

    public static kjv getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kjv) ipChange.ipc$dispatch("9c3373fe", new Object[0]);
        }
        return g;
    }

    public static long getLastPopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc8d6b8d", new Object[0])).longValue();
        }
        if (lastPopTime == 0) {
            synchronized (kjv.class) {
                try {
                    if (lastPopTime == 0) {
                        long lastPopTime2 = nkv.getLastPopTime();
                        lastPopTime = lastPopTime2;
                        return lastPopTime2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lastPopTime;
    }

    public final zct a(PatchType patchType, UpdateInfo.UpdateData updateData, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zct) ipChange.ipc$dispatch("4bc50467", new Object[]{this, patchType, updateData, str, new Boolean(z)});
        }
        yjv yjvVar = listenerMap.get(patchType.getKey());
        return new gxm(patchType, new b(yjvVar, yjvVar, patchType, z, updateData), str, z);
    }

    public void addUpdateInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cc7d29", new Object[]{this, str});
        } else {
            new f(str).execute(new Void[0]);
        }
    }

    public final UpdateInfo.UpdateData c(UpdateInfo updateInfo) {
        Map<String, UpdateInfo.UpdateData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("b23693fa", new Object[]{this, updateInfo});
        }
        if (updateInfo == null || (map = updateInfo.updateList) == null || !map.containsKey("main")) {
            return null;
        }
        UpdateInfo.UpdateData updateData = updateInfo.updateList.get("main");
        updateData.subFrom = gjv.CACHE_SOURCE;
        return updateData;
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            akv.getInstance(sContext).clearCache();
        }
    }

    public UpdateInfo convertData(String str, String str2, String str3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("5e58b541", new Object[]{this, str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str3);
        if (!TextUtils.isEmpty(str2) && str2.equals(gjv.CACHE_SOURCE)) {
            return (UpdateInfo) JSON.parseObject(str3, UpdateInfo.class);
        }
        if (str.equals(gjv.ACCS_SOURCE) || str.equals(gjv.SAFE_MODE) || str.equals(gjv.SCAN)) {
            if (parseObject != null && parseObject.containsKey("data")) {
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject.containsKey("hasUpdate")) {
                    z = jSONObject.getBoolean("hasUpdate").booleanValue();
                }
                UpdateInfo convert2UpdateInfo = ljv.convert2UpdateInfo(jSONObject, str);
                if (z && g(convert2UpdateInfo)) {
                    return convert2UpdateInfo;
                }
            }
        } else if (parseObject != null && parseObject.containsKey("hasUpdate") && parseObject.getBoolean("hasUpdate").booleanValue()) {
            UpdateInfo convert2UpdateInfo2 = ljv.convert2UpdateInfo(parseObject, str);
            if (g(convert2UpdateInfo2)) {
                return convert2UpdateInfo2;
            }
        }
        return null;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9294792", new Object[]{this})).booleanValue();
        }
        if (this.e.hasMessages(0) || this.e.hasMessages(1) || this.e.hasMessages(2)) {
            return true;
        }
        return false;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600699d8", new Object[]{this, new Boolean(z)});
        } else if (((HashMap) this.c).get(gjv.MTOP_SOURCE) != null) {
            ((s7j) ((HashMap) this.c).get(gjv.MTOP_SOURCE)).setDegradeListener(new d()).setMtopDataListener(new c(z)).startUpdate(!z, false);
        }
    }

    public final synchronized void f(UpdateInfo.UpdateData updateData, PatchType patchType) {
        Map<String, UpdateInfo.UpdateData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d745e57a", new Object[]{this, updateData, patchType});
            return;
        }
        if (!TextUtils.isEmpty(updateData.subFrom) && updateData.subFrom.equals(gjv.CACHE_SOURCE)) {
            UpdateInfo data = akv.getInstance(sContext).getData();
            if (!(data == null || (map = data.updateList) == null)) {
                map.remove(patchType.getKey());
            }
            akv.getInstance(sContext).resetData(data);
        }
    }

    public final boolean g(UpdateInfo updateInfo) {
        Map<String, UpdateInfo.UpdateData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb41a39", new Object[]{this, updateInfo})).booleanValue();
        }
        if (updateInfo == null || (map = updateInfo.updateList) == null || map.size() == 0) {
            return false;
        }
        return true;
    }

    public agb getApkInstaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (agb) ipChange.ipc$dispatch("6390ce7e", new Object[]{this});
        }
        return (agb) c62.getInstance(agb.class);
    }

    public UpdateInfo.UpdateData getApkUpdateData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("38565600", new Object[]{this});
        }
        UpdateInfo.UpdateData c2 = c(akv.getInstance(sContext).getCacheData());
        if (c2 != null) {
            return c2;
        }
        UpdateInfo data = akv.getInstance(sContext).getData();
        if (this.f22713a.isLocalDataValid(data)) {
            return c(data);
        }
        return c2;
    }

    public Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return sContext;
    }

    public void getRecentData(boolean z) {
        Map<String, UpdateInfo.UpdateData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d9ab72", new Object[]{this, new Boolean(z)});
        } else if (!z || sUpdateAdapter.subscribed) {
            UpdateInfo data = akv.getInstance(sContext).getData();
            if (this.f22713a.isLocalDataValid(data)) {
                String str = null;
                if (!(data == null || (map = data.updateList) == null)) {
                    for (UpdateInfo.UpdateData updateData : map.values()) {
                        updateData.subFrom = gjv.CACHE_SOURCE;
                        str = updateData.from;
                    }
                }
                onUpdate(str, gjv.CACHE_SOURCE, !z, JSON.toJSONString(data), new String[0]);
                return;
            }
            clearCache();
            e(z);
        } else {
            e(true);
        }
    }

    public yjv getUpdateListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yjv) ipChange.ipc$dispatch("d5305b61", new Object[]{this, str});
        }
        return listenerMap.get(str);
    }

    public n6e getUpdater(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n6e) ipChange.ipc$dispatch("93bd17e", new Object[]{this, str});
        }
        return (n6e) ((HashMap) this.c).get(str);
    }

    public synchronized void init(Application application, String str, String str2, boolean z, bjv bjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fb0276", new Object[]{this, application, str, str2, new Boolean(z), bjvVar});
        } else if (!inited) {
            inited = true;
            sGroup = str;
            sContext = application;
            sUpdateAdapter = bjvVar;
            this.f22713a = new kkv();
            s7j s7jVar = new s7j(application, str2, str, z);
            s7jVar.registerDataListener(this);
            ((HashMap) this.c).put(gjv.MTOP_SOURCE, s7jVar);
            if (bjvVar.hasAccs()) {
                try {
                    o70 o70Var = new o70(sUpdateAdapter);
                    o70Var.registerDataListener(this);
                    ((HashMap) this.c).put(gjv.ACCS_SOURCE, o70Var);
                    sUpdateAdapter.registerPushApi(application, o70Var);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.f.d(" inited ");
        }
    }

    public void invalidUpdateInfo(String str) {
        UpdateInfo.UpdateData updateData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef01e7f", new Object[]{this, str});
            return;
        }
        UpdateInfo data = akv.getInstance(sContext).getData();
        if (data != null && (updateData = data.updateList.get(str)) != null) {
            updateData.valid = false;
            akv.getInstance(sContext).updateData(data);
        }
    }

    public void registerInterceptor(String str, uif uifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b82614", new Object[]{this, str, uifVar});
        } else if (!listenerMap.containsKey(str)) {
            ((HashMap) this.b).put(str, uifVar);
        } else if (listenerMap.get(str) instanceof tif) {
            ((tif) listenerMap.get(str)).registerInterceptor(uifVar);
        } else {
            gdh gdhVar = this.f;
            gdhVar.e(str + " update Type not support intercept");
        }
    }

    public void registerListener(String str, yjv yjvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99f9ac5", new Object[]{this, str, yjvVar});
            return;
        }
        listenerMap.put(str, yjvVar);
        uif uifVar = (uif) ((HashMap) this.b).remove(str);
        if (uifVar == null) {
            return;
        }
        if (yjvVar instanceof tif) {
            ((tif) yjvVar).registerInterceptor(uifVar);
            return;
        }
        gdh gdhVar = this.f;
        gdhVar.e(str + " update Type not support intercept");
    }

    public void setAddUpdateCallback(cf0 cf0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6d426b", new Object[]{this, cf0Var});
        } else {
            this.d = cf0Var;
        }
    }

    public void startUpdate(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5102cd2", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (inited) {
            if (!this.isUpdating) {
                this.isUpdating = true;
                e eVar = new e(z);
                if (z2) {
                    eVar.run();
                } else {
                    sUpdateAdapter.executeThread(eVar);
                }
            } else if (!z) {
                toast(nkv.getAppNameString(R.string.notice_updating));
            }
        }
    }

    public void toast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new g(str));
        }
    }

    public static void setLastPopTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591d1357", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = getInstance().getApplication().getSharedPreferences(gjv.LAST_POP_TIME_CONFIG, 0).edit();
        edit.putLong("last_pop_time", j);
        edit.apply();
        lastPopTime = j;
    }

    public final void b(UpdateInfo updateInfo, boolean z, cf0 cf0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72bd2cd", new Object[]{this, updateInfo, new Boolean(z), cf0Var, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (updateInfo.updateList.containsKey(gjv.DYNAMICUPDATE)) {
            arrayList.add(gjv.DYNAMICUPDATE);
            vet.instance().add(a(PatchType.DYNAMICUPDATE, updateInfo.updateList.get(gjv.DYNAMICUPDATE), str, z));
        }
        if (updateInfo.updateList.containsKey(gjv.CPPINLINEPATCH)) {
            arrayList.add(gjv.CPPINLINEPATCH);
            vet.instance().add(a(PatchType.CPPINLINEPATCH, updateInfo.updateList.get(gjv.CPPINLINEPATCH), str, z));
        }
        if (updateInfo.updateList.containsKey(gjv.HOTPATCH)) {
            arrayList.add(gjv.HOTPATCH);
            vet.instance().add(a(PatchType.INSTANTPATCH, updateInfo.updateList.get(gjv.HOTPATCH), str, z));
        }
        if (updateInfo.updateList.containsKey("main")) {
            arrayList.add("main");
            vet.instance().add(a(PatchType.MAIN, updateInfo.updateList.get("main"), str, z));
        }
        if (updateInfo.updateList.containsKey("preload")) {
            arrayList.add("preload");
            vet.instance().add(a(PatchType.PRELOAD, updateInfo.updateList.get("preload"), str, z));
        }
        if (cf0Var != null) {
            cf0Var.onAdded(arrayList);
        }
        if (!arrayList.contains("main") && !z && !str.equals(gjv.SCAN) && listenerMap.containsKey("main")) {
            listenerMap.get("main").onUpdate(false, null, "");
        }
    }

    @Override // tb.ijv
    public synchronized void onUpdate(String str, String str2, boolean z, String str3, String... strArr) {
        kkv kkvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c531bc24", new Object[]{this, str, str2, new Boolean(z), str3, strArr});
            return;
        }
        kkv kkvVar2 = this.f22713a;
        if (kkvVar2 == null) {
            this.f.e("no inited");
            return;
        }
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
            kkvVar = this.f22713a;
        }
        if (kkvVar2.isUpdating()) {
            gdh gdhVar = this.f;
            gdhVar.d("is updating ... discard data from:" + str);
            this.f22713a.finishUpdate();
            return;
        }
        gdh gdhVar2 = this.f;
        gdhVar2.d(" >>>>>> on " + str + " update info <<<<<<   " + str3);
        if (!TextUtils.isEmpty(str3) && inited) {
            UpdateInfo convertData = convertData(str, str2, str3);
            if (convertData == null) {
                this.f.e("updateInfo invalid!");
                if (!z && listenerMap.containsKey("main")) {
                    listenerMap.get("main").onUpdate(false, null, "");
                }
                this.f22713a.finishUpdate();
                return;
            }
            this.f22713a.startUpdate();
            if ((str.equals(gjv.ACCS_SOURCE) || str.equals(gjv.MTOP_SOURCE)) && TextUtils.isEmpty(str2)) {
                akv.getInstance(sContext).resetData(convertData);
            }
            if (d()) {
                this.f.e("handling msg......");
                if (str.equals(gjv.SCAN)) {
                    toast("已经有更新正在运行中");
                } else {
                    this.f22713a.finishUpdate();
                    return;
                }
            }
            Message obtainMessage = this.e.obtainMessage();
            if (str.equals(gjv.SCAN)) {
                obtainMessage.what = 2;
            } else if (str.equals(gjv.ACCS_SOURCE)) {
                obtainMessage.what = 0;
                sUpdateAdapter.commitSuccess("update_center_accs", "dispatch_message", "");
                if (strArr != null && strArr.length >= 1) {
                    sUpdateAdapter.commitSuccess("update_center_accs", "dispatch_message", strArr[0]);
                }
            } else if (str.equals(gjv.SAFE_MODE)) {
                obtainMessage.what = 4;
            } else if (str.equals(gjv.MTOP_SOURCE)) {
                sUpdateAdapter.commitSuccess("update_center_mtop", "mtop_dispatch_message", "");
                obtainMessage.what = 1;
            } else if (str.equals("NOTICE")) {
                obtainMessage.what = 5;
            }
            obtainMessage.obj = convertData;
            Bundle bundle = new Bundle();
            bundle.putBoolean("background", z);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
            kkvVar = this.f22713a;
            kkvVar.finishUpdate();
            return;
        }
        this.f22713a.finishUpdate();
    }
}
