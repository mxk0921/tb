package com.alibaba.android.icart.core.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartOpenPopupWindowEventModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Css css;
    public boolean isFilterPopLayer;
    public boolean needRefreshForNoFilter;
    public Options options;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Css implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String maxHeight;
        public String minHeight;
        public String radius;
        public String themeUrl;
        public String height = "0.6";
        public String windowColor = "#FFFFFF";

        static {
            t2o.a(479199322);
        }

        public String getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6ba1efc", new Object[]{this});
            }
            return this.height;
        }

        public String getMaxHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d985d124", new Object[]{this});
            }
            return this.maxHeight;
        }

        public String getMinHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bbdaab76", new Object[]{this});
            }
            return this.minHeight;
        }

        public String getRadius() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cd902471", new Object[]{this});
            }
            return this.radius;
        }

        public String getThemeUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("78836c1d", new Object[]{this});
            }
            return this.themeUrl;
        }

        public String getWindowColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c4eab2fc", new Object[]{this});
            }
            return this.windowColor;
        }

        public void setHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
            } else {
                this.height = str;
            }
        }

        public void setMaxHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9720f3a", new Object[]{this, str});
            } else {
                this.maxHeight = str;
            }
        }

        public void setMinHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41b87f28", new Object[]{this, str});
            } else {
                this.minHeight = str;
            }
        }

        public void setRadius(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("841e5725", new Object[]{this, str});
            } else {
                this.radius = str;
            }
        }

        public void setThemeUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c771f9", new Object[]{this, str});
            } else {
                this.themeUrl = str;
            }
        }

        public void setWindowColor(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f022db62", new Object[]{this, str});
            } else {
                this.windowColor = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Options implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String needCloseButton = "true";

        static {
            t2o.a(479199323);
        }

        public String getNeedCloseButton() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2abeaf1b", new Object[]{this});
            }
            return this.needCloseButton;
        }

        public void setNeedCloseButton(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e73f0923", new Object[]{this, str});
            } else {
                this.needCloseButton = str;
            }
        }
    }

    static {
        t2o.a(479199321);
    }

    public Css getCss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Css) ipChange.ipc$dispatch("26f21dc7", new Object[]{this});
        }
        return this.css;
    }

    public Options getOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Options) ipChange.ipc$dispatch("4578d927", new Object[]{this});
        }
        return this.options;
    }

    public boolean isFilterPopLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5943006d", new Object[]{this})).booleanValue();
        }
        return this.isFilterPopLayer;
    }

    public boolean isNeedRefreshForNoFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba0c18b2", new Object[]{this})).booleanValue();
        }
        return this.needRefreshForNoFilter;
    }

    public void setCss(Css css) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4641203b", new Object[]{this, css});
        } else {
            this.css = css;
        }
    }

    public void setIsFilterPopLayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadc4449", new Object[]{this, new Boolean(z)});
        } else {
            this.isFilterPopLayer = z;
        }
    }

    public void setNeedRefreshForNoFilter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209a3dae", new Object[]{this, new Boolean(z)});
        } else {
            this.needRefreshForNoFilter = z;
        }
    }

    public void setOptions(Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0ab805", new Object[]{this, options});
        } else {
            this.options = options;
        }
    }
}
