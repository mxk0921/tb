package com.taobao.tao.combo.dataobject;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComboData implements IMTOPDataObject, Serializable {
    private static final long serialVersionUID = 1;
    public long buyCount;
    public ArrayList<ComboItemData> itemList;
    public long mealId;
    public ArrayList<Long> mealIdList;
    public String mealName;
    public long mealPrice;
    public long savedMoney;
    public String type;

    static {
        t2o.a(764412073);
        t2o.a(589299906);
    }
}
