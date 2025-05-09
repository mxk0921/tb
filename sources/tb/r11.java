package tb;

import android.content.Context;
import android.preference.PreferenceManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.apk.history.ApkUpdateHistory;
import com.taobao.update.framework.UpdateRuntime;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r11 extends vjv implements tif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yjv.a f27041a;
    public ekv b;
    public final List<uif> c = new ArrayList();
    public final gdh d = fih.getLog(r11.class, (gdh) null);

    static {
        t2o.a(953155591);
        t2o.a(950009864);
    }

    public r11() {
        kjv.getInstance().registerListener("main", this);
        c62.registerInstance(p11.getInstance());
    }

    public static /* synthetic */ Object ipc$super(r11 r11Var, String str, Object... objArr) {
        if (str.hashCode() == 1621086737) {
            super.init((Context) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/apk/ApkUpdater");
    }

    public final void a() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918449e5", new Object[]{this});
            return;
        }
        File file = new File(nkv.getStorePath(UpdateRuntime.getContext()) + "/apkupdate");
        if (file.exists() && file.listFiles() != null) {
            String versionName = nkv.getVersionName();
            for (File file2 : file.listFiles()) {
                if (nkv.greaterThen(versionName, file2.getName())) {
                    fs2.deleteDir(file2);
                }
            }
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c0cebab", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(kjv.sContext).getString(gjv.BACKGROUND_UPDATE_ENABLED, "true")).booleanValue();
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8576db1", new Object[]{this})).booleanValue();
        }
        return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(kjv.sContext).getString(gjv.UPDATE_ENABLED_INTERCEPROT, "true")).booleanValue();
    }

    public final void d() {
        String str;
        String str2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426d6b34", new Object[]{this});
            return;
        }
        ApkUpdateHistory.Data data = ApkUpdateHistory.getData();
        if (data != null) {
            boolean equals = nkv.getVersionName().equals(data.toVersion);
            if (equals) {
                try {
                    new File(data.ext).delete();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (!equals) {
                if (nkv.getVersionName().equals(data.fromVersion)) {
                    i = -71;
                } else {
                    i = -72;
                }
                str2 = String.valueOf(i);
                str = "fromVersion=" + data.fromVersion + ",toVersion=" + data.toVersion;
            } else {
                str2 = "";
                str = str2;
            }
            ekv ekvVar = this.b;
            if (ekvVar != null) {
                ekvVar.add("apefficiency", equals, "install", str2, str, data.fromVersion, data.toVersion, "");
                this.b.commit("apefficiency");
            }
            ApkUpdateHistory.reset();
        }
        a();
    }

    @Override // tb.vjv
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.mInit) {
            super.init(context);
            this.b = (ekv) c62.getInstance(ekv.class);
            try {
                d();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.mInit = true;
        }
    }

    @Override // tb.tif, tb.yjv
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
        } else {
            doUpdate(jSONObject, z, str);
        }
    }

    @Override // tb.tif, tb.yjv
    public void patchProcessListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d04f53", new Object[]{this, aVar});
        } else {
            this.f27041a = aVar;
        }
    }

    @Override // tb.tif
    public void registerInterceptor(uif uifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c130d90a", new Object[]{this, uifVar});
        } else {
            ((ArrayList) this.c).add(uifVar);
        }
    }

    @Override // tb.vjv
    public boolean doUpdate(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14471eed", new Object[]{this, jSONObject, new Boolean(z), str})).booleanValue();
        }
        if (!this.mInit) {
            init(kjv.getInstance().getApplication());
        }
        if (z && !b()) {
            return false;
        }
        if (jSONObject == null || !nkv.greaterThen(jSONObject.getString("version"), nkv.getVersionName())) {
            if (!z) {
                UpdateRuntime.toast(nkv.getAppNameString(R.string.notice_noupdate, UpdateRuntime.sAppName));
            }
            return false;
        }
        if (((ArrayList) this.c).size() > 0 && c() && z) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                if (((uif) it.next()).interrupt(jSONObject, z, str)) {
                    return false;
                }
            }
        }
        if (this.f27041a != null) {
            p11.getInstance().addPatchListener(this.f27041a);
        }
        p11.getInstance().installApk(jSONObject, z, false);
        return true;
    }
}
