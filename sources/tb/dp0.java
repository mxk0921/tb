package tb;

import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dp0 extends sp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mjq f17994a;
    public final ResultSet b;

    public dp0(mjq mjqVar, ResultSet resultSet) {
        this.f17994a = mjqVar;
        this.b = resultSet;
    }

    public static /* synthetic */ Object ipc$super(dp0 dp0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfsadapter/database/alidatabase/AliDatabaseESCursorImpl");
    }

    @Override // tb.sp
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        ResultSet resultSet = this.b;
        if (resultSet != null) {
            resultSet.b();
        }
        mjq mjqVar = this.f17994a;
        if (mjqVar != null) {
            mjqVar.b();
        }
    }

    @Override // tb.sp
    public byte[] b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8f3337f6", new Object[]{this, new Integer(i)});
        }
        return this.b.c(i);
    }

    @Override // tb.sp
    public long c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43ad79e", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.b.e(i);
    }

    @Override // tb.sp
    public String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        return this.b.g(i);
    }

    @Override // tb.sp
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54d45dfe", new Object[]{this})).booleanValue();
        }
        return this.b.i();
    }
}
