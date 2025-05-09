package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.musie.videoscroll.MUSVideoScroll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kxh extends g57 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MUSVideoScroll b;

    static {
        t2o.a(815792798);
    }

    public kxh(UINode uINode) {
        super(uINode);
        this.b = (MUSVideoScroll) uINode;
    }

    public static /* synthetic */ Object ipc$super(kxh kxhVar, String str, Object... objArr) {
        if (str.hashCode() == 602580) {
            super.onRealTimeScroll((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/videoscroll/MUSVideoScrollListener");
    }

    @Override // tb.g57, tb.pxh
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onRealTimeScroll(view, i, i2, i3, i4);
        this.b.onRealTimeScroll(view, i, i2, i3, i4);
    }
}
