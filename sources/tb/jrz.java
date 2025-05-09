package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jrz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jrz INSTANCE = new jrz();

    /* renamed from: a  reason: collision with root package name */
    public static brz f22179a;

    static {
        t2o.a(598737231);
    }

    public static /* synthetic */ TemplateItem c(jrz jrzVar, String str, String str2, long j, boolean z, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("1de7e456", new Object[]{jrzVar, str, str2, new Long(j), new Boolean(z), new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return jrzVar.b(str, str2, j, z2);
    }

    public static /* synthetic */ TemplateItem e(jrz jrzVar, String str, String str2, long j, boolean z, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("a99fbedf", new Object[]{jrzVar, str, str2, new Long(j), new Boolean(z), new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return jrzVar.d(str, str2, j, z2);
    }

    public static /* synthetic */ TemplateItem h(jrz jrzVar, String str, String str2, long j, boolean z, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("8f8a6d85", new Object[]{jrzVar, str, str2, new Long(j), new Boolean(z), new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return jrzVar.f(str, str2, j, z2);
    }

    public final TemplateItem a(String str, String str2, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("b9b2960f", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
        }
        if (z) {
            return c(this, str, str2, j, false, 8, null);
        }
        return null;
    }

    public final TemplateItem b(String str, String str2, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("eaf386f5", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        brz brzVar = f22179a;
        if (brzVar != null) {
            return brzVar.d(str, str2, j, z);
        }
        ckf.y(c4o.KEY_DATA_SOURCE);
        throw null;
    }

    public final TemplateItem d(String str, String str2, long j, boolean z) {
        Long l;
        NavigableSet navigableSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("f7e2350c", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        ConcurrentSkipListMap<Long, TemplateItem> g = g(str, str2);
        if ((g == null || g.isEmpty()) && z) {
            return a(str, str2, j, z);
        }
        TemplateItem templateItem = null;
        if (g == null || (navigableSet = (NavigableSet) g.keySet()) == null) {
            l = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : navigableSet) {
                Long l2 = (Long) obj;
                ckf.f(l2, AdvanceSetting.NETWORK_TYPE);
                if (l2.longValue() <= j) {
                    arrayList.add(obj);
                }
            }
            l = (Long) i04.K0(arrayList);
        }
        if (l != null) {
            templateItem = g.get(l);
        }
        return templateItem == null ? a(str, str2, j, z) : templateItem;
    }

    public final TemplateItem f(String str, String str2, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("68213026", new Object[]{this, str, str2, new Long(j), new Boolean(z)});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        brz brzVar = f22179a;
        if (brzVar != null) {
            TemplateItem b = brzVar.b(str, str2, j);
            if (b != null) {
                return b;
            }
            if (!z) {
                return null;
            }
            brz brzVar2 = f22179a;
            if (brzVar2 != null) {
                return brzVar2.d(str, str2, j, false);
            }
            ckf.y(c4o.KEY_DATA_SOURCE);
            throw null;
        }
        ckf.y(c4o.KEY_DATA_SOURCE);
        throw null;
    }

    public final ConcurrentSkipListMap<Long, TemplateItem> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentSkipListMap) ipChange.ipc$dispatch("7c96be59", new Object[]{this, str, str2});
        }
        ckf.g(str, "businessId");
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        brz brzVar = f22179a;
        if (brzVar != null) {
            return brzVar.e(str, str2);
        }
        ckf.y(c4o.KEY_DATA_SOURCE);
        throw null;
    }

    public final void i(brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12287e8c", new Object[]{this, brzVar});
            return;
        }
        ckf.g(brzVar, c4o.KEY_DATA_SOURCE);
        f22179a = brzVar;
    }
}
