package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zcf extends hdt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String path;
    public String workDir;

    static {
        t2o.a(952107016);
    }

    public static /* synthetic */ Object ipc$super(zcf zcfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/instantpatch/InstantUpdateContext");
    }

    public String getPatchPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ae0582", new Object[]{this});
        }
        if (this.context == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.workDir)) {
            this.workDir = new File(this.context.getExternalCacheDir(), gjv.HOTPATCH).getAbsolutePath();
        }
        return this.workDir;
    }
}
