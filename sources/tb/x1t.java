package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class x1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f31079a = 100;
    public List<TaoLiveKtNoticeEntity> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a<T> implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue();
            }
            return t84.a(Integer.valueOf(((TaoLiveKtNoticeEntity) t2).getPriority$tao_live_crossplatform_foundation_release()), Integer.valueOf(((TaoLiveKtNoticeEntity) t).getPriority$tao_live_crossplatform_foundation_release()));
        }
    }

    static {
        t2o.a(1010827378);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c3b314", new Object[]{this});
            return;
        }
        List<TaoLiveKtNoticeEntity> list = this.b;
        if (list != null) {
            list.clear();
        }
        this.b = null;
    }

    public final TaoLiveKtNoticeEntity b() {
        List<TaoLiveKtNoticeEntity> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntity) ipChange.ipc$dispatch("29c6378f", new Object[]{this});
        }
        List<TaoLiveKtNoticeEntity> list2 = this.b;
        if (list2 == null) {
            return null;
        }
        if ((list2 == null || !((ArrayList) list2).isEmpty()) && (list = this.b) != null) {
            return (TaoLiveKtNoticeEntity) d04.B(list);
        }
        return null;
    }

    public final void c(TaoLiveKtNoticeEntity taoLiveKtNoticeEntity) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dedb5e", new Object[]{this, taoLiveKtNoticeEntity});
        } else if (taoLiveKtNoticeEntity != null) {
            List<TaoLiveKtNoticeEntity> list = this.b;
            if (list != null) {
                i = ((ArrayList) list).size();
            }
            if (i <= this.f31079a) {
                taoLiveKtNoticeEntity.setEnqueueTime$tao_live_crossplatform_foundation_release(Long.valueOf(ju6.a()));
                List<TaoLiveKtNoticeEntity> list2 = this.b;
                if (list2 != null) {
                    ((ArrayList) list2).add(taoLiveKtNoticeEntity);
                }
                List<TaoLiveKtNoticeEntity> list3 = this.b;
                if (list3 != null && ((ArrayList) list3).size() > 1) {
                    c04.u(list3, new a());
                }
            }
        }
    }
}
