package com.taobao.kmp.live.liveBizComponent.service.base;

import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J=\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "ctrName", "pageName", "", "args", "Ltb/xhv;", BehavorID.CLICK, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", MergeUtil.KEY_EXPOSED, "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtUtManager extends Serializable {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1003487335);
        }

        public static /* synthetic */ void a(ITaoLiveKtUtManager iTaoLiveKtUtManager, String str, String str2, Map map, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38f8285", new Object[]{iTaoLiveKtUtManager, str, str2, map, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = "Page_TaobaoLiveWatch";
                }
                iTaoLiveKtUtManager.exposed(str, str2, map);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposed");
            }
        }
    }

    void clicked(String str, String str2, Map<String, String> map);

    void exposed(String str, String str2, Map<String, String> map);
}
