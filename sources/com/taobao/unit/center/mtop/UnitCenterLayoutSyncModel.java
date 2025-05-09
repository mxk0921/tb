package com.taobao.unit.center.mtop;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UnitCenterLayoutSyncModel implements IMTOPDataObject {
    public List<Layout> layouts;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Layout {
        public String group;
        public List<UnitCenterLayoutInfoModel> layoutList;
        public boolean next;
        public long timestamp;

        static {
            t2o.a(552599785);
        }
    }

    static {
        t2o.a(552599784);
        t2o.a(589299906);
    }
}
