package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f5l extends ty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final alc f19027a;

    static {
        t2o.a(779092143);
    }

    public f5l(alc alcVar) {
        this.f19027a = alcVar;
    }

    public static /* synthetic */ Object ipc$super(f5l f5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/open/OpenUIDelegateImpl");
    }

    @Override // tb.ty
    public Float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("e3ddd75b", new Object[]{this});
        }
        float J = this.f19027a.getViewParams().J();
        tfs.e(a.TAG, "aliveBottomOffset:" + J);
        return Float.valueOf(J);
    }

    @Override // tb.ty
    public Float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6e8f1b4b", new Object[]{this});
        }
        float K = this.f19027a.getViewParams().K();
        tfs.e(a.TAG, "aliveTopOffset:" + K);
        return Float.valueOf(K);
    }

    @Override // tb.ty
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8630a21b", new Object[]{this});
        }
        ImmersiveManager immersiveManager = this.f19027a.getImmersiveManager();
        if (immersiveManager != null) {
            return immersiveManager.b(immersiveManager.e());
        }
        return null;
    }

    @Override // tb.ty
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a115a601", new Object[]{this})).intValue();
        }
        if (this.f19027a.getOpenConfig() == null || !this.f19027a.getOpenConfig().b()) {
            return -1;
        }
        return 0;
    }

    @Override // tb.dzd
    public Float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("9548d518", new Object[]{this});
        }
        float N = this.f19027a.getViewParams().N();
        tfs.e(a.TAG, "topOffset:" + N);
        return Float.valueOf(N);
    }

    @Override // tb.dzd
    public Float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("6afaae6e", new Object[]{this});
        }
        float L = this.f19027a.getViewParams().L();
        tfs.e(a.TAG, "bottomOffset:" + L);
        return Float.valueOf(L);
    }

    @Override // tb.dzd
    public View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fda446e1", new Object[]{this});
        }
        return null;
    }
}
