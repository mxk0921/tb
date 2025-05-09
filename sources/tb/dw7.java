package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_DRAFT_PATH = "/AsyncPublishDraft";

    static {
        t2o.a(944766985);
    }

    public static File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d66e1df7", new Object[]{str});
        }
        File externalFilesDir = Globals.getApplication().getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static File b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e2dce77a", new Object[]{str});
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        File file = new File(filesDir.getAbsolutePath() + str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }
}
