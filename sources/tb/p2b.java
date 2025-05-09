package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.ImageViewLayoutFeature;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.ImageViewMonitorFeature;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p2b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HOME_BIZ_ID = 51;
    public static final String HOME_IMAGE_PRIORITY_MODULE_NAME = "homepage-ads";
    public static final String HOME_IMAGE_SCENE_NAME = "home-page-ads";
    public static final String HOME_IMAGE_SCENE_NAME_INFREQUENTLY = "home-page-icon";
    public static final ImageStrategyConfig IMAGE_STRATEGY_CONFIG = ImageStrategyConfig.v("home", 51).a();
    public static final int HOME_FIRST_SCREEN_BIZ_ID = 5151;
    public static final ImageStrategyConfig IMAGE_FIRST_SCREEN_STRATEGY_CONFIG = ImageStrategyConfig.v("home", HOME_FIRST_SCREEN_BIZ_ID).a();

    /* renamed from: a  reason: collision with root package name */
    public static String f25827a = null;
    public static ImageStrategyConfig b = null;
    public static final ConcurrentHashMap<String, ImageStrategyConfig> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();
    public static boolean e = false;
    public static volatile boolean f = false;

    static {
        t2o.a(486539445);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        f25827a = null;
        b = null;
        c.clear();
        d.clear();
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d285bff", new Object[0]);
        }
        return null;
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50eccc78", new Object[]{str, str2});
        }
        if (!e) {
            return str2;
        }
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, String> concurrentHashMap = d;
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str);
            }
        }
        String str3 = f25827a;
        if (str3 != null) {
            str2 = str3;
        }
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str2, "homepage-ads")) {
            ConcurrentHashMap<String, String> concurrentHashMap2 = d;
            if (concurrentHashMap2.size() < 200) {
                concurrentHashMap2.put(str, str2);
            }
        }
        return str2;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ab72718", new Object[0]);
        }
        if (!e) {
            return "";
        }
        ImageStrategyConfig imageStrategyConfig = b;
        if (imageStrategyConfig == IMAGE_STRATEGY_CONFIG || imageStrategyConfig == IMAGE_FIRST_SCREEN_STRATEGY_CONFIG) {
            return "home-page-ads";
        }
        return "";
    }

    public static String e(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5decc8f", new Object[]{dXTemplateItem});
        }
        if (!e) {
            return "";
        }
        ImageStrategyConfig imageStrategyConfig = b;
        if (imageStrategyConfig != IMAGE_STRATEGY_CONFIG && imageStrategyConfig != IMAGE_FIRST_SCREEN_STRATEGY_CONFIG) {
            return "";
        }
        if (h(dXTemplateItem)) {
            return "home-page-icon";
        }
        return "home-page-ads";
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feb66cea", new Object[]{str, str2});
        }
        if (!e) {
            return str2;
        }
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, ImageStrategyConfig> concurrentHashMap = c;
            if (concurrentHashMap.containsKey(str)) {
                return String.valueOf(concurrentHashMap.get(str).a());
            }
        }
        ImageStrategyConfig imageStrategyConfig = b;
        if (!TextUtils.isEmpty(str) && imageStrategyConfig != null && imageStrategyConfig == IMAGE_STRATEGY_CONFIG) {
            ConcurrentHashMap<String, ImageStrategyConfig> concurrentHashMap2 = c;
            if (concurrentHashMap2.size() < 200) {
                concurrentHashMap2.put(str, imageStrategyConfig);
            }
        }
        if (imageStrategyConfig != null) {
            return String.valueOf(imageStrategyConfig.a());
        }
        return str2;
    }

    public static ImageStrategyConfig g(String str, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("1dc4f12", new Object[]{str, imageStrategyConfig});
        }
        if (!e) {
            return imageStrategyConfig;
        }
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap<String, ImageStrategyConfig> concurrentHashMap = c;
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str);
            }
        }
        ImageStrategyConfig imageStrategyConfig2 = b;
        if (imageStrategyConfig2 != null) {
            imageStrategyConfig = imageStrategyConfig2;
        }
        if (!TextUtils.isEmpty(str) && imageStrategyConfig != null && imageStrategyConfig == IMAGE_STRATEGY_CONFIG && d.size() < 200) {
            c.put(str, imageStrategyConfig);
        }
        return imageStrategyConfig;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b982b3de", new Object[0])).booleanValue();
        }
        return f;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a639de09", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f673396e", new Object[0])).booleanValue();
        }
        if (b == IMAGE_STRATEGY_CONFIG) {
            return true;
        }
        return false;
    }

    public static void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{new Boolean(z)});
        } else {
            e = z;
        }
    }

    public static void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50ff72", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59821f1", new Object[]{str});
        } else {
            f25827a = str;
        }
    }

    public static void p(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216dbed4", new Object[]{imageStrategyConfig});
        } else {
            b = imageStrategyConfig;
        }
    }

    public static void q(TUrlImageView tUrlImageView, String str, String str2, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6940f18b", new Object[]{tUrlImageView, str, str2, imageStrategyConfig});
        } else if (e) {
            tUrlImageView.setPriorityModuleName(c(str, str2));
            tUrlImageView.setStrategyConfig(g(str, imageStrategyConfig));
            tUrlImageView.setSceneName(d());
        }
    }

    public static void r(TUrlImageView tUrlImageView, String str, String str2, ImageStrategyConfig imageStrategyConfig, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2cfff4", new Object[]{tUrlImageView, str, str2, imageStrategyConfig, dXTemplateItem});
        } else if (e) {
            tUrlImageView.setPriorityModuleName(c(str, str2));
            tUrlImageView.setStrategyConfig(g(str, imageStrategyConfig));
            tUrlImageView.setSceneName(e(dXTemplateItem));
        } else if (TextUtils.equals(imageStrategyConfig.h(), "dressup")) {
            tUrlImageView.setStrategyConfig(imageStrategyConfig);
        }
    }

    public static synchronized void s() {
        synchronized (p2b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97c1bcc2", new Object[0]);
            }
        }
    }

    public static synchronized void t() {
        synchronized (p2b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5c6f062", new Object[0]);
            }
        }
    }

    public static void u(DXWidgetNode dXWidgetNode, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc051bb", new Object[]{dXWidgetNode, tUrlImageView});
        } else if (bve.n()) {
            ImageViewLayoutFeature imageViewLayoutFeature = (ImageViewLayoutFeature) tUrlImageView.findFeature(ImageViewLayoutFeature.class);
            if (l()) {
                if (imageViewLayoutFeature == null) {
                    imageViewLayoutFeature = new ImageViewLayoutFeature();
                    tUrlImageView.addFeature(imageViewLayoutFeature);
                }
                imageViewLayoutFeature.setImageNode(dXWidgetNode);
            } else if (imageViewLayoutFeature != null) {
                tUrlImageView.removeFeature(ImageViewLayoutFeature.class);
            }
        }
    }

    public static void v(DXWidgetNode dXWidgetNode, TUrlImageView tUrlImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d81823", new Object[]{dXWidgetNode, tUrlImageView, str});
        } else if (f4b.b("homepageMTSTrace", true)) {
            ImageViewMonitorFeature imageViewMonitorFeature = (ImageViewMonitorFeature) tUrlImageView.findFeature(ImageViewMonitorFeature.class);
            if (ImageViewMonitorFeature.isEnabled(dXWidgetNode, str)) {
                if (imageViewMonitorFeature == null) {
                    imageViewMonitorFeature = new ImageViewMonitorFeature();
                    tUrlImageView.addFeature(imageViewMonitorFeature);
                }
                imageViewMonitorFeature.setImageNode(dXWidgetNode);
            } else if (imageViewMonitorFeature != null) {
                tUrlImageView.removeFeature(ImageViewMonitorFeature.class);
            }
        }
    }

    public static boolean h(DXTemplateItem dXTemplateItem) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d8c00af", new Object[]{dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null || (str = dXTemplateItem.f7343a) == null) {
            return false;
        }
        return str.contains("m_h_v5_slider_icons_tag_bindingx_d3") || dXTemplateItem.f7343a.contains("m_h_v7_searchbar");
    }
}
