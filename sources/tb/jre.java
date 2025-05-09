package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.uikit.iconlist.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jre extends yxa<ire> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float k = o1p.b(14);
    public float i;
    public Drawable j;

    static {
        t2o.a(815793081);
    }

    public jre(ire ireVar, boolean z, Context context) {
        super(ireVar, z);
        new a(context, this, getIntrinsicWidth(), getIntrinsicHeight(), 0).h(e());
    }

    public static /* synthetic */ Object ipc$super(jre jreVar, String str, Object... objArr) {
        if (str.hashCode() == -1688871921) {
            super.onDrawableLoaded((BitmapDrawable) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/drawable/ImgHintDrawable");
    }

    @Override // tb.yxa
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3a", new Object[]{this})).floatValue();
        }
        return getIntrinsicWidth();
    }

    @Override // tb.yxa
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6748d30c", new Object[]{this});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) b(), (int) k);
            this.j.draw(canvas);
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("301b4a97", new Object[]{this});
        }
        if (!this.b || TextUtils.isEmpty(((ire) this.f32406a).a())) {
            return ((ire) this.f32406a).b();
        }
        return ((ire) this.f32406a).a();
    }

    @Override // tb.yxa, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return (int) k;
    }

    @Override // tb.yxa, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        if (this.i == 0.0f) {
            this.i = o1p.b(((ire) this.f32406a).c());
        }
        return (int) this.i;
    }

    @Override // tb.yxa, com.taobao.search.mmd.uikit.iconlist.a.d
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.j = bitmapDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f * 255.0f));
        }
        super.onDrawableLoaded(bitmapDrawable, i, str);
    }
}
