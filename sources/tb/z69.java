package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentRequest;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z69 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356002);
    }

    public z69(b0d b0dVar) {
        super(b0dVar, true);
    }

    public static /* synthetic */ Object ipc$super(z69 z69Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/interact/comment/FetchCommentBusiness");
    }

    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af20b00e", new Object[]{this, str, str2, str3});
            return;
        }
        FetchCommentRequest fetchCommentRequest = new FetchCommentRequest();
        fetchCommentRequest.topic = str;
        fetchCommentRequest.anchorSideKey = str2;
        fetchCommentRequest.tab = 2L;
        fetchCommentRequest.paginationContext = str3;
        C(1, fetchCommentRequest, FetchCommentResponse.class);
    }
}
