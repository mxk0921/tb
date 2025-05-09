package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class c12 implements bsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16766a = false;

    static {
        t2o.a(736100463);
        t2o.a(736100464);
    }

    public boolean d(long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd5cfae", new Object[]{this, new Long(j)})).booleanValue();
        }
        SharedPreferences k = nh2.k();
        if (k != null) {
            j2 = k.getInt(nh2.FREEZETIME, 30);
        } else {
            j2 = 30;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j2 != -1 && currentTimeMillis - j < j2 * 60000) {
            return true;
        }
        return false;
    }

    @Override // tb.bsd
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d30329d", new Object[]{this})).booleanValue();
        }
        if (!this.f16766a) {
            return false;
        }
        SharedPreferences k = nh2.k();
        if (k != null) {
            return k.getBoolean("occupiedNeedUpload", false);
        }
        tm1.a("BaseStabilityService", "isNeedUploadOccupiedState sp null ");
        return false;
    }

    @Override // tb.bsd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade6d4a", new Object[]{this});
            return;
        }
        this.f16766a = false;
        SharedPreferences k = nh2.k();
        if (k == null) {
            tm1.a("BaseStabilityService", "resetUploadOccupiedState sp null ");
        } else {
            k.edit().putBoolean("occupiedNeedUpload", false).apply();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62285c08", new Object[]{this});
            return;
        }
        this.f16766a = true;
        SharedPreferences k = nh2.k();
        if (k != null) {
            k.edit().putBoolean("occupiedNeedUpload", true).apply();
        }
    }
}
