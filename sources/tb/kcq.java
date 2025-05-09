package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.io.File;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jcq d;

    /* renamed from: a  reason: collision with root package name */
    public final wnc f22568a = (wnc) d62.b(wnc.class, "SplitFileSyncer");
    public String b = null;
    public final d3w c = new x87();
    public final jvc e = (jvc) d62.a(jvc.class, new Object[0]);

    static {
        t2o.a(676331633);
    }

    public kcq(jcq jcqVar) {
        this.d = jcqVar;
        jcqVar.k();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cde6d254", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            try {
                this.d.a();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return this.b;
    }

    public final File b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4cd48242", new Object[]{this, str});
        }
        try {
            File[] listFiles = this.d.I().listFiles();
            if (listFiles == null) {
                return null;
            }
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].getName().contains("-") && (split = listFiles[i].getName().split("-")) != null && split.length == 2 && split[1].equals(str)) {
                    return listFiles[i];
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a21592", new Object[]{this, str})).booleanValue();
        }
        wnc wncVar = this.f22568a;
        wncVar.c("SplitFileSyncer", "LastestAppVersion:" + BundleInfoManager.instance().getLastestAppVersion() + "-------" + str);
        if (BundleInfoManager.instance().getLastestAppVersion().contains(str)) {
            if (TextUtils.isEmpty(this.b)) {
                this.b = str;
                return true;
            } else if (this.b.equals(str)) {
                return true;
            } else {
                if (this.c.a(str, this.b) >= 0) {
                    this.b = str;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a75dae8", new Object[]{this, str})).booleanValue();
        }
        if (!str.contains(".") || str.split("\\.").length < 4) {
            return true;
        }
        return false;
    }
}
