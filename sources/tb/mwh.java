package tb;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mwh extends pxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ActionBar b;
    public final /* synthetic */ b c;
    public final /* synthetic */ ImageView d;

    public mwh(jwh jwhVar, ActionBar actionBar, b bVar, ImageView imageView) {
        this.b = actionBar;
        this.c = bVar;
        this.d = imageView;
    }

    public static /* synthetic */ Object ipc$super(mwh mwhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/weexv2/page/MUSNavBarAdapter$6");
    }

    @Override // tb.pxp, tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
            return;
        }
        int height = (int) (this.b.getHeight() * 0.6d);
        this.c.getClass();
        this.d.setLayoutParams(new Toolbar.LayoutParams((int) ((height / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()), height));
        this.d.setImageDrawable(drawable);
    }
}
