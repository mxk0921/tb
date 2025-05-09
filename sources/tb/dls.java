package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 6;

    /* renamed from: a  reason: collision with root package name */
    public final String f17903a;
    public final String b;

    static {
        t2o.a(329252932);
    }

    public dls(String str) {
        try {
            String[] split = str.substring(6).split(".");
            if (split.length >= 2) {
                this.f17903a = split[0];
                this.b = split[1];
            }
        } catch (Throwable th) {
            zdh.b(als.TAG, "parse file expr error", th);
        }
    }

    public static dls c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dls) ipChange.ipc$dispatch("d17800a9", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@file.")) {
            return new dls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(dls dlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/other/TSFileExpression");
    }

    /* renamed from: d */
    public String b(wp8 wp8Var) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        try {
            if (!TextUtils.isEmpty(this.f17903a) && !TextUtils.isEmpty(this.b) && (sharedPreferences = TScheduleInitialize.b().getSharedPreferences(this.f17903a, 0)) != null) {
                return sharedPreferences.getString(this.b, null);
            }
        } catch (Throwable th) {
            zdh.b(als.TAG, "parseFileValue error", th);
        }
        return null;
    }
}
