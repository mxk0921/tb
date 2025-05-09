package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ucb extends ncb {
    void A0(AURAInputData<AURARenderIO> aURAInputData);

    void J(AURARenderComponent aURARenderComponent);

    void T(List<AURARenderComponent> list);

    void W(View view);

    void e0(AURARenderComponent aURARenderComponent);

    void z(View view, RecyclerView.State state);
}
