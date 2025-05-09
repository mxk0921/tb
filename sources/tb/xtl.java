package tb;

import android.text.TextUtils;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.split.diff.DynamicFeatureDiffInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xtl extends icq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnc f31598a = (wnc) d62.b(wnc.class, "PatchSplitFileInfoProvider");

    static {
        t2o.a(681574414);
    }

    public static /* synthetic */ Object ipc$super(xtl xtlVar, String str, Object... objArr) {
        if (str.hashCode() == 1806819989) {
            return super.a((String) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/split/diff/PatchSplitFileInfoProviderImpl");
    }

    @Override // tb.icq, tb.qcq
    public SplitFileInfo a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitFileInfo) ipChange.ipc$dispatch("6bb1e295", new Object[]{this, str});
        }
        PatchSplitFileInfo patchSplitFileInfo = null;
        try {
            str2 = bcq.a().e().l().a();
        } catch (Exception e) {
            e.printStackTrace();
            str2 = null;
        }
        this.f31598a.c(str + " diff patch baseVersion:" + str2, new Object[0]);
        if (TextUtils.isEmpty(str2)) {
            return super.a(str);
        }
        if (u48.c().e(str, str2) && b(str)) {
            this.f31598a.c(str + " has diff patch:", new Object[0]);
            DynamicFeatureDiffInfo b = s48.d().b(str, str2);
            if (b != null) {
                patchSplitFileInfo = new PatchSplitFileInfo();
                patchSplitFileInfo.isPatch = true;
                patchSplitFileInfo.sameFile = b.sameFile;
                patchSplitFileInfo.baseAppVersion = b.baseAppVersion;
                patchSplitFileInfo.newMd5 = b.newMd5;
                patchSplitFileInfo.baseMd5 = b.baseMd5;
                patchSplitFileInfo.url = b.url;
                patchSplitFileInfo.appVersion = b.appVersion;
                patchSplitFileInfo.version = b.version;
                patchSplitFileInfo.md5 = b.md5;
                patchSplitFileInfo.fileSize = b.size;
                patchSplitFileInfo.splitName = b.featureName;
            }
            if (u48.c().d(patchSplitFileInfo)) {
                this.f31598a.c(str + " has diff patch baseFile", new Object[0]);
                return patchSplitFileInfo;
            }
        }
        this.f31598a.c(str + " has no diff patch full download", new Object[0]);
        return super.a(str);
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b0cda77", new Object[]{this, str})).booleanValue();
        }
        try {
            return n1r.q(bcq.a().e().j(), str, true);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
