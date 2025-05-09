package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.mediabrowser.MediaBrowserComponent;
import com.taobao.android.dressup.common.model.CardModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class we7 extends as1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(918552820);
    }

    public static /* synthetic */ Object ipc$super(we7 we7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/detail/service/card/DetailCardService");
    }

    @Override // tb.as1
    public fwa<CardModel, View> r(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("b18d6423", new Object[]{this, cardModel});
        }
        ckf.g(cardModel, "cardModel");
        String type = cardModel.getType();
        if (type != null && type.hashCode() == -1613049437 && type.equals("dressingContentBannerComponent")) {
            return new MediaBrowserComponent(x());
        }
        return null;
    }
}
