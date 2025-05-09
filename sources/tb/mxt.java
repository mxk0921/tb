package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import zoloz.ap.com.toolkit.ui.TitleBar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class mxt extends yz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TitleBar b;

    static {
        t2o.a(245366963);
    }

    public mxt(View view) {
        super(view);
        this.b = (TitleBar) view;
    }

    public static /* synthetic */ Object ipc$super(mxt mxtVar, String str, Object... objArr) {
        if (str.hashCode() == 1192889117) {
            super.a();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/render/TitleBarRender");
    }

    @Override // tb.yz1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.a();
        e();
    }

    @Override // tb.yz1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e0b82", new Object[]{this});
        }
    }

    @Override // tb.yz1
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12489174", new Object[]{this});
        }
    }

    @Override // tb.yz1
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fcb085", new Object[]{this});
            return;
        }
        TitleBar titleBar = this.b;
        titleBar.setText(titleBar.getResources().getString(R.string.zdoc_title));
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc66da4", new Object[]{this});
        }
    }
}
