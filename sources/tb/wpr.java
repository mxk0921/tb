package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wpr implements g7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f30843a;

    static {
        t2o.a(779092372);
        t2o.a(779093410);
    }

    @Override // tb.g7c
    public void a(Context context, VideoInfo videoInfo, String str, Map<String, String> map, tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7432c425", new Object[]{this, context, videoInfo, str, map, tjlVar});
        } else {
            mmr.p().I(context, videoInfo, str, null, map, tjlVar);
        }
    }

    @Override // tb.g7c
    public void b(Context context, IPlayPublicService iPlayPublicService, VideoInfo videoInfo, boolean z, boolean z2, Map<String, String> map, tjl tjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24a28a5", new Object[]{this, context, iPlayPublicService, videoInfo, new Boolean(z), new Boolean(z2), map, tjlVar});
            return;
        }
        mmr.p().t(context, iPlayPublicService, videoInfo, "liveroom", z, z2, map, tjlVar);
        this.f30843a = mmr.p().q();
    }

    @Override // tb.g7c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d2c1897", new Object[]{this})).booleanValue();
        }
        return mmr.p().i();
    }

    @Override // tb.g7c
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd045d69", new Object[]{this})).booleanValue();
        }
        return mmr.p().z();
    }

    @Override // tb.g7c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        mmr.p().l();
        this.f30843a = null;
    }

    @Override // tb.g7c
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
        } else if (onClickListener != null) {
            mmr.p().H(onClickListener);
        }
    }

    @Override // tb.g7c
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc979d5", new Object[]{this})).booleanValue();
        }
        return mmr.p().w();
    }

    @Override // tb.g7c
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f30843a;
    }
}
