package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s7y extends wtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean f;
    public final String g;

    public static /* synthetic */ Object ipc$super(s7y s7yVar, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/b/a/g");
    }

    @Override // tb.wtx
    public j5y a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5y) ipChange.ipc$dispatch("a9ef90da", new Object[]{this, aVar});
        }
        if (this.e) {
            return new c4y(aVar, this);
        }
        return new c4y(aVar, this);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return "xquic".equalsIgnoreCase(this.g);
    }

    @Override // tb.wtx
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7y) || !super.equals(obj)) {
            return false;
        }
        s7y s7yVar = (s7y) obj;
        if (this.f != s7yVar.f || !this.g.equalsIgnoreCase(s7yVar.g)) {
            return false;
        }
        return true;
    }

    public s7y(String str, int i, boolean z, boolean z2, String str2) {
        super(str, i, null, 0, z);
        this.f = z2;
        this.g = TextUtils.isEmpty(str2) ? "tcp" : str2;
    }
}
