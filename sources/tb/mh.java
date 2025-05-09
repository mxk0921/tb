package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740544);
    }

    public boolean a(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e7dc34", new Object[]{this, aURARenderComponentContainer})).booleanValue();
        }
        if (b(aURARenderComponentContainer)) {
            return false;
        }
        aURARenderComponentContainer.isPreset = true;
        aURARenderComponentContainer.version = hn.DX_PRESET_TEMPLATE_VERSION_STR;
        return true;
    }

    public boolean b(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91f9edba", new Object[]{this, aURARenderComponentContainer})).booleanValue();
        }
        if (aURARenderComponentContainer == null || aURARenderComponentContainer.isPreset || hn.DX_PRESET_TEMPLATE_VERSION_STR.equals(aURARenderComponentContainer.version)) {
            return true;
        }
        return false;
    }
}
