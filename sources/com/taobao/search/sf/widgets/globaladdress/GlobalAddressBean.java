package com.taobao.search.sf.widgets.globaladdress;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import java.util.HashMap;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GlobalAddressBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeexBean dropBean;
    private String guideActivity;
    private int guideCount;
    private long guideInterval;
    private String locationText;
    private final HashMap<String, String> utLogMap = new HashMap<>();
    private String mode = "changeLocation";

    static {
        t2o.a(815793572);
    }

    public static /* synthetic */ Object ipc$super(GlobalAddressBean globalAddressBean, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/globaladdress/GlobalAddressBean");
    }

    public final WeexBean getDropBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBean) ipChange.ipc$dispatch("813d3a6d", new Object[]{this});
        }
        return this.dropBean;
    }

    public final String getGuideActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0cd27a4", new Object[]{this});
        }
        return this.guideActivity;
    }

    public final int getGuideCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ad40363", new Object[]{this})).intValue();
        }
        return this.guideCount;
    }

    public final long getGuideInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bab0fb26", new Object[]{this})).longValue();
        }
        return this.guideInterval;
    }

    public final String getLocationText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ed3f101", new Object[]{this});
        }
        return this.locationText;
    }

    public final String getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        return this.mode;
    }

    public final HashMap<String, String> getUtLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("35009ed7", new Object[]{this});
        }
        return this.utLogMap;
    }

    public final void setDropBean(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47830bdb", new Object[]{this, weexBean});
        } else {
            this.dropBean = weexBean;
        }
    }

    public final void setGuideActivity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d77aeba", new Object[]{this, str});
        } else {
            this.guideActivity = str;
        }
    }

    public final void setGuideCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46837707", new Object[]{this, new Integer(i)});
        } else {
            this.guideCount = i;
        }
    }

    public final void setGuideInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329a63de", new Object[]{this, new Long(j)});
        } else {
            this.guideInterval = j;
        }
    }

    public final void setLocationText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c48a395", new Object[]{this, str});
        } else {
            this.locationText = str;
        }
    }

    public final void setMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66f09f6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.mode = str;
    }
}
