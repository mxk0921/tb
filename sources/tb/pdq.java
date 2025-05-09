package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;
import java.io.File;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pdq implements srd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";
    public static final String FEATURES_SHOULD_REMOTE_DOWNLOAD = "features_should_remote_download";

    /* renamed from: a  reason: collision with root package name */
    public final wnc f26030a = (wnc) d62.b(wnc.class, "SplitSourceInternal");
    public final b4d b = (b4d) d62.a(b4d.class, new Object[0]);

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78241a1e", new Object[]{this, str});
        }
        return "lib" + str + jcq.SO_EXTENSION;
    }

    public final boolean b(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7acf014", new Object[]{this, file, str})).booleanValue();
        }
        String str2 = ((qcq) d62.a(qcq.class, new Object[0])).a(str).md5;
        if (!TextUtils.isEmpty(str2)) {
            return str2.equals(this.b.a(file.getAbsolutePath()));
        }
        return false;
    }

    public boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f2471a", new Object[]{this, context, str})).booleanValue();
        }
        File file = new File(context.getApplicationInfo().nativeLibraryDir, a(str));
        if (!file.exists() || !b(file, str)) {
            wnc wncVar = this.f26030a;
            wncVar.c("local splitFile not exited:" + str, new Object[0]);
            return false;
        }
        wnc wncVar2 = this.f26030a;
        wncVar2.c("local splitFile exited:" + str, new Object[0]);
        return true;
    }

    public final boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f754a33a", new Object[]{this, context, str})).booleanValue();
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
            return sharedPreferences.getStringSet("features_should_remote_download_" + TaobaoApplication.getAppVersion(), new HashSet()).contains(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55537ec", new Object[]{this, context, str})).booleanValue();
        }
        if (EVO.isSwitchOpened(context, j(str)) || e(context, str)) {
            return true;
        }
        return false;
    }

    public boolean h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc59a080", new Object[]{this, context, str})).booleanValue();
        }
        return f(context, str);
    }

    public final String i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25e9743a", new Object[]{this, context, str});
        }
        return "installFromLocal_" + str + "_" + TaobaoApplication.getAppVersion();
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb639570", new Object[]{this, str});
        }
        return "ab_switch_" + str;
    }

    public void g(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4a056", new Object[]{this, context, str, new Integer(i)});
        } else {
            context.getSharedPreferences("split_install_source", 0).edit().putInt(i(context, str), i).commit();
        }
    }

    public int c(Context context, String str) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cf87cc", new Object[]{this, context, str})).intValue();
        }
        if (d(context, str) && !h(context, str)) {
            i = 0;
        }
        return context.getSharedPreferences("split_install_source", 0).getInt(i(context, str), i);
    }
}
