package com.taobao.flowcustoms.afc.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AfcConfigBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> disableOptimizeLinks;
    private RouterRulesBean routerRules;
    private List<String> transferToAfcLinks;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class RouterRulesBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<String> asyncRequestBlackList;
        private List<String> asyncRequestPathWhiteList;
        private List<String> bcFlsrc;
        private List<String> routerWhiteList;

        static {
            t2o.a(467664940);
        }

        public List<String> getAsyncRequestBlackList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("aad8ca0c", new Object[]{this});
            }
            return this.asyncRequestBlackList;
        }

        public List<String> getAsyncRequestPathWhiteList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("729310e7", new Object[]{this});
            }
            return this.asyncRequestPathWhiteList;
        }

        public List<String> getBcFlsrc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("a4513c19", new Object[]{this});
            }
            return this.bcFlsrc;
        }

        public List<String> getRouterWhiteList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("89fee4f8", new Object[]{this});
            }
            return this.routerWhiteList;
        }

        public void setAsyncRequestBlackList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0f7e40", new Object[]{this, list});
            } else {
                this.asyncRequestBlackList = list;
            }
        }

        public void setAsyncRequestPathWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7008b8c5", new Object[]{this, list});
            } else {
                this.asyncRequestPathWhiteList = list;
            }
        }

        public void setBcFlsrc(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a868d3", new Object[]{this, list});
            } else {
                this.bcFlsrc = list;
            }
        }

        public void setRouterWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("207727d4", new Object[]{this, list});
            } else {
                this.routerWhiteList = list;
            }
        }
    }

    static {
        t2o.a(467664939);
    }

    public List<String> getDisableOptimizeLinks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("691c1556", new Object[]{this});
        }
        return this.disableOptimizeLinks;
    }

    public RouterRulesBean getRouterRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RouterRulesBean) ipChange.ipc$dispatch("2b516e21", new Object[]{this});
        }
        return this.routerRules;
    }

    public List<String> getTransferToAfcLinks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c77b429", new Object[]{this});
        }
        return this.transferToAfcLinks;
    }

    public void setDisableOptimizeLinks(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5431dcce", new Object[]{this, list});
        } else {
            this.disableOptimizeLinks = list;
        }
    }

    public void setRouterRules(RouterRulesBean routerRulesBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954732dd", new Object[]{this, routerRulesBean});
        } else {
            this.routerRules = routerRulesBean;
        }
    }

    public void setTransferToAfcLinks(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64baeb5b", new Object[]{this, list});
        } else {
            this.transferToAfcLinks = list;
        }
    }
}
