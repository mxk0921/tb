package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dnr implements IMediaPlayer.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ enr f17973a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (enr.b(dnr.this.f17973a) != null && enr.b(dnr.this.f17973a).f19424a != null) {
                enr.b(dnr.this.f17973a).f19424a.onVideoStart();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (enr.b(dnr.this.f17973a) == null) {
            } else {
                if (2 != enr.b(dnr.this.f17973a).e) {
                    dnr.this.f17973a.n();
                } else if (!enr.b(dnr.this.f17973a).j) {
                    dnr.this.f17973a.n();
                }
            }
        }
    }

    public dnr(enr enrVar) {
        this.f17973a = enrVar;
    }

    @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        if (j == 3 && enr.a(this.f17973a) != null) {
            enr.a(this.f17973a).post(new a());
            enr.a(this.f17973a).postDelayed(new b(), enr.c(this.f17973a) * 1000);
        }
        return false;
    }
}
