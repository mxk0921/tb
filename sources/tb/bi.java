package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.render.component.creator.dividerLine")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bi extends ps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740556);
    }

    public static /* synthetic */ Object ipc$super(bi biVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/extension/impl/AURADividerLineComponentExtension");
    }

    @Override // tb.jcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.e;
    }

    @Override // tb.jcb
    public View f(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("19b5d83d", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ai.a(12.0f)));
        return view;
    }

    @Override // tb.jcb
    public void g(AURARenderComponent aURARenderComponent, View view, int i) {
        AURARenderComponentLayout aURARenderComponentLayout;
        Map<String, Object> map;
        Float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a87728a", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null && (map = aURARenderComponentLayout.style) != null && (a2 = fk.a(map, "cardMargin", null)) != null && a2.floatValue() >= 0.0f && a2.floatValue() != 12.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int a3 = ai.a(a2.floatValue());
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, a3);
            } else {
                layoutParams.height = a3;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // tb.jcb
    public String l(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7004174", new Object[]{this, aURARenderComponent});
        }
        return dm.e;
    }
}
