package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mml {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LC_IMAGE_EDIT_PAGE = "lc_image_edit_enter_";
    public static final String LC_PUBLISH_PAGE = "lc_publish_enter_";
    public static final String LC_RECORD_PAGE = "lc_record_enter_";
    public static final String LC_VIDEO_EDIT_PAGE = "lc_video_edit_enter_";
    public static final String SCENE_EXPORT = "export.dat";
    public static final String SCENE_PREVIEW = "preview.dat";

    static {
        t2o.a(511705644);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e867c", new Object[]{str});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir != null && filesDir.exists()) {
            String str2 = filesDir.getAbsolutePath() + "/" + str + SCENE_PREVIEW;
            cg9.i(str2);
            cg9.i(filesDir.getAbsolutePath() + "/" + str + SCENE_EXPORT);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61983ab5", new Object[]{str, str2});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir != null && filesDir.exists()) {
            try {
                new File(filesDir.getAbsolutePath() + "/" + str + str2).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void c(String str, c5e c5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2952298", new Object[]{str, c5eVar});
            return;
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir != null && filesDir.exists()) {
            String str2 = filesDir.getAbsolutePath() + "/" + str + SCENE_PREVIEW;
            String str3 = filesDir.getAbsolutePath() + "/" + str + SCENE_EXPORT;
            boolean l = cg9.l(str2);
            boolean l2 = cg9.l(str3);
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str4 = "0";
            sb.append(l ? "preview" : str4);
            sb.append("_");
            if (l2) {
                str4 = pg1.ATOM_export;
            }
            sb.append(str4);
            hashMap.put("exit_info", sb.toString());
            c5eVar.a("invalid_exit", hashMap, true);
            odg.d("LCCreator", "statPageInvalidExitInfo: " + l + l2);
        }
    }
}
