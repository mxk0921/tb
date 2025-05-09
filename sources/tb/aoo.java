package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.rebuild.PageRebuildModelMap;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class aoo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_REBUILD_PAGE = "SRP_Rebuild_Page";
    public static final String EXTRA_REBUILD_TAB = "SRP_Rebuild_Tab";
    public static final String EXTRA_REBUILD_TOKEN = "SRP_Rebuild_Record_Token";
    public static final aoo INSTANCE = new aoo();

    /* renamed from: a  reason: collision with root package name */
    public static final PageRebuildModelMap<String, bol> f15904a = new PageRebuildModelMap<>(0, 1, null);

    static {
        t2o.a(815792559);
    }

    @JvmStatic
    public static final bol a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bol) ipChange.ipc$dispatch("fa652b6d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (bol) kqu.d(f15904a).remove(str);
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aeaf3775", new Object[0]);
        }
        return "MainSRP_" + System.currentTimeMillis();
    }

    @JvmStatic
    public static final bol c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bol) ipChange.ipc$dispatch("c6c7bdeb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (bol) kqu.d(f15904a).remove(str);
    }

    @JvmStatic
    public static final boolean d(String str, bol bolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1e9aa6b", new Object[]{str, bolVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (bolVar == null) {
            kqu.d(f15904a).remove(str);
        } else {
            PageRebuildModelMap<String, bol> pageRebuildModelMap = f15904a;
            ckf.d(str);
            pageRebuildModelMap.put(str, bolVar);
        }
        return true;
    }
}
