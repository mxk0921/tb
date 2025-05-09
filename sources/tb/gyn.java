package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gyn implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f20314a;
    private int b;
    private SplitInstallServiceImpl.c c;
    private SplitInstallResultCallback d;

    static {
        t2o.a(683671576);
    }

    public gyn(Context context, int i, SplitInstallServiceImpl.c cVar, SplitInstallResultCallback splitInstallResultCallback) {
        this.f20314a = context;
        this.b = i;
        this.c = cVar;
        this.d = splitInstallResultCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", this.b);
        bundle.putInt("status", this.c.f2244a);
        bundle.putInt("error_code", this.c.c);
        bundle.putLong("bytes_downloaded", this.c.e);
        bundle.putLong("total_bytes_to_download", this.c.f);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        for (String str : this.c.g) {
            arrayList.add(str);
            Intent intent = new Intent();
            intent.putExtra("split_id", str);
            arrayList2.add(intent);
        }
        bundle.putStringArrayList("module_names", arrayList);
        bundle.putParcelableArrayList("split_file_intents", arrayList2);
        try {
            this.d.onGetSession(this.b, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
