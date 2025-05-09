package tb;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.icons.IconView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class kre extends lfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final xfe h;
    public int i;
    public final tfe j;

    static {
        t2o.a(815792383);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kre(xfe xfeVar, View view) {
        super(xfeVar, view);
        ckf.g(xfeVar, "iconInfo");
        ckf.g(view, "view");
        this.h = xfeVar;
        this.j = new tfe(view, null, 2, null);
    }

    public static /* synthetic */ Object ipc$super(kre kreVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/icons/ImgItemDrawable");
    }

    @Override // tb.gtd
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        this.j.c(canvas);
    }

    @Override // tb.gtd
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        if (this.i == 0) {
            this.i = (int) ((this.h.a().width / this.h.a().height) * IconView.Companion.a());
        }
        return this.i;
    }

    @Override // tb.lfe
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
        } else {
            this.j.d(this.h.a().image, this.i, IconView.Companion.a());
        }
    }

    @Override // tb.l32, tb.gtd
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.j.e();
        }
    }
}
