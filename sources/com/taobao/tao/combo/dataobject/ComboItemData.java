package com.taobao.tao.combo.dataobject;

import java.io.Serializable;
import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComboItemData implements IMTOPDataObject, Serializable {
    private static final long serialVersionUID = 1;
    public boolean isFavor;
    public long itemId;
    public String itemName;
    public long itemPrice;
    public String mainPicUrl;
    public ArrayList<String> picUrlList;

    static {
        t2o.a(764412075);
        t2o.a(589299906);
    }
}
