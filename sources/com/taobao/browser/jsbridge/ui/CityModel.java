package com.taobao.browser.jsbridge.ui;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CityModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private String CityId;
    private String CityName;
    private String Latitude;
    private String Longitude;
    private String NameSort;

    static {
        t2o.a(619708570);
    }

    public String getCityId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e15c399d", new Object[]{this});
        }
        return this.CityId;
    }

    public String getCityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec11d66d", new Object[]{this});
        }
        return this.CityName;
    }

    public String getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this});
        }
        return this.Latitude;
    }

    public String getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this});
        }
        return this.Longitude;
    }

    public String getNameSort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("279bb81a", new Object[]{this});
        }
        return this.NameSort;
    }

    public void setCityId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d4e779", new Object[]{this, str});
        } else {
            this.CityId = str;
        }
    }

    public void setCityName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210651a9", new Object[]{this, str});
        } else {
            this.CityName = str;
        }
    }

    public void setLatitude(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5827eff", new Object[]{this, str});
        } else {
            this.Latitude = str;
        }
    }

    public void setLongitude(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457c763e", new Object[]{this, str});
        } else {
            this.Longitude = str;
        }
    }

    public void setNameSort(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8a59c", new Object[]{this, str});
        } else {
            this.NameSort = str;
        }
    }
}
