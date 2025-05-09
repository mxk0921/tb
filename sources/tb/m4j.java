package tb;

import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class m4j {
    public MtopListener listener;
    public MtopBusiness mtopBusiness;

    static {
        t2o.a(589299763);
    }

    public m4j(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        this.mtopBusiness = mtopBusiness;
        this.listener = mtopListener;
    }
}
