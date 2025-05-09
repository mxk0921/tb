package com.taobao.android.livehome.plugin.atype.flexalocal.dinamic.model;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DinamicTemplateDataObject implements IMTOPDataObject {
    public String cardType;
    public String name;
    public String span;
    public String templateHeight;
    public String url4Android;
    public String version4Android;

    static {
        t2o.a(310378531);
        t2o.a(589299906);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DinamicTemplateDataObject dinamicTemplateDataObject = (DinamicTemplateDataObject) obj;
        String str = this.name;
        if (str == null ? dinamicTemplateDataObject.name != null : !str.equals(dinamicTemplateDataObject.name)) {
            return false;
        }
        String str2 = this.version4Android;
        String str3 = dinamicTemplateDataObject.version4Android;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }
}
