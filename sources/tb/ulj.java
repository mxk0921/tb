package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ulj implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "triverwidget";
    public static final Class<?>[] b = {Context.class, ze7.class, nb4.class, DataEntry[].class};

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<? extends oa4> f29468a;

    static {
        t2o.a(912261388);
        t2o.a(912261471);
    }

    public ulj() {
        try {
            IpChange ipChange = TTDetailTriverWidgetComponent.$ipChange;
            Constructor<? extends oa4> constructor = TTDetailTriverWidgetComponent.class.getConstructor(b);
            this.f29468a = constructor;
            constructor.setAccessible(true);
        } catch (Throwable th) {
            tgh.c("NativeTriverWidgetBuilder", "TriverWidgetBuilderConstructorError", th);
        }
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        try {
            return (oa4) this.f29468a.newInstance(context, ze7Var, nb4Var, dataEntryArr);
        } catch (Throwable th) {
            tgh.c("NativeTriverWidgetBuilder", "TriverWidgetBuilderBuildError", th);
            return null;
        }
    }
}
