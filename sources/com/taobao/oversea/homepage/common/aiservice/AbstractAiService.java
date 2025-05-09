package com.taobao.oversea.homepage.common.aiservice;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import tb.cxw;
import tb.pmd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class AbstractAiService implements pmd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tovs_gul_edge_user_state.alinn";

    @Override // tb.pmd
    public IAiService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAiService) ipChange.ipc$dispatch("aa9d34a", new Object[]{this});
        }
        AiServiceImpl aiServiceImpl = new AiServiceImpl();
        aiServiceImpl.setConfig(b());
        return aiServiceImpl;
    }

    public IAiService.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAiService.a) ipChange.ipc$dispatch("474b4dad", new Object[]{this});
        }
        return new IAiService.a() { // from class: com.taobao.oversea.homepage.common.aiservice.AbstractAiService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/common/aiservice/AbstractAiService$1");
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.a
            public IAiService.IApiInfo a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (IAiService.IApiInfo) ipChange2.ipc$dispatch("6a640a4a", new Object[]{this});
                }
                return new IAiService.IApiInfo() { // from class: com.taobao.oversea.homepage.common.aiservice.AbstractAiService.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.IApiInfo
                    public String getApi() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (String) ipChange3.ipc$dispatch("67b7a95", new Object[]{this});
                        }
                        return AbstractAiService.this.c();
                    }

                    @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.IApiInfo
                    public String getVersion() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (String) ipChange3.ipc$dispatch("2a8fef97", new Object[]{this});
                        }
                        return AbstractAiService.this.d();
                    }
                };
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IAiService.a
            public String b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("6df4dfa3", new Object[]{this});
                }
                return cxw.a(AbstractAiService.MODULE_NAME, "version");
            }
        };
    }

    public abstract String c();

    public abstract String d();
}
