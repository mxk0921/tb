package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ig1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21296a;
    public final ITaoLiveKtEnterAtmosphereEntity b;

    static {
        t2o.a(295698632);
    }

    public ig1(Context context, ITaoLiveKtEnterAtmosphereEntity iTaoLiveKtEnterAtmosphereEntity) {
        this.f21296a = context;
        this.b = iTaoLiveKtEnterAtmosphereEntity;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e527c7f2", new Object[]{this})).booleanValue();
        }
        if (hw0.n(this.f21296a)) {
            return false;
        }
        if (c() || d()) {
            return true;
        }
        return false;
    }

    public ITaoLiveKtEnterAtmosphereEntity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtEnterAtmosphereEntity) ipChange.ipc$dispatch("da21d708", new Object[]{this});
        }
        return this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89f5fb0", new Object[]{this})).booleanValue();
        }
        if (this.b.getFansLevel() >= k0r.y()) {
            return true;
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eabafbdc", new Object[]{this})).booleanValue();
        }
        if (this.b.getFansLevel() >= k0r.R()) {
            return true;
        }
        return false;
    }
}
