package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.rdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class px implements rdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rdd.a f26368a;
    public volatile boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                px.this.R();
            }
        }
    }

    public zzb<?> M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzb) ipChange.ipc$dispatch("877f9d60", new Object[]{this, str});
        }
        return yq7.b(str);
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a09ee77", new Object[]{this});
        } else {
            w9a.g().f().post(new a());
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621b062", new Object[]{this});
        } else {
            this.b = false;
        }
    }

    public void P(rdd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba588274", new Object[]{this, aVar});
        } else {
            this.f26368a = aVar;
        }
    }

    public void Q(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41587ecd", new Object[]{this, new Long(j)});
            return;
        }
        rdd.a aVar = this.f26368a;
        if (aVar != null) {
            ((ghg) aVar).c(this);
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            rdd.a aVar = this.f26368a;
            if (aVar != null) {
                ((ghg) aVar).b(this);
            }
        }
    }
}
