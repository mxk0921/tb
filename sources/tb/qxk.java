package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qxk implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SplitInstallResultCallback f26983a;
    private Context b;
    private List<String> c;
    private List<String> d;
    private String e;

    static {
        t2o.a(683671567);
    }

    public qxk(Context context, String str, List<String> list, List<String> list2, SplitInstallResultCallback splitInstallResultCallback) {
        this.f26983a = splitInstallResultCallback;
        this.b = context;
        this.c = list;
        this.d = list2;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f26983a.onStartInstall(0, new Bundle());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!this.c.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(this.c));
        }
        if (!this.d.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(this.d));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        dmi.b(this.b, this.e, bundle);
    }
}
