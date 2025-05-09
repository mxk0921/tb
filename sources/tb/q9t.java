package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q9t implements jgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26609a;
    public final boolean b;
    public final boolean c;
    public final j5s d = j5s.j();

    public q9t(String str, boolean z, boolean z2) {
        this.f26609a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3271b85f", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            return false;
        }
        if (this.b && this.d.i() != 0) {
            return false;
        }
        return true;
    }

    @Override // tb.jgd
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8497", new Object[]{this, str});
            return;
        }
        String str2 = this.f26609a;
        TLog.loge(str2, str2, str);
        if (a()) {
            Log.e(this.f26609a, str);
        }
    }

    @Override // tb.jgd
    public void debug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966c00a4", new Object[]{this, str});
            return;
        }
        String str2 = this.f26609a;
        TLog.loge(str2, str2, str);
        if (a()) {
            Log.e(this.f26609a, str);
        }
    }

    @Override // tb.jgd
    public void error(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
            return;
        }
        String str2 = this.f26609a;
        TLog.loge(str2, str2, str);
        if (a()) {
            Log.e(this.f26609a, str);
        }
    }

    @Override // tb.jgd
    public void info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{this, str});
            return;
        }
        String str2 = this.f26609a;
        TLog.loge(str2, str2, str);
        if (a()) {
            Log.e(this.f26609a, str);
        }
    }

    @Override // tb.jgd
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
            return;
        }
        TLog.loge(this.f26609a, str, th);
        if (a()) {
            Log.e(this.f26609a, str, th);
        }
    }

    @Override // tb.jgd
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
            return;
        }
        TLog.loge(this.f26609a, str, th);
        if (a()) {
            Log.e(this.f26609a, str, th);
        }
    }
}
