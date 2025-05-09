package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25583a;
    public final String b;
    public final long c;

    public oqu(String str, String str2, long j) {
        this.f25583a = str;
        this.b = str2;
        this.c = j;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ae1b972", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f25583a;
    }

    public boolean d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d849ee", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f25583a) || !this.f25583a.contains("Slide") || (this.c * 1.0d) / j >= 0.7f) {
            return false;
        }
        return true;
    }
}
