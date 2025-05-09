package tb;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.video.a;
import com.taobao.mmad.data.BaseMmAdModel;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t5l extends ku1<u5l> implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571098);
    }

    public static String i(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e71eb4d", new Object[]{nwiVar});
        }
        BaseMmAdModel a2 = nwiVar.d().a();
        if (a2 == null) {
            jgh.a("OpenVideoEvent", "adModel is null");
            return null;
        } else if (!TextUtils.isEmpty(a2.getInteractVideo())) {
            return rf9.c(a2.getInteractVideo());
        } else {
            jgh.a("OpenVideoEvent", "interactVideo is empty");
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(t5l t5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/ability/biz/open_video/OpenVideoEvent");
    }

    @Override // com.taobao.android.dinamicx.widget.video.a.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b5e61c", new Object[]{this});
        }
    }

    @Override // tb.ku1
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef98ca", new Object[]{this});
        }
        return "openVideo";
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d76bd12", new Object[]{this});
        } else {
            ik8.a(this.b);
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ddd3715", new Object[]{this})).intValue();
        }
        return this.b.d().a().currentCountdownTime;
    }

    @Override // com.taobao.android.dinamicx.widget.video.a.b
    public void onPlayCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1a25f", new Object[]{this});
        }
    }

    /* renamed from: j */
    public void e(u5l u5lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f8eb7d", new Object[]{this, u5lVar});
        } else if (TextUtils.isEmpty(i(this.b))) {
            jgh.a("OpenVideoEvent", "isLocalExistInteractVideo is false, jumpNextPage.");
            g();
            m0j.f(this.b, d(), "local_video_not_exist");
        } else if (h() <= u5lVar.f29160a) {
            jgh.a("OpenVideoEvent", "getCurrentCountdownTime is less than boundsTime, jumpNextPage.");
            g();
        } else {
            ya6 b = this.b.g().b();
            if (b == null) {
                jgh.a("OpenVideoEvent", "renderService is null");
                g();
                m0j.f(this.b, d(), "inner_error");
                return;
            }
            kgf c = this.b.g().c();
            if (c == null) {
                jgh.a("OpenVideoEvent", "videoManager is null");
                g();
                m0j.f(this.b, d(), "inner_error");
            } else if (!c.d()) {
                jgh.a("OpenVideoEvent", "videoManager start failed, jumpNextPage.");
                g();
                m0j.f(this.b, d(), "video_start_failed");
            } else {
                this.b.a().h(true);
                i4v.r(this.b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(c.a(), "alpha", 0.0f, 1.0f));
                View h = b.h(u5lVar.b);
                jgh.a("OpenVideoEvent", "apngView = " + h);
                if (h != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h, "alpha", 1.0f, 0.0f));
                }
                View h2 = b.h(u5lVar.c);
                jgh.a("OpenVideoEvent", "defaultView = " + h2);
                if (h2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(h2, "alpha", 1.0f, 0.0f));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(80L);
                animatorSet.start();
            }
        }
    }
}
