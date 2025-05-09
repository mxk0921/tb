package tb;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zzm implements yzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f33122a;

    static {
        t2o.a(768606233);
        t2o.a(768606232);
    }

    public zzm(Context context) {
        this.f33122a = context.getSharedPreferences("turbo-boot-profile", 0);
    }

    @Override // tb.yzm
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e244d8d4", new Object[]{this, new Integer(i)});
        } else {
            this.f33122a.edit().putInt("profile_length", i).commit();
        }
    }

    @Override // tb.yzm
    public void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81b6964", new Object[]{this, str, new Integer(i)});
        } else {
            this.f33122a.edit().putString("version", str).putInt("code", i).commit();
        }
    }

    @Override // tb.yzm
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70730c3", new Object[]{this, new Integer(i)});
        } else {
            this.f33122a.edit().putInt(TypedValues.CycleType.S_WAVE_PHASE, i).commit();
        }
    }

    @Override // tb.yzm
    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0eda1cf", new Object[]{this, new Long(j)});
        } else {
            this.f33122a.edit().putLong("odex_latest_size", j).commit();
        }
    }

    @Override // tb.yzm
    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1354a510", new Object[]{this, new Long(j)});
        } else {
            this.f33122a.edit().putLong("odex_origin_size", j).commit();
        }
    }

    @Override // tb.yzm
    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.f33122a.getInt("code", -1);
    }

    @Override // tb.yzm
    public String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.f33122a.getString("version", null);
    }

    @Override // tb.yzm
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f33122a.edit().clear().commit();
        }
    }

    @Override // tb.yzm
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5f6c9bf", new Object[]{this})).intValue();
        }
        return this.f33122a.getInt(TypedValues.CycleType.S_WAVE_PHASE, 0);
    }
}
