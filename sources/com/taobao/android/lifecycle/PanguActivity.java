package com.taobao.android.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PanguActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(670040079);
    }

    public static /* synthetic */ Object ipc$super(PanguActivity panguActivity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/lifecycle/PanguActivity");
    }

    public PanguApplication getPanguApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanguApplication) ipChange.ipc$dispatch("bc6c9716", new Object[]{this});
        }
        return (PanguApplication) getApplication();
    }
}
