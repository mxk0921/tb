package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.scene.weex2.TTDetailARWeex2Component;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t9x implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "armakeup";
    public static final Class<?>[] b = {Context.class, ze7.class, nb4.class, DataEntry[].class};

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<? extends oa4> f28584a;

    static {
        t2o.a(912261391);
        t2o.a(912261471);
    }

    public t9x() {
        try {
            IpChange ipChange = TTDetailARWeex2Component.$ipChange;
            Constructor<? extends oa4> constructor = TTDetailARWeex2Component.class.getConstructor(b);
            this.f28584a = constructor;
            constructor.setAccessible(true);
        } catch (Throwable th) {
            tgh.c("WeexVersion2ARMakeUpBuilder", "Weex2ARBuilderConstructorError", th);
        }
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        try {
            return (oa4) this.f28584a.newInstance(context, ze7Var, nb4Var, dataEntryArr);
        } catch (Throwable th) {
            tgh.c("WeexVersion2ARMakeUpBuilder", "Weex2ARBuilderBuildError", th);
            return null;
        }
    }
}
