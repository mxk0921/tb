package com.taobao.desktop.widget.template.dynamic;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WidgetDynamicData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String collect;
        private String title;

        static {
            t2o.a(437256311);
        }

        public String getCollect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c95f285", new Object[]{this});
            }
            return this.collect;
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
            }
            return this.title;
        }

        public void setCollect(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd2be6f9", new Object[]{this, str});
            } else {
                this.collect = str;
            }
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }
    }

    static {
        t2o.a(437256310);
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this});
        }
        return this.deepLink;
    }

    public ExtData getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtData) ipChange.ipc$dispatch("389d0127", new Object[]{this});
        }
        return this.ext;
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.imageUrl;
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue();
        }
        return this.nextRefreshTime;
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2b2d29", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.imageUrl = str;
        }
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }
}
