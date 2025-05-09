package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f17 extends g19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int d = 5;

    public static /* synthetic */ Object ipc$super(f17 f17Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tcommon/log/DefaultFormatLog");
    }

    @Override // tb.cw9
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8075dd08", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    @Override // tb.cw9
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a546af9", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= this.d) {
            return true;
        }
        return false;
    }

    @Override // tb.cw9
    public void c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea92bab", new Object[]{this, new Integer(i), str, str2});
        } else {
            Log.e(str, str2);
        }
    }

    @Override // tb.cw9
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else {
            d(str2, objArr);
        }
    }

    @Override // tb.cw9
    public void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{this, str, str2, objArr});
        } else {
            Log.e(str, d(str2, objArr));
        }
    }

    @Override // tb.cw9
    public void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{this, str, str2, objArr});
        } else {
            d(str2, objArr);
        }
    }

    @Override // tb.cw9
    public void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{this, str, str2, objArr});
        } else {
            d(str2, objArr);
        }
    }
}
