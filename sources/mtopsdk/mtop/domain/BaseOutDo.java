package mtopsdk.mtop.domain;

import java.util.Arrays;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class BaseOutDo implements IMTOPDataObject {
    private String api;
    private String[] ret;
    private String v;

    static {
        t2o.a(589299903);
        t2o.a(589299906);
    }

    public String getApi() {
        return this.api;
    }

    public abstract Object getData();

    public String[] getRet() {
        return this.ret;
    }

    public String getV() {
        return this.v;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setRet(String[] strArr) {
        this.ret = strArr;
    }

    public void setV(String str) {
        this.v = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("BaseOutDo [api=");
        sb.append(this.api);
        sb.append(", v=");
        sb.append(this.v);
        sb.append(", ret=");
        sb.append(Arrays.toString(this.ret));
        sb.append("]");
        return sb.toString();
    }
}
