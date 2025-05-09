package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.favorite.business.FavoriteRequest;
import com.taobao.taolive.adapterimpl.favorite.business.FavoriteResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r29 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CANCEL_FAVORITE = 2;
    public static final int TYPE_IS_FAVORITE = 3;
    public static final int TYPE_SET_FAVORITE = 1;

    static {
        t2o.a(779092288);
    }

    public r29(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(r29 r29Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/favorite/business/FavoriteBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c521982f", new Object[]{this, str});
            return;
        }
        FavoriteRequest favoriteRequest = new FavoriteRequest();
        favoriteRequest.anchorId = str;
        C(1, favoriteRequest, FavoriteResponse.class);
    }
}
