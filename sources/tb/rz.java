package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class rz<VIEW, PRESENTER> implements p9e<VIEW, PRESENTER> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PRESENTER f27689a;
    public yko b;
    public Activity c;

    static {
        t2o.a(993002000);
        t2o.a(993002004);
    }

    public final yko O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.b;
    }

    public final PRESENTER P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PRESENTER) ipChange.ipc$dispatch("dd96e8d9", new Object[]{this});
        }
        return this.f27689a;
    }

    @Override // tb.p9e
    public void d(PRESENTER presenter, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd7442b", new Object[]{this, presenter, ykoVar});
            return;
        }
        this.f27689a = presenter;
        this.b = ykoVar;
    }

    @Override // tb.p9e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // tb.p9e
    public void init(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
        } else {
            this.c = activity;
        }
    }
}
