package com.taobao.taobao.scancode.history.object;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Product implements IMTOPDataObject, Serializable {
    private String pic;
    private String price;
    private String title;
    private int type = 1;

    static {
        t2o.a(760217755);
        t2o.a(589299906);
    }

    public String getPic() {
        return this.pic;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
