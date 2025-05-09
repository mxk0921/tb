package com.taobao.android.order.map.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderMapCoordinateModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "latitude")
    private double latitude;
    @JSONField(name = "longitude")
    private double longitude;

    static {
        t2o.a(297795650);
    }

    public double getLatitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b6fad57", new Object[]{this})).doubleValue();
        }
        return this.latitude;
    }

    public double getLongitude() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61adaee", new Object[]{this})).doubleValue();
        }
        return this.longitude;
    }

    public void setLatitude(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855cc669", new Object[]{this, new Double(d)});
        } else {
            this.latitude = d;
        }
    }

    public void setLongitude(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5374d4a", new Object[]{this, new Double(d)});
        } else {
            this.longitude = d;
        }
    }
}
