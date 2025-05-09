package com.taobao.infoflow.protocol.subservice.biz;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAiService extends ISubService {
    public static final String SERVICE_NAME = "AiService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface IApiInfo extends Serializable {
        String getApi();

        String getVersion();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(488636534);
        }

        public abstract IApiInfo a();

        public abstract String b();
    }

    void clearAiCache(String str);

    List<BaseSectionModel<?>> getAiCacheCards(String str);

    void setConfig(a aVar);
}
