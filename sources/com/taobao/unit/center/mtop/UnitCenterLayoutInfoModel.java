package com.taobao.unit.center.mtop;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UnitCenterLayoutInfoModel implements IMTOPDataObject {
    public List<String> appkey;
    public String downgrade;
    public String env;
    public String group;
    public String layoutData;
    public String layoutId;
    public int layoutType;
    public String nameSpace;
    public long updateTime;
    public int version;

    static {
        t2o.a(552599783);
        t2o.a(589299906);
    }

    public String toString() {
        return "UnitCenterLayoutInfoModel{group='" + this.group + "', layoutData='" + this.layoutData + "', layoutId='" + this.layoutId + "', layoutType=" + this.layoutType + ", nameSpace='" + this.nameSpace + "', version=" + this.version + ", updateTime=" + this.updateTime + ", downgrade='" + this.downgrade + "', appkey=" + this.appkey + '}';
    }
}
