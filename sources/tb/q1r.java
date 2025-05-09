package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f26451a = new File(ey1.SWITCH_FILE_DIR, ".dag_top_level_switcher").exists();

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            String b = b(str, "");
            if (TextUtils.isEmpty(b)) {
                return j;
            }
            return Long.parseLong(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        File file = new File(ey1.SWITCH_FILE_DIR, str);
        if (!file.exists()) {
            return str2;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            return readLine;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52433a52", new Object[]{str})).booleanValue();
        }
        if (!f26451a) {
            return false;
        }
        return new File(ey1.SWITCH_FILE_DIR, str).exists();
    }
}
