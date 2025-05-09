package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface brz {
    public static final a Companion = a.$$INSTANCE;
    public static final long NANO_INVALID_TEMPLATE_VERSION = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static final long NANO_INVALID_TEMPLATE_VERSION = -1;

        static {
            t2o.a(598737220);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737221);
        }

        public static TemplateItem a(brz brzVar, String str, String str2, long j, boolean z) {
            ConcurrentSkipListMap<Long, TemplateItem> concurrentSkipListMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateItem) ipChange.ipc$dispatch("e3ffe70d", new Object[]{brzVar, str, str2, new Long(j), new Boolean(z)});
            }
            ckf.g(brzVar, "this");
            ckf.g(str, "businessId");
            ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
            ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap = brzVar.c().get(str);
            if (concurrentHashMap == null || (concurrentSkipListMap = concurrentHashMap.get(str2)) == null) {
                return null;
            }
            if (!z) {
                return concurrentSkipListMap.get(Long.valueOf(j));
            }
            Collection<TemplateItem> values = concurrentSkipListMap.values();
            ckf.f(values, "it.values");
            for (TemplateItem templateItem : values) {
                if (templateItem != null) {
                    return templateItem;
                }
            }
            return null;
        }

        public static ConcurrentSkipListMap<Long, TemplateItem> b(brz brzVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConcurrentSkipListMap) ipChange.ipc$dispatch("66be392f", new Object[]{brzVar, str, str2});
            }
            ckf.g(brzVar, "this");
            ckf.g(str, "businessId");
            ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
            ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>> concurrentHashMap = brzVar.a().get(str);
            if (concurrentHashMap == null) {
                return null;
            }
            return concurrentHashMap.get(str2);
        }
    }

    ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> a();

    TemplateItem b(String str, String str2, long j);

    ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentSkipListMap<Long, TemplateItem>>> c();

    TemplateItem d(String str, String str2, long j, boolean z);

    ConcurrentSkipListMap<Long, TemplateItem> e(String str, String str2);
}
