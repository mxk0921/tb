package tb;

import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class maq implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gdh f23893a = fih.getLog(maq.class, (gdh) null);

    static {
        t2o.a(951058457);
        t2o.a(947912754);
    }

    public void execute(q49 q49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        q49Var.stage = t49.ARG_ENV_CHECK;
        File file = new File(q49Var.context.getFilesDir(), "featureupdate");
        if (!file.exists()) {
            file.mkdirs();
        }
        long j = q49Var.featureUpdateData.size + 62914560;
        if (file.getUsableSpace() <= j) {
            Log.e("SpaceCheckProcessor", "low disk");
            this.f23893a.w("low disk");
            File[] externalFilesDirs = kjv.sContext.getExternalFilesDirs("featureupdate");
            file = null;
            if (externalFilesDirs != null && externalFilesDirs.length > 0) {
                for (File file2 : externalFilesDirs) {
                    if (EnvironmentCompat.getStorageState(file2).equals("mounted") && file2.getUsableSpace() > j) {
                        file = file2;
                    }
                }
                if (file != null && !file.exists()) {
                    file.mkdirs();
                }
                if (file == null || !file.exists() || !file.canWrite()) {
                    q49Var.success = false;
                    q49Var.errorCode = -21;
                    q49Var.errorMsg = Constants.ErrorDesc.spaceError;
                    return;
                }
            }
        }
        this.f23893a.w("enough space");
        q49Var.downloadDir = file.getAbsolutePath();
    }
}
