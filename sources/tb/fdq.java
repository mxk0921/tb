package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fdq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final xcq f19219a;
    private final wcq b;

    static {
        t2o.a(677380261);
    }

    public fdq(ucq ucqVar, xcq xcqVar) {
        this.b = (wcq) ucqVar;
        this.f19219a = xcqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.b.h().e(cdq.k(a((String[]) this.f19219a.a().toArray(new String[0]))));
        }
    }

    private Bundle a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("3320ecf5", new Object[]{this, strArr});
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        bundle.putStringArrayList("module_names", new ArrayList<>(Arrays.asList(strArr)));
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        return bundle;
    }
}
