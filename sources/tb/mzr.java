package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.PayResultInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mzr implements a8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lzr f24416a;

    public mzr(lzr lzrVar) {
        this.f24416a = lzrVar;
    }

    @Override // tb.a8d
    public void a(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ccc958", new Object[]{this, str, payResultInfo});
        } else {
            hh.d(lzr.d(this.f24416a));
        }
    }

    @Override // tb.a8d
    public void b(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1415f2", new Object[]{this, str, payResultInfo});
        } else {
            hh.d(lzr.d(this.f24416a));
        }
    }

    @Override // tb.a8d
    public void c(String str, PayResultInfo payResultInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809cdc6b", new Object[]{this, str, payResultInfo});
        } else {
            hh.d(lzr.d(this.f24416a));
        }
    }

    @Override // tb.a8d
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ee48ca9", new Object[]{this, str});
        }
    }
}
