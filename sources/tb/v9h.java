package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v9h implements r1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f29869a = new File("/data/local/tmp", ".dag_top_level_switcher").exists();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements FilenameFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(v9h v9hVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6696dd14", new Object[]{this, file, str})).booleanValue();
            }
            return str.startsWith(".");
        }
    }

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
        } else {
            Log.e("LocalSwitchesImpl", "unimplemented for local switches", new UnsupportedOperationException());
        }
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
        }
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        if (!f29869a) {
            return null;
        }
        File file = new File("/data/local/tmp", ".age");
        File file2 = new File(file, "." + str);
        File file3 = new File(file, "." + str + ".off");
        File file4 = new File(file, ".all");
        File file5 = new File(file, ".all.off");
        if (file4.exists() || file2.exists()) {
            return Boolean.TRUE;
        }
        if (file5.exists() || file3.exists()) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        File file = new File("/data/local/tmp", ".age");
        if (!file.isDirectory() || !file.exists()) {
            return tij.EMPTY;
        }
        String[] list = file.list(new a(this));
        ifj b = t2w.b(g(), -1L, -1L, -1L, -1L);
        for (String str : list) {
            b.b(t2w.e(str.substring(1), Boolean.TRUE.toString(), g()));
        }
        return b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "Local";
    }
}
