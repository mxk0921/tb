package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.CardModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class h59 extends as1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(918552827);
    }

    public static /* synthetic */ Object ipc$super(h59 h59Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/feeds/service/card/FeedCardService");
    }

    @Override // tb.as1
    public fwa<CardModel, View> r(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("b18d6423", new Object[]{this, cardModel});
        }
        ckf.g(cardModel, "cardModel");
        String type = cardModel.getType();
        if (type != null && type.hashCode() == -1942800026 && type.equals("dressingBannerComponent")) {
            return new vo1(x());
        }
        return null;
    }
}
