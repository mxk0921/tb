package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.j5h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TemplateObject implements IMTOPDataObject {
    public String name;
    public int span;
    public String url4Android;
    public long version4Android;

    static {
        t2o.a(310378777);
        t2o.a(589299906);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return j5h.a(this.url4Android, ((TemplateObject) obj).url4Android);
    }

    public int hashCode() {
        String str = this.url4Android;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
