package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w8y extends wtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f;
    public final String g;

    public w8y(String str, int i, String str2, String str3) {
        super(str, i, null, 0, false);
        this.f = str2;
        this.g = str3;
    }

    public static /* synthetic */ Object ipc$super(w8y w8yVar, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/b/a/h");
    }

    @Override // tb.wtx
    public j5y a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5y) ipChange.ipc$dispatch("a9ef90da", new Object[]{this, aVar});
        }
        return new z5y(aVar, this);
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
        if (!(obj instanceof w8y) || !super.equals(obj)) {
            return false;
        }
        w8y w8yVar = (w8y) obj;
        String str = this.f;
        if (str == null ? w8yVar.f != null : !str.equals(w8yVar.f)) {
            return false;
        }
        String str2 = this.g;
        String str3 = w8yVar.g;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }
}
