package com.alibaba.android.ultron.ext.event.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PopConfigModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Css css;
    public Options options;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Css implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String height = "0.6";
        public String maxHeight;
        public String minHeight;

        static {
            t2o.a(156237869);
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
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Options implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String needCloseButton = "true";

        static {
            t2o.a(156237870);
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
        t2o.a(156237868);
    }

    public Css getCss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Css) ipChange.ipc$dispatch("13b07ead", new Object[]{this});
        }
        return this.css;
    }

    public Options getOptions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Options) ipChange.ipc$dispatch("8f35d24d", new Object[]{this});
        }
        return this.options;
    }

    public void setCss(Css css) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da6efe1", new Object[]{this, css});
        } else {
            this.css = css;
        }
    }

    public void setOptions(Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f3b16b", new Object[]{this, options});
        } else {
            this.options = options;
        }
    }
}
