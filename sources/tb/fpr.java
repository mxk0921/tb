package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import java.util.List;
import tb.aof;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fpr implements aof.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cpr f19455a;

    public fpr(cpr cprVar) {
        this.f19455a = cprVar;
    }

    @Override // tb.aof.b
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        } else {
            cpr.k(this.f19455a, qvs.o0());
        }
    }

    @Override // tb.aof.b
    public void onSuccess(Object obj) {
        List<ShareGoodsListMessage> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        if ((obj instanceof List) && (list = (List) obj) != null && list.size() > 0) {
            for (ShareGoodsListMessage shareGoodsListMessage : list) {
                cpr.l(this.f19455a, shareGoodsListMessage, false);
            }
        }
        cpr.k(this.f19455a, qvs.o0());
    }
}
