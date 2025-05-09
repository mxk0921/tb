package tb;

import android.view.View;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.taobao.tbpoplayer.nativerender.dsl.AnimationModel;
import tb.yam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class wam implements yam.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yam f30568a;
    public final /* synthetic */ View b;
    public final /* synthetic */ oe8 c;
    public final /* synthetic */ yam.d d;
    public final /* synthetic */ ActionLineModule.ActionItem e;
    public final /* synthetic */ yam.f f;

    public /* synthetic */ wam(yam yamVar, View view, oe8 oe8Var, yam.d dVar, ActionLineModule.ActionItem actionItem, yam.f fVar) {
        this.f30568a = yamVar;
        this.b = view;
        this.c = oe8Var;
        this.d = dVar;
        this.e = actionItem;
        this.f = fVar;
    }

    public final void a(AnimationModel animationModel) {
        this.f30568a.m(this.b, this.c, this.d, this.e, this.f, animationModel);
    }
}
