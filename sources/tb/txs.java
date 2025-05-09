package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentConfigBiz;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class txs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public KMPJsonObject f29023a;

    static {
        t2o.a(1010827309);
    }

    public final boolean a(TaoLiveKtCommentConfigBiz taoLiveKtCommentConfigBiz) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dffe6fce", new Object[]{this, taoLiveKtCommentConfigBiz})).booleanValue();
        }
        if (taoLiveKtCommentConfigBiz == null || (str = taoLiveKtCommentConfigBiz.getValue()) == null) {
            str = "";
        }
        KMPJsonObject kMPJsonObject = this.f29023a;
        if (kMPJsonObject != null) {
            return ckf.b(kMPJsonObject.getBoolean(str), Boolean.TRUE);
        }
        return false;
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbc2612", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            if (!(map instanceof Object)) {
                map = null;
            }
            this.f29023a = new KMPJsonObject(map);
        }
    }
}
