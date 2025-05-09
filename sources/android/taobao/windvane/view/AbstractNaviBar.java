package android.taobao.windvane.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbstractNaviBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NAVI_BAR_ID = 110;

    static {
        t2o.a(989856451);
    }

    public AbstractNaviBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(AbstractNaviBar abstractNaviBar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/view/AbstractNaviBar");
    }

    public abstract void resetState();

    public abstract void startLoading();

    public abstract void stopLoading();

    public AbstractNaviBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractNaviBar(Context context) {
        super(context);
    }
}
