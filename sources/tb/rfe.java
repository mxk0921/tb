package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rfe extends x10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782380);
    }

    public rfe(Context context, rdc.a aVar) {
        super(context, aVar);
    }

    public static /* synthetic */ Object ipc$super(rfe rfeVar, String str, Object... objArr) {
        if (str.hashCode() == 1733313735) {
            return super.j(((Number) objArr[0]).longValue(), ((Boolean) objArr[1]).booleanValue());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/anime/IconGuidAnimeScaleTask");
    }

    public final boolean A(Rect rect, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cf5b204", new Object[]{this, rect, view})).booleanValue();
        }
        if (rect.width() / view.getWidth() <= 0.5d || rect.height() / view.getHeight() <= 0.5d) {
            return false;
        }
        return true;
    }

    @Override // tb.x10
    public Animation j(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("675044c7", new Object[]{this, new Long(j), new Boolean(z)});
        }
        Rect rect = new Rect();
        View view = this.f.get();
        if (!z && view != null && view.getGlobalVisibleRect(rect)) {
            fve.b("IconGuidAnimeScale", rect.toString());
            if (A(rect, view)) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, rect.centerX(), 0, rect.centerY());
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(j);
                return scaleAnimation;
            }
        }
        fve.e("IconGuidAnimeScale", "targetView not visible.check homepage sever response!");
        return super.j(j, z);
    }
}
