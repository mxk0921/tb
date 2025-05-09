package com.taobao.client.isv.config.manager.person;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mdh;
import tb.pa7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DelegatePersionConfigProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQ_TYPE_QUERY_LBS_SWITCH = 1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class UpdateConfigRequestListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DelegatePersionConfigProcessor this$0;

        static {
            t2o.a(789577776);
            t2o.a(589299719);
        }

        private UpdateConfigRequestListener(DelegatePersionConfigProcessor delegatePersionConfigProcessor) {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                DelegatePersionConfigProcessor.a(null, 3);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                DelegatePersionConfigProcessor.a(null, 3);
            }
        }

        public /* synthetic */ UpdateConfigRequestListener(DelegatePersionConfigProcessor delegatePersionConfigProcessor, pa7 pa7Var) {
            this(delegatePersionConfigProcessor);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (baseOutDo != null) {
                try {
                    Map map = (Map) baseOutDo.getData();
                    if (map != null) {
                        mdh.d("lbs_config_log_DelegatePersionConfigProcessor", "[onSuccess] get persion config data=" + map.toString());
                        DelegatePersionConfigProcessor.b(null);
                        DelegatePersionConfigProcessor.c(null, map);
                        DelegatePersionConfigProcessor.d(null, map);
                        DelegatePersionConfigProcessor.e(null, map);
                    } else {
                        mdh.a("lbs_config_log_DelegatePersionConfigProcessor", "[onSuccess] get persion config data null");
                    }
                    DelegatePersionConfigProcessor.a(null, 3);
                } catch (Exception unused) {
                }
            } else {
                DelegatePersionConfigProcessor.a(null, 3);
            }
        }
    }

    static {
        t2o.a(789577774);
        t2o.a(789577768);
    }

    public static /* synthetic */ int a(DelegatePersionConfigProcessor delegatePersionConfigProcessor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("223bbfcf", new Object[]{delegatePersionConfigProcessor, new Integer(i)})).intValue();
        }
        throw null;
    }

    public static /* synthetic */ void b(DelegatePersionConfigProcessor delegatePersionConfigProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b461c6", new Object[]{delegatePersionConfigProcessor});
            return;
        }
        throw null;
    }

    public static /* synthetic */ void c(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7330411e", new Object[]{delegatePersionConfigProcessor, map});
            return;
        }
        throw null;
    }

    public static /* synthetic */ void d(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5f8d3d", new Object[]{delegatePersionConfigProcessor, map});
            return;
        }
        throw null;
    }

    public static /* synthetic */ void e(DelegatePersionConfigProcessor delegatePersionConfigProcessor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ed95c", new Object[]{delegatePersionConfigProcessor, map});
            return;
        }
        throw null;
    }
}
