package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f22748a;

    static {
        t2o.a(329252937);
    }

    public kls(String str) {
        try {
            this.f22748a = str.substring(8);
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse TSIntentExpression error", th);
        }
    }

    public static kls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kls) ipChange.ipc$dispatch("6b708b09", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@intent.")) {
            return new kls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(kls klsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSIntentExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            Intent f = wp8Var.f();
            if (!(TextUtils.isEmpty(this.f22748a) || f == null || (extras = f.getExtras()) == null)) {
                return extras.getString(this.f22748a);
            }
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse intent params error", th);
        }
        return null;
    }
}
