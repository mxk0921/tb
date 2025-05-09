package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ybr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean METHOD_TRACE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f31969a;
    public static List<String> b;

    static {
        File file = new File(ey1.SWITCH_FILE_DIR);
        int intValue = pb9.a().b(new File(file, ".fake.txt")).intValue();
        int i = 1;
        if (intValue <= 0) {
            boolean isSpeedEdition = TBSpeed.isSpeedEdition(u9a.a(), "virtual_thread");
            if (TBSpeed.isSpeedEdition(u9a.a(), "virtual_thread_fake")) {
                intValue = 2;
            } else if (isSpeedEdition) {
                intValue = 1;
            }
        }
        if (intValue > 0) {
            i = intValue;
        }
        int i2 = grr.ORANGE_FAKE;
        if (i2 > 0) {
            in8.f21445a = i2;
        } else if (i > 0) {
            in8.f21445a = i;
        }
        METHOD_TRACE = grr.METHOD_TRACE;
        f31969a = grr.TOTAL_GLOBAL_HANDLER_COUNT;
        b = kb9.a().b(b(new File(file, "ex_thread_pool.txt"), new File(u9a.a().getFilesDir(), "ex_thread_pool.txt")));
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77dcdc34", new Object[]{map});
            return;
        }
        h1r h1rVar = new h1r(map);
        int a2 = h1rVar.a("ORANGE_FAKE", -1);
        if (a2 > 0) {
            in8.f21445a = a2;
        }
        h1rVar.a("KEEP_ALIVE_TIME", 3000);
        b = kb9.a().b(new File(u9a.a().getFilesDir(), "ex_thread_pool.txt"));
    }

    public static File b(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f3856775", new Object[]{file, file2});
        }
        if (file.exists()) {
            return file;
        }
        return file2;
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8df3dce3", new Object[]{str})).intValue();
        }
        if (in8.f21445a == 2) {
            if (str.contains("com.alibaba.android.ultron.vfw.dataloader.DataRequestTask") || str.contains("UCCoreThread")) {
                return 1;
            }
            for (String str2 : b) {
                if (Pattern.matches(str2, str)) {
                    return 1;
                }
            }
        }
        return in8.f21445a;
    }
}
