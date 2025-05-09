package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.FilePathProviderImp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface w6z {
    public static final a Companion = a.$$INSTANCE;
    public static final String NANO_BASE_PATH = "nano";
    public static final String NANO_MAIN_FILE_NAME = "nano.dx";
    public static final String NANO_TMP_UNZIP_FILE_PATH = "nano_unzip_file";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String NANO_BASE_PATH = "nano";
        public static final String NANO_MAIN_FILE_NAME = "nano.dx";
        public static final String NANO_TMP_UNZIP_FILE_PATH = "nano_unzip_file";

        static {
            t2o.a(598737176);
        }

        public final w6z a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w6z) ipChange.ipc$dispatch("16351d42", new Object[]{this});
            }
            return FilePathProviderImp.Companion.a(eiz.INSTANCE.a());
        }
    }

    String a(String str, String str2);

    String b(String str, String str2);

    String c(String str, String str2, long j);

    String d(String str, String str2, long j);

    String e(String str);
}
