package tb;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kwh extends pxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int b;
    public final /* synthetic */ jwh c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Drawable d;

        public a(Drawable drawable) {
            this.d = drawable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$4$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            TBPublicMenu publicMenu = ((ITBPublicMenu) jwh.B(kwh.this.c)).getPublicMenu();
            TBPublicMenuItem extraMenu = publicMenu.getExtraMenu(kwh.this.b);
            if (extraMenu != null) {
                extraMenu.setIconDrawable(jwh.C(kwh.this.c, (BitmapDrawable) this.d));
                publicMenu.notifyMenuChanged();
            }
        }
    }

    public kwh(jwh jwhVar, int i) {
        this.c = jwhVar;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(kwh kwhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$4");
    }

    @Override // tb.pxp, tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
        } else {
            jwh.D().post(new a(drawable));
        }
    }
}
