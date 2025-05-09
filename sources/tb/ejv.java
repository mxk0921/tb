package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.datasource.mtop.UpdateRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ejv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public String mFrom;
    public String mGroup;
    public boolean mIsOutApk;
    public String mTtid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f18628a;
        public String b;
        public String c;
        public boolean d;
        public String e;

        static {
            t2o.a(950009901);
        }

        public b(Context context) {
            this.f18628a = context;
        }

        public static b newBuilder(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dece24ef", new Object[]{context});
            }
            return new b(context);
        }

        public ejv build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ejv) ipChange.ipc$dispatch("67e0b0f7", new Object[]{this});
            }
            return new ejv(this.f18628a, this.b, this.c, this.d, this.e);
        }

        public b setFrom(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f9529538", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b setGroup(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a0be907", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b setOutApk(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("407c87b8", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b setTtid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f14b927", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(950009899);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c87f00f", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(kjv.sUpdateAdapter.getConfig(gjv.UPDATE_CONFIG_GROUP, gjv.NEW_PATCH_UPDATE, "false"));
    }

    public ejv(Context context, String str, String str2, boolean z, String str3) {
        this.mContext = context;
        this.mTtid = str;
        this.mGroup = str2;
        this.mIsOutApk = z;
        this.mFrom = str3;
    }

    public JSONObject queryUpdateInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78c5b9ae", new Object[]{this, new Boolean(z)});
        }
        UpdateRequest updateRequest = new UpdateRequest(this.mIsOutApk);
        if (!TextUtils.isEmpty(this.mFrom) && !this.mFrom.equals(gjv.MTOP_SOURCE)) {
            updateRequest.betaSource = this.mFrom;
        }
        updateRequest.brand = Build.MANUFACTURER;
        updateRequest.model = Build.MODEL;
        updateRequest.identifier = this.mGroup;
        updateRequest.appVersion = nkv.getVersionName();
        updateRequest.apiLevel = Build.VERSION.SDK_INT;
        updateRequest.patchVersion = akv.getInstance(this.mContext).getCurrentPatchVersion();
        updateRequest.userUpdate = !z;
        if (b()) {
            updateRequest.protocolVersion = "1.0";
        }
        if (a()) {
            updateRequest.requireContent = true;
        }
        updateRequest.cpuArch = lw4.getCpuArch();
        updateRequest.apkArch = lw4.getInstalledApkCpuArchValue(kjv.sContext);
        r48.h().i(this.mContext);
        Set<String> c = r48.h().c();
        if (c == null) {
            c = new HashSet<>();
        }
        updateRequest.deployVersions = c;
        updateRequest.isYunos = c();
        ArrayList arrayList = new ArrayList();
        arrayList.add("main");
        arrayList.add(gjv.DYNAMICUPDATE);
        arrayList.add(gjv.HOTPATCH);
        arrayList.add(gjv.CPPINLINEPATCH);
        arrayList.add("preload");
        updateRequest.updateTypes = arrayList;
        updateRequest.lastPopTime = nkv.getLastPopTime();
        return kjv.sUpdateAdapter.invokePullApi(updateRequest, this.mContext, this.mTtid, this.mIsOutApk);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f09074f", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = kjv.sContext.getSharedPreferences("dynamic_features_config", 0);
        return sharedPreferences.getBoolean("new_featureupdate_opened_" + nkv.getVersionName(), true);
    }

    public final boolean c() {
        String str;
        String str2 = null;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            str = (String) method.invoke(null, "ro.yunos.version");
            try {
                str2 = (String) method.invoke(null, "java.vm.name");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = null;
        }
        return (str2 != null && str2.toLowerCase().contains("lemur")) || (str != null && str.trim().length() > 0);
    }
}
