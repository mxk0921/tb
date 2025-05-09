package tb;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.p0v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xuv implements h2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267968);
        t2o.a(503316608);
    }

    public static Object m(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b80a225b", new Object[]{obj});
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            o P = nVar.P();
            if (P == null) {
                return obj;
            }
            Object g0 = P.g0(R.id.layout_manager_engine_utobject_tag);
            if (g0 != null) {
                return g0;
            }
            Object W = P.W();
            if (W instanceof anl) {
                return ((anl) W).getUTObject();
            }
            return nVar.N();
        } else if (obj instanceof anl) {
            return ((anl) obj).getUTObject();
        } else {
            if (obj instanceof Fragment) {
                return ((Fragment) obj).getActivity();
            }
            return obj;
        }
    }

    @Override // tb.h2e
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            f(null, str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // tb.h2e
    public void b(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c63596f", new Object[]{this, str, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, strArr);
        }
    }

    @Override // tb.h2e
    public Map<String, String> c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97847fb0", new Object[]{this, obj});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getPageProperties(m(obj));
    }

    @Override // tb.h2e
    public void d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cac8b1", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(m(obj), str);
        }
    }

    @Override // tb.h2e
    public String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ed28e3d", new Object[]{this, obj});
        }
        p0v.a a2 = p0v.a(obj);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    @Override // tb.h2e
    public void f(Object obj, String str, int i, Object obj2, Object obj3, Object obj4, String... strArr) {
        String[] strArr2;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e422b8", new Object[]{this, obj, str, new Integer(i), obj2, obj3, obj4, strArr});
            return;
        }
        g2e l = l(obj);
        if (l != null) {
            Map<String, String> e = l.e();
            if (strArr != null) {
                i2 = strArr.length;
            } else {
                i2 = 0;
            }
            String[] strArr3 = new String[e.size() + i2];
            if (i2 > 0) {
                System.arraycopy(strArr, 0, strArr3, 0, i2);
            }
            for (Map.Entry<String, String> entry : e.entrySet()) {
                strArr3[i2 + i3] = entry.getKey() + "=" + entry.getValue();
                i3++;
            }
            strArr2 = strArr3;
        } else {
            strArr2 = strArr;
        }
        TBS.Ext.commitEvent(str, i, obj2, obj3, obj4, strArr2);
    }

    @Override // tb.h2e
    public void g(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e506a5", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(m(obj), JSON.toJSONString(map));
        }
    }

    @Override // tb.h2e
    public Map<String, String> getPageAllProperties(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea4a06bd", new Object[]{this, activity});
        }
        return UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(activity);
    }

    @Override // tb.h2e
    public void h(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4780c10", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(m(obj), str);
        }
    }

    @Override // tb.h2e
    public String[] i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("54b6327", new Object[]{this, obj});
        }
        if (!(m(obj) instanceof Activity)) {
            return new String[]{null, null};
        }
        Activity activity = (Activity) obj;
        return new String[]{UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity), UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(activity)};
    }

    @Override // tb.h2e
    public void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f30c0e", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
        }
    }

    @Override // tb.h2e
    public String k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1448a9a", new Object[]{this, obj});
        }
        p0v.a a2 = p0v.a(obj);
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    public final g2e l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("468abbe9", new Object[]{this, obj});
        }
        if (obj instanceof qau) {
            return (g2e) obj;
        }
        if (obj instanceof n) {
            return ((n) obj).P().i0();
        }
        if (obj instanceof o) {
            return ((o) obj).i0();
        }
        return qau.s();
    }

    @Override // tb.h2e
    public void pageDisAppear(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f29b97", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(m(obj));
        }
    }

    @Override // tb.h2e
    public void updateNextPageProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // tb.h2e
    public void updatePageName(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12fe50", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(m(obj), str);
        }
    }

    @Override // tb.h2e
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        Object m = m(obj);
        if (map == null) {
            map = new HashMap<>();
        }
        g2e l = l(obj);
        if (l != null) {
            map.putAll(l.e());
        }
        if (obj instanceof n) {
            TrackerModule.addDSLInfo(map, (n) obj);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(m, map);
    }

    @Override // tb.h2e
    public void updatePageUrl(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a674c04", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(m(obj), Uri.parse(str));
        }
    }
}
