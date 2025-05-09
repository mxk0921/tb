package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.business.footprint.FootprintRequest;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.history.RecentlyOftenWatchService;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f20912a = 0;

    static {
        t2o.a(779093549);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf39c40", new Object[]{this});
        } else {
            this.f20912a = System.currentTimeMillis();
        }
    }

    public void c() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f20912a;
        if (vx9.d() != null) {
            videoInfo = up6.c0(vx9.d());
        } else {
            videoInfo = null;
        }
        if (videoInfo != null) {
            if (sbt.g() && videoInfo.broadCaster != null) {
                String s = sbt.s();
                if (!TextUtils.isEmpty(s) && TextUtils.isDigitsOnly(s) && currentTimeMillis >= yqq.m(s)) {
                    d(currentTimeMillis, yqq.m(videoInfo.liveId), yqq.m(videoInfo.broadCaster.accountId));
                }
            }
            if (sbt.r() && videoInfo.broadCaster != null) {
                String B = sbt.B();
                if (!TextUtils.isEmpty(B) && TextUtils.isDigitsOnly(B) && currentTimeMillis >= yqq.m(B)) {
                    RecentlyOftenWatchService.d().i(videoInfo.broadCaster.accountId, currentTimeMillis);
                }
            }
        }
    }

    public final void d(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b3dd3e", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        FootprintRequest footprintRequest = new FootprintRequest();
        footprintRequest.duration = j;
        footprintRequest.footprintTime = System.currentTimeMillis();
        footprintRequest.liveId = j2;
        footprintRequest.broadcasterId = j3;
        if (v2s.o().w() != null) {
            NetRequest b = qsj.b(footprintRequest);
            b.setPost(true);
            v2s.o().w().b(b, null);
        }
    }
}
