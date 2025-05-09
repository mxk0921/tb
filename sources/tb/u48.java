package tb;

import com.alibaba.android.split.PatchSplitFileInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u02 f29130a;
    public final jvc b;
    public final wnc c;
    public final b4d d;
    public final xzb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final u48 f29131a = new u48();

        static {
            t2o.a(681574412);
        }

        public static /* synthetic */ u48 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u48) ipChange.ipc$dispatch("e60fb0de", new Object[0]);
            }
            return f29131a;
        }
    }

    static {
        t2o.a(681574410);
    }

    public static u48 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u48) ipChange.ipc$dispatch("eaa541e3", new Object[0]);
        }
        return b.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc96d8c", new Object[]{this, str});
        } else {
            ((np7) this.e).a(str);
        }
    }

    public File b(PatchSplitFileInfo patchSplitFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5d8c901a", new Object[]{this, patchSplitFileInfo});
        }
        File a2 = ((v02) this.f29130a).a(patchSplitFileInfo.splitName, patchSplitFileInfo.baseAppVersion);
        if (a2 == null || !a2.exists() || !this.d.a(a2.getAbsolutePath()).equals(patchSplitFileInfo.baseMd5)) {
            return null;
        }
        return a2;
    }

    public boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad14bee8", new Object[]{this, str, str2})).booleanValue();
        }
        if (s48.d().b(str, str2) == null || ((np7) this.e).b(str, str2)) {
            return false;
        }
        return true;
    }

    public u48() {
        this.f29130a = null;
        this.b = (jvc) d62.a(jvc.class, new Object[0]);
        this.c = (wnc) d62.b(wnc.class, "DynamicFeatureDiffPolicy");
        this.d = (b4d) d62.a(b4d.class, new Object[0]);
        this.e = np7.c();
        try {
            this.f29130a = new v02(bcq.a().e().j());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean d(PatchSplitFileInfo patchSplitFileInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e99e813", new Object[]{this, patchSplitFileInfo})).booleanValue();
        }
        File a2 = ((v02) this.f29130a).a(patchSplitFileInfo.splitName, patchSplitFileInfo.baseAppVersion);
        if (a2 == null || !a2.exists()) {
            str = "";
        } else {
            str = this.d.a(a2.getAbsolutePath());
            if (str.equals(patchSplitFileInfo.baseMd5)) {
                return true;
            }
        }
        if (a2 != null && a2.exists()) {
            try {
                wnc wncVar = this.c;
                String absolutePath = a2.getAbsolutePath();
                String str2 = patchSplitFileInfo.baseMd5;
                wncVar.c("baseFile " + absolutePath + " exist with md5:" + str + " mismatch with: " + str2, new Object[0]);
                this.b.b(patchSplitFileInfo.splitName, true, "patch_downgrade", 0L, 0, "", (long) bcq.a().e().m());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
