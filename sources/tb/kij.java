package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kij extends jw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789336);
    }

    public static boolean b(View view) {
        AURARenderComponent aURARenderComponent;
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentContainer aURARenderComponentContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("509be152", new Object[]{view})).booleanValue();
        }
        if (!(view instanceof RecyclerView)) {
            return false;
        }
        RecyclerView.Adapter adapter = ((RecyclerView) view).getAdapter();
        if (1 != adapter.getItemCount()) {
            return false;
        }
        if (adapter instanceof e4e) {
            aURARenderComponent = ((e4e) adapter).a(0);
        } else if (adapter instanceof mcb) {
            aURARenderComponent = ((mcb) adapter).a(0);
        } else {
            aURARenderComponent = null;
        }
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null || !dm.b.equals(aURARenderComponentContainer.containerType)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(kij kijVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/taobao/adapter/widget/floatview/container/impl/dialogfragment/assembler/aspect/impl/NUTRaxBugFixFloatAssemblerAspect");
    }

    @Override // tb.jw
    public void a(View view, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f20628b", new Object[]{this, view, hijVar});
        } else if (b(view)) {
            hijVar.v(0.0f);
            hijVar.p(hijVar.g());
            hijVar.r(false);
        }
    }
}
