package com.taobao.flowcustoms.afc.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SmallHandleData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<BackAppInfos> backAppInfos;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BackAppInfos implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String appBackUrl;
        private String appIcon;
        private String appKey;
        private String appName;
        private String showMode;
        private String showStrategy;
        private String time;

        static {
            t2o.a(467664945);
        }

        public String getAppBackUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9483197c", new Object[]{this});
            }
            return this.appBackUrl;
        }

        public String getAppIcon() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("443d6b75", new Object[]{this});
            }
            return this.appIcon;
        }

        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            return this.appKey;
        }

        public String getAppName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
            }
            return this.appName;
        }

        public String getShowMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("161e3d03", new Object[]{this});
            }
            return this.showMode;
        }

        public String getShowStrategy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c31c66b3", new Object[]{this});
            }
            return this.showStrategy;
        }

        public String getTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("75382b96", new Object[]{this});
            }
            return this.time;
        }

        public void setAppBackUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72c99d7a", new Object[]{this, str});
            } else {
                this.appBackUrl = str;
            }
        }

        public void setAppIcon(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a738c09", new Object[]{this, str});
            } else {
                this.appIcon = str;
            }
        }

        public void setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
            } else {
                this.appKey = str;
            }
        }

        public void setAppName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
            } else {
                this.appName = str;
            }
        }

        public void setShowMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3886bdd3", new Object[]{this, str});
            } else {
                this.showMode = str;
            }
        }

        public void setShowStrategy(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310ee423", new Object[]{this, str});
            } else {
                this.showStrategy = str;
            }
        }

        public void setTime(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c64c87a0", new Object[]{this, str});
            } else {
                this.time = str;
            }
        }
    }

    static {
        t2o.a(467664944);
    }

    public List<BackAppInfos> getBackAppInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e574f0df", new Object[]{this});
        }
        return this.backAppInfos;
    }

    public void setBackAppInfos(List<BackAppInfos> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760c3e65", new Object[]{this, list});
        } else {
            this.backAppInfos = list;
        }
    }
}
