package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.IRenderResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e9x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_KEY_ARG1 = "agr1";
    public static final String ATTR_KEY_ATTR = "attr";
    public static final String ATTR_KEY_CLASS = "class";
    public static final String ATTR_KEY_DATA_POINT_INDEX = "data-point-index";
    public static final String ATTR_KEY_DATA_SPM = "data-spm";
    public static final String ATTR_KEY_DATA_TRACKER = "data-tracker";
    public static final String ATTR_KEY_ID = "id";
    public static final String ATTR_KEY_INDEX = "index";

    static {
        t2o.a(455082045);
    }

    public static String a(View view) {
        WXSDKInstance instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb5e9a", new Object[]{view});
        }
        WXComponent j = j(view);
        if (j == null || (instance = j.getInstance()) == null) {
            return null;
        }
        return instance.getBundleUrl();
    }

    public static String b(View view, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50cf59f8", new Object[]{view, str});
        }
        WXComponent j = j(view);
        while (true) {
            str2 = null;
            if (j == null) {
                break;
            }
            WXAttr d = d(j);
            if (d != null) {
                str2 = g(d, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                break;
            }
            j = j.getParent();
        }
        return str2;
    }

    public static WXAttr c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("3db279b", new Object[]{view});
        }
        WXComponent j = j(view);
        if (j != null) {
            return d(j);
        }
        return null;
    }

    public static WXAttr d(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAttr) ipChange.ipc$dispatch("53e3d199", new Object[]{wXComponent});
        }
        if (wXComponent == null) {
            return null;
        }
        return wXComponent.getAttrs();
    }

    public static String e(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e45a79", new Object[]{view, new Boolean(z)});
        }
        String i = i(view, ATTR_KEY_DATA_TRACKER);
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        if (!z) {
            return null;
        }
        String i2 = i(view, "id");
        if (!TextUtils.isEmpty(i2)) {
            return i2;
        }
        String i3 = i(view, "class");
        if (!TextUtils.isEmpty(i3)) {
            return i3;
        }
        return null;
    }

    public static View f(View view) {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e1d241e", new Object[]{view});
        }
        if (view == null || (parent = view.getParent()) == null || !(parent instanceof View)) {
            return null;
        }
        return (View) parent;
    }

    public static String g(WXAttr wXAttr, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e1a098", new Object[]{wXAttr, str});
        }
        if (!(wXAttr == null || (obj = wXAttr.get(str)) == null)) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Integer) {
                return String.valueOf(obj);
            }
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).toJSONString();
            }
        }
        return null;
    }

    public static String h(View view, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d81f8fd5", new Object[]{view, str, new Boolean(z)});
        }
        if (view == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!z) {
            return i(view, str);
        }
        for (WXComponent j = j(view); j != null; j = j.getParent()) {
            WXAttr d = d(j);
            String g = g(d, ATTR_KEY_DATA_SPM);
            String g2 = g(d, str);
            if (!TextUtils.isEmpty(g) || !TextUtils.isEmpty(g2)) {
                return g2;
            }
        }
        return null;
    }

    public static String i(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d5b3fd9", new Object[]{view, str});
        }
        WXAttr c = c(view);
        if (c != null) {
            return g(c, str);
        }
        return null;
    }

    public static WXComponent j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("4a3b1a85", new Object[]{view});
        }
        if (view == null || !(view instanceof IRenderResult)) {
            return null;
        }
        return ((IRenderResult) view).getComponent();
    }

    public static boolean k(String str, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e787dc2", new Object[]{str, view, new Boolean(z)})).booleanValue();
        }
        return !TextUtils.isEmpty(e(view, z));
    }
}
