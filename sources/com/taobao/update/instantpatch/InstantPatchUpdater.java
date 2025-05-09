package com.taobao.update.instantpatch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import com.android.alibaba.ip.server.Restarter;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import tb.cbi;
import tb.gjv;
import tb.kjv;
import tb.nkv;
import tb.rtl;
import tb.stl;
import tb.t2o;
import tb.utl;
import tb.vjv;
import tb.vtl;
import tb.wcf;
import tb.xcf;
import tb.yjv;
import tb.zcf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class InstantPatchUpdater extends vjv implements yjv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EFFECTIVE_VERSION = "instantpatch_effective_version";
    public static final String PATCH_FROM = "patch_from";

    /* renamed from: a  reason: collision with root package name */
    public Context f14089a;
    public String b;
    public volatile boolean c;
    public PublishType d;
    public String e;
    public boolean f;
    public yjv.a g;
    public SharedPreferences h;
    public boolean i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum PublishType {
        BETA,
        RELEASE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PublishType publishType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/instantpatch/InstantPatchUpdater$PublishType");
        }

        public static PublishType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishType) ipChange.ipc$dispatch("2b4d1e9a", new Object[]{str});
            }
            return (PublishType) Enum.valueOf(PublishType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$update$instantpatch$InstantPatchUpdater$PublishType;

        static {
            int[] iArr = new int[PublishType.values().length];
            $SwitchMap$com$taobao$update$instantpatch$InstantPatchUpdater$PublishType = iArr;
            try {
                iArr[PublishType.BETA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$update$instantpatch$InstantPatchUpdater$PublishType[PublishType.RELEASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final InstantPatchUpdater f14090a = new InstantPatchUpdater(null);

        static {
            t2o.a(952107014);
        }

        public static /* synthetic */ InstantPatchUpdater access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstantPatchUpdater) ipChange.ipc$dispatch("a51e15a1", new Object[0]);
            }
            return f14090a;
        }
    }

    static {
        t2o.a(952107011);
        t2o.a(950009883);
    }

    public /* synthetic */ InstantPatchUpdater(xcf xcfVar) {
        this();
    }

    public static InstantPatchUpdater instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatchUpdater) ipChange.ipc$dispatch("1b1a465c", new Object[0]);
        }
        return b.access$000();
    }

    public static /* synthetic */ Object ipc$super(InstantPatchUpdater instantPatchUpdater, String str, Object... objArr) {
        if (str.hashCode() == -2083440012) {
            super.onBackground();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/instantpatch/InstantPatchUpdater");
    }

    public static boolean isNumeric(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{str})).booleanValue();
        }
        try {
            new BigDecimal(str).toString();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26833df3", new Object[]{this});
            return;
        }
        for (Activity activity : Restarter.getActivities(getContext(), false)) {
            activity.finish();
        }
    }

    public final void b(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3318a52b", new Object[]{this, str});
        } else if (str != null) {
            try {
                if (new File(str).exists() && new File(str).isDirectory() && (listFiles = new File(str).listFiles()) != null) {
                    for (File file : listFiles) {
                        if (file.getName().endsWith(".ipatch") && !file.getName().startsWith(nkv.getVersionName())) {
                            file.delete();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public PatchInfo createPatchInfo(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("8fc006cb", new Object[]{this, instantUpdateInfo});
        }
        PatchInfo patchInfo = new PatchInfo();
        patchInfo.setPatchVersion(Integer.valueOf(instantUpdateInfo.patchVersion).intValue());
        patchInfo.setBaseVersion(instantUpdateInfo.baseVersion);
        patchInfo.setPriority(Integer.valueOf(instantUpdateInfo.priority).intValue());
        return patchInfo;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bcd1f82", new Object[]{this});
        }
        return this.h.getString(PATCH_FROM, "");
    }

    public final boolean e(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f888aaca", new Object[]{this, instantUpdateInfo})).booleanValue();
        }
        return InstantPatcher.create(this.f14089a).hasPatched(createPatchInfo(instantUpdateInfo));
    }

    public final boolean f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        try {
            if ((getContext().getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            this.j = z;
        } catch (Exception unused) {
            this.j = true;
        }
        return this.j;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a70d485c", new Object[]{this, str})).booleanValue();
        }
        if (f() && !gjv.SCAN.equals(str)) {
            return false;
        }
        if (gjv.SCAN.equals(str) || !d().equals(gjv.SCAN)) {
            return true;
        }
        return false;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f14089a;
    }

    public final boolean h(InstantUpdateInfo instantUpdateInfo) {
        PublishType publishType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad1a09fc", new Object[]{this, instantUpdateInfo})).booleanValue();
        }
        if (instantUpdateInfo.beta) {
            publishType = PublishType.BETA;
        } else {
            publishType = PublishType.RELEASE;
        }
        this.d = publishType;
        this.e = instantUpdateInfo.patchVersion;
        String string = this.h.getString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "");
        String string2 = this.h.getString("instantpatch_effective_version", "");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return true;
        }
        int i = a.$SwitchMap$com$taobao$update$instantpatch$InstantPatchUpdater$PublishType[this.d.ordinal()];
        if (i != 1) {
            if (i == 2 && !string.equals(this.d.name()) && string.equals(PublishType.BETA) && Integer.valueOf(this.e).intValue() <= Integer.valueOf(string2).intValue()) {
                return false;
            }
            return true;
        } else if (Integer.valueOf(this.e).intValue() > Integer.valueOf(string2).intValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0ed8bd", new Object[]{this, str});
        } else {
            this.h.edit().putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, this.d.name()).putString("instantpatch_effective_version", this.e).putString(PATCH_FROM, str).commit();
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new xcf(this, str));
        }
    }

    @Override // tb.vjv
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        super.onBackground();
        if (this.i) {
            a();
            nkv.killChildProcesses(getContext());
            System.exit(0);
        }
    }

    @Override // tb.vjv
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        } else if (this.i) {
            a();
            nkv.killChildProcesses(getContext());
            System.exit(0);
        }
    }

    @Override // tb.yjv
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        InstantUpdateInfo create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        if (!this.mInit) {
            init(kjv.getInstance().getApplication());
        }
        if (g(str)) {
            if (!this.c) {
                this.c = true;
                try {
                    try {
                        create = InstantUpdateInfo.create(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (TextUtils.isEmpty(create.patchUrl) && !create.rollback) {
                        return;
                    }
                    if (create.rollback) {
                        rollback(create);
                        j(create.channelProcNeedRestart);
                    } else if (e(create)) {
                        if (str.equals(gjv.SCAN)) {
                            k("instantpatch from scan has patched, please clear data and retry!");
                        }
                    } else if (h(create)) {
                        c(create, str);
                    }
                } finally {
                    this.c = false;
                }
            } else if (str.equals(gjv.SCAN)) {
                k("instantpatch updating ......");
            }
        }
    }

    @Override // tb.yjv
    public void patchProcessListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d04f53", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public void rollback(InstantUpdateInfo instantUpdateInfo) {
        try {
            Log.e("InstantPatchUpdater", "rollback patch");
            InstantPatcher create = InstantPatcher.create(this.f14089a);
            Method declaredMethod = InstantPatcher.class.getDeclaredMethod("clearPatchInfo", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(create, new Object[0]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        this.h.edit().putString("instantpatch_effective_version", "").putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "").commit();
        j(instantUpdateInfo.channelProcNeedRestart);
    }

    public void setDisabledPatchClazzes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386abd4d", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            List asList = Arrays.asList(str.split(","));
            if (isNumeric((String) asList.get(0))) {
                InstantPatcher.create(this.f14089a).setDisabledClazzes((String) asList.get(0), Arrays.asList(Arrays.copyOfRange(asList.toArray(new String[0]), 1, asList.size())));
            } else {
                Log.e("InstantPatchUpdater", "DisabledPatchClazzes must has patchVersion!");
            }
        }
    }

    public void setStartFromBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17767c75", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public InstantPatchUpdater() {
        this.i = false;
    }

    @Override // tb.vjv
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.mInit) {
            this.f14089a = context;
            System.setProperty("update_patch", "inited");
            this.b = nkv.getVersionName();
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            this.h = defaultSharedPreferences;
            if (!this.b.equals(defaultSharedPreferences.getString("instantpatch_mainversion", ""))) {
                this.h.edit().putString("instantpatch_mainversion", this.b).putString("instantpatch_effective_version", "").putString(InstantPatchChangeInfo.INSTANT_PATCH_EFFECTIVE_TYPE, "").apply();
                try {
                    InstantPatcher.create(context).purge();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.mInit = true;
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498f4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.f14089a.getPackageName());
        intent.setAction("com.alibaba.android.instantpatch_action");
        intent.putExtra("instantpatch_channelProcNeedRestart", z);
        intent.putExtra("triggered_from_app_after_instantpatch", true);
        intent.putExtra("triggered_from_app_background", this.f);
        this.f14089a.sendBroadcast(intent);
    }

    public final void c(InstantUpdateInfo instantUpdateInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6671a75", new Object[]{this, instantUpdateInfo, str});
            return;
        }
        if (str.equals(gjv.SCAN)) {
            k("start to do instantpatch!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        vtl.stat(true, "revupdate", 0L, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        zcf zcfVar = new zcf();
        zcfVar.context = this.f14089a;
        String patchPath = zcfVar.getPatchPath();
        zcfVar.workDir = patchPath;
        b(patchPath);
        if (!TextUtils.isEmpty(instantUpdateInfo.contentBase64)) {
            zcfVar.path = new File(zcfVar.getPatchPath(), instantUpdateInfo.name).getAbsolutePath();
            new stl(zcfVar).decode(instantUpdateInfo.contentBase64);
            if (!zcfVar.success || !new File(zcfVar.path).exists() || !cbi.isMd5Same(instantUpdateInfo.md5, zcfVar.path)) {
                Log.e("InstantPatchUpdater", "patch decode failed!");
                vtl.stat(false, vtl.ARG_PATCHDECODE, System.currentTimeMillis() - currentTimeMillis, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            } else {
                Log.e("InstantPatchUpdater", "patch decode success!");
                vtl.stat(true, vtl.ARG_PATCHDECODE, System.currentTimeMillis() - currentTimeMillis, 0, "", Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            }
        }
        if (!zcfVar.success || TextUtils.isEmpty(zcfVar.path) || !new File(zcfVar.path).exists() || !cbi.isMd5Same(instantUpdateInfo.md5, zcfVar.path)) {
            long currentTimeMillis2 = System.currentTimeMillis();
            new rtl(zcfVar).download(instantUpdateInfo);
            if (!zcfVar.success || TextUtils.isEmpty(zcfVar.path)) {
                if (str.equals(gjv.SCAN)) {
                    k("instantpatch download failed!");
                }
                vtl.stat(false, "download", 0L, zcfVar.errorCode, zcfVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
                yjv.a aVar = this.g;
                if (aVar != null) {
                    aVar.patchFailed(zcfVar.errorMsg);
                    return;
                }
                return;
            }
            System.setProperty("update_patch", "downloaded patch:" + instantUpdateInfo);
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            if (str.equals(gjv.SCAN)) {
                k("instantpatch download success!");
            }
            vtl.stat(true, "download", currentTimeMillis3, zcfVar.errorCode, zcfVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        }
        long currentTimeMillis4 = System.currentTimeMillis();
        new utl(zcfVar).install(instantUpdateInfo);
        long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis4;
        System.setProperty("update_patch", "installed patch:" + instantUpdateInfo);
        if (zcfVar.success) {
            j(instantUpdateInfo.channelProcNeedRestart);
            vtl.stat(true, "install", currentTimeMillis5, zcfVar.errorCode, zcfVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
            i(str);
            yjv.a aVar2 = this.g;
            if (aVar2 != null) {
                aVar2.patchSuccess();
            }
            if (str.equals(gjv.SCAN)) {
                k("instantpatch do patch success!");
                if (InstantPatcher.hasResources && wcf.waitForConfirmAction("Instantpatch当前有资源patch,重启生效?")) {
                    Context context = this.f14089a;
                    Restarter.restartApp(context, Restarter.getActivities(context, false));
                }
            }
            if (InstantPatcher.hasResources) {
                this.i = true;
                return;
            }
            return;
        }
        vtl.stat(false, "install", 0L, zcfVar.errorCode, zcfVar.errorMsg, Long.valueOf(instantUpdateInfo.patchVersion).longValue());
        yjv.a aVar3 = this.g;
        if (aVar3 != null) {
            aVar3.patchFailed(zcfVar.errorMsg);
        }
        if (str.equals(gjv.SCAN)) {
            k("instantpatch do patch failed!");
        }
    }
}
