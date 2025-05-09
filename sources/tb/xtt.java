package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.timemoveReplay.ReplayTimeMovingBean;
import com.taobao.taolive.room.business.timemoveReplay.TimeMoveReplayResponse;
import com.taobao.taolive.room.business.timemoveReplay.TimeMoveReplayResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xtt implements b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<ReplayTimeMovingBean> f31603a;

    static {
        t2o.a(779092836);
        t2o.a(806355932);
    }

    public xtt(ux9 ux9Var, String str) {
        new wtt(this).K(str);
        if (ux9Var instanceof cdr) {
            ((cdr) ux9Var).k0 = this;
        }
    }

    public ReplayTimeMovingBean a(long j) {
        Long l;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplayTimeMovingBean) ipChange.ipc$dispatch("4b05dad5", new Object[]{this, new Long(j)});
        }
        List<ReplayTimeMovingBean> list = this.f31603a;
        if (list == null) {
            return null;
        }
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = ((size - i) / 2) + i;
            ReplayTimeMovingBean replayTimeMovingBean = this.f31603a.get(i2);
            if (!(replayTimeMovingBean == null || (l = replayTimeMovingBean.StartSeekTime) == null || replayTimeMovingBean.endSeekTime == null)) {
                if (j >= l.longValue() && j <= replayTimeMovingBean.endSeekTime.longValue()) {
                    return replayTimeMovingBean;
                }
                if (j < replayTimeMovingBean.StartSeekTime.longValue()) {
                    size = i2 - 1;
                } else {
                    i = i2 + 1;
                }
            }
        }
        return null;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        TimeMoveReplayResponseData data;
        List<ReplayTimeMovingBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if ((netBaseOutDo instanceof TimeMoveReplayResponse) && (data = ((TimeMoveReplayResponse) netBaseOutDo).getData()) != null && (list = data.list) != null) {
            this.f31603a = list;
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }
}
