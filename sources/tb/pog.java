package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pog extends ux1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;
    public final View c;

    static {
        t2o.a(912261320);
    }

    public pog(String str, View view) {
        this.b = str;
        this.c = view;
    }

    public static /* synthetic */ Object ipc$super(pog pogVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bizmessage/LightOffShareMessage");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.b;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f072ab61", new Object[]{this});
        }
        return this.c;
    }
}
