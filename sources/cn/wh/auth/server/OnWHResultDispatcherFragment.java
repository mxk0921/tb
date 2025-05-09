package cn.wh.auth.server;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import cn.wh.auth.server.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OnWHResultDispatcherFragment extends Fragment {
    public static final String TAG = "on_wh_local_result_dispatcher";

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<a.AbstractC0024a> f1840a = new SparseArray<>();

    public void a(Intent intent, a.AbstractC0024a aVar) {
        this.f1840a.put(120, aVar);
        startActivityForResult(intent, 111);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SparseArray<a.AbstractC0024a> sparseArray = this.f1840a;
        a.AbstractC0024a aVar = sparseArray.get(120);
        sparseArray.remove(i);
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
